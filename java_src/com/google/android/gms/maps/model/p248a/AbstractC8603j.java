package com.google.android.gms.maps.model.p248a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;
/* renamed from: com.google.android.gms.maps.model.a.j */
/* loaded from: classes2.dex */
public interface AbstractC8603j extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.a.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8604a extends Binder implements AbstractC8603j {

        /* renamed from: com.google.android.gms.maps.model.a.j$a$a */
        /* loaded from: classes2.dex */
        private static class C8605a implements AbstractC8603j {

            /* renamed from: a */
            private IBinder f27563a;

            C8605a(IBinder iBinder) {
                this.f27563a = iBinder;
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8603j
            /* renamed from: a */
            public Tile mo11101a(int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f27563a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Tile) Tile.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27563a;
            }
        }

        public AbstractBinderC8604a() {
            attachInterface(this, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }

        /* renamed from: a */
        public static AbstractC8603j m11102a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8603j)) ? new C8605a(iBinder) : (AbstractC8603j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    Tile a = a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (a == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    Tile mo11101a(int i, int i2, int i3);
}
