package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.aa */
/* loaded from: classes2.dex */
public interface AbstractC8371aa extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.aa$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8372a extends Binder implements AbstractC8371aa {

        /* renamed from: com.google.android.gms.maps.a.aa$a$a */
        /* loaded from: classes2.dex */
        private static class C8373a implements AbstractC8371aa {

            /* renamed from: a */
            private IBinder f27313a;

            C8373a(IBinder iBinder) {
                this.f27313a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8371aa
            /* renamed from: a */
            public void mo11545a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraIdleListener");
                    this.f27313a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27313a;
            }
        }

        public AbstractBinderC8372a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraIdleListener");
        }

        /* renamed from: a */
        public static AbstractC8371aa m11859a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraIdleListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8371aa)) ? new C8373a(iBinder) : (AbstractC8371aa) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraIdleListener");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraIdleListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11545a();
}
