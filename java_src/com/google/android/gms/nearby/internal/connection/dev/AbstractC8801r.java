package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.r */
/* loaded from: classes2.dex */
public interface AbstractC8801r extends IInterface {

    /* renamed from: com.google.android.gms.nearby.internal.connection.dev.r$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8802a extends Binder implements AbstractC8801r {

        /* renamed from: com.google.android.gms.nearby.internal.connection.dev.r$a$a */
        /* loaded from: classes2.dex */
        private static class C8803a implements AbstractC8801r {

            /* renamed from: a */
            private IBinder f28159a;

            C8803a(IBinder iBinder) {
                this.f28159a = iBinder;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8801r
            /* renamed from: a */
            public void mo10041a(OnConnectionResponseParams onConnectionResponseParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
                    if (onConnectionResponseParams != null) {
                        obtain.writeInt(1);
                        onConnectionResponseParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28159a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28159a;
            }
        }

        /* renamed from: a */
        public static AbstractC8801r m10042a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8801r)) ? new C8803a(iBinder) : (AbstractC8801r) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
                    a(parcel.readInt() != 0 ? OnConnectionResponseParams.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IConnectionResponseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo10041a(OnConnectionResponseParams onConnectionResponseParams);
}
