package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DailyTotalResult;
/* loaded from: classes2.dex */
public interface akw extends IInterface {

    /* renamed from: com.google.android.gms.internal.akw$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6472a extends Binder implements akw {

        /* renamed from: com.google.android.gms.internal.akw$a$a */
        /* loaded from: classes2.dex */
        private static class C6473a implements akw {

            /* renamed from: a */
            private IBinder f22151a;

            C6473a(IBinder iBinder) {
                this.f22151a = iBinder;
            }

            @Override // com.google.android.gms.internal.akw
            /* renamed from: a */
            public void mo16894a(DailyTotalResult dailyTotalResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IDailyTotalCallback");
                    if (dailyTotalResult != null) {
                        obtain.writeInt(1);
                        dailyTotalResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22151a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22151a;
            }
        }

        public AbstractBinderC6472a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDailyTotalCallback");
        }

        /* renamed from: a */
        public static akw m16993a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof akw)) ? new C6473a(iBinder) : (akw) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
                    a(parcel.readInt() != 0 ? DailyTotalResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IDailyTotalCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16894a(DailyTotalResult dailyTotalResult);
}
