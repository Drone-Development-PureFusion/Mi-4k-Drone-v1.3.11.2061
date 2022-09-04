package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
/* loaded from: classes2.dex */
public interface aew extends IInterface {

    /* renamed from: com.google.android.gms.internal.aew$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6252a extends Binder implements aew {

        /* renamed from: com.google.android.gms.internal.aew$a$a */
        /* loaded from: classes2.dex */
        private static class C6253a implements aew {

            /* renamed from: a */
            private IBinder f21377a;

            C6253a(IBinder iBinder) {
                this.f21377a = iBinder;
            }

            @Override // com.google.android.gms.internal.aew
            /* renamed from: a */
            public void mo17821a(ProxyResponse proxyResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    if (proxyResponse != null) {
                        obtain.writeInt(1);
                        proxyResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21377a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aew
            /* renamed from: a */
            public void mo17830a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    obtain.writeString(str);
                    this.f21377a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21377a;
            }
        }

        public AbstractBinderC6252a() {
            attachInterface(this, "com.google.android.gms.auth.api.internal.IAuthCallbacks");
        }

        /* renamed from: a */
        public static aew m17831a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aew)) ? new C6253a(iBinder) : (aew) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    a(parcel.readInt() != 0 ? ProxyResponse.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17821a(ProxyResponse proxyResponse);

    /* renamed from: a */
    void mo17830a(String str);
}
