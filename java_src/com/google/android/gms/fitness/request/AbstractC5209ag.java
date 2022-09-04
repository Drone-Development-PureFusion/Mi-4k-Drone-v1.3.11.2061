package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.data.BleDevice;
/* renamed from: com.google.android.gms.fitness.request.ag */
/* loaded from: classes2.dex */
public interface AbstractC5209ag extends IInterface {

    /* renamed from: com.google.android.gms.fitness.request.ag$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5210a extends Binder implements AbstractC5209ag {

        /* renamed from: com.google.android.gms.fitness.request.ag$a$a */
        /* loaded from: classes2.dex */
        private static class C5211a implements AbstractC5209ag {

            /* renamed from: a */
            private IBinder f19053a;

            C5211a(IBinder iBinder) {
                this.f19053a = iBinder;
            }

            @Override // com.google.android.gms.fitness.request.AbstractC5209ag
            /* renamed from: a */
            public void mo21038a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
                    this.f19053a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.fitness.request.AbstractC5209ag
            /* renamed from: a */
            public void mo21037a(BleDevice bleDevice) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
                    if (bleDevice != null) {
                        obtain.writeInt(1);
                        bleDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f19053a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19053a;
            }
        }

        public AbstractBinderC5210a() {
            attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
        }

        /* renamed from: a */
        public static AbstractC5209ag m21088a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5209ag)) ? new C5211a(iBinder) : (AbstractC5209ag) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                    a(parcel.readInt() != 0 ? BleDevice.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                    a();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21038a();

    /* renamed from: a */
    void mo21037a(BleDevice bleDevice);
}
