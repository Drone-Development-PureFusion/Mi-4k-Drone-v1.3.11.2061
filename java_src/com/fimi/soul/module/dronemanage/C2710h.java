package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p204h.C2283f;
/* renamed from: com.fimi.soul.module.dronemanage.h */
/* loaded from: classes.dex */
public class C2710h {

    /* renamed from: a */
    static C2283f f9301a = null;

    /* renamed from: b */
    static C2083a f9302b = null;

    /* renamed from: c */
    static C2196c f9303c = null;

    /* renamed from: d */
    static int f9304d = 0;

    /* renamed from: e */
    public static final int f9305e = 0;

    /* renamed from: f */
    public static final int f9306f = 1;

    /* renamed from: g */
    static AbstractC2713a f9307g = null;

    /* renamed from: i */
    private static final int f9308i = 1;

    /* renamed from: j */
    private static final int f9309j = 2;

    /* renamed from: h */
    Handler f9310h = new Handler() { // from class: com.fimi.soul.module.dronemanage.h.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (C2710h.f9301a == null) {
                        return;
                    }
                    C2710h.f9301a.m32437e();
                    C2710h.f9301a.m32436f();
                    return;
                case 2:
                    if (C2710h.f9301a != null) {
                        C2710h.f9301a.m32437e();
                        C2710h.f9301a.m32436f();
                    }
                    if (C2710h.f9307g == null) {
                        return;
                    }
                    C2710h.f9307g.mo30125a(1);
                    C2710h.f9307g = null;
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: com.fimi.soul.module.dronemanage.h$a */
    /* loaded from: classes.dex */
    public interface AbstractC2713a {
        /* renamed from: a */
        void mo30125a(int i);
    }

    public C2710h() {
    }

    public C2710h(AbstractC2713a abstractC2713a) {
        f9307g = abstractC2713a;
    }

    /* renamed from: a */
    public static C2710h m30544a() {
        return new C2710h();
    }

    /* renamed from: a */
    public static C2710h m30542a(AbstractC2713a abstractC2713a) {
        return new C2710h(abstractC2713a);
    }

    /* renamed from: a */
    public void m30543a(C2083a c2083a, C2196c c2196c) {
        f9302b = c2083a;
        f9303c = c2196c;
    }

    /* renamed from: b */
    public void m30541b() {
        f9304d = 0;
        if (f9301a != null) {
            f9301a.m32441c();
            return;
        }
        f9301a = new C2283f(200, new Runnable() { // from class: com.fimi.soul.module.dronemanage.h.2
            @Override // java.lang.Runnable
            public void run() {
                C2710h.f9304d++;
                C2710h.f9302b.mo32906ab().mo32587a(C2710h.f9303c);
                if (C2710h.f9304d >= 5) {
                    C2710h.this.f9310h.sendEmptyMessage(2);
                }
            }
        });
        f9301a.m32439d();
    }

    /* renamed from: c */
    public void m30540c() {
        this.f9310h.sendEmptyMessage(1);
    }

    /* renamed from: d */
    public void m30539d() {
        f9307g = null;
    }

    /* renamed from: e */
    public boolean m30538e() {
        return f9301a.m32443b();
    }
}
