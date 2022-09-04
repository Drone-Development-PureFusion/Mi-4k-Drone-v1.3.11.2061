package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DeviceStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceStatus> CREATOR = new C4431g();

    /* renamed from: a */
    private final int f16597a;

    /* renamed from: b */
    private double f16598b;

    /* renamed from: c */
    private boolean f16599c;

    /* renamed from: d */
    private int f16600d;

    /* renamed from: e */
    private ApplicationMetadata f16601e;

    /* renamed from: f */
    private int f16602f;

    public DeviceStatus() {
        this(3, Double.NaN, false, -1, null, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceStatus(int i, double d, boolean z, int i2, ApplicationMetadata applicationMetadata, int i3) {
        this.f16597a = i;
        this.f16598b = d;
        this.f16599c = z;
        this.f16600d = i2;
        this.f16601e = applicationMetadata;
        this.f16602f = i3;
    }

    /* renamed from: a */
    public int m24278a() {
        return this.f16597a;
    }

    /* renamed from: b */
    public double m24277b() {
        return this.f16598b;
    }

    /* renamed from: c */
    public boolean m24276c() {
        return this.f16599c;
    }

    /* renamed from: d */
    public int m24275d() {
        return this.f16600d;
    }

    /* renamed from: e */
    public int m24274e() {
        return this.f16602f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        return this.f16598b == deviceStatus.f16598b && this.f16599c == deviceStatus.f16599c && this.f16600d == deviceStatus.f16600d && C4430f.m24206a(this.f16601e, deviceStatus.f16601e) && this.f16602f == deviceStatus.f16602f;
    }

    /* renamed from: f */
    public ApplicationMetadata m24273f() {
        return this.f16601e;
    }

    public int hashCode() {
        return C4585c.m23633a(Double.valueOf(this.f16598b), Boolean.valueOf(this.f16599c), Integer.valueOf(this.f16600d), this.f16601e, Integer.valueOf(this.f16602f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4431g.m24199a(this, parcel, i);
    }
}
