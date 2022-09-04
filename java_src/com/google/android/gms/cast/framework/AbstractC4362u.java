package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
/* renamed from: com.google.android.gms.cast.framework.u */
/* loaded from: classes2.dex */
public interface AbstractC4362u extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.u$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4363a extends Binder implements AbstractC4362u {

        /* renamed from: com.google.android.gms.cast.framework.u$a$a */
        /* loaded from: classes2.dex */
        private static class C4364a implements AbstractC4362u {

            /* renamed from: a */
            private IBinder f16469a;

            C4364a(IBinder iBinder) {
                this.f16469a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4362u
            /* renamed from: a */
            public void mo24397a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastSession");
                    obtain.writeInt(i);
                    this.f16469a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4362u
            /* renamed from: a */
            public void mo24396a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastSession");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16469a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4362u
            /* renamed from: a */
            public void mo24395a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastSession");
                    if (applicationMetadata != null) {
                        obtain.writeInt(1);
                        applicationMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f16469a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4362u
            /* renamed from: a */
            public void mo24394a(ConnectionResult connectionResult) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastSession");
                    if (connectionResult != null) {
                        obtain.writeInt(1);
                        connectionResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16469a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4362u
            /* renamed from: a */
            public void mo24393a(boolean z, int i) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastSession");
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    obtain.writeInt(i);
                    this.f16469a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16469a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4362u
            /* renamed from: b */
            public void mo24392b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastSession");
                    obtain.writeInt(i);
                    this.f16469a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4362u m24398a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4362u)) ? new C4364a(iBinder) : (AbstractC4362u) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            ApplicationMetadata applicationMetadata = null;
            Bundle bundle = null;
            ConnectionResult connectionResult = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastSession");
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(bundle);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastSession");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastSession");
                    if (parcel.readInt() != 0) {
                        connectionResult = ConnectionResult.CREATOR.createFromParcel(parcel);
                    }
                    a(connectionResult);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastSession");
                    if (parcel.readInt() != 0) {
                        applicationMetadata = ApplicationMetadata.CREATOR.createFromParcel(parcel);
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(applicationMetadata, readString, readString2, z);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastSession");
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastSession");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ICastSession");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo24397a(int i);

    /* renamed from: a */
    void mo24396a(Bundle bundle);

    /* renamed from: a */
    void mo24395a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z);

    /* renamed from: a */
    void mo24394a(ConnectionResult connectionResult);

    /* renamed from: a */
    void mo24393a(boolean z, int i);

    /* renamed from: b */
    void mo24392b(int i);
}
