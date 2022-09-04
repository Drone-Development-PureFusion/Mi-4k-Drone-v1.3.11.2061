package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public interface amo extends IInterface {

    /* renamed from: com.google.android.gms.internal.amo$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6576a extends Binder implements amo {

        /* renamed from: com.google.android.gms.internal.amo$a$a */
        /* loaded from: classes2.dex */
        private static class C6577a implements amo {

            /* renamed from: a */
            private IBinder f22306a;

            C6577a(IBinder iBinder) {
                this.f22306a = iBinder;
            }

            @Override // com.google.android.gms.internal.amo
            /* renamed from: a */
            public void mo16769a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22306a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22306a;
            }
        }

        public AbstractBinderC6576a() {
            attachInterface(this, "com.google.android.gms.identity.intents.internal.IAddressCallbacks");
        }

        /* renamed from: a */
        public static amo m16770a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof amo)) ? new C6577a(iBinder) : (amo) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16769a(int i, Bundle bundle);
}
