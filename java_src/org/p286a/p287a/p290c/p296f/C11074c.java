package org.p286a.p287a.p290c.p296f;

import java.io.Closeable;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p320o.C11357d;
/* renamed from: org.a.a.c.f.c */
/* loaded from: classes2.dex */
public class C11074c {
    private C11074c() {
    }

    /* renamed from: a */
    public static void m2146a(AbstractC11038b abstractC11038b) {
        if (abstractC11038b != null) {
            try {
                C11357d.m1303b(abstractC11038b.getEntity());
                abstractC11038b.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m2145a(HttpResponse httpResponse) {
        HttpEntity entity;
        if (httpResponse == null || (entity = httpResponse.getEntity()) == null) {
            return;
        }
        try {
            C11357d.m1303b(entity);
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public static void m2144a(HttpClient httpClient) {
        if (httpClient == null || !(httpClient instanceof Closeable)) {
            return;
        }
        try {
            ((Closeable) httpClient).close();
        } catch (IOException e) {
        }
    }
}
