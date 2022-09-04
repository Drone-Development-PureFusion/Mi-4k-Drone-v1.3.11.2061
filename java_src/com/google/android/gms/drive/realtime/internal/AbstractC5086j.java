package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
/* renamed from: com.google.android.gms.drive.realtime.internal.j */
/* loaded from: classes2.dex */
public interface AbstractC5086j extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5087a extends Binder implements AbstractC5086j {

        /* renamed from: com.google.android.gms.drive.realtime.internal.j$a$a */
        /* loaded from: classes2.dex */
        private static class C5088a implements AbstractC5086j {

            /* renamed from: a */
            private IBinder f18195a;

            C5088a(IBinder iBinder) {
                this.f18195a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5086j
            /* renamed from: a */
            public void mo21884a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18195a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5086j
            /* renamed from: a */
            public void mo21883a(ParcelableEventList parcelableEventList) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (parcelableEventList != null) {
                        obtain.writeInt(1);
                        parcelableEventList.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18195a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18195a;
            }
        }

        /* renamed from: a */
        public static AbstractC5086j m21885a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5086j)) ? new C5088a(iBinder) : (AbstractC5086j) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Status status = null;
            ParcelableEventList parcelableEventList = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (parcel.readInt() != 0) {
                        parcelableEventList = ParcelableEventList.CREATOR.createFromParcel(parcel);
                    }
                    a(parcelableEventList);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (parcel.readInt() != 0) {
                        status = Status.CREATOR.createFromParcel(parcel);
                    }
                    a(status);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21884a(Status status);

    /* renamed from: a */
    void mo21883a(ParcelableEventList parcelableEventList);
}
