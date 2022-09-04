package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PowerStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PowerStateImpl> CREATOR = new C4118h();

    /* renamed from: a */
    private final int f15660a;

    /* renamed from: b */
    private final int f15661b;

    /* renamed from: c */
    private final double f15662c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PowerStateImpl(int i, int i2, double d) {
        this.f15660a = i;
        this.f15661b = i2;
        this.f15662c = d;
    }

    /* renamed from: a */
    public static String m25447a(int i) {
        switch (i) {
            case 1:
                return "POWER_DISCONNECTED";
            case 2:
                return "POWER_CONNECTED_USB";
            case 3:
                return "POWER_CONNECTED_AC";
            case 4:
                return "POWER_CONNECTED_WIRELESS";
            default:
                return new StringBuilder(36).append("unknown plugged in state=").append(i).toString();
        }
    }

    /* renamed from: a */
    public int m25448a() {
        return this.f15661b;
    }

    /* renamed from: b */
    public double m25446b() {
        return this.f15662c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m25445c() {
        return this.f15660a;
    }

    public String toString() {
        String valueOf = String.valueOf(m25447a(this.f15661b));
        return new StringBuilder(String.valueOf(valueOf).length() + 69).append("PowerConnectionState = ").append(valueOf).append(" Battery Percentage = ").append(this.f15662c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4118h.m25402a(this, parcel, i);
    }
}
