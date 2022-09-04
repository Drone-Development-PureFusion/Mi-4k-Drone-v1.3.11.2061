package com.xiaomi.mistatistic.sdk.controller;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.ab */
/* loaded from: classes2.dex */
public class C10515ab {

    /* renamed from: a */
    private static C10515ab f32657a = null;

    /* renamed from: b */
    private int f32658b = 3;

    /* renamed from: c */
    private long f32659c;

    /* renamed from: d */
    private long f32660d;

    private C10515ab() {
    }

    /* renamed from: a */
    public static synchronized C10515ab m4869a() {
        C10515ab c10515ab;
        synchronized (C10515ab.class) {
            if (f32657a == null) {
                f32657a = new C10515ab();
            }
            c10515ab = f32657a;
        }
        return c10515ab;
    }

    /* renamed from: a */
    public void m4868a(int i, long j) {
        C10521b.m4859a().m4856a(new C10517ad(this, i, j));
    }

    /* renamed from: b */
    public void m4864b() {
        C10521b.m4859a().m4856a(new C10516ac(this));
    }

    /* renamed from: c */
    public void m4862c() {
        this.f32660d = System.currentTimeMillis();
        if (this.f32658b == 4) {
            C10521b.m4859a().m4855a(new C10519af(this), this.f32659c);
        }
        C10521b.m4854b().m4856a(new C10520ag(this));
    }

    /* renamed from: d */
    public boolean m4861d() {
        if (C10539t.m4800b()) {
            return false;
        }
        switch (this.f32658b) {
            case 0:
                return true;
            case 1:
                return AbstractC10536q.m4821a(AbstractC10508a.m4880a());
            case 2:
                return new C10528i().m4838d() >= 50;
            case 3:
            default:
                return false;
            case 4:
                return System.currentTimeMillis() - this.f32660d > this.f32659c;
        }
    }

    /* renamed from: e */
    public long m4860e() {
        return this.f32659c;
    }
}
