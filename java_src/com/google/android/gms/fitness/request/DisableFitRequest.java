package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class DisableFitRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DisableFitRequest> CREATOR = new C5205ac();

    /* renamed from: a */
    private final int f18947a;

    /* renamed from: b */
    private final alq f18948b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisableFitRequest(int i, IBinder iBinder) {
        this.f18947a = i;
        this.f18948b = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public DisableFitRequest(alq alqVar) {
        this.f18947a = 2;
        this.f18948b = alqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21244a() {
        return this.f18947a;
    }

    /* renamed from: b */
    public IBinder m21243b() {
        return this.f18948b.asBinder();
    }

    public String toString() {
        return String.format("DisableFitRequest", new Object[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5205ac.m21098a(this, parcel, i);
    }
}
