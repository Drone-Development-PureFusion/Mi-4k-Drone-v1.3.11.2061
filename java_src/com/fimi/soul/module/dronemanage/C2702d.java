package com.fimi.soul.module.dronemanage;

import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.internal.view.SupportMenu;
import android.util.DisplayMetrics;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p180h.C1864j;
import com.fimi.soul.biz.p186n.C2018a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.drone.p205i.C2302ah;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2332bk;
import com.fimi.soul.module.droneFragment.C2629c;
import com.fimi.soul.module.droneFragment.C2652g;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3125i;
import com.google.android.gms.maps.C8499b;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8610b;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.module.dronemanage.d */
/* loaded from: classes.dex */
public class C2702d implements C2104d.AbstractC2106b {

    /* renamed from: B */
    private boolean f9261B;

    /* renamed from: a */
    PolylineOptions f9262a;

    /* renamed from: b */
    List<C2332bk> f9263b;

    /* renamed from: f */
    private C8500c f9267f;

    /* renamed from: g */
    private Context f9268g;

    /* renamed from: h */
    private C2083a f9269h;

    /* renamed from: i */
    private LatLng f9270i;

    /* renamed from: m */
    private C8615g f9274m;

    /* renamed from: n */
    private float f9275n;

    /* renamed from: o */
    private int f9276o;

    /* renamed from: p */
    private boolean f9277p;

    /* renamed from: q */
    private int f9278q;

    /* renamed from: r */
    private int f9279r;

    /* renamed from: s */
    private C1681v f9280s;

    /* renamed from: x */
    private C8617i f9285x;

    /* renamed from: y */
    private C8617i f9286y;

    /* renamed from: j */
    private LatLng f9271j = null;

    /* renamed from: k */
    private int f9272k = 20;

    /* renamed from: l */
    private boolean f9273l = true;

    /* renamed from: t */
    private String f9281t = C2279c.f7231bG;

    /* renamed from: u */
    private String f9282u = C2279c.f7232bH;

    /* renamed from: v */
    private final int f9283v = 100;

