package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.GetFileUriRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;
/* loaded from: classes2.dex */
public interface alf extends IInterface {

    /* renamed from: com.google.android.gms.internal.alf$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6491a extends Binder implements alf {

        /* renamed from: com.google.android.gms.internal.alf$a$a */
        /* loaded from: classes2.dex */
        private static class C6492a implements alf {

            /* renamed from: a */
            private IBinder f22160a;

            C6492a(IBinder iBinder) {
                this.f22160a = iBinder;
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16972a(DailyTotalRequest dailyTotalRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dailyTotalRequest != null) {
                        obtain.writeInt(1);
                        dailyTotalRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16971a(DataDeleteRequest dataDeleteRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataDeleteRequest != null) {
                        obtain.writeInt(1);
                        dataDeleteRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16970a(DataInsertRequest dataInsertRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataInsertRequest != null) {
                        obtain.writeInt(1);
                        dataInsertRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16969a(DataReadRequest dataReadRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataReadRequest != null) {
                        obtain.writeInt(1);
                        dataReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16968a(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataUpdateListenerRegistrationRequest != null) {
                        obtain.writeInt(1);
                        dataUpdateListenerRegistrationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16967a(DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataUpdateListenerUnregistrationRequest != null) {
                        obtain.writeInt(1);
                        dataUpdateListenerUnregistrationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16966a(DataUpdateRequest dataUpdateRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataUpdateRequest != null) {
                        obtain.writeInt(1);
                        dataUpdateRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16965a(GetFileUriRequest getFileUriRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (getFileUriRequest != null) {
                        obtain.writeInt(1);
                        getFileUriRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16964a(GetSyncInfoRequest getSyncInfoRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (getSyncInfoRequest != null) {
                        obtain.writeInt(1);
                        getSyncInfoRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16963a(ReadRawRequest readRawRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (readRawRequest != null) {
                        obtain.writeInt(1);
                        readRawRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: a */
            public void mo16962a(ReadStatsRequest readStatsRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (readStatsRequest != null) {
                        obtain.writeInt(1);
                        readStatsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22160a;
            }

            @Override // com.google.android.gms.internal.alf
            /* renamed from: b */
            public void mo16961b(DataInsertRequest dataInsertRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (dataInsertRequest != null) {
                        obtain.writeInt(1);
                        dataInsertRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22160a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static alf m16973a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alf)) ? new C6492a(iBinder) : (alf) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            GetFileUriRequest getFileUriRequest = null;
            DataReadRequest dataReadRequest = null;
            DataInsertRequest dataInsertRequest = null;
            DataDeleteRequest dataDeleteRequest = null;
            GetSyncInfoRequest getSyncInfoRequest = null;
            ReadStatsRequest readStatsRequest = null;
            ReadRawRequest readRawRequest = null;
            DailyTotalRequest dailyTotalRequest = null;
            DataInsertRequest dataInsertRequest2 = null;
            DataUpdateRequest dataUpdateRequest = null;
            DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = null;
            DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dataReadRequest = DataReadRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataReadRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dataInsertRequest = DataInsertRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataInsertRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dataDeleteRequest = DataDeleteRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataDeleteRequest);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        getSyncInfoRequest = GetSyncInfoRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getSyncInfoRequest);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        readStatsRequest = ReadStatsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(readStatsRequest);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        readRawRequest = ReadRawRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(readRawRequest);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dailyTotalRequest = DailyTotalRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dailyTotalRequest);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dataInsertRequest2 = DataInsertRequest.CREATOR.createFromParcel(parcel);
                    }
                    b(dataInsertRequest2);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dataUpdateRequest = DataUpdateRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataUpdateRequest);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dataUpdateListenerRegistrationRequest = DataUpdateListenerRegistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataUpdateListenerRegistrationRequest);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        dataUpdateListenerUnregistrationRequest = DataUpdateListenerUnregistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(dataUpdateListenerUnregistrationRequest);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if (parcel.readInt() != 0) {
                        getFileUriRequest = GetFileUriRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getFileUriRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16972a(DailyTotalRequest dailyTotalRequest);

    /* renamed from: a */
    void mo16971a(DataDeleteRequest dataDeleteRequest);

    /* renamed from: a */
    void mo16970a(DataInsertRequest dataInsertRequest);

    /* renamed from: a */
    void mo16969a(DataReadRequest dataReadRequest);

    /* renamed from: a */
    void mo16968a(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest);

    /* renamed from: a */
    void mo16967a(DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest);

    /* renamed from: a */
    void mo16966a(DataUpdateRequest dataUpdateRequest);

    /* renamed from: a */
    void mo16965a(GetFileUriRequest getFileUriRequest);

    /* renamed from: a */
    void mo16964a(GetSyncInfoRequest getSyncInfoRequest);

    /* renamed from: a */
    void mo16963a(ReadRawRequest readRawRequest);

    /* renamed from: a */
    void mo16962a(ReadStatsRequest readStatsRequest);

    /* renamed from: b */
    void mo16961b(DataInsertRequest dataInsertRequest);
}
