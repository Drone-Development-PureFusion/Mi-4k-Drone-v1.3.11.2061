package cn.sharesdk.framework.p076b.p078b;

import android.content.Context;
import android.text.TextUtils;
import cn.sharesdk.framework.p076b.p077a.C0801e;
/* renamed from: cn.sharesdk.framework.b.b.e */
/* loaded from: classes.dex */
public class C0807e extends AbstractC0805c {

    /* renamed from: b */
    private static int f1570b;

    /* renamed from: c */
    private static long f1571c;

    /* renamed from: a */
    public long f1572a;

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected String mo37912a() {
        return "[EXT]";
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected void mo37911a(long j) {
        f1571c = j;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    public boolean mo37910a(Context context) {
        C0801e m37936a = C0801e.m37936a(context);
        f1570b = m37936a.m37916g("insertExitEventCount");
        f1571c = m37936a.m37918f("lastInsertExitEventTime");
        return super.mo37910a(context);
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: b */
    protected int mo37909b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: b */
    public void mo37908b(Context context) {
        super.mo37908b(context);
        C0801e m37936a = C0801e.m37936a(context);
        m37936a.m37933a("lastInsertExitEventTime", Long.valueOf(f1571c));
        m37936a.m37934a("insertExitEventCount", f1570b);
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: c */
    protected int mo37907c() {
        return 5;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: d */
    protected long mo37906d() {
        return f1570b;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: e */
    protected long mo37905e() {
        return f1571c;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: f */
    protected void mo37904f() {
        f1570b++;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1564m)) {
            sb.append(this.f1564m);
        }
        sb.append('|').append(Math.round(((float) this.f1572a) / 1000.0f));
        return sb.toString();
    }
}
