package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: com.google.android.gms.maps.a.al */
/* loaded from: classes2.dex */
public interface AbstractC8404al extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.al$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8405a extends Binder implements AbstractC8404al {

        /* renamed from: com.google.android.gms.maps.a.al$a$a */
        /* loaded from: classes2.dex */
        private static class C8406a implements AbstractC8404al {

            /* renamed from: a */
            private IBinder f27324a;

            C8406a(IBinder iBinder) {
                this.f27324a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8404al
            /* renamed from: a */
            public void mo11544a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapClickListener");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27324a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27324a;
            }
        }

        public AbstractBinderC8405a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapClickListener");
        }

        /* renamed from: a */
        public static AbstractC8404al m11846a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8404al)) ? new C8406a(iBinder) : (AbstractC8404al) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                    a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMapClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11544a(LatLng latLng);
}
