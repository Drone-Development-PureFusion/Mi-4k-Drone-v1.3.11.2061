package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.aes;
/* loaded from: classes2.dex */
public interface aet extends IInterface {

    /* renamed from: com.google.android.gms.internal.aet$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6250a extends Binder implements aet {

        /* renamed from: com.google.android.gms.internal.aet$a$a */
        /* loaded from: classes2.dex */
        private static class C6251a implements aet {

            /* renamed from: a */
            private IBinder f21375a;

            C6251a(IBinder iBinder) {
                this.f21375a = iBinder;
            }

            @Override // com.google.android.gms.internal.aet
            /* renamed from: a */
            public void mo17833a(Account account, int i, aes aesVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(aesVar != null ? aesVar.asBinder() : null);
                    this.f21375a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21375a;
            }
        }

        /* renamed from: a */
        public static aet m17834a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aet)) ? new C6251a(iBinder) : (aet) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
                    a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), aes.AbstractBinderC6248a.m17836a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17833a(Account account, int i, aes aesVar);
}
