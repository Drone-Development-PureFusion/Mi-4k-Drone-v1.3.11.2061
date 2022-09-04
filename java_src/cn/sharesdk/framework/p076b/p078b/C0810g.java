package cn.sharesdk.framework.p076b.p078b;

import android.content.Context;
import android.text.TextUtils;
import cn.sharesdk.framework.p076b.p077a.C0801e;
/* renamed from: cn.sharesdk.framework.b.b.g */
/* loaded from: classes.dex */
public class C0810g extends AbstractC0805c {

    /* renamed from: a */
    private static int f1588a;

    /* renamed from: b */
    private static long f1589b;

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected String mo37912a() {
        return "[RUN]";
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    protected void mo37911a(long j) {
        f1589b = j;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: a */
    public boolean mo37910a(Context context) {
        C0801e m37936a = C0801e.m37936a(context);
        f1588a = m37936a.m37916g("insertRunEventCount");
        f1589b = m37936a.m37918f("lastInsertRunEventTime");
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
        m37936a.m37933a("lastInsertRunEventTime", Long.valueOf(f1589b));
        m37936a.m37934a("insertRunEventCount", f1588a);
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: c */
    protected int mo37907c() {
        return 5;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: d */
    protected long mo37906d() {
        return f1588a;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: e */
    protected long mo37905e() {
        return f1589b;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    /* renamed from: f */
    protected void mo37904f() {
        f1588a++;
    }

    @Override // cn.sharesdk.framework.p076b.p078b.AbstractC0805c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1564m)) {
            sb.append(this.f1564m);
        }
        return sb.toString();
    }
}
