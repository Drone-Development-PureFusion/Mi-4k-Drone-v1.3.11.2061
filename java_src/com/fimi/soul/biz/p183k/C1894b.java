package com.fimi.soul.biz.p183k;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.fimi.soul.biz.k.b */
/* loaded from: classes.dex */
public class C1894b {

    /* renamed from: b */
    public static C1894b f5198b;

    /* renamed from: a */
    List<LatLng> f5199a = new CopyOnWriteArrayList();

    private C1894b() {
    }

    /* renamed from: a */
    public static C1894b m33702a() {
        if (f5198b == null) {
            synchronized (C1894b.class) {
                if (f5198b == null) {
                    f5198b = new C1894b();
                }
            }
        }
        return f5198b;
    }

    /* renamed from: a */
    public void m33701a(LatLng latLng) {
        if (!this.f5199a.contains(latLng)) {
            this.f5199a.add(latLng);
        }
    }

    /* renamed from: b */
    public void m33700b() {
        this.f5199a.clear();
    }

    /* renamed from: b */
    public boolean m33699b(LatLng latLng) {
        return this.f5199a.contains(latLng);
    }

    /* renamed from: c */
    public void m33698c(LatLng latLng) {
        this.f5199a.remove(latLng);
    }
}
