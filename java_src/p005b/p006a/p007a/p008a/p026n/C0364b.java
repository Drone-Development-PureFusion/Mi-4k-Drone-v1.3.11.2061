package p005b.p006a.p007a.p008a.p026n;

import java.io.Serializable;
/* renamed from: b.a.a.a.n.b */
/* loaded from: classes.dex */
public class C0364b implements Serializable {
    private static final long serialVersionUID = -804643281218337001L;

    /* renamed from: a */
    final String f366a;

    /* renamed from: b */
    final String f367b;

    /* renamed from: c */
    private final boolean f368c;

    public C0364b(String str, String str2) {
        this.f366a = str;
        this.f367b = str2;
        this.f368c = true;
    }

    public C0364b(String str, String str2, boolean z) {
        this.f366a = str;
        this.f367b = str2;
        this.f368c = z;
    }

    /* renamed from: a */
    public String m39574a() {
        return this.f366a;
    }

    /* renamed from: b */
    public String m39573b() {
        return this.f367b;
    }

    /* renamed from: c */
    public boolean m39572c() {
        return this.f368c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0364b c0364b = (C0364b) obj;
            if (this.f366a == null) {
                if (c0364b.f366a != null) {
                    return false;
                }
            } else if (!this.f366a.equals(c0364b.f366a)) {
                return false;
            }
            if (this.f368c != c0364b.f368c) {
                return false;
            }
            return this.f367b == null ? c0364b.f367b == null : this.f367b.equals(c0364b.f367b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f366a == null ? 0 : this.f366a.hashCode()) + 31;
    }
}
