package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.internal.nh */
/* loaded from: classes2.dex */
public interface AbstractC7440nh extends IInterface {

    /* renamed from: com.google.android.gms.internal.nh$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7441a extends Binder implements AbstractC7440nh {

        /* renamed from: com.google.android.gms.internal.nh$a$a */
        /* loaded from: classes2.dex */
        private static class C7442a implements AbstractC7440nh {

            /* renamed from: a */
            private IBinder f24900a;

            C7442a(IBinder iBinder) {
                this.f24900a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: a */
            public void mo14479a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: a */
            public void mo14478a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    this.f24900a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: a */
            public void mo14477a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f24900a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24900a;
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: b */
            public void mo14476b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: b */
            public void mo14475b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    this.f24900a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: c */
            public AbstractC4170e mo14474c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: c */
            public String mo14473c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    obtain.writeString(str);
                    this.f24900a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: d */
            public AbstractC4170e mo14472d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: e */
            public String mo14471e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: f */
            public AbstractC4170e mo14470f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: g */
            public AbstractC4170e mo14469g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: h */
            public int mo14468h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: i */
            public boolean mo14467i() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(13, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.internal.AbstractC7440nh
            /* renamed from: j */
            public int mo14466j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequest");
                    this.f24900a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC7440nh m14480a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.storage.network.INetworkRequest");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7440nh)) ? new C7442a(iBinder) : (AbstractC7440nh) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    b(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    String c = c(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    AbstractC4170e c2 = c();
                    parcel2.writeNoException();
                    if (c2 != null) {
                        iBinder = c2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    AbstractC4170e d = d();
                    parcel2.writeNoException();
                    if (d != null) {
                        iBinder = d.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    String e = e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    AbstractC4170e f = f();
                    parcel2.writeNoException();
                    if (f != null) {
                        iBinder = f.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    AbstractC4170e g = g();
                    parcel2.writeNoException();
                    if (g != null) {
                        iBinder = g.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    int h = h();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    boolean i3 = i();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3 ? 1 : 0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequest");
                    int j = j();
                    parcel2.writeNoException();
                    parcel2.writeInt(j);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.storage.network.INetworkRequest");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo14479a();

    /* renamed from: a */
    void mo14478a(String str);

    /* renamed from: a */
    void mo14477a(String str, String str2);

    /* renamed from: b */
    void mo14476b();

    /* renamed from: b */
    void mo14475b(String str);

    /* renamed from: c */
    AbstractC4170e mo14474c();

    /* renamed from: c */
    String mo14473c(String str);

    /* renamed from: d */
    AbstractC4170e mo14472d();

    /* renamed from: e */
    String mo14471e();

    /* renamed from: f */
    AbstractC4170e mo14470f();

    /* renamed from: g */
    AbstractC4170e mo14469g();

    /* renamed from: h */
    int mo14468h();

    /* renamed from: i */
    boolean mo14467i();

    /* renamed from: j */
    int mo14466j();
}
