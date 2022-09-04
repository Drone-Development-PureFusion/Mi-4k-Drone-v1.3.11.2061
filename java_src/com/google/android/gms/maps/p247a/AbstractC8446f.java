package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.f */
/* loaded from: classes2.dex */
public interface AbstractC8446f extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8447a extends Binder implements AbstractC8446f {

        /* renamed from: com.google.android.gms.maps.a.f$a$a */
        /* loaded from: classes2.dex */
        private static class C8448a implements AbstractC8446f {

            /* renamed from: a */
            private IBinder f27338a;

            C8448a(IBinder iBinder) {
                this.f27338a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8446f
            /* renamed from: a */
            public AbstractC4170e mo11724a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27338a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8446f
            /* renamed from: a */
            public LatLng mo11725a(AbstractC4170e abstractC4170e) {
                LatLng latLng = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27338a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        latLng = (LatLng) LatLng.CREATOR.createFromParcel(obtain2);
                    }
                    return latLng;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8446f
            /* renamed from: a */
            public VisibleRegion mo11726a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    this.f27338a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (VisibleRegion) VisibleRegion.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27338a;
            }
        }

        /* renamed from: a */
        public static AbstractC8446f m11727a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8446f)) ? new C8448a(iBinder) : (AbstractC8446f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    LatLng a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    AbstractC4170e a2 = a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    VisibleRegion a3 = a();
                    parcel2.writeNoException();
                    if (a3 != null) {
                        parcel2.writeInt(1);
                        a3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo11724a(LatLng latLng);

    /* renamed from: a */
    LatLng mo11725a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    VisibleRegion mo11726a();
}
