package cn.sharesdk.facebook;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import cn.sharesdk.framework.C0816d;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.RegisterView;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ResHelper;
import java.util.HashMap;
/* renamed from: cn.sharesdk.facebook.f */
/* loaded from: classes.dex */
public class C0775f extends FakeActivity {

    /* renamed from: a */
    private String f1466a;

    /* renamed from: b */
    private PlatformActionListener f1467b;

    /* renamed from: c */
    private C0768a f1468c;

    /* renamed from: d */
    private RegisterView f1469d;

    /* renamed from: e */
    private WebView f1470e;

    /* renamed from: f */
    private boolean f1471f;

    /* renamed from: g */
    private boolean f1472g;

    /* renamed from: b */
    private C0768a m38035b() {
        try {
            String string = this.activity.getPackageManager().getActivityInfo(this.activity.getComponentName(), 128).metaData.getString("FBWebShareAdapter");
            if (string == null || string.length() <= 0) {
                return null;
            }
            Object newInstance = Class.forName(string).newInstance();
            if (newInstance instanceof C0768a) {
                return (C0768a) newInstance;
            }
            return null;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m38034b(String str) {
        String str2 = str == null ? "" : new String(str);
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        if (urlToBundle == null) {
            this.f1471f = true;
            finish();
            this.f1467b.onError(null, 0, new Throwable("failed to parse callback uri: " + str2));
            return;
        }
        String string = urlToBundle.getString("post_id");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(string)) {
            hashMap.put("post_id", string);
        }
        if (!urlToBundle.containsKey("error_code") && !urlToBundle.containsKey("error")) {
            this.f1472g = true;
            finish();
            this.f1467b.onComplete(null, 0, hashMap);
            return;
        }
        if (this.f1467b != null) {
            this.f1467b.onError(null, 9, new Throwable(ResHelper.encodeUrl(urlToBundle)));
        }
        this.f1471f = true;
        finish();
    }

    /* renamed from: a */
    protected RegisterView m38040a() {
        RegisterView registerView = new RegisterView(this.activity);
        registerView.m37986c().getChildAt(registerView.m37986c().getChildCount() - 1).setVisibility(8);
        registerView.m37992a().setOnClickListener(new View.OnClickListener() { // from class: cn.sharesdk.facebook.f.1
            /* JADX WARN: Type inference failed for: r0v0, types: [cn.sharesdk.facebook.f$1$1] */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new Thread() { // from class: cn.sharesdk.facebook.f.1.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            new Instrumentation().sendKeyDownUpSync(4);
                        } catch (Throwable th) {
                            C0831d.m37772a().m6199d(th);
                            C0775f.this.finish();
                            C0775f.this.f1467b.onCancel(null, 0);
                        }
                    }
                }.start();
            }
        });
        this.f1470e = registerView.m37988b();
        WebSettings settings = this.f1470e.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSavePassword(false);
        settings.setDatabasePath(this.activity.getDir("database", 0).getPath());
        this.f1470e.setVerticalScrollBarEnabled(false);
        this.f1470e.setHorizontalScrollBarEnabled(false);
        this.f1470e.setWebViewClient(new C0816d() { // from class: cn.sharesdk.facebook.f.2
            @Override // cn.sharesdk.framework.C0816d, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str != null && str.startsWith("fbconnect://success")) {
                    C0775f.this.m38034b(str);
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        return registerView;
    }

    /* renamed from: a */
    public void m38037a(PlatformActionListener platformActionListener) {
        this.f1467b = platformActionListener;
    }

    /* renamed from: a */
    public void m38036a(String str) {
        this.f1466a = str;
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.f1469d = m38040a();
        try {
            int stringRes = ResHelper.getStringRes(getContext(), "ssdk_share_to_facebook");
            if (stringRes > 0) {
                this.f1469d.m37986c().getTvTitle().setText(stringRes);
            }
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            this.f1469d.m37986c().setVisibility(8);
        }
        this.f1468c.m38074a(this.f1469d.m37985d());
        this.f1468c.m38075a(this.f1469d.m37988b());
        this.f1468c.m38073a(this.f1469d.m37986c());
        this.f1468c.m38077a();
        disableScreenCapture();
        this.activity.setContentView(this.f1469d);
        if (!"none".equals(DeviceHelper.getInstance(this.activity).getDetailNetworkTypeForStatic())) {
            this.f1469d.m37988b().loadUrl(this.f1466a);
            return;
        }
        this.f1471f = true;
        finish();
        this.f1467b.onError(null, 0, new Throwable("failed to load webpage, network disconnected."));
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        if (!this.f1471f && !this.f1472g) {
            this.f1467b.onCancel(null, 0);
        }
        if (this.f1468c != null) {
            this.f1468c.m38072b();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
        return this.f1468c != null ? this.f1468c.m38066h() : super.onFinish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        if (this.f1468c != null) {
            this.f1468c.m38070d();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onRestart() {
        if (this.f1468c != null) {
            this.f1468c.m38067g();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        if (this.f1468c != null) {
            this.f1468c.m38069e();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStart() {
        if (this.f1468c != null) {
            this.f1468c.m38071c();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        if (this.f1468c != null) {
            this.f1468c.m38068f();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (this.f1468c == null) {
            this.f1468c = m38035b();
            if (this.f1468c == null) {
                this.f1468c = new C0768a();
            }
        }
        this.f1468c.m38076a(activity);
    }
}
