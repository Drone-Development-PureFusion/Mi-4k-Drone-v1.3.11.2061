package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC8008xr;
/* renamed from: com.google.android.gms.internal.xq */
/* loaded from: classes2.dex */
public interface AbstractC8005xq extends IInterface {

    /* renamed from: com.google.android.gms.internal.xq$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8006a extends Binder implements AbstractC8005xq {

        /* renamed from: com.google.android.gms.internal.xq$a$a */
        /* loaded from: classes2.dex */
        private static class C8007a implements AbstractC8005xq {

            /* renamed from: a */
            private IBinder f26311a;

            C8007a(IBinder iBinder) {
                this.f26311a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8005xq
            /* renamed from: a */
            public AbstractC8008xr mo13053a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    obtain.writeString(str);
                    this.f26311a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8008xr.AbstractBinderC8009a.m13051a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26311a;
            }

            @Override // com.google.android.gms.internal.AbstractC8005xq
            /* renamed from: b */
            public boolean mo13052b(String str) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    obtain.writeString(str);
                    this.f26311a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8006a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        }

        /* renamed from: a */
        public static AbstractC8005xq m13054a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8005xq)) ? new C8007a(iBinder) : (AbstractC8005xq) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    AbstractC8008xr a = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    boolean b = b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(b ? 1 : 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC8008xr mo13053a(String str);

    /* renamed from: b */
    boolean mo13052b(String str);
}
