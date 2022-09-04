package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.ab */
/* loaded from: classes2.dex */
public interface AbstractC8374ab extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ab$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8375a extends Binder implements AbstractC8374ab {

        /* renamed from: com.google.android.gms.maps.a.ab$a$a */
        /* loaded from: classes2.dex */
        private static class C8376a implements AbstractC8374ab {

            /* renamed from: a */
            private IBinder f27314a;

            C8376a(IBinder iBinder) {
                this.f27314a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8374ab
            /* renamed from: a */
            public void mo11546a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
                    this.f27314a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27314a;
            }
        }

        public AbstractBinderC8375a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
        }

        /* renamed from: a */
        public static AbstractC8374ab m11858a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8374ab)) ? new C8376a(iBinder) : (AbstractC8374ab) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11546a();
}
