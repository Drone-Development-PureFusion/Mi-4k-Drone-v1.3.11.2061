package com.google.android.gms.games.internal.p242b;
/* renamed from: com.google.android.gms.games.internal.b.x */
/* loaded from: classes2.dex */
public final class C5665x {
    private C5665x() {
        throw new AssertionError("Uninstantiable");
    }

    /* renamed from: a */
    public static String m20224a(int i) {
        switch (i) {
            case 0:
                return "DAILY";
            case 1:
                return "WEEKLY";
            case 2:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException(new StringBuilder(29).append("Unknown time span ").append(i).toString());
        }
    }
}
