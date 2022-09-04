package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.ac */
/* loaded from: classes2.dex */
public interface AbstractC8377ac extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ac$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8378a extends Binder implements AbstractC8377ac {

        /* renamed from: com.google.android.gms.maps.a.ac$a$a */
        /* loaded from: classes2.dex */
        private static class C8379a implements AbstractC8377ac {

            /* renamed from: a */
            private IBinder f27315a;

            C8379a(IBinder iBinder) {
                this.f27315a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8377ac
            /* renamed from: a */
            public void mo11547a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraMoveListener");
                    this.f27315a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27315a;
            }
        }

        public AbstractBinderC8378a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraMoveListener");
        }

        /* renamed from: a */
        public static AbstractC8377ac m11857a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8377ac)) ? new C8379a(iBinder) : (AbstractC8377ac) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraMoveListener");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraMoveListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11547a();
}
