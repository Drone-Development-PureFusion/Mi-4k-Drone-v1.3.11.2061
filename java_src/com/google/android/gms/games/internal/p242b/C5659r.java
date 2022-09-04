package com.google.android.gms.games.internal.p242b;

import com.google.android.gms.games.internal.C5906h;
/* renamed from: com.google.android.gms.games.internal.b.r */
/* loaded from: classes2.dex */
public final class C5659r {
    private C5659r() {
    }

    /* renamed from: a */
    public static String m20226a(int i) {
        switch (i) {
            case 1:
                return "GIFT";
            case 2:
                return "WISH";
            default:
                C5906h.m19938b("RequestType", new StringBuilder(33).append("Unknown request type: ").append(i).toString());
                return "UNKNOWN_TYPE";
        }
    }
}
