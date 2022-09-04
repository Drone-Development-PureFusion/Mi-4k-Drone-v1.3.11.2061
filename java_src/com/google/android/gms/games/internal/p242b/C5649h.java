package com.google.android.gms.games.internal.p242b;
/* renamed from: com.google.android.gms.games.internal.b.h */
/* loaded from: classes2.dex */
public final class C5649h {
    private C5649h() {
    }

    /* renamed from: a */
    public static String m20229a(int i) {
        switch (i) {
            case 0:
                return "PUBLIC";
            case 1:
                return "SOCIAL";
            case 2:
                return "SOCIAL_1P";
            default:
                throw new IllegalArgumentException(new StringBuilder(43).append("Unknown leaderboard collection: ").append(i).toString());
        }
    }
}
