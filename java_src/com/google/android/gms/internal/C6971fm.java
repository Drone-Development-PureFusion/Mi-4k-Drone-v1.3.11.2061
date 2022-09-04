package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.fm */
/* loaded from: classes2.dex */
public final class C6971fm {
    /* renamed from: a */
    public static float m15854a(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: a */
    public static float m15853a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m15854a(m15852b(f, f2, f3, f4), m15852b(f, f2, f5, f4), m15852b(f, f2, f5, f6), m15852b(f, f2, f3, f6));
    }

    /* renamed from: b */
    public static float m15852b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }
}
