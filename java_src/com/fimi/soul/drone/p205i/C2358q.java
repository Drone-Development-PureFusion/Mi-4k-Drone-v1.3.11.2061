package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.drone.i.q */
/* loaded from: classes.dex */
public class C2358q extends C2247e {

    /* renamed from: b */
    List<LatLng> f7731b = new ArrayList();

    public C2358q(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: b */
    private void m31879b() {
        this.f7081a.mo32909a(C2104d.EnumC2105a.UPDATELINE);
    }

    /* renamed from: a */
    public List<LatLng> m31882a() {
        return this.f7731b;
    }

    /* renamed from: a */
    public void m31881a(LatLng latLng) {
        this.f7731b.remove(latLng);
        m31879b();
    }

    /* renamed from: a */
    public void m31880a(List<LatLng> list) {
        for (LatLng latLng : list) {
            this.f7731b.add(latLng);
        }
        m31879b();
    }

    /* renamed from: b */
    public void m31878b(List<LatLng> list) {
        list.removeAll(list);
    }
}
