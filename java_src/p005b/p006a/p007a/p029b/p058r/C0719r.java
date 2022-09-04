package p005b.p006a.p007a.p029b.p058r;
/* renamed from: b.a.a.b.r.r */
/* loaded from: classes.dex */
public class C0719r {

    /* renamed from: a */
    private static final int f1309a = 65535;

    /* renamed from: e */
    private static final long f1310e = 100;

    /* renamed from: b */
    private volatile long f1311b = 15;

    /* renamed from: c */
    private volatile long f1312c = System.currentTimeMillis();

    /* renamed from: d */
    private long f1313d = 0;

    /* renamed from: f */
    private final long f1314f = 800;

    /* renamed from: a */
    public void m38401a(long j) {
        long j2 = j - this.f1312c;
        this.f1312c = j;
        if (j2 < f1310e && this.f1311b < 65535) {
            this.f1311b = (this.f1311b << 1) | 1;
        } else if (j2 <= 800) {
        } else {
            this.f1311b >>>= 2;
        }
    }

    /* renamed from: a */
    public boolean m38402a() {
        long j = this.f1313d;
        this.f1313d = 1 + j;
        return (j & this.f1311b) != this.f1311b;
    }
}
