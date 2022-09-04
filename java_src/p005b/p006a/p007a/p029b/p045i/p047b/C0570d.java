package p005b.p006a.p007a.p029b.p045i.p047b;
/* renamed from: b.a.a.b.i.b.d */
/* loaded from: classes.dex */
public class C0570d {

    /* renamed from: c */
    static final int f950c = 0;

    /* renamed from: d */
    static final int f951d = 1;

    /* renamed from: e */
    static final int f952e = 2;

    /* renamed from: f */
    final int f953f;

    /* renamed from: g */
    final Object f954g;

    /* renamed from: h */
    C0570d f955h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0570d(int i) {
        this(i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0570d(int i, Object obj) {
        this.f953f = i;
        this.f954g = obj;
    }

    /* renamed from: b */
    public void m38850b(C0570d c0570d) {
        this.f955h = c0570d;
    }

    /* renamed from: c */
    public int m38849c() {
        return this.f953f;
    }

    /* renamed from: d */
    public Object m38848d() {
        return this.f954g;
    }

    /* renamed from: e */
    public C0570d m38847e() {
        return this.f955h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0570d)) {
            return false;
        }
        C0570d c0570d = (C0570d) obj;
        if (this.f953f == c0570d.f953f && (this.f954g == null ? c0570d.f954g == null : this.f954g.equals(c0570d.f954g))) {
            if (this.f955h != null) {
                if (this.f955h.equals(c0570d.f955h)) {
                    return true;
                }
            } else if (c0570d.f955h == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m38846f() {
        return this.f955h != null ? " -> " + this.f955h : "";
    }

    public int hashCode() {
        return (this.f954g != null ? this.f954g.hashCode() : 0) + (this.f953f * 31);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f953f) {
            case 0:
                stringBuffer.append("LITERAL(" + this.f954g + ")");
                break;
            default:
                stringBuffer.append(super.toString());
                break;
        }
        stringBuffer.append(m38846f());
        return stringBuffer.toString();
    }
}
