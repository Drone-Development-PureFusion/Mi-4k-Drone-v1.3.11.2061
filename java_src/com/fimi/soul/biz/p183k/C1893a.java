package com.fimi.soul.biz.p183k;

import com.fimi.soul.utils.C3077ae;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.fimi.soul.biz.k.a */
/* loaded from: classes.dex */
public class C1893a {

    /* renamed from: b */
    public static C1893a f5196b;

    /* renamed from: a */
    List<C8611c> f5197a = new CopyOnWriteArrayList();

    private C1893a() {
    }

    /* renamed from: a */
    public static C1893a m33706a() {
        if (f5196b == null) {
            synchronized (C1893a.class) {
                if (f5196b == null) {
                    f5196b = new C1893a();
                }
            }
        }
        return f5196b;
    }

    /* renamed from: a */
    public void m33704a(C8611c c8611c) {
        if (!this.f5197a.contains(c8611c)) {
            this.f5197a.add(c8611c);
        }
    }

    /* renamed from: a */
    public boolean m33705a(LatLng latLng) {
        boolean z = false;
        for (C8611c c8611c : this.f5197a) {
            if (C3077ae.m29349c(c8611c.m11069c(), latLng).m29318a() > c8611c.m11068d()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void m33703b() {
        this.f5197a.clear();
    }
}
