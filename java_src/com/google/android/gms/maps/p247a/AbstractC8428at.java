package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.PointOfInterest;
/* renamed from: com.google.android.gms.maps.a.at */
/* loaded from: classes2.dex */
public interface AbstractC8428at extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.at$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8429a extends Binder implements AbstractC8428at {

        /* renamed from: com.google.android.gms.maps.a.at$a$a */
        /* loaded from: classes2.dex */
        private static class C8430a implements AbstractC8428at {

            /* renamed from: a */
            private IBinder f27332a;

            C8430a(IBinder iBinder) {
                this.f27332a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8428at
            /* renamed from: a */
            public void mo11523a(PointOfInterest pointOfInterest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPoiClickListener");
                    if (pointOfInterest != null) {
                        obtain.writeInt(1);
                        pointOfInterest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27332a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27332a;
            }
        }

        public AbstractBinderC8429a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnPoiClickListener");
        }

        /* renamed from: a */
        public static AbstractC8428at m11837a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8428at)) ? new C8430a(iBinder) : (AbstractC8428at) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
                    a(parcel.readInt() != 0 ? (PointOfInterest) PointOfInterest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnPoiClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11523a(PointOfInterest pointOfInterest);
}
