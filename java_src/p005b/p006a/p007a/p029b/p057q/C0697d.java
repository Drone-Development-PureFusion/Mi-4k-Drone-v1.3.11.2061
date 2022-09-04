package p005b.p006a.p007a.p029b.p057q;

import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.b.q.d */
/* loaded from: classes.dex */
public class C0697d {

    /* renamed from: a */
    public static final C0697d f1250a = new C0697d(EnumC0698a.START, null);

    /* renamed from: b */
    public static final C0697d f1251b = new C0697d(EnumC0698a.CURLY_LEFT, null);

    /* renamed from: c */
    public static final C0697d f1252c = new C0697d(EnumC0698a.CURLY_RIGHT, null);

    /* renamed from: d */
    public static final C0697d f1253d = new C0697d(EnumC0698a.DEFAULT, null);

    /* renamed from: e */
    EnumC0698a f1254e;

    /* renamed from: f */
    String f1255f;

    /* renamed from: b.a.a.b.q.d$a */
    /* loaded from: classes.dex */
    public enum EnumC0698a {
        LITERAL,
        START,
        CURLY_LEFT,
        CURLY_RIGHT,
        DEFAULT
    }

    public C0697d(EnumC0698a enumC0698a, String str) {
        this.f1254e = enumC0698a;
        this.f1255f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0697d c0697d = (C0697d) obj;
        if (this.f1254e != c0697d.f1254e) {
            return false;
        }
        if (this.f1255f != null) {
            if (this.f1255f.equals(c0697d.f1255f)) {
                return true;
            }
        } else if (c0697d.f1255f == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f1254e != null ? this.f1254e.hashCode() : 0) * 31;
        if (this.f1255f != null) {
            i = this.f1255f.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = "Token{type=" + this.f1254e;
        if (this.f1255f != null) {
            str = str + ", payload='" + this.f1255f + C0494h.f738z;
        }
        return str + C0494h.f735w;
    }
}
