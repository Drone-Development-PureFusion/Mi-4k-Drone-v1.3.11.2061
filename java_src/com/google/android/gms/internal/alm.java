package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.ReadRawResult;
/* loaded from: classes2.dex */
public interface alm extends IInterface {

    /* renamed from: com.google.android.gms.internal.alm$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6504a extends Binder implements alm {

        /* renamed from: com.google.android.gms.internal.alm$a$a */
        /* loaded from: classes2.dex */
        private static class C6505a implements alm {

            /* renamed from: a */
            private IBinder f22171a;

            C6505a(IBinder iBinder) {
                this.f22171a = iBinder;
            }

            @Override // com.google.android.gms.internal.alm
            /* renamed from: a */
            public void mo16937a(ReadRawResult readRawResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IReadRawCallback");
                    if (readRawResult != null) {
                        obtain.writeInt(1);
                        readRawResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22171a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22171a;
            }
        }

        /* renamed from: a */
        public static alm m16938a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadRawCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alm)) ? new C6505a(iBinder) : (alm) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IReadRawCallback");
                    a(parcel.readInt() != 0 ? ReadRawResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IReadRawCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16937a(ReadRawResult readRawResult);
}
