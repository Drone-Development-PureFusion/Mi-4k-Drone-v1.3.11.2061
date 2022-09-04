package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.x */
/* loaded from: classes2.dex */
public interface AbstractC4371x extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.x$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4372a extends Binder implements AbstractC4371x {

        /* renamed from: com.google.android.gms.cast.framework.x$a$a */
        /* loaded from: classes2.dex */
        private static class C4373a implements AbstractC4371x {

            /* renamed from: a */
            private IBinder f16472a;

            C4373a(IBinder iBinder) {
                this.f16472a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4371x
            /* renamed from: a */
            public int mo24380a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
                    this.f16472a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4371x
            /* renamed from: a */
            public void mo24379a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f16472a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16472a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4371x
            /* renamed from: b */
            public AbstractC4170e mo24378b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
                    this.f16472a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4371x m24381a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4371x)) ? new C4373a(iBinder) : (AbstractC4371x) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
                    a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.IDiscoveryManagerListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24380a();

    /* renamed from: a */
    void mo24379a(boolean z);

    /* renamed from: b */
    AbstractC4170e mo24378b();
}
