package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.ab */
/* loaded from: classes2.dex */
public interface AbstractC4241ab extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.ab$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4242a extends Binder implements AbstractC4241ab {

        /* renamed from: com.google.android.gms.cast.framework.ab$a$a */
        /* loaded from: classes2.dex */
        private static class C4243a implements AbstractC4241ab {

            /* renamed from: a */
            private IBinder f16137a;

            C4243a(IBinder iBinder) {
                this.f16137a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: a */
            public int mo24883a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    this.f16137a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: a */
            public void mo24882a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f16137a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: a */
            public void mo24881a(AbstractC4170e abstractC4170e, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    this.f16137a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: a */
            public void mo24880a(AbstractC4170e abstractC4170e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    this.f16137a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: a */
            public void mo24879a(AbstractC4170e abstractC4170e, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f16137a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16137a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: b */
            public AbstractC4170e mo24878b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    this.f16137a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: b */
            public void mo24877b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f16137a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: b */
            public void mo24876b(AbstractC4170e abstractC4170e, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    this.f16137a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: b */
            public void mo24875b(AbstractC4170e abstractC4170e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    this.f16137a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: c */
            public void mo24874c(AbstractC4170e abstractC4170e, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    this.f16137a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4241ab
            /* renamed from: d */
            public void mo24873d(AbstractC4170e abstractC4170e, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManagerListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    this.f16137a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC4242a() {
            attachInterface(this, "com.google.android.gms.cast.framework.ISessionManagerListener");
        }

        /* renamed from: a */
        public static AbstractC4241ab m24885a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4241ab)) ? new C4243a(iBinder) : (AbstractC4241ab) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    c(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    d(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManagerListener");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ISessionManagerListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24883a();

    /* renamed from: a */
    void mo24882a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo24881a(AbstractC4170e abstractC4170e, int i);

    /* renamed from: a */
    void mo24880a(AbstractC4170e abstractC4170e, String str);

    /* renamed from: a */
    void mo24879a(AbstractC4170e abstractC4170e, boolean z);

    /* renamed from: b */
    AbstractC4170e mo24878b();

    /* renamed from: b */
    void mo24877b(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    void mo24876b(AbstractC4170e abstractC4170e, int i);

    /* renamed from: b */
    void mo24875b(AbstractC4170e abstractC4170e, String str);

    /* renamed from: c */
    void mo24874c(AbstractC4170e abstractC4170e, int i);

    /* renamed from: d */
    void mo24873d(AbstractC4170e abstractC4170e, int i);
}
