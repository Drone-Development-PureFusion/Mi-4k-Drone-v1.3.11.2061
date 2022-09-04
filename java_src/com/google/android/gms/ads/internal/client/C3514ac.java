package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.C3759f;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.internal.C7851vj;
import com.google.android.gms.internal.C8065yp;
import com.google.android.gms.internal.C8100zf;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.ac */
/* loaded from: classes.dex */
public class C3514ac {

    /* renamed from: a */
    private static final Object f13933a = new Object();

    /* renamed from: b */
    private static C3514ac f13934b;

    /* renamed from: c */
    private final C3780a f13935c = new C3780a();

    /* renamed from: d */
    private final C3503ab f13936d = new C3503ab(new C3583v(), new C3582u(), new C3566j(), new C7851vj(), new C3759f(), new C8100zf(), new C8065yp());

    static {
        m27585a(new C3514ac());
    }

    protected C3514ac() {
    }

    /* renamed from: a */
    public static C3780a m27586a() {
        return m27583c().f13935c;
    }

    /* renamed from: a */
    protected static void m27585a(C3514ac c3514ac) {
        synchronized (f13933a) {
            f13934b = c3514ac;
        }
    }

    /* renamed from: b */
    public static C3503ab m27584b() {
        return m27583c().f13936d;
    }

    /* renamed from: c */
    private static C3514ac m27583c() {
        C3514ac c3514ac;
        synchronized (f13933a) {
            c3514ac = f13934b;
        }
        return c3514ac;
    }
}
