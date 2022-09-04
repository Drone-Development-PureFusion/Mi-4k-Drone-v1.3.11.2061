package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.C8828c;
import com.google.android.gms.nearby.messages.C8829d;
/* loaded from: classes2.dex */
public class NearbyDeviceId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NearbyDeviceId> CREATOR = new C8832c();

    /* renamed from: a */
    public static final NearbyDeviceId f28229a = new NearbyDeviceId();

    /* renamed from: b */
    final int f28230b;

    /* renamed from: c */
    final byte[] f28231c;

    /* renamed from: d */
    private final int f28232d;

    /* renamed from: e */
    private final C8828c f28233e;

    /* renamed from: f */
    private final C8829d f28234f;

    private NearbyDeviceId() {
        this(1, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NearbyDeviceId(int i, int i2, byte[] bArr) {
        C8829d c8829d = null;
        this.f28230b = i;
        this.f28232d = i2;
        this.f28231c = bArr;
        this.f28233e = i2 == 2 ? new C8828c(bArr) : null;
        this.f28234f = i2 == 3 ? new C8829d(bArr) : c8829d;
    }

    /* renamed from: a */
    public int m9942a() {
        return this.f28232d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyDeviceId)) {
            return false;
        }
        NearbyDeviceId nearbyDeviceId = (NearbyDeviceId) obj;
        return C4585c.m23634a(Integer.valueOf(this.f28232d), Integer.valueOf(nearbyDeviceId.f28232d)) && C4585c.m23634a(this.f28231c, nearbyDeviceId.f28231c);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28232d), this.f28231c);
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append("NearbyDeviceId{");
        switch (this.f28232d) {
            case 1:
                append.append("UNKNOWN");
                break;
            case 2:
                append.append("eddystoneUid=").append(this.f28233e);
                break;
            case 3:
                append.append("iBeaconId=").append(this.f28234f);
                break;
        }
        append.append("}");
        return append.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8832c.m9933a(this, parcel, i);
    }
}
