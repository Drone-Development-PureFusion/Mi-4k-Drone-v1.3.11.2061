package p005b.p006a.p007a.p029b.p036g.p040d;
/* renamed from: b.a.a.b.g.d.j */
/* loaded from: classes.dex */
public class C0478j {

    /* renamed from: a */
    final Class<?> f647a;

    /* renamed from: b */
    final String f648b;

    public C0478j(Class<?> cls, String str) {
        this.f647a = cls;
        this.f648b = str;
    }

    /* renamed from: a */
    public Class<?> m39205a() {
        return this.f647a;
    }

    /* renamed from: b */
    public String m39204b() {
        return this.f648b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0478j c0478j = (C0478j) obj;
            if (this.f647a == null) {
                if (c0478j.f647a != null) {
                    return false;
                }
            } else if (!this.f647a.equals(c0478j.f647a)) {
                return false;
            }
            return this.f648b == null ? c0478j.f648b == null : this.f648b.equals(c0478j.f648b);
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f647a == null ? 0 : this.f647a.hashCode()) + 31) * 31;
        if (this.f648b != null) {
            i = this.f648b.hashCode();
        }
        return hashCode + i;
    }
}
