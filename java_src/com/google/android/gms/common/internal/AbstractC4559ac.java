package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.common.internal.ac */
/* loaded from: classes2.dex */
public interface AbstractC4559ac extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.ac$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4560a extends Binder implements AbstractC4559ac {

        /* renamed from: com.google.android.gms.common.internal.ac$a$a */
        /* loaded from: classes2.dex */
        private static class C4561a implements AbstractC4559ac {

            /* renamed from: a */
            private IBinder f17029a;

            C4561a(IBinder iBinder) {
                this.f17029a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4559ac
            /* renamed from: a */
            public Account mo23701a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
                    this.f17029a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17029a;
            }
        }

        /* renamed from: a */
        public static AbstractC4559ac m23702a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4559ac)) ? new C4561a(iBinder) : (AbstractC4559ac) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    Account a = a();
                    parcel2.writeNoException();
                    if (a == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IAccountAccessor");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    Account mo23701a();
}
