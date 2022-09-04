package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.a.w */
/* loaded from: classes2.dex */
public interface AbstractC8487w extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.w$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8488a extends Binder implements AbstractC8487w {

        /* renamed from: com.google.android.gms.maps.a.w$a$a */
        /* loaded from: classes2.dex */
        private static class C8489a implements AbstractC8487w {

            /* renamed from: a */
            private IBinder f27352a;

            C8489a(IBinder iBinder) {
                this.f27352a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8487w
            /* renamed from: a */
            public void mo11493a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
                    this.f27352a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27352a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8487w
            /* renamed from: b */
            public void mo11492b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
                    this.f27352a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8488a() {
            attachInterface(this, "com.google.android.gms.maps.internal.ICancelableCallback");
        }

        /* renamed from: a */
        public static AbstractC8487w m11638a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8487w)) ? new C8489a(iBinder) : (AbstractC8487w) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ICancelableCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11493a();

    /* renamed from: b */
    void mo11492b();
}
