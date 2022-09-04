package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.drive.AbstractC4808e;
import com.tencent.connect.auth.AuthConstants;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.C10241a;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.p265b.C10269g;
import com.tencent.open.p266c.C10280b;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.Util;
import com.tencent.tauth.AuthActivity;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class TDialog extends AbstractDialogC10261b {

    /* renamed from: a */
    static final FrameLayout.LayoutParams f31767a = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: b */
    static Toast f31768b = null;

    /* renamed from: d */
    private static WeakReference<ProgressDialog> f31769d;

    /* renamed from: c */
    private WeakReference<Context> f31770c;

    /* renamed from: e */
    private String f31771e;

    /* renamed from: f */
    private OnTimeListener f31772f;

    /* renamed from: g */
    private IUiListener f31773g;

    /* renamed from: h */
    private FrameLayout f31774h;

    /* renamed from: i */
    private C10280b f31775i;

    /* renamed from: j */
    private Handler f31776j;

    /* renamed from: k */
    private boolean f31777k = false;

    /* renamed from: l */
    private QQToken f31778l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class FbWebViewClient extends WebViewClient {
        private FbWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TDialog.this.f31775i.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Util.logd("TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TDialog.this.f31772f.onError(new UiError(i, str, str2));
            if (TDialog.this.f31770c != null && TDialog.this.f31770c.get() != null) {
                Toast.makeText((Context) TDialog.this.f31770c.get(), "网络连接异常或系统错误", 0).show();
            }
            TDialog.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Util.logd("TDialog", "Redirect URL: " + str);
            if (str.startsWith(ServerSetting.getInstance().getEnvUrl((Context) TDialog.this.f31770c.get(), ServerSetting.DEFAULT_REDIRECT_URI))) {
                TDialog.this.f31772f.onComplete(Util.parseUrlToJson(str));
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            } else if (str.startsWith("auth://cancel")) {
                TDialog.this.f31772f.onCancel();
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            } else if (str.startsWith("auth://close")) {
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            } else if (!str.startsWith("download://")) {
                return str.startsWith(AuthConstants.PROGRESS_URI);
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str.substring("download://".length()))));
                intent.addFlags(AbstractC4808e.f17570a_);
                if (TDialog.this.f31770c != null && TDialog.this.f31770c.get() != null) {
                    ((Context) TDialog.this.f31770c.get()).startActivity(intent);
                }
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class JsListener extends C10241a.C10243b {
        private JsListener() {
        }

        public void onAddShare(String str) {
            C10257f.m5673b("TDialog", "onAddShare");
            onComplete(str);
        }

        public void onCancel(String str) {
            C10257f.m5673b("TDialog", "onCancel --msg = " + str);
            TDialog.this.f31776j.obtainMessage(2, str).sendToTarget();
            TDialog.this.dismiss();
        }

        public void onCancelAddShare(String str) {
            C10257f.m5673b("TDialog", "onCancelAddShare");
            onCancel("cancel");
        }

        public void onCancelInvite() {
            C10257f.m5673b("TDialog", "onCancelInvite");
            onCancel("");
        }

        public void onCancelLogin() {
            onCancel("");
        }

        public void onComplete(String str) {
            TDialog.this.f31776j.obtainMessage(1, str).sendToTarget();
            C10257f.m5667e("onComplete", str);
            TDialog.this.dismiss();
        }

        public void onInvite(String str) {
            onComplete(str);
        }

        public void onLoad(String str) {
            TDialog.this.f31776j.obtainMessage(4, str).sendToTarget();
        }

        public void showMsg(String str) {
            TDialog.this.f31776j.obtainMessage(3, str).sendToTarget();
        }
    }

    /* loaded from: classes2.dex */
    private static class OnTimeListener implements IUiListener {
        private String mAction;
        String mAppid;
        String mUrl;
        private WeakReference<Context> mWeakCtx;
        private IUiListener mWeakL;

        public OnTimeListener(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.mWeakCtx = new WeakReference<>(context);
            this.mAction = str;
            this.mUrl = str2;
            this.mAppid = str3;
            this.mWeakL = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onComplete(String str) {
            try {
                onComplete(Util.parseJson(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.mWeakL != null) {
                this.mWeakL.onCancel();
                this.mWeakL = null;
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C10269g.m5630a().m5625a(this.mAction + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.mUrl, false);
            if (this.mWeakL != null) {
                this.mWeakL.onComplete(jSONObject);
                this.mWeakL = null;
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            C10269g.m5630a().m5625a(this.mAction + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, uiError.errorMessage != null ? uiError.errorMessage + this.mUrl : this.mUrl, false);
            if (this.mWeakL != null) {
                this.mWeakL.onError(uiError);
                this.mWeakL = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    private class THandler extends Handler {

        /* renamed from: mL */
        private OnTimeListener f31779mL;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.f31779mL = onTimeListener;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C10257f.m5673b("TAG", "--handleMessage--msg.WHAT = " + message.what);
            switch (message.what) {
                case 1:
                    this.f31779mL.onComplete((String) message.obj);
                    return;
                case 2:
                    this.f31779mL.onCancel();
                    return;
                case 3:
                    if (TDialog.this.f31770c == null || TDialog.this.f31770c.get() == null) {
                        return;
                    }
                    TDialog.m5793c((Context) TDialog.this.f31770c.get(), (String) message.obj);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    if (TDialog.this.f31770c == null || TDialog.this.f31770c.get() == null) {
                        return;
                    }
                    TDialog.m5791d((Context) TDialog.this.f31770c.get(), (String) message.obj);
                    return;
            }
        }
    }

    public TDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, 16973840);
        this.f31778l = null;
        this.f31770c = new WeakReference<>(context);
        this.f31771e = str2;
        this.f31772f = new OnTimeListener(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f31776j = new THandler(this.f31772f, context.getMainLooper());
        this.f31773g = iUiListener;
        this.f31778l = qQToken;
    }

    /* renamed from: a */
    private void m5799a() {
        new TextView(this.f31770c.get()).setText("test");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f31775i = new C10280b(this.f31770c.get());
        this.f31775i.setLayoutParams(layoutParams);
        this.f31774h = new FrameLayout(this.f31770c.get());
        layoutParams.gravity = 17;
        this.f31774h.setLayoutParams(layoutParams);
        this.f31774h.addView(this.f31775i);
        setContentView(this.f31774h);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: b */
    private void m5796b() {
        this.f31775i.setVerticalScrollBarEnabled(false);
        this.f31775i.setHorizontalScrollBarEnabled(false);
        this.f31775i.setWebViewClient(new FbWebViewClient());
        this.f31775i.setWebChromeClient(this.mChromeClient);
        this.f31775i.clearFormData();
        WebSettings settings = this.f31775i.getSettings();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        if (this.f31770c != null && this.f31770c.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f31770c.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.jsBridge.m5726a(new JsListener(), "sdk_js_if");
        this.f31775i.loadUrl(this.f31771e);
        this.f31775i.setLayoutParams(f31767a);
        this.f31775i.setVisibility(4);
        this.f31775i.getSettings().setSavePassword(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m5793c(Context context, String str) {
        try {
            JSONObject parseJson = Util.parseJson(str);
            int i = parseJson.getInt("type");
            String string = parseJson.getString(SocialConstants.PARAM_SEND_MSG);
            if (i == 0) {
                if (f31768b == null) {
                    f31768b = Toast.makeText(context, string, 0);
                } else {
                    f31768b.setView(f31768b.getView());
                    f31768b.setText(string);
                    f31768b.setDuration(0);
                }
                f31768b.show();
            } else if (i != 1) {
            } else {
                if (f31768b == null) {
                    f31768b = Toast.makeText(context, string, 1);
                } else {
                    f31768b.setView(f31768b.getView());
                    f31768b.setText(string);
                    f31768b.setDuration(1);
                }
                f31768b.show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m5791d(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject parseJson = Util.parseJson(str);
            int i = parseJson.getInt(AuthActivity.ACTION_KEY);
            String string = parseJson.getString(SocialConstants.PARAM_SEND_MSG);
            if (i == 1) {
                if (f31769d == null) {
                    ProgressDialog progressDialog = new ProgressDialog(context);
                    progressDialog.setMessage(string);
                    f31769d = new WeakReference<>(progressDialog);
                    progressDialog.show();
                } else {
                    f31769d.get().setMessage(string);
                    if (!f31769d.get().isShowing()) {
                        f31769d.get().show();
                    }
                }
            } else if (i == 0 && f31769d != null && f31769d.get() != null && f31769d.get().isShowing()) {
                f31769d.get().dismiss();
                f31769d = null;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.f31772f != null) {
            this.f31772f.onCancel();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.AbstractDialogC10261b
    protected void onConsoleMessage(String str) {
        C10257f.m5673b("TDialog", "--onConsoleMessage--");
        try {
            this.jsBridge.mo5571a(this.f31775i, str);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.open.AbstractDialogC10261b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        m5799a();
        m5796b();
    }
}
