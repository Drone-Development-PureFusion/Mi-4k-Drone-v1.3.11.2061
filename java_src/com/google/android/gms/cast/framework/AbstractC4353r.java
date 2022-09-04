package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.r */
/* loaded from: classes2.dex */
public interface AbstractC4353r extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.r$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4354a extends Binder implements AbstractC4353r {

        /* renamed from: com.google.android.gms.cast.framework.r$a$a */
        /* loaded from: classes2.dex */
        private static class C4355a implements AbstractC4353r {

            /* renamed from: a */
            private IBinder f16466a;

            C4355a(IBinder iBinder) {
                this.f16466a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4353r
            /* renamed from: a */
            public int mo24419a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    this.f16466a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16466a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4353r
            /* renamed from: b */
            public AbstractC4170e mo24418b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    this.f16466a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4353r
            /* renamed from: c */
            public void mo24417c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    this.f16466a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4353r
            /* renamed from: d */
            public void mo24416d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    this.f16466a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC4354a() {
            attachInterface(this, "com.google.android.gms.cast.framework.IAppVisibilityListener");
        }

        /* renamed from: a */
        public static AbstractC4353r m24420a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IAppVisibilityListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4353r)) ? new C4355a(iBinder) : (AbstractC4353r) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    c();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.IAppVisibilityListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24419a();

    /* renamed from: b */
    AbstractC4170e mo24418b();

    /* renamed from: c */
    void mo24417c();

    /* renamed from: d */
    void mo24416d();
}
