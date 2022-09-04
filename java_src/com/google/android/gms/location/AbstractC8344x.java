package com.google.android.gms.location;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.location.x */
/* loaded from: classes2.dex */
public interface AbstractC8344x extends IInterface {

    /* renamed from: com.google.android.gms.location.x$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8345a extends Binder implements AbstractC8344x {

        /* renamed from: com.google.android.gms.location.x$a$a */
        /* loaded from: classes2.dex */
        private static class C8346a implements AbstractC8344x {

            /* renamed from: a */
            private IBinder f27222a;

            C8346a(IBinder iBinder) {
                this.f27222a = iBinder;
            }

            @Override // com.google.android.gms.location.AbstractC8344x
            /* renamed from: a */
            public void mo12022a(Location location) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27222a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27222a;
            }
        }

        public AbstractBinderC8345a() {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }

        /* renamed from: a */
        public static AbstractC8344x m12023a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8344x)) ? new C8346a(iBinder) : (AbstractC8344x) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                    a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.ILocationListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12022a(Location location);
}
