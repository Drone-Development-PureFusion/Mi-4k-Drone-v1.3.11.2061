package com.tencent.p263mm.sdk.plugin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import com.google.android.gms.drive.AbstractC4808e;
import com.tencent.p263mm.sdk.platformtools.Log;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.tencent.mm.sdk.plugin.MMPluginOAuth */
/* loaded from: classes2.dex */
public class MMPluginOAuth {

    /* renamed from: R */
    private final Context f31687R;

    /* renamed from: bA */
    private final IResult f31688bA;

    /* renamed from: bB */
    private String f31689bB;

    /* renamed from: bC */
    private String f31690bC;
    private Handler handler;

    /* renamed from: com.tencent.mm.sdk.plugin.MMPluginOAuth$IResult */
    /* loaded from: classes2.dex */
    public interface IResult {
        void onResult(MMPluginOAuth mMPluginOAuth);

        void onSessionTimeOut();
    }

    /* renamed from: com.tencent.mm.sdk.plugin.MMPluginOAuth$Receiver */
    /* loaded from: classes2.dex */
    public static class Receiver extends BroadcastReceiver {

        /* renamed from: aA */
        private static final Map<String, MMPluginOAuth> f31692aA = new HashMap();

        /* renamed from: bE */
        private final MMPluginOAuth f31693bE;

        public Receiver() {
            this(null);
        }

        public Receiver(MMPluginOAuth mMPluginOAuth) {
            this.f31693bE = mMPluginOAuth;
        }

        public static void register(String str, MMPluginOAuth mMPluginOAuth) {
            f31692aA.put(str, mMPluginOAuth);
        }

        public static void unregister(String str) {
            f31692aA.remove(str);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final MMPluginOAuth mMPluginOAuth;
            Log.m5877d("MicroMsg.SDK.MMPluginOAuth", "receive oauth result");
            String stringExtra = intent.getStringExtra(MMPluginProviderConstants.PluginIntent.REQUEST_TOKEN);
            final String stringExtra2 = intent.getStringExtra(MMPluginProviderConstants.PluginIntent.ACCESS_TOKEN);
            if (this.f31693bE != null) {
                mMPluginOAuth = this.f31693bE;
            } else {
                mMPluginOAuth = f31692aA.get(stringExtra);
                if (mMPluginOAuth == null) {
                    Log.m5875e("MicroMsg.SDK.MMPluginOAuth", "oauth unregistered, request token = " + stringExtra);
                    return;
                }
                unregister(mMPluginOAuth.f31690bC);
            }
            new Handler().post(new Runnable() { // from class: com.tencent.mm.sdk.plugin.MMPluginOAuth.Receiver.1
                @Override // java.lang.Runnable
                public void run() {
                    MMPluginOAuth.m5849a(mMPluginOAuth, stringExtra2);
                }
            });
        }
    }

    public MMPluginOAuth(Context context, IResult iResult) {
        this.f31687R = context;
        this.f31688bA = iResult;
    }

    /* renamed from: a */
    static /* synthetic */ void m5849a(MMPluginOAuth mMPluginOAuth, String str) {
        Receiver.unregister(mMPluginOAuth.f31690bC);
        mMPluginOAuth.f31689bB = str;
        Log.m5871i("MicroMsg.SDK.MMPluginOAuth", "access token: " + str);
        if (mMPluginOAuth.f31688bA != null) {
            mMPluginOAuth.f31688bA.onResult(mMPluginOAuth);
        }
    }

    public String getAccessToken() {
        return this.f31689bB;
    }

    public String getRequestToken() {
        return this.f31690bC;
    }

    public void start() {
        start(null);
    }

    public boolean start(Handler handler) {
        boolean z;
        if (handler == null) {
            handler = new Handler();
        }
        this.handler = handler;
        Cursor query = this.f31687R.getContentResolver().query(MMPluginProviderConstants.OAuth.CONTENT_URI, null, null, new String[]{this.f31687R.getPackageName(), MMPluginProviderConstants.OAuth.ACTION_REQUEST_TOKEN}, null);
        if (query != null) {
            if (query.moveToFirst() && query.getColumnCount() >= 2) {
                this.f31690bC = query.getString(0);
                this.f31689bB = query.getString(1);
            }
            query.close();
        }
        Log.m5871i("MicroMsg.SDK.MMPluginOAuth", "request token = " + this.f31690bC);
        if (this.f31690bC == null) {
            Log.m5875e("MicroMsg.SDK.MMPluginOAuth", "request token failed");
            return false;
        } else if (this.f31689bB != null) {
            this.handler.post(new Runnable() { // from class: com.tencent.mm.sdk.plugin.MMPluginOAuth.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MMPluginOAuth.this.f31688bA != null) {
                        MMPluginOAuth.this.f31688bA.onResult(MMPluginOAuth.this);
                    }
                }
            });
            return true;
        } else {
            Log.m5877d("MicroMsg.SDK.MMPluginOAuth", "begin to show user oauth page");
            Intent intent = new Intent();
            intent.setClassName(MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN, "com.tencent.mm.plugin.PluginOAuthUI");
            intent.putExtra(MMPluginProviderConstants.PluginIntent.REQUEST_TOKEN, this.f31690bC);
            intent.putExtra(MMPluginProviderConstants.PluginIntent.PACKAGE, this.f31687R.getPackageName());
            if (this.f31687R.getPackageManager().resolveActivity(intent, 65536) == null) {
                Log.m5875e("MicroMsg.SDK.MMPluginOAuth", "show oauth page failed, activity not found");
                z = false;
            } else {
                if (!(this.f31687R instanceof Activity)) {
                    intent.setFlags(AbstractC4808e.f17570a_);
                }
                this.f31687R.startActivity(intent);
                z = true;
            }
            if (!z) {
                return false;
            }
            Receiver.register(this.f31690bC, this);
            return true;
        }
    }
}
