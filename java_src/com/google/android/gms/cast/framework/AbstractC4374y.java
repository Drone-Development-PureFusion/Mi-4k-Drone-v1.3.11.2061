package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.y */
/* loaded from: classes.dex */
public interface AbstractC4374y extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.y$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4375a extends Binder implements AbstractC4374y {

        /* renamed from: com.google.android.gms.cast.framework.y$a$a */
        /* loaded from: classes2.dex */
        private static class C4376a implements AbstractC4374y {

            /* renamed from: a */
            private IBinder f16473a;

            C4376a(IBinder iBinder) {
                this.f16473a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4374y
            /* renamed from: a */
            public int mo24374a(Intent intent, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f16473a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4374y
            /* renamed from: a */
            public IBinder mo24375a(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16473a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4374y
            /* renamed from: a */
            public void mo24376a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
                    this.f16473a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16473a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4374y
            /* renamed from: b */
            public void mo24373b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
                    this.f16473a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4374y
            /* renamed from: c */
            public AbstractC4170e mo24372c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.IReconnectionService");
                    this.f16473a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4374y m24377a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4374y)) ? new C4376a(iBinder) : (AbstractC4374y) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            Intent intent = null;
            Intent intent2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
                    if (parcel.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    int a = a(intent, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
                    if (parcel.readInt() != 0) {
                        intent2 = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    IBinder a2 = a(intent2);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.IReconnectionService");
                    AbstractC4170e c = c();
                    parcel2.writeNoException();
                    if (c != null) {
                        iBinder = c.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.IReconnectionService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24374a(Intent intent, int i, int i2);

    /* renamed from: a */
    IBinder mo24375a(Intent intent);

    /* renamed from: a */
    void mo24376a();

    /* renamed from: b */
    void mo24373b();

    /* renamed from: c */
    AbstractC4170e mo24372c();
}
