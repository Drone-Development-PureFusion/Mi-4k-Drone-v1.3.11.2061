package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
/* loaded from: classes2.dex */
public interface ald extends IInterface {

    /* renamed from: com.google.android.gms.internal.ald$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6487a extends Binder implements ald {

        /* renamed from: com.google.android.gms.internal.ald$a$a */
        /* loaded from: classes2.dex */
        private static class C6488a implements ald {

            /* renamed from: a */
            private IBinder f22158a;

            C6488a(IBinder iBinder) {
                this.f22158a = iBinder;
            }

            @Override // com.google.android.gms.internal.ald
            /* renamed from: a */
            public void mo16978a(DataTypeCreateRequest dataTypeCreateRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (dataTypeCreateRequest != null) {
                        obtain.writeInt(1);
                        dataTypeCreateRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22158a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ald
            /* renamed from: a */
            public void mo16977a(DataTypeReadRequest dataTypeReadRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (dataTypeReadRequest != null) {
                        obtain.writeInt(1);
                        dataTypeReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22158a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ald
            /* renamed from: a */
            public void mo16976a(DisableFitRequest disableFitRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (disableFitRequest != null) {
                        obtain.writeInt(1);
                        disableFitRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22158a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22158a;
            }
        }

        /* renamed from: a */
        public static ald m16979a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ald)) ? new C6488a(iBinder) : (ald) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DisableFitRequest disableFitRequest = null;
            DataTypeCreateRequest dataTypeCreateRequest = null;
            DataTypeReadRequest dataTypeReadRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (parcel.readInt() != 0) {
                        dataTypeCreateRequest = DataTypeCreateRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataTypeCreateRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (parcel.readInt() != 0) {
                        dataTypeReadRequest = DataTypeReadRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataTypeReadRequest);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if (parcel.readInt() != 0) {
                        disableFitRequest = DisableFitRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(disableFitRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16978a(DataTypeCreateRequest dataTypeCreateRequest);

    /* renamed from: a */
    void mo16977a(DataTypeReadRequest dataTypeReadRequest);

    /* renamed from: a */
    void mo16976a(DisableFitRequest disableFitRequest);
}
