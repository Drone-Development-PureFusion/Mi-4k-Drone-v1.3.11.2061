package com.xiaomi.mistatistic.sdk;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.xiaomi.mistatistic.sdk.controller.C10529j;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.xiaomi.mistatistic.sdk.b */
/* loaded from: classes2.dex */
class C10506b extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ MIWebView f32638a;

    /* renamed from: b */
    private WebViewClient f32639b;

    /* renamed from: c */
    private Map f32640c = new HashMap();

    public C10506b(MIWebView mIWebView, WebViewClient webViewClient) {
        this.f32638a = mIWebView;
        this.f32639b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (this.f32639b != null) {
            this.f32639b.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        if (this.f32639b != null) {
            this.f32639b.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        if (this.f32639b != null) {
            this.f32639b.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.f32639b != null) {
            this.f32639b.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
        Long l = (Long) this.f32640c.get(str);
        if (l != null) {
            C10529j.m4837a().m4834a(new HttpEvent(str, System.currentTimeMillis() - l.longValue()));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f32639b != null) {
            this.f32639b.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
        this.f32640c.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.f32639b != null) {
            this.f32639b.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
        Long l = (Long) this.f32640c.get(str2);
        if (l != null) {
            C10529j.m4837a().m4834a(new HttpEvent(str2, System.currentTimeMillis() - l.longValue(), i));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (this.f32639b != null) {
            this.f32639b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (this.f32639b != null) {
            this.f32639b.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f32639b != null) {
            this.f32639b.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        if (this.f32639b != null) {
            this.f32639b.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (this.f32639b != null) {
            this.f32639b.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (this.f32639b != null) {
            this.f32639b.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f32639b != null ? this.f32639b.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.f32639b != null ? this.f32639b.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f32639b != null ? this.f32639b.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }
}
