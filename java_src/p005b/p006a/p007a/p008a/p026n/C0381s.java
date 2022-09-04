package p005b.p006a.p007a.p008a.p026n;

import java.io.Serializable;
import java.util.Arrays;
/* renamed from: b.a.a.a.n.s */
/* loaded from: classes.dex */
public class C0381s implements AbstractC0367e, Serializable {
    private static final long serialVersionUID = -773438177285807139L;

    /* renamed from: a */
    private String f423a;

    /* renamed from: b */
    private String f424b;

    /* renamed from: c */
    private int f425c;

    /* renamed from: d */
    private C0378p[] f426d;

    /* renamed from: e */
    private AbstractC0367e f427e;

    /* renamed from: f */
    private AbstractC0367e[] f428f;

    /* renamed from: a */
    public static C0381s m39489a(AbstractC0367e abstractC0367e) {
        if (abstractC0367e == null) {
            return null;
        }
        C0381s c0381s = new C0381s();
        c0381s.f423a = abstractC0367e.mo39488b();
        c0381s.f424b = abstractC0367e.mo39490a();
        c0381s.f425c = abstractC0367e.mo39486d();
        c0381s.f426d = abstractC0367e.mo39487c();
        AbstractC0367e mo39485e = abstractC0367e.mo39485e();
        if (mo39485e != null) {
            c0381s.f427e = m39489a(mo39485e);
        }
        AbstractC0367e[] mo39484f = abstractC0367e.mo39484f();
        if (mo39484f != null) {
            c0381s.f428f = new AbstractC0367e[mo39484f.length];
            for (int i = 0; i < mo39484f.length; i++) {
                c0381s.f428f[i] = m39489a(mo39484f[i]);
            }
        }
        return c0381s;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: a */
    public String mo39490a() {
        return this.f424b;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: b */
    public String mo39488b() {
        return this.f423a;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: c */
    public C0378p[] mo39487c() {
        return this.f426d;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: d */
    public int mo39486d() {
        return this.f425c;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: e */
    public AbstractC0367e mo39485e() {
        return this.f427e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0381s c0381s = (C0381s) obj;
            if (this.f423a == null) {
                if (c0381s.f423a != null) {
                    return false;
                }
            } else if (!this.f423a.equals(c0381s.f423a)) {
                return false;
            }
            if (Arrays.equals(this.f426d, c0381s.f426d) && Arrays.equals(this.f428f, c0381s.f428f)) {
                return this.f427e == null ? c0381s.f427e == null : this.f427e.equals(c0381s.f427e);
            }
            return false;
        }
        return false;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: f */
    public AbstractC0367e[] mo39484f() {
        return this.f428f;
    }

    public int hashCode() {
        return (this.f423a == null ? 0 : this.f423a.hashCode()) + 31;
    }
}
