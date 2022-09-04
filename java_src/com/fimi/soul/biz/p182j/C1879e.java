package com.fimi.soul.biz.p182j;

import android.content.Context;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p183k.C1893a;
import com.fimi.soul.biz.p183k.C1906g;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
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
/* renamed from: com.fimi.soul.biz.j.e */
/* loaded from: classes.dex */
public class C1879e implements AbstractC1872a {

    /* renamed from: a */
    private C8500c f5145a;

    /* renamed from: b */
    private Context f5146b;

    /* renamed from: c */
    private C2083a f5147c;

    /* renamed from: e */
    private C8615g f5149e;

    /* renamed from: f */
    private C8617i f5150f;

    /* renamed from: g */
    private LatLng f5151g;

    /* renamed from: h */
    private boolean f5152h;

    /* renamed from: i */
    private boolean f5153i = true;

    /* renamed from: d */
    private C1877d f5148d = C1877d.m33782p();

    public C1879e(C8500c c8500c, Context context, C2083a c2083a) {
        this.f5147c = c2083a;
        this.f5145a = c8500c;
        this.f5146b = context;
    }

    /* renamed from: a */
    public void m33778a() {
        if (this.f5149e != null) {
            if (this.f5149e.m11011j()) {
                this.f5149e.m11012i();
            }
            this.f5149e.m11026a(false);
        }
    }

    /* renamed from: a */
    public void m33777a(LatLng latLng) {
        List<LatLng> m33798c = C1877d.m33782p().m33798c();
        if (m33798c == null || m33798c.contains(latLng)) {
            return;
        }
        m33798c.add(latLng);
        if (m33798c.size() < 2) {
            return;
        }
        if (this.f5150f == null) {
            this.f5150f = this.f5145a.m11575a(C1883i.m33759a(m33798c, 4, this.f5146b.getResources().getColor(C1704R.color.drone_inface_line)).m11297b(50.0f));
        } else {
            this.f5150f.m10982a(m33798c);
        }
    }

    @Override // com.fimi.soul.biz.p182j.AbstractC1872a
    /* renamed from: a */
    public void mo33728a(LatLng latLng, int i) {
        for (C8611c c8611c : C1906g.m33620c().m33619d()) {
            if (c8611c != null && !C1893a.m33706a().m33705a(latLng) && C3077ae.m29349c(c8611c.m11069c(), latLng).m29318a() < c8611c.m11068d()) {
                C1688z.m34449a(this.f5147c.f5919d, (int) C1704R.C1707string.flyzonwaypoint, 3000);
                return;
            }
        }
        if (this.f5153i) {
            double m29318a = C3077ae.m29349c(latLng, new LatLng(this.f5147c.mo32890x().m32302b(), this.f5147c.mo32890x().m32301c())).m29318a();
            if (m29318a > 500.0d) {
                if (m29318a <= 500.0d) {
                    return;
                }
                C1688z.m34450a(this.f5146b, (int) C1704R.C1707string.outterwaypoint);
                return;
            }
        }
        this.f5153i = true;
        if (!C2022a.m33223a().m33221b()) {
            this.f5152h = true;
        } else {
            this.f5152h = false;
        }
        this.f5151g = latLng;
        List<FlyActionBean> m33788j = this.f5148d.m33788j();
        if (this.f5149e != null) {
            ((FlyActionBean) this.f5149e.m11006o()).setLatLng(latLng);
            this.f5149e.m11030a(latLng);
            return;
        }
        FlyActionBean m33783o = C1877d.m33782p().m33783o();
        if (m33783o == null) {
            m33783o = new FlyActionBean();
        }
        m33783o.setLatLng(latLng);
        m33783o.setDrawableRes(i);
        m33783o.setCanclick(true);
        m33783o.setType(2);
        C1877d.m33782p().m33809a(2);
        m33783o.setModelType(2);
        m33783o.setStyleInfo(1);
        m33783o.setHeight(this.f5148d.m33787k());
        m33783o.setSpeek(this.f5148d.m33781q());
        this.f5149e = this.f5145a.m11577a(C1883i.m33760a(latLng, this.f5147c.f5919d, this.f5148d.m33787k(), true, i));
        this.f5149e.m11028a(m33783o);
        this.f5149e.m11032a(1000.0f);
        this.f5149e.m11031a(0.2f, 0.8f);
        this.f5148d.m33796c(m33783o);
        if (!m33788j.contains(m33783o)) {
            m33788j.add(m33783o);
        }
        List<C8615g> m33789i = this.f5148d.m33789i();
        if (m33789i != null && !m33789i.contains(this.f5149e)) {
            m33789i.add(this.f5149e);
        }
        this.f5147c.mo32909a(C2104d.EnumC2105a.SHOWHEIGHTVIEW);
    }

