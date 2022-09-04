package org.p328c.p347e;

import org.p328c.p337b.AbstractC11558g;
import org.p328c.p337b.C11562i;
import org.p328c.p337b.C11563j;
import org.p328c.p337b.p341d.C11542e;
import org.p328c.p347e.p349b.C11609b;
import org.p328c.p347e.p349b.C11611c;
import p070c.p072b.AbstractC0753i;
import p070c.p073c.C0763c;
/* renamed from: org.c.e.h */
/* loaded from: classes2.dex */
public class C11629h {

    /* renamed from: a */
    private final C11611c f36770a = new C11611c();

    /* renamed from: a */
    public static C11632j m509a(C11596a c11596a, Class<?>... clsArr) {
        return new C11629h().m502b(c11596a, clsArr);
    }

    /* renamed from: a */
    public static C11632j m505a(Class<?>... clsArr) {
        return m509a(m503b(), clsArr);
    }

    /* renamed from: a */
    public static void m504a(String... strArr) {
        System.exit(new C11629h().m510a(new C11562i(), strArr).m478f() ? 0 : 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C11596a m503b() {
        return new C11596a();
    }

    /* renamed from: a */
    public String m512a() {
        return C0763c.m38119a();
    }

    /* renamed from: a */
    public C11632j m511a(AbstractC0753i abstractC0753i) {
        return m506a(new C11542e(abstractC0753i));
    }

    /* renamed from: a */
    C11632j m510a(AbstractC11558g abstractC11558g, String... strArr) {
        abstractC11558g.mo776a().println("JUnit version " + C0763c.m38119a());
        C11627g m518a = C11627g.m518a(strArr);
        m508a(new C11563j(abstractC11558g));
        return m507a(m518a.m520a(m503b()));
    }

    /* renamed from: a */
    public C11632j m507a(AbstractC11630i abstractC11630i) {
        return m506a(abstractC11630i.mo489a());
    }

    /* renamed from: a */
    public C11632j m506a(AbstractC11637l abstractC11637l) {
        C11632j c11632j = new C11632j();
        C11609b m477g = c11632j.m477g();
        this.f36770a.m557d(m477g);
        try {
            this.f36770a.m564a(abstractC11637l.mo327d());
            abstractC11637l.mo341a(this.f36770a);
            this.f36770a.m563a(c11632j);
            return c11632j;
        } finally {
            m501b(m477g);
        }
    }

    /* renamed from: a */
    public void m508a(C11609b c11609b) {
        this.f36770a.m567a(c11609b);
    }

    /* renamed from: b */
    public C11632j m502b(C11596a c11596a, Class<?>... clsArr) {
        return m507a(AbstractC11630i.m494a(c11596a, clsArr));
    }

    /* renamed from: b */
    public C11632j m500b(Class<?>... clsArr) {
        return m502b(m503b(), clsArr);
    }

    /* renamed from: b */
    public void m501b(C11609b c11609b) {
        this.f36770a.m561b(c11609b);
    }
}
