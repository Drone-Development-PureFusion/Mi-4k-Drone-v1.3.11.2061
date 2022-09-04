package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public interface anb extends IInterface {

    /* renamed from: com.google.android.gms.internal.anb$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6602a extends Binder implements anb {

        /* renamed from: com.google.android.gms.internal.anb$a$a */
        /* loaded from: classes2.dex */
        private static class C6603a implements anb {

            /* renamed from: a */
            private IBinder f22416a;

            C6603a(IBinder iBinder) {
                this.f22416a = iBinder;
            }

            @Override // com.google.android.gms.internal.anb
            /* renamed from: a */
            public void mo16699a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22416a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22416a;
            }
        }

        /* renamed from: a */
        public static anb m16700a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anb)) ? new C6603a(iBinder) : (anb) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16699a(Status status);
}
