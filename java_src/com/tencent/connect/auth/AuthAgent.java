package com.tencent.connect.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p001v4.app.Fragment;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.soul.utils.p219a.C3070c;
import com.tencent.connect.common.AssistActivity;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.p259a.C10114a;
import com.tencent.open.SocialConstants;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.p265b.C10266d;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.ThreadManager;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import it.p273a.p274a.AbstractC10866e;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AuthAgent extends BaseApi {
    public static final String SECURE_LIB_FILE_NAME = "libwbsafeedit";
    public static final String SECURE_LIB_NAME = "libwbsafeedit.so";

    /* renamed from: a */
    private IUiListener f31148a;

    /* renamed from: b */
    private String f31149b;

    /* renamed from: c */
    private Activity f31150c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class CheckLoginListener implements IUiListener {

        /* renamed from: a */
        IUiListener f31156a;

        public CheckLoginListener(IUiListener iUiListener) {
            this.f31156a = iUiListener;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.f31156a != null) {
                this.f31156a.onCancel();
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                C10257f.m5667e("CheckLoginListener", "response data is null");
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                int i = jSONObject.getInt("ret");
                String string = i == 0 ? "success" : jSONObject.getString(SocialConstants.PARAM_SEND_MSG);
                if (this.f31156a == null) {
                    return;
                }
                this.f31156a.onComplete(new JSONObject().put("ret", i).put(SocialConstants.PARAM_SEND_MSG, string));
            } catch (JSONException e) {
                e.printStackTrace();
                C10257f.m5667e("CheckLoginListener", "response data format error");
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            if (this.f31156a != null) {
                this.f31156a.onError(uiError);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class FeedConfirmListener implements IUiListener {

        /* renamed from: a */
        IUiListener f31158a;

        /* renamed from: c */
        private final String f31160c = "sendinstall";

        /* renamed from: d */
        private final String f31161d = "installwording";

        /* renamed from: e */
        private final String f31162e = "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";

        /* loaded from: classes2.dex */
        private abstract class ButtonListener implements View.OnClickListener {

            /* renamed from: d */
            Dialog f31172d;

            ButtonListener(Dialog dialog) {
                this.f31172d = dialog;
            }
        }

        public FeedConfirmListener(IUiListener iUiListener) {
            this.f31158a = iUiListener;
        }

        /* renamed from: a */
        private Drawable m6165a(String str, Context context) {
            Drawable drawable;
            IOException e;
            try {
                InputStream open = context.getApplicationContext().getAssets().open(str);
                if (open == null) {
                    drawable = null;
                } else if (str.endsWith(".9.png")) {
                    Bitmap decodeStream = BitmapFactory.decodeStream(open);
                    if (decodeStream != null) {
                        byte[] ninePatchChunk = decodeStream.getNinePatchChunk();
                        NinePatch.isNinePatchChunk(ninePatchChunk);
                        drawable = new NinePatchDrawable(decodeStream, ninePatchChunk, new Rect(), null);
                    } else {
                        drawable = null;
                    }
                } else {
                    drawable = Drawable.createFromStream(open, str);
                    try {
                        open.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        return drawable;
                    }
                }
            } catch (IOException e3) {
                drawable = null;
                e = e3;
            }
            return drawable;
        }

        /* renamed from: a */
        private View m6166a(Context context, Drawable drawable, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.density;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setId(1);
            int i = (int) (14.0f * f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (60.0f * f), (int) (60.0f * f));
            layoutParams.addRule(9);
            layoutParams.setMargins(0, (int) (18.0f * f), (int) (6.0f * f), (int) (18.0f * f));
            relativeLayout.addView(imageView, layoutParams);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(14.0f);
            textView.setGravity(3);
            textView.setIncludeFontPadding(false);
            textView.setPadding(0, 0, 0, 0);
            textView.setLines(2);
            textView.setId(5);
            textView.setMinWidth((int) (185.0f * f));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, 1);
            layoutParams2.addRule(6, 1);
            int i2 = (int) (10.0f * f);
            layoutParams2.setMargins(0, 0, (int) (5.0f * f), 0);
            relativeLayout.addView(textView, layoutParams2);
            View view = new View(context);
            view.setBackgroundColor(Color.rgb((int) AbstractC10866e.f34858y, (int) AbstractC10866e.f34858y, (int) AbstractC10866e.f34858y));
            view.setId(3);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, 2);
            layoutParams3.addRule(3, 1);
            layoutParams3.addRule(5, 1);
            layoutParams3.addRule(7, 5);
            layoutParams3.setMargins(0, 0, 0, (int) (12.0f * f));
            relativeLayout.addView(view, layoutParams3);
            LinearLayout linearLayout = new LinearLayout(context);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(5, 1);
            layoutParams4.addRule(7, 5);
            layoutParams4.addRule(3, 3);
            Button button = new Button(context);
            button.setText("??????");
            button.setBackgroundDrawable(m6165a("buttonNegt.png", context));
            button.setTextColor(Color.rgb(36, 97, 131));
            button.setTextSize(20.0f);
            button.setOnClickListener(onClickListener2);
            button.setId(4);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, (int) (45.0f * f));
            layoutParams5.rightMargin = (int) (14.0f * f);
            layoutParams5.leftMargin = (int) (4.0f * f);
            layoutParams5.weight = 1.0f;
            linearLayout.addView(button, layoutParams5);
            Button button2 = new Button(context);
            button2.setText("??????");
            button2.setTextSize(20.0f);
            button2.setTextColor(Color.rgb(255, 255, 255));
            button2.setBackgroundDrawable(m6165a("buttonPost.png", context));
            button2.setOnClickListener(onClickListener);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, (int) (45.0f * f));
            layoutParams6.weight = 1.0f;
            layoutParams6.rightMargin = (int) (4.0f * f);
            linearLayout.addView(button2, layoutParams6);
            relativeLayout.addView(linearLayout, layoutParams4);
            ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) (279.0f * f), (int) (163.0f * f));
            relativeLayout.setPadding((int) (14.0f * f), 0, (int) (12.0f * f), (int) (12.0f * f));
            relativeLayout.setLayoutParams(layoutParams7);
            relativeLayout.setBackgroundColor(Color.rgb(247, 251, 247));
            PaintDrawable paintDrawable = new PaintDrawable(Color.rgb(247, 251, 247));
            paintDrawable.setCornerRadius(f * 5.0f);
            relativeLayout.setBackgroundDrawable(paintDrawable);
            return relativeLayout;
        }

        /* renamed from: a */
        private void m6164a(String str, final IUiListener iUiListener, final Object obj) {
            PackageInfo packageInfo;
            Drawable drawable = null;
            Dialog dialog = new Dialog(AuthAgent.this.f31150c);
            dialog.requestWindowFeature(1);
            PackageManager packageManager = AuthAgent.this.f31150c.getPackageManager();
            try {
                packageInfo = packageManager.getPackageInfo(AuthAgent.this.f31150c.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                packageInfo = null;
            }
            if (packageInfo != null) {
                drawable = packageInfo.applicationInfo.loadIcon(packageManager);
            }
            ButtonListener buttonListener = new ButtonListener(dialog) { // from class: com.tencent.connect.auth.AuthAgent.FeedConfirmListener.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FeedConfirmListener.this.m6167a();
                    if (this.f31172d != null && this.f31172d.isShowing()) {
                        this.f31172d.dismiss();
                    }
                    if (iUiListener != null) {
                        iUiListener.onComplete(obj);
                    }
                }
            };
            ButtonListener buttonListener2 = new ButtonListener(dialog) { // from class: com.tencent.connect.auth.AuthAgent.FeedConfirmListener.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (this.f31172d != null && this.f31172d.isShowing()) {
                        this.f31172d.dismiss();
                    }
                    if (iUiListener != null) {
                        iUiListener.onComplete(obj);
                    }
                }
            };
            ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setAlpha(0);
            dialog.getWindow().setBackgroundDrawable(colorDrawable);
            dialog.setContentView(m6166a(AuthAgent.this.f31150c, drawable, str, buttonListener, buttonListener2));
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tencent.connect.auth.AuthAgent.FeedConfirmListener.3
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    if (iUiListener != null) {
                        iUiListener.onComplete(obj);
                    }
                }
            });
            if (AuthAgent.this.f31150c == null || AuthAgent.this.f31150c.isFinishing()) {
                return;
            }
            dialog.show();
        }

        /* renamed from: a */
        protected void m6167a() {
            HttpUtils.requestAsync(AuthAgent.this.mToken, AuthAgent.this.f31150c, "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi", AuthAgent.this.composeActivityParams(), "POST", null);
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.f31158a != null) {
                this.f31158a.onCancel();
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject;
            boolean z;
            String str;
            boolean z2 = false;
            if (obj == null || (jSONObject = (JSONObject) obj) == null) {
                return;
            }
            try {
                if (jSONObject.getInt("sendinstall") == 1) {
                    z2 = true;
                }
                str = jSONObject.getString("installwording");
                z = z2;
            } catch (JSONException e) {
                C10257f.m5668d("FeedConfirm", "There is no value for sendinstall.");
                z = z2;
                str = "";
            }
            String decode = URLDecoder.decode(str);
            C10257f.m5673b("TAG", " WORDING = " + decode + "xx");
            if (z && !TextUtils.isEmpty(decode)) {
                m6164a(decode, this.f31158a, obj);
            } else if (this.f31158a == null) {
            } else {
                this.f31158a.onComplete(obj);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            if (this.f31158a != null) {
                this.f31158a.onError(uiError);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class TokenListener implements IUiListener {

        /* renamed from: b */
        private final IUiListener f31175b;

        /* renamed from: c */
        private final boolean f31176c;

        /* renamed from: d */
        private final Context f31177d;

        public TokenListener(Context context, IUiListener iUiListener, boolean z, boolean z2) {
            this.f31177d = context;
            this.f31175b = iUiListener;
            this.f31176c = z;
            C10257f.m5673b(C10257f.f31917d, "OpenUi, TokenListener()");
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            C10257f.m5673b(C10257f.f31917d, "OpenUi, TokenListener() onCancel");
            this.f31175b.onCancel();
            C10257f.m5674b();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            C10257f.m5673b(C10257f.f31917d, "OpenUi, TokenListener() onComplete");
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString("access_token");
                String string2 = jSONObject.getString("expires_in");
                String string3 = jSONObject.getString("openid");
                if (string != null && AuthAgent.this.mToken != null && string3 != null) {
                    AuthAgent.this.mToken.setAccessToken(string, string2);
                    AuthAgent.this.mToken.setOpenId(string3);
                    C10114a.m6181d(this.f31177d, AuthAgent.this.mToken);
                }
                String string4 = jSONObject.getString(Constants.PARAM_PLATFORM_ID);
                if (string4 != null) {
                    try {
                        this.f31177d.getSharedPreferences(Constants.PREFERENCE_PF, 0).edit().putString(Constants.PARAM_PLATFORM_ID, string4).commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                        C10257f.m5672b(C10257f.f31917d, "OpenUi, TokenListener() onComplete error", e);
                    }
                }
                if (this.f31176c) {
                    CookieSyncManager.getInstance().sync();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                C10257f.m5672b(C10257f.f31917d, "OpenUi, TokenListener() onComplete error", e2);
            }
            this.f31175b.onComplete(jSONObject);
            AuthAgent.this.releaseResource();
            C10257f.m5674b();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            C10257f.m5673b(C10257f.f31917d, "OpenUi, TokenListener() onError");
            this.f31175b.onError(uiError);
            C10257f.m5674b();
        }
    }

    public AuthAgent(QQToken qQToken) {
        super(qQToken);
    }

    /* renamed from: a */
    private int m6176a(boolean z, IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "OpenUi, showDialog -- start");
        CookieSyncManager.createInstance(Global.getContext());
        Bundle composeCGIParams = composeCGIParams();
        if (z) {
            composeCGIParams.putString("isadd", "1");
        }
        composeCGIParams.putString("scope", this.f31149b);
        composeCGIParams.putString(Constants.PARAM_CLIENT_ID, this.mToken.getAppId());
        if (isOEM) {
            composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + SystemMediaRouteProvider.PACKAGE_NAME + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + businessId);
        } else {
            composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        String str = (System.currentTimeMillis() / 1000) + "";
        composeCGIParams.putString("sign", SystemUtils.getAppSignatureMD5(Global.getContext(), str));
        composeCGIParams.putString(C3070c.C3071a.f11505i, str);
        composeCGIParams.putString("display", "mobile");
        composeCGIParams.putString("response_type", com.xiaomi.mipush.sdk.Constants.EXTRA_KEY_TOKEN);
        composeCGIParams.putString(AuthorizeActivityBase.KEY_REDIRECT_URI, ServerSetting.DEFAULT_REDIRECT_URI);
        composeCGIParams.putString("cancel_display", "1");
        composeCGIParams.putString("switch", "1");
        composeCGIParams.putString("status_userip", Util.getUserIp());
        final String str2 = ServerSetting.getInstance().getEnvUrl(Global.getContext(), ServerSetting.DEFAULT_CGI_AUTHORIZE) + Util.encodeUrl(composeCGIParams);
        final TokenListener tokenListener = new TokenListener(Global.getContext(), iUiListener, true, false);
        C10257f.m5673b(C10257f.f31917d, "OpenUi, showDialog TDialog");
        ThreadManager.executeOnSubThread(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1
            @Override // java.lang.Runnable
            public void run() {
                SystemUtils.extractSecureLib(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 2);
                AuthAgent.this.f31150c.runOnUiThread(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        new AuthDialog(AuthAgent.this.f31150c, SystemUtils.ACTION_LOGIN, str2, tokenListener, AuthAgent.this.mToken).show();
                    }
                });
            }
        });
        C10257f.m5670c(C10257f.f31917d, "OpenUi, showDialog -- end");
        return 2;
    }

    /* renamed from: a */
    private void m6177a(String str) {
        try {
            JSONObject parseJson = Util.parseJson(str);
            String string = parseJson.getString("access_token");
            String string2 = parseJson.getString("expires_in");
            String string3 = parseJson.getString("openid");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return;
            }
            this.mToken.setAccessToken(string, string2);
            this.mToken.setOpenId(string3);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private boolean m6180a(Activity activity, Fragment fragment, boolean z) {
        C10257f.m5670c(C10257f.f31917d, "startActionActivity() -- start");
        Intent targetActivityIntent = getTargetActivityIntent("com.tencent.open.agent.AgentActivity");
        if (targetActivityIntent != null) {
            Bundle composeCGIParams = composeCGIParams();
            if (z) {
                composeCGIParams.putString("isadd", "1");
            }
            composeCGIParams.putString("scope", this.f31149b);
            composeCGIParams.putString(Constants.PARAM_CLIENT_ID, this.mToken.getAppId());
            if (isOEM) {
                composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + SystemMediaRouteProvider.PACKAGE_NAME + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + businessId);
            } else {
                composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
            }
            composeCGIParams.putString("need_pay", "1");
            composeCGIParams.putString(Constants.KEY_APP_NAME, SystemUtils.getAppName(Global.getContext()));
            targetActivityIntent.putExtra(Constants.KEY_ACTION, SystemUtils.ACTION_LOGIN);
            targetActivityIntent.putExtra(Constants.KEY_PARAMS, composeCGIParams);
            this.mActivityIntent = targetActivityIntent;
            if (hasActivityForIntent()) {
                this.f31148a = new FeedConfirmListener(this.f31148a);
                if (fragment != null) {
                    C10257f.m5673b("AuthAgent", "startAssitActivity fragment");
                    startAssitActivity(fragment, this.f31148a);
                } else {
                    C10257f.m5673b("AuthAgent", "startAssitActivity activity");
                    startAssitActivity(activity, this.f31148a);
                }
                C10257f.m5670c(C10257f.f31917d, "startActionActivity() -- end");
                C10266d.m5641a().m5640a(0, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
                return true;
            }
        }
        C10266d.m5641a().m5640a(1, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
        C10257f.m5670c(C10257f.f31917d, "startActionActivity() -- end");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m6178a(IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "reportDAU() -- start");
        String accessToken = this.mToken.getAccessToken();
        String openId = this.mToken.getOpenId();
        String appId = this.mToken.getAppId();
        String str = "";
        if (!TextUtils.isEmpty(accessToken) && !TextUtils.isEmpty(openId) && !TextUtils.isEmpty(appId)) {
            str = Util.encrypt("tencent&sdk&qazxc***14969%%" + accessToken + appId + openId + "qzone3.4");
        }
        if (TextUtils.isEmpty(str)) {
            C10257f.m5667e(C10257f.f31917d, "reportDAU -- encrytoken is null");
            return;
        }
        Bundle composeCGIParams = composeCGIParams();
        composeCGIParams.putString("encrytoken", str);
        HttpUtils.requestAsync(this.mToken, Global.getContext(), "https://openmobile.qq.com/user/user_login_statis", composeCGIParams, "POST", null);
        C10257f.m5670c(C10257f.f31917d, "reportDAU() -- end");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m6174b(IUiListener iUiListener) {
        Bundle composeCGIParams = composeCGIParams();
        composeCGIParams.putString("reqType", "checkLogin");
        HttpUtils.requestAsync(this.mToken, Global.getContext(), "https://openmobile.qq.com/v3/user/get_info", composeCGIParams, "GET", new BaseApi.TempRequestListener(new CheckLoginListener(iUiListener)));
    }

    public int doLogin(Activity activity, String str, IUiListener iUiListener) {
        return doLogin(activity, str, iUiListener, false, null);
    }

    public int doLogin(Activity activity, String str, IUiListener iUiListener, boolean z, Fragment fragment) {
        this.f31149b = str;
        this.f31150c = activity;
        this.f31148a = iUiListener;
        if (m6180a(activity, fragment, z)) {
            C10257f.m5670c(C10257f.f31917d, "OpenUi, showUi, return Constants.UI_ACTIVITY");
            C10266d.m5641a().m5638a(this.mToken.getOpenId(), this.mToken.getAppId(), "2", "1", "5", "0", "0", "0");
            return 1;
        }
        C10266d.m5641a().m5638a(this.mToken.getOpenId(), this.mToken.getAppId(), "2", "1", "5", "1", "0", "0");
        C10257f.m5668d(C10257f.f31917d, "startActivity fail show dialog.");
        this.f31148a = new FeedConfirmListener(this.f31148a);
        return m6176a(z, this.f31148a);
    }

    @Override // com.tencent.connect.common.BaseApi
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        IUiListener iUiListener;
        ThreadManager.executeOnSubThread(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.2
            @Override // java.lang.Runnable
            public void run() {
                Global.saveVersionCode();
            }
        });
        Iterator<BaseApi.ApiTask> it2 = this.mTaskList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                iUiListener = null;
                break;
            }
            BaseApi.ApiTask next = it2.next();
            if (next.mRequestCode == i) {
                IUiListener iUiListener2 = next.mListener;
                this.mTaskList.remove(next);
                iUiListener = iUiListener2;
                break;
            }
        }
        if (intent == null) {
            if (iUiListener == null) {
                return;
            }
            iUiListener.onCancel();
            return;
        }
        m6177a(intent.getStringExtra(Constants.KEY_RESPONSE));
        if (iUiListener == null) {
            AssistActivity.setResultDataForLogin(activity, intent);
            return;
        }
        if (i2 == -1) {
            handleDataToListener(intent, iUiListener);
        } else {
            C10257f.m5673b(C10257f.f31917d, "OpenUi, onActivityResult, Constants.ACTIVITY_CANCEL");
            iUiListener.onCancel();
        }
        releaseResource();
        C10257f.m5674b();
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
        this.f31150c = null;
        this.f31148a = null;
    }
}
