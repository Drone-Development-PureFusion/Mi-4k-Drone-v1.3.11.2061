package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C3779u;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.p286a.p287a.C11086e;
@aaa
@TargetApi(11)
/* loaded from: classes.dex */
public class adj extends acz {
    public adj(acy acyVar, boolean z) {
        super(acyVar, z);
    }

    /* renamed from: a */
    protected WebResourceResponse m18037a(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C11086e.f35703Y, C3779u.m26890e().m18372a(context, str));
        hashMap.put("Cache-Control", "max-stale=3600");
        String str3 = new acc(context).m18243a(str2, hashMap).get(60L, TimeUnit.SECONDS);
        if (str3 == null) {
            return null;
        }
        return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public WebResourceResponse m18036a(WebView webView, String str, @Nullable Map<String, String> map) {
        if (!(webView instanceof acy)) {
            abr.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        acy acyVar = (acy) webView;
        if (this.f21177b != null) {
            this.f21177b.m26926a(str, map);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            return super.shouldInterceptRequest(webView, str);
        }
        if (acyVar.mo18084l() != null) {
            acyVar.mo18084l().m18147o();
        }
        try {
            return m18037a(acyVar.getContext(), acyVar.mo18081o().f14733b, acyVar.mo18085k().f13867e ? C7788uf.f25728M.m13486c() : acyVar.mo18080p() ? C7788uf.f25727L.m13486c() : C7788uf.f25726K.m13486c());
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            abr.d(valueOf.length() != 0 ? "Could not fetch MRAID JS. ".concat(valueOf) : new String("Could not fetch MRAID JS. "));
            return null;
        }
    }
}
