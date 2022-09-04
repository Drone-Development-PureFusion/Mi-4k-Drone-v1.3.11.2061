package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.internal.za */
/* loaded from: classes2.dex */
public interface AbstractC8089za extends IInterface {

    /* renamed from: com.google.android.gms.internal.za$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8090a extends Binder implements AbstractC8089za {

        /* renamed from: com.google.android.gms.internal.za$a$a */
        /* loaded from: classes2.dex */
        private static class C8091a implements AbstractC8089za {

            /* renamed from: a */
            private IBinder f26441a;

            C8091a(IBinder iBinder) {
                this.f26441a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8089za
            /* renamed from: a */
            public IBinder mo12844a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f26441a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26441a;
            }
        }

        /* renamed from: a */
        public static AbstractC8089za m12845a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8089za)) ? new C8091a(iBinder) : (AbstractC8089za) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
                    IBinder a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo12844a(AbstractC4170e abstractC4170e);
}
