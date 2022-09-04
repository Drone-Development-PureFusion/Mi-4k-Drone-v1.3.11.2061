package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.internal.aew;
/* loaded from: classes2.dex */
public interface aex extends IInterface {

    /* renamed from: com.google.android.gms.internal.aex$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6254a extends Binder implements aex {

        /* renamed from: com.google.android.gms.internal.aex$a$a */
        /* loaded from: classes2.dex */
        private static class C6255a implements aex {

            /* renamed from: a */
            private IBinder f21378a;

            C6255a(IBinder iBinder) {
                this.f21378a = iBinder;
            }

            @Override // com.google.android.gms.internal.aex
            /* renamed from: a */
            public void mo17828a(aew aewVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(aewVar != null ? aewVar.asBinder() : null);
                    this.f21378a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aex
            /* renamed from: a */
            public void mo17827a(aew aewVar, ProxyGrpcRequest proxyGrpcRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(aewVar != null ? aewVar.asBinder() : null);
                    if (proxyGrpcRequest != null) {
                        obtain.writeInt(1);
                        proxyGrpcRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21378a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aex
            /* renamed from: a */
            public void mo17826a(aew aewVar, ProxyRequest proxyRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    obtain.writeStrongBinder(aewVar != null ? aewVar.asBinder() : null);
                    if (proxyRequest != null) {
                        obtain.writeInt(1);
                        proxyRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21378a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21378a;
            }
        }

        /* renamed from: a */
        public static aex m17829a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aex)) ? new C6255a(iBinder) : (aex) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ProxyGrpcRequest proxyGrpcRequest = null;
            ProxyRequest proxyRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    aew m17831a = aew.AbstractBinderC6252a.m17831a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        proxyRequest = ProxyRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m17831a, proxyRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    aew m17831a2 = aew.AbstractBinderC6252a.m17831a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        proxyGrpcRequest = ProxyGrpcRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m17831a2, proxyGrpcRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    a(aew.AbstractBinderC6252a.m17831a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.internal.IAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17828a(aew aewVar);

    /* renamed from: a */
    void mo17827a(aew aewVar, ProxyGrpcRequest proxyGrpcRequest);

    /* renamed from: a */
    void mo17826a(aew aewVar, ProxyRequest proxyRequest);
}
