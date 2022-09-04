package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.internal.yr */
/* loaded from: classes2.dex */
public interface AbstractC8069yr extends IInterface {

    /* renamed from: com.google.android.gms.internal.yr$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8070a extends Binder implements AbstractC8069yr {

        /* renamed from: com.google.android.gms.internal.yr$a$a */
        /* loaded from: classes2.dex */
        private static class C8071a implements AbstractC8069yr {

            /* renamed from: a */
            private IBinder f26429a;

            C8071a(IBinder iBinder) {
                this.f26429a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8069yr
            /* renamed from: a */
            public IBinder mo12860a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f26429a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26429a;
            }
        }

        /* renamed from: a */
        public static AbstractC8069yr m12861a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8069yr)) ? new C8071a(iBinder) : (AbstractC8069yr) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    IBinder a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo12860a(AbstractC4170e abstractC4170e);
}
