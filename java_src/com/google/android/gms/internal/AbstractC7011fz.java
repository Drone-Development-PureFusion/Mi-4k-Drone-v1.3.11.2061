package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
/* renamed from: com.google.android.gms.internal.fz */
/* loaded from: classes2.dex */
public interface AbstractC7011fz extends IInterface {

    /* renamed from: com.google.android.gms.internal.fz$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7012a extends Binder implements AbstractC7011fz {

        /* renamed from: com.google.android.gms.internal.fz$a$a */
        /* loaded from: classes2.dex */
        private static class C7013a implements AbstractC7011fz {

            /* renamed from: a */
            private IBinder f23696a;

            C7013a(IBinder iBinder) {
                this.f23696a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7011fz
            /* renamed from: a */
            public void mo15762a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    this.f23696a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7011fz
            /* renamed from: a */
            public void mo15761a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23696a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7011fz
            /* renamed from: a */
            public void mo15760a(CreateAuthUriResponse createAuthUriResponse) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (createAuthUriResponse != null) {
                        obtain.writeInt(1);
                        createAuthUriResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23696a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7011fz
            /* renamed from: a */
            public void mo15759a(GetTokenResponse getTokenResponse) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (getTokenResponse != null) {
                        obtain.writeInt(1);
                        getTokenResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23696a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7011fz
            /* renamed from: a */
            public void mo15758a(GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (getTokenResponse != null) {
                        obtain.writeInt(1);
                        getTokenResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (getAccountInfoUser != null) {
                        obtain.writeInt(1);
                        getAccountInfoUser.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23696a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23696a;
            }

            @Override // com.google.android.gms.internal.AbstractC7011fz
            /* renamed from: b */
            public void mo15757b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    this.f23696a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7011fz
            /* renamed from: c */
            public void mo15756c() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    this.f23696a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC7012a() {
            attachInterface(this, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
        }

        /* renamed from: a */
        public static AbstractC7011fz m15799a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7011fz)) ? new C7013a(iBinder) : (AbstractC7011fz) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? GetTokenResponse.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? GetTokenResponse.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? GetAccountInfoUser.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? CreateAuthUriResponse.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    b();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    c();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo15762a();

    /* renamed from: a */
    void mo15761a(Status status);

    /* renamed from: a */
    void mo15760a(CreateAuthUriResponse createAuthUriResponse);

    /* renamed from: a */
    void mo15759a(GetTokenResponse getTokenResponse);

    /* renamed from: a */
    void mo15758a(GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser);

    /* renamed from: b */
    void mo15757b();

    /* renamed from: c */
    void mo15756c();
}
