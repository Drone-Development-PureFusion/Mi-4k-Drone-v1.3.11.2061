package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.AbstractC4238aa;
import com.google.android.gms.cast.framework.AbstractC4353r;
import com.google.android.gms.cast.framework.AbstractC4368w;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.t */
/* loaded from: classes2.dex */
public interface AbstractC4359t extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.t$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4360a extends Binder implements AbstractC4359t {

        /* renamed from: com.google.android.gms.cast.framework.t$a$a */
        /* loaded from: classes2.dex */
        private static class C4361a implements AbstractC4359t {

            /* renamed from: a */
            private IBinder f16468a;

            C4361a(IBinder iBinder) {
                this.f16468a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: a */
            public Bundle mo24408a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    this.f16468a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: a */
            public void mo24407a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f16468a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: a */
            public void mo24406a(AbstractC4353r abstractC4353r) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    obtain.writeStrongBinder(abstractC4353r != null ? abstractC4353r.asBinder() : null);
                    this.f16468a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16468a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: b */
            public void mo24404b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f16468a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: b */
            public void mo24403b(AbstractC4353r abstractC4353r) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    obtain.writeStrongBinder(abstractC4353r != null ? abstractC4353r.asBinder() : null);
                    this.f16468a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: b */
            public boolean mo24405b() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    this.f16468a.transact(2, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: c */
            public AbstractC4238aa mo24402c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    this.f16468a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4238aa.AbstractBinderC4239a.m24893a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: d */
            public AbstractC4368w mo24401d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    this.f16468a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4368w.AbstractBinderC4369a.m24387a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: e */
            public void mo24400e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    this.f16468a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4359t
            /* renamed from: f */
            public AbstractC4170e mo24399f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastContext");
                    this.f16468a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4359t m24409a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4359t)) ? new C4361a(iBinder) : (AbstractC4359t) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    Bundle a = a();
                    parcel2.writeNoException();
                    if (a == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    boolean b = b();
                    parcel2.writeNoException();
                    if (b) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    a(AbstractC4353r.AbstractBinderC4354a.m24420a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    b(AbstractC4353r.AbstractBinderC4354a.m24420a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    AbstractC4238aa c = c();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(c != null ? c.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    AbstractC4368w d = d();
                    parcel2.writeNoException();
                    if (d != null) {
                        iBinder = d.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastContext");
                    AbstractC4170e f = f();
                    parcel2.writeNoException();
                    if (f != null) {
                        iBinder = f.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ICastContext");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    Bundle mo24408a();

    /* renamed from: a */
    void mo24407a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo24406a(AbstractC4353r abstractC4353r);

    /* renamed from: b */
    void mo24404b(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    void mo24403b(AbstractC4353r abstractC4353r);

    /* renamed from: b */
    boolean mo24405b();

    /* renamed from: c */
    AbstractC4238aa mo24402c();

    /* renamed from: d */
    AbstractC4368w mo24401d();

    /* renamed from: e */
    void mo24400e();

    /* renamed from: f */
    AbstractC4170e mo24399f();
}
