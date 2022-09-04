package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.AbstractC4241ab;
import com.google.android.gms.cast.framework.AbstractC4365v;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.aa */
/* loaded from: classes2.dex */
public interface AbstractC4238aa extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.aa$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4239a extends Binder implements AbstractC4238aa {

        /* renamed from: com.google.android.gms.cast.framework.aa$a$a */
        /* loaded from: classes2.dex */
        private static class C4240a implements AbstractC4238aa {

            /* renamed from: a */
            private IBinder f16136a;

            C4240a(IBinder iBinder) {
                this.f16136a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4238aa
            /* renamed from: a */
            public AbstractC4170e mo24892a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
                    this.f16136a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4238aa
            /* renamed from: a */
            public void mo24891a(AbstractC4241ab abstractC4241ab) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
                    obtain.writeStrongBinder(abstractC4241ab != null ? abstractC4241ab.asBinder() : null);
                    this.f16136a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4238aa
            /* renamed from: a */
            public void mo24890a(AbstractC4365v abstractC4365v) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
                    obtain.writeStrongBinder(abstractC4365v != null ? abstractC4365v.asBinder() : null);
                    this.f16136a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4238aa
            /* renamed from: a */
            public void mo24889a(boolean z, boolean z2) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f16136a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16136a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4238aa
            /* renamed from: b */
            public AbstractC4170e mo24888b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
                    this.f16136a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4238aa
            /* renamed from: b */
            public void mo24887b(AbstractC4241ab abstractC4241ab) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
                    obtain.writeStrongBinder(abstractC4241ab != null ? abstractC4241ab.asBinder() : null);
                    this.f16136a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4238aa
            /* renamed from: b */
            public void mo24886b(AbstractC4365v abstractC4365v) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionManager");
                    obtain.writeStrongBinder(abstractC4365v != null ? abstractC4365v.asBinder() : null);
                    this.f16136a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4238aa m24893a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4238aa)) ? new C4240a(iBinder) : (AbstractC4238aa) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
                    AbstractC4170e a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
                    a(AbstractC4241ab.AbstractBinderC4242a.m24885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
                    b(AbstractC4241ab.AbstractBinderC4242a.m24885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
                    a(AbstractC4365v.AbstractBinderC4366a.m24391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
                    b(AbstractC4365v.AbstractBinderC4366a.m24391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
                    boolean z2 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z2, z);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionManager");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    if (b != null) {
                        iBinder = b.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ISessionManager");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo24892a();

    /* renamed from: a */
    void mo24891a(AbstractC4241ab abstractC4241ab);

    /* renamed from: a */
    void mo24890a(AbstractC4365v abstractC4365v);

    /* renamed from: a */
    void mo24889a(boolean z, boolean z2);

    /* renamed from: b */
    AbstractC4170e mo24888b();

    /* renamed from: b */
    void mo24887b(AbstractC4241ab abstractC4241ab);

    /* renamed from: b */
    void mo24886b(AbstractC4365v abstractC4365v);
}
