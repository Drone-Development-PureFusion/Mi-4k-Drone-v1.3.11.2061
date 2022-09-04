package com.google.android.gms.internal;

import android.graphics.PointF;
/* renamed from: com.google.android.gms.internal.fn */
/* loaded from: classes2.dex */
public interface AbstractC6972fn {

    /* renamed from: com.google.android.gms.internal.fn$a */
    /* loaded from: classes2.dex */
    public static class C6973a implements AbstractC6972fn {
        @Override // com.google.android.gms.internal.AbstractC6972fn
        /* renamed from: a */
        public PointF mo15851a(float f, PointF[] pointFArr, PointF pointF) {
            float f2 = 1.0f - f;
            float f3 = f2 * f2;
            float f4 = f3 * f2;
            float f5 = f * f;
            float f6 = f5 * f;
            pointF.set((pointFArr[0].x * f4) + (3.0f * f3 * f * pointFArr[1].x) + (3.0f * f2 * f5 * pointFArr[2].x) + (pointFArr[3].x * f6), (f2 * 3.0f * f5 * pointFArr[2].y) + (f3 * 3.0f * f * pointFArr[1].y) + (f4 * pointFArr[0].y) + (pointFArr[3].y * f6));
            return pointF;
        }
    }

    /* renamed from: com.google.android.gms.internal.fn$b */
    /* loaded from: classes2.dex */
    public static class C6974b implements AbstractC6972fn {
        @Override // com.google.android.gms.internal.AbstractC6972fn
        /* renamed from: a */
        public PointF mo15851a(float f, PointF[] pointFArr, PointF pointF) {
            float f2 = 1.0f - f;
            pointF.set((((pointFArr[0].x * f2) + (pointFArr[1].x * f)) * f2) + (((pointFArr[1].x * f2) + (pointFArr[2].x * f)) * f), (((f2 * pointFArr[1].y) + (pointFArr[2].y * f)) * f) + (((pointFArr[0].y * f2) + (pointFArr[1].y * f)) * f2));
            return pointF;
        }
    }

    /* renamed from: a */
    PointF mo15851a(float f, PointF[] pointFArr, PointF pointF);
}
