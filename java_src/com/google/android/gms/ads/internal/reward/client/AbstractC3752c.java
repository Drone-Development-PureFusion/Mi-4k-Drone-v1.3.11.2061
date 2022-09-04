package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.reward.client.c */
/* loaded from: classes2.dex */
public interface AbstractC3752c extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.reward.client.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3753a extends Binder implements AbstractC3752c {

        /* renamed from: com.google.android.gms.ads.internal.reward.client.c$a$a */
        /* loaded from: classes2.dex */
        private static class C3754a implements AbstractC3752c {

            /* renamed from: a */
            private IBinder f14665a;

            C3754a(IBinder iBinder) {
                this.f14665a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3752c
            /* renamed from: a */
            public IBinder mo26972a(AbstractC4170e abstractC4170e, AbstractC8005xq abstractC8005xq, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC8005xq != null) {
                        iBinder = abstractC8005xq.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f14665a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14665a;
            }
        }

        /* renamed from: a */
        public static AbstractC3752c m26973a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3752c)) ? new C3754a(iBinder) : (AbstractC3752c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    IBinder a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo26972a(AbstractC4170e abstractC4170e, AbstractC8005xq abstractC8005xq, int i);
}
