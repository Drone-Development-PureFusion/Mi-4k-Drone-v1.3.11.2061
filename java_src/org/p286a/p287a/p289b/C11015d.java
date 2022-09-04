package org.p286a.p287a.p289b;

import java.util.Queue;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.b.d */
/* loaded from: classes.dex */
public class C11015d {

    /* renamed from: a */
    private EnumC11013b f35509a = EnumC11013b.UNCHALLENGED;

    /* renamed from: b */
    private AuthScheme f35510b;

    /* renamed from: c */
    private AuthScope f35511c;

    /* renamed from: d */
    private Credentials f35512d;

    /* renamed from: e */
    private Queue<C11012a> f35513e;

    /* renamed from: a */
    public void m2310a() {
        this.f35509a = EnumC11013b.UNCHALLENGED;
        this.f35513e = null;
        this.f35510b = null;
        this.f35511c = null;
        this.f35512d = null;
    }

    /* renamed from: a */
    public void m2309a(Queue<C11012a> queue) {
        C11354a.m1320a(queue, "Queue of auth options");
        this.f35513e = queue;
        this.f35510b = null;
        this.f35512d = null;
    }

    /* renamed from: a */
    public void m2308a(EnumC11013b enumC11013b) {
        if (enumC11013b == null) {
            enumC11013b = EnumC11013b.UNCHALLENGED;
        }
        this.f35509a = enumC11013b;
    }

    @Deprecated
    /* renamed from: a */
    public void m2307a(AuthScheme authScheme) {
        if (authScheme == null) {
            m2310a();
        } else {
            this.f35510b = authScheme;
        }
    }

    /* renamed from: a */
    public void m2306a(AuthScheme authScheme, Credentials credentials) {
        C11354a.m1321a(authScheme, "Auth scheme");
        C11354a.m1321a(credentials, "Credentials");
        this.f35510b = authScheme;
        this.f35512d = credentials;
        this.f35513e = null;
    }

    @Deprecated
    /* renamed from: a */
    public void m2305a(AuthScope authScope) {
        this.f35511c = authScope;
    }

    @Deprecated
    /* renamed from: a */
    public void m2304a(Credentials credentials) {
        this.f35512d = credentials;
    }

    /* renamed from: b */
    public EnumC11013b m2303b() {
        return this.f35509a;
    }

    /* renamed from: c */
    public AuthScheme m2302c() {
        return this.f35510b;
    }

    /* renamed from: d */
    public Credentials m2301d() {
        return this.f35512d;
    }

    /* renamed from: e */
    public Queue<C11012a> m2300e() {
        return this.f35513e;
    }

    /* renamed from: f */
    public boolean m2299f() {
        return this.f35513e != null && !this.f35513e.isEmpty();
    }

    @Deprecated
    /* renamed from: g */
    public void m2298g() {
        m2310a();
    }

    @Deprecated
    /* renamed from: h */
    public boolean m2297h() {
        return this.f35510b != null;
    }

    @Deprecated
    /* renamed from: i */
    public AuthScope m2296i() {
        return this.f35511c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("state:").append(this.f35509a).append(";");
        if (this.f35510b != null) {
            sb.append("auth scheme:").append(this.f35510b.getSchemeName()).append(";");
        }
        if (this.f35512d != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }
}
