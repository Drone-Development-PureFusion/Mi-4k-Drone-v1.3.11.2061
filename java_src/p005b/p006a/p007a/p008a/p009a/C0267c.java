package p005b.p006a.p007a.p008a.p009a;

import org.p356d.AbstractC11747c;
import org.p356d.C11751d;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p013d.C0282a;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0677b;
/* renamed from: b.a.a.a.a.c */
/* loaded from: classes.dex */
public class C0267c {
    private C0267c() {
    }

    /* renamed from: a */
    public static void m39845a() {
        m39844a((C0286f) C11751d.m40c());
    }

    /* renamed from: a */
    public static void m39844a(C0286f c0286f) {
        AbstractC0686k n = c0286f.n();
        if (n != null) {
            n.mo38506a(new C0677b("Setting up default configuration.", c0286f));
        }
        C0268d c0268d = new C0268d();
        c0268d.a((AbstractC0427f) c0286f);
        c0268d.b_("logcat");
        C0282a c0282a = new C0282a();
        c0282a.a((AbstractC0427f) c0286f);
        c0282a.a("%msg");
        c0282a.mo38474j();
        c0268d.m39842a(c0282a);
        c0268d.mo38474j();
        c0286f.mo126e(AbstractC11747c.f37061c).mo38569a(c0268d);
    }
}
