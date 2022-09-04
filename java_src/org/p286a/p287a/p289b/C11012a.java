package org.p286a.p287a.p289b;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.Credentials;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.b.a */
/* loaded from: classes2.dex */
public final class C11012a {

    /* renamed from: a */
    private final AuthScheme f35501a;

    /* renamed from: b */
    private final Credentials f35502b;

    public C11012a(AuthScheme authScheme, Credentials credentials) {
        C11354a.m1321a(authScheme, "Auth scheme");
        C11354a.m1321a(credentials, "User credentials");
        this.f35501a = authScheme;
        this.f35502b = credentials;
    }

    /* renamed from: a */
    public AuthScheme m2312a() {
        return this.f35501a;
    }

    /* renamed from: b */
    public Credentials m2311b() {
        return this.f35502b;
    }

    public String toString() {
        return this.f35501a.toString();
    }
}
