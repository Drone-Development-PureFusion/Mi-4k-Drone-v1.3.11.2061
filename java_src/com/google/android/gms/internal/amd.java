package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.BleDevicesResult;
/* loaded from: classes2.dex */
public interface amd extends IInterface {

    /* renamed from: com.google.android.gms.internal.amd$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6558a extends Binder implements amd {

        /* renamed from: com.google.android.gms.internal.amd$a$a */
        /* loaded from: classes2.dex */
        private static class C6559a implements amd {

            /* renamed from: a */
            private IBinder f22258a;

            C6559a(IBinder iBinder) {
                this.f22258a = iBinder;
            }

            @Override // com.google.android.gms.internal.amd
            /* renamed from: a */
            public void mo16835a(BleDevicesResult bleDevicesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
                    if (bleDevicesResult != null) {
                        obtain.writeInt(1);
                        bleDevicesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22258a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22258a;
            }
        }

        public AbstractBinderC6558a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
        }

        /* renamed from: a */
        public static amd m16836a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof amd)) ? new C6559a(iBinder) : (amd) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
                    a(parcel.readInt() != 0 ? BleDevicesResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16835a(BleDevicesResult bleDevicesResult);
}
