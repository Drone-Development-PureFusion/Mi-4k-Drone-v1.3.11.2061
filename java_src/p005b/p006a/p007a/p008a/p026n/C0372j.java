package p005b.p006a.p007a.p008a.p026n;

import java.io.Serializable;
import java.util.Map;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.a.n.j */
/* loaded from: classes.dex */
public class C0372j implements Serializable {
    private static final long serialVersionUID = 5488023392483144387L;

    /* renamed from: a */
    final String f369a;

    /* renamed from: b */
    final Map<String, String> f370b;

    /* renamed from: c */
    final long f371c;

    public C0372j(C0286f c0286f) {
        this.f369a = c0286f.p();
        this.f370b = c0286f.o();
        this.f371c = c0286f.q();
    }

    public C0372j(String str, Map<String, String> map, long j) {
        this.f369a = str;
        this.f370b = map;
        this.f371c = j;
    }

    /* renamed from: a */
    public String m39559a() {
        return this.f369a;
    }

    /* renamed from: b */
    public Map<String, String> m39558b() {
        return this.f370b;
    }

    /* renamed from: c */
    public long m39557c() {
        return this.f371c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0372j)) {
            return false;
        }
        C0372j c0372j = (C0372j) obj;
        if (this.f371c != c0372j.f371c) {
            return false;
        }
        if (this.f369a == null ? c0372j.f369a != null : !this.f369a.equals(c0372j.f369a)) {
            return false;
        }
        if (this.f370b != null) {
            if (this.f370b.equals(c0372j.f370b)) {
                return true;
            }
        } else if (c0372j.f370b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f369a != null ? this.f369a.hashCode() : 0) * 31;
        if (this.f370b != null) {
            i = this.f370b.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) (this.f371c ^ (this.f371c >>> 32)));
    }

    public String toString() {
        return "LoggerContextVO{name='" + this.f369a + C0494h.f738z + ", propertyMap=" + this.f370b + ", birthTime=" + this.f371c + C0494h.f735w;
    }
}
