package com.google.android.gms.games.internal.p242b;
/* renamed from: com.google.android.gms.games.internal.b.n */
/* loaded from: classes2.dex */
public final class C5655n {
    private C5655n() {
    }

    /* renamed from: a */
    public static String m20227a(int i) {
        switch (i) {
            case 0:
                return "ANDROID";
            case 1:
                return "IOS";
            case 2:
                return "WEB_APP";
            default:
                throw new IllegalArgumentException(new StringBuilder(34).append("Unknown platform type: ").append(i).toString());
        }
    }
}
