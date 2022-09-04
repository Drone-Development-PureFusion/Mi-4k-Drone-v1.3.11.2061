package com.fimi.soul.biz.p182j;

import android.content.Context;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p183k.C1893a;
import com.fimi.soul.biz.p183k.C1906g;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* renamed from: com.fimi.soul.biz.j.k */
/* loaded from: classes.dex */
public class C1885k implements AbstractC1872a {

    /* renamed from: a */
    private C8500c f5165a;

    /* renamed from: b */
    private Context f5166b;

    /* renamed from: c */
    private C2083a f5167c;

    /* renamed from: d */
    private C1877d f5168d = C1877d.m33782p();

    /* renamed from: e */
    private C8615g f5169e;

    /* renamed from: f */
    private C8617i f5170f;

    /* renamed from: g */
    private boolean f5171g;

    /* renamed from: h */
    private boolean f5172h;

    public C1885k(C8500c c8500c, Context context, C2083a c2083a) {
        this.f5167c = c2083a;
        this.f5165a = c8500c;
        this.f5166b = context;
    }

    /* renamed from: a */
    public void m33753a() {
        C2311aq mo32891w = this.f5167c.mo32891w();
        m33752a(mo32891w.m32189f(), mo32891w.m32190e());
    }

    /* renamed from: a */
    public void m33752a(double d, double d2) {
        mo33728a(new LatLng(d, d2), 0);
    }

    /* renamed from: a */
    public void m33751a(FlyActionBean flyActionBean) {
        List<FlyActionBean> m33788j = this.f5168d.m33788j();
        LatLng latLng = flyActionBean.getLatLng();
        if (this.f5169e == null) {
            this.f5169e = this.f5165a.m11577a(C1883i.m33760a(latLng, this.f5167c.f5919d, this.f5168d.m33787k(), true, C1704R.C1705drawable.img_fly_flag_blue));
            this.f5169e.m11028a(flyActionBean);
            this.f5169e.m11032a(1000.0f);
            this.f5169e.m11031a(0.2f, 0.8f);
            this.f5169e.m11026a(false);
            if (this.f5172h && this.f5167c.m33001au().m32393d() != 5) {
                if (this.f5167c.m33009am()) {
                    m33744e();
                } else {
                    m33745d();
                }
            }
            this.f5168d.m33808a(flyActionBean);
            if (!m33788j.contains(flyActionBean)) {
                m33788j.add(flyActionBean);
            }
            List<C8615g> m33789i = this.f5168d.m33789i();
            if (m33789i != null && !m33789i.contains(this.f5169e)) {
                m33789i.add(this.f5169e);
            }
            this.f5167c.mo32909a(C2104d.EnumC2105a.SHOWPOIOPERA);
        }
    }

    /* renamed from: a */
    public void m33750a(LatLng latLng) {
        List<LatLng> m33798c = C1877d.m33782p().m33798c();
        if (m33798c == null || m33798c.contains(latLng)) {
            return;
        }
        m33798c.add(latLng);
        if (m33798c.size() < 2) {
            return;
        }
        if (this.f5170f == null) {
            this.f5170f = this.f5165a.m11575a(C1883i.m33759a(m33798c, 4, this.f5166b.getResources().getColor(C1704R.color.drone_inface_line)).m11297b(50.0f));
        } else {
            this.f5170f.m10982a(m33798c);
        }
    }

    @Override // com.fimi.soul.biz.p182j.AbstractC1872a
    /* renamed from: a */
    public void mo33728a(LatLng latLng, int i) {
        for (C8611c c8611c : C1906g.m33620c().m33619d()) {
            if (c8611c != null && !C1893a.m33706a().m33705a(latLng) && C3077ae.m29349c(c8611c.m11069c(), latLng).m29318a() < c8611c.m11068d()) {
                C1688z.m34449a(this.f5167c.f5919d, (int) C1704R.C1707string.flyzonwaypoint, 3000);
                return;
            }
        }
        double m29318a = C3077ae.m29349c(latLng, new LatLng(this.f5167c.mo32890x().m32302b(), this.f5167c.mo32890x().m32301c())).m29318a();
        if (m29318a > 500.0d) {
            if (m29318a <= 500.0d) {
                return;
            }
            C1688z.m34450a(this.f5166b, (int) C1704R.C1707string.outterwaypoint);
            return;
        }
        List<FlyActionBean> m33788j = this.f5168d.m33788j();
        if (this.f5169e != null) {
            ((FlyActionBean) this.f5169e.m11006o()).setLatLng(latLng);
            this.f5169e.m11030a(latLng);
            return;
        }
        FlyActionBean m33792f = C1877d.m33782p().m33792f();
        if (m33792f == null) {
            m33792f = new FlyActionBean();
        }
        m33792f.setLatLng(latLng);
        m33792f.setDrawableRes(C1704R.C1705drawable.img_fly_flag_blue);
        m33792f.setCanclick(true);
        m33792f.setType(2);
        m33792f.setModelType(3);
        m33792f.setStyleInfo(1);
        m33792f.setHeight(this.f5168d.m33787k());
        this.f5169e = this.f5165a.m11577a(C1883i.m33760a(latLng, this.f5167c.f5919d, this.f5168d.m33787k(), true, C1704R.C1705drawable.img_fly_flag_blue));
        this.f5169e.m11028a(m33792f);
        this.f5169e.m11032a(1000.0f);
        this.f5169e.m11031a(0.2f, 0.8f);
        this.f5169e.m11026a(false);
        this.f5168d.m33808a(m33792f);
        if (!m33788j.contains(m33792f)) {
            m33788j.add(m33792f);
        }
        List<C8615g> m33789i = this.f5168d.m33789i();
        if (m33789i != null && !m33789i.contains(this.f5169e)) {
            m33789i.add(this.f5169e);
        }
        this.f5167c.mo32909a(C2104d.EnumC2105a.SHOWPOIOPERA);
    }

