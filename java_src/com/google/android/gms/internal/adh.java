package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
@aaa
@TargetApi(11)
/* loaded from: classes.dex */
public class adh extends adj {
    public adh(acy acyVar, boolean z) {
        super(acyVar, z);
    }

    @Override // com.google.android.gms.internal.acz, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, (Map<String, String>) null);
    }
}
