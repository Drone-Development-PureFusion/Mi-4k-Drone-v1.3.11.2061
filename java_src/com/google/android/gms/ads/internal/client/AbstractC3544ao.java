package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.ads.internal.client.ao */
/* loaded from: classes2.dex */
public interface AbstractC3544ao extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.ao$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3545a extends Binder implements AbstractC3544ao {

        /* renamed from: com.google.android.gms.ads.internal.client.ao$a$a */
        /* loaded from: classes2.dex */
        private static class C3546a implements AbstractC3544ao {

            /* renamed from: a */
            private IBinder f13951a;

            C3546a(IBinder iBinder) {
                this.f13951a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13951a;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3544ao
            /* renamed from: b */
            public long mo27565b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    this.f13951a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC3545a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        }

        /* renamed from: a */
        public static AbstractC3544ao m27566a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3544ao)) ? new C3546a(iBinder) : (AbstractC3544ao) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    long b = b();
                    parcel2.writeNoException();
                    parcel2.writeLong(b);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: b */
    long mo27565b();
}
