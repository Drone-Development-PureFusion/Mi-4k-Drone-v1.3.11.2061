package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.ad */
/* loaded from: classes2.dex */
public interface AbstractC8380ad extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ad$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8381a extends Binder implements AbstractC8380ad {

        /* renamed from: com.google.android.gms.maps.a.ad$a$a */
        /* loaded from: classes2.dex */
        private static class C8382a implements AbstractC8380ad {

            /* renamed from: a */
            private IBinder f27316a;

            C8382a(IBinder iBinder) {
                this.f27316a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8380ad
            /* renamed from: a */
            public void mo11549a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
                    obtain.writeInt(i);
                    this.f27316a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27316a;
            }
        }

        public AbstractBinderC8381a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        }

        /* renamed from: a */
        public static AbstractC8380ad m11856a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8380ad)) ? new C8382a(iBinder) : (AbstractC8380ad) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11549a(int i);
}
