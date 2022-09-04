package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import com.google.android.gms.iid.C6095a;
/* renamed from: com.google.android.gms.common.api.f */
/* loaded from: classes.dex */
public class C4488f {

    /* renamed from: k */
    public static final int f16815k = -1;

    /* renamed from: l */
    public static final int f16816l = 0;
    @Deprecated

    /* renamed from: m */
    public static final int f16817m = 2;
    @Deprecated

    /* renamed from: n */
    public static final int f16818n = 3;

    /* renamed from: o */
    public static final int f16819o = 4;

    /* renamed from: p */
    public static final int f16820p = 5;

    /* renamed from: q */
    public static final int f16821q = 6;

    /* renamed from: r */
    public static final int f16822r = 7;

    /* renamed from: s */
    public static final int f16823s = 8;

    /* renamed from: t */
    public static final int f16824t = 10;

    /* renamed from: u */
    public static final int f16825u = 13;

    /* renamed from: v */
    public static final int f16826v = 14;

    /* renamed from: w */
    public static final int f16827w = 15;

    /* renamed from: x */
    public static final int f16828x = 16;

    /* renamed from: y */
    public static final int f16829y = 17;

    /* renamed from: z */
    public static final int f16830z = 18;

    @NonNull
    /* renamed from: b */
    public static String m23981b(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return new StringBuilder(32).append("unknown status code: ").append(i).toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return C6095a.f20616b;
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }
}
