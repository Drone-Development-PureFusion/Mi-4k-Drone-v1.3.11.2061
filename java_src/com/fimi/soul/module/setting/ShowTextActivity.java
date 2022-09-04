package com.fimi.soul.module.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class ShowTextActivity extends BaseActivity {

    /* renamed from: a */
    public static final String f10326a = "URL_TITLE";

    /* renamed from: b */
    public static final String f10327b = "URL_LOCAL";

    /* renamed from: c */
    public static final String f10328c = "URL_ONLINE";

    /* renamed from: d */
    private WebView f10329d;

    /* renamed from: e */
    private Button f10330e;

    /* renamed from: f */
    private TextView f10331f;

    /* renamed from: a */
    private void m30062a(Intent intent) {
        String stringExtra = intent.getStringExtra(f10328c);
        String stringExtra2 = intent.getStringExtra(f10327b);
        int intExtra = intent.getIntExtra(f10326a, 0);
        if (intExtra != 0) {
            this.f10331f.setText(intExtra);
        }
        this.f10330e = (Button) findViewById(C1704R.C1706id.backBtn);
        this.f10330e.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.ShowTextActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ShowTextActivity.this.finish();
            }
        });
        this.f10329d = (WebView) findViewById(C1704R.C1706id.web_view);
        this.f10329d.getSettings().setJavaScriptEnabled(true);
        this.f10329d.getSettings().setDomStorageEnabled(true);
        this.f10329d.setWebViewClient(new WebViewClient() { // from class: com.fimi.soul.module.setting.ShowTextActivity.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        if (C3103au.m29221b(this)) {
            this.f10329d.loadUrl(stringExtra);
        } else {
            this.f10329d.loadUrl(stringExtra2);
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_show_text);
        this.f10331f = (TextView) findViewById(C1704R.C1706id.title);
        m30062a(getIntent());
    }
}
