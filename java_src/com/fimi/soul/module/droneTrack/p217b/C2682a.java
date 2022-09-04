package com.fimi.soul.module.droneTrack.p217b;

import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p180h.C1861g;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.module.droneTrack.p216a.C2671a;
import java.util.Hashtable;
import java.util.Map;
/* renamed from: com.fimi.soul.module.droneTrack.b.a */
/* loaded from: classes.dex */
public class C2682a {

    /* renamed from: a */
    private static C2682a f9148a;

    /* renamed from: b */
    private static Map<Integer, C1861g> f9149b = new Hashtable();

    /* renamed from: a */
    public static C2682a m30643a() {
        if (f9148a == null) {
            f9148a = new C2682a();
        }
        return f9148a;
    }

    /* renamed from: b */
    public static Map<Integer, C1861g> m30639b() {
        return f9149b;
    }

    /* renamed from: a */
    public ErrorMode m30642a(C2671a c2671a) {
        C2365x m30717b = c2671a.m30717b();
        if (m30717b == null) {
            return null;
        }
        boolean m30709j = c2671a.m30709j();
        boolean m30706m = c2671a.m30706m();
        boolean m30705n = c2671a.m30705n();
        ErrorMode errorMode = new ErrorMode();
        errorMode.setIsMiddleFault(m30705n);
        if (m30706m) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_rc_low_battery));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_rc_low_battery));
            }
            m30641a(m30709j, false, C1704R.C1707string.land_rc_low_battery);
        } else {
            m30640a(C1704R.C1707string.land_rc_low_battery);
        }
        if (m30705n) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_rc_middle_fault));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_rc_middle_fault));
            }
        }
        if ((c2671a.m30731a().m32394c() == 4 || c2671a.m30731a().m32397a() == 12) && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_OVERFLOW));
        }
        if ((m30717b.m31786an() || c2671a.m30731a().m32394c() == 5 || c2671a.m30731a().m32397a() == 8) && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_LOGIC));
        }
        if (c2671a.m30731a().m32394c() == 6 && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_MOTOR_LOCK));
        }
        if (c2671a.m30731a().m32394c() == 9 && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_NO_WAY_POINT));
        }
        if ((c2671a.m30731a().m32394c() == 17 || c2671a.m30731a().m32397a() == 4) && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_HOME_NOT_SET));
        }
        if ((m30717b.m31787am() || c2671a.m30731a().m32394c() == 21 || c2671a.m30731a().m32397a() == 14) && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_NO_CALI));
        }
        if (c2671a.m30731a().m32394c() == 11 && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_INVALID_CMD));
        }
        errorMode.setIsCompassFault(m30717b.m31817L());
        if (!m30717b.m31770f() || c2671a.m30731a().m32390g().isLightStream()) {
            int[] iArr = new int[1];
            iArr[0] = m30709j ? C1704R.C1707string.sky_GPS_ERROR : C1704R.C1707string.land_GPS_ERROR;
            m30640a(iArr);
        } else if (m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_GPS_ERROR));
            m30641a(true, false, C1704R.C1707string.sky_GPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_GPS_ERROR));
            m30641a(false, false, C1704R.C1707string.land_GPS_ERROR);
        }
        if (!m30717b.m31769g() && (c2671a.m30716c() == null || c2671a.m30716c().m32411b() != 3)) {
            m30640a(C1704R.C1707string.sky_no_fly_error, C1704R.C1707string.land_no_fly_error);
        } else if (m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_no_fly_error));
            m30641a(true, false, C1704R.C1707string.sky_no_fly_error);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_no_fly_error));
            m30641a(false, false, C1704R.C1707string.land_no_fly_error);
        }
        if (c2671a.m30716c() != null && c2671a.m30716c().m32411b() == 1) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_no_fly_buffer_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_no_fly_buffer_error));
            }
        }
        if (m30717b.m31768h() || m30717b.m31767i()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_camp_err));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_CAMP1_ERROR));
            }
        }
        if (m30717b.m31766j()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imuaccel_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUACCEL_ERROR));
            }
        }
        if (m30717b.m31765k()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imugro_error));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUGYRO_ERROR));
            }
        }
        if (m30717b.m31764l()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BRO_ERROR));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BRO_ERROR));
            }
        }
        if (!m30717b.m31763m()) {
            m30640a(C1704R.C1707string.sky_BATTERY_ERROR, C1704R.C1707string.land_BATTERY_ERROR);
        } else if (m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BATTERY_ERROR));
            m30641a(true, false, C1704R.C1707string.sky_BATTERY_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BATTERY_ERROR));
            m30641a(false, false, C1704R.C1707string.land_BATTERY_ERROR);
        }
        if (m30717b.m31762n() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BATTERY_UNATHORIZED));
        }
        if ((m30717b.m31761o() || c2671a.m30731a().m32394c() == 22 || c2671a.m30731a().m32397a() == 15) && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_log_error));
        }
        if (!m30717b.m31760p() || !c2671a.m30731a().m32390g().isLightStream()) {
            m30640a(C1704R.C1707string.sky_VPS_ERROR);
        } else if (m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_VPS_ERROR));
            m30641a(true, false, C1704R.C1707string.sky_VPS_ERROR);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_VPS_ERROR));
        }
        if (!m30717b.m31759q() || !c2671a.m30731a().m32390g().isLightStream()) {
            m30640a(C1704R.C1707string.sky_VPS_LOWACCURATE);
        } else if (m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_VPS_LOWACCURATE));
            m30641a(false, false, C1704R.C1707string.sky_VPS_LOWACCURATE);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_VPS_LOWACCURATE));
        }
        if ((m30717b.m31758r() || c2671a.m30731a().m32394c() == 12 || c2671a.m30731a().m32397a() == 6) && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RC_RETURN));
        }
        if (m30717b.m31752x() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BATTERY_UPDATED_FAIL));
        }
        if (c2671a.m30731a().m32394c() == 13 || c2671a.m30731a().m32397a() == 1) {
            if (!m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_RPT_NON_AUTO_MODE));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_RPT_NON_AUTO_MODE));
            }
        } else if (m30717b.m31818K() && !c2671a.m30731a().m32390g().isLightStream()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_GPS_NOSIG));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_GPS_NOSIG));
            }
        }
        if (m30717b.m31817L()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_CAMP_NCAL));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_CAMP_NCAL));
            }
        }
        if (m30717b.m31816M() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUACCEL_NCAL));
        }
        if (m30717b.m31815N() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_ORTH_NCAL));
        }
        if (m30717b.m31814O() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_IMUGYRO_NCAL));
        }
        if ((m30717b.m31813P() || c2671a.m30731a().m32394c() == 2 || c2671a.m30731a().m32397a() == 7) && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_G_ATT_INV));
        }
        if (c2671a.m30731a().m32394c() == 19 || c2671a.m30731a().m32397a() == 10) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.str_ap_rpt_app_unconnected));
        }
        if (m30717b.m31810S() || c2671a.m30731a().m32394c() == 3 || c2671a.m30731a().m32397a() == 5) {
            if (m30709j) {
                if (c2671a.m30731a().m32392e() == 9) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_landing_BAT_LOWPOWER));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_LOWPOWER));
                }
                m30641a(true, false, C1704R.C1707string.sky_LOWPOWER);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_LOWPOWER));
                m30641a(false, false, C1704R.C1707string.land_LOWPOWER);
            }
            m30640a(C1704R.C1707string.sky_BAT_light_LOWPOWER, C1704R.C1707string.land_BAT_LOWPOWER, C1704R.C1707string.sky_LP_RETURN);
        } else if (m30717b.m31812Q()) {
            m30640a(C1704R.C1707string.sky_LOWPOWER, C1704R.C1707string.land_LOWPOWER, C1704R.C1707string.sky_LP_RETURN);
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BAT_light_LOWPOWER));
                m30641a(true, false, C1704R.C1707string.sky_BAT_light_LOWPOWER);
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BAT_LOWPOWER));
                m30641a(false, false, C1704R.C1707string.land_BAT_LOWPOWER);
            }
        } else if (m30717b.m31811R()) {
            m30640a(C1704R.C1707string.sky_LOWPOWER, C1704R.C1707string.land_LOWPOWER, C1704R.C1707string.sky_BAT_light_LOWPOWER, C1704R.C1707string.land_BAT_LOWPOWER);
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_LP_RETURN));
                m30641a(true, false, C1704R.C1707string.sky_LP_RETURN);
            }
        } else {
            m30640a(C1704R.C1707string.sky_BAT_light_LOWPOWER, C1704R.C1707string.sky_LP_RETURN, C1704R.C1707string.land_BAT_LOWPOWER, C1704R.C1707string.sky_landing_BAT_LOWPOWER, C1704R.C1707string.sky_LOWPOWER);
        }
        if (m30717b.m31809T()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_POWER_HIGHTEMP));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_POWER_HIGHTEMP));
            }
            m30641a(false, false, m30709j ? C1704R.C1707string.sky_POWER_HIGHTEMP : C1704R.C1707string.land_POWER_HIGHTEMP);
        } else {
            int[] iArr2 = new int[1];
            iArr2[0] = m30709j ? C1704R.C1707string.sky_POWER_HIGHTEMP : C1704R.C1707string.land_POWER_HIGHTEMP;
            m30640a(iArr2);
        }
        if (!m30717b.m31792ah()) {
            m30640a(C1704R.C1707string.sky_BATTERY_SHORTLIFE_InSky, C1704R.C1707string.sky_BATTERY_SHORTLIFE);
        } else if (!m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BATTERY_SHORTLIFE));
            m30641a(false, false, C1704R.C1707string.sky_BATTERY_SHORTLIFE);
        } else {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_BATTERY_SHORTLIFE_InSky));
            m30641a(true, false, C1704R.C1707string.sky_BATTERY_SHORTLIFE_InSky);
        }
        if (!m30717b.m31791ai()) {
            m30640a(C1704R.C1707string.sky_MAXIMUM_ALTITUDE);
        } else if (m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_MAXIMUM_ALTITUDE));
            m30641a(false, false, C1704R.C1707string.sky_MAXIMUM_ALTITUDE);
        }
        if (!m30717b.m31790aj()) {
            m30640a(C1704R.C1707string.sky_MAXIMUM_DISTANCE);
        } else if (m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_MAXIMUM_DISTANCE));
            m30641a(false, false, C1704R.C1707string.sky_MAXIMUM_DISTANCE);
        }
        if (!m30717b.m31789ak() || !m30709j) {
        }
        if (m30717b.m31788al() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_BAT_PREHEAT));
        }
        if (m30717b.m31754v()) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_NfzDataInvalid));
            m30641a(false, false, C1704R.C1707string.land_NfzDataInvalid);
        } else {
            m30640a(C1704R.C1707string.land_NfzDataInvalid);
        }
        if (!m30717b.m31808U()) {
            m30640a(C1704R.C1707string.land_single_cell_battery);
        } else if (!m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_single_cell_battery));
            m30641a(false, false, C1704R.C1707string.land_single_cell_battery);
        }
        if (m30717b.m31750z()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imag_interface));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_imag_interface));
            }
        }
        if (m30717b.m31753w()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_imu_overtemperature));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_imu_overtemperature));
            }
        }
        if (m30709j) {
            if (m30717b.m31806W()) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.stick_move_warning_result));
                m30641a(false, false, C1704R.C1707string.stick_move_warning_des);
            } else {
                m30640a(C1704R.C1707string.stick_move_warning_des);
            }
        }
        if ((c2671a.m30731a().m32390g().isEnforcementAtti() || c2671a.m30731a().m32390g().isLightStream()) && c2671a.m30704o().m32272a()) {
            if (m30717b.m31805X()) {
                if (m30709j) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sonar_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sonar_error));
                }
            }
            if (m30717b.m31804Y()) {
                if (m30709j) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.camera_disconnect_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.camera_disconnect));
                }
            }
            if (m30717b.m31803Z()) {
                if (m30709j) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.imagequality_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.imagequality_error));
                }
            }
            if (!m30717b.m31785ao() || !m30709j) {
            }
            if (m30717b.m31799aa()) {
                if (m30709j) {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.estimatexy_error_sky));
                } else {
                    errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.estimatexy_error));
                }
            }
        }
        if (!m30709j && m30717b.m31751y()) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.str_at_rpt_bat_err));
        }
        if (m30717b.m31784ap()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.is_min_hight));
                m30641a(false, false, C1704R.C1707string.is_min_hight);
            } else {
                m30640a(C1704R.C1707string.is_min_hight);
            }
        }
        if (m30717b.m31783aq() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_calidata_invalid));
        }
        if (m30717b.m31782ar() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_warning_up));
        }
        if (m30717b.m31781as()) {
            if (m30709j) {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_cooling_down));
            } else {
                errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_cooling_down));
            }
        }
        if (m30717b.m31780at() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_bat_v_rp_mismatch));
        }
        if (m30717b.m31779au() && m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.sky_above_nfz_limit_height));
        }
        if (m30717b.m31778av() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_dnfz_updating));
        }
        if (m30717b.m31777aw() && !m30709j) {
            errorMode.getLightErrorList().add(Integer.valueOf((int) C1704R.C1707string.land_ahrs_not_ready));
        }
        return errorMode;
    }

    /* renamed from: a */
    public void m30641a(boolean z, boolean z2, int i) {
        if (!f9149b.containsKey(Integer.valueOf(i))) {
            f9149b.put(Integer.valueOf(i), new C1861g(z, z2, i));
        }
    }

    /* renamed from: a */
    public void m30640a(int... iArr) {
        for (int i : iArr) {
            if (f9149b.containsKey(Integer.valueOf(i))) {
                f9149b.remove(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: c */
    public void m30638c() {
        m30640a(C1704R.C1707string.sky_landing_BAT_LOWPOWER, C1704R.C1707string.sky_LP_RETURN);
    }
}
