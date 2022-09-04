package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class ClaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClaimBleDeviceRequest> CREATOR = new C5239p();

    /* renamed from: a */
    private final int f18843a;

    /* renamed from: b */
    private final String f18844b;

    /* renamed from: c */
    private final BleDevice f18845c;

    /* renamed from: d */
    private final alq f18846d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClaimBleDeviceRequest(int i, String str, BleDevice bleDevice, IBinder iBinder) {
        this.f18843a = i;
        this.f18844b = str;
        this.f18845c = bleDevice;
        this.f18846d = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, alq alqVar) {
        this.f18843a = 4;
        this.f18844b = str;
        this.f18845c = bleDevice;
        this.f18846d = alqVar;
    }

    /* renamed from: a */
    public String m21394a() {
        return this.f18844b;
    }

    /* renamed from: b */
    public BleDevice m21393b() {
        return this.f18845c;
    }

    /* renamed from: c */
    public IBinder m21392c() {
        if (this.f18846d == null) {
            return null;
        }
        return this.f18846d.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21391d() {
        return this.f18843a;
    }

    public String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", this.f18844b, this.f18845c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5239p.m20998a(this, parcel, i);
    }
}
