package com.fimi.soul.biz.p180h;

import com.fimi.kernel.C1642c;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.utils.C3107av;
import java.util.Hashtable;
import java.util.Map;
/* renamed from: com.fimi.soul.biz.h.h */
/* loaded from: classes.dex */
public class C1862h {

    /* renamed from: a */
    private static C1862h f5063a;

    /* renamed from: b */
    private static Map<Integer, C1861g> f5064b = new Hashtable();

    /* renamed from: a */
    public static C1862h m33874a() {
        if (f5063a == null) {
            f5063a = new C1862h();
        }
        return f5063a;
    }

    /* renamed from: b */
    public static Map<Integer, C1861g> m33870b() {
        return f5064b;
    }

    /* renamed from: d */
    private void m33868d() {
        if (m33870b().size() > 0) {
            for (Integer num : m33870b().keySet()) {
                C1861g c1861g = m33870b().get(num);
                if (c1861g != null && !c1861g.m33875c()) {
                    C1648b.m34863b(C1642c.m34893a()).m34867a(C1642c.m34893a().getString(c1861g.m33880a()));
                    m33870b().get(num).m33876b(true);
                    if (m33870b().get(num).m33877b() && C1642c.m34886d() != null) {
                        C3107av.m29182a(C1642c.m34886d(), 2000L);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public ErrorMode m33873a(C2083a c2083a) {
        boolean m32126g;
        boolean m32125h;
        C2365x m33007ao = c2083a.m33007ao();
        boolean m33009am = c2083a.m33009am();
        if (C1772d.m34208a().m34187k()) {
            m32126g = c2083a.m32980i().m32232m();
            m32125h = c2083a.m32980i().m32231n();
        } else {
            m32126g = c2083a.mo32919Q().m32126g();
            m32125h = c2083a.mo32919Q().m32125h();
        }
        ErrorMode errorMode = new ErrorMode();
        if (!c2083a.mo32906ab().mo32588a()) {
            return errorMode;
        }
        errorMode.setIsMiddleFault(m32125h);
        if (m32126g) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_rc_low_battery));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_rc_low_battery));
            }
            m33872a(m33009am, false, C1704R.C1707string.land_rc_low_battery);
        } else {
            m33871a(C1704R.C1707string.land_rc_low_battery);
        }
        if (m32125h) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_rc_middle_fault));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_rc_middle_fault));
            }
        }
        if (!c2083a.mo32905ac()) {
            return errorMode;
        }
        if ((c2083a.m33001au().m32394c() == 4 || c2083a.m33001au().m32397a() == 12) && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_OVERFLOW));
        }
        if ((m33007ao.m31786an() || c2083a.m33001au().m32394c() == 5 || c2083a.m33001au().m32397a() == 8) && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_LOGIC));
        }
        if (c2083a.m33001au().m32394c() == 6 && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_MOTOR_LOCK));
        }
        if (c2083a.m33001au().m32394c() == 9 && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_NO_WAY_POINT));
        }
        if ((c2083a.m33001au().m32394c() == 17 || c2083a.m33001au().m32397a() == 4) && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_HOME_NOT_SET));
        }
        if ((m33007ao.m31787am() || c2083a.m33001au().m32394c() == 21 || c2083a.m33001au().m32397a() == 14) && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_NO_CALI));
        }
        if (c2083a.m33001au().m32394c() == 11 && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_INVALID_CMD));
        }
        errorMode.setIsCompassFault(m33007ao.m31817L());
        if (!m33007ao.m31770f() || c2083a.m33001au().m32390g().isLightStream()) {
            int[] iArr = new int[1];
            iArr[0] = m33009am ? C1704R.C1707string.sky_GPS_ERROR : C1704R.C1707string.land_GPS_ERROR;
            m33871a(iArr);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_GPS_ERROR));
            m33872a(true, false, C1704R.C1707string.sky_GPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_GPS_ERROR));
            m33872a(false, false, C1704R.C1707string.land_GPS_ERROR);
        }
        if (c2083a.m32979j() != null) {
            switch (c2083a.m32979j().m32411b()) {
                case 1:
                    if (!m33009am) {
                        errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_no_fly_warn));
                        m33872a(false, false, C1704R.C1707string.sky_no_fly_warn);
                        m33871a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.restricted_alttiude_zone, C1704R.C1707string.sky_no_hight_fly_warn, C1704R.C1707string.sky_land_error, C1704R.C1707string.land_no_fly_warn, C1704R.C1707string.sky_forbin_error);
                        break;
                    } else {
                        errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_no_fly_error));
                        m33872a(true, false, C1704R.C1707string.sky_no_fly_error);
                        m33871a(C1704R.C1707string.sky_no_fly_warn, C1704R.C1707string.restricted_alttiude_zone, C1704R.C1707string.sky_no_hight_fly_warn, C1704R.C1707string.sky_land_error, C1704R.C1707string.land_no_fly_warn, C1704R.C1707string.sky_forbin_error);
                        break;
                    }
                case 2:
                    if (!m33009am) {
                        errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_no_hight_fly_warn));
                        m33872a(false, false, C1704R.C1707string.sky_no_hight_fly_warn);
                        m33871a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.sky_no_fly_warn, C1704R.C1707string.restricted_alttiude_zone, C1704R.C1707string.sky_land_error, C1704R.C1707string.land_no_fly_warn, C1704R.C1707string.sky_forbin_error);
                        break;
                    } else {
                        errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.restricted_alttiude_zone));
                        m33872a(false, false, C1704R.C1707string.restricted_alttiude_zone);
                        m33871a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.sky_no_fly_warn, C1704R.C1707string.sky_no_hight_fly_warn, C1704R.C1707string.sky_land_error, C1704R.C1707string.land_no_fly_warn, C1704R.C1707string.sky_forbin_error);
                        break;
                    }
                case 3:
                    if (!m33009am) {
                        errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_no_fly_warn));
                        m33872a(false, false, C1704R.C1707string.land_no_fly_warn);
                        m33871a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.sky_no_fly_warn, C1704R.C1707string.restricted_alttiude_zone, C1704R.C1707string.sky_no_hight_fly_warn, C1704R.C1707string.sky_land_error, C1704R.C1707string.sky_forbin_error);
                        break;
                    } else {
                        errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_land_error));
                        m33872a(true, false, C1704R.C1707string.sky_land_error);
                        m33871a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.sky_no_fly_warn, C1704R.C1707string.restricted_alttiude_zone, C1704R.C1707string.sky_no_hight_fly_warn, C1704R.C1707string.land_no_fly_warn, C1704R.C1707string.sky_forbin_error);
                        break;
                    }
                case 4:
                    if (!m33009am) {
                        errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_forbin_error));
                        m33872a(false, false, C1704R.C1707string.sky_forbin_error);
                        m33871a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.sky_no_fly_warn, C1704R.C1707string.restricted_alttiude_zone, C1704R.C1707string.sky_no_hight_fly_warn, C1704R.C1707string.sky_land_error, C1704R.C1707string.land_no_fly_warn);
                        break;
                    }
                    break;
                default:
                    m33871a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.sky_no_fly_warn, C1704R.C1707string.restricted_alttiude_zone, C1704R.C1707string.sky_no_hight_fly_warn, C1704R.C1707string.sky_land_error, C1704R.C1707string.land_no_fly_warn, C1704R.C1707string.sky_forbin_error);
                    break;
            }
        }
        if (m33007ao.m31768h() || m33007ao.m31767i()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_camp_err));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_CAMP1_ERROR));
            }
        }
        if (m33007ao.m31766j()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imuaccel_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUACCEL_ERROR));
            }
        }
        if (m33007ao.m31765k()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imugro_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUGYRO_ERROR));
            }
        }
        if (m33007ao.m31764l()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BRO_ERROR));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BRO_ERROR));
            }
        }
        if (!m33007ao.m31763m()) {
            m33871a(C1704R.C1707string.sky_BATTERY_ERROR, C1704R.C1707string.land_BATTERY_ERROR);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BATTERY_ERROR));
            m33872a(true, false, C1704R.C1707string.sky_BATTERY_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BATTERY_ERROR));
            m33872a(false, false, C1704R.C1707string.land_BATTERY_ERROR);
        }
        if (m33007ao.m31762n() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BATTERY_UNATHORIZED));
        }
        if ((m33007ao.m31761o() || c2083a.m33001au().m32394c() == 22 || c2083a.m33001au().m32397a() == 15) && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_log_error));
        }
        if (!m33007ao.m31760p() || !c2083a.m33001au().m32390g().isLightStream()) {
            m33871a(C1704R.C1707string.sky_VPS_ERROR);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_VPS_ERROR));
            m33872a(true, false, C1704R.C1707string.sky_VPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_VPS_ERROR));
        }
        if (!m33007ao.m31759q() || !c2083a.m33001au().m32390g().isLightStream()) {
            m33871a(C1704R.C1707string.sky_VPS_LOWACCURATE);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_VPS_LOWACCURATE));
            m33872a(false, false, C1704R.C1707string.sky_VPS_LOWACCURATE);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_VPS_LOWACCURATE));
        }
        if ((m33007ao.m31758r() || c2083a.m33001au().m32394c() == 12 || c2083a.m33001au().m32397a() == 6) && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RC_RETURN));
        }
        if (m33007ao.m31757s() && !m33009am) {
            if (c2083a.m32997ay() == 4) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_tf_card_format_ERROR));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_NEUTRAL_POINT_ERROR));
            }
        }
        if (m33007ao.m31752x() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BATTERY_UPDATED_FAIL));
        }
        if (c2083a.m33001au().m32394c() == 13 || c2083a.m33001au().m32397a() == 1) {
            if (!m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_NON_AUTO_MODE));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_RPT_NON_AUTO_MODE));
            }
        } else if (m33007ao.m31818K() && !c2083a.m33001au().m32390g().isLightStream()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_GPS_NOSIG));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_GPS_NOSIG));
            }
        }
        if (m33007ao.m31817L()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_CAMP_NCAL));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_CAMP_NCAL));
            }
        }
        if (m33007ao.m31816M() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUACCEL_NCAL));
        }
        if (m33007ao.m31815N() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_ORTH_NCAL));
        }
        if (m33007ao.m31814O() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUGYRO_NCAL));
        }
        if ((m33007ao.m31813P() || c2083a.m33001au().m32394c() == 2 || c2083a.m33001au().m32397a() == 7) && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_G_ATT_INV));
        }
        if (c2083a.m33001au().m32394c() == 19 || c2083a.m33001au().m32397a() == 10) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.str_ap_rpt_app_unconnected));
        }
        if (m33007ao.m31810S() || c2083a.m33001au().m32394c() == 3 || c2083a.m33001au().m32397a() == 5) {
            if (!m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_LOWPOWER));
                m33872a(false, false, C1704R.C1707string.land_LOWPOWER);
            } else if (c2083a.m33001au().m32392e() == 7 || c2083a.m33001au().m32392e() == 8) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_lowpower_return));
                m33872a(true, false, C1704R.C1707string.sky_lowpower_return);
            } else if (c2083a.m33001au().m32392e() == 9) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_landing_BAT_LOWPOWER));
                m33872a(true, false, C1704R.C1707string.sky_landing_BAT_LOWPOWER);
            } else if (c2083a.m33001au().m32392e() == 1) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_LOWPOWER_exit));
                m33872a(true, false, C1704R.C1707string.sky_LOWPOWER_exit);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_LOWPOWER));
                m33872a(true, false, C1704R.C1707string.sky_LOWPOWER);
            }
            m33871a(C1704R.C1707string.sky_BAT_light_LOWPOWER, C1704R.C1707string.land_BAT_LOWPOWER, C1704R.C1707string.sky_LP_RETURN);
        } else if (m33007ao.m31812Q()) {
            m33871a(C1704R.C1707string.sky_LOWPOWER, C1704R.C1707string.land_LOWPOWER, C1704R.C1707string.sky_LP_RETURN, C1704R.C1707string.sky_lowpower_return);
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BAT_light_LOWPOWER));
                m33872a(true, false, C1704R.C1707string.sky_BAT_light_LOWPOWER);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BAT_LOWPOWER));
                m33872a(false, false, C1704R.C1707string.land_BAT_LOWPOWER);
            }
        } else if (m33007ao.m31811R()) {
            m33871a(C1704R.C1707string.sky_LOWPOWER, C1704R.C1707string.land_LOWPOWER, C1704R.C1707string.sky_BAT_light_LOWPOWER, C1704R.C1707string.land_BAT_LOWPOWER, C1704R.C1707string.sky_lowpower_return);
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_LP_RETURN));
                m33872a(true, false, C1704R.C1707string.sky_LP_RETURN);
            }
        } else {
            m33871a(C1704R.C1707string.sky_BAT_light_LOWPOWER, C1704R.C1707string.sky_LP_RETURN, C1704R.C1707string.land_BAT_LOWPOWER, C1704R.C1707string.sky_landing_BAT_LOWPOWER, C1704R.C1707string.sky_LOWPOWER, C1704R.C1707string.sky_lowpower_return);
        }
        if (m33007ao.m31809T()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_POWER_HIGHTEMP));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_POWER_HIGHTEMP));
            }
            m33872a(false, false, m33009am ? C1704R.C1707string.sky_POWER_HIGHTEMP : C1704R.C1707string.land_POWER_HIGHTEMP);
        } else {
            int[] iArr2 = new int[1];
            iArr2[0] = m33009am ? C1704R.C1707string.sky_POWER_HIGHTEMP : C1704R.C1707string.land_POWER_HIGHTEMP;
            m33871a(iArr2);
        }
        if (!m33007ao.m31792ah()) {
            m33871a(C1704R.C1707string.sky_BATTERY_SHORTLIFE_InSky, C1704R.C1707string.sky_BATTERY_SHORTLIFE);
        } else if (!m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BATTERY_SHORTLIFE));
            m33872a(false, false, C1704R.C1707string.sky_BATTERY_SHORTLIFE);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BATTERY_SHORTLIFE_InSky));
            m33872a(true, false, C1704R.C1707string.sky_BATTERY_SHORTLIFE_InSky);
        }
        if (!m33007ao.m31791ai()) {
            m33871a(C1704R.C1707string.sky_MAXIMUM_ALTITUDE);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_MAXIMUM_ALTITUDE));
            m33872a(false, false, C1704R.C1707string.sky_MAXIMUM_ALTITUDE);
        }
        if (!m33007ao.m31790aj()) {
            m33871a(C1704R.C1707string.sky_MAXIMUM_DISTANCE);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_MAXIMUM_DISTANCE));
            m33872a(false, false, C1704R.C1707string.sky_MAXIMUM_DISTANCE);
        }
        if (!m33007ao.m31789ak() || !m33009am) {
        }
        if (m33007ao.m31788al() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BAT_PREHEAT));
        }
        if (!m33007ao.m31754v()) {
            m33871a(C1704R.C1707string.land_NfzDataInvalid);
        } else if (!m33009am) {
            if (!DroidPlannerApp.f4489f) {
                m33872a(false, false, C1704R.C1707string.land_NfzDataInvalid);
            }
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_NfzDataInvalid));
        }
        if (!m33007ao.m31808U()) {
            m33871a(C1704R.C1707string.land_single_cell_battery);
        } else if (!m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_single_cell_battery));
            m33872a(false, false, C1704R.C1707string.land_single_cell_battery);
        }
        if (!m33007ao.m31807V()) {
            m33871a(C1704R.C1707string.sky_bat_lowpower_dangerous, C1704R.C1707string.land_bat_lowpower_dangerous);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_bat_lowpower_dangerous));
            m33872a(true, false, C1704R.C1707string.sky_bat_lowpower_dangerous);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_bat_lowpower_dangerous));
            m33872a(true, false, C1704R.C1707string.land_bat_lowpower_dangerous);
        }
        if (m33007ao.m31750z()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imag_interface));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_imag_interface));
            }
        }
        if (m33007ao.m31753w()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imu_overtemperature));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_imu_overtemperature));
            }
        }
        if (m33007ao.m31825D() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sensor_low_tempe));
        }
        if (!m33007ao.m31824E()) {
            m33871a(C1704R.C1707string.sky_bat_dischage_warning);
        } else if (!m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_bat_dischage_warning));
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_bat_dischage_warning));
            m33872a(true, false, C1704R.C1707string.sky_bat_dischage_warning);
        }
        if (!m33007ao.m31823F()) {
            m33871a(C1704R.C1707string.sky_bat_damage);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_bat_damage));
            m33872a(true, false, C1704R.C1707string.sky_bat_damage);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_bat_damage));
        }
        if (m33007ao.m31822G() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_Bat_Low_Temp_And_Rp));
        }
        if (!m33007ao.m31821H()) {
            m33871a(C1704R.C1707string.sky_bat_comm_error);
        } else if (m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_bat_comm_error));
            m33872a(true, false, C1704R.C1707string.sky_bat_comm_error);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_bat_comm_error));
        }
        if (m33007ao.m31820I()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_nfz_data_pos_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_nfz_data_pos_error));
            }
        }
        if (m33007ao.m31819J()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_air_gauge_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_air_gauge_error));
            }
        }
        if (m33009am) {
            if (m33007ao.m31806W()) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.stick_move_warning_result));
                m33872a(false, false, C1704R.C1707string.stick_move_warning_des);
            } else {
                m33871a(C1704R.C1707string.stick_move_warning_des);
            }
        }
        if ((c2083a.m33001au().m32390g().isEnforcementAtti() || c2083a.m33001au().m32390g().isLightStream()) && c2083a.m32999aw().m32272a()) {
            if (m33007ao.m31805X()) {
                if (m33009am) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sonar_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sonar_error));
                }
            }
            if (m33007ao.m31804Y()) {
                if (m33009am) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.camera_disconnect_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.camera_disconnect));
                }
            }
            if (m33007ao.m31803Z()) {
                if (m33009am) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.imagequality_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.imagequality_error));
                }
            }
            if (m33007ao.m31799aa()) {
                if (m33009am) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.estimatexy_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.estimatexy_error));
                }
            }
            if (!m33007ao.m31785ao() || !m33009am) {
            }
        }
        if (!m33009am && m33007ao.m31751y()) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.str_at_rpt_bat_err));
        }
        if (m33007ao.m31784ap()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.is_min_hight));
                m33872a(false, false, C1704R.C1707string.is_min_hight);
            } else {
                m33871a(C1704R.C1707string.is_min_hight);
            }
        }
        if (m33007ao.m31783aq() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_calidata_invalid));
        }
        if (m33007ao.m31782ar() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_warning_up));
        }
        if (m33007ao.m31781as()) {
            if (m33009am) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_cooling_down));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_cooling_down));
            }
        }
        if (m33007ao.m31780at() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_bat_v_rp_mismatch));
        }
        if (m33007ao.m31779au() && m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_above_nfz_limit_height));
        }
        if (m33007ao.m31778av() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_dnfz_updating));
        }
        if (m33007ao.m31777aw() && !m33009am) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_ahrs_not_ready));
        }
        m33868d();
        return errorMode;
    }

    /* renamed from: a */
    public void m33872a(boolean z, boolean z2, int i) {
        if (!f5064b.containsKey(Integer.valueOf(i))) {
            f5064b.put(Integer.valueOf(i), new C1861g(z, z2, i));
        }
    }

    /* renamed from: a */
    public void m33871a(int... iArr) {
        for (int i : iArr) {
            if (f5064b.containsKey(Integer.valueOf(i))) {
                f5064b.remove(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: c */
    public void m33869c() {
        m33871a(C1704R.C1707string.sky_landing_BAT_LOWPOWER, C1704R.C1707string.sky_LP_RETURN);
    }
}