    /* renamed from: b */
    public LatLng m33748b(LatLng latLng) {
        C3084al m29346a = C3078af.m29346a(latLng.f27462a, latLng.f27463b);
        return new LatLng(m29346a.m29322a(), m29346a.m29320b());
    }

    /* renamed from: b */
    public void m33749b() {
        if (this.f5169e != null) {
            this.f5169e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_red));
        }
        C1882h.m33763a(this.f5166b).m33764a(0);
    }

    /* renamed from: c */
    public LatLng m33746c(LatLng latLng) {
        C3084al m29345a = C3078af.m29345a(0.5d, latLng.f27462a, latLng.f27463b);
        return new LatLng(m29345a.m29322a(), m29345a.m29320b());
    }

    /* renamed from: c */
    public void m33747c() {
        if (this.f5169e != null) {
            FlyActionBean flyActionBean = (FlyActionBean) this.f5169e.m11006o();
            if (flyActionBean != null) {
                flyActionBean.setStyleInfo(1);
            }
            this.f5169e.m11027a(this.f5167c.f5919d.getString(C1704R.C1707string.delete_marker));
            this.f5169e.m11013h();
        }
    }

    /* renamed from: d */
    public void m33745d() {
        FlyActionBean flyActionBean;
        if (this.f5169e == null || (flyActionBean = (FlyActionBean) this.f5169e.m11006o()) == null || flyActionBean.getModelType() != 3 || 1 != flyActionBean.getType()) {
            return;
        }
        flyActionBean.setStyleInfo(2);
        flyActionBean.setCanExcute(false);
        this.f5169e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_blue));
        if (this.f5169e.m11011j()) {
            this.f5169e.m11012i();
        }
        this.f5169e.m11027a(this.f5167c.f5919d.getString(C1704R.C1707string.delete_marker));
        this.f5169e.m11013h();
        this.f5172h = true;
    }

    /* renamed from: e */
    public void m33744e() {
        FlyActionBean flyActionBean;
        if (this.f5169e == null || (flyActionBean = (FlyActionBean) this.f5169e.m11006o()) == null || flyActionBean.getModelType() != 3 || 1 != flyActionBean.getType()) {
            return;
        }
        flyActionBean.setStyleInfo(2);
        flyActionBean.setCanExcute(true);
        this.f5169e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_blue));
        if (this.f5169e.m11011j()) {
            this.f5169e.m11012i();
        }
        this.f5169e.m11027a(this.f5167c.f5919d.getString(C1704R.C1707string.delete_marker));
        this.f5169e.m11013h();
        this.f5172h = true;
    }

    /* renamed from: f */
    public void m33743f() {
        FlyActionBean m33792f = C1877d.m33782p().m33792f();
        if (m33792f != null) {
            m33792f.setType(1);
            C1877d.m33782p().m33809a(3);
        }
        if (this.f5169e != null) {
            this.f5169e.m11012i();
        }
    }

    /* renamed from: g */
    public void m33742g() {
        if (this.f5169e != null) {
            if (this.f5169e.m11011j()) {
                this.f5169e.m11012i();
            }
            this.f5169e.m11026a(false);
        }
    }

    /* renamed from: h */
    public void m33741h() {
        if (this.f5169e != null) {
            this.f5169e.m11033a();
            this.f5169e = null;
        }
        if (this.f5170f != null) {
            this.f5170f.m10985a();
            this.f5170f = null;
        }
        this.f5168d.m33788j().clear();
        this.f5167c.mo32909a(C2104d.EnumC2105a.HIDEHEIGHTVALUE);
    }

    /* renamed from: i */
    public void m33740i() {
        if (this.f5168d.m33792f() != null) {
            FlyActionBean m33792f = this.f5168d.m33792f();
            if (C2022a.m33223a().m33221b() || this.f5171g) {
                m33792f.setLatLng(m33746c(m33792f.getLatLng()));
                this.f5171g = false;
            } else {
                m33792f.setLatLng(m33748b(m33792f.getLatLng()));
                this.f5171g = true;
            }
            if (this.f5169e != null) {
                this.f5169e.m11033a();
                this.f5169e = null;
            }
            if (this.f5170f != null) {
                this.f5170f.m10985a();
                this.f5170f = null;
            }
            this.f5168d.m33788j().clear();
            m33751a(m33792f);
        }
    }

    /* renamed from: j */
    public void m33739j() {
        if (!C2022a.m33223a().m33221b() && !this.f5171g) {
            this.f5171g = true;
        }
        this.f5172h = false;
    }

    /* renamed from: k */
    public void m33738k() {
        this.f5172h = false;
    }

    /* renamed from: l */
    public boolean m33737l() {
        return this.f5169e != null;
    }
}
