package org.p356d.p359c;

import org.p356d.AbstractC11724a;
import org.p356d.p358b.C11744m;
import org.p356d.p360d.AbstractC11753b;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p028p.C0393a;
import p005b.p006a.p007a.p008a.p028p.C0394b;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p056p.C0687l;
import p005b.p006a.p007a.p029b.p058r.C0726w;
/* renamed from: org.d.c.a */
/* loaded from: classes3.dex */
public class C11748a implements AbstractC11753b {

    /* renamed from: b */
    static final String f37063b = "http://logback.qos.ch/codes.html#null_CS";

    /* renamed from: e */
    private boolean f37066e = false;

    /* renamed from: f */
    private C0286f f37067f = new C0286f();

    /* renamed from: g */
    private final C0394b f37068g = C0394b.m39435a();

    /* renamed from: a */
    public static String f37062a = "1.6";

    /* renamed from: c */
    private static C11748a f37064c = new C11748a();

    /* renamed from: d */
    private static Object f37065d = new Object();

    static {
        f37064c.m55c();
    }

    private C11748a() {
        this.f37067f.mo39318b("default");
    }

    /* renamed from: a */
    public static C11748a m57a() {
        return f37064c;
    }

    /* renamed from: b */
    static void m56b() {
        f37064c = new C11748a();
        f37064c.m55c();
    }

    /* renamed from: c */
    void m55c() {
        try {
            try {
                new C0393a(this.f37067f).m39440a();
            } catch (C0481m e) {
                C11744m.m123a("Failed to auto configure default logger context", e);
            }
            if (!C0687l.m38495a(this.f37067f)) {
                C0726w.m38371a(this.f37067f);
            }
            this.f37068g.m39434a(this.f37067f, f37065d);
            this.f37066e = true;
        } catch (Throwable th) {
            C11744m.m123a("Failed to instantiate [" + C0286f.class.getName() + "]", th);
        }
    }

    @Override // org.p356d.p360d.AbstractC11753b
    /* renamed from: d */
    public AbstractC11724a mo30d() {
        if (!this.f37066e) {
            return this.f37067f;
        }
        if (this.f37068g.m39432b() != null) {
            return this.f37068g.m39432b().mo39594a();
        }
        throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
    }

    @Override // org.p356d.p360d.AbstractC11753b
    /* renamed from: e */
    public String mo29e() {
        return this.f37068g.getClass().getName();
    }
}
