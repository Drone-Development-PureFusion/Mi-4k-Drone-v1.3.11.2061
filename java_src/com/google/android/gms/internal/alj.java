package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
/* loaded from: classes2.dex */
public interface alj extends IInterface {

    /* renamed from: com.google.android.gms.internal.alj$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6498a extends Binder implements alj {

        /* renamed from: com.google.android.gms.internal.alj$a$a */
        /* loaded from: classes2.dex */
        private static class C6499a implements alj {

            /* renamed from: a */
            private IBinder f22168a;

            C6499a(IBinder iBinder) {
                this.f22168a = iBinder;
            }

            @Override // com.google.android.gms.internal.alj
            /* renamed from: a */
            public void mo16949a(DataSourcesRequest dataSourcesRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if (dataSourcesRequest != null) {
                        obtain.writeInt(1);
                        dataSourcesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22168a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alj
            /* renamed from: a */
            public void mo16948a(SensorRegistrationRequest sensorRegistrationRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if (sensorRegistrationRequest != null) {
                        obtain.writeInt(1);
                        sensorRegistrationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22168a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alj
            /* renamed from: a */
            public void mo16947a(SensorUnregistrationRequest sensorUnregistrationRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if (sensorUnregistrationRequest != null) {
                        obtain.writeInt(1);
                        sensorUnregistrationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22168a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22168a;
            }
        }

        /* renamed from: a */
        public static alj m16950a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alj)) ? new C6499a(iBinder) : (alj) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            SensorUnregistrationRequest sensorUnregistrationRequest = null;
            DataSourcesRequest dataSourcesRequest = null;
            SensorRegistrationRequest sensorRegistrationRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if (parcel.readInt() != 0) {
                        dataSourcesRequest = DataSourcesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataSourcesRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if (parcel.readInt() != 0) {
                        sensorRegistrationRequest = SensorRegistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sensorRegistrationRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if (parcel.readInt() != 0) {
                        sensorUnregistrationRequest = SensorUnregistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sensorUnregistrationRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16949a(DataSourcesRequest dataSourcesRequest);

    /* renamed from: a */
    void mo16948a(SensorRegistrationRequest sensorRegistrationRequest);

    /* renamed from: a */
    void mo16947a(SensorUnregistrationRequest sensorUnregistrationRequest);
}
