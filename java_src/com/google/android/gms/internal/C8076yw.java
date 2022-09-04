package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@aaa
/* renamed from: com.google.android.gms.internal.yw */
/* loaded from: classes.dex */
public class C8076yw implements AbstractC8074yu {

    /* renamed from: a */
    final Set<WebView> f26431a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    private final Context f26432b;

    public C8076yw(Context context) {
        this.f26432b = context;
    }

    /* renamed from: a */
    public WebView m12857a() {
        WebView webView = new WebView(this.f26432b);
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }

    @Override // com.google.android.gms.internal.AbstractC8074yu
    /* renamed from: a */
    public void mo12856a(String str, final String str2, final String str3) {
        abr.a("Fetching assets for the given html");
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.yw.1
            @Override // java.lang.Runnable
            public void run() {
                final WebView m12857a = C8076yw.this.m12857a();
                m12857a.setWebViewClient(new WebViewClient() { // from class: com.google.android.gms.internal.yw.1.1
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str4) {
                        abr.a("Loading assets have finished");
                        C8076yw.this.f26431a.remove(m12857a);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i, String str4, String str5) {
                        abr.d("Loading assets have failed.");
                        C8076yw.this.f26431a.remove(m12857a);
                    }
                });
                C8076yw.this.f26431a.add(m12857a);
                m12857a.loadDataWithBaseURL(str2, str3, "text/html", "UTF-8", null);
                abr.a("Fetching assets finished.");
            }
        });
    }
}
