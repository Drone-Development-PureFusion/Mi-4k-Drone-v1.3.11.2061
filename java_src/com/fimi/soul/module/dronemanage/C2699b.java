package com.fimi.soul.module.dronemanage;

import android.content.Context;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
/* renamed from: com.fimi.soul.module.dronemanage.b */
/* loaded from: classes.dex */
public class C2699b {

    /* renamed from: F */
    private static C2699b f9223F;

    /* renamed from: E */
    private Context f9228E;

    /* renamed from: a */
    private final int f9229a = 0;

    /* renamed from: b */
    private final int f9230b = 1;

    /* renamed from: c */
    private final int f9231c = 2;

    /* renamed from: d */
    private final int f9232d = 3;

    /* renamed from: e */
    private final int f9233e = 4;

    /* renamed from: f */
    private final int f9234f = 5;

    /* renamed from: g */
    private final int f9235g = 6;

    /* renamed from: h */
    private final int f9236h = 7;

    /* renamed from: i */
    private final int f9237i = 8;

    /* renamed from: j */
    private final int f9238j = 9;

    /* renamed from: k */
    private final int f9239k = 10;

    /* renamed from: l */
    private final int f9240l = 11;

    /* renamed from: m */
    private final int f9241m = 12;

    /* renamed from: n */
    private final int f9242n = 13;

    /* renamed from: o */
    private final int f9243o = 14;

    /* renamed from: p */
    private final int f9244p = 15;

    /* renamed from: q */
    private final int f9245q = 16;

    /* renamed from: r */
    private final int f9246r = 17;

    /* renamed from: s */
    private final int f9247s = 18;

    /* renamed from: t */
    private final int f9248t = 19;

    /* renamed from: u */
    private final int f9249u = 20;

    /* renamed from: v */
    private final int f9250v = 21;

    /* renamed from: w */
    private final int f9251w = 22;

    /* renamed from: x */
    private final int f9252x = 23;

    /* renamed from: y */
    private final int f9253y = 24;

    /* renamed from: z */
    private final int f9254z = 25;

    /* renamed from: A */
    private final int f9224A = 26;

    /* renamed from: B */
    private final int f9225B = 27;

    /* renamed from: C */
    private final int f9226C = 28;

    /* renamed from: D */
    private final int f9227D = 29;

    /* renamed from: a */
    public static C2699b m30583a() {
        if (f9223F == null) {
            f9223F = new C2699b();
        }
        return f9223F;
    }

    /* renamed from: a */
    private void m30582a(int i) {
        C1688z.m34449a(this.f9228E, i, 3000);
    }

    /* renamed from: a */
    public void m30581a(int i, Context context) {
        this.f9228E = context;
        switch (i) {
            case 0:
            case 29:
            default:
                return;
            case 1:
                m30582a(C1704R.C1707string.Not_IN_AIR);
                return;
            case 2:
                m30582a(C1704R.C1707string.AP_RPT_ATTITUDE);
                return;
            case 3:
                m30582a(C1704R.C1707string.LOW_POWER);
                return;
            case 4:
                m30582a(C1704R.C1707string.AP_RPT_LOG_START_FAILED);
                return;
            case 5:
                m30582a(C1704R.C1707string.AT_RPT_LOGIC);
                return;
            case 6:
                m30582a(C1704R.C1707string.AP_RPT_MOTOR_LOCK);
                return;
            case 7:
                m30582a(C1704R.C1707string.AP_RPT_HAS_TAKEN_OFF);
                return;
            case 8:
                m30582a(C1704R.C1707string.AP_RPT_ATT_OVERFLOW);
                return;
            case 9:
                m30582a(C1704R.C1707string.AP_RPT_NO_WAY_POINT);
                return;
            case 10:
                m30582a(C1704R.C1707string.AP_RPT_RTH_ING);
                return;
            case 11:
                m30582a(C1704R.C1707string.AP_RPT_INVALID_CMD);
                return;
            case 12:
                m30582a(C1704R.C1707string.AP_RPT_RTH_KEY_SET);
                return;
            case 13:
                m30582a(C1704R.C1707string.AP_RPT_NON_AUTO_MODE);
                return;
            case 14:
                m30582a(C1704R.C1707string.AP_RPT_RC_LOST);
                return;
            case 15:
                m30582a(C1704R.C1707string.AP_RPT_Vpu);
                return;
            case 16:
                m30582a(C1704R.C1707string.AP_RPT_DATA_INVALID);
                return;
            case 17:
                m30582a(C1704R.C1707string.AP_RPT_Home_Not_Set);
                return;
            case 18:
                m30582a(C1704R.C1707string.AP_RPT_Is_LANDING);
                return;
            case 19:
                m30582a(C1704R.C1707string.AP_RPT_APP_UNCONNECT);
                return;
            case 20:
                m30582a(C1704R.C1707string.AP_RPT_Compass_Err);
                return;
            case 21:
                m30582a(C1704R.C1707string.AP_RPT_ON_Calibration);
                return;
            case 22:
                m30582a(C1704R.C1707string.AP_RPT_LOG_START_FAILED);
                return;
            case 23:
                m30582a(C1704R.C1707string.AP_RPT_CYRO_ERROR);
                return;
            case 24:
                m30582a(C1704R.C1707string.AP_RPT_ACCEL_ERR);
                return;
            case 25:
                m30582a(C1704R.C1707string.AP_RPT_BARO_ERR);
                return;
            case 26:
                m30582a(C1704R.C1707string.AP_RPT_GPS_ERR);
                return;
            case 27:
                m30582a(C1704R.C1707string.AP_RPT_NO_FLY_ZONE);
                return;
            case 28:
                m30582a(C1704R.C1707string.AT_RPT_STICK_NEUTAL);
                return;
        }
    }
}
