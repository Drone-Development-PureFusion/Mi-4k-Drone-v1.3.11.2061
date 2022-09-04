package com.google.android.gms.location;

import com.google.android.gms.common.api.C4488f;
/* renamed from: com.google.android.gms.location.g */
/* loaded from: classes2.dex */
public final class C8169g extends C4488f {

    /* renamed from: a */
    public static final int f26726a = 1000;

    /* renamed from: b */
    public static final int f26727b = 1001;

    /* renamed from: c */
    public static final int f26728c = 1002;

    private C8169g() {
    }

    /* renamed from: a */
    public static String m12559a(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            default:
                return C4488f.m23981b(i);
        }
    }
}
