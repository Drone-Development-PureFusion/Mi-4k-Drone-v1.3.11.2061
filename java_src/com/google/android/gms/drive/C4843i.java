package com.google.android.gms.drive;

import com.google.android.gms.auth.api.proxy.C4035a;
import com.google.android.gms.common.api.C4488f;
/* renamed from: com.google.android.gms.drive.i */
/* loaded from: classes.dex */
public final class C4843i extends C4488f {
    @Deprecated

    /* renamed from: a */
    public static final int f17637a = 1500;

    /* renamed from: b */
    public static final int f17638b = 1502;

    /* renamed from: c */
    public static final int f17639c = 1507;

    /* renamed from: d */
    public static final int f17640d = 1508;

    private C4843i() {
    }

    /* renamed from: a */
    public static String m22624a(int i) {
        switch (i) {
            case 1501:
                return "DRIVE_RESOURCE_ALREADY_EXISTS";
            case f17638b /* 1502 */:
                return "DRIVE_RESOURCE_NOT_AVAILABLE";
            case 1503:
                return "DRIVE_RESOURCE_FORBIDDEN";
            case 1504:
                return "DRIVE_REALTIME_CONCURRENT_CREATION";
            case 1505:
                return "DRIVE_REALTIME_INVALID_COMPOUND_OP";
            case 1506:
                return "DRIVE_FULL_SYNC_REQUIRED";
            case f17639c /* 1507 */:
                return "DRIVE_RATE_LIMIT_EXCEEDED";
            case f17640d /* 1508 */:
                return "DRIVE_CONTENTS_TOO_LARGE";
            case 1509:
                return "DRIVE_RESOURCE_PERMISSION_FORBIDDEN";
            case 1510:
                return "DRIVE_INAPPLICABLE_OPERATION";
            case 1511:
                return "DRIVE_INSUFFICIENT_SCOPES";
            case C4035a.f15505e /* 3004 */:
                return "DRIVE_REALTIME_TOKEN_REFRESH_REQUIRED";
            default:
                return C4488f.m23981b(i);
        }
    }
}
