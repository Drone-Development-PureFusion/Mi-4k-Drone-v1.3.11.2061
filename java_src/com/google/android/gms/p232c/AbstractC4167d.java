package com.google.android.gms.p232c;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.c.d */
/* loaded from: classes2.dex */
public interface AbstractC4167d extends IInterface {

    /* renamed from: com.google.android.gms.c.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4168a extends Binder implements AbstractC4167d {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.c.d$a$a */
        /* loaded from: classes2.dex */
        public static class C4169a implements AbstractC4167d {

            /* renamed from: a */
            private IBinder f15769a;

            C4169a(IBinder iBinder) {
                this.f15769a = iBinder;
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: a */
            public AbstractC4170e mo25290a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: a */
            public void mo25289a(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15769a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: a */
            public void mo25288a(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f15769a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: a */
            public void mo25286a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f15769a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: a */
            public void mo25285a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15769a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15769a;
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: b */
            public Bundle mo25284b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: b */
            public void mo25283b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f15769a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: b */
            public void mo25282b(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15769a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: c */
            public int mo25281c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: c */
            public void mo25280c(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15769a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: d */
            public AbstractC4167d mo25279d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractBinderC4168a.m25296a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: d */
            public void mo25278d(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15769a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: e */
            public AbstractC4170e mo25277e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: f */
            public boolean mo25276f() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(7, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: g */
            public String mo25275g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: h */
            public AbstractC4167d mo25274h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractBinderC4168a.m25296a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: i */
            public int mo25273i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: j */
            public boolean mo25272j() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(11, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: k */
            public AbstractC4170e mo25271k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: l */
            public boolean mo25270l() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(13, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: m */
            public boolean mo25269m() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(14, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: n */
            public boolean mo25268n() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(15, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: o */
            public boolean mo25267o() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(16, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: p */
            public boolean mo25266p() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(17, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: q */
            public boolean mo25265q() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(18, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.p232c.AbstractC4167d
            /* renamed from: r */
            public boolean mo25264r() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f15769a.transact(19, obtain, obtain2, 0);
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

        public AbstractBinderC4168a() {
            attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
        }

        /* renamed from: a */
        public static AbstractC4167d m25296a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4167d)) ? new C4169a(iBinder) : (AbstractC4167d) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Intent intent = null;
            IBinder iBinder = null;
            IBinder iBinder2 = null;
            IBinder iBinder3 = null;
            IBinder iBinder4 = null;
            IBinder iBinder5 = null;
            Intent intent2 = null;
            boolean z = false;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    AbstractC4170e a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    Bundle b = b();
                    parcel2.writeNoException();
                    if (b == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    int c = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    AbstractC4167d d = d();
                    parcel2.writeNoException();
                    if (d != null) {
                        iBinder2 = d.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder2);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    AbstractC4170e e = e();
                    parcel2.writeNoException();
                    if (e != null) {
                        iBinder3 = e.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder3);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean f = f();
                    parcel2.writeNoException();
                    parcel2.writeInt(f ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    String g = g();
                    parcel2.writeNoException();
                    parcel2.writeString(g);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    AbstractC4167d h = h();
                    parcel2.writeNoException();
                    if (h != null) {
                        iBinder4 = h.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder4);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    int i11 = i();
                    parcel2.writeNoException();
                    parcel2.writeInt(i11);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean j = j();
                    parcel2.writeNoException();
                    if (j) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    AbstractC4170e k = k();
                    parcel2.writeNoException();
                    if (k != null) {
                        iBinder5 = k.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder5);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean l = l();
                    parcel2.writeNoException();
                    if (l) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean m = m();
                    parcel2.writeNoException();
                    if (m) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean n = n();
                    parcel2.writeNoException();
                    if (n) {
                        i6 = 1;
                    }
                    parcel2.writeInt(i6);
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean o = o();
                    parcel2.writeNoException();
                    if (o) {
                        i7 = 1;
                    }
                    parcel2.writeInt(i7);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean p = p();
                    parcel2.writeNoException();
                    if (p) {
                        i8 = 1;
                    }
                    parcel2.writeInt(i8);
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean q = q();
                    parcel2.writeNoException();
                    if (q) {
                        i9 = 1;
                    }
                    parcel2.writeInt(i9);
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean r = r();
                    parcel2.writeNoException();
                    if (r) {
                        i10 = 1;
                    }
                    parcel2.writeInt(i10);
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    a(z2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    b(z3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    c(z4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    d(z);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (parcel.readInt() != 0) {
                        intent2 = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    a(intent2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (parcel.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    a(intent, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamic.IFragmentWrapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo25290a();

    /* renamed from: a */
    void mo25289a(Intent intent);

    /* renamed from: a */
    void mo25288a(Intent intent, int i);

    /* renamed from: a */
    void mo25286a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo25285a(boolean z);

    /* renamed from: b */
    Bundle mo25284b();

    /* renamed from: b */
    void mo25283b(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    void mo25282b(boolean z);

    /* renamed from: c */
    int mo25281c();

    /* renamed from: c */
    void mo25280c(boolean z);

    /* renamed from: d */
    AbstractC4167d mo25279d();

    /* renamed from: d */
    void mo25278d(boolean z);

    /* renamed from: e */
    AbstractC4170e mo25277e();

    /* renamed from: f */
    boolean mo25276f();

    /* renamed from: g */
    String mo25275g();

    /* renamed from: h */
    AbstractC4167d mo25274h();

    /* renamed from: i */
    int mo25273i();

    /* renamed from: j */
    boolean mo25272j();

    /* renamed from: k */
    AbstractC4170e mo25271k();

    /* renamed from: l */
    boolean mo25270l();

    /* renamed from: m */
    boolean mo25269m();

    /* renamed from: n */
    boolean mo25268n();

    /* renamed from: o */
    boolean mo25267o();

    /* renamed from: p */
    boolean mo25266p();

    /* renamed from: q */
    boolean mo25265q();

    /* renamed from: r */
    boolean mo25264r();
}
