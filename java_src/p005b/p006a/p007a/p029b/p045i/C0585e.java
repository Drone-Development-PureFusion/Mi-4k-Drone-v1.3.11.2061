package p005b.p006a.p007a.p029b.p045i;
/* renamed from: b.a.a.b.i.e */
/* loaded from: classes.dex */
public class C0585e {

    /* renamed from: a */
    private int f1005a;

    /* renamed from: b */
    private int f1006b;

    /* renamed from: c */
    private boolean f1007c;

    /* renamed from: d */
    private boolean f1008d;

    public C0585e() {
        this.f1005a = Integer.MIN_VALUE;
        this.f1006b = Integer.MAX_VALUE;
        this.f1007c = true;
        this.f1008d = true;
    }

    public C0585e(int i, int i2) {
        this.f1005a = Integer.MIN_VALUE;
        this.f1006b = Integer.MAX_VALUE;
        this.f1007c = true;
        this.f1008d = true;
        this.f1005a = i;
        this.f1006b = i2;
    }

    public C0585e(int i, int i2, boolean z, boolean z2) {
        this.f1005a = Integer.MIN_VALUE;
        this.f1006b = Integer.MAX_VALUE;
        this.f1007c = true;
        this.f1008d = true;
        this.f1005a = i;
        this.f1006b = i2;
        this.f1007c = z;
        this.f1008d = z2;
    }

    /* renamed from: a */
    public static C0585e m38806a(String str) {
        if (str == null) {
            throw new NullPointerException("Argument cannot be null");
        }
        C0585e c0585e = new C0585e();
        int indexOf = str.indexOf(46);
        String str2 = null;
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            if (indexOf + 1 == str.length()) {
                throw new IllegalArgumentException("Formatting string [" + str + "] should not end with '.'");
            }
            str2 = str.substring(indexOf + 1);
            str = substring;
        }
        if (str != null && str.length() > 0) {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                c0585e.f1005a = parseInt;
            } else {
                c0585e.f1005a = -parseInt;
                c0585e.f1007c = false;
            }
        }
        if (str2 != null && str2.length() > 0) {
            int parseInt2 = Integer.parseInt(str2);
            if (parseInt2 >= 0) {
                c0585e.f1006b = parseInt2;
            } else {
                c0585e.f1006b = -parseInt2;
                c0585e.f1008d = false;
            }
        }
        return c0585e;
    }

    /* renamed from: a */
    public void m38807a(int i) {
        this.f1006b = i;
    }

    /* renamed from: a */
    public void m38805a(boolean z) {
        this.f1007c = z;
    }

    /* renamed from: a */
    public boolean m38808a() {
        return this.f1007c;
    }

    /* renamed from: b */
    public int m38804b() {
        return this.f1006b;
    }

    /* renamed from: b */
    public void m38803b(int i) {
        this.f1005a = i;
    }

    /* renamed from: b */
    public void m38802b(boolean z) {
        this.f1008d = z;
    }

    /* renamed from: c */
    public int m38801c() {
        return this.f1005a;
    }

    /* renamed from: d */
    public boolean m38800d() {
        return this.f1008d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0585e)) {
            return false;
        }
        C0585e c0585e = (C0585e) obj;
        return this.f1005a == c0585e.f1005a && this.f1006b == c0585e.f1006b && this.f1007c == c0585e.f1007c && this.f1008d == c0585e.f1008d;
    }

    public int hashCode() {
        int i = 1;
        int i2 = ((this.f1007c ? 1 : 0) + (((this.f1005a * 31) + this.f1006b) * 31)) * 31;
        if (!this.f1008d) {
            i = 0;
        }
        return i2 + i;
    }

    public String toString() {
        return "FormatInfo(" + this.f1005a + ", " + this.f1006b + ", " + this.f1007c + ", " + this.f1008d + ")";
    }
}
