package com.tencent.stat.common;
/* renamed from: com.tencent.stat.common.g */
/* loaded from: classes2.dex */
public class C10342g {

    /* renamed from: a */
    static final /* synthetic */ boolean f32236a;

    static {
        f32236a = !C10342g.class.desiredAssertionStatus();
    }

    private C10342g() {
    }

    /* renamed from: a */
    public static byte[] m5446a(byte[] bArr, int i) {
        return m5445a(bArr, 0, bArr.length, i);
    }

    /* renamed from: a */
    public static byte[] m5445a(byte[] bArr, int i, int i2, int i3) {
        C10344i c10344i = new C10344i(i3, new byte[(i2 * 3) / 4]);
        if (!c10344i.m5442a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (c10344i.f32238b == c10344i.f32237a.length) {
            return c10344i.f32237a;
        }
        byte[] bArr2 = new byte[c10344i.f32238b];
        System.arraycopy(c10344i.f32237a, 0, bArr2, 0, c10344i.f32238b);
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m5444b(byte[] bArr, int i) {
        return m5443b(bArr, 0, bArr.length, i);
    }

    /* renamed from: b */
    public static byte[] m5443b(byte[] bArr, int i, int i2, int i3) {
        C10345j c10345j = new C10345j(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!c10345j.f32248d) {
            switch (i2 % 3) {
                case 1:
                    i4 += 2;
                    break;
                case 2:
                    i4 += 3;
                    break;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (c10345j.f32249e && i2 > 0) {
            i4 += (c10345j.f32250f ? 2 : 1) * (((i2 - 1) / 57) + 1);
        }
        c10345j.f32237a = new byte[i4];
        c10345j.m5441a(bArr, i, i2, true);
        if (f32236a || c10345j.f32238b == i4) {
            return c10345j.f32237a;
        }
        throw new AssertionError();
    }
}
