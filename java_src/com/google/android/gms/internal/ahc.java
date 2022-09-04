package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public interface ahc extends IInterface {

    /* renamed from: com.google.android.gms.internal.ahc$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6331a extends Binder implements ahc {

        /* renamed from: com.google.android.gms.internal.ahc$a$a */
        /* loaded from: classes2.dex */
        private static class C6332a implements ahc {

            /* renamed from: a */
            private IBinder f21707a;

            C6332a(IBinder iBinder) {
                this.f21707a = iBinder;
            }

            @Override // com.google.android.gms.internal.ahc
            /* renamed from: a */
            public void mo17507a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21707a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21707a;
            }
        }

        public AbstractBinderC6331a() {
            attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        }

        /* renamed from: a */
        public static ahc m17508a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ahc)) ? new C6332a(iBinder) : (ahc) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17507a(Status status);
}
