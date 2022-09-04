package com.fimi.soul.module.setting.GimalCalibration;

import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.module.dronemanage.C2710h;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.soul.module.setting.GimalCalibration.a */
/* loaded from: classes.dex */
public class C2874a implements C2104d.AbstractC2106b, C2710h.AbstractC2713a {

    /* renamed from: a */
    public static int f10222a = 100;

    /* renamed from: b */
    public static final byte f10223b = 7;

    /* renamed from: c */
    public static final byte f10224c = 8;

    /* renamed from: d */
    public static final byte f10225d = 6;

    /* renamed from: e */
    public static final byte f10226e = 5;

    /* renamed from: f */
    public static final int f10227f = 2;

    /* renamed from: j */
    private static final byte f10228j = 0;

    /* renamed from: h */
    AbstractC2876a f10230h;

    /* renamed from: i */
    C2083a f10231i;

    /* renamed from: q */
    private boolean f10238q;

    /* renamed from: g */
    C2710h f10229g = null;

    /* renamed from: k */
    private final int f10232k = 0;

    /* renamed from: l */
    private final int f10233l = 1;

    /* renamed from: m */
    private final int f10234m = 2;

    /* renamed from: n */
    private final int f10235n = 3;

    /* renamed from: o */
    private final int f10236o = 4;

    /* renamed from: p */
    private final int f10237p = 5;

    /* renamed from: com.fimi.soul.module.setting.GimalCalibration.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC2876a {
        /* renamed from: a */
        void mo29930a(int i);

        /* renamed from: a */
        void mo29927a(String str);

        /* renamed from: b */
        void mo29925b();

        /* renamed from: b */
        void mo29924b(int i);

        /* renamed from: c */
        void mo29922c();

        /* renamed from: d */
        void mo29920d();

