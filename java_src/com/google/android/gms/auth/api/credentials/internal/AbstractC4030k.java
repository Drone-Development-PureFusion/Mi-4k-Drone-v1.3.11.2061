package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.AbstractC4027j;
/* renamed from: com.google.android.gms.auth.api.credentials.internal.k */
/* loaded from: classes2.dex */
public interface AbstractC4030k extends IInterface {

    /* renamed from: com.google.android.gms.auth.api.credentials.internal.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4031a extends Binder implements AbstractC4030k {

        /* renamed from: com.google.android.gms.auth.api.credentials.internal.k$a$a */
        /* loaded from: classes2.dex */
        private static class C4032a implements AbstractC4030k {

            /* renamed from: a */
            private IBinder f15466a;

            C4032a(IBinder iBinder) {
                this.f15466a = iBinder;
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4030k
            /* renamed from: a */
            public void mo25715a(AbstractC4027j abstractC4027j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(abstractC4027j != null ? abstractC4027j.asBinder() : null);
                    this.f15466a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4030k
            /* renamed from: a */
            public void mo25714a(AbstractC4027j abstractC4027j, CredentialRequest credentialRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(abstractC4027j != null ? abstractC4027j.asBinder() : null);
                    if (credentialRequest != null) {
                        obtain.writeInt(1);
                        credentialRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15466a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4030k
            /* renamed from: a */
            public void mo25713a(AbstractC4027j abstractC4027j, DeleteRequest deleteRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(abstractC4027j != null ? abstractC4027j.asBinder() : null);
                    if (deleteRequest != null) {
                        obtain.writeInt(1);
                        deleteRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15466a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4030k
            /* renamed from: a */
            public void mo25712a(AbstractC4027j abstractC4027j, GeneratePasswordRequest generatePasswordRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(abstractC4027j != null ? abstractC4027j.asBinder() : null);
                    if (generatePasswordRequest != null) {
                        obtain.writeInt(1);
                        generatePasswordRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15466a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4030k
            /* renamed from: a */
            public void mo25711a(AbstractC4027j abstractC4027j, SaveRequest saveRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(abstractC4027j != null ? abstractC4027j.asBinder() : null);
                    if (saveRequest != null) {
                        obtain.writeInt(1);
                        saveRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15466a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15466a;
            }
        }

        /* renamed from: a */
        public static AbstractC4030k m25716a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4030k)) ? new C4032a(iBinder) : (AbstractC4030k) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            GeneratePasswordRequest generatePasswordRequest = null;
            CredentialRequest credentialRequest = null;
            SaveRequest saveRequest = null;
            DeleteRequest deleteRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    AbstractC4027j m25720a = AbstractC4027j.AbstractBinderC4028a.m25720a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        credentialRequest = CredentialRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m25720a, credentialRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    AbstractC4027j m25720a2 = AbstractC4027j.AbstractBinderC4028a.m25720a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        saveRequest = SaveRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m25720a2, saveRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    AbstractC4027j m25720a3 = AbstractC4027j.AbstractBinderC4028a.m25720a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        deleteRequest = DeleteRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m25720a3, deleteRequest);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    a(AbstractC4027j.AbstractBinderC4028a.m25720a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    AbstractC4027j m25720a4 = AbstractC4027j.AbstractBinderC4028a.m25720a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        generatePasswordRequest = GeneratePasswordRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m25720a4, generatePasswordRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo25715a(AbstractC4027j abstractC4027j);

    /* renamed from: a */
    void mo25714a(AbstractC4027j abstractC4027j, CredentialRequest credentialRequest);

    /* renamed from: a */
    void mo25713a(AbstractC4027j abstractC4027j, DeleteRequest deleteRequest);

    /* renamed from: a */
    void mo25712a(AbstractC4027j abstractC4027j, GeneratePasswordRequest generatePasswordRequest);

    /* renamed from: a */
    void mo25711a(AbstractC4027j abstractC4027j, SaveRequest saveRequest);
}
