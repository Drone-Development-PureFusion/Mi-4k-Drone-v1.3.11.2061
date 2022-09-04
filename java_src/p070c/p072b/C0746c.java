package p070c.p072b;
/* renamed from: c.b.c */
/* loaded from: classes.dex */
public class C0746c {

    /* renamed from: a */
    private static final String f1391a = "...";

    /* renamed from: b */
    private static final String f1392b = "]";

    /* renamed from: c */
    private static final String f1393c = "[";

    /* renamed from: d */
    private int f1394d;

    /* renamed from: e */
    private String f1395e;

    /* renamed from: f */
    private String f1396f;

    /* renamed from: g */
    private int f1397g;

    /* renamed from: h */
    private int f1398h;

    public C0746c(int i, String str, String str2) {
        this.f1394d = i;
        this.f1395e = str;
        this.f1396f = str2;
    }

    /* renamed from: a */
    private void m38252a() {
        this.f1397g = 0;
        int min = Math.min(this.f1395e.length(), this.f1396f.length());
        while (this.f1397g < min && this.f1395e.charAt(this.f1397g) == this.f1396f.charAt(this.f1397g)) {
            this.f1397g++;
        }
    }

    /* renamed from: b */
    private String m38249b(String str) {
        String str2 = f1393c + str.substring(this.f1397g, (str.length() - this.f1398h) + 1) + f1392b;
        if (this.f1397g > 0) {
            str2 = m38248c() + str2;
        }
        return this.f1398h > 0 ? str2 + m38247d() : str2;
    }

    /* renamed from: b */
    private void m38250b() {
        int length = this.f1395e.length() - 1;
        int length2 = this.f1396f.length() - 1;
        while (length2 >= this.f1397g && length >= this.f1397g && this.f1395e.charAt(length) == this.f1396f.charAt(length2)) {
            length2--;
            length--;
        }
        this.f1398h = this.f1395e.length() - length;
    }

    /* renamed from: c */
    private String m38248c() {
        return (this.f1397g > this.f1394d ? f1391a : "") + this.f1395e.substring(Math.max(0, this.f1397g - this.f1394d), this.f1397g);
    }

    /* renamed from: d */
    private String m38247d() {
        return this.f1395e.substring((this.f1395e.length() - this.f1398h) + 1, Math.min((this.f1395e.length() - this.f1398h) + 1 + this.f1394d, this.f1395e.length())) + ((this.f1395e.length() - this.f1398h) + 1 < this.f1395e.length() - this.f1394d ? f1391a : "");
    }

    /* renamed from: e */
    private boolean m38246e() {
        return this.f1395e.equals(this.f1396f);
    }

    /* renamed from: a */
    public String m38251a(String str) {
        if (this.f1395e == null || this.f1396f == null || m38246e()) {
            return C0744a.m38254f(str, this.f1395e, this.f1396f);
        }
        m38252a();
        m38250b();
        return C0744a.m38254f(str, m38249b(this.f1395e), m38249b(this.f1396f));
    }
}
