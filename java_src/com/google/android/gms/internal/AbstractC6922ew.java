package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC6913et;
import com.google.android.gms.internal.AbstractC6916eu;
import com.google.android.gms.p232c.AbstractC4167d;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
/* renamed from: com.google.android.gms.internal.ew */
/* loaded from: classes2.dex */
public interface AbstractC6922ew extends IInterface {

    /* renamed from: com.google.android.gms.internal.ew$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6923a extends Binder implements AbstractC6922ew {

        /* renamed from: com.google.android.gms.internal.ew$a$a */
        /* loaded from: classes2.dex */
        private static class C6924a implements AbstractC6922ew {

            /* renamed from: a */
            private IBinder f23313a;

            C6924a(IBinder iBinder) {
                this.f23313a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC6922ew
            /* renamed from: a */
            public AbstractC6913et mo15927a(AbstractC4170e abstractC4170e, AbstractC4167d abstractC4167d, WalletFragmentOptions walletFragmentOptions, AbstractC6916eu abstractC6916eu) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC4167d != null ? abstractC4167d.asBinder() : null);
                    if (walletFragmentOptions != null) {
                        obtain.writeInt(1);
                        walletFragmentOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6916eu != null) {
                        iBinder = abstractC6916eu.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23313a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC6913et.AbstractBinderC6914a.m15961a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23313a;
            }
        }

        /* renamed from: a */
        public static AbstractC6922ew m15928a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6922ew)) ? new C6924a(iBinder) : (AbstractC6922ew) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    AbstractC6913et a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4167d.AbstractBinderC4168a.m25296a(parcel.readStrongBinder()), parcel.readInt() != 0 ? WalletFragmentOptions.CREATOR.createFromParcel(parcel) : null, AbstractC6916eu.AbstractBinderC6917a.m15946a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC6913et mo15927a(AbstractC4170e abstractC4170e, AbstractC4167d abstractC4167d, WalletFragmentOptions walletFragmentOptions, AbstractC6916eu abstractC6916eu);
}
