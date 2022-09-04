package com.google.android.gms.ads.internal.cache;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.ads.internal.cache.f */
/* loaded from: classes2.dex */
public interface AbstractC3497f extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.cache.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3498a extends Binder implements AbstractC3497f {

        /* renamed from: com.google.android.gms.ads.internal.cache.f$a$a */
        /* loaded from: classes2.dex */
        private static class C3499a implements AbstractC3497f {

            /* renamed from: a */
            private IBinder f13844a;

            C3499a(IBinder iBinder) {
                this.f13844a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.cache.AbstractC3497f
            /* renamed from: a */
            public CacheEntryParcel mo27642a(CacheOffering cacheOffering) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.cache.ICacheService");
                    if (cacheOffering != null) {
                        obtain.writeInt(1);
                        cacheOffering.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13844a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CacheEntryParcel) CacheEntryParcel.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13844a;
            }
        }

        /* renamed from: a */
        public static AbstractC3497f m27643a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3497f)) ? new C3499a(iBinder) : (AbstractC3497f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                    CacheEntryParcel a = a(parcel.readInt() != 0 ? (CacheOffering) CacheOffering.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.cache.ICacheService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    CacheEntryParcel mo27642a(CacheOffering cacheOffering);
}
