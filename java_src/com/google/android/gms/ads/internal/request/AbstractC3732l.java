package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.ads.internal.request.l */
/* loaded from: classes2.dex */
public interface AbstractC3732l extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.request.l$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3733a extends Binder implements AbstractC3732l {

        /* renamed from: com.google.android.gms.ads.internal.request.l$a$a */
        /* loaded from: classes2.dex */
        private static class C3734a implements AbstractC3732l {

            /* renamed from: a */
            private IBinder f14639a;

            C3734a(IBinder iBinder) {
                this.f14639a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.request.AbstractC3732l
            /* renamed from: a */
            public void mo26994a(AdResponseParcel adResponseParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (adResponseParcel != null) {
                        obtain.writeInt(1);
                        adResponseParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f14639a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14639a;
            }
        }

        public AbstractBinderC3733a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
        }

        /* renamed from: a */
        public static AbstractC3732l m26995a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3732l)) ? new C3734a(iBinder) : (AbstractC3732l) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    a(parcel.readInt() != 0 ? (AdResponseParcel) AdResponseParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo26994a(AdResponseParcel adResponseParcel);
}
