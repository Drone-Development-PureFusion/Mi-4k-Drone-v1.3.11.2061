package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public interface ajj extends IInterface {

    /* renamed from: com.google.android.gms.internal.ajj$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6410a extends Binder implements ajj {

        /* renamed from: com.google.android.gms.internal.ajj$a$a */
        /* loaded from: classes2.dex */
        private static class C6411a implements ajj {

            /* renamed from: a */
            private IBinder f22019a;

            C6411a(IBinder iBinder) {
                this.f22019a = iBinder;
            }

            @Override // com.google.android.gms.internal.ajj
            /* renamed from: a */
            public void mo17122a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    obtain.writeInt(i);
                    this.f22019a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22019a;
            }
        }

        public AbstractBinderC6410a() {
            attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
        }

        /* renamed from: a */
        public static ajj m17123a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ajj)) ? new C6411a(iBinder) : (ajj) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17122a(int i);
}
