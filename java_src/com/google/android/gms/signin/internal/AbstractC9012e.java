package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.AbstractC4559ac;
import com.google.android.gms.common.internal.AbstractC4577ai;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.AbstractC9009d;
/* renamed from: com.google.android.gms.signin.internal.e */
/* loaded from: classes2.dex */
public interface AbstractC9012e extends IInterface {

    /* renamed from: com.google.android.gms.signin.internal.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9013a extends Binder implements AbstractC9012e {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.signin.internal.e$a$a */
        /* loaded from: classes2.dex */
        public static class C9014a implements AbstractC9012e {

            /* renamed from: a */
            private IBinder f28656a;

            C9014a(IBinder iBinder) {
                this.f28656a = iBinder;
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9384a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    this.f28656a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9383a(int i, Account account, AbstractC9009d abstractC9009d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC9009d != null ? abstractC9009d.asBinder() : null);
                    this.f28656a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9382a(AuthAccountRequest authAccountRequest, AbstractC9009d abstractC9009d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (authAccountRequest != null) {
                        obtain.writeInt(1);
                        authAccountRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC9009d != null ? abstractC9009d.asBinder() : null);
                    this.f28656a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9381a(ResolveAccountRequest resolveAccountRequest, AbstractC4577ai abstractC4577ai) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (resolveAccountRequest != null) {
                        obtain.writeInt(1);
                        resolveAccountRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4577ai != null ? abstractC4577ai.asBinder() : null);
                    this.f28656a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9380a(AbstractC4559ac abstractC4559ac, int i, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeStrongBinder(abstractC4559ac != null ? abstractC4559ac.asBinder() : null);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f28656a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9379a(CheckServerAuthResult checkServerAuthResult) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (checkServerAuthResult != null) {
                        obtain.writeInt(1);
                        checkServerAuthResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28656a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9378a(RecordConsentRequest recordConsentRequest, AbstractC9009d abstractC9009d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (recordConsentRequest != null) {
                        obtain.writeInt(1);
                        recordConsentRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC9009d != null ? abstractC9009d.asBinder() : null);
                    this.f28656a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9377a(SignInRequest signInRequest, AbstractC9009d abstractC9009d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (signInRequest != null) {
                        obtain.writeInt(1);
                        signInRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC9009d != null ? abstractC9009d.asBinder() : null);
                    this.f28656a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9376a(AbstractC9009d abstractC9009d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeStrongBinder(abstractC9009d != null ? abstractC9009d.asBinder() : null);
                    this.f28656a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.signin.internal.AbstractC9012e
            /* renamed from: a */
            public void mo9375a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f28656a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28656a;
            }
        }

        /* renamed from: a */
        public static AbstractC9012e m9385a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9012e)) ? new C9014a(iBinder) : (AbstractC9012e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            SignInRequest signInRequest = null;
            AuthAccountRequest authAccountRequest = null;
            CheckServerAuthResult checkServerAuthResult = null;
            ResolveAccountRequest resolveAccountRequest = null;
            Account account = null;
            RecordConsentRequest recordConsentRequest = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        authAccountRequest = AuthAccountRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(authAccountRequest, AbstractC9009d.AbstractBinderC9010a.m9391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        checkServerAuthResult = CheckServerAuthResult.CREATOR.createFromParcel(parcel);
                    }
                    a(checkServerAuthResult);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        resolveAccountRequest = ResolveAccountRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(resolveAccountRequest, AbstractC4577ai.AbstractBinderC4578a.m23647a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        account = (Account) Account.CREATOR.createFromParcel(parcel);
                    }
                    a(readInt, account, AbstractC9009d.AbstractBinderC9010a.m9391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    AbstractC4559ac m23702a = AbstractC4559ac.AbstractBinderC4560a.m23702a(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(m23702a, readInt2, z);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        recordConsentRequest = RecordConsentRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(recordConsentRequest, AbstractC9009d.AbstractBinderC9010a.m9391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    a(AbstractC9009d.AbstractBinderC9010a.m9391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if (parcel.readInt() != 0) {
                        signInRequest = SignInRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(signInRequest, AbstractC9009d.AbstractBinderC9010a.m9391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.signin.internal.ISignInService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9384a(int i);

    /* renamed from: a */
    void mo9383a(int i, Account account, AbstractC9009d abstractC9009d);

    /* renamed from: a */
    void mo9382a(AuthAccountRequest authAccountRequest, AbstractC9009d abstractC9009d);

    /* renamed from: a */
    void mo9381a(ResolveAccountRequest resolveAccountRequest, AbstractC4577ai abstractC4577ai);

    /* renamed from: a */
    void mo9380a(AbstractC4559ac abstractC4559ac, int i, boolean z);

    /* renamed from: a */
    void mo9379a(CheckServerAuthResult checkServerAuthResult);

    /* renamed from: a */
    void mo9378a(RecordConsentRequest recordConsentRequest, AbstractC9009d abstractC9009d);

    /* renamed from: a */
    void mo9377a(SignInRequest signInRequest, AbstractC9009d abstractC9009d);

    /* renamed from: a */
    void mo9376a(AbstractC9009d abstractC9009d);

    /* renamed from: a */
    void mo9375a(boolean z);
}
