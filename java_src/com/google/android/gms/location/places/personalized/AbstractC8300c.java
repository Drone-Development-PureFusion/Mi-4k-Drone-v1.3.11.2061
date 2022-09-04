package com.google.android.gms.location.places.personalized;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.location.places.personalized.c */
/* loaded from: classes2.dex */
public interface AbstractC8300c extends IInterface {

    /* renamed from: com.google.android.gms.location.places.personalized.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8301a extends Binder implements AbstractC8300c {

        /* renamed from: com.google.android.gms.location.places.personalized.c$a$a */
        /* loaded from: classes2.dex */
        private static class C8302a implements AbstractC8300c {

            /* renamed from: a */
            private IBinder f27187a;

            C8302a(IBinder iBinder) {
                this.f27187a = iBinder;
            }

            @Override // com.google.android.gms.location.places.personalized.AbstractC8300c
            /* renamed from: a */
            public void mo12122a(AliasedPlacesResult aliasedPlacesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (aliasedPlacesResult != null) {
                        obtain.writeInt(1);
                        aliasedPlacesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27187a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27187a;
            }

            @Override // com.google.android.gms.location.places.personalized.AbstractC8300c
            /* renamed from: b */
            public void mo12121b(AliasedPlacesResult aliasedPlacesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (aliasedPlacesResult != null) {
                        obtain.writeInt(1);
                        aliasedPlacesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27187a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.personalized.AbstractC8300c
            /* renamed from: c */
            public void mo12120c(AliasedPlacesResult aliasedPlacesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (aliasedPlacesResult != null) {
                        obtain.writeInt(1);
                        aliasedPlacesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27187a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8300c m12123a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8300c)) ? new C8302a(iBinder) : (AbstractC8300c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AliasedPlacesResult aliasedPlacesResult = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        aliasedPlacesResult = AliasedPlacesResult.CREATOR.createFromParcel(parcel);
                    }
                    a(aliasedPlacesResult);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        aliasedPlacesResult = AliasedPlacesResult.CREATOR.createFromParcel(parcel);
                    }
                    b(aliasedPlacesResult);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        aliasedPlacesResult = AliasedPlacesResult.CREATOR.createFromParcel(parcel);
                    }
                    c(aliasedPlacesResult);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12122a(AliasedPlacesResult aliasedPlacesResult);

    /* renamed from: b */
    void mo12121b(AliasedPlacesResult aliasedPlacesResult);

    /* renamed from: c */
    void mo12120c(AliasedPlacesResult aliasedPlacesResult);
}
