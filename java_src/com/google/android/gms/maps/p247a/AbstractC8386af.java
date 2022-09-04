package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8585d;
/* renamed from: com.google.android.gms.maps.a.af */
/* loaded from: classes2.dex */
public interface AbstractC8386af extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.af$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8387a extends Binder implements AbstractC8386af {

        /* renamed from: com.google.android.gms.maps.a.af$a$a */
        /* loaded from: classes2.dex */
        private static class C8388a implements AbstractC8386af {

            /* renamed from: a */
            private IBinder f27318a;

            C8388a(IBinder iBinder) {
                this.f27318a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8386af
            /* renamed from: a */
            public void mo11531a(AbstractC8585d abstractC8585d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                    obtain.writeStrongBinder(abstractC8585d != null ? abstractC8585d.asBinder() : null);
                    this.f27318a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27318a;
            }
        }

        public AbstractBinderC8387a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
        }

        /* renamed from: a */
        public static AbstractC8386af m11854a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8386af)) ? new C8388a(iBinder) : (AbstractC8386af) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                    a(AbstractC8585d.AbstractBinderC8586a.m11207a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11531a(AbstractC8585d abstractC8585d);
}
