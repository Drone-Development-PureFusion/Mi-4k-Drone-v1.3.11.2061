package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.ads.internal.client.af */
/* loaded from: classes2.dex */
public interface AbstractC3517af extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.af$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3518a extends Binder implements AbstractC3517af {

        /* renamed from: com.google.android.gms.ads.internal.client.af$a$a */
        /* loaded from: classes2.dex */
        private static class C3519a implements AbstractC3517af {

            /* renamed from: a */
            private IBinder f13942a;

            C3519a(IBinder iBinder) {
                this.f13942a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3517af
            /* renamed from: a */
            public void mo13241a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdClickListener");
                    this.f13942a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13942a;
            }
        }

        public AbstractBinderC3518a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
        }

        /* renamed from: a */
        public static AbstractC3517af m27577a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3517af)) ? new C3519a(iBinder) : (AbstractC3517af) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo13241a();
}
