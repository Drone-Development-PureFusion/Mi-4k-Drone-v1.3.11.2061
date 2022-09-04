package cn.sharesdk.framework.p076b.p078b;
/* renamed from: cn.sharesdk.framework.b.b.a */
/* loaded from: classes.dex */
public class C0803a extends AbstractC0805c {

    /* renamed from: c */
    private static int f1546c;

    /* renamed from: d */
    private static long f1547d;

    /* renamed from: a */
    public int f1548a;

    /* renamed from: b */
    public String f1549b;

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected String mo37912a() {
        return "[API]";
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected void mo37911a(long j) {
        f1547d = j;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: b */
    protected int mo37909b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: c */
    protected int mo37907c() {
        return 50;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: d */
    protected long mo37906d() {
        return f1546c;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: e */
    protected long mo37905e() {
        return f1547d;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: f */
    protected void mo37904f() {
        f1546c++;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1548a);
        sb.append('|').append(this.f1549b);
        return sb.toString();
    }
}
