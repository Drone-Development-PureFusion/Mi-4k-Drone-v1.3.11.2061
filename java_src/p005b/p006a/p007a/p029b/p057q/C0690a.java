package p005b.p006a.p007a.p029b.p057q;

import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.b.q.a */
/* loaded from: classes.dex */
public class C0690a {

    /* renamed from: a */
    EnumC0692a f1235a;

    /* renamed from: b */
    Object f1236b;

    /* renamed from: c */
    Object f1237c;

    /* renamed from: d */
    C0690a f1238d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.b.q.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0692a {
        LITERAL,
        VARIABLE
    }

    public C0690a(EnumC0692a enumC0692a, Object obj) {
        this.f1235a = enumC0692a;
        this.f1236b = obj;
    }

    public C0690a(EnumC0692a enumC0692a, Object obj, Object obj2) {
        this.f1235a = enumC0692a;
        this.f1236b = obj;
        this.f1237c = obj2;
    }

    /* renamed from: a */
    public void m38472a() {
        System.out.print(toString());
        System.out.print(" -> ");
        if (this.f1238d != null) {
            this.f1238d.m38472a();
        } else {
            System.out.print(" null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38471a(C0690a c0690a) {
        if (c0690a == null) {
            return;
        }
        while (this.f1238d != null) {
            this = this.f1238d;
        }
        this.f1238d = c0690a;
    }

    /* renamed from: a */
    void m38470a(C0690a c0690a, StringBuilder sb) {
        while (c0690a != null) {
            sb.append(c0690a.toString()).append(" --> ");
            c0690a = c0690a.f1238d;
        }
        sb.append("null ");
    }

    /* renamed from: b */
    public void m38469b(C0690a c0690a) {
        this.f1238d = c0690a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0690a c0690a = (C0690a) obj;
        if (this.f1235a != c0690a.f1235a) {
            return false;
        }
        if (this.f1236b == null ? c0690a.f1236b != null : !this.f1236b.equals(c0690a.f1236b)) {
            return false;
        }
        if (this.f1237c == null ? c0690a.f1237c != null : !this.f1237c.equals(c0690a.f1237c)) {
            return false;
        }
        if (this.f1238d != null) {
            if (this.f1238d.equals(c0690a.f1238d)) {
                return true;
            }
        } else if (c0690a.f1238d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f1237c != null ? this.f1237c.hashCode() : 0) + (((this.f1236b != null ? this.f1236b.hashCode() : 0) + ((this.f1235a != null ? this.f1235a.hashCode() : 0) * 31)) * 31)) * 31;
        if (this.f1238d != null) {
            i = this.f1238d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        switch (this.f1235a) {
            case LITERAL:
                return "Node{type=" + this.f1235a + ", payload='" + this.f1236b + "'}";
            case VARIABLE:
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                if (this.f1237c != null) {
                    m38470a((C0690a) this.f1237c, sb2);
                }
                m38470a((C0690a) this.f1236b, sb);
                String str = "Node{type=" + this.f1235a + ", payload='" + sb.toString() + "'";
                if (this.f1237c != null) {
                    str = str + ", defaultPart=" + sb2.toString();
                }
                return str + C0494h.f735w;
            default:
                return null;
        }
    }
}
