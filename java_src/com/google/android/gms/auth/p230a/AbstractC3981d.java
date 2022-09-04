package com.google.android.gms.auth.p230a;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.p230a.AbstractC3978c;
/* renamed from: com.google.android.gms.auth.a.d */
/* loaded from: classes2.dex */
public interface AbstractC3981d extends IInterface {

    /* renamed from: com.google.android.gms.auth.a.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3982a extends Binder implements AbstractC3981d {

        /* renamed from: com.google.android.gms.auth.a.d$a$a */
        /* loaded from: classes2.dex */
        private static class C3983a implements AbstractC3981d {

            /* renamed from: a */
            private IBinder f15353a;

            C3983a(IBinder iBinder) {
                this.f15353a = iBinder;
            }

            @Override // com.google.android.gms.auth.p230a.AbstractC3981d
            /* renamed from: a */
            public void mo25853a(AbstractC3978c abstractC3978c, Account account) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountService");
                    obtain.writeStrongBinder(abstractC3978c != null ? abstractC3978c.asBinder() : null);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15353a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.p230a.AbstractC3981d
            /* renamed from: a */
            public void mo25852a(AbstractC3978c abstractC3978c, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountService");
                    obtain.writeStrongBinder(abstractC3978c != null ? abstractC3978c.asBinder() : null);
                    obtain.writeString(str);
                    this.f15353a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.p230a.AbstractC3981d
            /* renamed from: a */
            public void mo25851a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountService");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f15353a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15353a;
            }
        }

        /* renamed from: a */
        public static AbstractC3981d m25854a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3981d)) ? new C3983a(iBinder) : (AbstractC3981d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountService");
                    a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountService");
                    a(AbstractC3978c.AbstractBinderC3979a.m25855a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountService");
                    a(AbstractC3978c.AbstractBinderC3979a.m25855a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.account.IWorkAccountService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo25853a(AbstractC3978c abstractC3978c, Account account);

    /* renamed from: a */
    void mo25852a(AbstractC3978c abstractC3978c, String str);

    /* renamed from: a */
    void mo25851a(boolean z);
}
