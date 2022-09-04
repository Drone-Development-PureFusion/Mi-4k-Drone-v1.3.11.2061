package org.p286a.p287a.p299f.p302c;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.p286a.p287a.p320o.C11354a;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: org.a.a.f.c.e */
/* loaded from: classes2.dex */
public final class C11116e {

    /* renamed from: a */
    private final String f35780a;

    /* renamed from: b */
    private final X509Certificate[] f35781b;

    public C11116e(String str, X509Certificate[] x509CertificateArr) {
        this.f35780a = (String) C11354a.m1321a(str, "Private key type");
        this.f35781b = x509CertificateArr;
    }

    /* renamed from: a */
    public String m1996a() {
        return this.f35780a;
    }

    /* renamed from: b */
    public X509Certificate[] m1995b() {
        return this.f35781b;
    }

    public String toString() {
        return this.f35780a + C0494h.f680A + Arrays.toString(this.f35781b);
    }
}
