package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.internal.xt */
/* loaded from: classes2.dex */
public interface AbstractC8014xt extends IInterface {

    /* renamed from: com.google.android.gms.internal.xt$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8015a extends Binder implements AbstractC8014xt {

        /* renamed from: com.google.android.gms.internal.xt$a$a */
        /* loaded from: classes2.dex */
        private static class C8016a implements AbstractC8014xt {

            /* renamed from: a */
            private IBinder f26314a;

            C8016a(IBinder iBinder) {
                this.f26314a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8014xt
            /* renamed from: a */
            public int mo13040a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    this.f26314a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26314a;
            }
        }

        public AbstractBinderC8015a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
        }

        /* renamed from: a */
        public static AbstractC8014xt m13041a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8014xt)) ? new C8016a(iBinder) : (AbstractC8014xt) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo13040a();
}
