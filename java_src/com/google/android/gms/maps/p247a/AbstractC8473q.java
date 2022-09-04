package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
/* renamed from: com.google.android.gms.maps.a.q */
/* loaded from: classes2.dex */
public interface AbstractC8473q extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.q$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8474a extends Binder implements AbstractC8473q {

        /* renamed from: com.google.android.gms.maps.a.q$a$a */
        /* loaded from: classes2.dex */
        private static class C8475a implements AbstractC8473q {

            /* renamed from: a */
            private IBinder f27346a;

            C8475a(IBinder iBinder) {
                this.f27346a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8473q
            /* renamed from: a */
            public void mo11458a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                    if (streetViewPanoramaOrientation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOrientation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27346a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27346a;
            }
        }

        public AbstractBinderC8474a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
        }

        /* renamed from: a */
        public static AbstractC8473q m11652a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8473q)) ? new C8475a(iBinder) : (AbstractC8473q) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                    a(parcel.readInt() != 0 ? (StreetViewPanoramaOrientation) StreetViewPanoramaOrientation.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11458a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
}
