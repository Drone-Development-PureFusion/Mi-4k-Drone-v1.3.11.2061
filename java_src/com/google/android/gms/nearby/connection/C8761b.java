package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.C4488f;
/* renamed from: com.google.android.gms.nearby.connection.b */
/* loaded from: classes2.dex */
public final class C8761b extends C4488f {

    /* renamed from: a */
    public static final int f28052a = 0;

    /* renamed from: b */
    public static final int f28053b = 13;

    /* renamed from: c */
    public static final int f28054c = 8000;

    /* renamed from: d */
    public static final int f28055d = 8001;

    /* renamed from: e */
    public static final int f28056e = 8002;

    /* renamed from: f */
    public static final int f28057f = 8003;

    /* renamed from: g */
    public static final int f28058g = 8004;

    /* renamed from: h */
    public static final int f28059h = 8005;

    private C8761b() {
    }

    /* renamed from: a */
    public static String m10203a(int i) {
        switch (i) {
            case 8000:
                return "STATUS_NETWORK_NOT_CONNECTED";
            case 8001:
                return "STATUS_ALREADY_ADVERTISING";
            case 8002:
                return "STATUS_ALREADY_DISCOVERING";
            case 8003:
                return "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
            case f28058g /* 8004 */:
                return "STATUS_CONNECTION_REJECTED";
            case f28059h /* 8005 */:
                return "STATUS_NOT_CONNECTED_TO_ENDPOINT";
            default:
                return C4488f.m23981b(i);
        }
    }
}
