package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.v */
/* loaded from: classes2.dex */
public interface AbstractC8813v extends IInterface {

    /* renamed from: com.google.android.gms.nearby.internal.connection.dev.v$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8814a extends Binder implements AbstractC8813v {

        /* renamed from: com.google.android.gms.nearby.internal.connection.dev.v$a$a */
        /* loaded from: classes2.dex */
        private static class C8815a implements AbstractC8813v {

            /* renamed from: a */
            private IBinder f28163a;

            C8815a(IBinder iBinder) {
                this.f28163a = iBinder;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8813v
            /* renamed from: a */
            public void mo9995a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IResultListener");
                    obtain.writeInt(i);
                    this.f28163a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28163a;
            }
        }

        /* renamed from: a */
        public static AbstractC8813v m9996a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IResultListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8813v)) ? new C8815a(iBinder) : (AbstractC8813v) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IResultListener");
                    a(parcel.readInt());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IResultListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9995a(int i);
}
