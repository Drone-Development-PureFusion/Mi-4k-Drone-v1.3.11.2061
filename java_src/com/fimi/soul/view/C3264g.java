package com.fimi.soul.view;

import android.graphics.Point;
/* renamed from: com.fimi.soul.view.g */
/* loaded from: classes2.dex */
class C3264g {
    C3264g() {
    }

    /* renamed from: a */
    public static double m28561a(float f, float f2, int i, int i2) {
        int abs = Math.abs((int) (f - i));
        int abs2 = Math.abs((int) (f2 - i2));
        return Math.round((float) ((Math.asin(abs2 / Math.sqrt((abs * abs) + (abs2 * abs2))) / 3.141592653589793d) * 180.0d));
    }

    /* renamed from: a */
    public static float m28560a(Point point, Point point2) {
        float f = point2.x - point.x;
        float f2 = point2.y - point.y;
        return (point2.y < point.y ? -1 : 1) * ((float) Math.acos(f / ((float) Math.sqrt((f2 * f2) + (f * f)))));
    }

    /* renamed from: a */
    public static int m28562a(float f, float f2, float f3, float f4) {
        return (int) Math.sqrt(Math.pow(f - f3, 2.0d) + Math.pow(f2 - f4, 2.0d));
    }

    /* renamed from: a */
    public static Point m28559a(Point point, Point point2, int i) {
        float m28560a = m28560a(point, point2);
        return new Point(point.x + ((int) (i * Math.cos(m28560a))), ((int) (i * Math.sin(m28560a))) + point.x);
    }
}
