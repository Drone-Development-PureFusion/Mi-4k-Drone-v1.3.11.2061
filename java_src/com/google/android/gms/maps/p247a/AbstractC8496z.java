package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
/* renamed from: com.google.android.gms.maps.a.z */
/* loaded from: classes2.dex */
public interface AbstractC8496z extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.z$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8497a extends Binder implements AbstractC8496z {

        /* renamed from: com.google.android.gms.maps.a.z$a$a */
        /* loaded from: classes2.dex */
        private static class C8498a implements AbstractC8496z {

            /* renamed from: a */
            private IBinder f27355a;

            C8498a(IBinder iBinder) {
                this.f27355a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8496z
            /* renamed from: a */
            public void mo11550a(CameraPosition cameraPosition) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                    if (cameraPosition != null) {
                        obtain.writeInt(1);
                        cameraPosition.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27355a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27355a;
            }
        }

        public AbstractBinderC8497a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraChangeListener");
        }

        /* renamed from: a */
        public static AbstractC8496z m11627a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8496z)) ? new C8498a(iBinder) : (AbstractC8496z) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                    a(parcel.readInt() != 0 ? (CameraPosition) CameraPosition.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11550a(CameraPosition cameraPosition);
}
