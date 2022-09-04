package com.google.android.gms.location.places.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;
/* renamed from: com.google.android.gms.location.places.internal.h */
/* loaded from: classes2.dex */
public interface AbstractC8266h extends IInterface {

    /* renamed from: com.google.android.gms.location.places.internal.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8267a extends Binder implements AbstractC8266h {

        /* renamed from: com.google.android.gms.location.places.internal.h$a$a */
        /* loaded from: classes2.dex */
        private static class C8268a implements AbstractC8266h {

            /* renamed from: a */
            private IBinder f27134a;

            C8268a(IBinder iBinder) {
                this.f27134a = iBinder;
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8266h
            /* renamed from: a */
            public void mo12107a(PlacePhotoMetadataResult placePhotoMetadataResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (placePhotoMetadataResult != null) {
                        obtain.writeInt(1);
                        placePhotoMetadataResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27134a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8266h
            /* renamed from: a */
            public void mo12106a(PlacePhotoResult placePhotoResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (placePhotoResult != null) {
                        obtain.writeInt(1);
                        placePhotoResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27134a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27134a;
            }
        }

        public AbstractBinderC8267a() {
            attachInterface(this, "com.google.android.gms.location.places.internal.IPhotosCallbacks");
        }

        /* renamed from: a */
        public static AbstractC8266h m12216a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8266h)) ? new C8268a(iBinder) : (AbstractC8266h) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            PlacePhotoResult placePhotoResult = null;
            PlacePhotoMetadataResult placePhotoMetadataResult = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (parcel.readInt() != 0) {
                        placePhotoResult = PlacePhotoResult.CREATOR.createFromParcel(parcel);
                    }
                    a(placePhotoResult);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (parcel.readInt() != 0) {
                        placePhotoMetadataResult = PlacePhotoMetadataResult.CREATOR.createFromParcel(parcel);
                    }
                    a(placePhotoMetadataResult);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12107a(PlacePhotoMetadataResult placePhotoMetadataResult);

    /* renamed from: a */
    void mo12106a(PlacePhotoResult placePhotoResult);
}
