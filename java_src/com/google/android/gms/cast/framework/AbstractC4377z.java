package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.z */
/* loaded from: classes2.dex */
public interface AbstractC4377z extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.z$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4378a extends Binder implements AbstractC4377z {

        /* renamed from: com.google.android.gms.cast.framework.z$a$a */
        /* loaded from: classes2.dex */
        private static class C4379a implements AbstractC4377z {

            /* renamed from: a */
            private IBinder f16474a;

            C4379a(IBinder iBinder) {
                this.f16474a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: a */
            public AbstractC4170e mo24370a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: a */
            public void mo24369a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    obtain.writeInt(i);
                    this.f16474a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: a */
            public void mo24368a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    obtain.writeString(str);
                    this.f16474a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: a */
            public void mo24367a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f16474a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16474a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: b */
            public String mo24366b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: b */
            public void mo24365b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    obtain.writeInt(i);
                    this.f16474a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: c */
            public String mo24364c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: c */
            public void mo24363c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    obtain.writeInt(i);
                    this.f16474a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: d */
            public String mo24362d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: d */
            public void mo24361d(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    obtain.writeInt(i);
                    this.f16474a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: e */
            public boolean mo24360e() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(5, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: f */
            public boolean mo24359f() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(6, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: g */
            public boolean mo24358g() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(7, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: h */
            public boolean mo24357h() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(8, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: i */
            public boolean mo24356i() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(9, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.cast.framework.AbstractC4377z
            /* renamed from: j */
            public boolean mo24355j() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISession");
                    this.f16474a.transact(10, obtain, obtain2, 0);
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
        }

        /* renamed from: a */
        public static AbstractC4377z m24371a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4377z)) ? new C4379a(iBinder) : (AbstractC4377z) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    AbstractC4170e a = a();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    String b = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    String d = d();
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    boolean e = e();
                    parcel2.writeNoException();
                    if (e) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    boolean f = f();
                    parcel2.writeNoException();
                    if (f) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    boolean g = g();
                    parcel2.writeNoException();
                    if (g) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    boolean h = h();
                    parcel2.writeNoException();
                    if (h) {
                        i6 = 1;
                    }
                    parcel2.writeInt(i6);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    boolean i9 = i();
                    parcel2.writeNoException();
                    if (i9) {
                        i7 = 1;
                    }
                    parcel2.writeInt(i7);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    boolean j = j();
                    parcel2.writeNoException();
                    if (j) {
                        i8 = 1;
                    }
                    parcel2.writeInt(i8);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    c(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISession");
                    d(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ISession");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo24370a();

    /* renamed from: a */
    void mo24369a(int i);

    /* renamed from: a */
    void mo24368a(String str);

    /* renamed from: a */
    void mo24367a(boolean z);

    /* renamed from: b */
    String mo24366b();

    /* renamed from: b */
    void mo24365b(int i);

    /* renamed from: c */
    String mo24364c();

    /* renamed from: c */
    void mo24363c(int i);

    /* renamed from: d */
    String mo24362d();

    /* renamed from: d */
    void mo24361d(int i);

    /* renamed from: e */
    boolean mo24360e();

    /* renamed from: f */
    boolean mo24359f();

    /* renamed from: g */
    boolean mo24358g();

    /* renamed from: h */
    boolean mo24357h();

    /* renamed from: i */
    boolean mo24356i();

    /* renamed from: j */
    boolean mo24355j();
}
