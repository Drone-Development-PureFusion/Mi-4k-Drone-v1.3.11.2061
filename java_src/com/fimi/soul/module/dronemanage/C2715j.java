package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p204h.C2283f;
/* renamed from: com.fimi.soul.module.dronemanage.j */
/* loaded from: classes.dex */
public class C2715j {

    /* renamed from: a */
    static C2283f f9322a = null;

    /* renamed from: b */
    static C2083a f9323b = null;

    /* renamed from: c */
    static C2196c f9324c = null;

    /* renamed from: d */
    static int f9325d = 0;

    /* renamed from: e */
    static Handler f9326e = new Handler() { // from class: com.fimi.soul.module.dronemanage.j.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (C2715j.f9322a == null) {
                        return;
                    }
                    C2715j.f9322a.m32437e();
                    C2715j.f9322a.m32436f();
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: f */
    private static final int f9327f = 1;

    /* renamed from: a */
    public static void m30535a() {
        f9325d = 0;
        if (f9322a != null) {
            f9322a.m32441c();
            return;
        }
        f9322a = new C2283f(200, new Runnable() { // from class: com.fimi.soul.module.dronemanage.j.2
            @Override // java.lang.Runnable
            public void run() {
                C2715j.f9325d++;
                C2715j.f9323b.mo32906ab().mo32587a(C2715j.f9324c);
                if (C2715j.f9325d >= 5) {
                    C2715j.f9326e.sendEmptyMessage(1);
                }
            }
        });
        f9322a.m32439d();
    }

    /* renamed from: a */
    public static void m30534a(C2083a c2083a, C2196c c2196c) {
        f9323b = c2083a;
        f9324c = c2196c;
    }

    /* renamed from: b */
    public static void m30533b() {
        f9326e.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public boolean m30532c() {
        return f9322a.m32443b();
    }
}
