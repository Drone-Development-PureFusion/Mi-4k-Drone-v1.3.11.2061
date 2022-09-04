package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.ad */
/* loaded from: classes2.dex */
public interface AbstractC4246ad extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.ad$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4247a extends Binder implements AbstractC4246ad {

        /* renamed from: com.google.android.gms.cast.framework.ad$a$a */
        /* loaded from: classes2.dex */
        private static class C4248a implements AbstractC4246ad {

            /* renamed from: a */
            private IBinder f16138a;

            C4248a(IBinder iBinder) {
                this.f16138a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4246ad
            /* renamed from: a */
            public int mo24726a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionProxy");
                    this.f16138a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4246ad
            /* renamed from: a */
            public void mo24725a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionProxy");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16138a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4246ad
            /* renamed from: a */
            public void mo24724a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionProxy");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f16138a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16138a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4246ad
            /* renamed from: b */
            public AbstractC4170e mo24723b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionProxy");
                    this.f16138a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4246ad
            /* renamed from: b */
            public void mo24722b(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionProxy");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16138a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4246ad
            /* renamed from: c */
            public long mo24721c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ISessionProxy");
                    this.f16138a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC4247a() {
            attachInterface(this, "com.google.android.gms.cast.framework.ISessionProxy");
        }

        /* renamed from: a */
        public static AbstractC4246ad m24884a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionProxy");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4246ad)) ? new C4248a(iBinder) : (AbstractC4246ad) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle = null;
            IBinder iBinder = null;
            Bundle bundle2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProxy");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    if (b != null) {
                        iBinder = b.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProxy");
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(bundle2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProxy");
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    b(bundle);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProxy");
                    a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProxy");
                    long c = c();
                    parcel2.writeNoException();
                    parcel2.writeLong(c);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProxy");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ISessionProxy");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24726a();

    /* renamed from: a */
    void mo24725a(Bundle bundle);

    /* renamed from: a */
    void mo24724a(boolean z);

    /* renamed from: b */
    AbstractC4170e mo24723b();

    /* renamed from: b */
    void mo24722b(Bundle bundle);

    /* renamed from: c */
    long mo24721c();
}
