package com.xiaomi.mistatistic.sdk;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes2.dex */
public class MIWebView extends WebView {
    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new C10506b(this, webViewClient));
    }
}
