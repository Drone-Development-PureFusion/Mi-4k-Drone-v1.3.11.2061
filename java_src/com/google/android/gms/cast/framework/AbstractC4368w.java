package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.AbstractC4371x;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.w */
/* loaded from: classes2.dex */
public interface AbstractC4368w extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.w$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4369a extends Binder implements AbstractC4368w {

        /* renamed from: com.google.android.gms.cast.framework.w$a$a */
        /* loaded from: classes2.dex */
        private static class C4370a implements AbstractC4368w {

            /* renamed from: a */
            private IBinder f16471a;

            C4370a(IBinder iBinder) {
                this.f16471a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4368w
            /* renamed from: a */
            public void mo24386a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManager");
                    this.f16471a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4368w
            /* renamed from: a */
            public void mo24385a(AbstractC4371x abstractC4371x) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManager");
                    obtain.writeStrongBinder(abstractC4371x != null ? abstractC4371x.asBinder() : null);
                    this.f16471a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16471a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4368w
            /* renamed from: b */
            public void mo24384b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManager");
                    this.f16471a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4368w
            /* renamed from: b */
            public void mo24383b(AbstractC4371x abstractC4371x) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManager");
                    obtain.writeStrongBinder(abstractC4371x != null ? abstractC4371x.asBinder() : null);
                    this.f16471a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4368w
            /* renamed from: c */
            public AbstractC4170e mo24382c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManager");
                    this.f16471a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4368w m24387a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4368w)) ? new C4370a(iBinder) : (AbstractC4368w) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    a(AbstractC4371x.AbstractBinderC4372a.m24381a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    b(AbstractC4371x.AbstractBinderC4372a.m24381a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    AbstractC4170e c = c();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(c != null ? c.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.IDiscoveryManager");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo24386a();

    /* renamed from: a */
    void mo24385a(AbstractC4371x abstractC4371x);

    /* renamed from: b */
    void mo24384b();

    /* renamed from: b */
    void mo24383b(AbstractC4371x abstractC4371x);

    /* renamed from: c */
    AbstractC4170e mo24382c();
}
