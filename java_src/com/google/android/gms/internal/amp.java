package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.internal.amo;
/* loaded from: classes2.dex */
public interface amp extends IInterface {

    /* renamed from: com.google.android.gms.internal.amp$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6578a extends Binder implements amp {

        /* renamed from: com.google.android.gms.internal.amp$a$a */
        /* loaded from: classes2.dex */
        private static class C6579a implements amp {

            /* renamed from: a */
            private IBinder f22307a;

            C6579a(IBinder iBinder) {
                this.f22307a = iBinder;
            }

            @Override // com.google.android.gms.internal.amp
            /* renamed from: a */
            public void mo16767a(amo amoVar, UserAddressRequest userAddressRequest, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressService");
                    obtain.writeStrongBinder(amoVar != null ? amoVar.asBinder() : null);
                    if (userAddressRequest != null) {
                        obtain.writeInt(1);
                        userAddressRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22307a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22307a;
            }
        }

        /* renamed from: a */
        public static amp m16768a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof amp)) ? new C6579a(iBinder) : (amp) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
                    a(amo.AbstractBinderC6576a.m16770a(parcel.readStrongBinder()), parcel.readInt() != 0 ? UserAddressRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.identity.intents.internal.IAddressService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16767a(amo amoVar, UserAddressRequest userAddressRequest, Bundle bundle);
}
