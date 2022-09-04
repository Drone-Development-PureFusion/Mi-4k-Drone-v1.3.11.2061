package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.firebase.database.connection.idl.j */
/* loaded from: classes2.dex */
public interface AbstractC9862j extends IInterface {

    /* renamed from: com.google.firebase.database.connection.idl.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9863a extends Binder implements AbstractC9862j {

        /* renamed from: com.google.firebase.database.connection.idl.j$a$a */
        /* loaded from: classes2.dex */
        private static class C9864a implements AbstractC9862j {

            /* renamed from: a */
            private IBinder f30717a;

            C9864a(IBinder iBinder) {
                this.f30717a = iBinder;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9862j
            /* renamed from: a */
            public void mo6776a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f30717a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30717a;
            }
        }

        public AbstractBinderC9863a() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IRequestResultCallback");
        }

        /* renamed from: a */
        public static AbstractC9862j m6777a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9862j)) ? new C9864a(iBinder) : (AbstractC9862j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo6776a(String str, String str2);
}
