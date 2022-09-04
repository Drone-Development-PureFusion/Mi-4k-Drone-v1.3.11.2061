package com.fimi.soul.biz.p182j;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.app.FragmentManager;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p180h.C1852c;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2315au;
import com.fimi.soul.drone.p205i.C2324bc;
import com.fimi.soul.drone.p205i.p206a.C2286a;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.dronemanage.C2702d;
import com.fimi.soul.module.p214c.C2523d;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import java.util.Observable;
/* renamed from: com.fimi.soul.biz.j.c */
/* loaded from: classes.dex */
public class C1874c extends Observable implements C2104d.AbstractC2106b {

    /* renamed from: r */
    private static final int f5099r = 11;

    /* renamed from: a */
    private C1882h f5100a;

    /* renamed from: b */
    private C1879e f5101b;

    /* renamed from: c */
    private C1890o f5102c;

    /* renamed from: d */
    private C1873b f5103d;

    /* renamed from: e */
    private C1885k f5104e;

    /* renamed from: f */
    private C2702d f5105f;

    /* renamed from: g */
    private C2083a f5106g;

    /* renamed from: h */
    private int f5107h;

    /* renamed from: i */
    private int f5108i;

    /* renamed from: p */
    private boolean f5115p;

    /* renamed from: q */
    private FragmentManager f5116q;

    /* renamed from: w */
    private boolean f5121w;

    /* renamed from: x */
    private boolean f5122x;

    /* renamed from: j */
    private boolean f5109j = true;

    /* renamed from: k */
    private boolean f5110k = true;

    /* renamed from: l */
    private boolean f5111l = true;

    /* renamed from: m */
    private boolean f5112m = true;

    /* renamed from: n */
    private int f5113n = 1000;

    /* renamed from: o */
    private boolean f5114o = true;

