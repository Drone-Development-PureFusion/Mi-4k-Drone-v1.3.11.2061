package cn.sharesdk.framework.p076b.p078b;

import android.content.Context;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: cn.sharesdk.framework.b.b.c */
/* loaded from: classes.dex */
public abstract class AbstractC0805c {

    /* renamed from: e */
    public long f1556e;

    /* renamed from: f */
    public String f1557f;

    /* renamed from: g */
    public String f1558g;

    /* renamed from: h */
    public String f1559h;

    /* renamed from: i */
    public int f1560i;

    /* renamed from: j */
    public String f1561j;

    /* renamed from: k */
    public int f1562k;

    /* renamed from: l */
    public String f1563l;

    /* renamed from: m */
    public String f1564m;

    /* renamed from: a */
    protected abstract String mo37912a();

    /* renamed from: a */
    protected abstract void mo37911a(long j);

    /* renamed from: a */
    public boolean mo37910a(Context context) {
        int mo37909b = mo37909b();
        int mo37907c = mo37907c();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - mo37905e() < mo37909b) {
            return mo37906d() < ((long) mo37907c);
        }
        mo37911a(currentTimeMillis);
        return true;
    }

    /* renamed from: b */
    protected abstract int mo37909b();

    /* renamed from: b */
    public void mo37908b(Context context) {
        mo37904f();
    }

    /* renamed from: c */
    protected abstract int mo37907c();

    /* renamed from: d */
    protected abstract long mo37906d();

    /* renamed from: e */
    protected abstract long mo37905e();

    /* renamed from: f */
    protected abstract void mo37904f();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37912a()).append(C0494h.f680A);
        sb.append(this.f1556e).append('|');
        sb.append(this.f1557f).append('|');
        sb.append(this.f1558g).append('|');
        sb.append(this.f1559h).append('|');
        sb.append(this.f1560i).append('|');
        sb.append(this.f1561j).append('|');
        sb.append(this.f1562k).append('|');
        sb.append(this.f1563l);
        return sb.toString();
    }
}
