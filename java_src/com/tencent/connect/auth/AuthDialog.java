package com.tencent.connect.auth;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.drive.AbstractC4808e;
import com.tencent.connect.auth.AuthMap;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.p265b.C10269g;
import com.tencent.open.p266c.C10281c;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.open.web.security.C10292b;
import com.tencent.open.web.security.JniInterface;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* loaded from: classes.dex */
public class AuthDialog extends Dialog {

    /* renamed from: a */
    private static final String f31178a = C10257f.f31917d + ".authDlg";

    /* renamed from: b */
    private String f31179b;

    /* renamed from: c */
    private OnTimeListener f31180c;

    /* renamed from: d */
    private IUiListener f31181d;

    /* renamed from: e */
    private Handler f31182e;

    /* renamed from: f */
    private FrameLayout f31183f;

    /* renamed from: g */
    private LinearLayout f31184g;

    /* renamed from: h */
    private FrameLayout f31185h;

    /* renamed from: i */
    private ProgressBar f31186i;

    /* renamed from: j */
    private String f31187j;

    /* renamed from: k */
    private C10281c f31188k;

    /* renamed from: l */
    private Context f31189l;

    /* renamed from: o */
    private int f31192o;

    /* renamed from: p */
    private String f31193p;

    /* renamed from: q */
    private String f31194q;

    /* renamed from: t */
    private HashMap<String, Runnable> f31197t;

    /* renamed from: n */
    private boolean f31191n = false;

    /* renamed from: r */
    private long f31195r = 0;

    /* renamed from: s */
    private long f31196s = NotificationOptions.f16268b;

