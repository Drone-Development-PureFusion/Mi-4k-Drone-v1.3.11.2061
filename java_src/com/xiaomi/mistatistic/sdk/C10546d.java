package com.xiaomi.mistatistic.sdk;

import android.os.SystemClock;
import com.xiaomi.mistatistic.sdk.controller.C10529j;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import com.xiaomi.mistatistic.sdk.p269a.C10502a;
import com.xiaomi.mistatistic.sdk.p269a.C10503b;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import javax.net.ssl.HttpsURLConnection;
/* renamed from: com.xiaomi.mistatistic.sdk.d */
/* loaded from: classes2.dex */
class C10546d extends URLStreamHandler {

    /* renamed from: a */
    private URLStreamHandler f32703a;

    public C10546d(URLStreamHandler uRLStreamHandler) {
        this.f32703a = uRLStreamHandler;
    }

    @Override // java.net.URLStreamHandler
    protected URLConnection openConnection(URL url) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Method declaredMethod = URLStreamHandler.class.getDeclaredMethod("openConnection", URL.class);
            declaredMethod.setAccessible(true);
            URLConnection uRLConnection = (URLConnection) declaredMethod.invoke(this.f32703a, url);
            if (uRLConnection instanceof HttpsURLConnection) {
                C10503b c10503b = new C10503b((HttpsURLConnection) uRLConnection);
                c10503b.m4887a(elapsedRealtime);
                return c10503b;
            } else if (!(uRLConnection instanceof HttpURLConnection)) {
                return uRLConnection;
            } else {
                C10502a c10502a = new C10502a((HttpURLConnection) uRLConnection);
                c10502a.m4892a(elapsedRealtime);
                return c10502a;
            }
        } catch (Exception e) {
            C10529j.m4837a().m4834a(new HttpEvent(url.toString(), e.getClass().getSimpleName()));
            throw new IOException();
        }
    }
}
