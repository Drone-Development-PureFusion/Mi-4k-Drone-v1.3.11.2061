package com.fimi.soul.biz.p182j;

import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2316av;
import com.fimi.soul.drone.p205i.C2317aw;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p253b.C9755a;
import java.util.List;
/* renamed from: com.fimi.soul.biz.j.p */
/* loaded from: classes.dex */
public class C1892p implements AbstractC1887m {

    /* renamed from: a */
    private List<FlyActionBean> f5193a;

    /* renamed from: b */
    private C2083a f5194b;

    /* renamed from: c */
    private volatile int f5195c = 1;

    public C1892p(C2083a c2083a) {
        this.f5194b = c2083a;
    }

    /* renamed from: a */
    public void m33711a() {
        C2316av mo32900n = this.f5194b.mo32900n();
        if (mo32900n.m32158a() >= this.f5195c && this.f5195c == mo32900n.m32158a() && mo32900n.m32151g() == C9755a.f30449c && this.f5193a != null && this.f5195c <= this.f5193a.size()) {
            if (mo32900n.m32158a() == this.f5193a.size()) {
                C2523d.m31374a(this.f5194b).m31351q();
                return;
            }
            this.f5195c++;
            m33710a(this.f5195c);
        }
    }

    /* renamed from: a */
    public void m33710a(int i) {
        LatLng latLng;
        if (this.f5193a.size() < 1 || i > this.f5193a.size()) {
            return;
        }
        FlyActionBean flyActionBean = this.f5193a.get(i - 1);
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29345a = C3078af.m29345a(0.5d, flyActionBean.getLatLng().f27462a, flyActionBean.getLatLng().f27463b);
            latLng = new LatLng(m29345a.m29322a(), m29345a.m29320b());
        } else {
            latLng = new LatLng(flyActionBean.getLatLng().f27462a, flyActionBean.getLatLng().f27463b);
        }
        C2523d.m31374a(this.f5194b).m31378a(i, latLng.f27463b, latLng.f27462a, (short) flyActionBean.getHeight(), (short) this.f5193a.size(), Math.round(flyActionBean.getSpeek()));
    }

    /* renamed from: a */
    public void m33709a(C2317aw c2317aw) {
        List<LatLng> m33786l = C1877d.m33782p().m33786l();
        List<FlyActionBean> m33788j = C1877d.m33782p().m33788j();
        LatLng latLng = new LatLng(c2317aw.m32145c(), c2317aw.m32146b());
        if (m33786l != null && !m33786l.contains(latLng) && c2317aw.m32140h() != 0) {
            m33786l.add(latLng);
            FlyActionBean flyActionBean = new FlyActionBean();
            flyActionBean.setLatLng(latLng);
            flyActionBean.setHeight((int) c2317aw.m32144d());
            flyActionBean.setType(1);
            flyActionBean.setModelType(1);
            flyActionBean.setSpeek((int) c2317aw.m32141g());
            if (m33788j != null && !m33788j.contains(flyActionBean)) {
                m33788j.add(flyActionBean);
            }
        }
        if (c2317aw.m32140h() <= m33786l.size()) {
            this.f5194b.mo32909a(C2104d.EnumC2105a.RESHWAYPOINT);
        } else {
            m33707b(c2317aw.m32148a() + 1);
        }
    }

    @Override // com.fimi.soul.biz.p182j.AbstractC1887m
    /* renamed from: a */
    public void mo33708a(List<FlyActionBean> list) {
        if (list != null && list.size() <= 0) {
            C1688z.m34450a(this.f5194b.f5919d, (int) C1704R.C1707string.no_waypoint);
            return;
        }
        this.f5195c = 1;
        this.f5193a = list;
        m33710a(this.f5195c);
    }

    /* renamed from: b */
    public void m33707b(int i) {
        C2523d.m31374a(this.f5194b).m31381a(i);
    }
}
