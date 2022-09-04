package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p204h.C2283f;
/* renamed from: com.fimi.soul.module.dronemanage.a */
/* loaded from: classes.dex */
public class C2696a {

    /* renamed from: f */
    private static final int f9215f = 1;

    /* renamed from: a */
    C2283f f9216a;

    /* renamed from: b */
    C2083a f9217b;

    /* renamed from: c */
    C2196c f9218c;

    /* renamed from: d */
    int f9219d;

    /* renamed from: e */
    Handler f9220e = new Handler() { // from class: com.fimi.soul.module.dronemanage.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (C2696a.this.f9216a == null) {
                        return;
                    }
                    C2696a.this.f9216a.m32437e();
                    C2696a.this.f9216a.m32436f();
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: a */
    public void m30588a() {
        this.f9219d = 0;
        if (this.f9216a != null) {
            this.f9216a.m32441c();
            return;
        }
        this.f9216a = new C2283f(200, new Runnable() { // from class: com.fimi.soul.module.dronemanage.a.2
            @Override // java.lang.Runnable
            public void run() {
                C2696a.this.f9219d++;
                C2696a.this.f9217b.mo32906ab().mo32587a(C2696a.this.f9218c);
                if (C2696a.this.f9219d >= 5) {
                    C2696a.this.f9220e.sendEmptyMessage(1);
                }
            }
        });
        this.f9216a.m32439d();
    }

    /* renamed from: a */
    public void m30587a(C2083a c2083a, C2196c c2196c) {
        this.f9217b = c2083a;
        this.f9218c = c2196c;
    }

    /* renamed from: b */
    public void m30586b() {
        this.f9217b.mo32906ab().mo32587a(this.f9218c);
    }

    /* renamed from: c */
    public void m30585c() {
        this.f9220e.sendEmptyMessage(1);
    }

    /* renamed from: d */
    public boolean m30584d() {
        return this.f9216a.m32443b();
    }
}
