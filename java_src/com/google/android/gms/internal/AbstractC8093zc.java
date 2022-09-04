package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.internal.zc */
/* loaded from: classes2.dex */
public interface AbstractC8093zc extends IInterface {

    /* renamed from: com.google.android.gms.internal.zc$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8094a extends Binder implements AbstractC8093zc {

        /* renamed from: com.google.android.gms.internal.zc$a$a */
        /* loaded from: classes2.dex */
        private static class C8095a implements AbstractC8093zc {

            /* renamed from: a */
            private IBinder f26447a;

            C8095a(IBinder iBinder) {
                this.f26447a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8093zc
            /* renamed from: a */
            public boolean mo12842a() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.f26447a.transact(4, obtain, obtain2, 0);
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
                return this.f26447a;
            }

            @Override // com.google.android.gms.internal.AbstractC8093zc
            /* renamed from: b */
            public String mo12841b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.f26447a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8093zc
            /* renamed from: c */
            public Intent mo12840c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.f26447a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8093zc
            /* renamed from: d */
            public int mo12839d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.f26447a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8093zc
            /* renamed from: e */
            public void mo12838e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.f26447a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8094a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        }

        /* renamed from: a */
        public static AbstractC8093zc m12843a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8093zc)) ? new C8095a(iBinder) : (AbstractC8093zc) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    String b = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    Intent c = c();
                    parcel2.writeNoException();
                    if (c == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    int d = d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    boolean a = a();
                    parcel2.writeNoException();
                    if (a) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    boolean mo12842a();

    /* renamed from: b */
    String mo12841b();

    /* renamed from: c */
    Intent mo12840c();

    /* renamed from: d */
    int mo12839d();

    /* renamed from: e */
    void mo12838e();
}
