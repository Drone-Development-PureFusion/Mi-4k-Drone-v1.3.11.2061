package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.api.C4488f;
/* renamed from: com.google.android.gms.nearby.messages.h */
/* loaded from: classes2.dex */
public class C8838h extends C4488f {

    /* renamed from: a */
    public static final int f28240a = 2801;

    /* renamed from: b */
    public static final int f28241b = 2802;

    /* renamed from: c */
    public static final int f28242c = 2803;

    /* renamed from: d */
    public static final int f28243d = 2804;

    /* renamed from: e */
    public static final int f28244e = 2805;

    /* renamed from: f */
    public static final int f28245f = 2806;

    /* renamed from: g */
    public static final int f28246g = 2807;

    /* renamed from: h */
    public static final int f28247h = 2820;

    /* renamed from: i */
    public static final int f28248i = 2821;

    /* renamed from: j */
    public static final int f28249j = 2822;

    private C8838h() {
    }

    /* renamed from: a */
    public static String m9922a(int i) {
        switch (i) {
            case f28240a /* 2801 */:
                return "TOO_MANY_PENDING_INTENTS";
            case f28241b /* 2802 */:
                return "APP_NOT_OPTED_IN";
            case f28242c /* 2803 */:
                return "DISALLOWED_CALLING_CONTEXT";
            case f28244e /* 2805 */:
                return "NOT_AUTHORIZED";
            case f28245f /* 2806 */:
                return "FORBIDDEN";
            case f28247h /* 2820 */:
                return "BLUETOOTH_OFF";
            case f28248i /* 2821 */:
                return "BLE_ADVERTISING_UNSUPPORTED";
            case f28249j /* 2822 */:
                return "BLE_SCANNING_UNSUPPORTED";
            default:
                return C4488f.m23981b(i);
        }
    }
}
