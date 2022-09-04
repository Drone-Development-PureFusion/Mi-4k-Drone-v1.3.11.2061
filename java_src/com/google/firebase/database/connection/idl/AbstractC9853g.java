package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.firebase.database.connection.idl.g */
/* loaded from: classes2.dex */
public interface AbstractC9853g extends IInterface {

    /* renamed from: com.google.firebase.database.connection.idl.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9854a extends Binder implements AbstractC9853g {

        /* renamed from: com.google.firebase.database.connection.idl.g$a$a */
        /* loaded from: classes2.dex */
        private static class C9855a implements AbstractC9853g {

            /* renamed from: a */
            private IBinder f30714a;

            C9855a(IBinder iBinder) {
                this.f30714a = iBinder;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9853g
            /* renamed from: a */
            public String mo6787a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IListenHashProvider");
                    this.f30714a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30714a;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9853g
            /* renamed from: b */
            public boolean mo6786b() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IListenHashProvider");
                    this.f30714a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9853g
            /* renamed from: c */
            public CompoundHashParcelable mo6785c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IListenHashProvider");
                    this.f30714a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CompoundHashParcelable) CompoundHashParcelable.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9854a() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IListenHashProvider");
        }

        /* renamed from: a */
        public static AbstractC9853g m6788a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9853g)) ? new C9855a(iBinder) : (AbstractC9853g) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    boolean b = b();
                    parcel2.writeNoException();
                    if (b) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    CompoundHashParcelable c = c();
                    parcel2.writeNoException();
                    if (c == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IListenHashProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo6787a();

    /* renamed from: b */
    boolean mo6786b();

    /* renamed from: c */
    CompoundHashParcelable mo6785c();
}
