package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.firebase.database.connection.idl.f */
/* loaded from: classes2.dex */
public interface AbstractC9850f extends IInterface {

    /* renamed from: com.google.firebase.database.connection.idl.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9851a extends Binder implements AbstractC9850f {

        /* renamed from: com.google.firebase.database.connection.idl.f$a$a */
        /* loaded from: classes2.dex */
        private static class C9852a implements AbstractC9850f {

            /* renamed from: a */
            private IBinder f30713a;

            C9852a(IBinder iBinder) {
                this.f30713a = iBinder;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9850f
            /* renamed from: a */
            public void mo6790a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IGetTokenCallback");
                    obtain.writeString(str);
                    this.f30713a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30713a;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9850f
            /* renamed from: b */
            public void mo6789b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IGetTokenCallback");
                    obtain.writeString(str);
                    this.f30713a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9851a() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IGetTokenCallback");
        }

        /* renamed from: a */
        public static AbstractC9850f m6791a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IGetTokenCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9850f)) ? new C9852a(iBinder) : (AbstractC9850f) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IGetTokenCallback");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IGetTokenCallback");
                    b(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IGetTokenCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo6790a(String str);

    /* renamed from: b */
    void mo6789b(String str);
}
