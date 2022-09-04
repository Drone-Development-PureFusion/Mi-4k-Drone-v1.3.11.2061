package com.google.android.gms.location.places;

import com.google.android.gms.common.api.C4488f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.C5384f;
/* renamed from: com.google.android.gms.location.places.n */
/* loaded from: classes2.dex */
public class C8295n extends C4488f {

    /* renamed from: a */
    public static final int f27165a = 9001;

    /* renamed from: b */
    public static final int f27166b = 9002;

    /* renamed from: c */
    public static final int f27167c = 9003;

    /* renamed from: d */
    public static final int f27168d = 9004;

    /* renamed from: e */
    public static final int f27169e = 9005;

    /* renamed from: f */
    public static final int f27170f = 9006;

    /* renamed from: g */
    public static final int f27171g = 9007;

    /* renamed from: h */
    public static final int f27172h = 9008;

    private C8295n() {
    }

    /* renamed from: a */
    public static Status m12144a(int i, String str) {
        C4588d.m23627a(str);
        return new Status(i, str);
    }

    /* renamed from: a */
    public static String m12145a(int i) {
        switch (i) {
            case C5384f.f19494Y /* 9000 */:
                return "PLACES_API_QUOTA_FAILED";
            case 9001:
                return "PLACES_API_USAGE_LIMIT_EXCEEDED";
            case 9002:
                return "PLACES_API_KEY_INVALID";
            case 9003:
                return "PLACES_API_ACCESS_NOT_CONFIGURED";
            case 9004:
                return "PLACES_API_INVALID_ARGUMENT";
            case f27169e /* 9005 */:
                return "PLACES_API_RATE_LIMIT_EXCEEDED";
            case 9006:
                return "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";
            case f27171g /* 9007 */:
                return "PLACES_API_KEY_EXPIRED";
            case f27172h /* 9008 */:
                return "PLACES_API_INVALID_APP";
            case 9051:
                return "PLACE_ALIAS_NOT_FOUND";
            case 9101:
                return "PLACE_PROXIMITY_UNKNOWN";
            case 9102:
                return "NEARBY_ALERTS_NOT_AVAILABLE";
            default:
                return C4488f.m23981b(i);
        }
    }

    /* renamed from: c */
    public static Status m12143c(int i) {
        return m12144a(i, m12145a(i));
    }
}
