package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes2.dex */
public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator<PendingCallback> CREATOR = new Parcelable.Creator<PendingCallback>() { // from class: com.google.android.gms.gcm.PendingCallback.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PendingCallback createFromParcel(Parcel parcel) {
            return new PendingCallback(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PendingCallback[] newArray(int i) {
            return new PendingCallback[i];
        }
    };

    /* renamed from: a */
    final IBinder f20503a;

    public PendingCallback(Parcel parcel) {
        this.f20503a = parcel.readStrongBinder();
    }

    /* renamed from: a */
    public IBinder m18905a() {
        return this.f20503a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f20503a);
    }
}
