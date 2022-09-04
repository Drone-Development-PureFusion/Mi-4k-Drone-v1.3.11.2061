package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class Device extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Device> CREATOR = new C8746b();

    /* renamed from: a */
    final int f28001a;

    /* renamed from: b */
    private final String f28002b;

    /* renamed from: c */
    private final String f28003c;

    /* renamed from: d */
    private final String f28004d;

    /* renamed from: e */
    private final byte f28005e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Device(int i, String str, String str2, String str3, byte b) {
        this.f28001a = i;
        this.f28002b = C4588d.m23625a(str);
        this.f28003c = (String) C4588d.m23627a(str2);
        this.f28004d = (String) C4588d.m23627a(str3);
        C4588d.m23618b(b <= 4, "Unknown device type");
        this.f28005e = b;
    }

    /* renamed from: a */
    public String m10290a() {
        return this.f28002b;
    }

    /* renamed from: b */
    public String m10289b() {
        return this.f28003c;
    }

    /* renamed from: c */
    public String m10288c() {
        return this.f28004d;
    }

    /* renamed from: d */
    public byte m10287d() {
        return this.f28005e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return this.f28002b.equals(device.f28002b) && this.f28003c.equals(device.f28003c) && this.f28005e == device.f28005e && this.f28004d.equals(device.f28004d);
    }

    public int hashCode() {
        return (this.f28005e * 31 * 31 * 31) + (this.f28004d.hashCode() * 31 * 31) + (this.f28002b.hashCode() * 31) + this.f28003c.hashCode();
    }

    public String toString() {
        String str = this.f28002b;
        String str2 = this.f28003c;
        return new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()).append(str).append(": ").append(str2).append("[").append((int) this.f28005e).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8746b.m10284a(this, parcel, i);
    }
}
