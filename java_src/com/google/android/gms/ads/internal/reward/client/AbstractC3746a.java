package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.ads.internal.reward.client.a */
/* loaded from: classes2.dex */
public interface AbstractC3746a extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.reward.client.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3747a extends Binder implements AbstractC3746a {

        /* renamed from: com.google.android.gms.ads.internal.reward.client.a$a$a */
        /* loaded from: classes2.dex */
        private static class C3748a implements AbstractC3746a {

            /* renamed from: a */
            private IBinder f14663a;

            C3748a(IBinder iBinder) {
                this.f14663a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3746a
            /* renamed from: a */
            public String mo18594a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    this.f14663a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14663a;
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3746a
            /* renamed from: b */
            public int mo18593b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    this.f14663a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC3747a() {
            attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
        }

        /* renamed from: a */
        public static AbstractC3746a m26975a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3746a)) ? new C3748a(iBinder) : (AbstractC3746a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    int b = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo18594a();

    /* renamed from: b */
    int mo18593b();
}
