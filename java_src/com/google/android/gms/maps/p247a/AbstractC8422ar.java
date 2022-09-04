package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.ar */
/* loaded from: classes2.dex */
public interface AbstractC8422ar extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ar$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8423a extends Binder implements AbstractC8422ar {

        /* renamed from: com.google.android.gms.maps.a.ar$a$a */
        /* loaded from: classes2.dex */
        private static class C8424a implements AbstractC8422ar {

            /* renamed from: a */
            private IBinder f27330a;

            C8424a(IBinder iBinder) {
                this.f27330a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8422ar
            /* renamed from: a */
            public boolean mo11532a() {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    this.f27330a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27330a;
            }
        }

        public AbstractBinderC8423a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        }

        /* renamed from: a */
        public static AbstractC8422ar m11839a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8422ar)) ? new C8424a(iBinder) : (AbstractC8422ar) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    boolean a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    boolean mo11532a();
}