        /* renamed from: e */
        void mo29918e();
    }

    public C2874a(AbstractC2876a abstractC2876a, C2083a c2083a) {
        this.f10230h = abstractC2876a;
        this.f10231i = c2083a;
    }

    /* renamed from: b */
    private void m30123b(byte b) {
        String m30126a = m30126a(b);
        if (this.f10230h != null) {
            this.f10238q = false;
            if (m30126a != null) {
                this.f10230h.mo29927a(m30126a);
            } else {
                this.f10230h.mo29927a(this.f10231i.f5919d.getString(C1704R.C1707string.GC_califail));
            }
        }
    }

    /* renamed from: c */
    private void m30120c(byte b) {
        String m30117d = m30117d(b);
        if (this.f10230h != null) {
            this.f10238q = false;
            if (m30117d != null) {
                this.f10230h.mo29927a(m30117d);
            } else {
                this.f10230h.mo29927a((String) null);
            }
        }
    }

    /* renamed from: d */
    private C2196c m30116d(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 1;
        c2196c.f6913c = 122;
        c2196c.f6914d.m32744b((byte) i);
        return c2196c;
    }

    /* renamed from: d */
    private String m30117d(byte b) {
        for (int i = 0; i < 8; i++) {
            if (C3103au.m29241a(b, i) > 0) {
                switch (i) {
                    case 0:
                        return m30122b(C1704R.C1707string.gmail_hight_temp_tune);
                    case 1:
                        return m30122b(C1704R.C1707string.gmail_low_temp_tune);
                    case 2:
                        return m30122b(C1704R.C1707string.gmail_temperature_low_accuracy_tune);
                    case 3:
                        return m30122b(C1704R.C1707string.GC_horLine_uneven);
                    case 4:
                        return m30122b(C1704R.C1707string.GC_hight_Vibrator);
                    case 5:
                        return m30122b(C1704R.C1707string.GC_wrong_angle);
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private void m30112h() {
        int m32361b = this.f10231i.m33000av().m32361b() & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
        if (m32361b > 0) {
            m30123b((byte) m32361b);
            return;
        }
        byte m32358d = this.f10231i.m33000av().m32358d();
        this.f10230h.mo29930a(m32358d);
        if (m32358d != f10222a) {
            return;
        }
        this.f10238q = false;
        m30114f();
        this.f10230h.mo29920d();
    }

    /* renamed from: i */
    private void m30111i() {
        byte m32361b = this.f10231i.m33000av().m32361b();
        if (m32361b > 0) {
            m30120c(m32361b);
            return;
        }
        this.f10230h.mo29930a(this.f10231i.m33000av().m32358d());
    }

    /* renamed from: a */
    public String m30126a(byte b) {
        for (int i = 0; i < 8; i++) {
            if (C3103au.m29241a(b, i) > 0) {
                switch (i) {
                    case 0:
                        return m30122b(C1704R.C1707string.GC_hight_temperature);
                    case 1:
                        return m30122b(C1704R.C1707string.GC_low_temperature);
                    case 2:
                        return m30122b(C1704R.C1707string.GC_temperature_low_accuracy);
                    case 3:
                        return m30122b(C1704R.C1707string.GC_horLine_uneven);
                    case 4:
                        return m30122b(C1704R.C1707string.GC_hight_Vibrator);
                    case 5:
                        return m30122b(C1704R.C1707string.GC_wrong_angle);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m30127a() {
        C2196c m30121c = m30121c();
        this.f10231i.mo32906ab().mo32587a(m30121c);
        if (this.f10229g == null) {
            this.f10229g = C2710h.m30542a(this);
        }
        this.f10229g.m30543a(this.f10231i, m30121c);
        this.f10229g.m30541b();
        this.f10238q = true;
    }

    @Override // com.fimi.soul.module.dronemanage.C2710h.AbstractC2713a
    /* renamed from: a */
    public void mo30125a(int i) {
    }

    /* renamed from: b */
    public String m30122b(int i) {
        return this.f10231i.f5919d.getResources().getString(i);
    }

    /* renamed from: b */
    public void m30124b() {
        if (this.f10229g != null) {
            this.f10230h.mo29925b();
            this.f10229g.m30539d();
            this.f10229g.m30540c();
            this.f10229g = null;
        }
    }

    /* renamed from: c */
    public C2196c m30121c() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 2;
        c2196c.f6913c = 122;
        c2196c.f6914d.m32744b((byte) 8);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: c */
    public void m30119c(int i) {
        this.f10231i.mo32906ab().mo32587a(m30116d(i));
    }

    /* renamed from: d */
    public void m30118d() {
        C2523d.m31374a(this.f10231i).m31350r();
    }

    /* renamed from: e */
    public void m30115e() {
        this.f10231i.mo32908a(this);
    }

    /* renamed from: f */
    public void m30114f() {
        this.f10231i.mo32903b(this);
    }

    /* renamed from: g */
    public void m30113g() {
        if (this.f10230h != null) {
            this.f10230h = null;
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case GimbalCalibration:
                if (c2083a.m33000av().m32359c() == 8) {
                    m30124b();
                    m30112h();
                    return;
                } else if (c2083a.m33000av().m32359c() == 6) {
                    m30111i();
                    return;
                } else if (c2083a.m33000av().m32359c() != 5 || this.f10230h == null) {
                    return;
                } else {
                    this.f10230h.mo29922c();
                    return;
                }
            case CLEANALLOBJ:
                if (this.f10230h == null || !this.f10238q) {
                    return;
                }
                this.f10230h.mo29927a(m30122b(C1704R.C1707string.GC_caliFail_discon));
                return;
            case Remotecontrol:
                if (this.f10230h != null && !this.f10238q) {
                    this.f10230h.mo29918e();
                    return;
                } else if (this.f10230h != null && !c2083a.mo32905ac() && this.f10238q) {
                    this.f10230h.mo29927a(m30122b(C1704R.C1707string.GC_caliFail_discon_drone));
                    return;
                } else if (this.f10230h == null || !this.f10238q) {
                    return;
                } else {
                    if (c2083a.m33007ao().m31797ac()) {
                        this.f10230h.mo29927a(m30122b(C1704R.C1707string.GC_hight_temperature));
                        return;
                    } else if (!c2083a.m33007ao().m31755u()) {
                        return;
                    } else {
                        this.f10230h.mo29927a(m30122b(C1704R.C1707string.discongc));
                        return;
                    }
                }
            default:
                return;
        }
    }
}
