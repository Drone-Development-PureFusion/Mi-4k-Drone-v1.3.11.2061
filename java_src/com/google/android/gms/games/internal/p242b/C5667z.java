package com.google.android.gms.games.internal.p242b;

import com.google.android.gms.games.internal.C5906h;
/* renamed from: com.google.android.gms.games.internal.b.z */
/* loaded from: classes2.dex */
public final class C5667z {
    /* renamed from: a */
    public static String m20223a(int i) {
        switch (i) {
            case 0:
                return "TURN_STATUS_INVITED";
            case 1:
                return "TURN_STATUS_MY_TURN";
            case 2:
                return "TURN_STATUS_THEIR_TURN";
            case 3:
                return "TURN_STATUS_COMPLETE";
            default:
                C5906h.m19938b("MatchTurnStatus", new StringBuilder(38).append("Unknown match turn status: ").append(i).toString());
                return "TURN_STATUS_UNKNOWN";
        }
    }
}
