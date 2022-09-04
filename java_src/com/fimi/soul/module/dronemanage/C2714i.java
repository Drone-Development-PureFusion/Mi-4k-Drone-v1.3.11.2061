package com.fimi.soul.module.dronemanage;

import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.fimi.soul.module.dronemanage.i */
/* loaded from: classes.dex */
public class C2714i {

    /* renamed from: a */
    public static final int f9313a = 0;

    /* renamed from: b */
    public static final int f9314b = 1;

    /* renamed from: c */
    public static final int f9315c = 2;

    /* renamed from: d */
    public static final int f9316d = 3;

    /* renamed from: e */
    public static final int f9317e = 4;

    /* renamed from: f */
    public static final int f9318f = 5;

    /* renamed from: g */
    public static final int f9319g = 6;

    /* renamed from: h */
    public static final int f9320h = 7;

    /* renamed from: i */
    private static AtomicInteger f9321i = new AtomicInteger(0);

    /* renamed from: a */
    public static final int m30537a() {
        return f9321i.get();
    }

    /* renamed from: a */
    public static final void m30536a(Integer num) {
        f9321i.set(num.intValue());
    }
}