    /* renamed from: s */
    private Handler f5117s = new Handler() { // from class: com.fimi.soul.biz.j.c.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == C1874c.this.f5113n) {
                C1874c.this.f5114o = false;
            } else if (message.what != 11) {
            } else {
                C1874c.this.f5115p = false;
            }
        }
    };

    /* renamed from: t */
    private boolean f5118t = true;

    /* renamed from: u */
    private boolean f5119u = true;

    /* renamed from: v */
    private boolean f5120v = true;

    public C1874c(C2083a c2083a, C8500c c8500c, Context context, FragmentManager fragmentManager) {
        this.f5116q = fragmentManager;
        this.f5106g = c2083a;
        c2083a.mo32908a(this);
        this.f5100a = C1882h.m33763a(c2083a.f5919d);
        this.f5101b = new C1879e(c8500c, context, c2083a);
        this.f5102c = new C1890o(c8500c, context, c2083a);
        this.f5104e = new C1885k(c8500c, context, c2083a);
        this.f5105f = new C2702d(c8500c, context, c2083a);
        this.f5103d = new C1873b(c8500c, context, c2083a);
    }

    /* renamed from: e */
    private void m33817e() {
        if (this.f5107h == 4 && this.f5108i == 1 && !this.f5115p) {
            this.f5101b.m33774c();
            C1688z.m34449a(this.f5106g.f5919d, (int) C1704R.C1707string.excute_direction_com, 3000);
            C1648b.m34863b(this.f5106g.f5919d).m34867a(this.f5106g.f5919d.getString(C1704R.C1707string.excute_direction_com));
            this.f5101b.m33773d();
            C1882h.m33763a(this.f5106g.f5919d).m33764a(0);
        }
        this.f5107h = this.f5108i;
    }

    /* renamed from: f */
    private void m33816f() {
        if (this.f5107h == 10 && this.f5108i == 1 && !this.f5115p) {
            C1688z.m34449a(this.f5106g.f5919d, (int) C1704R.C1707string.excute_takephoto_com, 3000);
            C1648b.m34863b(this.f5106g.f5919d).m34867a(this.f5106g.f5919d.getString(C1704R.C1707string.excute_takephoto_com));
            C1882h.m33763a(this.f5106g.f5919d).m33764a(0);
        }
        this.f5107h = this.f5108i;
    }

    /* renamed from: g */
    private void m33815g() {
        C2311aq mo32891w = this.f5106g.mo32891w();
        LatLng latLng = new LatLng(mo32891w.m32189f(), mo32891w.m32190e());
        if (this.f5100a.m33765a().get() == 1) {
            this.f5102c.m33729a(latLng);
        } else if (this.f5100a.m33765a().get() == 2) {
            this.f5101b.m33777a(latLng);
        } else if (this.f5100a.m33765a().get() == 3) {
            this.f5104e.m33750a(latLng);
        } else if (this.f5100a.m33765a().get() != 4) {
        } else {
            this.f5103d.m33833b(latLng);
        }
    }

    /* renamed from: h */
    private void m33814h() {
        if (this.f5107h == 5 && this.f5108i == 1) {
            this.f5106g.mo32909a(C2104d.EnumC2105a.SHOWDOUBLEPOI);
            C1882h.m33763a(this.f5106g.f5919d).m33764a(0);
        }
        this.f5107h = this.f5108i;
    }

    /* renamed from: i */
    private void m33813i() {
        this.f5121w = this.f5106g.m32980i().m32234k();
        if (!this.f5122x && this.f5121w) {
            C1882h.m33763a(this.f5106g.f5919d).m33764a(0);
        }
        this.f5122x = this.f5121w;
    }

    /* renamed from: j */
    private void m33812j() {
        int m32299e = this.f5106g.mo32890x().m32299e();
        if (this.f5107h == 6 && this.f5108i == 1) {
            this.f5102c.m33724c();
        } else if (this.f5107h == 7 && this.f5108i == 1 && this.f5106g.m33009am()) {
            this.f5106g.mo32909a(C2104d.EnumC2105a.NOTIDRONEAIR);
            C1882h.m33763a(this.f5106g.f5919d).m33764a(0);
        }
        this.f5107h = this.f5108i;
        if (this.f5108i == 6) {
            m33815g();
            if (this.f5114o) {
                return;
            }
            this.f5102c.m33733a(m32299e);
        }
    }

    /* renamed from: a */
    public void m33826a() {
        int m33811a = C1877d.m33782p().m33811a();
        if (m33811a != 0) {
            switch (m33811a) {
                case 1:
                    FlyActionBean m33784n = C1877d.m33782p().m33784n();
                    if (2 == m33784n.getType()) {
                        this.f5102c.m33730a(m33784n);
                    } else {
                        C1877d.m33782p().m33779s();
                        this.f5106g.mo32909a(C2104d.EnumC2105a.CLEARDATA);
                    }
                    this.f5106g.mo32909a(C2104d.EnumC2105a.SHOWHEIGHTVIEW);
                    return;
                case 2:
                    this.f5101b.m33775b();
                    return;
                case 3:
                    this.f5104e.m33741h();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void m33823a(LatLng latLng, int i) {
        if (!C1877d.m33782p().m33790h()) {
            if (this.f5100a.m33765a().get() == 1) {
                this.f5102c.mo33728a(latLng, i);
                return;
            } else if (this.f5100a.m33765a().get() == 2) {
                this.f5101b.mo33728a(latLng, i);
                return;
            } else {
                if (this.f5100a.m33765a().get() == 3) {
                }
                return;
            }
        }
        C8615g m33791g = C1877d.m33782p().m33791g();
        if (m33791g == null) {
            return;
        }
        m33791g.m11012i();
        FlyActionBean flyActionBean = (FlyActionBean) m33791g.m11006o();
        if (flyActionBean.getModelType() == 1) {
            m33791g.m11029a(C1884j.m33757a(this.f5106g.f5919d, (int) C1704R.C1705drawable.icon_fly_waypoint_blue, Math.round(flyActionBean.getHeight()), false));
        }
        C1877d.m33782p().m33806a((C8615g) null);
        C1877d.m33782p().m33803a(false);
    }

    /* renamed from: a */
    public void m33822a(C8615g c8615g) {
        FlyActionSettingFragment flyActionSettingFragment = (FlyActionSettingFragment) this.f5116q.findFragmentById(C1704R.C1706id.flyaction);
        FlyActionBean flyActionBean = c8615g.m11006o() instanceof FlyActionBean ? (FlyActionBean) c8615g.m11006o() : null;
        List<C8615g> m33789i = C1877d.m33782p().m33789i();
        if (m33789i == null || flyActionBean == null) {
            return;
        }
        if (flyActionBean.getModelType() == 1) {
            C1877d.m33782p().m33799b(flyActionBean);
        } else if (flyActionBean.getModelType() == 2) {
            C1877d.m33782p().m33796c(flyActionBean);
        } else if (flyActionBean.getModelType() == 3) {
            C1877d.m33782p().m33808a(flyActionBean);
        }
        for (C8615g c8615g2 : m33789i) {
            FlyActionBean flyActionBean2 = (FlyActionBean) c8615g2.m11006o();
            if (c8615g2.m11006o() == null || !c8615g2.m11006o().equals(flyActionBean)) {
                if (flyActionSettingFragment != null && flyActionSettingFragment.isVisible() && 2 == flyActionBean.getType() && flyActionBean2 != null) {
                    c8615g2.m11029a(C1884j.m33757a(this.f5106g.f5919d, (int) C1704R.C1705drawable.icon_fly_waypoint_blue, flyActionBean2.getHeight(), false));
                    flyActionBean2.setDrawableRes(C1704R.C1705drawable.icon_fly_waypoint_blue);
                }
            } else if (flyActionSettingFragment != null) {
                if (flyActionSettingFragment.isVisible()) {
                    this.f5106g.mo32909a(C2104d.EnumC2105a.SHOWHEIGHTVIEW);
                    if (flyActionBean.getModelType() == 1) {
                        flyActionBean2.setDrawableRes(C1704R.C1705drawable.icon_fly_waypoint_red);
                        c8615g.m11029a(C1884j.m33757a(this.f5106g.f5919d, (int) C1704R.C1705drawable.icon_fly_waypoint_red, flyActionBean2.getHeight(), true));
                        C1877d.m33782p().m33803a(true);
                        C1877d.m33782p().m33799b(flyActionBean2);
                        C1877d.m33782p().m33806a(c8615g2);
                    }
                } else if (C1877d.m33782p().m33811a() == 1) {
                    this.f5102c.m33720e();
                } else if (C1877d.m33782p().m33811a() == 2) {
                    c8615g.m11027a(this.f5106g.f5919d.getString(C1704R.C1707string.delete_marker));
                    c8615g.m11013h();
                } else if (C1877d.m33782p().m33811a() == 3) {
                    c8615g.m11027a(this.f5106g.f5919d.getString(C1704R.C1707string.delete_marker));
                    c8615g.m11013h();
                }
            }
        }
    }

    /* renamed from: b */
    public void m33821b() {
        if (this.f5100a.m33765a().get() == 1) {
            this.f5102c.m33722d();
            return;
        }
        if (this.f5100a.m33765a().get() == 2 || this.f5100a.m33765a().get() == 3) {
        }
    }

    /* renamed from: c */
    public void m33819c() {
        this.f5109j = true;
        this.f5110k = true;
        this.f5111l = true;
        this.f5112m = true;
        this.f5119u = true;
        this.f5120v = true;
        this.f5118t = true;
        C1877d.m33782p().m33786l().clear();
    }

    /* renamed from: d */
    public void m33818d() {
        this.f5106g.mo32908a(this);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case UPDATE_FLYZONE:
                this.f5102c.m33714i();
                this.f5101b.m33768i();
                this.f5103d.m33827h();
                if (!this.f5104e.m33737l()) {
                    return;
                }
                this.f5104e.m33740i();
                return;
            case CLEARTAKEPHOTO:
                this.f5103d.m33832c();
                return;
            case CREATEPOI:
                this.f5104e.m33753a();
                return;
            case CLEANALLOBJ:
                m33819c();
                this.f5109j = true;
                C1877d.m33782p().m33779s();
                this.f5102c.m33726b();
                this.f5101b.m33775b();
                this.f5104e.m33741h();
                this.f5103d.m33832c();
                return;
            case SHOWINFORWINDOW:
                this.f5102c.m33720e();
                return;
            case RETURNASSIGNWAYPOINT:
                this.f5115p = true;
                if (!this.f5117s.hasMessages(11)) {
                    this.f5117s.sendEmptyMessageDelayed(11, 2000L);
                } else {
                    this.f5117s.removeMessages(11);
                    this.f5117s.sendEmptyMessageDelayed(11, 2000L);
                }
                C2324bc mo32897q = c2083a.mo32897q();
                if (mo32897q.m32099e() == 51) {
                    List<C8615g> m33789i = C1877d.m33782p().m33789i();
                    if (m33789i != null && m33789i.size() == 0) {
                        LatLng latLng = new LatLng(mo32897q.m32096h(), mo32897q.m32106b());
                        C1877d.m33782p().m33801b((int) mo32897q.m32096h());
                        C1877d.m33782p().m33797c(mo32897q.m32095i());
                        this.f5101b.m33776a(false);
                        this.f5101b.mo33728a(latLng, C1704R.C1705drawable.img_fly_flag_blue);
                        if (this.f5119u) {
                            this.f5119u = false;
                            this.f5101b.m33767j();
                            this.f5101b.m33768i();
                        }
                    }
                    this.f5101b.m33778a();
                }
                C1852c.m33907a(mo32897q.m32101d());
                C2523d.m31374a(c2083a).m31362f(133);
                return;
            case RESHWAYPOINT:
                this.f5114o = true;
                if (!this.f5117s.hasMessages(this.f5113n)) {
                    this.f5117s.sendEmptyMessageDelayed(this.f5113n, 3000L);
                }
                this.f5102c.m33734a();
                if (!this.f5118t) {
                    return;
                }
                this.f5118t = false;
                this.f5102c.m33713j();
                return;
            case HEARDATA:
                this.f5108i = c2083a.m33001au().m32392e();
                return;
            case CLEARDATA:
            case CANCALFLYACTION:
                this.f5102c.m33726b();
                this.f5101b.m33775b();
                this.f5104e.m33741h();
                C1877d.m33782p().m33779s();
                c2083a.mo32909a(C2104d.EnumC2105a.CLEARPOIDATA);
                return;
            case ExecuteWaypoint:
                this.f5114o = true;
                if (!this.f5117s.hasMessages(this.f5113n)) {
                    this.f5117s.sendEmptyMessageDelayed(this.f5113n, 3000L);
                }
                this.f5102c.m33734a();
                return;
            case HEARDDAY:
                if (this.f5100a.m33765a().get() == 1) {
                    if (!this.f5109j || C1877d.m33782p().m33786l().size() >= 1 || this.f5108i != 6) {
                        m33812j();
                    } else {
                        this.f5109j = false;
                        c2083a.mo32909a(C2104d.EnumC2105a.READWAYPOINT);
                    }
                } else if (this.f5100a.m33765a().get() == 2) {
                    if (!this.f5110k || C1877d.m33782p().m33786l().size() >= 1 || this.f5108i != 4) {
                        if (this.f5108i == 4) {
                            m33815g();
                            this.f5101b.m33771f();
                        }
                        m33817e();
                    } else {
                        this.f5110k = false;
                        c2083a.mo32909a(C2104d.EnumC2105a.READFLYTO);
                    }
                } else if (this.f5100a.m33765a().get() == 3) {
                    if (!this.f5111l || C1877d.m33782p().m33786l().size() >= 1 || this.f5108i != 5) {
                        if (this.f5108i == 5) {
                            m33815g();
                        }
                        m33814h();
                    } else {
                        this.f5111l = false;
                        c2083a.mo32909a(C2104d.EnumC2105a.READPOI);
                    }
                } else if (this.f5100a.m33765a().get() != 4) {
                    this.f5107h = 0;
                } else if (!this.f5112m || !this.f5103d.m33828g() || this.f5108i != 10) {
                    if (this.f5108i == 10) {
                        m33815g();
                    }
                    m33816f();
                } else {
                    this.f5112m = false;
                    C2523d.m31374a(c2083a).m31383a((byte) 19, (byte) 0, (short) 0, (short) 0, (byte) 0, (short) 0, 0.0f, 0.0f);
                }
                m33813i();
                return;
            case DRONEINFLOOR:
            case NOTIDRONEFLOOR:
                this.f5102c.m33718f();
                this.f5101b.m33770g();
                this.f5104e.m33745d();
                return;
            case NOTIDRONEAIR:
                this.f5102c.m33716g();
                this.f5101b.m33769h();
                this.f5104e.m33744e();
                return;
            case HIDEINFORWINDOW:
                this.f5102c.m33715h();
                return;
            case SHOWQUITDOUBLEINFRWINDOW:
                this.f5115p = true;
                this.f5101b.m33772e();
                return;
            case DELETE_WAYPOINT:
                m33826a();
                return;
            case RETURNINTERESTWAYPOIT:
                C2315au mo32895s = c2083a.mo32895s();
                if (mo32895s.m32160j() == 22 && C1877d.m33782p().m33786l().size() < 1 && this.f5108i == 5) {
                    FlyActionBean flyActionBean = new FlyActionBean();
                    flyActionBean.setYaw_mode(mo32895s.m32168b() / 10);
                    flyActionBean.setLatLng(new LatLng(mo32895s.m32162h(), mo32895s.m32161i()));
                    flyActionBean.setDrawableRes(C1704R.C1705drawable.img_fly_flag_blue);
                    flyActionBean.setCanclick(true);
                    flyActionBean.setType(1);
                    flyActionBean.setModelType(3);
                    flyActionBean.setStyleInfo(2);
                    flyActionBean.setStart_point_agle((short) (mo32895s.m32166d() * 1.412d));
                    flyActionBean.setSpeek(mo32895s.m32165e() / 10);
                    flyActionBean.setRidus(mo32895s.m32164f() / 10);
                    flyActionBean.setPara1(mo32895s.m32167c());
                    flyActionBean.setHeight(((int) mo32895s.m32163g()) / 10);
                    this.f5104e.m33751a(flyActionBean);
                    if (this.f5120v) {
                        this.f5120v = false;
                        this.f5104e.m33739j();
                    }
                } else {
                    this.f5104e.m33743f();
                    this.f5104e.m33738k();
                }
                c2083a.mo32909a(C2104d.EnumC2105a.CLOSECARMERPOI);
                return;
            case SHOWDOUBLEPOI:
                this.f5104e.m33744e();
                return;
            case TAKEPHOTOBACKDATA:
                C2286a m33026aA = c2083a.m33026aA();
                if (m33026aA.m32423j() != 18) {
                    this.f5103d.m33835a(new LatLng(m33026aA.m32430c(), m33026aA.m32428e()));
                    this.f5103d.m33834b();
                    return;
                }
                this.f5115p = true;
                if (!this.f5117s.hasMessages(11)) {
                    this.f5117s.sendEmptyMessageDelayed(11, 2000L);
                    return;
                }
                this.f5117s.removeMessages(11);
                this.f5117s.sendEmptyMessageDelayed(11, 2000L);
                return;
            case QUITTAKEPHOTOFLY:
                this.f5115p = true;
                return;
            case CLEARMARKERTAKEPHOTO:
                this.f5103d.m33832c();
                return;
            case ENTRYTAKEPHOTOMODEL:
                this.f5103d.m33836a();
                return;
            case CHANGETAKEPHOTOMARKERCOLOR:
                this.f5103d.m33834b();
                return;
            default:
                return;
        }
    }
}
