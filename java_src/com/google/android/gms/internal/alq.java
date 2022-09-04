package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public interface alq extends IInterface {

    /* renamed from: com.google.android.gms.internal.alq$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6512a extends Binder implements alq {

        /* renamed from: com.google.android.gms.internal.alq$a$a */
        /* loaded from: classes2.dex */
        private static class C6513a implements alq {

            /* renamed from: a */
            private IBinder f22175a;

            C6513a(IBinder iBinder) {
                this.f22175a = iBinder;
            }

            @Override // com.google.android.gms.internal.alq
            /* renamed from: a */
            public void mo16844a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IStatusCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22175a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22175a;
            }
        }

        public AbstractBinderC6512a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IStatusCallback");
        }

        /* renamed from: a */
        public static alq m16932a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alq)) ? new C6513a(iBinder) : (alq) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IStatusCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16844a(Status status);
}
