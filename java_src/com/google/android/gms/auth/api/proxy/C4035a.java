package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.C4488f;
/* renamed from: com.google.android.gms.auth.api.proxy.a */
/* loaded from: classes2.dex */
public class C4035a extends C4488f {

    /* renamed from: a */
    public static final int f15501a = 3000;

    /* renamed from: b */
    public static final int f15502b = 3001;

    /* renamed from: c */
    public static final int f15503c = 3002;

    /* renamed from: d */
    public static final int f15504d = 3003;

    /* renamed from: e */
    public static final int f15505e = 3004;

    /* renamed from: f */
    public static final int f15506f = 3005;

    /* renamed from: g */
    public static final int f15507g = 3006;

    private C4035a() {
    }

    /* renamed from: a */
    public static String m25698a(int i) {
        switch (i) {
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case f15505e /* 3004 */:
                return "AUTH_TOKEN_ERROR";
            case f15506f /* 3005 */:
                return "AUTH_URL_RESOLUTION";
            case f15507g /* 3006 */:
                return "AUTH_APP_CERT_ERROR";
            default:
                return C4488f.m23981b(i);
        }
    }
}
