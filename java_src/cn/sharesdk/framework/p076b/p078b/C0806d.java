package cn.sharesdk.framework.p076b.p078b;
/* renamed from: cn.sharesdk.framework.b.b.d */
/* loaded from: classes.dex */
public class C0806d extends AbstractC0805c {

    /* renamed from: d */
    private static int f1565d;

    /* renamed from: n */
    private static long f1566n;

    /* renamed from: a */
    public String f1567a;

    /* renamed from: b */
    public int f1568b;

    /* renamed from: c */
    public String f1569c = "";

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected String mo37912a() {
        return "[EVT]";
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected void mo37911a(long j) {
        f1566n = j;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: b */
    protected int mo37909b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: c */
    protected int mo37907c() {
        return 30;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: d */
    protected long mo37906d() {
        return f1565d;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: e */
    protected long mo37905e() {
        return f1566n;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: f */
    protected void mo37904f() {
        f1565d++;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1567a);
        sb.append('|').append(this.f1568b);
        sb.append('|').append(this.f1569c);
        return sb.toString();
    }
}
