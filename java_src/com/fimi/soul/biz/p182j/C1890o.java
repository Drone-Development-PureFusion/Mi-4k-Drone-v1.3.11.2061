package com.fimi.soul.biz.p182j;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.p165d.C1648b;
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
import java.util.Iterator;
import java.util.List;
/* renamed from: com.fimi.soul.biz.j.o */
/* loaded from: classes.dex */
public class C1890o implements AbstractC1872a {

    /* renamed from: b */
    private C8500c f5180b;

    /* renamed from: c */
    private Context f5181c;

    /* renamed from: d */
    private volatile C8617i f5182d;

    /* renamed from: f */
    private C2083a f5184f;

    /* renamed from: g */
    private volatile C8617i f5185g;

    /* renamed from: h */
    private C8615g f5186h;

    /* renamed from: i */
    private FlyActionBean f5187i;

    /* renamed from: k */
    private boolean f5189k;

    /* renamed from: m */
    private boolean f5191m;

    /* renamed from: a */
    Handler f5179a = new Handler() { // from class: com.fimi.soul.biz.j.o.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == C1890o.this.f5188j && C1890o.this.f5186h != null) {
                if (C1890o.this.f5189k) {
                    C1890o.this.f5186h.m11029a(C1884j.m33757a(C1890o.this.f5184f.f5919d, (int) C1704R.C1705drawable.img_fly_origin_blue_m, Math.round(C1890o.this.f5187i.getHeight()), false));
                    C1890o.this.f5189k = false;
                } else {
                    C1890o.this.f5186h.m11029a(C1884j.m33757a(C1890o.this.f5184f.f5919d, (int) C1704R.C1705drawable.img_fly_origin_flash, Math.round(C1890o.this.f5187i.getHeight()), false));
                    C1890o.this.f5189k = true;
                }
            }
            C1890o.this.f5179a.sendEmptyMessageDelayed(C1890o.this.f5188j, C1890o.this.f5190l);
        }
    };

    /* renamed from: j */
    private int f5188j = 100;

    /* renamed from: l */
    private int f5190l = 200;

    /* renamed from: e */
    private C1877d f5183e = C1877d.m33782p();

    public C1890o(C8500c c8500c, Context context, C2083a c2083a) {
        this.f5184f = c2083a;
        this.f5180b = c8500c;
        this.f5181c = context;
    }

    /* renamed from: a */
    private void m33727a(C8615g c8615g, boolean z) {
        LatLng latLng;
        LatLng m11020c = c8615g.m11020c();
        if (!C2022a.m33223a().m33221b() && !this.f5191m) {
            C3084al m29346a = C3078af.m29346a(m11020c.f27462a, m11020c.f27463b);
            latLng = new LatLng(m29346a.m29322a(), m29346a.m29320b());
            if (z) {
                this.f5191m = true;
            }
        } else if (this.f5191m) {
            C3084al m29345a = C3078af.m29345a(0.5d, m11020c.f27462a, m11020c.f27463b);
            latLng = new LatLng(m29345a.m29322a(), m29345a.m29320b());
            if (z) {
                this.f5191m = false;
            }
        } else {
            latLng = m11020c;
        }
        c8615g.m11030a(latLng);
    }

    /* renamed from: k */
    private void m33712k() {
        List<LatLng> m33786l;
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (m33789i == null || m33789i.size() <= 0 || (m33786l = C1877d.m33782p().m33786l()) == null) {
            return;
        }
        m33786l.clear();
        for (C8615g c8615g : m33789i) {
            m33786l.add(c8615g.m11020c());
        }
        if (this.f5182d != null) {
            this.f5182d.m10982a(m33786l);
        }
        C1877d.m33782p().m33798c().clear();
        if (this.f5185g == null) {
            return;
        }
        this.f5185g.m10985a();
        this.f5185g = null;
    }

    /* renamed from: a */
    public synchronized void m33734a() {
        List<C8615g> m33789i = C1877d.m33782p().m33789i();
        if (C1877d.m33782p().m33788j().size() > 0 && m33789i.size() == 0) {
            for (FlyActionBean flyActionBean : C1877d.m33782p().m33788j()) {
                C8615g m11577a = this.f5180b.m11577a(C1883i.m33761a(flyActionBean.getLatLng(), C1704R.C1705drawable.img_fly_origin_blue));
                m11577a.m11028a(flyActionBean);
                m11577a.m11031a(0.5f, 0.88f);
                m11577a.m11012i();
                if (!m33789i.contains(m11577a)) {
                    m33789i.add(m11577a);
                }
            }
        }
        if (m33789i != null && m33789i.size() > 1) {
            for (int i = 0; i < m33789i.size(); i++) {
                C8615g c8615g = m33789i.get(i);
                FlyActionBean flyActionBean2 = (FlyActionBean) c8615g.m11006o();
                if (i == m33789i.size() - 1) {
                    c8615g.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_blue));
                    flyActionBean2.setStyleInfo(2);
                    flyActionBean2.setCanclick(true);
                    flyActionBean2.setDrawableRes(C1704R.C1705drawable.img_fly_flag_blue);
                    c8615g.m11031a(0.1f, 0.9f);
                } else {
                    flyActionBean2.setCanclick(false);
                    c8615g.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_origin_blue));
                    flyActionBean2.setDrawableRes(C1704R.C1705drawable.img_fly_origin_blue);
                    c8615g.m11031a(0.5f, 0.7f);
                }
                flyActionBean2.setModelType(1);
                c8615g.m11026a(false);
                if (c8615g.m11011j()) {
                    c8615g.m11012i();
                }
            }
        } else if (m33789i.size() > 0) {
            C8615g c8615g2 = m33789i.get(0);
            FlyActionBean flyActionBean3 = (FlyActionBean) c8615g2.m11006o();
            c8615g2.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_blue));
            flyActionBean3.setStyleInfo(2);
            flyActionBean3.setCanclick(true);
            flyActionBean3.setDrawableRes(C1704R.C1705drawable.img_fly_flag_blue);
            c8615g2.m11031a(0.1f, 0.9f);
        }
        List<LatLng> m33786l = this.f5183e.m33786l();
        if (m33786l != null && m33786l.size() > 0) {
            if (this.f5182d == null) {
                this.f5182d = this.f5180b.m11575a(C1883i.m33759a(m33786l, 4, this.f5181c.getResources().getColor(C1704R.color.polyline_coclor)));
            } else {
                this.f5182d.m10982a(m33786l);
            }
            this.f5183e.m33805a(this.f5182d);
        }
        if (this.f5185g != null) {
            this.f5185g.m10985a();
            this.f5185g = null;
        }
        if (C1877d.m33782p().m33798c() != null) {
            C1877d.m33782p().m33798c().clear();
        }
    }

    /* renamed from: a */
    public void m33733a(int i) {
        if (this.f5184f.m33001au().m32392e() == 6) {
            List<C8615g> m33789i = this.f5183e.m33789i();
            if (m33789i.size() < 1 || i > m33789i.size() || i < 1) {
                return;
            }
            if (i <= m33789i.size() - 1) {
                C8615g c8615g = m33789i.get(i - 1);
                this.f5186h = c8615g;
                c8615g.m11031a(0.3f, 0.7f);
                this.f5187i = (FlyActionBean) c8615g.m11006o();
                if (!this.f5179a.hasMessages(this.f5188j)) {
                    this.f5179a.sendEmptyMessageDelayed(this.f5188j, this.f5190l);
                }
            } else if (i == m33789i.size()) {
                if (this.f5179a.hasMessages(this.f5188j)) {
                    this.f5179a.removeMessages(this.f5188j);
                }
                C8615g c8615g2 = m33789i.get(m33789i.size() - 1);
                c8615g2.m11029a(C1884j.m33757a(this.f5184f.f5919d, (int) C1704R.C1705drawable.img_fly_flag_blue, Math.round(((FlyActionBean) c8615g2.m11006o()).getHeight()), false));
                c8615g2.m11031a(0.15f, 0.9f);
            }
            if (i < 2) {
                return;
            }
            for (int i2 = 0; i2 < i - 1; i2++) {
                C8615g c8615g3 = m33789i.get(i2);
                c8615g3.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_origin_red));
                c8615g3.m11031a(0.2f, 0.7f);
            }
        }
    }

    /* renamed from: a */
    public void m33730a(FlyActionBean flyActionBean) {
        C8615g m33791g;
        int i = 0;
        if (C1877d.m33782p().m33790h() && (m33791g = C1877d.m33782p().m33791g()) != null && flyActionBean != null && m33791g.m11006o() != null && m33791g.m11006o().equals(flyActionBean)) {
            C1877d.m33782p().m33806a((C8615g) null);
            C1877d.m33782p().m33803a(false);
        }
        List<LatLng> m33786l = this.f5183e.m33786l();
        List<FlyActionBean> m33788j = this.f5183e.m33788j();
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (flyActionBean != null && m33788j.contains(flyActionBean)) {
            i = m33788j.indexOf(flyActionBean);
            m33788j.remove(flyActionBean);
        }
        int i2 = i;
        if (m33786l != null && m33786l.contains(flyActionBean.getLatLng())) {
            m33786l.remove(flyActionBean.getLatLng());
            if (this.f5182d == null || m33786l.size() <= 0) {
                this.f5184f.mo32909a(C2104d.EnumC2105a.HIDEHEIGHTVALUE);
            } else {
                this.f5182d.m10982a(m33786l);
            }
        }
        if (m33789i != null) {
            Iterator<C8615g> it2 = m33789i.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C8615g next = it2.next();
                if (next.m11006o().equals(flyActionBean)) {
                    next.m11033a();
                    m33789i.remove(next);
                    break;
                }
            }
        }
        if (m33788j.size() >= 1 && i2 <= m33788j.size() && i2 > 0) {
            this.f5183e.m33799b(m33788j.get(i2 - 1));
        } else if (m33788j.size() >= 1) {
            this.f5183e.m33799b(m33788j.get(m33788j.size() - 1));
        }
        if (m33789i.size() >= 1 && i2 <= m33789i.size() && i2 > 0) {
            m33789i.get(i2 - 1).m11029a(C1884j.m33757a(this.f5184f.f5919d, (int) C1704R.C1705drawable.icon_fly_waypoint_red, Math.round(flyActionBean.getHeight()), true));
        } else if (m33789i.size() < 1) {
        } else {
            m33789i.get(m33789i.size() - 1).m11029a(C1884j.m33757a(this.f5184f.f5919d, (int) C1704R.C1705drawable.icon_fly_waypoint_red, Math.round(flyActionBean.getHeight()), true));
        }
    }

    /* renamed from: a */
    public void m33729a(LatLng latLng) {
        List<LatLng> m33798c = C1877d.m33782p().m33798c();
        if (m33798c == null || m33798c.contains(latLng)) {
            return;
        }
        m33798c.add(latLng);
        if (m33798c.size() < 2) {
            return;
        }
        if (this.f5185g == null) {
            this.f5185g = this.f5180b.m11575a(C1883i.m33759a(m33798c, 4, this.f5181c.getResources().getColor(C1704R.color.drone_inface_line)).m11297b(50.0f));
        } else {
            this.f5185g.m10982a(m33798c);
        }
    }

    @Override // com.fimi.soul.biz.p182j.AbstractC1872a
    /* renamed from: a */
    public void mo33728a(LatLng latLng, int i) {
        List<LatLng> m33786l = this.f5183e.m33786l();
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (m33789i != null && m33789i.size() >= 20) {
            C1688z.m34449a(this.f5184f.f5919d, (int) C1704R.C1707string.waypointCountOut, 3000);
            return;
        }
        if (!C2022a.m33223a().m33221b()) {
            this.f5191m = true;
        } else {
            this.f5191m = false;
        }
        for (C8611c c8611c : C1906g.m33620c().m33619d()) {
            if (c8611c != null && !C1893a.m33706a().m33705a(latLng) && C3077ae.m29349c(c8611c.m11069c(), latLng).m29318a() < c8611c.m11068d()) {
                C1688z.m34449a(this.f5184f.f5919d, (int) C1704R.C1707string.flyzonwaypoint, 3000);
                return;
            }
        }
        double m29318a = C3077ae.m29349c(latLng, new LatLng(this.f5184f.mo32890x().m32302b(), this.f5184f.mo32890x().m32301c())).m29318a();
        if (m29318a > 500.0d) {
            if (m29318a <= 500.0d) {
                return;
            }
            C1688z.m34450a(this.f5181c, (int) C1704R.C1707string.outterwaypoint);
            return;
        }
        FlyActionBean flyActionBean = new FlyActionBean();
        flyActionBean.setLatLng(latLng);
        flyActionBean.setDrawableRes(i);
        flyActionBean.setCanclick(true);
        flyActionBean.setType(2);
        flyActionBean.setModelType(1);
        flyActionBean.setHeight(this.f5183e.m33787k());
        flyActionBean.setSpeek(this.f5183e.m33780r());
        C8615g m11577a = this.f5180b.m11577a(C1883i.m33760a(latLng, this.f5184f.f5919d, this.f5183e.m33787k(), true, i));
        m11577a.m11031a(0.5f, 0.88f);
        m11577a.m11028a(flyActionBean);
        m11577a.m11032a(1000.0f);
        C1877d.m33782p().m33809a(1);
        this.f5183e.m33799b(flyActionBean);
        if (m33789i != null && !m33789i.contains(m11577a)) {
            for (C8615g c8615g : m33789i) {
                c8615g.m11029a(C1884j.m33757a(this.f5184f.f5919d, (int) C1704R.C1705drawable.icon_fly_waypoint_blue, Math.round(((FlyActionBean) c8615g.m11006o()).getHeight()), false));
            }
            m33789i.add(m11577a);
            this.f5184f.mo32909a(C2104d.EnumC2105a.SHOWHEIGHTVIEW);
        }
        List<FlyActionBean> m33788j = this.f5183e.m33788j();
        if (m33788j != null && !m33788j.contains(flyActionBean)) {
            m33788j.add(flyActionBean);
        }
        if (m33786l == null || m33786l.contains(m33786l)) {
            return;
        }
        m33786l.add(latLng);
        if (this.f5182d == null) {
            this.f5182d = this.f5180b.m11575a(C1883i.m33759a(m33786l, 4, this.f5181c.getResources().getColor(C1704R.color.polyline_coclor)));
        } else {
            this.f5182d.m10982a(m33786l);
        }
        this.f5183e.m33805a(this.f5182d);
    }

    /* renamed from: b */
    public void m33726b() {
        if (this.f5179a.hasMessages(this.f5188j)) {
            this.f5179a.removeMessages(this.f5188j);
        }
        if (this.f5182d != null) {
            this.f5182d.m10985a();
            this.f5182d = null;
        }
        if (this.f5185g != null) {
            this.f5185g.m10985a();
            this.f5185g = null;
        }
    }

    /* renamed from: c */
    public void m33724c() {
        List<C8615g> m33789i = C1877d.m33782p().m33789i();
        List<LatLng> m33786l = C1877d.m33782p().m33786l();
        int m32299e = this.f5184f.mo32890x().m32299e();
        if (m33789i == null || m33789i.size() <= 0 || m33786l == null || m32299e < m33786l.size()) {
            return;
        }
        C1688z.m34449a(this.f5184f.f5919d, (int) C1704R.C1707string.excute_waypoint_com, 3000);
        C1648b.m34863b(this.f5184f.f5919d).m34867a(this.f5184f.f5919d.getString(C1704R.C1707string.excute_waypoint_com));
        m33789i.get(m33789i.size() - 1).m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_flag_red));
        C1882h.m33763a(this.f5184f.f5919d).m33764a(0);
        this.f5184f.mo32909a(C2104d.EnumC2105a.SHOWINFORWINDOW);
    }

    /* renamed from: d */
    public void m33722d() {
        List<LatLng> m33786l = C1877d.m33782p().m33786l();
        List<FlyActionBean> m33788j = C1877d.m33782p().m33788j();
        if (m33786l == null || m33788j == null) {
            return;
        }
        m33786l.clear();
        for (FlyActionBean flyActionBean : m33788j) {
            if (!m33786l.contains(flyActionBean.getLatLng())) {
                m33786l.add(flyActionBean.getLatLng());
            }
        }
        this.f5182d.m10982a(m33786l);
    }

    /* renamed from: e */
    public void m33720e() {
        if (this.f5179a.hasMessages(this.f5188j)) {
            this.f5179a.removeMessages(this.f5188j);
        }
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (m33789i == null || m33789i.size() <= 0) {
            return;
        }
        C8615g c8615g = m33789i.get(m33789i.size() - 1);
        FlyActionBean flyActionBean = (FlyActionBean) c8615g.m11006o();
        if (flyActionBean == null || flyActionBean.getModelType() != 1) {
            return;
        }
        flyActionBean.setStyleInfo(2);
        flyActionBean.setCanExcute(true);
        c8615g.m11027a("");
        c8615g.m11013h();
    }

    /* renamed from: f */
    public void m33718f() {
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (m33789i == null || m33789i.size() <= 0) {
            return;
        }
        C8615g c8615g = m33789i.get(m33789i.size() - 1);
        FlyActionBean flyActionBean = (FlyActionBean) c8615g.m11006o();
        if (c8615g == null || flyActionBean == null || flyActionBean.getModelType() != 1) {
            return;
        }
        if (c8615g.m11011j()) {
            c8615g.m11012i();
        }
        flyActionBean.setStyleInfo(2);
        flyActionBean.setCanExcute(false);
        c8615g.m11027a(this.f5184f.f5919d.getString(C1704R.C1707string.delete_marker));
        c8615g.m11013h();
    }

    /* renamed from: g */
    public void m33716g() {
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (m33789i == null || m33789i.size() <= 0) {
            return;
        }
        C8615g c8615g = m33789i.get(m33789i.size() - 1);
        FlyActionBean flyActionBean = (FlyActionBean) c8615g.m11006o();
        if (flyActionBean == null || flyActionBean.getModelType() != 1) {
            return;
        }
        flyActionBean.setStyleInfo(2);
        flyActionBean.setCanExcute(true);
        if (!c8615g.m11011j()) {
            return;
        }
        c8615g.m11012i();
        if (c8615g.m11011j()) {
            return;
        }
        c8615g.m11027a("");
        c8615g.m11013h();
    }

    /* renamed from: h */
    public void m33715h() {
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (m33789i == null || m33789i.size() <= 0) {
            return;
        }
        C8615g c8615g = m33789i.get(m33789i.size() - 1);
        if (!c8615g.m11011j()) {
            return;
        }
        c8615g.m11012i();
    }

    /* renamed from: i */
    public void m33714i() {
        List<C8615g> m33789i = this.f5183e.m33789i();
        if (m33789i == null || m33789i.size() <= 0) {
            return;
        }
        for (int i = 0; i < m33789i.size(); i++) {
            C8615g c8615g = m33789i.get(i);
            if (i == m33789i.size() - 1) {
                m33727a(c8615g, true);
            } else {
                m33727a(c8615g, false);
            }
        }
        m33712k();
    }

    /* renamed from: j */
    public void m33713j() {
        if (!C2022a.m33223a().m33221b()) {
            this.f5191m = true;
        }
    }
}
