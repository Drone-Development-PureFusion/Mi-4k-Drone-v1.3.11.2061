package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes2.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new Parcelable.Creator<BinderWrapper>() { // from class: com.google.android.gms.common.internal.BinderWrapper.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BinderWrapper createFromParcel(Parcel parcel) {
            return new BinderWrapper(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BinderWrapper[] newArray(int i) {
            return new BinderWrapper[i];
        }
    };

    /* renamed from: a */
    private IBinder f16989a;

    public BinderWrapper() {
        this.f16989a = null;
    }

    public BinderWrapper(IBinder iBinder) {
        this.f16989a = null;
        this.f16989a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.f16989a = null;
        this.f16989a = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f16989a);
    }
}
