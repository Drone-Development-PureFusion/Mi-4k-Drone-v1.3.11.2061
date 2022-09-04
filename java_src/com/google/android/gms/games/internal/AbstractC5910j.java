package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.games.internal.j */
/* loaded from: classes2.dex */
public interface AbstractC5910j extends IInterface {

    /* renamed from: com.google.android.gms.games.internal.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5911a extends Binder implements AbstractC5910j {

        /* renamed from: com.google.android.gms.games.internal.j$a$a */
        /* loaded from: classes2.dex */
        private static class C5912a implements AbstractC5910j {

            /* renamed from: a */
            private IBinder f20061a;

            C5912a(IBinder iBinder) {
                this.f20061a = iBinder;
            }

            @Override // com.google.android.gms.games.internal.AbstractC5910j
            /* renamed from: a */
            public PopupLocationInfoParcelable mo19829a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesClient");
                    this.f20061a.transact(1001, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PopupLocationInfoParcelable) PopupLocationInfoParcelable.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20061a;
            }
        }

        public AbstractBinderC5911a() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesClient");
        }

        /* renamed from: a */
        public static AbstractC5910j m19830a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesClient");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5910j)) ? new C5912a(iBinder) : (AbstractC5910j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesClient");
                    PopupLocationInfoParcelable a = a();
                    parcel2.writeNoException();
                    if (a == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.games.internal.IGamesClient");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    PopupLocationInfoParcelable mo19829a();
}
