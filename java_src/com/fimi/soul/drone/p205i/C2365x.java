package com.fimi.soul.drone.p205i;

import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.drone.i.x */
/* loaded from: classes.dex */
public class C2365x extends C2247e {

    /* renamed from: b */
    private int f7763b;

    /* renamed from: c */
    private int f7764c;

    /* renamed from: d */
    private int f7765d;

    /* renamed from: f */
    private int f7767f;

    /* renamed from: g */
    private int f7768g;

    /* renamed from: h */
    private int f7769h;

    /* renamed from: i */
    private int f7770i;

    /* renamed from: j */
    private int f7771j;

    /* renamed from: k */
    private int f7772k;

    /* renamed from: e */
    private int f7766e = 0;

    /* renamed from: l */
    private int[] f7773l = {C1704R.C1707string.self_error_gps, C1704R.C1707string.self_error_nofly, C1704R.C1707string.self_error_compass1, C1704R.C1707string.self_error_compass2, C1704R.C1707string.self_error_accelerometer, C1704R.C1707string.self_error_gyroscope, C1704R.C1707string.self_error_barometer, C1704R.C1707string.self_error_battery, C1704R.C1707string.self_error_battery_copyright, C1704R.C1707string.self_error_unknown, C1704R.C1707string.self_error_Optic_flow, C1704R.C1707string.self_error_Optic_flow_not_found, C1704R.C1707string.self_error_optic_flow_sonar, C1704R.C1707string.self_error_optic_flow_camera, C1704R.C1707string.self_error_gc, C1704R.C1707string.self_error_gc_not_found};

    /* renamed from: m */
    private int[] f7774m = {C1704R.C1707string.fault_gps, C1704R.C1707string.fault_compass, C1704R.C1707string.fault_accelerometer, C1704R.C1707string.fault_level, C1704R.C1707string.fault_gyroscope, C1704R.C1707string.fault_gesture, C1704R.C1707string.fault_back_battery, C1704R.C1707string.fault_low_battery, C1704R.C1707string.fault_power_hightlemp, C1704R.C1707string.fault_ultrasonic_data_invalid, C1704R.C1707string.fault_Optic_flow_invalid, C1704R.C1707string.fault_Optic_flow_bad, C1704R.C1707string.fault_accelerometer_data_invalid, C1704R.C1707string.fault_barometer_data_invalid, C1704R.C1707string.fault_hight_data_invalid, C1704R.C1707string.fault_texture_quality, C1704R.C1707string.fault_gc, C1704R.C1707string.fault_super_heat, C1704R.C1707string.fault_self_fail, C1704R.C1707string.fault_sevo_stal, C1704R.C1707string.fault_gc_heat_error, C1704R.C1707string.fault_ahrs, C1704R.C1707string.fault_short_life_battery, C1704R.C1707string.fault_max_hight, C1704R.C1707string.fault_max_distance, C1704R.C1707string.fault_gc_pre_heart, C1704R.C1707string.fault_bat_pre_heart};

    public C2365x() {
    }

