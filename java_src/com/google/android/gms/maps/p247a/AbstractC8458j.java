package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.j */
/* loaded from: classes2.dex */
public interface AbstractC8458j extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8459a extends Binder implements AbstractC8458j {

        /* renamed from: com.google.android.gms.maps.a.j$a$a */
        /* loaded from: classes2.dex */
        private static class C8460a implements AbstractC8458j {

            /* renamed from: a */
            private IBinder f27342a;

            C8460a(IBinder iBinder) {
                this.f27342a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: a */
            public void mo11677a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: a */
            public boolean mo11678a() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(9, obtain, obtain2, 0);
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

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27342a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: b */
            public void mo11675b(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: b */
            public boolean mo11676b() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(10, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: c */
            public void mo11673c(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: c */
            public boolean mo11674c() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(11, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: d */
            public void mo11671d(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: d */
            public boolean mo11672d() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(12, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: e */
            public void mo11669e(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: e */
            public boolean mo11670e() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(13, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: f */
            public void mo11667f(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: f */
            public boolean mo11668f() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(14, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: g */
            public void mo11665g(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: g */
            public boolean mo11666g() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(15, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: h */
            public void mo11663h(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: h */
            public boolean mo11664h() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(17, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: i */
            public void mo11661i(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: i */
            public boolean mo11662i() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.f27342a.transact(19, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8458j
            /* renamed from: j */
            public void mo11660j(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27342a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8458j m11679a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8458j)) ? new C8460a(iBinder) : (AbstractC8458j) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            boolean z9 = false;
            int i11 = 0;
            boolean z10 = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    b(z2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    c(z3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    d(z4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    e(z5);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    }
                    f(z6);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    }
                    g(z7);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    }
                    h(z8);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean a = a();
                    parcel2.writeNoException();
                    if (a) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean b = b();
                    parcel2.writeNoException();
                    if (b) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean c = c();
                    parcel2.writeNoException();
                    if (c) {
                        i6 = 1;
                    }
                    parcel2.writeInt(i6);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean d = d();
                    parcel2.writeNoException();
                    if (d) {
                        i7 = 1;
                    }
                    parcel2.writeInt(i7);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean e = e();
                    parcel2.writeNoException();
                    if (e) {
                        i8 = 1;
                    }
                    parcel2.writeInt(i8);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean f = f();
                    parcel2.writeNoException();
                    if (f) {
                        i9 = 1;
                    }
                    parcel2.writeInt(i9);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean g = g();
                    parcel2.writeNoException();
                    if (g) {
                        i10 = 1;
                    }
                    parcel2.writeInt(i10);
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    }
                    i(z9);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean h = h();
                    parcel2.writeNoException();
                    if (h) {
                        i11 = 1;
                    }
                    parcel2.writeInt(i11);
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    j(z10);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean i12 = i();
                    parcel2.writeNoException();
                    if (i12) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11677a(boolean z);

    /* renamed from: a */
    boolean mo11678a();

    /* renamed from: b */
    void mo11675b(boolean z);

    /* renamed from: b */
    boolean mo11676b();

    /* renamed from: c */
    void mo11673c(boolean z);

    /* renamed from: c */
    boolean mo11674c();

    /* renamed from: d */
    void mo11671d(boolean z);

    /* renamed from: d */
    boolean mo11672d();

    /* renamed from: e */
    void mo11669e(boolean z);

    /* renamed from: e */
    boolean mo11670e();

    /* renamed from: f */
    void mo11667f(boolean z);

    /* renamed from: f */
    boolean mo11668f();

    /* renamed from: g */
    void mo11665g(boolean z);

    /* renamed from: g */
    boolean mo11666g();

    /* renamed from: h */
    void mo11663h(boolean z);

    /* renamed from: h */
    boolean mo11664h();

    /* renamed from: i */
    void mo11661i(boolean z);

    /* renamed from: i */
    boolean mo11662i();

    /* renamed from: j */
    void mo11660j(boolean z);
}
