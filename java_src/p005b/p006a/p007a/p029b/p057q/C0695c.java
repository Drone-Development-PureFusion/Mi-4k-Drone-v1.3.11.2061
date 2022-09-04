package p005b.p006a.p007a.p029b.p057q;

import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p055o.C0674r;
import p005b.p006a.p007a.p029b.p057q.C0690a;
import p005b.p006a.p007a.p029b.p057q.C0697d;
/* renamed from: b.a.a.b.q.c */
/* loaded from: classes.dex */
public class C0695c {

    /* renamed from: a */
    final List<C0697d> f1247a;

    /* renamed from: b */
    int f1248b = 0;

    public C0695c(List<C0697d> list) {
        this.f1247a = list;
    }

    /* renamed from: a */
    private C0690a m38454a(String str) {
        return new C0690a(C0690a.EnumC0692a.LITERAL, str);
    }

    /* renamed from: b */
    private boolean m38452b(C0697d c0697d) {
        return c0697d != null && c0697d.f1254e == C0697d.EnumC0698a.DEFAULT;
    }

    /* renamed from: d */
    private C0690a m38450d() {
        C0690a m38448f = m38448f();
        if (m38448f == null) {
            return null;
        }
        C0690a m38449e = m38449e();
        if (m38449e == null) {
            return m38448f;
        }
        m38448f.m38471a(m38449e);
        return m38448f;
    }

    /* renamed from: e */
    private C0690a m38449e() {
        if (m38451c() == null) {
            return null;
        }
        return m38450d();
    }

    /* renamed from: f */
    private C0690a m38448f() {
        C0697d m38451c = m38451c();
        if (m38451c == null) {
            return null;
        }
        switch (m38451c.f1254e) {
            case LITERAL:
                m38453b();
                return m38454a(m38451c.f1255f);
            case CURLY_LEFT:
                m38453b();
                C0690a m38446h = m38446h();
                m38456a(m38451c());
                m38453b();
                C0690a m38454a = m38454a(C0494h.f712af);
                m38454a.m38471a(m38446h);
                m38454a.m38471a(m38454a(C0494h.f713ag));
                return m38454a;
            case START:
                m38453b();
                C0690a m38447g = m38447g();
                m38456a(m38451c());
                m38453b();
                return m38447g;
            default:
                return null;
        }
    }

    /* renamed from: g */
    private C0690a m38447g() {
        C0690a c0690a = new C0690a(C0690a.EnumC0692a.VARIABLE, m38450d());
        if (m38452b(m38451c())) {
            m38453b();
            c0690a.f1237c = m38450d();
        }
        return c0690a;
    }

    /* renamed from: h */
    private C0690a m38446h() {
        C0690a m38450d = m38450d();
        if (m38452b(m38451c())) {
            m38453b();
            m38450d.m38471a(m38454a(C0494h.f682C));
            m38450d.m38471a(m38450d());
        }
        return m38450d;
    }

    /* renamed from: a */
    public C0690a m38457a() {
        return m38450d();
    }

    /* renamed from: a */
    void m38456a(C0697d c0697d) {
        m38455a(c0697d, "}");
        if (c0697d.f1254e != C0697d.EnumC0698a.CURLY_RIGHT) {
            throw new C0674r("Expecting }");
        }
    }

    /* renamed from: a */
    void m38455a(C0697d c0697d, String str) {
        if (c0697d == null) {
            throw new IllegalArgumentException("All tokens consumed but was expecting \"" + str + "\"");
        }
    }

    /* renamed from: b */
    void m38453b() {
        this.f1248b++;
    }

    /* renamed from: c */
    C0697d m38451c() {
        if (this.f1248b < this.f1247a.size()) {
            return this.f1247a.get(this.f1248b);
        }
        return null;
    }
}
