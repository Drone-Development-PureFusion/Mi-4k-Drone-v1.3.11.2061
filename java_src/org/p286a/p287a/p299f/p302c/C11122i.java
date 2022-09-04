package org.p286a.p287a.p299f.p302c;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.f.c.i */
/* loaded from: classes2.dex */
public class C11122i {
    /* renamed from: a */
    public static SSLContext m1975a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance(C11118g.f35782a);
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException e) {
            throw new C11123j(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new C11123j(e2.getMessage(), e2);
        }
    }

    /* renamed from: b */
    public static SSLContext m1974b() {
        try {
            return SSLContext.getInstance("Default");
        } catch (NoSuchAlgorithmException e) {
            return m1975a();
        }
    }

    /* renamed from: c */
    public static C11119h m1973c() {
        return new C11119h();
    }
}
