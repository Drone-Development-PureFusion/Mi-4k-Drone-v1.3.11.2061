package p005b.p006a.p007a.p029b.p036g.p040d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: b.a.a.b.g.d.g */
/* loaded from: classes.dex */
public class C0475g {

    /* renamed from: a */
    ArrayList<String> f643a = new ArrayList<>();

    public C0475g() {
    }

    public C0475g(String str) {
        String[] split;
        if (str == null || (split = str.split("/")) == null) {
            return;
        }
        for (String str2 : split) {
            if (str2.length() > 0) {
                this.f643a.add(str2);
            }
        }
    }

    public C0475g(List<String> list) {
        this.f643a.addAll(list);
    }

    /* renamed from: a */
    private boolean m39219a(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: a */
    public C0475g m39222a() {
        C0475g c0475g = new C0475g();
        c0475g.f643a.addAll(this.f643a);
        return c0475g;
    }

    /* renamed from: a */
    public String m39221a(int i) {
        return this.f643a.get(i);
    }

    /* renamed from: a */
    public void m39220a(String str) {
        this.f643a.add(str);
    }

    /* renamed from: b */
    public List<String> m39218b() {
        return new ArrayList(this.f643a);
    }

    /* renamed from: c */
    public void m39217c() {
        if (!this.f643a.isEmpty()) {
            this.f643a.remove(this.f643a.size() - 1);
        }
    }

    /* renamed from: d */
    public String m39216d() {
        if (!this.f643a.isEmpty()) {
            return this.f643a.get(this.f643a.size() - 1);
        }
        return null;
    }

    /* renamed from: e */
    public int m39215e() {
        return this.f643a.size();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0475g)) {
            return false;
        }
        C0475g c0475g = (C0475g) obj;
        if (c0475g.m39215e() != m39215e()) {
            return false;
        }
        int m39215e = m39215e();
        for (int i = 0; i < m39215e; i++) {
            if (!m39219a(m39221a(i), c0475g.m39221a(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public String m39214f() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = this.f643a.iterator();
        while (it2.hasNext()) {
            sb.append("[").append(it2.next()).append("]");
        }
        return sb.toString();
    }

    public String toString() {
        return m39214f();
    }
}
