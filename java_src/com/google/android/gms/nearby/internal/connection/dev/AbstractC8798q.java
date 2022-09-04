package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.q */
/* loaded from: classes2.dex */
public interface AbstractC8798q extends IInterface {

    /* renamed from: com.google.android.gms.nearby.internal.connection.dev.q$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8799a extends Binder implements AbstractC8798q {

        /* renamed from: com.google.android.gms.nearby.internal.connection.dev.q$a$a */
        /* loaded from: classes2.dex */
        private static class C8800a implements AbstractC8798q {

            /* renamed from: a */
            private IBinder f28158a;

            C8800a(IBinder iBinder) {
                this.f28158a = iBinder;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8798q
            /* renamed from: a */
            public void mo10045a(OnDisconnectedParams onDisconnectedParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (onDisconnectedParams != null) {
                        obtain.writeInt(1);
                        onDisconnectedParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28158a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8798q
            /* renamed from: a */
            public void mo10044a(OnPayloadReceivedParams onPayloadReceivedParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (onPayloadReceivedParams != null) {
                        obtain.writeInt(1);
                        onPayloadReceivedParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28158a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8798q
            /* renamed from: a */
            public void mo10043a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (onPayloadTransferUpdateParams != null) {
                        obtain.writeInt(1);
                        onPayloadTransferUpdateParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28158a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28158a;
            }
        }

        /* renamed from: a */
        public static AbstractC8798q m10046a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8798q)) ? new C8800a(iBinder) : (AbstractC8798q) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = null;
            OnPayloadReceivedParams onPayloadReceivedParams = null;
            OnDisconnectedParams onDisconnectedParams = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (parcel.readInt() != 0) {
                        onPayloadReceivedParams = OnPayloadReceivedParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onPayloadReceivedParams);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (parcel.readInt() != 0) {
                        onDisconnectedParams = OnDisconnectedParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onDisconnectedParams);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    if (parcel.readInt() != 0) {
                        onPayloadTransferUpdateParams = OnPayloadTransferUpdateParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onPayloadTransferUpdateParams);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IConnectionEventListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo10045a(OnDisconnectedParams onDisconnectedParams);

    /* renamed from: a */
    void mo10044a(OnPayloadReceivedParams onPayloadReceivedParams);

    /* renamed from: a */
    void mo10043a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams);
}
