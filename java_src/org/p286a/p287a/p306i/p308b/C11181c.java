package org.p286a.p287a.p306i.p308b;

import java.util.HashMap;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScheme;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.AbstractC11019a;
import org.p286a.p287a.p299f.AbstractC11134i;
import org.p286a.p287a.p299f.C11135j;
import org.p286a.p287a.p306i.p309c.C11221k;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.b.c */
/* loaded from: classes2.dex */
public class C11181c implements AbstractC11019a {

    /* renamed from: a */
    private final HashMap<HttpHost, AuthScheme> f35989a;

    /* renamed from: b */
    private final AbstractC11134i f35990b;

    public C11181c() {
        this(null);
    }

    public C11181c(AbstractC11134i abstractC11134i) {
        this.f35989a = new HashMap<>();
        this.f35990b = abstractC11134i == null ? C11221k.f36128a : abstractC11134i;
    }

    @Override // org.p286a.p287a.p290c.AbstractC11019a
    /* renamed from: a */
    public AuthScheme mo1778a(HttpHost httpHost) {
        C11354a.m1321a(httpHost, "HTTP host");
        return this.f35989a.get(m1775c(httpHost));
    }

    @Override // org.p286a.p287a.p290c.AbstractC11019a
    /* renamed from: a */
    public void mo1779a() {
        this.f35989a.clear();
    }

    @Override // org.p286a.p287a.p290c.AbstractC11019a
    /* renamed from: a */
    public void mo1777a(HttpHost httpHost, AuthScheme authScheme) {
        C11354a.m1321a(httpHost, "HTTP host");
        this.f35989a.put(m1775c(httpHost), authScheme);
    }

    @Override // org.p286a.p287a.p290c.AbstractC11019a
    /* renamed from: b */
    public void mo1776b(HttpHost httpHost) {
        C11354a.m1321a(httpHost, "HTTP host");
        this.f35989a.remove(m1775c(httpHost));
    }

    /* renamed from: c */
    protected HttpHost m1775c(HttpHost httpHost) {
        if (httpHost.getPort() <= 0) {
            try {
                return new HttpHost(httpHost.getHostName(), this.f35990b.mo1630a(httpHost), httpHost.getSchemeName());
            } catch (C11135j e) {
                return httpHost;
            }
        }
        return httpHost;
    }

    public String toString() {
        return this.f35989a.toString();
    }
}
