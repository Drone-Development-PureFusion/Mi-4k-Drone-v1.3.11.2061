package com.fimi.soul.module.login;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes.dex */
public class RegisterActivity extends Activity {

    /* renamed from: a */
    private WebView f9841a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_register);
        this.f9841a = (WebView) findViewById(C1704R.C1706id.web_view);
        this.f9841a.getSettings().setJavaScriptEnabled(true);
        this.f9841a.setWebViewClient(new WebViewClient() { // from class: com.fimi.soul.module.login.RegisterActivity.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        this.f9841a.loadUrl("https://account.xiaomi.com/pass/register");
    }
}
