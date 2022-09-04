package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.p */
/* loaded from: classes2.dex */
public interface AbstractC8795p extends IInterface {

    /* renamed from: com.google.android.gms.nearby.internal.connection.dev.p$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8796a extends Binder implements AbstractC8795p {

        /* renamed from: com.google.android.gms.nearby.internal.connection.dev.p$a$a */
        /* loaded from: classes2.dex */
        private static class C8797a implements AbstractC8795p {

            /* renamed from: a */
            private IBinder f28157a;

            C8797a(IBinder iBinder) {
                this.f28157a = iBinder;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8795p
            /* renamed from: a */
            public void mo10048a(OnConnectionRequestParams onConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (onConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        onConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28157a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8795p
            /* renamed from: a */
            public void mo10047a(OnStoppedAdvertisingParams onStoppedAdvertisingParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (onStoppedAdvertisingParams != null) {
                        obtain.writeInt(1);
                        onStoppedAdvertisingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28157a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28157a;
            }
        }

        /* renamed from: a */
        public static AbstractC8795p m10049a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8795p)) ? new C8797a(iBinder) : (AbstractC8795p) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            OnStoppedAdvertisingParams onStoppedAdvertisingParams = null;
            OnConnectionRequestParams onConnectionRequestParams = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (parcel.readInt() != 0) {
                        onConnectionRequestParams = OnConnectionRequestParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onConnectionRequestParams);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    if (parcel.readInt() != 0) {
                        onStoppedAdvertisingParams = OnStoppedAdvertisingParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onStoppedAdvertisingParams);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IAdvertisingCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo10048a(OnConnectionRequestParams onConnectionRequestParams);

    /* renamed from: a */
    void mo10047a(OnStoppedAdvertisingParams onStoppedAdvertisingParams);
}
