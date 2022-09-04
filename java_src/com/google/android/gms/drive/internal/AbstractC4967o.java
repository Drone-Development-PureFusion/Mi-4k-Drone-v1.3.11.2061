package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.AbstractC5095m;
/* renamed from: com.google.android.gms.drive.internal.o */
/* loaded from: classes2.dex */
public interface AbstractC4967o extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.o$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4968a extends Binder implements AbstractC4967o {

        /* renamed from: com.google.android.gms.drive.internal.o$a$a */
        /* loaded from: classes2.dex */
        private static class C4969a implements AbstractC4967o {

            /* renamed from: a */
            private IBinder f17955a;

            C4969a(IBinder iBinder) {
                this.f17955a = iBinder;
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22276a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    this.f17955a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22275a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22274a(ChangeSequenceNumber changeSequenceNumber) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (changeSequenceNumber != null) {
                        obtain.writeInt(1);
                        changeSequenceNumber.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22273a(GetPermissionsResponse getPermissionsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (getPermissionsResponse != null) {
                        obtain.writeInt(1);
                        getPermissionsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22272a(OnChangesResponse onChangesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onChangesResponse != null) {
                        obtain.writeInt(1);
                        onChangesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22271a(OnContentsResponse onContentsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onContentsResponse != null) {
                        obtain.writeInt(1);
                        onContentsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22270a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDeviceUsagePreferenceResponse != null) {
                        obtain.writeInt(1);
                        onDeviceUsagePreferenceResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22269a(OnDownloadProgressResponse onDownloadProgressResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDownloadProgressResponse != null) {
                        obtain.writeInt(1);
                        onDownloadProgressResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22268a(OnDriveIdResponse onDriveIdResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDriveIdResponse != null) {
                        obtain.writeInt(1);
                        onDriveIdResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22267a(OnFetchThumbnailResponse onFetchThumbnailResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onFetchThumbnailResponse != null) {
                        obtain.writeInt(1);
                        onFetchThumbnailResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22266a(OnListEntriesResponse onListEntriesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onListEntriesResponse != null) {
                        obtain.writeInt(1);
                        onListEntriesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22265a(OnListParentsResponse onListParentsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onListParentsResponse != null) {
                        obtain.writeInt(1);
                        onListParentsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22264a(OnLoadRealtimeResponse onLoadRealtimeResponse, AbstractC5095m abstractC5095m) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onLoadRealtimeResponse != null) {
                        obtain.writeInt(1);
                        onLoadRealtimeResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5095m != null ? abstractC5095m.asBinder() : null);
                    this.f17955a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22263a(OnMetadataResponse onMetadataResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onMetadataResponse != null) {
                        obtain.writeInt(1);
                        onMetadataResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22262a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onPinnedDownloadPreferencesResponse != null) {
                        obtain.writeInt(1);
                        onPinnedDownloadPreferencesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22261a(OnResourceIdSetResponse onResourceIdSetResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onResourceIdSetResponse != null) {
                        obtain.writeInt(1);
                        onResourceIdSetResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22260a(OnStartStreamSession onStartStreamSession) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onStartStreamSession != null) {
                        obtain.writeInt(1);
                        onStartStreamSession.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22259a(OnSyncMoreResponse onSyncMoreResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onSyncMoreResponse != null) {
                        obtain.writeInt(1);
                        onSyncMoreResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22258a(StringListResponse stringListResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (stringListResponse != null) {
                        obtain.writeInt(1);
                        stringListResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17955a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4967o
            /* renamed from: a */
            public void mo22257a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f17955a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17955a;
            }
        }

        public AbstractBinderC4968a() {
            attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        }

        /* renamed from: a */
        public static AbstractC4967o m22277a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4967o)) ? new C4969a(iBinder) : (AbstractC4967o) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            OnStartStreamSession onStartStreamSession = null;
            OnDownloadProgressResponse onDownloadProgressResponse = null;
            OnListEntriesResponse onListEntriesResponse = null;
            OnDriveIdResponse onDriveIdResponse = null;
            OnMetadataResponse onMetadataResponse = null;
            OnContentsResponse onContentsResponse = null;
            Status status = null;
            OnListParentsResponse onListParentsResponse = null;
            OnSyncMoreResponse onSyncMoreResponse = null;
            OnLoadRealtimeResponse onLoadRealtimeResponse = null;
            OnResourceIdSetResponse onResourceIdSetResponse = null;
            OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse = null;
            OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse = null;
            OnFetchThumbnailResponse onFetchThumbnailResponse = null;
            ChangeSequenceNumber changeSequenceNumber = null;
            OnChangesResponse onChangesResponse = null;
            GetPermissionsResponse getPermissionsResponse = null;
            StringListResponse stringListResponse = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onDownloadProgressResponse = OnDownloadProgressResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onDownloadProgressResponse);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onListEntriesResponse = OnListEntriesResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onListEntriesResponse);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onDriveIdResponse = OnDriveIdResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onDriveIdResponse);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onMetadataResponse = OnMetadataResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onMetadataResponse);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onContentsResponse = OnContentsResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onContentsResponse);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        status = Status.CREATOR.createFromParcel(parcel);
                    }
                    a(status);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onListParentsResponse = OnListParentsResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onListParentsResponse);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onSyncMoreResponse = OnSyncMoreResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onSyncMoreResponse);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onLoadRealtimeResponse = OnLoadRealtimeResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onLoadRealtimeResponse, AbstractC5095m.AbstractBinderC5096a.m21876a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onResourceIdSetResponse = OnResourceIdSetResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onResourceIdSetResponse);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onPinnedDownloadPreferencesResponse = OnPinnedDownloadPreferencesResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onPinnedDownloadPreferencesResponse);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onDeviceUsagePreferenceResponse = OnDeviceUsagePreferenceResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onDeviceUsagePreferenceResponse);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onFetchThumbnailResponse = OnFetchThumbnailResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onFetchThumbnailResponse);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        changeSequenceNumber = ChangeSequenceNumber.CREATOR.createFromParcel(parcel);
                    }
                    a(changeSequenceNumber);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onChangesResponse = OnChangesResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(onChangesResponse);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        getPermissionsResponse = GetPermissionsResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getPermissionsResponse);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        stringListResponse = StringListResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(stringListResponse);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onStartStreamSession = OnStartStreamSession.CREATOR.createFromParcel(parcel);
                    }
                    a(onStartStreamSession);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo22276a();

    /* renamed from: a */
    void mo22275a(Status status);

    /* renamed from: a */
    void mo22274a(ChangeSequenceNumber changeSequenceNumber);

    /* renamed from: a */
    void mo22273a(GetPermissionsResponse getPermissionsResponse);

    /* renamed from: a */
    void mo22272a(OnChangesResponse onChangesResponse);

    /* renamed from: a */
    void mo22271a(OnContentsResponse onContentsResponse);

    /* renamed from: a */
    void mo22270a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse);

    /* renamed from: a */
    void mo22269a(OnDownloadProgressResponse onDownloadProgressResponse);

    /* renamed from: a */
    void mo22268a(OnDriveIdResponse onDriveIdResponse);

    /* renamed from: a */
    void mo22267a(OnFetchThumbnailResponse onFetchThumbnailResponse);

    /* renamed from: a */
    void mo22266a(OnListEntriesResponse onListEntriesResponse);

    /* renamed from: a */
    void mo22265a(OnListParentsResponse onListParentsResponse);

    /* renamed from: a */
    void mo22264a(OnLoadRealtimeResponse onLoadRealtimeResponse, AbstractC5095m abstractC5095m);

    /* renamed from: a */
    void mo22263a(OnMetadataResponse onMetadataResponse);

    /* renamed from: a */
    void mo22262a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse);

    /* renamed from: a */
    void mo22261a(OnResourceIdSetResponse onResourceIdSetResponse);

    /* renamed from: a */
    void mo22260a(OnStartStreamSession onStartStreamSession);

    /* renamed from: a */
    void mo22259a(OnSyncMoreResponse onSyncMoreResponse);

    /* renamed from: a */
    void mo22258a(StringListResponse stringListResponse);

    /* renamed from: a */
    void mo22257a(boolean z);
}
