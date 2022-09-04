package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.request.AbstractC3732l;
/* renamed from: com.google.android.gms.ads.internal.request.k */
/* loaded from: classes2.dex */
public interface AbstractC3729k extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.request.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3730a extends Binder implements AbstractC3729k {

        /* renamed from: com.google.android.gms.ads.internal.request.k$a$a */
        /* loaded from: classes2.dex */
        private static class C3731a implements AbstractC3729k {

            /* renamed from: a */
            private IBinder f14638a;

            C3731a(IBinder iBinder) {
                this.f14638a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.request.AbstractC3729k
            /* renamed from: a */
            public AdResponseParcel mo18688a(AdRequestInfoParcel adRequestInfoParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f14638a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (AdResponseParcel) AdResponseParcel.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.request.AbstractC3729k
            /* renamed from: a */
            public void mo18686a(AdRequestInfoParcel adRequestInfoParcel, AbstractC3732l abstractC3732l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC3732l != null ? abstractC3732l.asBinder() : null);
                    this.f14638a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14638a;
            }
        }

        public AbstractBinderC3730a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        /* renamed from: a */
        public static AbstractC3729k m26996a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3729k)) ? new C3731a(iBinder) : (AbstractC3729k) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AdRequestInfoParcel adRequestInfoParcel = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        adRequestInfoParcel = (AdRequestInfoParcel) AdRequestInfoParcel.CREATOR.createFromParcel(parcel);
                    }
                    AdResponseParcel a = a(adRequestInfoParcel);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        adRequestInfoParcel = (AdRequestInfoParcel) AdRequestInfoParcel.CREATOR.createFromParcel(parcel);
                    }
                    a(adRequestInfoParcel, AbstractC3732l.AbstractBinderC3733a.m26995a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AdResponseParcel mo18688a(AdRequestInfoParcel adRequestInfoParcel);

    /* renamed from: a */
    void mo18686a(AdRequestInfoParcel adRequestInfoParcel, AbstractC3732l abstractC3732l);
}
