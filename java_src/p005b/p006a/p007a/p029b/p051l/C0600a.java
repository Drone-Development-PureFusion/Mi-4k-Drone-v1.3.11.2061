package p005b.p006a.p007a.p029b.p051l;
/* renamed from: b.a.a.b.l.a */
/* loaded from: classes.dex */
public class C0600a {

    /* renamed from: a */
    public static final long f1034a = 20;

    /* renamed from: b */
    static long f1035b = 327680;

    /* renamed from: e */
    private static long f1036e = -1;

    /* renamed from: d */
    private long f1038d = 20;

    /* renamed from: f */
    private long f1039f = f1036e;

    /* renamed from: c */
    long f1037c = System.currentTimeMillis() + m38749c();

    /* renamed from: b */
    private long m38750b() {
        return this.f1039f != f1036e ? this.f1039f : System.currentTimeMillis();
    }

    /* renamed from: c */
    private long m38749c() {
        long j = this.f1038d;
        if (this.f1038d < f1035b) {
            this.f1038d *= 4;
        }
        return j;
    }

    /* renamed from: a */
    void m38751a(long j) {
        this.f1039f = j;
    }

    /* renamed from: a */
    public boolean m38752a() {
        long m38750b = m38750b();
        if (m38750b > this.f1037c) {
            this.f1037c = m38750b + m38749c();
            return false;
        }
        return true;
    }
}
