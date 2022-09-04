package com.tencent.connect.auth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentActivity;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import android.widget.Toast;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.p259a.C10114a;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.utils.ApkExternalInfoTool;
import com.tencent.open.utils.Global;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
/* loaded from: classes.dex */
public class QQAuth {

    /* renamed from: a */
    private AuthAgent f31214a;

    /* renamed from: b */
    private QQToken f31215b;

    private QQAuth(String str, Context context) {
        C10257f.m5670c(C10257f.f31917d, "new QQAuth() --start");
        this.f31215b = new QQToken(str);
        this.f31214a = new AuthAgent(this.f31215b);
        C10114a.m6182c(context, this.f31215b);
        C10257f.m5670c(C10257f.f31917d, "new QQAuth() --end");
    }

    /* renamed from: a */
    private int m6129a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2) {
        String str3;
        String packageName = activity.getApplicationContext().getPackageName();
        Iterator<ApplicationInfo> it2 = activity.getPackageManager().getInstalledApplications(128).iterator();
        while (true) {
            if (!it2.hasNext()) {
                str3 = null;
                break;
            }
            ApplicationInfo next = it2.next();
            if (packageName.equals(next.packageName)) {
                str3 = next.sourceDir;
                break;
            }
        }
        if (str3 != null) {
            try {
                String readChannelId = ApkExternalInfoTool.readChannelId(new File(str3));
                if (!TextUtils.isEmpty(readChannelId)) {
                    C10257f.m5673b(C10257f.f31917d, "-->login channelId: " + readChannelId);
                    return loginWithOEM(activity, str, iUiListener, readChannelId, readChannelId, "");
                }
            } catch (IOException e) {
                C10257f.m5673b(C10257f.f31917d, "-->login get channel id exception." + e.getMessage());
                e.printStackTrace();
            }
        }
        C10257f.m5673b(C10257f.f31917d, "-->login channelId is null ");
        BaseApi.isOEM = false;
        return this.f31214a.doLogin(activity, str, iUiListener, false, fragment);
    }

    public static QQAuth createInstance(String str, Context context) {
        Global.setContext(context.getApplicationContext());
        C10257f.m5670c(C10257f.f31917d, "QQAuth -- createInstance() --start");
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 0);
            packageManager.getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 0);
            QQAuth qQAuth = new QQAuth(str, context);
            C10257f.m5670c(C10257f.f31917d, "QQAuth -- createInstance()  --end");
            return qQAuth;
        } catch (PackageManager.NameNotFoundException e) {
            C10257f.m5672b(C10257f.f31917d, "createInstance() error --end", e);
            Toast.makeText(context.getApplicationContext(), "请参照文档在Androidmanifest.xml加上AuthActivity和AssitActivity的定义 ", 1).show();
            return null;
        }
    }

    public void checkLogin(IUiListener iUiListener) {
        this.f31214a.m6174b(iUiListener);
    }

    public QQToken getQQToken() {
        return this.f31215b;
    }

    public boolean isSessionValid() {
        C10257f.m5676a(C10257f.f31917d, "isSessionValid(), result = " + (this.f31215b.isSessionValid() ? "true" : "false") + "");
        return this.f31215b.isSessionValid();
    }

    public int login(Activity activity, String str, IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "login()");
        return login(activity, str, iUiListener, "");
    }

    public int login(Activity activity, String str, IUiListener iUiListener, String str2) {
        C10257f.m5670c(C10257f.f31917d, "-->login activity: " + activity);
        return m6129a(activity, null, str, iUiListener, str2);
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener, String str2) {
        FragmentActivity activity = fragment.getActivity();
        C10257f.m5670c(C10257f.f31917d, "-->login activity: " + activity);
        return m6129a(activity, fragment, str, iUiListener, str2);
    }

    @Deprecated
    public int loginWithOEM(Activity activity, String str, IUiListener iUiListener, String str2, String str3, String str4) {
        C10257f.m5670c(C10257f.f31917d, "loginWithOEM");
        BaseApi.isOEM = true;
        if (str2.equals("")) {
            str2 = "null";
        }
        if (str3.equals("")) {
            str3 = "null";
        }
        if (str4.equals("")) {
            str4 = "null";
        }
        BaseApi.installChannel = str3;
        BaseApi.registerChannel = str2;
        BaseApi.businessId = str4;
        return this.f31214a.doLogin(activity, str, iUiListener);
    }

    public void logout(Context context) {
        C10257f.m5670c(C10257f.f31917d, "logout() --start");
        CookieSyncManager.createInstance(context);
        setAccessToken(null, null);
        setOpenId(context, null);
        C10257f.m5670c(C10257f.f31917d, "logout() --end");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        C10257f.m5670c(C10257f.f31917d, "onActivityResult() ,resultCode = " + i2 + "");
        return true;
    }

    public int reAuth(Activity activity, String str, IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "reAuth()");
        return this.f31214a.doLogin(activity, str, iUiListener, true, null);
    }

    public void reportDAU() {
        this.f31214a.m6178a((IUiListener) null);
    }

    public void setAccessToken(String str, String str2) {
        C10257f.m5676a(C10257f.f31917d, "setAccessToken(), validTimeInSecond = " + str2 + "");
        this.f31215b.setAccessToken(str, str2);
    }

    public void setOpenId(Context context, String str) {
        C10257f.m5676a(C10257f.f31917d, "setOpenId() --start");
        this.f31215b.setOpenId(str);
        C10114a.m6181d(context, this.f31215b);
        C10257f.m5676a(C10257f.f31917d, "setOpenId() --end");
    }
}
