package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.support.annotation.Nullable;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
@aaa
@TargetApi(21)
/* loaded from: classes.dex */
public class adl extends adj {
    public adl(acy acyVar, boolean z) {
        super(acyVar, z);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
