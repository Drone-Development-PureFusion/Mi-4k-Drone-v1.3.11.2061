package com.google.android.gms.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.location.w */
/* loaded from: classes2.dex */
public interface AbstractC8341w extends IInterface {

    /* renamed from: com.google.android.gms.location.w$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8342a extends Binder implements AbstractC8341w {

        /* renamed from: com.google.android.gms.location.w$a$a */
        /* loaded from: classes2.dex */
        private static class C8343a implements AbstractC8341w {

            /* renamed from: a */
            private IBinder f27221a;

            C8343a(IBinder iBinder) {
                this.f27221a = iBinder;
            }

            @Override // com.google.android.gms.location.AbstractC8341w
            /* renamed from: a */
            public void mo12025a(LocationAvailability locationAvailability) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if (locationAvailability != null) {
                        obtain.writeInt(1);
                        locationAvailability.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27221a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.AbstractC8341w
            /* renamed from: a */
            public void mo12024a(LocationResult locationResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if (locationResult != null) {
                        obtain.writeInt(1);
                        locationResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27221a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27221a;
            }
        }

        public AbstractBinderC8342a() {
            attachInterface(this, "com.google.android.gms.location.ILocationCallback");
        }

        /* renamed from: a */
        public static AbstractC8341w m12026a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8341w)) ? new C8343a(iBinder) : (AbstractC8341w) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            LocationAvailability locationAvailability = null;
            LocationResult locationResult = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                    if (parcel.readInt() != 0) {
                        locationResult = LocationResult.CREATOR.createFromParcel(parcel);
                    }
                    a(locationResult);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                    if (parcel.readInt() != 0) {
                        locationAvailability = (LocationAvailability) LocationAvailability.CREATOR.createFromParcel(parcel);
                    }
                    a(locationAvailability);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.ILocationCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12025a(LocationAvailability locationAvailability);

    /* renamed from: a */
    void mo12024a(LocationResult locationResult);
}
