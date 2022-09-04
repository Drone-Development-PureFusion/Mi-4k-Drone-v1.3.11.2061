package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.w */
/* loaded from: classes2.dex */
public interface AbstractC8816w extends IInterface {

    /* renamed from: com.google.android.gms.nearby.internal.connection.dev.w$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8817a extends Binder implements AbstractC8816w {

        /* renamed from: com.google.android.gms.nearby.internal.connection.dev.w$a$a */
        /* loaded from: classes2.dex */
        private static class C8818a implements AbstractC8816w {

            /* renamed from: a */
            private IBinder f28164a;

            C8818a(IBinder iBinder) {
                this.f28164a = iBinder;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8816w
            /* renamed from: a */
            public void mo9993a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
                    if (onStartAdvertisingResultParams != null) {
                        obtain.writeInt(1);
                        onStartAdvertisingResultParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28164a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28164a;
            }
        }

        /* renamed from: a */
        public static AbstractC8816w m9994a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8816w)) ? new C8818a(iBinder) : (AbstractC8816w) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
                    a(parcel.readInt() != 0 ? OnStartAdvertisingResultParams.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IStartAdvertisingResultListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9993a(OnStartAdvertisingResultParams onStartAdvertisingResultParams);
}
