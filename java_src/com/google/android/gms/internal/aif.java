package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public interface aif extends IInterface {

    /* renamed from: com.google.android.gms.internal.aif$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6380a extends Binder implements aif {

        /* renamed from: com.google.android.gms.internal.aif$a$a */
        /* loaded from: classes2.dex */
        private static class C6381a implements aif {

            /* renamed from: a */
            private IBinder f21936a;

            C6381a(IBinder iBinder) {
                this.f21936a = iBinder;
            }

            @Override // com.google.android.gms.internal.aif
            /* renamed from: a */
            public void mo7430a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21936a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21936a;
            }
        }

        public AbstractBinderC6380a() {
            attachInterface(this, "com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* renamed from: a */
        public static aif m17244a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aif)) ? new C6381a(iBinder) : (aif) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.api.internal.IStatusCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo7430a(Status status);
}
