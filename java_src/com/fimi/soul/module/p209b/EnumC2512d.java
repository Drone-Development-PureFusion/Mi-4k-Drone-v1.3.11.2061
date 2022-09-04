package com.fimi.soul.module.p209b;

import com.fimi.soul.module.p209b.p210a.p211a.C2478a;
/* renamed from: com.fimi.soul.module.b.d */
/* loaded from: classes.dex */
public enum EnumC2512d {
    CLASSIC(0, new C2478a());
    

    /* renamed from: b */
    private final int f8167b;

    /* renamed from: c */
    private final AbstractC2513e f8168c;

    EnumC2512d(int i, AbstractC2513e abstractC2513e) {
        this.f8167b = i;
        this.f8168c = abstractC2513e;
    }

    /* renamed from: a */
    public static EnumC2512d m31423a(int i) {
        EnumC2512d[] values;
        for (EnumC2512d enumC2512d : values()) {
            if (enumC2512d.f8167b == i) {
                return enumC2512d;
            }
        }
        return CLASSIC;
    }

    /* renamed from: a */
    public int m31424a() {
        return this.f8167b;
    }

    /* renamed from: b */
    public AbstractC2513e m31422b() {
        return this.f8168c;
    }
}
