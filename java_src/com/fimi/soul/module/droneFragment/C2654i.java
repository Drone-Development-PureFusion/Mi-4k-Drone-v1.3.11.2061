package com.fimi.soul.module.droneFragment;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.fimi.soul.module.droneFragment.i */
/* loaded from: classes.dex */
public class C2654i {

    /* renamed from: a */
    public static int f8924a = 0;

    /* renamed from: b */
    public static int f8925b = 1;

    /* renamed from: c */
    private static AtomicInteger f8926c = new AtomicInteger(f8924a);

    /* renamed from: d */
    private static AtomicInteger f8927d = new AtomicInteger(f8924a);

    /* renamed from: e */
    private static AtomicInteger f8928e = new AtomicInteger(f8924a);

    /* renamed from: f */
    private static AtomicBoolean f8929f = new AtomicBoolean(true);

    /* renamed from: a */
    public static AtomicInteger m30861a() {
        return f8926c;
    }

    /* renamed from: a */
    public static void m30860a(int i) {
        f8928e.set(i);
    }

    /* renamed from: a */
    public static void m30859a(boolean z) {
        f8929f.set(z);
    }

    /* renamed from: b */
    public static AtomicInteger m30858b() {
        return f8927d;
    }

    /* renamed from: b */
    public static void m30857b(int i) {
        f8927d.set(i);
    }

    /* renamed from: c */
    public static AtomicInteger m30856c() {
        return f8928e;
    }

    /* renamed from: c */
    public static void m30855c(int i) {
        f8926c.set(i);
    }

    /* renamed from: d */
    public static AtomicBoolean m30854d() {
        return f8929f;
    }
}
