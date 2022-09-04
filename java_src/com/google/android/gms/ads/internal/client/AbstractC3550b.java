package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.client.b */
/* loaded from: classes2.dex */
public interface AbstractC3550b extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.b$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3551a extends Binder implements AbstractC3550b {

        /* renamed from: com.google.android.gms.ads.internal.client.b$a$a */
        /* loaded from: classes2.dex */
        private static class C3552a implements AbstractC3550b {

            /* renamed from: a */
            private IBinder f13953a;

            C3552a(IBinder iBinder) {
                this.f13953a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3550b
            /* renamed from: a */
            public IBinder mo27562a(AbstractC4170e abstractC4170e, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    this.f13953a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13953a;
            }
        }

        /* renamed from: a */
        public static AbstractC3550b m27563a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3550b)) ? new C3552a(iBinder) : (AbstractC3550b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    IBinder a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo27562a(AbstractC4170e abstractC4170e, int i);
}
