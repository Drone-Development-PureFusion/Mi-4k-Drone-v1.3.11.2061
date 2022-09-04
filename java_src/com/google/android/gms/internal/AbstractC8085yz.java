package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.internal.yz */
/* loaded from: classes.dex */
public interface AbstractC8085yz extends IInterface {

    /* renamed from: com.google.android.gms.internal.yz$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8086a extends Binder implements AbstractC8085yz {

        /* renamed from: com.google.android.gms.internal.yz$a$a */
        /* loaded from: classes2.dex */
        private static class C8087a implements AbstractC8085yz {

            /* renamed from: a */
            private IBinder f26440a;

            C8087a(IBinder iBinder) {
                this.f26440a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8085yz
            /* renamed from: a */
            public void mo12849a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    this.f26440a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8085yz
            /* renamed from: a */
            public void mo12848a(int i, int i2, Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26440a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26440a;
            }

            @Override // com.google.android.gms.internal.AbstractC8085yz
            /* renamed from: b */
            public void mo12847b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    this.f26440a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8086a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        }

        /* renamed from: a */
        public static AbstractC8085yz m12850a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8085yz)) ? new C8087a(iBinder) : (AbstractC8085yz) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12849a();

    /* renamed from: a */
    void mo12848a(int i, int i2, Intent intent);

    /* renamed from: b */
    void mo12847b();
}
