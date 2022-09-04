package com.google.android.gms.gcm;

import android.os.Bundle;
/* renamed from: com.google.android.gms.gcm.g */
/* loaded from: classes2.dex */
public class C6075g {

    /* renamed from: a */
    public static final C6075g f20561a = new C6075g(0, 30, 3600);

    /* renamed from: b */
    public static final C6075g f20562b = new C6075g(1, 30, 3600);

    /* renamed from: c */
    private final int f20563c;

    /* renamed from: d */
    private final int f20564d;

    /* renamed from: e */
    private final int f20565e;

    private C6075g(int i, int i2, int i3) {
        this.f20563c = i;
        this.f20564d = i2;
        this.f20565e = i3;
    }

    /* renamed from: a */
    public int m18813a() {
        return this.f20563c;
    }

    /* renamed from: a */
    public Bundle m18812a(Bundle bundle) {
        bundle.putInt("retry_policy", this.f20563c);
        bundle.putInt("initial_backoff_seconds", this.f20564d);
        bundle.putInt("maximum_backoff_seconds", this.f20565e);
        return bundle;
    }

    /* renamed from: b */
    public int m18811b() {
        return this.f20564d;
    }

    /* renamed from: c */
    public int m18810c() {
        return this.f20565e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6075g)) {
            return false;
        }
        C6075g c6075g = (C6075g) obj;
        return c6075g.f20563c == this.f20563c && c6075g.f20564d == this.f20564d && c6075g.f20565e == this.f20565e;
    }

    public int hashCode() {
        return (((((this.f20563c + 1) ^ 1000003) * 1000003) ^ this.f20564d) * 1000003) ^ this.f20565e;
    }

    public String toString() {
        int i = this.f20563c;
        int i2 = this.f20564d;
        return new StringBuilder(74).append("policy=").append(i).append(" initial_backoff=").append(i2).append(" maximum_backoff=").append(this.f20565e).toString();
    }
}
