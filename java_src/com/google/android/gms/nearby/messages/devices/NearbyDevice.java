package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class NearbyDevice extends AbstractSafeParcelable {

    /* renamed from: b */
    final int f28219b;
    @Deprecated

    /* renamed from: c */
    final NearbyDeviceId f28220c;
    @Nullable
    @Deprecated

    /* renamed from: d */
    final String f28221d;
    @Deprecated

    /* renamed from: e */
    final NearbyDeviceId[] f28222e;
    @Deprecated

    /* renamed from: f */
    final String[] f28223f;

    /* renamed from: i */
    private final String f28224i;
    public static final Parcelable.Creator<NearbyDevice> CREATOR = new C8830a();

    /* renamed from: g */
    private static final NearbyDeviceId[] f28217g = new NearbyDeviceId[0];

    /* renamed from: h */
    private static final String[] f28218h = new String[0];

    /* renamed from: a */
    public static final NearbyDevice f28216a = new NearbyDevice("", f28217g, f28218h);

    /* JADX INFO: Access modifiers changed from: package-private */
    public NearbyDevice(int i, @Nullable NearbyDeviceId nearbyDeviceId, @Nullable String str, @Nullable String str2, @Nullable NearbyDeviceId[] nearbyDeviceIdArr, @Nullable String[] strArr) {
        this.f28219b = ((Integer) C4588d.m23627a(Integer.valueOf(i))).intValue();
        this.f28224i = str2 == null ? "" : str2;
        this.f28222e = nearbyDeviceIdArr == null ? f28217g : nearbyDeviceIdArr;
        this.f28223f = strArr == null ? f28218h : strArr;
        this.f28220c = this.f28222e.length == 0 ? NearbyDeviceId.f28229a : this.f28222e[0];
        this.f28221d = this.f28223f.length == 0 ? null : this.f28223f[0];
    }

    @Deprecated
    public NearbyDevice(String str, NearbyDeviceId[] nearbyDeviceIdArr, String[] strArr) {
        this(1, null, null, str, nearbyDeviceIdArr, strArr);
    }

    /* renamed from: a */
    public String m9945a() {
        return this.f28224i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyDevice) {
            return C4585c.m23634a(this.f28224i, ((NearbyDevice) obj).f28224i);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28224i);
    }

    public String toString() {
        String str = this.f28224i;
        return new StringBuilder(String.valueOf(str).length() + 21).append("NearbyDevice{handle=").append(str).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8830a.m9939a(this, parcel, i);
    }
}
