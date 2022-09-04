package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC8093zc;
/* renamed from: com.google.android.gms.internal.zd */
/* loaded from: classes2.dex */
public interface AbstractC8096zd extends IInterface {

    /* renamed from: com.google.android.gms.internal.zd$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8097a extends Binder implements AbstractC8096zd {

        /* renamed from: com.google.android.gms.internal.zd$a$a */
        /* loaded from: classes2.dex */
        private static class C8098a implements AbstractC8096zd {

            /* renamed from: a */
            private IBinder f26448a;

            C8098a(IBinder iBinder) {
                this.f26448a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8096zd
            /* renamed from: a */
            public void mo12825a(AbstractC8093zc abstractC8093zc) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    obtain.writeStrongBinder(abstractC8093zc != null ? abstractC8093zc.asBinder() : null);
                    this.f26448a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8096zd
            /* renamed from: a */
            public boolean mo12824a(String str) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    obtain.writeString(str);
                    this.f26448a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26448a;
            }
        }

        public AbstractBinderC8097a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        }

        /* renamed from: a */
        public static AbstractC8096zd m12837a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8096zd)) ? new C8098a(iBinder) : (AbstractC8096zd) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    boolean a = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    a(AbstractC8093zc.AbstractBinderC8094a.m12843a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12825a(AbstractC8093zc abstractC8093zc);

    /* renamed from: a */
    boolean mo12824a(String str);
}
