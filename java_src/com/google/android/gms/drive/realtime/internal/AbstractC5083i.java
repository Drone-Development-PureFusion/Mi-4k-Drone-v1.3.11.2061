package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.drive.realtime.internal.i */
/* loaded from: classes2.dex */
public interface AbstractC5083i extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5084a extends Binder implements AbstractC5083i {

        /* renamed from: com.google.android.gms.drive.realtime.internal.i$a$a */
        /* loaded from: classes2.dex */
        private static class C5085a implements AbstractC5083i {

            /* renamed from: a */
            private IBinder f18194a;

            C5085a(IBinder iBinder) {
                this.f18194a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5083i
            /* renamed from: a */
            public void mo21886a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18194a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18194a;
            }
        }

        /* renamed from: a */
        public static AbstractC5083i m21887a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IErrorCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5083i)) ? new C5085a(iBinder) : (AbstractC5083i) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21886a(Status status);
}
