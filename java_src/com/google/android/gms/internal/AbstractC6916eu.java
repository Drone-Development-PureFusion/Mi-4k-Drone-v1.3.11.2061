package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.internal.eu */
/* loaded from: classes2.dex */
public interface AbstractC6916eu extends IInterface {

    /* renamed from: com.google.android.gms.internal.eu$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6917a extends Binder implements AbstractC6916eu {

        /* renamed from: com.google.android.gms.internal.eu$a$a */
        /* loaded from: classes2.dex */
        private static class C6918a implements AbstractC6916eu {

            /* renamed from: a */
            private IBinder f23311a;

            C6918a(IBinder iBinder) {
                this.f23311a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC6916eu
            /* renamed from: a */
            public void mo8332a(int i, int i2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23311a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23311a;
            }
        }

        public AbstractBinderC6917a() {
            attachInterface(this, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
        }

        /* renamed from: a */
        public static AbstractC6916eu m15946a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6916eu)) ? new C6918a(iBinder) : (AbstractC6916eu) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo8332a(int i, int i2, Bundle bundle);
}
