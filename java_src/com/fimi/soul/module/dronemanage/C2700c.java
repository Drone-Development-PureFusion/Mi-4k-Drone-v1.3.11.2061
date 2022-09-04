package com.fimi.soul.module.dronemanage;
/* renamed from: com.fimi.soul.module.dronemanage.c */
/* loaded from: classes.dex */
public class C2700c {

    /* renamed from: a */
    private static C2700c f9255a = null;

    /* renamed from: b */
    private EnumC2701a f9256b = EnumC2701a.NONEXECUTE;

    /* renamed from: com.fimi.soul.module.dronemanage.c$a */
    /* loaded from: classes.dex */
    public enum EnumC2701a {
        EXECUTE,
        NONEXECUTE
    }

    private C2700c() {
    }

    /* renamed from: a */
    public static C2700c m30580a() {
        if (f9255a == null) {
            f9255a = new C2700c();
        }
        return f9255a;
    }

    /* renamed from: a */
    public void m30579a(EnumC2701a enumC2701a) {
        this.f9256b = enumC2701a;
    }

    /* renamed from: b */
    public EnumC2701a m30578b() {
        return this.f9256b;
    }
}
