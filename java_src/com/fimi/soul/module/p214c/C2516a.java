package com.fimi.soul.module.p214c;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p204h.C2283f;
/* renamed from: com.fimi.soul.module.c.a */
/* loaded from: classes.dex */
public class C2516a {

    /* renamed from: a */
    static int f8180a = 0;

    /* renamed from: f */
    private static final int f8181f = 1;

    /* renamed from: g */
    private static final int f8182g = 2;

    /* renamed from: c */
    private C2283f f8184c;

    /* renamed from: d */
    private C2083a f8185d;

    /* renamed from: e */
    private volatile C2196c f8186e;

    /* renamed from: h */
    private C2519b f8187h;

    /* renamed from: i */
    private int f8188i = 300;

    /* renamed from: b */
    Handler f8183b = new Handler() { // from class: com.fimi.soul.module.c.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (C2516a.this.f8184c != null) {
                        C2516a.this.f8184c.m32437e();
                        C2516a.this.f8184c.m32436f();
                    }
                    if (C2516a.this.f8187h == null || C2516a.this.f8186e == null) {
                        return;
                    }
                    C2516a.this.f8187h.mo31387a(C2516a.this.f8186e.f6913c);
                    C2516a.this.f8186e = null;
                    return;
                case 2:
                    if (C2516a.this.f8184c == null) {
                        return;
                    }
                    C2516a.this.f8184c.m32437e();
                    return;
                default:
                    return;
            }
        }
    };

    public C2516a(C2519b c2519b) {
        this.f8187h = c2519b;
    }

    /* renamed from: a */
    public static C2516a m31398a(C2519b c2519b) {
        return new C2516a(c2519b);
    }

    /* renamed from: a */
    public void m31403a() {
        f8180a = 0;
        if (this.f8184c != null && !this.f8184c.m32443b()) {
            this.f8184c.m32441c();
            return;
        }
        this.f8184c = new C2283f(this.f8188i, new Runnable() { // from class: com.fimi.soul.module.c.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (C2516a.this.f8186e != null) {
                    C2516a.f8180a++;
                    C2516a.this.f8185d.mo32906ab().mo32587a(C2516a.this.f8186e);
                    if (C2516a.f8180a < 5) {
                        return;
                    }
                    C2516a.this.f8183b.sendEmptyMessage(1);
                }
            }
        });
        this.f8184c.m32439d();
    }

    /* renamed from: a */
    public void m31402a(int i) {
        this.f8188i = i;
    }

    /* renamed from: a */
    public void m31401a(C2083a c2083a, C2196c c2196c) {
        this.f8185d = c2083a;
        this.f8186e = c2196c;
    }

    /* renamed from: b */
    public void m31397b() {
        this.f8183b.sendEmptyMessage(2);
    }

    /* renamed from: c */
    public boolean m31395c() {
        return this.f8184c.m32443b();
    }
}
