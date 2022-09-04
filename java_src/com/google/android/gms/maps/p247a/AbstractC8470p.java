package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
/* renamed from: com.google.android.gms.maps.a.p */
/* loaded from: classes2.dex */
public interface AbstractC8470p extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.p$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8471a extends Binder implements AbstractC8470p {

        /* renamed from: com.google.android.gms.maps.a.p$a$a */
        /* loaded from: classes2.dex */
        private static class C8472a implements AbstractC8470p {

            /* renamed from: a */
            private IBinder f27345a;

            C8472a(IBinder iBinder) {
                this.f27345a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8470p
            /* renamed from: a */
            public void mo11460a(StreetViewPanoramaLocation streetViewPanoramaLocation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                    if (streetViewPanoramaLocation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaLocation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27345a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27345a;
            }
        }

        public AbstractBinderC8471a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
        }

        /* renamed from: a */
        public static AbstractC8470p m11653a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8470p)) ? new C8472a(iBinder) : (AbstractC8470p) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                    a(parcel.readInt() != 0 ? (StreetViewPanoramaLocation) StreetViewPanoramaLocation.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11460a(StreetViewPanoramaLocation streetViewPanoramaLocation);
}
