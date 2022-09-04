package com.google.android.gms.internal;
/* loaded from: classes2.dex */
public final class amk {

    /* renamed from: a */
    private static amk f22282a;

    /* renamed from: b */
    private final amg f22283b = new amg();

    /* renamed from: c */
    private final amh f22284c = new amh();

    static {
        m16792a(new amk());
    }

    private amk() {
    }

    /* renamed from: a */
    public static amg m16793a() {
        return m16790c().f22283b;
    }

    /* renamed from: a */
    protected static void m16792a(amk amkVar) {
        synchronized (amk.class) {
            f22282a = amkVar;
        }
    }

    /* renamed from: b */
    public static amh m16791b() {
        return m16790c().f22284c;
    }

    /* renamed from: c */
    private static amk m16790c() {
        amk amkVar;
        synchronized (amk.class) {
            amkVar = f22282a;
        }
        return amkVar;
    }
}
