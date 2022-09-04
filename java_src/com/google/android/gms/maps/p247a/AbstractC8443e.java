package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.p247a.AbstractC8413ao;
import com.google.android.gms.maps.p247a.AbstractC8434b;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.e */
/* loaded from: classes2.dex */
public interface AbstractC8443e extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8444a extends Binder implements AbstractC8443e {

        /* renamed from: com.google.android.gms.maps.a.e$a$a */
        /* loaded from: classes2.dex */
        private static class C8445a implements AbstractC8443e {

            /* renamed from: a */
            private IBinder f27337a;

            C8445a(IBinder iBinder) {
                this.f27337a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: a */
            public AbstractC8434b mo11740a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8434b.AbstractBinderC8435a.m11835a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: a */
            public void mo11739a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27337a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: a */
            public void mo11738a(AbstractC8413ao abstractC8413ao) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    obtain.writeStrongBinder(abstractC8413ao != null ? abstractC8413ao.asBinder() : null);
                    this.f27337a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27337a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: b */
            public void mo11737b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: b */
            public void mo11736b(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27337a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: c */
            public void mo11735c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: c */
            public void mo11734c(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27337a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: d */
            public void mo11733d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: e */
            public void mo11732e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: f */
            public AbstractC4170e mo11731f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: g */
            public void mo11730g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: h */
            public void mo11729h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8443e
            /* renamed from: i */
            public void mo11728i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.f27337a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8443e m11741a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8443e)) ? new C8445a(iBinder) : (AbstractC8443e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle = null;
            IBinder iBinder = null;
            Bundle bundle2 = null;
            Bundle bundle3 = null;
            IBinder iBinder2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    AbstractC8434b a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(bundle2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    c();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    b(bundle3);
                    parcel2.writeNoException();
                    if (bundle3 != null) {
                        parcel2.writeInt(1);
                        bundle3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    AbstractC4170e f = f();
                    parcel2.writeNoException();
                    if (f != null) {
                        iBinder2 = f.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder2);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    a(AbstractC8413ao.AbstractBinderC8414a.m11843a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    c(bundle);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    g();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    h();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    i();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC8434b mo11740a();

    /* renamed from: a */
    void mo11739a(Bundle bundle);

    /* renamed from: a */
    void mo11738a(AbstractC8413ao abstractC8413ao);

    /* renamed from: b */
    void mo11737b();

    /* renamed from: b */
    void mo11736b(Bundle bundle);

    /* renamed from: c */
    void mo11735c();

    /* renamed from: c */
    void mo11734c(Bundle bundle);

    /* renamed from: d */
    void mo11733d();

    /* renamed from: e */
    void mo11732e();

    /* renamed from: f */
    AbstractC4170e mo11731f();

    /* renamed from: g */
    void mo11730g();

    /* renamed from: h */
    void mo11729h();

    /* renamed from: i */
    void mo11728i();
}
