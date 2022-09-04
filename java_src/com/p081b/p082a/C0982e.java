package com.p081b.p082a;
/* renamed from: com.b.a.e */
/* loaded from: classes.dex */
public class C0982e implements AbstractC1014p {
    @Override // com.p081b.p082a.AbstractC1014p
    /* renamed from: a */
    public Object mo37111a(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        int i = intValue >> 24;
        int i2 = (intValue >> 16) & 255;
        int i3 = (intValue >> 8) & 255;
        int i4 = intValue & 255;
        int intValue2 = ((Integer) obj2).intValue();
        return Integer.valueOf((i4 + ((int) (((intValue2 & 255) - i4) * f))) | ((i + ((int) (((intValue2 >> 24) - i) * f))) << 24) | ((i2 + ((int) ((((intValue2 >> 16) & 255) - i2) * f))) << 16) | ((((int) ((((intValue2 >> 8) & 255) - i3) * f)) + i3) << 8));
    }
}
