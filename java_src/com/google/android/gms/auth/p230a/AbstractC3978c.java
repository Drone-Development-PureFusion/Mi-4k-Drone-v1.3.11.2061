package com.google.android.gms.auth.p230a;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.auth.a.c */
/* loaded from: classes2.dex */
public interface AbstractC3978c extends IInterface {

    /* renamed from: com.google.android.gms.auth.a.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3979a extends Binder implements AbstractC3978c {

        /* renamed from: com.google.android.gms.auth.a.c$a$a */
        /* loaded from: classes2.dex */
        private static class C3980a implements AbstractC3978c {

            /* renamed from: a */
            private IBinder f15352a;

            C3980a(IBinder iBinder) {
                this.f15352a = iBinder;
            }

            @Override // com.google.android.gms.auth.p230a.AbstractC3978c
            /* renamed from: a */
            public void mo17841a(Account account) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountCallback");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15352a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.p230a.AbstractC3978c
            /* renamed from: a */
            public void mo17840a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.account.IWorkAccountCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f15352a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15352a;
            }
        }

        public AbstractBinderC3979a() {
            attachInterface(this, "com.google.android.gms.auth.account.IWorkAccountCallback");
        }

        /* renamed from: a */
        public static AbstractC3978c m25855a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3978c)) ? new C3980a(iBinder) : (AbstractC3978c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
                    a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
                    a(parcel.readInt() != 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.account.IWorkAccountCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17841a(Account account);

    /* renamed from: a */
    void mo17840a(boolean z);
}
