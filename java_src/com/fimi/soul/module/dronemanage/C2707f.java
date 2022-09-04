package com.fimi.soul.module.dronemanage;

import android.content.Context;
import android.support.p001v4.app.FragmentActivity;
import com.fimi.soul.drone.C2083a;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;
/* renamed from: com.fimi.soul.module.dronemanage.f */
/* loaded from: classes.dex */
public class C2707f {

    /* renamed from: a */
    private Context f9294a;

    /* renamed from: b */
    private C2702d f9295b;

    /* renamed from: c */
    private WeakReference<Context> f9296c;

    /* renamed from: d */
    private WeakReference<C2083a> f9297d;

    public C2707f(C2083a c2083a, FragmentActivity fragmentActivity, FlightMapFragment flightMapFragment) {
        this.f9296c = new WeakReference<>(fragmentActivity);
        this.f9297d = new WeakReference<>(c2083a);
        this.f9294a = this.f9296c.get();
        m30550a(this.f9294a, c2083a.m33012aj(), this.f9297d.get(), flightMapFragment);
    }

    /* renamed from: a */
    private void m30550a(Context context, C8500c c8500c, C2083a c2083a, FlightMapFragment flightMapFragment) {
        this.f9295b = new C2702d(c8500c, context, c2083a);
    }

    /* renamed from: a */
    public C2702d m30553a() {
        return this.f9295b;
    }

    /* renamed from: a */
    public void m30552a(int i) {
        m30553a().m30577a();
        m30553a().m30565d();
    }

    /* renamed from: a */
    public void m30551a(int i, LatLng latLng) {
        switch (C2714i.m30537a()) {
            case 2:
            case 6:
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m30549b() {
        this.f9295b.m30567c();
    }
}
