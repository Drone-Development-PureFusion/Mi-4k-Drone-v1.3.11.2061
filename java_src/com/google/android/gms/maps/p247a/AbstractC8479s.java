package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.p247a.AbstractC8449g;
/* renamed from: com.google.android.gms.maps.a.s */
/* loaded from: classes2.dex */
public interface AbstractC8479s extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.s$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8480a extends Binder implements AbstractC8479s {

        /* renamed from: com.google.android.gms.maps.a.s$a$a */
        /* loaded from: classes2.dex */
        private static class C8481a implements AbstractC8479s {

            /* renamed from: a */
            private IBinder f27348a;

            C8481a(IBinder iBinder) {
                this.f27348a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8479s
            /* renamed from: a */
            public void mo11649a(AbstractC8449g abstractC8449g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    obtain.writeStrongBinder(abstractC8449g != null ? abstractC8449g.asBinder() : null);
                    this.f27348a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27348a;
            }
        }

        public AbstractBinderC8480a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        /* renamed from: a */
        public static AbstractC8479s m11650a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8479s)) ? new C8481a(iBinder) : (AbstractC8479s) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    a(AbstractC8449g.AbstractBinderC8450a.m11723a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11649a(AbstractC8449g abstractC8449g);
}
