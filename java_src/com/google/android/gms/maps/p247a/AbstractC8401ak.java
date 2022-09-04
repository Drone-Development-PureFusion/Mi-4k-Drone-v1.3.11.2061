package com.google.android.gms.maps.p247a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.ak */
/* loaded from: classes2.dex */
public interface AbstractC8401ak extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ak$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8402a extends Binder implements AbstractC8401ak {

        /* renamed from: com.google.android.gms.maps.a.ak$a$a */
        /* loaded from: classes2.dex */
        private static class C8403a implements AbstractC8401ak {

            /* renamed from: a */
            private IBinder f27323a;

            C8403a(IBinder iBinder) {
                this.f27323a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8401ak
            /* renamed from: a */
            public void mo11848a(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27323a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8401ak
            /* renamed from: a */
            public void mo11847a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27323a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27323a;
            }
        }

        /* renamed from: a */
        public static AbstractC8401ak m11849a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8401ak)) ? new C8403a(iBinder) : (AbstractC8401ak) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11848a(Location location);

    /* renamed from: a */
    void mo11847a(AbstractC4170e abstractC4170e);
}
