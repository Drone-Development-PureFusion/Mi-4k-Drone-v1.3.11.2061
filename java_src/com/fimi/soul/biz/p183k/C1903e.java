package com.fimi.soul.biz.p183k;
/* renamed from: com.fimi.soul.biz.k.e */
/* loaded from: classes.dex */
public class C1903e {

    /* renamed from: a */
    public static C1903e f5248a;

    /* renamed from: d */
    private static EnumC1904a f5249d = EnumC1904a.IDEL;

    /* renamed from: b */
    private double f5250b;

    /* renamed from: c */
    private double f5251c;

    /* renamed from: com.fimi.soul.biz.k.e$a */
    /* loaded from: classes.dex */
    public enum EnumC1904a {
        IDEL,
        SENDDATA,
        QUERY,
        OUTTIME,
        COMPLETE,
        ERROR,
        WAIT,
        SAMEVERSION,
        HANDSHAKE,
        SENDPAGE
    }

    private C1903e() {
    }

    /* renamed from: a */
    public static C1903e m33631a() {
        if (f5248a == null) {
            synchronized (C1903e.class) {
                if (f5248a == null) {
                    f5248a = new C1903e();
                }
            }
        }
        return f5248a;
    }

    /* renamed from: a */
    public void m33630a(double d) {
        this.f5250b = d;
    }

    /* renamed from: a */
    public void m33629a(EnumC1904a enumC1904a) {
        f5249d = enumC1904a;
    }

    /* renamed from: b */
    public EnumC1904a m33628b() {
        return f5249d;
    }

    /* renamed from: b */
    public void m33627b(double d) {
        this.f5251c = d;
    }

    /* renamed from: c */
    public double m33626c() {
        return this.f5250b;
    }

    /* renamed from: d */
    public double m33625d() {
        return this.f5251c;
    }
}
