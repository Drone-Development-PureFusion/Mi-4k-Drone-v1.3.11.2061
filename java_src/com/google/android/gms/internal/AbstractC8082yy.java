package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC8079yx;
/* renamed from: com.google.android.gms.internal.yy */
/* loaded from: classes2.dex */
public interface AbstractC8082yy extends IInterface {

    /* renamed from: com.google.android.gms.internal.yy$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8083a extends Binder implements AbstractC8082yy {

        /* renamed from: com.google.android.gms.internal.yy$a$a */
        /* loaded from: classes2.dex */
        private static class C8084a implements AbstractC8082yy {

            /* renamed from: a */
            private IBinder f26439a;

            C8084a(IBinder iBinder) {
                this.f26439a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8082yy
            /* renamed from: a */
            public void mo12836a(AbstractC8079yx abstractC8079yx) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    obtain.writeStrongBinder(abstractC8079yx != null ? abstractC8079yx.asBinder() : null);
                    this.f26439a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26439a;
            }
        }

        public AbstractBinderC8083a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        }

        /* renamed from: a */
        public static AbstractC8082yy m12851a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8082yy)) ? new C8084a(iBinder) : (AbstractC8082yy) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    a(AbstractC8079yx.AbstractBinderC8080a.m12855a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12836a(AbstractC8079yx abstractC8079yx);
}