    /* renamed from: w */
    private Handler f9284w = new Handler() { // from class: com.fimi.soul.module.dronemanage.d.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100 || C1648b.m34863b(C2702d.this.f9269h.f5919d) == null) {
                return;
            }
            C1648b.m34863b(C2702d.this.f9269h.f5919d).m34867a(C2702d.this.f9269h.f5919d.getString(C1704R.C1707string.set_home));
        }
    };

    /* renamed from: d */
    PolylineOptions f9265d = null;

    /* renamed from: z */
    private List<LatLng> f9287z = new ArrayList();

    /* renamed from: A */
    private float f9260A = 0.0f;

    /* renamed from: e */
    int f9266e = 0;

    /* renamed from: c */
    C2652g f9264c = C2652g.m30871a();

    public C2702d(C8500c c8500c, Context context, C2083a c2083a) {
        this.f9267f = c8500c;
        this.f9268g = context;
        this.f9269h = c2083a;
        m30577a();
    }

    /* renamed from: a */
    private double m30570a(C8615g c8615g, C2332bk c2332bk, LatLng latLng) {
        double m29318a = C3077ae.m29349c(latLng, c2332bk.m32043b()).m29318a();
        if (C1642c.m34885e().m34501p()) {
            c8615g.m11027a(this.f9268g.getResources().getString(C1704R.C1707string.distancetag) + C1679t.m34553b(m29318a) + this.f9268g.getResources().getString(C1704R.C1707string.foot_unit));
            return C1679t.m34553b(m29318a);
        }
        c8615g.m11027a(this.f9268g.getResources().getString(C1704R.C1707string.distancetag) + C1679t.m34556a(m29318a, 1) + this.f9268g.getResources().getString(C1704R.C1707string.meter));
        return m29318a;
    }

    /* renamed from: a */
    private void m30576a(C2302ah c2302ah) {
        this.f9270i = new LatLng(c2302ah.m32302b(), c2302ah.m32301c());
        this.f9264c.m30870a(this.f9267f, new LatLng(c2302ah.m32302b(), c2302ah.m32301c()));
        this.f9264c.m30869a(C2279c.f7169Y);
    }

    /* renamed from: b */
    private void m30568b(LatLng latLng) {
        DisplayMetrics displayMetrics = this.f9268g.getResources().getDisplayMetrics();
        Point m11482a = this.f9267f.m11554n().m11482a(latLng);
        if (m11482a.y <= displayMetrics.heightPixels && m11482a.y >= 0 && m11482a.x >= 0 && m11482a.x <= displayMetrics.widthPixels) {
            this.f9269h.mo32909a(C2104d.EnumC2105a.CHANGELOCATIONBUTTONIN);
            return;
        }
        this.f9269h.mo32909a(C2104d.EnumC2105a.CHANGELOCATIONBUTTONOUT);
        if (this.f9269h.mo32894t().m32334a() / 100.0d < 1.0d) {
            return;
        }
        this.f9267f.m11609a(C8499b.m11619a(latLng, this.f9260A));
    }

    /* renamed from: c */
    private void m30566c(LatLng latLng) {
        if (this.f9269h.m33009am()) {
            m30557h(latLng);
            m30558g(latLng);
        } else if (this.f9285x != null) {
            this.f9285x.m10985a();
        }
        m30560f(latLng);
        m30562e(latLng);
        m30564d(latLng);
    }

    /* renamed from: d */
    private void m30564d(LatLng latLng) {
        if (this.f9263b != null && this.f9263b.size() > 0 && this.f9272k == 6 && this.f9276o > 0 && this.f9276o <= this.f9263b.size()) {
            m30570a(this.f9274m, this.f9263b.get(this.f9276o - 1), latLng);
            if (this.f9272k != 6) {
                return;
            }
            this.f9274m.m11013h();
        } else if (this.f9272k != 4) {
            if (!this.f9274m.m11011j() || C2629c.m30948d().get() == 1) {
                return;
            }
            this.f9274m.m11012i();
        } else if (this.f9263b == null || this.f9263b.size() <= 0) {
        } else {
            m30570a(this.f9274m, this.f9263b.get(0), latLng);
            this.f9274m.m11013h();
        }
    }

    /* renamed from: e */
    private void m30563e() {
        LatLngBounds.C8570a c8570a = new LatLngBounds.C8570a();
        Location m32995b = this.f9269h.m32995b();
        if (this.f9271j != null) {
            c8570a.m11360a(this.f9271j);
        }
        if (m32995b != null && this.f9269h.m33016ae()) {
            c8570a.m11360a(new LatLng(m32995b.getLatitude(), m32995b.getLongitude()));
        }
        if (this.f9270i != null) {
            c8570a.m11360a(this.f9270i);
        }
        if (this.f9269h.m33016ae() || this.f9271j == null) {
            m30572a(c8570a.m11362a());
        } else {
            this.f9267f.m11569b(C8499b.m11621a(CameraPosition.m11424a(this.f9271j, 18.0f)));
        }
        C2018a m33233a = C2018a.m33233a();
        m33233a.m33228a(true);
        m33233a.m33230a(C2018a.EnumC2021a.DRONE);
    }

    /* renamed from: e */
    private void m30562e(LatLng latLng) {
        if (this.f9274m != null) {
            C2629c.m30949c().m30954a(this.f9269h);
            this.f9274m.m11030a(latLng);
        } else {
            this.f9274m = this.f9267f.m11577a(new MarkerOptions().m11353a(latLng).m11352a(C8610b.m11086a((int) C1704R.C1705drawable.icon_fly_handpiece_location)).m11350a(false));
        }
        this.f9274m.m11031a(0.5f, 0.5f);
        if (this.f9275n < 0.0f) {
            this.f9275n += 360.0f;
        }
        this.f9274m.m11024b(this.f9275n - m30559g());
    }

    /* renamed from: f */
    private void m30561f() {
        if (!this.f9269h.mo32905ac()) {
            if (!this.f9269h.mo32906ab().mo32588a()) {
                if (this.f9274m != null) {
                    this.f9274m.m11033a();
                    this.f9274m = null;
                    C2652g.m30871a().m30867b(C2279c.f7168X);
                }
                if (this.f9286y != null) {
                    this.f9286y.m10985a();
                    this.f9286y = null;
                }
                if (this.f9285x != null) {
                    this.f9285x.m10985a();
                    this.f9285x = null;
                }
                C2652g.m30871a().m30867b(C2279c.f7169Y);
            } else if (this.f9286y != null && !this.f9286y.m10971h()) {
                this.f9286y.m10978b(true);
            }
            C2629c.m30946f();
        }
    }

    /* renamed from: f */
    private void m30560f(LatLng latLng) {
        if (this.f9267f.m11613a() != null) {
            this.f9260A = this.f9267f.m11613a().f27431b;
        }
        if (!this.f9273l || this.f9271j.f27462a <= 1.0d || this.f9271j.f27463b <= 1.0d || this.f9269h.mo32891w().m32191d() < 6) {
            return;
        }
        this.f9266e++;
        this.f9269h.m32983g(true);
        this.f9260A = 18.0f;
        if (!this.f9269h.m33009am()) {
            this.f9273l = false;
            this.f9261B = false;
            this.f9267f.m11569b(C8499b.m11619a(this.f9271j, this.f9260A));
        } else if (this.f9261B) {
        } else {
            LatLngBounds.C8570a c8570a = new LatLngBounds.C8570a();
            Location m32995b = this.f9269h.m32995b();
            c8570a.m11360a(this.f9271j);
            if (m32995b != null) {
                c8570a.m11360a(new LatLng(m32995b.getLatitude(), m32995b.getLongitude()));
            }
            if (this.f9270i != null) {
                c8570a.m11360a(this.f9270i);
            }
            if (m32995b != null || this.f9271j == null) {
                m30572a(c8570a.m11362a());
            } else {
                this.f9267f.m11569b(C8499b.m11621a(CameraPosition.m11424a(this.f9271j, 18.0f)));
            }
            this.f9261B = true;
        }
    }

    /* renamed from: g */
    private synchronized float m30559g() {
        float f = 0.0f;
        synchronized (this) {
            try {
                CameraPosition m11613a = this.f9267f.m11613a();
                if (m11613a != null) {
                    f = m11613a.f27433d;
                }
            } catch (Exception e) {
            }
        }
        return f;
    }

    /* renamed from: g */
    private void m30558g(LatLng latLng) {
        if (this.f9270i != null) {
            this.f9287z.add(latLng);
            this.f9287z.add(this.f9270i);
            if (this.f9265d == null) {
                this.f9265d = new PolylineOptions();
                this.f9265d.m11303a(this.f9269h.f5919d.getResources().getColor(C1704R.color.drone_home_line)).m11304a(5.0f);
            }
            if (this.f9286y != null && this.f9286y.m10971h()) {
                this.f9286y.m10985a();
                this.f9286y = null;
            }
            if (this.f9286y != null) {
                this.f9286y.m10982a(this.f9287z);
                if (!this.f9286y.m10972g()) {
                    this.f9286y.m10981a(true);
                }
            } else {
                this.f9286y = this.f9267f.m11575a(this.f9265d.m11299a(latLng, this.f9270i));
            }
            this.f9287z.clear();
        }
    }

    /* renamed from: h */
    private void m30557h(LatLng latLng) {
        if (this.f9285x != null) {
            this.f9285x.m10985a();
        }
        this.f9285x = this.f9267f.m11575a(m30573a(latLng));
    }

    /* renamed from: a */
    public PolylineOptions m30573a(LatLng latLng) {
        if (this.f9262a == null) {
            this.f9262a = new PolylineOptions();
            this.f9262a.m11296b(true);
            this.f9262a.m11304a(3.0f);
            this.f9262a.m11303a(SupportMenu.CATEGORY_MASK);
        }
        this.f9262a.m11302a(latLng);
        List<LatLng> m11298b = this.f9262a.m11298b();
        if (m11298b != null && m11298b.size() >= 10) {
            m11298b.remove(m11298b.get(0));
        }
        return this.f9262a;
    }

    /* renamed from: a */
    public void m30577a() {
        this.f9269h.mo32908a(this);
        C2629c.m30949c().m30947e();
    }

    /* renamed from: a */
    public void m30572a(LatLngBounds latLngBounds) {
        this.f9267f.m11607a(C8499b.m11617a(latLngBounds, C3125i.m29082a(this.f9269h.f5919d, 50.0f), C3125i.m29082a(this.f9269h.f5919d, 50.0f), 0), new C8500c.AbstractC8526a() { // from class: com.fimi.soul.module.dronemanage.d.2
            @Override // com.google.android.gms.maps.C8500c.AbstractC8526a
            /* renamed from: a */
            public void mo11522a() {
                if (C2702d.this.f9266e >= 2) {
                    C2702d.this.f9273l = false;
                    C2702d.this.f9266e = 0;
                }
            }

            @Override // com.google.android.gms.maps.C8500c.AbstractC8526a
            /* renamed from: b */
            public void mo11521b() {
                C2702d.this.f9273l = true;
            }
        });
    }

    /* renamed from: a */
    public void m30571a(C8615g c8615g) {
        if (this.f9271j == null || this.f9274m == null) {
            return;
        }
        double m29318a = C3077ae.m29349c(this.f9271j, c8615g.m11020c()).m29318a();
        if (C1642c.m34885e().m34501p()) {
            this.f9274m.m11027a(this.f9268g.getResources().getString(C1704R.C1707string.distancetag) + C1679t.m34553b(m29318a) + this.f9268g.getResources().getString(C1704R.C1707string.foot_unit));
        } else {
            this.f9274m.m11027a(this.f9268g.getResources().getString(C1704R.C1707string.distancetag) + C1679t.m34556a(m29318a, 1) + this.f9268g.getResources().getString(C1704R.C1707string.meter));
        }
        this.f9274m.m11013h();
    }

    /* renamed from: b */
    public void m30569b() {
        this.f9273l = true;
    }

    /* renamed from: c */
    public void m30567c() {
        C2629c.m30949c().m30950b(0);
        C2629c.m30949c();
        C2629c.m30946f();
    }

    /* renamed from: d */
    public void m30565d() {
        if (this.f9274m != null) {
            this.f9274m.m11033a();
            this.f9274m = null;
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case UPDATE_FLYZONE:
                if (this.f9286y != null) {
                    this.f9286y.m10985a();
                    this.f9286y = null;
                }
                if (this.f9285x == null) {
                    return;
                }
                this.f9285x.m10985a();
                this.f9262a = null;
                return;
            case CLEANALLOBJ:
                m30561f();
                return;
            case HEARDDAY:
                if (c2083a.mo32891w().m32191d() <= 3) {
                    return;
                }
                C2311aq mo32891w = c2083a.mo32891w();
                this.f9271j = new LatLng(mo32891w.m32189f(), mo32891w.m32190e());
                c2083a.m33028a(this.f9271j);
                if (c2083a.m33001au().m32393d() == 2) {
                    return;
                }
                m30566c(this.f9271j);
                return;
            case Remotecontrol:
                m30561f();
                return;
            case HOMEPOINT:
                if (!c2083a.m33009am()) {
                    this.f9277p = false;
                    C2652g.m30871a().m30867b(C2279c.f7169Y);
                    if (this.f9286y != null) {
                        this.f9286y.m10985a();
                        this.f9286y = null;
                    }
                } else if (c2083a.mo32890x().m32298f()) {
                    m30576a(c2083a.mo32890x());
                    if (!this.f9277p && c2083a.m33001au().m32395b() == 3) {
                        this.f9277p = true;
                        this.f9280s = C1681v.m34543a(this.f9268g);
                        this.f9281t = C2279c.f7231bG;
                        this.f9282u = C2279c.f7232bH;
                        this.f9280s.m34546a().edit().putFloat(this.f9281t, (float) c2083a.mo32890x().m32302b()).commit();
                        this.f9280s.m34546a().edit().putFloat(this.f9282u, (float) c2083a.mo32890x().m32301c()).commit();
                        if (this.f9284w.hasMessages(100)) {
                            this.f9284w.removeMessages(100);
                        }
                        this.f9284w.sendEmptyMessageDelayed(100, 1500L);
                        m30563e();
                        C1864j m33867a = C1864j.m33867a();
                        m33867a.m33861b(c2083a.mo32890x().m32302b());
                        m33867a.m33866a(c2083a.mo32890x().m32301c());
                    }
                    if (this.f9279r != this.f9272k) {
                        this.f9279r = this.f9272k;
                    }
                }
                this.f9276o = c2083a.mo32890x().m32299e();
                if (this.f9278q == this.f9272k) {
                    return;
                }
                this.f9278q = this.f9272k;
                return;
            case HEARDATA:
                this.f9275n = (float) (c2083a.mo32894t().m32310k() / 10.0d);
                return;
            case NEWFRONEMODEL:
                this.f9272k = c2083a.m33001au().m32392e();
                return;
            case CHANGEFLIGHTHEAD:
                if (this.f9274m == null) {
                    return;
                }
                if (this.f9275n < 0.0f) {
                    this.f9275n += 360.0f;
                }
                this.f9274m.m11024b(this.f9275n - c2083a.m33006ap());
                return;
            default:
                return;
        }
    }
}
