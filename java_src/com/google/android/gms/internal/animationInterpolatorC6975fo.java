package com.google.android.gms.internal;

import android.view.animation.Interpolator;
/* renamed from: com.google.android.gms.internal.fo  reason: invalid class name */
/* loaded from: classes2.dex */
public class animationInterpolatorC6975fo implements Interpolator {

    /* renamed from: a */
    private float[] f23648a;

    /* renamed from: b */
    private float[] f23649b;

    public animationInterpolatorC6975fo(float f, float f2, float f3, float f4) {
        C6976fp c6976fp = new C6976fp();
        c6976fp.m15847a(0.0f, 0.0f);
        c6976fp.m15846a(f, f2, f3, f4, 1.0f, 1.0f);
        m15850a(c6976fp);
    }

    /* renamed from: a */
    private void m15850a(C6976fp c6976fp) {
        int i = 0;
        float[] m15848a = c6976fp.m15848a(0.002f);
        int length = m15848a.length / 3;
        if (m15848a[1] == 0.0f && m15848a[2] == 0.0f && m15848a[m15848a.length - 2] == 1.0f && m15848a[m15848a.length - 1] == 1.0f) {
            this.f23648a = new float[length];
            this.f23649b = new float[length];
            float f = 0.0f;
            float f2 = 0.0f;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                float f3 = m15848a[i2];
                int i4 = i3 + 1;
                float f4 = m15848a[i3];
                i2 = i4 + 1;
                float f5 = m15848a[i4];
                if (f3 == f && f4 != f2) {
                    throw new IllegalArgumentException("The Path cannot have discontinuity in the X axis.");
                }
                if (f4 < f2) {
                    throw new IllegalArgumentException("The Path cannot loop back on itself.");
                }
                this.f23648a[i] = f4;
                this.f23649b[i] = f5;
                i++;
                f = f3;
                f2 = f4;
            }
            return;
        }
        throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1)");
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int i;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f23648a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f < this.f23648a[i3]) {
                i = i2;
            } else {
                int i4 = length;
                i = i3;
                i3 = i4;
            }
            i2 = i;
            length = i3;
        }
        float f2 = this.f23648a[length] - this.f23648a[i2];
        if (f2 == 0.0f) {
            return this.f23649b[i2];
        }
        float f3 = (f - this.f23648a[i2]) / f2;
        float f4 = this.f23649b[i2];
        return (f3 * (this.f23649b[length] - f4)) + f4;
    }
}
