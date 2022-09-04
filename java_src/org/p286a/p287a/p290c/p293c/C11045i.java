package org.p286a.p287a.p290c.p293c;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.c.c.i */
/* loaded from: classes2.dex */
public class C11045i extends AbstractC11049m {

    /* renamed from: a */
    public static final String f35586a = "OPTIONS";

    public C11045i() {
    }

    public C11045i(String str) {
        a(URI.create(str));
    }

    public C11045i(URI uri) {
        a(uri);
    }

    /* renamed from: a */
    public Set<String> m2230a(HttpResponse httpResponse) {
        C11354a.m1321a(httpResponse, "HTTP response");
        HeaderIterator headerIterator = httpResponse.headerIterator(C11086e.f35714g);
        HashSet hashSet = new HashSet();
        while (headerIterator.hasNext()) {
            for (HeaderElement headerElement : headerIterator.nextHeader().getElements()) {
                hashSet.add(headerElement.getName());
            }
        }
        return hashSet;
    }

    @Override // org.p286a.p287a.p290c.p293c.AbstractC11049m
    public String getMethod() {
        return f35586a;
    }
}
