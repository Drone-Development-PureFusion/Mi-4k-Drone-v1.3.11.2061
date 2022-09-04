package com.fimi.soul.module.insurance;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes.dex */
public class ReceiveInsuranceActivity extends Activity {

    /* renamed from: a */
    public static String f9698a = "https://api.jr.mi.com/insurance/uav.html?from=uav";

    /* renamed from: b */
    private WebView f9699b;

    /* renamed from: a */
    private void m30296a() {
        this.f9699b = (WebView) findViewById(C1704R.C1706id.webView);
        WebSettings settings = this.f9699b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        this.f9699b.setWebViewClient(new WebViewClient() { // from class: com.fimi.soul.module.insurance.ReceiveInsuranceActivity.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        this.f9699b.loadUrl("http://staging.mifi.pt.xiaomi.com/insurance/uav.html");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_receive_insurance);
        m30296a();
    }
}
