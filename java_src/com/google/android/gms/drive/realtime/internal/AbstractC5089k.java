package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.drive.realtime.internal.k */
/* loaded from: classes2.dex */
public interface AbstractC5089k extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5090a extends Binder implements AbstractC5089k {

        /* renamed from: com.google.android.gms.drive.realtime.internal.k$a$a */
        /* loaded from: classes2.dex */
        private static class C5091a implements AbstractC5089k {

            /* renamed from: a */
            private IBinder f18196a;

            C5091a(IBinder iBinder) {
                this.f18196a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5089k
            /* renamed from: a */
            public void mo21881a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18196a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5089k
            /* renamed from: a */
            public void mo21880a(ParcelableIndexReference parcelableIndexReference) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (parcelableIndexReference != null) {
                        obtain.writeInt(1);
                        parcelableIndexReference.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18196a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18196a;
            }
        }

        /* renamed from: a */
        public static AbstractC5089k m21882a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5089k)) ? new C5091a(iBinder) : (AbstractC5089k) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Status status = null;
            ParcelableIndexReference parcelableIndexReference = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (parcel.readInt() != 0) {
                        parcelableIndexReference = ParcelableIndexReference.CREATOR.createFromParcel(parcel);
                    }
                    a(parcelableIndexReference);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (parcel.readInt() != 0) {
                        status = Status.CREATOR.createFromParcel(parcel);
                    }
                    a(status);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21881a(Status status);

    /* renamed from: a */
    void mo21880a(ParcelableIndexReference parcelableIndexReference);
}
