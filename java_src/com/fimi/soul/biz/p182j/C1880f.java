package com.fimi.soul.biz.p182j;

import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p253b.C9755a;
import java.util.List;
/* renamed from: com.fimi.soul.biz.j.f */
/* loaded from: classes.dex */
public class C1880f implements AbstractC1887m {

    /* renamed from: a */
    private C2083a f5154a;

    public C1880f(C2083a c2083a) {
        this.f5154a = c2083a;
    }

    /* renamed from: a */
    public void m33766a() {
        C2523d.m31374a(this.f5154a).m31379a(0, C9755a.f30449c, C9755a.f30449c, (short) 0, 170, 0);
    }

    @Override // com.fimi.soul.biz.p182j.AbstractC1887m
    /* renamed from: a */
    public void mo33708a(List<FlyActionBean> list) {
        LatLng latLng;
        if (list == null || list.size() <= 0) {
            C1688z.m34450a(this.f5154a.f5919d, (int) C1704R.C1707string.no_flytopoint);
            return;
        }
        FlyActionBean flyActionBean = list.get(0);
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29345a = C3078af.m29345a(0.5d, flyActionBean.getLatLng().f27462a, flyActionBean.getLatLng().f27463b);
            latLng = new LatLng(m29345a.m29322a(), m29345a.m29320b());
        } else {
            latLng = new LatLng(flyActionBean.getLatLng().f27462a, flyActionBean.getLatLng().f27463b);
        }
        C2523d.m31374a(this.f5154a).m31379a(1, latLng.f27463b, latLng.f27462a, (short) flyActionBean.getHeight(), 85, Math.round(flyActionBean.getSpeek()));
    }
}
