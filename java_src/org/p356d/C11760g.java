package org.p356d;

import org.p356d.p358b.C11734c;
import org.p356d.p358b.C11744m;
import org.p356d.p359c.C11750c;
/* renamed from: org.d.g */
/* loaded from: classes3.dex */
public class C11760g {

    /* renamed from: a */
    static AbstractC11730b f37106a;

    static {
        try {
            f37106a = m1b();
        } catch (Exception e) {
            C11744m.m123a("Unexpected failure while binding MarkerFactory", e);
        } catch (NoClassDefFoundError e2) {
            f37106a = new C11734c();
        }
    }

    private C11760g() {
    }

    /* renamed from: a */
    public static AbstractC11730b m3a() {
        return f37106a;
    }

    /* renamed from: a */
    public static AbstractC11759f m2a(String str) {
        return f37106a.mo164a(str);
    }

    /* renamed from: b */
    private static AbstractC11730b m1b() {
        try {
            return C11750c.getSingleton().mo22a();
        } catch (NoSuchMethodError e) {
            return C11750c.f37070a.mo22a();
        }
    }

    /* renamed from: b */
    public static AbstractC11759f m0b(String str) {
        return f37106a.mo161d(str);
    }
}
