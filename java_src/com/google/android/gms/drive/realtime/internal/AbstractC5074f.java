package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.drive.realtime.internal.f */
/* loaded from: classes2.dex */
public interface AbstractC5074f extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5075a extends Binder implements AbstractC5074f {

        /* renamed from: com.google.android.gms.drive.realtime.internal.f$a$a */
        /* loaded from: classes2.dex */
        private static class C5076a implements AbstractC5074f {

            /* renamed from: a */
            private IBinder f18191a;

            C5076a(IBinder iBinder) {
                this.f18191a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5074f
            /* renamed from: a */
            public void mo21894a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18191a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5074f
            /* renamed from: a */
            public void mo21893a(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18191a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18191a;
            }
        }

        /* renamed from: a */
        public static AbstractC5074f m21895a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5074f)) ? new C5076a(iBinder) : (AbstractC5074f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Status status = null;
            DataHolder dataHolder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (parcel.readInt() != 0) {
                        dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(dataHolder);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (parcel.readInt() != 0) {
                        status = Status.CREATOR.createFromParcel(parcel);
                    }
                    a(status);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21894a(Status status);

    /* renamed from: a */
    void mo21893a(DataHolder dataHolder);
}