    /* renamed from: a */
    public void m33776a(boolean z) {
        this.f5153i = z;
    }

    /* renamed from: b */
    public void m33775b() {
        if (this.f5149e != null) {
            this.f5149e.m11033a();
            this.f5149e = null;
        }
        if (this.f5150f != null) {
            this.f5150f.m10985a();
            this.f5150f = null;
        }
        this.f5148d.m33788j().clear();
        this.f5147c.mo32909a(C2104d.EnumC2105a.HIDEHEIGHTVALUE);
    }

    /* renamed from: c */
    public void m33774c() {
        if (this.f5149e != null) {
            this.f5149e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_red));
        }
        C1882h.m33763a(this.f5146b).m33764a(0);
    }

    /* renamed from: d */
    public void m33773d() {
        if (this.f5149e != null) {
            FlyActionBean flyActionBean = (FlyActionBean) this.f5149e.m11006o();
            if (flyActionBean != null) {
                flyActionBean.setStyleInfo(1);
            }
            this.f5149e.m11027a(this.f5147c.f5919d.getString(C1704R.C1707string.delete_marker));
            this.f5149e.m11013h();
        }
    }

    /* renamed from: e */
    public void m33772e() {
        FlyActionBean flyActionBean;
        if (this.f5149e == null || (flyActionBean = (FlyActionBean) this.f5149e.m11006o()) == null || flyActionBean.getModelType() != 2) {
            return;
        }
        flyActionBean.setStyleInfo(2);
        this.f5149e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_blue));
        this.f5149e.m11027a(this.f5147c.f5919d.getString(C1704R.C1707string.delete_marker));
        this.f5149e.m11013h();
    }

    /* renamed from: f */
    public void m33771f() {
        FlyActionBean flyActionBean;
        if (this.f5149e == null || (flyActionBean = (FlyActionBean) this.f5149e.m11006o()) == null) {
            return;
        }
        flyActionBean.setType(1);
        this.f5149e.m11029a(C1884j.m33757a(this.f5147c.f5919d, (int) C1704R.C1705drawable.img_fly_flag_blue, Math.round(flyActionBean.getHeight()), false));
    }

    /* renamed from: g */
    public void m33770g() {
        FlyActionBean flyActionBean;
        if (this.f5149e == null || (flyActionBean = (FlyActionBean) this.f5149e.m11006o()) == null || flyActionBean.getModelType() != 2 || 1 != flyActionBean.getType()) {
            return;
        }
        flyActionBean.setStyleInfo(2);
        flyActionBean.setCanExcute(false);
        this.f5149e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_blue));
        if (this.f5149e.m11011j()) {
            this.f5149e.m11012i();
        }
        this.f5149e.m11027a(this.f5147c.f5919d.getString(C1704R.C1707string.delete_marker));
        this.f5149e.m11013h();
    }

    /* renamed from: h */
    public void m33769h() {
        FlyActionBean flyActionBean;
        if (this.f5149e == null || (flyActionBean = (FlyActionBean) this.f5149e.m11006o()) == null || C1877d.m33782p().m33811a() != 2 || 1 != flyActionBean.getType()) {
            return;
        }
        flyActionBean.setStyleInfo(2);
        flyActionBean.setCanExcute(true);
        this.f5149e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_blue));
        if (this.f5149e.m11011j()) {
            this.f5149e.m11012i();
        }
        this.f5149e.m11027a(this.f5147c.f5919d.getString(C1704R.C1707string.delete_marker));
        this.f5149e.m11013h();
    }

    /* renamed from: i */
    public void m33768i() {
        LatLng latLng;
        if (this.f5149e == null || this.f5151g == null) {
            return;
        }
        if (!C2022a.m33223a().m33221b() && !this.f5152h) {
            C3084al m29346a = C3078af.m29346a(this.f5151g.f27462a, this.f5151g.f27463b);
            latLng = new LatLng(m29346a.m29322a(), m29346a.m29320b());
            this.f5152h = true;
        } else if (this.f5152h) {
            C3084al m29345a = C3078af.m29345a(0.5d, this.f5151g.f27462a, this.f5151g.f27463b);
            latLng = new LatLng(m29345a.m29322a(), m29345a.m29320b());
            this.f5152h = false;
        } else {
            latLng = null;
        }
        if (latLng != null) {
            this.f5151g = latLng;
        }
        this.f5149e.m11030a(this.f5151g);
        C1877d.m33782p().m33798c().clear();
        if (this.f5150f == null) {
            return;
        }
        this.f5150f.m10985a();
        this.f5150f = null;
    }

    /* renamed from: j */
    public void m33767j() {
        if (!C2022a.m33223a().m33221b()) {
            this.f5152h = false;
        }
    }
}
