package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.amd;
/* loaded from: classes2.dex */
public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ListClaimedBleDevicesRequest> CREATOR = new C5212ah();

    /* renamed from: a */
    private final int f18956a;

    /* renamed from: b */
    private final amd f18957b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListClaimedBleDevicesRequest(int i, IBinder iBinder) {
        this.f18956a = i;
        this.f18957b = amd.AbstractBinderC6558a.m16836a(iBinder);
    }

    public ListClaimedBleDevicesRequest(amd amdVar) {
        this.f18956a = 2;
        this.f18957b = amdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21234a() {
        return this.f18956a;
    }

    /* renamed from: b */
    public IBinder m21233b() {
        return this.f18957b.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5212ah.m21085a(this, parcel, i);
    }
}
