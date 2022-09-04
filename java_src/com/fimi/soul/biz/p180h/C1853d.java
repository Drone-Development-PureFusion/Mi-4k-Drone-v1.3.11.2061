package com.fimi.soul.biz.p180h;

import android.content.Context;
import android.os.Handler;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.entity.DroneModelBean;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.module.droneFragment.C2654i;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.DialogC3095aq;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;
/* renamed from: com.fimi.soul.biz.h.d */
/* loaded from: classes.dex */
public class C1853d implements C2104d.AbstractC2106b {

    /* renamed from: a */
    private DroneModelBean f5031a;

    /* renamed from: b */
    private AbstractC1858e f5032b;

    /* renamed from: c */
    private C2083a f5033c;

    /* renamed from: d */
    private int f5034d;

    /* renamed from: h */
    private int f5038h;

    /* renamed from: i */
    private DialogC3095aq f5039i;

    /* renamed from: k */
    private WeakReference<Context> f5041k;

    /* renamed from: l */
    private C1859f f5042l;

    /* renamed from: o */
    private C1882h f5045o;

    /* renamed from: p */
    private boolean f5046p;

    /* renamed from: r */
    private int f5048r;

    /* renamed from: e */
    private int f5035e = 20;

    /* renamed from: f */
    private int f5036f = 20;

    /* renamed from: g */
    private int f5037g = 100;

    /* renamed from: j */
    private boolean f5040j = true;

    /* renamed from: m */
    private Handler f5043m = new Handler();

    /* renamed from: n */
    private Runnable f5044n = new Runnable() { // from class: com.fimi.soul.biz.h.d.1
        @Override // java.lang.Runnable
        public void run() {
            C1853d.this.m33899c();
        }
    };

