package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
/* renamed from: com.google.android.gms.maps.a.o */
/* loaded from: classes2.dex */
public interface AbstractC8467o extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.o$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8468a extends Binder implements AbstractC8467o {

        /* renamed from: com.google.android.gms.maps.a.o$a$a */
        /* loaded from: classes2.dex */
        private static class C8469a implements AbstractC8467o {

            /* renamed from: a */
            private IBinder f27344a;

            C8469a(IBinder iBinder) {
                this.f27344a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8467o
            /* renamed from: a */
            public void mo11459a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    if (streetViewPanoramaCamera != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaCamera.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27344a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27344a;
            }
        }

        public AbstractBinderC8468a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        }

        /* renamed from: a */
        public static AbstractC8467o m11654a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8467o)) ? new C8469a(iBinder) : (AbstractC8467o) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    a(parcel.readInt() != 0 ? (StreetViewPanoramaCamera) StreetViewPanoramaCamera.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11459a(StreetViewPanoramaCamera streetViewPanoramaCamera);
}
