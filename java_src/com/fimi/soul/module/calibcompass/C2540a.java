package com.fimi.soul.module.calibcompass;

import com.fimi.soul.module.p214c.C2516a;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.fimi.soul.module.calibcompass.a */
/* loaded from: classes.dex */
public class C2540a {

    /* renamed from: a */
    private static C2540a f8282a;

    /* renamed from: b */
    private volatile ConcurrentHashMap<String, C2516a> f8283b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C2540a m31307a() {
        if (f8282a == null) {
            synchronized (C2540a.class) {
                if (f8282a == null) {
                    f8282a = new C2540a();
                }
            }
        }
        return f8282a;
    }

    /* renamed from: a */
    private void m31306a(C2516a c2516a) {
        if (c2516a != null) {
            c2516a.m31397b();
        }
    }

    /* renamed from: a */
    public void m31305a(String str) {
        m31306a(this.f8283b.get(str));
        this.f8283b.remove(str);
    }

    /* renamed from: a */
    public void m31304a(String str, C2516a c2516a) {
        if (c2516a != null) {
            if (this.f8283b.containsKey(str)) {
                m31306a(this.f8283b.get(str));
                this.f8283b.remove(str);
            }
            this.f8283b.put(str, c2516a);
        }
    }
}
