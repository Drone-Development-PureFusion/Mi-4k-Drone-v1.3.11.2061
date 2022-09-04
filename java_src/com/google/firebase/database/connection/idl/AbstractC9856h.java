package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.firebase.database.connection.idl.AbstractC9847e;
import com.google.firebase.database.connection.idl.AbstractC9853g;
import com.google.firebase.database.connection.idl.AbstractC9859i;
import com.google.firebase.database.connection.idl.AbstractC9862j;
import java.util.List;
/* renamed from: com.google.firebase.database.connection.idl.h */
/* loaded from: classes2.dex */
public interface AbstractC9856h extends IInterface {

    /* renamed from: com.google.firebase.database.connection.idl.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9857a extends Binder implements AbstractC9856h {

        /* renamed from: com.google.firebase.database.connection.idl.h$a$a */
        /* loaded from: classes2.dex */
        private static class C9858a implements AbstractC9856h {

            /* renamed from: a */
            private IBinder f30715a;

            C9858a(IBinder iBinder) {
                this.f30715a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30715a;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void compareAndPut(List<String> list, AbstractC4170e abstractC4170e, String str, AbstractC9862j abstractC9862j) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    if (abstractC9862j != null) {
                        iBinder = abstractC9862j.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f30715a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void initialize() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.f30715a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void interrupt(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.f30715a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public boolean isInterrupted(String str) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.f30715a.transact(16, obtain, obtain2, 0);
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

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void listen(List<String> list, AbstractC4170e abstractC4170e, AbstractC9853g abstractC9853g, long j, AbstractC9862j abstractC9862j) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC9853g != null ? abstractC9853g.asBinder() : null);
                    obtain.writeLong(j);
                    if (abstractC9862j != null) {
                        iBinder = abstractC9862j.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f30715a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void merge(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC9862j != null) {
                        iBinder = abstractC9862j.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f30715a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void onDisconnectCancel(List<String> list, AbstractC9862j abstractC9862j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC9862j != null ? abstractC9862j.asBinder() : null);
                    this.f30715a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void onDisconnectMerge(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC9862j != null) {
                        iBinder = abstractC9862j.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f30715a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void onDisconnectPut(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC9862j != null) {
                        iBinder = abstractC9862j.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f30715a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void purgeOutstandingWrites() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.f30715a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void put(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC9862j != null) {
                        iBinder = abstractC9862j.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f30715a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void refreshAuthToken() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.f30715a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void refreshAuthToken2(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.f30715a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void resume(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeString(str);
                    this.f30715a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void setup(ConnectionConfig connectionConfig, AbstractC9847e abstractC9847e, AbstractC4170e abstractC4170e, AbstractC9859i abstractC9859i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    if (connectionConfig != null) {
                        obtain.writeInt(1);
                        connectionConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC9847e != null ? abstractC9847e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC9859i != null) {
                        iBinder = abstractC9859i.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f30715a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void shutdown() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    this.f30715a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9856h
            public void unlisten(List<String> list, AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnection");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30715a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9857a() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IPersistentConnection");
        }

        public static AbstractC9856h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9856h)) ? new C9858a(iBinder) : (AbstractC9856h) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    setup(parcel.readInt() != 0 ? (ConnectionConfig) ConnectionConfig.CREATOR.createFromParcel(parcel) : null, AbstractC9847e.AbstractBinderC9848a.m6793a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9859i.AbstractBinderC9860a.m6784a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    initialize();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    shutdown();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    refreshAuthToken();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    listen(parcel.createStringArrayList(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9853g.AbstractBinderC9854a.m6788a(parcel.readStrongBinder()), parcel.readLong(), AbstractC9862j.AbstractBinderC9863a.m6777a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    unlisten(parcel.createStringArrayList(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    purgeOutstandingWrites();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    put(parcel.createStringArrayList(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9862j.AbstractBinderC9863a.m6777a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    compareAndPut(parcel.createStringArrayList(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString(), AbstractC9862j.AbstractBinderC9863a.m6777a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    merge(parcel.createStringArrayList(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9862j.AbstractBinderC9863a.m6777a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    onDisconnectPut(parcel.createStringArrayList(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9862j.AbstractBinderC9863a.m6777a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    onDisconnectMerge(parcel.createStringArrayList(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9862j.AbstractBinderC9863a.m6777a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    onDisconnectCancel(parcel.createStringArrayList(), AbstractC9862j.AbstractBinderC9863a.m6777a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    interrupt(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    resume(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    boolean isInterrupted = isInterrupted(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isInterrupted ? 1 : 0);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
                    refreshAuthToken2(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IPersistentConnection");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void compareAndPut(List<String> list, AbstractC4170e abstractC4170e, String str, AbstractC9862j abstractC9862j);

    void initialize();

    void interrupt(String str);

    boolean isInterrupted(String str);

    void listen(List<String> list, AbstractC4170e abstractC4170e, AbstractC9853g abstractC9853g, long j, AbstractC9862j abstractC9862j);

    void merge(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j);

    void onDisconnectCancel(List<String> list, AbstractC9862j abstractC9862j);

    void onDisconnectMerge(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j);

    void onDisconnectPut(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j);

    void purgeOutstandingWrites();

    void put(List<String> list, AbstractC4170e abstractC4170e, AbstractC9862j abstractC9862j);

    void refreshAuthToken();

    void refreshAuthToken2(String str);

    void resume(String str);

    void setup(ConnectionConfig connectionConfig, AbstractC9847e abstractC9847e, AbstractC4170e abstractC4170e, AbstractC9859i abstractC9859i);

    void shutdown();

    void unlisten(List<String> list, AbstractC4170e abstractC4170e);
}
