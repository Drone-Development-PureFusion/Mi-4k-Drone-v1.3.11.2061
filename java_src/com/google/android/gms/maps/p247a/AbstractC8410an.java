package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: com.google.android.gms.maps.a.an */
/* loaded from: classes2.dex */
public interface AbstractC8410an extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.an$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8411a extends Binder implements AbstractC8410an {

        /* renamed from: com.google.android.gms.maps.a.an$a$a */
        /* loaded from: classes2.dex */
        private static class C8412a implements AbstractC8410an {

            /* renamed from: a */
            private IBinder f27326a;

            C8412a(IBinder iBinder) {
                this.f27326a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8410an
            /* renamed from: a */
            public void mo11543a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27326a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27326a;
            }
        }

        public AbstractBinderC8411a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapLongClickListener");
        }

        /* renamed from: a */
        public static AbstractC8410an m11844a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8410an)) ? new C8412a(iBinder) : (AbstractC8410an) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11543a(LatLng latLng);
}