    /* renamed from: m */
    private C10292b f31190m = new C10292b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class LoginWebViewClient extends WebViewClient {
        private LoginWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C10257f.m5673b(AuthDialog.f31178a, "-->onPageFinished, url: " + str);
            AuthDialog.this.f31185h.setVisibility(8);
            if (AuthDialog.this.f31188k != null) {
                AuthDialog.this.f31188k.setVisibility(0);
            }
            if (!TextUtils.isEmpty(str)) {
                AuthDialog.this.f31182e.removeCallbacks((Runnable) AuthDialog.this.f31197t.remove(str));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C10257f.m5673b(AuthDialog.f31178a, "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            AuthDialog.this.f31185h.setVisibility(0);
            AuthDialog.this.f31195r = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(AuthDialog.this.f31193p)) {
                AuthDialog.this.f31182e.removeCallbacks((Runnable) AuthDialog.this.f31197t.remove(AuthDialog.this.f31193p));
            }
            AuthDialog.this.f31193p = str;
            TimeOutRunable timeOutRunable = new TimeOutRunable(AuthDialog.this.f31193p);
            AuthDialog.this.f31197t.put(str, timeOutRunable);
            AuthDialog.this.f31182e.postDelayed(timeOutRunable, 120000L);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C10257f.m5670c(AuthDialog.f31178a, "-->onReceivedError, errorCode: " + i + " | description: " + str);
            if (!Util.checkNetWork(AuthDialog.this.f31189l)) {
                AuthDialog.this.f31180c.onError(new UiError(9001, "当前网络不可用，请稍后重试！", str2));
                AuthDialog.this.dismiss();
            } else if (AuthDialog.this.f31193p.startsWith(ServerSetting.DOWNLOAD_QQ_URL)) {
                AuthDialog.this.f31180c.onError(new UiError(i, str, str2));
                AuthDialog.this.dismiss();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime() - AuthDialog.this.f31195r;
                if (AuthDialog.this.f31192o >= 1 || elapsedRealtime >= AuthDialog.this.f31196s) {
                    AuthDialog.this.f31188k.loadUrl(AuthDialog.this.m6155b());
                    return;
                }
                AuthDialog.m6136m(AuthDialog.this);
                AuthDialog.this.f31182e.postDelayed(new Runnable() { // from class: com.tencent.connect.auth.AuthDialog.LoginWebViewClient.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AuthDialog.this.f31188k.loadUrl(AuthDialog.this.f31193p);
                    }
                }, 500L);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            AuthDialog.this.f31180c.onError(new UiError(sslError.getPrimaryError(), "请求不合法，请检查手机安全设置，如系统时间、代理等。", "ssl error"));
            AuthDialog.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C10257f.m5673b(AuthDialog.f31178a, "-->Redirect URL: " + str);
            if (str.startsWith(AuthConstants.REDIRECT_BROWSER_URI)) {
                JSONObject parseUrlToJson = Util.parseUrlToJson(str);
                AuthDialog.this.f31191n = AuthDialog.this.m6144f();
                if (!AuthDialog.this.f31191n) {
                    if (parseUrlToJson.optString("fail_cb", null) != null) {
                        AuthDialog.this.callJs(parseUrlToJson.optString("fail_cb"), "");
                    } else if (parseUrlToJson.optInt("fall_to_wv") == 1) {
                        AuthDialog.m6159a(AuthDialog.this, (Object) (AuthDialog.this.f31179b.indexOf(C0363a.f360a) > -1 ? "&" : C0363a.f360a));
                        AuthDialog.m6159a(AuthDialog.this, (Object) "browser_error=1");
                        AuthDialog.this.f31188k.loadUrl(AuthDialog.this.f31179b);
                    } else {
                        String optString = parseUrlToJson.optString("redir", null);
                        if (optString != null) {
                            AuthDialog.this.f31188k.loadUrl(optString);
                        }
                    }
                }
                return true;
            } else if (str.startsWith(ServerSetting.DEFAULT_REDIRECT_URI)) {
                AuthDialog.this.f31180c.onComplete(Util.parseUrlToJson(str));
                AuthDialog.this.dismiss();
                return true;
            } else if (str.startsWith("auth://cancel")) {
                AuthDialog.this.f31180c.onCancel();
                AuthDialog.this.dismiss();
                return true;
            } else if (str.startsWith("auth://close")) {
                AuthDialog.this.dismiss();
                return true;
            } else if (str.startsWith("download://")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str.substring("download://".length()))));
                    intent.addFlags(AbstractC4808e.f17570a_);
                    AuthDialog.this.f31189l.startActivity(intent);
                } catch (Exception e) {
                    C10257f.m5673b(AuthDialog.f31178a, "-->start download activity exception, e: " + e.getMessage());
                }
                return true;
            } else if (!str.startsWith(AuthConstants.PROGRESS_URI)) {
                if (str.startsWith(AuthConstants.ON_LOGIN_URI)) {
                    try {
                        List<String> pathSegments = Uri.parse(str).getPathSegments();
                        if (!pathSegments.isEmpty()) {
                            AuthDialog.this.f31194q = pathSegments.get(0);
                        }
                    } catch (Exception e2) {
                    }
                    return true;
                } else if (AuthDialog.this.f31190m.mo5571a(AuthDialog.this.f31188k, str)) {
                    return true;
                } else {
                    C10257f.m5670c(AuthDialog.f31178a, "-->Redirect URL: return false");
                    return false;
                }
            } else {
                try {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (pathSegments2.isEmpty()) {
                        return true;
                    }
                    int intValue = Integer.valueOf(pathSegments2.get(0)).intValue();
                    if (intValue == 0) {
                        AuthDialog.this.f31185h.setVisibility(8);
                        AuthDialog.this.f31188k.setVisibility(0);
                    } else if (intValue == 1) {
                        AuthDialog.this.f31185h.setVisibility(0);
                    }
                    return true;
                } catch (Exception e3) {
                    return true;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    private class OnTimeListener implements IUiListener {

        /* renamed from: a */
        String f31203a;

        /* renamed from: b */
        String f31204b;

        /* renamed from: d */
        private String f31206d;

        /* renamed from: e */
        private IUiListener f31207e;

        public OnTimeListener(String str, String str2, String str3, IUiListener iUiListener) {
            this.f31206d = str;
            this.f31203a = str2;
            this.f31204b = str3;
            this.f31207e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m6131a(String str) {
            try {
                onComplete(Util.parseJson(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.f31207e != null) {
                this.f31207e.onCancel();
                this.f31207e = null;
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C10269g.m5630a().m5625a(this.f31206d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f31203a, false);
            if (this.f31207e != null) {
                this.f31207e.onComplete(jSONObject);
                this.f31207e = null;
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str = uiError.errorMessage != null ? uiError.errorMessage + this.f31203a : this.f31203a;
            C10269g.m5630a().m5625a(this.f31206d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str, false);
            AuthDialog.this.m6156a(str);
            if (this.f31207e != null) {
                this.f31207e.onError(uiError);
                this.f31207e = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    private class THandler extends Handler {

        /* renamed from: b */
        private OnTimeListener f31209b;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.f31209b = onTimeListener;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f31209b.m6131a((String) message.obj);
                    return;
                case 2:
                    this.f31209b.onCancel();
                    return;
                case 3:
                    AuthDialog.m6154b(AuthDialog.this.f31189l, (String) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes2.dex */
    class TimeOutRunable implements Runnable {

        /* renamed from: a */
        String f31210a;

        public TimeOutRunable(String str) {
            this.f31210a = "";
            this.f31210a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10257f.m5673b(AuthDialog.f31178a, "-->timeoutUrl: " + this.f31210a + " | mRetryUrl: " + AuthDialog.this.f31193p);
            if (this.f31210a.equals(AuthDialog.this.f31193p)) {
                AuthDialog.this.f31180c.onError(new UiError(9002, "请求页面超时，请稍后重试！", AuthDialog.this.f31193p));
                AuthDialog.this.dismiss();
            }
        }
    }

    static {
        Context context;
        try {
            if (Global.getContext() == null) {
                C10257f.m5673b(f31178a, "-->load wbsafeedit lib fail, because context is null.");
            } else if (new File(context.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists()) {
                System.load(context.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
                C10257f.m5673b(f31178a, "-->load wbsafeedit lib success.");
            } else {
                C10257f.m5673b(f31178a, "-->load wbsafeedit lib fail, because so is not exists.");
            }
        } catch (Exception e) {
            C10257f.m5672b(f31178a, "-->load wbsafeedit lib error.", e);
        }
    }

    public AuthDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, 16973840);
        this.f31189l = context;
        this.f31179b = str2;
        this.f31180c = new OnTimeListener(str, str2, qQToken.getAppId(), iUiListener);
        this.f31182e = new THandler(this.f31180c, context.getMainLooper());
        this.f31181d = iUiListener;
        this.f31187j = str;
        getWindow().setSoftInputMode(32);
    }

    /* renamed from: a */
    static /* synthetic */ String m6159a(AuthDialog authDialog, Object obj) {
        String str = authDialog.f31179b + obj;
        authDialog.f31179b = str;
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m6156a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.f31194q) && this.f31194q.length() >= 4) {
            sb.append("_u_").append(this.f31194q.substring(this.f31194q.length() - 4));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m6155b() {
        String str = ServerSetting.DOWNLOAD_QQ_URL + this.f31179b.substring(this.f31179b.indexOf(C0363a.f360a) + 1);
        C10257f.m5670c(f31178a, "-->generateDownloadUrl, url: http://qzs.qq.com/open/mobile/login/qzsjump.html?");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m6154b(Context context, String str) {
        try {
            JSONObject parseJson = Util.parseJson(str);
            int i = parseJson.getInt("type");
            Toast.makeText(context.getApplicationContext(), parseJson.getString(SocialConstants.PARAM_SEND_MSG), i).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private void m6151c() {
        m6148d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f31188k = new C10281c(this.f31189l);
        this.f31188k.setLayoutParams(layoutParams);
        this.f31183f = new FrameLayout(this.f31189l);
        layoutParams.gravity = 17;
        this.f31183f.setLayoutParams(layoutParams);
        this.f31183f.addView(this.f31188k);
        this.f31183f.addView(this.f31185h);
        setContentView(this.f31183f);
    }

    /* renamed from: d */
    private void m6148d() {
        this.f31186i = new ProgressBar(this.f31189l);
        this.f31186i.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f31184g = new LinearLayout(this.f31189l);
        TextView textView = null;
        if (this.f31187j.equals(SystemUtils.ACTION_LOGIN)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.f31189l);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.f31184g.setLayoutParams(layoutParams2);
        this.f31184g.addView(this.f31186i);
        if (textView != null) {
            this.f31184g.addView(textView);
        }
        this.f31185h = new FrameLayout(this.f31189l);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = 80;
        layoutParams3.rightMargin = 80;
        layoutParams3.topMargin = 40;
        layoutParams3.bottomMargin = 40;
        layoutParams3.gravity = 17;
        this.f31185h.setLayoutParams(layoutParams3);
        this.f31185h.setBackgroundResource(17301504);
        this.f31185h.addView(this.f31184g);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: e */
    private void m6146e() {
        this.f31188k.setVerticalScrollBarEnabled(false);
        this.f31188k.setHorizontalScrollBarEnabled(false);
        this.f31188k.setWebViewClient(new LoginWebViewClient());
        this.f31188k.setWebChromeClient(new WebChromeClient());
        this.f31188k.clearFormData();
        this.f31188k.clearSslPreferences();
        this.f31188k.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.tencent.connect.auth.AuthDialog.1
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        });
        this.f31188k.setOnTouchListener(new View.OnTouchListener() { // from class: com.tencent.connect.auth.AuthDialog.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                    case 1:
                        if (view.hasFocus()) {
                            return false;
                        }
                        view.requestFocus();
                        return false;
                    default:
                        return false;
                }
            }
        });
        WebSettings settings = this.f31188k.getSettings();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.f31189l.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        C10257f.m5673b(f31178a, "-->mUrl : " + this.f31179b);
        this.f31193p = this.f31179b;
        this.f31188k.loadUrl(this.f31179b);
        this.f31188k.setVisibility(4);
        this.f31188k.getSettings().setSavePassword(false);
        this.f31190m.a(new SecureJsInterface(), "SecureJsInterface");
        SecureJsInterface.isPWDEdit = false;
        super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.connect.auth.AuthDialog.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                try {
                    JniInterface.clearAllPWD();
                } catch (Exception e) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m6144f() {
        AuthMap authMap = AuthMap.getInstance();
        String makeKey = authMap.makeKey();
        AuthMap.Auth auth = new AuthMap.Auth();
        auth.listener = this.f31181d;
        auth.dialog = this;
        auth.key = makeKey;
        String str = authMap.set(auth);
        String substring = this.f31179b.substring(0, this.f31179b.indexOf(C0363a.f360a));
        Bundle parseUrl = Util.parseUrl(this.f31179b);
        parseUrl.putString("token_key", makeKey);
        parseUrl.putString("serial", str);
        parseUrl.putString("browser", "1");
        this.f31179b = substring + C0363a.f360a + Util.encodeUrl(parseUrl);
        return Util.openBrowser(this.f31189l, this.f31179b);
    }

    /* renamed from: m */
    static /* synthetic */ int m6136m(AuthDialog authDialog) {
        int i = authDialog.f31192o;
        authDialog.f31192o = i + 1;
        return i;
    }

    public void callJs(String str, String str2) {
        this.f31188k.loadUrl("javascript:" + str + "(" + str2 + ");void(" + System.currentTimeMillis() + ");");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f31197t.clear();
        this.f31182e.removeCallbacksAndMessages(null);
        if (isShowing()) {
            super.dismiss();
        }
        if (this.f31188k != null) {
            this.f31188k.destroy();
            this.f31188k = null;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (!this.f31191n) {
            this.f31180c.onCancel();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        m6151c();
        m6146e();
        this.f31197t = new HashMap<>();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }
}
