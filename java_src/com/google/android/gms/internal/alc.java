package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
/* loaded from: classes2.dex */
public interface alc extends IInterface {

    /* renamed from: com.google.android.gms.internal.alc$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6485a extends Binder implements alc {

        /* renamed from: com.google.android.gms.internal.alc$a$a */
        /* loaded from: classes2.dex */
        private static class C6486a implements alc {

            /* renamed from: a */
            private IBinder f22157a;

            C6486a(IBinder iBinder) {
                this.f22157a = iBinder;
            }

            @Override // com.google.android.gms.internal.alc
            /* renamed from: a */
            public void mo16984a(ClaimBleDeviceRequest claimBleDeviceRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (claimBleDeviceRequest != null) {
                        obtain.writeInt(1);
                        claimBleDeviceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22157a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alc
            /* renamed from: a */
            public void mo16983a(ListClaimedBleDevicesRequest listClaimedBleDevicesRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (listClaimedBleDevicesRequest != null) {
                        obtain.writeInt(1);
                        listClaimedBleDevicesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22157a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alc
            /* renamed from: a */
            public void mo16982a(StartBleScanRequest startBleScanRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (startBleScanRequest != null) {
                        obtain.writeInt(1);
                        startBleScanRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22157a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alc
            /* renamed from: a */
            public void mo16981a(StopBleScanRequest stopBleScanRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (stopBleScanRequest != null) {
                        obtain.writeInt(1);
                        stopBleScanRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22157a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alc
            /* renamed from: a */
            public void mo16980a(UnclaimBleDeviceRequest unclaimBleDeviceRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (unclaimBleDeviceRequest != null) {
                        obtain.writeInt(1);
                        unclaimBleDeviceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22157a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22157a;
            }
        }

        /* renamed from: a */
        public static alc m16985a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alc)) ? new C6486a(iBinder) : (alc) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ListClaimedBleDevicesRequest listClaimedBleDevicesRequest = null;
            StartBleScanRequest startBleScanRequest = null;
            StopBleScanRequest stopBleScanRequest = null;
            ClaimBleDeviceRequest claimBleDeviceRequest = null;
            UnclaimBleDeviceRequest unclaimBleDeviceRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (parcel.readInt() != 0) {
                        startBleScanRequest = StartBleScanRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(startBleScanRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (parcel.readInt() != 0) {
                        stopBleScanRequest = StopBleScanRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(stopBleScanRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (parcel.readInt() != 0) {
                        claimBleDeviceRequest = ClaimBleDeviceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(claimBleDeviceRequest);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (parcel.readInt() != 0) {
                        unclaimBleDeviceRequest = UnclaimBleDeviceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unclaimBleDeviceRequest);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if (parcel.readInt() != 0) {
                        listClaimedBleDevicesRequest = ListClaimedBleDevicesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(listClaimedBleDevicesRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16984a(ClaimBleDeviceRequest claimBleDeviceRequest);

    /* renamed from: a */
    void mo16983a(ListClaimedBleDevicesRequest listClaimedBleDevicesRequest);

    /* renamed from: a */
    void mo16982a(StartBleScanRequest startBleScanRequest);

    /* renamed from: a */
    void mo16981a(StopBleScanRequest stopBleScanRequest);

    /* renamed from: a */
    void mo16980a(UnclaimBleDeviceRequest unclaimBleDeviceRequest);
}
