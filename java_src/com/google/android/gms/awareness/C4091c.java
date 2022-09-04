package com.google.android.gms.awareness;

import com.google.android.gms.common.api.C4488f;
/* renamed from: com.google.android.gms.awareness.c */
/* loaded from: classes2.dex */
public class C4091c extends C4488f {

    /* renamed from: a */
    public static final int f15621a = 7503;

    /* renamed from: b */
    public static final int f15622b = 7504;

    /* renamed from: c */
    public static final int f15623c = 7506;

    /* renamed from: d */
    public static final int f15624d = 7507;

    /* renamed from: e */
    public static final int f15625e = 7510;

    /* renamed from: f */
    public static final int f15626f = 7511;

    /* renamed from: g */
    public static final int f15627g = 7512;

    /* renamed from: h */
    public static final int f15628h = 7513;

    /* renamed from: i */
    public static final int f15629i = 7514;

    /* renamed from: j */
    public static final int f15630j = 7515;

    private C4091c() {
    }

    /* renamed from: a */
    public static String m25509a(int i) {
        switch (i) {
            case -7501:
                return "SUCCESS_WROTE_INJECTED";
            case -7500:
                return "SUCCESS_INJECTED_ONLY";
            case 7500:
                return "MISSING_MODULE_ID";
            case 7501:
                return "EMPTY_CONTEXT_DATA_FILTER";
            case 7502:
                return "EMPTY_TRANSITION_FILTER";
            case f15621a /* 7503 */:
                return "ACL_ACCESS_DENIED";
            case f15622b /* 7504 */:
                return "BAD_ACCOUNT";
            case 7505:
                return "WRITE_FAILED";
            case f15623c /* 7506 */:
                return "BLUETOOTH_OFF";
            case f15624d /* 7507 */:
                return "INTERNAL_API_CLIENT_CONNECTION_FAILED";
            case 7508:
                return "PLACES_API_CALL_FAILED";
            case 7509:
                return "UNRESOLVED_PLACE_ALIAS";
            case f15625e /* 7510 */:
                return "INCONSISTENT_ACCOUNT";
            case f15626f /* 7511 */:
                return "INCONSISTENT_MODULE_ID";
            case f15627g /* 7512 */:
                return "API_NOT_AVAILABLE";
            case f15628h /* 7513 */:
                return "INCONSISTENT_UID";
            case f15629i /* 7514 */:
                return "FENCE_NOT_AVAILABLE";
            case f15630j /* 7515 */:
                return "MAX_LIMIT_OF_FENCE_REGISTRATIONS_EXCEEDED";
            default:
                return C4488f.m23981b(i);
        }
    }
}
