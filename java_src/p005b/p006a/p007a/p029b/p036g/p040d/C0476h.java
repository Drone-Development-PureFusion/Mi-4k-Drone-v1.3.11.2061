package p005b.p006a.p007a.p029b.p036g.p040d;

import java.util.List;
/* renamed from: b.a.a.b.g.d.h */
/* loaded from: classes.dex */
public class C0476h extends C0475g {
    public C0476h() {
    }

    public C0476h(String str) {
        super(str);
    }

    public C0476h(List<String> list) {
        super(list);
    }

    /* renamed from: a */
    private boolean m39212a(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: a */
    public boolean m39213a(C0475g c0475g) {
        if (c0475g.m39215e() != e()) {
            return false;
        }
        int e = e();
        for (int i = 0; i < e; i++) {
            if (!m39212a(a(i), c0475g.m39221a(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public int m39211b(C0475g c0475g) {
        if (c0475g == null) {
            return 0;
        }
        int size = this.f643a.size();
        int size2 = c0475g.f643a.size();
        if (size == 0 || size2 == 0) {
            return 0;
        }
        int i = size <= size2 ? size : size2;
        int i2 = 0;
        for (int i3 = 1; i3 <= i && m39212a(this.f643a.get(size - i3), c0475g.f643a.get(size2 - i3)); i3++) {
            i2++;
        }
        return i2;
    }

    /* renamed from: c */
    public boolean m39210c(C0475g c0475g) {
        if (c0475g == null) {
            return false;
        }
        return c0475g.m39214f().contains(f());
    }

    /* renamed from: d */
    public int m39209d(C0475g c0475g) {
        int i = 0;
        if (c0475g == null) {
            return 0;
        }
        int size = this.f643a.size();
        int size2 = c0475g.f643a.size();
        if (size == 0 || size2 == 0) {
            return 0;
        }
        int i2 = size <= size2 ? size : size2;
        int i3 = 0;
        while (i3 < i2 && m39212a(this.f643a.get(i3), c0475g.f643a.get(i3))) {
            i3++;
            i++;
        }
        return i;
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p040d.C0475g
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0476h)) {
            return false;
        }
        C0476h c0476h = (C0476h) obj;
        if (c0476h.e() != e()) {
            return false;
        }
        int e = e();
        for (int i = 0; i < e; i++) {
            if (!m39212a(a(i), c0476h.a(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int e = e();
        int i = 0;
        for (int i2 = 0; i2 < e; i2++) {
            i ^= a(i2).toLowerCase().hashCode();
        }
        return i;
    }
}
