package com.fimi.soul.module.push;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class MessageDetailActivity extends BaseActivity {

    /* renamed from: a */
    protected static final FrameLayout.LayoutParams f9965a = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: b */
    private WebView f9966b;

    /* renamed from: c */
    private View f9967c;

    /* renamed from: d */
    private FrameLayout f9968d;

    /* renamed from: e */
    private WebChromeClient.CustomViewCallback f9969e;

    /* renamed from: com.fimi.soul.module.push.MessageDetailActivity$a */
    /* loaded from: classes.dex */
    static class C2830a extends FrameLayout {
        public C2830a(Context context) {
            super(context);
            setBackgroundColor(context.getResources().getColor(17170444));
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: a */
    private void m30184a() {
        TextView textView = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        textView.setText(C1704R.C1707string.message_detail);
        Button button = (Button) findViewById(C1704R.C1706id.black_btn);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.push.MessageDetailActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MessageDetailActivity.this.finish();
            }
        });
        this.f9966b = (WebView) findViewById(C1704R.C1706id.web_view);
        this.f9966b.getSettings().setJavaScriptEnabled(true);
        WebSettings settings = this.f9966b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        this.f9966b.setWebViewClient(new WebViewClient() { // from class: com.fimi.soul.module.push.MessageDetailActivity.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
        C3103au.m29232a(getAssets(), textView, button);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_message_detail);
        m30184a();
        String stringExtra = getIntent().getStringExtra("redirectURL");
        if (stringExtra != null) {
            this.f9966b.loadUrl(stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f9966b.removeAllViews();
        this.f9966b.destroy();
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            finish();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
