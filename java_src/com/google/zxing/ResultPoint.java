package com.google.zxing;

import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes2.dex */
public class ResultPoint {

    /* renamed from: x */
    private final float f30877x;

    /* renamed from: y */
    private final float f30878y;

    public ResultPoint(float f, float f2) {
        this.f30877x = f;
        this.f30878y = f2;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f30877x;
        float f2 = resultPoint2.f30878y;
        return ((resultPoint3.f30877x - f) * (resultPoint.f30878y - f2)) - ((resultPoint.f30877x - f) * (resultPoint3.f30878y - f2));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float x = resultPoint.getX() - resultPoint2.getX();
        float y = resultPoint.getY() - resultPoint2.getY();
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (distance3 < distance2 || distance3 < distance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) >= 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint3;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            return this.f30877x == resultPoint.f30877x && this.f30878y == resultPoint.f30878y;
        }
        return false;
    }

    public final float getX() {
        return this.f30877x;
    }

    public final float getY() {
        return this.f30878y;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f30877x) * 31) + Float.floatToIntBits(this.f30878y);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(25);
        stringBuffer.append(C0494h.f731s);
        stringBuffer.append(this.f30877x);
        stringBuffer.append(C0494h.f736x);
        stringBuffer.append(this.f30878y);
        stringBuffer.append(C0494h.f732t);
        return stringBuffer.toString();
    }
}