    public C2365x(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: c */
    private int m31773c(int i) {
        for (int i2 = 0; i2 < 32; i2++) {
            if (C3103au.m29241a(i, i2) > 0) {
                return i2;
            }
        }
        return -1;
    }

    @Deprecated
    /* renamed from: A */
    public boolean m31828A() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-21))) > 0;
    }

    /* renamed from: B */
    public boolean m31827B() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-22))) > 0;
    }

    /* renamed from: C */
    public boolean m31826C() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-23))) > 0;
    }

    /* renamed from: D */
    public boolean m31825D() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-24))) > 0;
    }

    /* renamed from: E */
    public boolean m31824E() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-25))) > 0;
    }

    /* renamed from: F */
    public boolean m31823F() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-26))) > 0;
    }

    /* renamed from: G */
    public boolean m31822G() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-27))) > 0;
    }

    /* renamed from: H */
    public boolean m31821H() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-28))) > 0;
    }

    /* renamed from: I */
    public boolean m31820I() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-29))) > 0;
    }

    /* renamed from: J */
    public boolean m31819J() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-30))) > 0;
    }

    /* renamed from: K */
    public boolean m31818K() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + 0)) > 0;
    }

    /* renamed from: L */
    public boolean m31817L() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-1))) > 0;
    }

    /* renamed from: M */
    public boolean m31816M() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-2))) > 0;
    }

    /* renamed from: N */
    public boolean m31815N() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-3))) > 0;
    }

    /* renamed from: O */
    public boolean m31814O() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-4))) > 0;
    }

    /* renamed from: P */
    public boolean m31813P() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-5))) > 0;
    }

    /* renamed from: Q */
    public boolean m31812Q() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-6))) > 0;
    }

    /* renamed from: R */
    public boolean m31811R() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-7))) > 0;
    }

    /* renamed from: S */
    public boolean m31810S() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-8))) > 0;
    }

    /* renamed from: T */
    public boolean m31809T() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-9))) > 0;
    }

    /* renamed from: U */
    public boolean m31808U() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-10))) > 0;
    }

    /* renamed from: V */
    public boolean m31807V() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-11))) > 0;
    }

    /* renamed from: W */
    public boolean m31806W() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-12))) > 0;
    }

    /* renamed from: X */
    public boolean m31805X() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-13))) > 0;
    }

    /* renamed from: Y */
    public boolean m31804Y() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-14))) > 0;
    }

    /* renamed from: Z */
    public boolean m31803Z() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-15))) > 0;
    }

    /* renamed from: a */
    public int m31802a() {
        return this.f7772k;
    }

    /* renamed from: a */
    public void m31801a(int i) {
        this.f7767f = i;
    }

    /* renamed from: a */
    public void m31800a(int i, int i2, short s, int i3) {
        this.f7763b = i;
        this.f7764c = i2;
        this.f7765d = i3;
        this.f7769h = m31773c(i);
        this.f7770i = m31773c(i2);
        this.f7771j = m31773c(i3);
        this.f7772k = this.f7769h;
        if (this.f7769h >= 0 || this.f7770i >= 0 || this.f7771j >= 0) {
            this.f7767f = C1704R.C1707string.self_error_result;
            if (this.f7769h >= 0 && this.f7769h < this.f7773l.length) {
                this.f7768g = this.f7773l[this.f7769h];
            }
            if (this.f7769h >= 0) {
                this.f7772k = this.f7769h;
            }
            if (this.f7770i >= 0 && this.f7770i < this.f7774m.length) {
                this.f7768g = this.f7774m[this.f7770i];
            }
            if (this.f7770i >= 0) {
                this.f7772k = this.f7770i;
            }
        }
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.ERROR_CODE);
        }
    }

    /* renamed from: aa */
    public boolean m31799aa() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-16))) > 0;
    }

    /* renamed from: ab */
    public boolean m31798ab() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-17))) > 0;
    }

    /* renamed from: ac */
    public boolean m31797ac() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-18))) > 0;
    }

    /* renamed from: ad */
    public boolean m31796ad() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-19))) > 0;
    }

    /* renamed from: ae */
    public boolean m31795ae() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-20))) > 0;
    }

    /* renamed from: af */
    public boolean m31794af() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-21))) > 0;
    }

    /* renamed from: ag */
    public boolean m31793ag() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-22))) > 0;
    }

    /* renamed from: ah */
    public boolean m31792ah() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-23))) > 0;
    }

    /* renamed from: ai */
    public boolean m31791ai() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-24))) > 0;
    }

    /* renamed from: aj */
    public boolean m31790aj() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-25))) > 0;
    }

    /* renamed from: ak */
    public boolean m31789ak() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-26))) > 0;
    }

    /* renamed from: al */
    public boolean m31788al() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-27))) > 0;
    }

    /* renamed from: am */
    public boolean m31787am() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-28))) > 0;
    }

    /* renamed from: an */
    public boolean m31786an() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-29))) > 0;
    }

    /* renamed from: ao */
    public boolean m31785ao() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-30))) > 0;
    }

    /* renamed from: ap */
    public boolean m31784ap() {
        return C3103au.m29241a(this.f7764c, Math.abs(this.f7766e + (-31))) > 0;
    }

    /* renamed from: aq */
    public boolean m31783aq() {
        return C3103au.m29241a(this.f7765d, Math.abs(this.f7766e + 0)) > 0;
    }

    /* renamed from: ar */
    public boolean m31782ar() {
        return C3103au.m29241a(this.f7765d, Math.abs(this.f7766e + (-1))) > 0;
    }

    /* renamed from: as */
    public boolean m31781as() {
        return C3103au.m29241a(this.f7765d, Math.abs(this.f7766e + (-2))) > 0;
    }

    /* renamed from: at */
    public boolean m31780at() {
        return C3103au.m29241a(this.f7765d, Math.abs(this.f7766e + (-3))) > 0;
    }

    /* renamed from: au */
    public boolean m31779au() {
        return C3103au.m29241a(this.f7765d, Math.abs(this.f7766e + (-4))) > 0;
    }

    /* renamed from: av */
    public boolean m31778av() {
        return C3103au.m29241a(this.f7765d, Math.abs(this.f7766e + (-5))) > 0;
    }

    /* renamed from: aw */
    public boolean m31777aw() {
        return C3103au.m29241a(this.f7765d, Math.abs(this.f7766e + (-6))) > 0;
    }

    /* renamed from: b */
    public int m31776b() {
        return this.f7769h;
    }

    /* renamed from: b */
    public void m31775b(int i) {
        this.f7768g = i;
    }

    /* renamed from: c */
    public int m31774c() {
        return this.f7770i;
    }

    /* renamed from: d */
    public int m31772d() {
        return this.f7767f;
    }

    /* renamed from: e */
    public int m31771e() {
        return this.f7768g;
    }

    /* renamed from: f */
    public boolean m31770f() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + 0)) > 0;
    }

    /* renamed from: g */
    public boolean m31769g() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-1))) > 0;
    }

    /* renamed from: h */
    public boolean m31768h() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-2))) > 0;
    }

    /* renamed from: i */
    public boolean m31767i() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-3))) > 0;
    }

    /* renamed from: j */
    public boolean m31766j() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-4))) > 0;
    }

    /* renamed from: k */
    public boolean m31765k() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-5))) > 0;
    }

    /* renamed from: l */
    public boolean m31764l() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-6))) > 0;
    }

    /* renamed from: m */
    public boolean m31763m() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-7))) > 0;
    }

    /* renamed from: n */
    public boolean m31762n() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-8))) > 0;
    }

    /* renamed from: o */
    public boolean m31761o() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-9))) > 0;
    }

    /* renamed from: p */
    public boolean m31760p() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-10))) > 0;
    }

    /* renamed from: q */
    public boolean m31759q() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-11))) > 0;
    }

    /* renamed from: r */
    public boolean m31758r() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-12))) > 0;
    }

    /* renamed from: s */
    public boolean m31757s() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-13))) > 0;
    }

    /* renamed from: t */
    public boolean m31756t() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-14))) > 0;
    }

    public String toString() {
        return "selftErrorIndex=" + this.f7769h + "faultErrorIndex=" + this.f7770i + " GPS???????????? =" + m31770f() + " ???????????????=" + m31769g() + " ??????1??????=" + m31768h() + " ??????2??????=" + m31767i() + " ??????????????????=" + m31766j() + " ????????????=" + m31765k() + " ???????????????=" + m31764l() + " ????????????=" + m31763m() + " ????????????=" + m31762n() + " ????????????=" + m31761o() + " ????????????=" + m31760p() + " ????????????=" + m31759q() + " ????????????=" + m31755u() + " GPS?????????=" + m31818K() + " ???????????????=" + m31817L() + " ?????????????????????=" + m31816M() + " ????????????=" + m31815N() + " ???????????????=" + m31814O() + " ??????????????????=" + m31813P() + " ??????????????????=" + m31811R() + " ????????????=" + m31810S() + " ????????????=" + m31809T() + " ????????????????????????=" + m31808U() + " ??????????????????????????????????????????????????????=" + m31807V() + " ????????????=" + m31799aa() + " ????????????=" + m31798ab() + " ??????=" + m31797ac() + " ????????????=" + m31796ad() + " ????????????=" + m31795ae() + " ????????????=" + m31794af() + " AHRS?????????=" + m31793ag() + " ??????????????????=" + m31792ah() + " faultError =" + Integer.toBinaryString(this.f7764c) + " selfError=" + Integer.toBinaryString(this.f7763b);
    }

    /* renamed from: u */
    public boolean m31755u() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-15))) > 0;
    }

    /* renamed from: v */
    public boolean m31754v() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-16))) > 0;
    }

    /* renamed from: w */
    public boolean m31753w() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-17))) > 0;
    }

    /* renamed from: x */
    public boolean m31752x() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-18))) > 0;
    }

    /* renamed from: y */
    public boolean m31751y() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-19))) > 0;
    }

    /* renamed from: z */
    public boolean m31750z() {
        return C3103au.m29241a(this.f7763b, Math.abs(this.f7766e + (-20))) > 0;
    }
}
