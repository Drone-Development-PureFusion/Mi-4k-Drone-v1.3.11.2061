package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.firebase.database.connection.idl.i */
/* loaded from: classes2.dex */
public interface AbstractC9859i extends IInterface {

    /* renamed from: com.google.firebase.database.connection.idl.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9860a extends Binder implements AbstractC9859i {

        /* renamed from: com.google.firebase.database.connection.idl.i$a$a */
        /* loaded from: classes2.dex */
        private static class C9861a implements AbstractC9859i {

            /* renamed from: a */
            private IBinder f30716a;

            C9861a(IBinder iBinder) {
                this.f30716a = iBinder;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6783a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    this.f30716a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6782a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30716a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6781a(List<String> list, AbstractC4170e abstractC4170e, boolean z, long j) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f30716a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6780a(List<String> list, List<RangeParcelable> list2, AbstractC4170e abstractC4170e, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    obtain.writeStringList(list);
                    obtain.writeTypedList(list2);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeLong(j);
                    this.f30716a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: a */
            public void mo6779a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f30716a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30716a;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9859i
            /* renamed from: b */
            public void mo6778b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    this.f30716a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9860a() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
        }

        /* renamed from: a */
        public static AbstractC9859i m6784a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9859i)) ? new C9861a(iBinder) : (AbstractC9859i) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    AbstractC4170e m25295a = AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(createStringArrayList, m25295a, z, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    a(parcel.createStringArrayList(), parcel.createTypedArrayList(RangeParcelable.CREATOR), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo6783a();

    /* renamed from: a */
    void mo6782a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo6781a(List<String> list, AbstractC4170e abstractC4170e, boolean z, long j);

    /* renamed from: a */
    void mo6780a(List<String> list, List<RangeParcelable> list2, AbstractC4170e abstractC4170e, long j);

    /* renamed from: a */
    void mo6779a(boolean z);

    /* renamed from: b */
    void mo6778b();
}