    /* renamed from: q */
    private Observer f5047q = new Observer() { // from class: com.fimi.soul.biz.h.d.2
        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            C1853d.this.m33902b();
            switch (C1853d.this.f5035e) {
                case 1:
                case 2:
                    if (C1853d.this.f5031a.getCurrentFlightModel() == 7 && C1853d.this.f5035e != 2) {
                        C1853d.this.f5032b.mo31159a(C1704R.C1707string.comtohome);
                        C1853d.this.f5042l.m33883a(C1853d.this.f5033c.f5919d.getString(C1704R.C1707string.comtohome));
                        C1853d.this.f5033c.mo32909a(C2104d.EnumC2105a.NOTIDRONEFLOOR);
                        return;
                    } else if (C1853d.this.f5031a.getCurrentFlightModel() != 3) {
                        C1853d.this.f5032b.mo31159a(C1704R.C1707string.comtakeoff);
                        C1853d.this.f5042l.m33883a(C1853d.this.f5033c.f5919d.getString(C1704R.C1707string.comtakeoff));
                        return;
                    } else {
                        C1853d.this.f5032b.mo31159a(C1704R.C1707string.comalding);
                        C1853d.this.f5042l.m33883a(C1853d.this.f5033c.f5919d.getString(C1704R.C1707string.comalding));
                        C1853d.this.f5033c.mo32909a(C2104d.EnumC2105a.NOTIDRONEFLOOR);
                        return;
                    }
                default:
                    return;
            }
        }
    };

    public C1853d(AbstractC1858e abstractC1858e, C2083a c2083a, Context context) {
        this.f5032b = abstractC1858e;
        this.f5031a = new DroneModelBean(c2083a);
        this.f5031a.addObserver(this.f5047q);
        this.f5033c = c2083a;
        this.f5041k = new WeakReference<>(context);
        this.f5042l = new C1859f(c2083a);
        this.f5045o = C1882h.m33763a(context);
    }

    /* renamed from: a */
    private void m33905a(int i) {
        this.f5032b.mo31159a(i);
    }

    /* renamed from: b */
    private void m33901b(int i) {
        this.f5032b.mo31148b(i);
    }

    /* renamed from: f */
    private void m33893f() {
        if (this.f5033c.m33001au().m32390g().judgeNoAction()) {
            m33889i();
            m33888j();
        }
    }

    /* renamed from: g */
    private void m33891g() {
        if ((!this.f5033c.m33001au().m32390g().isEnterModel() || this.f5033c.m32980i().m32234k() || this.f5036f == 0) && !m33906a()) {
            if (this.f5048r != 0) {
                this.f5048r = 0;
            }
            this.f5032b.mo31158a(0, 4);
            return;
        }
        this.f5048r++;
        if (this.f5048r <= 3) {
            return;
        }
        this.f5032b.mo31158a(C1704R.C1707string.exit, 0);
        this.f5048r = 0;
    }

    /* renamed from: h */
    private void m33890h() {
        if (!this.f5033c.m33009am() && !this.f5033c.m33005aq()) {
            if (!this.f5033c.m32999aw().m32257j() || this.f5033c.m33001au().m32397a() != 0) {
                m33905a(C1704R.C1707string.self_error_result);
                m33901b(C1704R.C1705drawable.notnormal_icon);
                return;
            }
            m33905a(C1704R.C1707string.attibase);
            m33901b(C1704R.C1705drawable.icon_flight_model_atti3x);
        } else if (this.f5035e == 2 && !this.f5033c.m33009am() && this.f5034d == 1) {
            m33905a(C1704R.C1707string.lightstreamfly);
            m33901b(C1704R.C1705drawable.icon_flight_model_vpu3x);
        } else if (this.f5035e == 1 && !this.f5033c.m33009am() && this.f5034d == 1) {
            m33905a(C1704R.C1707string.gpsfly);
            this.f5046p = false;
            m33901b(C1704R.C1705drawable.icon_flight_model_gps3x);
        } else if (this.f5035e == 0 && !this.f5033c.m33009am() && this.f5034d == 1) {
            m33905a(C1704R.C1707string.attibase);
            m33901b(C1704R.C1705drawable.icon_flight_model_atti3x);
        } else if (this.f5035e == 2 && this.f5033c.m33009am() && this.f5034d == 1) {
            m33905a(C1704R.C1707string.lightstreamfling);
            m33901b(C1704R.C1705drawable.icon_flight_model_vpu3x);
        } else if (this.f5035e == 1 && this.f5033c.m33009am() && this.f5034d == 1) {
            m33905a(C1704R.C1707string.gpsfling);
            m33901b(C1704R.C1705drawable.icon_flight_model_gps3x);
            m33887k();
        } else if (this.f5035e == 0 && this.f5033c.m33009am() && this.f5034d == 1) {
            m33905a(C1704R.C1707string.attfling);
            m33901b(C1704R.C1705drawable.icon_flight_model_atti3x);
        } else if (this.f5034d == 7) {
            m33905a(C1704R.C1707string.tohome);
            m33901b(C1704R.C1705drawable.sailround_icon);
            if (!this.f5033c.m32980i().m32234k()) {
                return;
            }
            m33893f();
        } else if (this.f5034d == 8) {
            m33893f();
            m33905a(C1704R.C1707string.returntohome);
            m33901b(C1704R.C1705drawable.sailround_icon);
            if (!this.f5040j || this.f5039i != null) {
                return;
            }
            this.f5040j = false;
            this.f5042l.m33883a(this.f5033c.f5919d.getResources().getString(C1704R.C1707string.returntohome));
            this.f5039i = new DialogC3095aq(this.f5041k.get(), new DialogC3095aq.AbstractC3097a() { // from class: com.fimi.soul.biz.h.d.3
                @Override // com.fimi.soul.utils.DialogC3095aq.AbstractC3097a
                /* renamed from: a */
                public void mo29281a() {
                    if (C1853d.this.f5039i != null) {
                        C1853d.this.f5039i.dismiss();
                        C1853d.this.f5039i = null;
                    }
                }
            }, 3);
            this.f5039i.setCancelable(true);
            this.f5039i.show();
        } else if (this.f5034d == 3) {
            m33905a(C1704R.C1707string.landing);
            m33901b(C1704R.C1705drawable.landing_icon);
            m33893f();
        } else if (this.f5034d == 9) {
            m33893f();
            if (C3103au.m29242a((byte) this.f5038h) == 3) {
                m33905a(C1704R.C1707string.low_power_landing);
            } else if (C3103au.m29242a((byte) this.f5038h) == 4) {
                m33905a(C1704R.C1707string.lowlanding);
            } else {
                m33905a(C1704R.C1707string.lowlanding);
            }
            m33901b(C1704R.C1705drawable.landing_icon);
        } else if (this.f5034d == 2) {
            m33905a(C1704R.C1707string.take_off);
            m33901b(C1704R.C1705drawable.takeoff_icon);
        } else if (this.f5034d == 4) {
            this.f5046p = true;
            if (this.f5036f == 4) {
                m33905a(C1704R.C1707string.stopflyto);
                m33901b(C1704R.C1705drawable.destination_icon);
            } else if (this.f5036f != 2) {
            } else {
                m33905a(C1704R.C1707string.flyto);
                m33901b(C1704R.C1705drawable.destination_icon);
            }
        } else if (this.f5034d == 5) {
            if (this.f5036f == 4) {
                m33905a(C1704R.C1707string.stop_poi_fly);
                m33901b(C1704R.C1705drawable.detouringpoint_icon);
            } else if (this.f5036f != 2) {
            } else {
                m33905a(C1704R.C1707string.interestFly);
                m33901b(C1704R.C1705drawable.detouringpoint_icon);
            }
        } else if (this.f5034d == 6) {
            this.f5046p = true;
            if (this.f5036f == 4) {
                m33905a(C1704R.C1707string.stopwaypoint);
                m33901b(C1704R.C1705drawable.icon_fly_airline);
            } else if (this.f5036f != 2) {
            } else {
                m33905a(C1704R.C1707string.execuwaypoint);
                m33901b(C1704R.C1705drawable.icon_fly_airline);
            }
        } else if (this.f5034d != 10) {
            m33905a(C1704R.C1707string.condrone);
            m33901b(C1704R.C1705drawable.normal_icon);
        } else if (this.f5036f == 4) {
            m33905a(C1704R.C1707string.stoptake_photo);
            m33901b(C1704R.mipmap.icon_fly_mode_selfie);
        } else if (this.f5036f != 2) {
        } else {
            m33905a(C1704R.C1707string.take_photo_fly);
            m33901b(C1704R.mipmap.icon_fly_mode_selfie);
        }
    }

    /* renamed from: i */
    private void m33889i() {
        this.f5033c.mo32909a(C2104d.EnumC2105a.CLOSEFLYACTIONFRAGMENT);
    }

    /* renamed from: j */
    private void m33888j() {
        this.f5046p = false;
        this.f5033c.mo32909a(C2104d.EnumC2105a.NOTIDRONEFLOOR);
        this.f5033c.mo32909a(C2104d.EnumC2105a.HOME_RIGHT);
    }

    /* renamed from: k */
    private void m33887k() {
        if (!this.f5046p) {
            this.f5046p = true;
            this.f5033c.mo32909a(C2104d.EnumC2105a.NOTIDRONEAIR);
        }
        this.f5033c.mo32909a(C2104d.EnumC2105a.HOME_LEFT);
    }

    /* renamed from: a */
    public boolean m33906a() {
        return C3103au.m29242a((byte) this.f5038h) == 3;
    }

    /* renamed from: b */
    public void m33902b() {
        C2654i.m30859a(false);
        this.f5043m.postDelayed(this.f5044n, 5000L);
    }

    /* renamed from: c */
    public void m33899c() {
        C2654i.m30859a(true);
    }

    /* renamed from: d */
    public void m33897d() {
        if (this.f5042l != null) {
            this.f5042l.m33886a();
        }
        this.f5033c.mo32903b(this);
    }

    /* renamed from: e */
    public void m33895e() {
        if (this.f5042l != null) {
            this.f5042l.m33882b();
        }
        this.f5033c.mo32908a(this);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (!c2083a.mo32905ac() || !c2083a.mo32906ab().mo32588a()) {
            return;
        }
        switch (enumC2105a) {
            case DRONEERRORACTIONCODE:
            default:
                return;
            case SENDHOVERWAYPOINT:
                C2540a.m31307a().m31305a("147");
                return;
            case RETAKEUP:
                C2540a.m31307a().m31305a("146");
                return;
            case RELANDING:
                C2540a.m31307a().m31305a("145");
                c2083a.mo32909a(C2104d.EnumC2105a.NOTIDRONEFLOOR);
                return;
            case REHOME:
                C2540a.m31307a().m31305a("144");
                c2083a.mo32909a(C2104d.EnumC2105a.NOTIDRONEFLOOR);
                return;
            case NEWFRONEMODEL:
                this.f5034d = c2083a.m33001au().m32392e();
                this.f5038h = c2083a.m33001au().m32389h();
                this.f5035e = c2083a.m33001au().m32393d();
                this.f5036f = c2083a.m33001au().m32391f();
                this.f5031a.setFlightModel(this.f5034d, this.f5035e);
                m33891g();
                if (this.f5034d != 8) {
                    this.f5040j = true;
                }
                if (C2654i.m30854d().get()) {
                    m33890h();
                }
                if (this.f5037g == 5 && this.f5034d != 5) {
                    this.f5042l.m33883a(c2083a.f5919d.getString(C1704R.C1707string.poi_point_com));
                }
                if (this.f5037g != 10 && this.f5034d == 10) {
                    c2083a.mo32909a(C2104d.EnumC2105a.ENTRYTAKEPHOTOMODEL);
                }
                this.f5037g = this.f5034d;
                return;
        }
    }
}
