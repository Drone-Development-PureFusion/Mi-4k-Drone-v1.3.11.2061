package com.google.android.gms.cast;

import com.google.android.gms.common.api.C4488f;
import com.google.android.gms.iid.C6095a;
/* renamed from: com.google.android.gms.cast.f */
/* loaded from: classes2.dex */
public final class C4235f {

    /* renamed from: a */
    public static final int f16099a = 0;

    /* renamed from: b */
    public static final int f16100b = 7;

    /* renamed from: c */
    public static final int f16101c = 15;

    /* renamed from: d */
    public static final int f16102d = 14;

    /* renamed from: e */
    public static final int f16103e = 2000;

    /* renamed from: f */
    public static final int f16104f = 2001;

    /* renamed from: g */
    public static final int f16105g = 2002;

    /* renamed from: h */
    public static final int f16106h = 2003;

    /* renamed from: i */
    public static final int f16107i = 2004;

    /* renamed from: j */
    public static final int f16108j = 2005;

    /* renamed from: k */
    public static final int f16109k = 2006;

    /* renamed from: l */
    public static final int f16110l = 2007;

    /* renamed from: m */
    public static final int f16111m = 2100;

    /* renamed from: n */
    public static final int f16112n = 2103;

    /* renamed from: o */
    public static final int f16113o = 8;

    /* renamed from: p */
    public static final int f16114p = 13;

    /* renamed from: q */
    public static final int f16115q = 2200;

    /* renamed from: r */
    public static final int f16116r = 2201;

    private C4235f() {
    }

    /* renamed from: a */
    public static String m24914a(int i) {
        switch (i) {
            case 0:
                return "SUCCESS";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 13:
                return "UNKNOWN_ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return C6095a.f20616b;
            case 2000:
                return "AUTHENTICATION_FAILED";
            case 2001:
                return "INVALID_REQUEST";
            case 2002:
                return "CANCELED";
            case f16106h /* 2003 */:
                return "NOT_ALLOWED";
            case f16107i /* 2004 */:
                return "APPLICATION_NOT_FOUND";
            case f16108j /* 2005 */:
                return "APPLICATION_NOT_RUNNING";
            case f16109k /* 2006 */:
                return "MESSAGE_TOO_LARGE";
            case f16110l /* 2007 */:
                return "MESSAGE_SEND_BUFFER_TOO_FULL";
            case 2100:
                return "FAILED";
            case C4380g.f16481g /* 2101 */:
                return "STATUS_CANCELLED";
            case C4380g.f16482h /* 2102 */:
                return "STATUS_TIMED_OUT";
            case 2103:
                return "REPLACED";
            case f16115q /* 2200 */:
                return "ERROR_SERVICE_CREATION_FAILED";
            case f16116r /* 2201 */:
                return "ERROR_SERVICE_DISCONNECTED";
            default:
                return C4488f.m23981b(i);
        }
    }
}
