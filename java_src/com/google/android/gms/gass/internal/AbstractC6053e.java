package com.google.android.gms.gass.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.gass.internal.e */
/* loaded from: classes2.dex */
public interface AbstractC6053e extends IInterface {

    /* renamed from: com.google.android.gms.gass.internal.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6054a extends Binder implements AbstractC6053e {

        /* renamed from: com.google.android.gms.gass.internal.e$a$a */
        /* loaded from: classes2.dex */
        private static class C6055a implements AbstractC6053e {

            /* renamed from: a */
            private IBinder f20481a;

            C6055a(IBinder iBinder) {
                this.f20481a = iBinder;
            }

            @Override // com.google.android.gms.gass.internal.AbstractC6053e
            /* renamed from: a */
            public GassResponseParcel mo18943a(GassRequestParcel gassRequestParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.gass.internal.IGassService");
                    if (gassRequestParcel != null) {
                        obtain.writeInt(1);
                        gassRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20481a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? GassResponseParcel.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20481a;
            }
        }

        /* renamed from: a */
        public static AbstractC6053e m18944a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6053e)) ? new C6055a(iBinder) : (AbstractC6053e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.gass.internal.IGassService");
                    GassResponseParcel a = a(parcel.readInt() != 0 ? GassRequestParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.gass.internal.IGassService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    GassResponseParcel mo18943a(GassRequestParcel gassRequestParcel);
}
