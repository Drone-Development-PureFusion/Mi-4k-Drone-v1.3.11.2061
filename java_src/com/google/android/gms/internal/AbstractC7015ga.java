package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7011fz;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
/* renamed from: com.google.android.gms.internal.ga */
/* loaded from: classes2.dex */
public interface AbstractC7015ga extends IInterface {

    /* renamed from: com.google.android.gms.internal.ga$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7016a extends Binder implements AbstractC7015ga {

        /* renamed from: com.google.android.gms.internal.ga$a$a */
        /* loaded from: classes2.dex */
        private static class C7017a implements AbstractC7015ga {

            /* renamed from: a */
            private IBinder f23697a;

            C7017a(IBinder iBinder) {
                this.f23697a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: a */
            public void mo15797a(AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: a */
            public void mo15796a(VerifyAssertionRequest verifyAssertionRequest, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    if (verifyAssertionRequest != null) {
                        obtain.writeInt(1);
                        verifyAssertionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: a */
            public void mo15795a(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: a */
            public void mo15794a(String str, UserProfileChangeRequest userProfileChangeRequest, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    if (userProfileChangeRequest != null) {
                        obtain.writeInt(1);
                        userProfileChangeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: a */
            public void mo15793a(String str, VerifyAssertionRequest verifyAssertionRequest, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    if (verifyAssertionRequest != null) {
                        obtain.writeInt(1);
                        verifyAssertionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: a */
            public void mo15792a(String str, String str2, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: a */
            public void mo15791a(String str, String str2, String str3, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23697a;
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: b */
            public void mo15790b(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: b */
            public void mo15789b(String str, String str2, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: c */
            public void mo15788c(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: c */
            public void mo15787c(String str, String str2, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: d */
            public void mo15786d(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: d */
            public void mo15785d(String str, String str2, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: e */
            public void mo15784e(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: e */
            public void mo15783e(String str, String str2, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: f */
            public void mo15782f(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: g */
            public void mo15781g(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7015ga
            /* renamed from: h */
            public void mo15780h(String str, AbstractC7011fz abstractC7011fz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7011fz != null ? abstractC7011fz.asBinder() : null);
                    this.f23697a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC7015ga m15798a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7015ga)) ? new C7017a(iBinder) : (AbstractC7015ga) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            VerifyAssertionRequest verifyAssertionRequest = null;
            VerifyAssertionRequest verifyAssertionRequest2 = null;
            UserProfileChangeRequest userProfileChangeRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    b(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    if (parcel.readInt() != 0) {
                        verifyAssertionRequest2 = VerifyAssertionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(verifyAssertionRequest2, AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        userProfileChangeRequest = UserProfileChangeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, userProfileChangeRequest, AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(parcel.readString(), parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    b(parcel.readString(), parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    c(parcel.readString(), parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    d(parcel.readString(), parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    c(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    d(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        verifyAssertionRequest = VerifyAssertionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(readString2, verifyAssertionRequest, AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    e(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    e(parcel.readString(), parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    f(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    a(AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    g(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    h(parcel.readString(), AbstractC7011fz.AbstractBinderC7012a.m15799a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo15797a(AbstractC7011fz abstractC7011fz);

    /* renamed from: a */
    void mo15796a(VerifyAssertionRequest verifyAssertionRequest, AbstractC7011fz abstractC7011fz);

    /* renamed from: a */
    void mo15795a(String str, AbstractC7011fz abstractC7011fz);

    /* renamed from: a */
    void mo15794a(String str, UserProfileChangeRequest userProfileChangeRequest, AbstractC7011fz abstractC7011fz);

    /* renamed from: a */
    void mo15793a(String str, VerifyAssertionRequest verifyAssertionRequest, AbstractC7011fz abstractC7011fz);

    /* renamed from: a */
    void mo15792a(String str, String str2, AbstractC7011fz abstractC7011fz);

    /* renamed from: a */
    void mo15791a(String str, String str2, String str3, AbstractC7011fz abstractC7011fz);

    /* renamed from: b */
    void mo15790b(String str, AbstractC7011fz abstractC7011fz);

    /* renamed from: b */
    void mo15789b(String str, String str2, AbstractC7011fz abstractC7011fz);

    /* renamed from: c */
    void mo15788c(String str, AbstractC7011fz abstractC7011fz);

    /* renamed from: c */
    void mo15787c(String str, String str2, AbstractC7011fz abstractC7011fz);

    /* renamed from: d */
    void mo15786d(String str, AbstractC7011fz abstractC7011fz);

    /* renamed from: d */
    void mo15785d(String str, String str2, AbstractC7011fz abstractC7011fz);

    /* renamed from: e */
    void mo15784e(String str, AbstractC7011fz abstractC7011fz);

    /* renamed from: e */
    void mo15783e(String str, String str2, AbstractC7011fz abstractC7011fz);

    /* renamed from: f */
    void mo15782f(String str, AbstractC7011fz abstractC7011fz);

    /* renamed from: g */
    void mo15781g(String str, AbstractC7011fz abstractC7011fz);

    /* renamed from: h */
    void mo15780h(String str, AbstractC7011fz abstractC7011fz);
}
