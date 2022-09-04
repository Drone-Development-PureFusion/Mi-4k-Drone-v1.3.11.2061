package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class DeleteAllUserDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteAllUserDataRequest> CREATOR = new C5204ab();

    /* renamed from: a */
    private final int f18945a;

    /* renamed from: b */
    private final alq f18946b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeleteAllUserDataRequest(int i, IBinder iBinder) {
        this.f18945a = i;
        this.f18946b = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21246a() {
        return this.f18945a;
    }

    /* renamed from: b */
    public IBinder m21245b() {
        return this.f18946b.asBinder();
    }

    public String toString() {
        return String.format("DisableFitRequest", new Object[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5204ab.m21101a(this, parcel, i);
    }
}
