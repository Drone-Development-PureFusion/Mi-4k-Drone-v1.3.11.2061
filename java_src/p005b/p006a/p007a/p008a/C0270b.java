package p005b.p006a.p007a.p008a;

import org.p356d.AbstractC11747c;
import org.p356d.C11751d;
import p005b.p006a.p007a.p008a.p013d.C0282a;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0422e;
import p005b.p006a.p007a.p029b.p032c.AbstractC0412c;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0677b;
@Deprecated
/* renamed from: b.a.a.a.b */
/* loaded from: classes.dex */
public class C0270b {

    /* renamed from: a */
    static final C0270b f161a = new C0270b();

    private C0270b() {
    }

    /* renamed from: a */
    public static void m39822a() {
        m39821a((C0286f) C11751d.m40c());
    }

    /* renamed from: a */
    public static void m39821a(C0286f c0286f) {
        AbstractC0686k n = c0286f.n();
        if (n != null) {
            n.mo38506a(new C0677b("Setting up default configuration.", c0286f));
        }
        C0422e c0422e = new C0422e();
        c0422e.a((AbstractC0427f) c0286f);
        c0422e.b_("console");
        C0282a c0282a = new C0282a();
        c0282a.a((AbstractC0427f) c0286f);
        c0282a.a("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
        c0282a.mo38474j();
        c0422e.a((AbstractC0412c) c0282a);
        c0422e.mo38474j();
        c0286f.mo126e(AbstractC11747c.f37061c).mo38569a(c0422e);
    }
}
