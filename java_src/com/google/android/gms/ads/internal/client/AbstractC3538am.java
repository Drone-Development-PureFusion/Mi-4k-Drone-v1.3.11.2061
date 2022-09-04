package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.ads.internal.client.am */
/* loaded from: classes2.dex */
public interface AbstractC3538am extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.am$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3539a extends Binder implements AbstractC3538am {

        /* renamed from: com.google.android.gms.ads.internal.client.am$a$a */
        /* loaded from: classes2.dex */
        private static class C3540a implements AbstractC3538am {

            /* renamed from: a */
            private IBinder f13949a;

            C3540a(IBinder iBinder) {
                this.f13949a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3538am
            /* renamed from: a */
            public void mo13243a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f13949a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13949a;
            }
        }

        public AbstractBinderC3539a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
        }

        /* renamed from: a */
        public static AbstractC3538am m27567a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3538am)) ? new C3540a(iBinder) : (AbstractC3538am) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo13243a(String str, String str2);
}
