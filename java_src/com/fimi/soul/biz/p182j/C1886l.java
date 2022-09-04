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
/* renamed from: com.fimi.soul.biz.j.l */
/* loaded from: classes.dex */
public class C1886l implements AbstractC1887m {

    /* renamed from: a */
    private C2083a f5173a;

    public C1886l(C2083a c2083a) {
        this.f5173a = c2083a;
    }

    /* renamed from: a */
    public void m33736a() {
        C2523d.m31374a(this.f5173a).m31380a(1, C9755a.f30449c, C9755a.f30449c, 0, 22, 0, 0, 0, 0, 0);
    }

    @Override // com.fimi.soul.biz.p182j.AbstractC1887m
    /* renamed from: a */
    public void mo33708a(List<FlyActionBean> list) {
        LatLng latLng;
        if (list == null || list.size() <= 0) {
            C1688z.m34450a(this.f5173a.f5919d, (int) C1704R.C1707string.no_poipoint);
            return;
        }
        FlyActionBean flyActionBean = list.get(0);
        short start_point_agle = (flyActionBean.getPara1() == 0 || flyActionBean.getPara1() == 1) ? (short) ((360 - flyActionBean.getStart_point_agle()) / 1.412d) : (short) (flyActionBean.getStart_point_agle() / 1.412d);
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29345a = C3078af.m29345a(0.5d, flyActionBean.getLatLng().f27462a, flyActionBean.getLatLng().f27463b);
            latLng = new LatLng(m29345a.m29322a(), m29345a.m29320b());
        } else {
            latLng = new LatLng(flyActionBean.getLatLng().f27462a, flyActionBean.getLatLng().f27463b);
        }
        C2523d.m31374a(this.f5173a).m31380a(1, latLng.f27463b, latLng.f27462a, Math.round(flyActionBean.getHeight() * 10.0f), flyActionBean.getOpration_Code(), Math.round(flyActionBean.getRidus() * 10.0f), Math.round(flyActionBean.getSpeek() * 10.0f), start_point_agle, flyActionBean.getPara1(), flyActionBean.getYaw_mode());
    }
}
