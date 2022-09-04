package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.am */
/* loaded from: classes2.dex */
public interface AbstractC8407am extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.am$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8408a extends Binder implements AbstractC8407am {

        /* renamed from: com.google.android.gms.maps.a.am$a$a */
        /* loaded from: classes2.dex */
        private static class C8409a implements AbstractC8407am {

            /* renamed from: a */
            private IBinder f27325a;

            C8409a(IBinder iBinder) {
                this.f27325a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8407am
            /* renamed from: a */
            public void mo11538a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    this.f27325a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27325a;
            }
        }

        public AbstractBinderC8408a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapLoadedCallback");
        }

        /* renamed from: a */
        public static AbstractC8407am m11845a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8407am)) ? new C8409a(iBinder) : (AbstractC8407am) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11538a();
}
