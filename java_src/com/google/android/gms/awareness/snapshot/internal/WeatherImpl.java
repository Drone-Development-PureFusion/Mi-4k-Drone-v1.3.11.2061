package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.state.AbstractC4143b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.C7715sw;
import com.xiaomi.mipush.sdk.Constants;
/* loaded from: classes2.dex */
public class WeatherImpl extends AbstractSafeParcelable implements AbstractC4143b {
    public static final Parcelable.Creator<WeatherImpl> CREATOR = new C4139o();

    /* renamed from: m */
    private final int f15680m;

    /* renamed from: n */
    private final float f15681n;

    /* renamed from: o */
    private final float f15682o;

    /* renamed from: p */
    private final float f15683p;

    /* renamed from: q */
    private final int f15684q;

    /* renamed from: r */
    private final int[] f15685r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WeatherImpl(int i, float f, float f2, float f3, int i2, int[] iArr) {
        this.f15680m = i;
        this.f15681n = f;
        this.f15682o = f2;
        this.f15683p = f3;
        this.f15684q = i2;
        this.f15685r = iArr;
    }

    /* renamed from: a */
    private static float m25427a(float f) {
        return (5.0f * (f - 32.0f)) / 9.0f;
    }

    /* renamed from: a */
    static float m25426a(int i, float f) {
        switch (i) {
            case 1:
                return f;
            case 2:
                return m25427a(f);
            default:
                C7715sw.m13665a("WeatherImpl", "Invalid temperature unit %s", Integer.valueOf(i));
                throw new IllegalArgumentException("Invalid temperature unit");
        }
    }

    @Override // com.google.android.gms.awareness.state.AbstractC4143b
    /* renamed from: a */
    public float mo25353a(int i) {
        return m25426a(i, this.f15683p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25428a() {
        return this.f15680m;
    }

    /* renamed from: b */
    public float m25425b() {
        return this.f15683p;
    }

    @Override // com.google.android.gms.awareness.state.AbstractC4143b
    /* renamed from: b */
    public float mo25352b(int i) {
        return m25426a(i, this.f15682o);
    }

    /* renamed from: c */
    public float m25424c() {
        return this.f15682o;
    }

    @Override // com.google.android.gms.awareness.state.AbstractC4143b
    /* renamed from: c */
    public float mo25351c(int i) {
        return m25426a(i, this.f15681n);
    }

    /* renamed from: d */
    public float m25423d() {
        return this.f15681n;
    }

    @Override // com.google.android.gms.awareness.state.AbstractC4143b
    /* renamed from: e */
    public int mo25350e() {
        return this.f15684q;
    }

    @Override // com.google.android.gms.awareness.state.AbstractC4143b
    /* renamed from: f */
    public int[] mo25349f() {
        return this.f15685r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temp=").append(mo25351c(1)).append("F/").append(mo25351c(2)).append("C, Feels=").append(mo25352b(1)).append("F/").append(mo25352b(2)).append("C, Dew=").append(mo25353a(1)).append("F/").append(mo25353a(2)).append("C, Humidity=").append(mo25350e()).append(", Condition=");
        if (mo25349f() == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] mo25349f = mo25349f();
            int length = mo25349f.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = mo25349f[i];
                if (!z) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4139o.m25361a(this, parcel, i);
    }
}
