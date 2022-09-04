package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class UnclaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnclaimBleDeviceRequest> CREATOR = new C5237n();

    /* renamed from: a */
    private final int f19046a;

    /* renamed from: b */
    private final String f19047b;

    /* renamed from: c */
    private final alq f19048c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnclaimBleDeviceRequest(int i, String str, IBinder iBinder) {
        this.f19046a = i;
        this.f19047b = str;
        this.f19048c = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public UnclaimBleDeviceRequest(String str, alq alqVar) {
        this.f19046a = 5;
        this.f19047b = str;
        this.f19048c = alqVar;
    }

    /* renamed from: a */
    public String m21116a() {
        return this.f19047b;
    }

    /* renamed from: b */
    public IBinder m21115b() {
        if (this.f19048c == null) {
            return null;
        }
        return this.f19048c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21114c() {
        return this.f19046a;
    }

    public String toString() {
        return String.format("UnclaimBleDeviceRequest{%s}", this.f19047b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5237n.m21004a(this, parcel, i);
    }
}
