package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4488f;
import com.google.android.gms.games.C5384f;
/* loaded from: classes2.dex */
public final class ajs extends C4488f {
    /* renamed from: a */
    public static String m17089a(int i) {
        switch (i) {
            case -6508:
                return "SUCCESS_CACHE_STALE";
            case -6506:
                return "SUCCESS_CACHE";
            case -6505:
                return "SUCCESS_FRESH";
            case C5384f.f19475F /* 6500 */:
                return "NOT_AUTHORIZED_TO_FETCH";
            case C5384f.f19476G /* 6501 */:
                return "ANOTHER_FETCH_INFLIGHT";
            case C5384f.f19477H /* 6502 */:
                return "FETCH_THROTTLED";
            case C5384f.f19478I /* 6503 */:
                return "NOT_AVAILABLE";
            case C5384f.f19479J /* 6504 */:
                return "FAILURE_CACHE";
            case C5384f.f19482M /* 6507 */:
                return "FETCH_THROTTLED_STALE";
            default:
                return C4488f.m23981b(i);
        }
    }
}
