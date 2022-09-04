package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.C4585c;
import java.net.URI;
import java.net.URISyntaxException;
@aaa
/* loaded from: classes.dex */
public class adk extends WebViewClient {

    /* renamed from: a */
    private final String f21278a;

    /* renamed from: b */
    private boolean f21279b = false;

    /* renamed from: c */
    private final acy f21280c;

    /* renamed from: d */
    private final RunnableC8106zk f21281d;

    public adk(RunnableC8106zk runnableC8106zk, acy acyVar, String str) {
        this.f21278a = m18034b(str);
        this.f21280c = acyVar;
        this.f21281d = runnableC8106zk;
    }

    /* renamed from: b */
    private String m18034b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
        } catch (IndexOutOfBoundsException e) {
            abr.b(e.getMessage());
            return str;
        }
    }

    /* renamed from: a */
    protected boolean m18035a(String str) {
        boolean z = false;
        String m18034b = m18034b(str);
        if (!TextUtils.isEmpty(m18034b)) {
            try {
                URI uri = new URI(m18034b);
                if ("passback".equals(uri.getScheme())) {
                    abr.a("Passback received");
                    this.f21281d.m12815b();
                    z = true;
                } else if (!TextUtils.isEmpty(this.f21278a)) {
                    URI uri2 = new URI(this.f21278a);
                    String host = uri2.getHost();
                    String host2 = uri.getHost();
                    String path = uri2.getPath();
                    String path2 = uri.getPath();
                    if (C4585c.m23634a(host, host2) && C4585c.m23634a(path, path2)) {
                        abr.a("Passback received");
                        this.f21281d.m12815b();
                        z = true;
                    }
                }
            } catch (URISyntaxException e) {
                abr.b(e.getMessage());
            }
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        abr.a(valueOf.length() != 0 ? "JavascriptAdWebViewClient::onLoadResource: ".concat(valueOf) : new String("JavascriptAdWebViewClient::onLoadResource: "));
        if (!m18035a(str)) {
            this.f21280c.mo18084l().onLoadResource(this.f21280c.mo18122a(), str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        abr.a(valueOf.length() != 0 ? "JavascriptAdWebViewClient::onPageFinished: ".concat(valueOf) : new String("JavascriptAdWebViewClient::onPageFinished: "));
        if (!this.f21279b) {
            this.f21281d.m12819a();
            this.f21279b = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        abr.a(valueOf.length() != 0 ? "JavascriptAdWebViewClient::shouldOverrideUrlLoading: ".concat(valueOf) : new String("JavascriptAdWebViewClient::shouldOverrideUrlLoading: "));
        if (m18035a(str)) {
            abr.a("shouldOverrideUrlLoading: received passback url");
            return true;
        }
        return this.f21280c.mo18084l().shouldOverrideUrlLoading(this.f21280c.mo18122a(), str);
    }
}
