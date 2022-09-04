package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.AbstractC4065f;
/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
/* loaded from: classes2.dex */
public interface AbstractC4068g extends IInterface {

    /* renamed from: com.google.android.gms.auth.api.signin.internal.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4069a extends Binder implements AbstractC4068g {

        /* renamed from: com.google.android.gms.auth.api.signin.internal.g$a$a */
        /* loaded from: classes2.dex */
        private static class C4070a implements AbstractC4068g {

            /* renamed from: a */
            private IBinder f15573a;

            C4070a(IBinder iBinder) {
                this.f15573a = iBinder;
            }

            @Override // com.google.android.gms.auth.api.signin.internal.AbstractC4068g
            /* renamed from: a */
            public void mo25592a(AbstractC4065f abstractC4065f, GoogleSignInOptions googleSignInOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(abstractC4065f != null ? abstractC4065f.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15573a.transact(101, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15573a;
            }

            @Override // com.google.android.gms.auth.api.signin.internal.AbstractC4068g
            /* renamed from: b */
            public void mo25591b(AbstractC4065f abstractC4065f, GoogleSignInOptions googleSignInOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(abstractC4065f != null ? abstractC4065f.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15573a.transact(102, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.auth.api.signin.internal.AbstractC4068g
            /* renamed from: c */
            public void mo25590c(AbstractC4065f abstractC4065f, GoogleSignInOptions googleSignInOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(abstractC4065f != null ? abstractC4065f.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15573a.transact(103, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4068g m25593a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4068g)) ? new C4070a(iBinder) : (AbstractC4068g) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            GoogleSignInOptions googleSignInOptions = null;
            switch (i) {
                case 101:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    AbstractC4065f m25597a = AbstractC4065f.AbstractBinderC4066a.m25597a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    a(m25597a, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 102:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    AbstractC4065f m25597a2 = AbstractC4065f.AbstractBinderC4066a.m25597a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    b(m25597a2, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 103:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    AbstractC4065f m25597a3 = AbstractC4065f.AbstractBinderC4066a.m25597a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    c(m25597a3, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo25592a(AbstractC4065f abstractC4065f, GoogleSignInOptions googleSignInOptions);

    /* renamed from: b */
    void mo25591b(AbstractC4065f abstractC4065f, GoogleSignInOptions googleSignInOptions);

    /* renamed from: c */
    void mo25590c(AbstractC4065f abstractC4065f, GoogleSignInOptions googleSignInOptions);
}
