package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
/* renamed from: com.google.android.gms.vision.text.f */
/* loaded from: classes2.dex */
final class C9315f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Rect m8635a(AbstractC9309c abstractC9309c) {
        Point[] mo8650d;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : abstractC9309c.mo8650d()) {
            i4 = Math.min(i4, point.x);
            i3 = Math.max(i3, point.x);
            i = Math.min(i, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i4, i, i3, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Point[] m8634a(BoundingBoxParcel boundingBoxParcel) {
        double sin = Math.sin(Math.toRadians(boundingBoxParcel.f29385f));
        double cos = Math.cos(Math.toRadians(boundingBoxParcel.f29385f));
        Point[] pointArr = {new Point(boundingBoxParcel.f29381b, boundingBoxParcel.f29382c), new Point((int) (boundingBoxParcel.f29381b + (boundingBoxParcel.f29383d * cos)), (int) (boundingBoxParcel.f29382c + (boundingBoxParcel.f29383d * sin))), new Point((int) (pointArr[1].x - (sin * boundingBoxParcel.f29384e)), (int) ((cos * boundingBoxParcel.f29384e) + pointArr[1].y)), new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y))};
        return pointArr;
    }
}
