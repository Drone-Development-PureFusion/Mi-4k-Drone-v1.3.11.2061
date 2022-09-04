package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.internal.ex */
/* loaded from: classes2.dex */
public interface AbstractC6925ex extends IInterface {

    /* renamed from: com.google.android.gms.internal.ex$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6926a extends Binder implements AbstractC6925ex {

        /* renamed from: com.google.android.gms.internal.ex$a$a */
        /* loaded from: classes2.dex */
        private static class C6927a implements AbstractC6925ex {

            /* renamed from: a */
            private IBinder f23314a;

            C6927a(IBinder iBinder) {
                this.f23314a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC6925ex
            /* renamed from: a */
            public void mo15925a(int i, int i2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23314a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23314a;
            }
        }

        /* renamed from: a */
        public static AbstractC6925ex m15926a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6925ex)) ? new C6927a(iBinder) : (AbstractC6925ex) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                    a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo15925a(int i, int i2, Bundle bundle);
}
