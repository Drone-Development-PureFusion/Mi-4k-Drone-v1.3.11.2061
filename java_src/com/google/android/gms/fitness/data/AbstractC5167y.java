package com.google.android.gms.fitness.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.fitness.data.y */
/* loaded from: classes2.dex */
public interface AbstractC5167y extends IInterface {

    /* renamed from: com.google.android.gms.fitness.data.y$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5168a extends Binder implements AbstractC5167y {

        /* renamed from: com.google.android.gms.fitness.data.y$a$a */
        /* loaded from: classes2.dex */
        private static class C5169a implements AbstractC5167y {

            /* renamed from: a */
            private IBinder f18802a;

            C5169a(IBinder iBinder) {
                this.f18802a = iBinder;
            }

            @Override // com.google.android.gms.fitness.data.AbstractC5167y
            /* renamed from: a */
            public void mo21081a(DataPoint dataPoint) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.data.IDataSourceListener");
                    if (dataPoint != null) {
                        obtain.writeInt(1);
                        dataPoint.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18802a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18802a;
            }
        }

        public AbstractBinderC5168a() {
            attachInterface(this, "com.google.android.gms.fitness.data.IDataSourceListener");
        }

        /* renamed from: a */
        public static AbstractC5167y m21419a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5167y)) ? new C5169a(iBinder) : (AbstractC5167y) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.data.IDataSourceListener");
                    a(parcel.readInt() != 0 ? DataPoint.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.data.IDataSourceListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21081a(DataPoint dataPoint);
}
