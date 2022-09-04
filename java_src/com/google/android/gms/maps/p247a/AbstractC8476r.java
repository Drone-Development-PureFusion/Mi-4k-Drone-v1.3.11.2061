package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
/* renamed from: com.google.android.gms.maps.a.r */
/* loaded from: classes2.dex */
public interface AbstractC8476r extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.r$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8477a extends Binder implements AbstractC8476r {

        /* renamed from: com.google.android.gms.maps.a.r$a$a */
        /* loaded from: classes2.dex */
        private static class C8478a implements AbstractC8476r {

            /* renamed from: a */
            private IBinder f27347a;

            C8478a(IBinder iBinder) {
                this.f27347a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8476r
            /* renamed from: a */
            public void mo11457a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
                    if (streetViewPanoramaOrientation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOrientation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27347a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27347a;
            }
        }

        public AbstractBinderC8477a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
        }

        /* renamed from: a */
        public static AbstractC8476r m11651a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8476r)) ? new C8478a(iBinder) : (AbstractC8476r) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
                    a(parcel.readInt() != 0 ? (StreetViewPanoramaOrientation) StreetViewPanoramaOrientation.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11457a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
}
