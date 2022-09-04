package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.wearable.internal.w */
/* loaded from: classes2.dex */
public interface AbstractC9615w extends IInterface {

    /* renamed from: com.google.android.gms.wearable.internal.w$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9616a extends Binder implements AbstractC9615w {

        /* renamed from: com.google.android.gms.wearable.internal.w$a$a */
        /* loaded from: classes2.dex */
        private static class C9617a implements AbstractC9615w {

            /* renamed from: a */
            private IBinder f30144a;

            C9617a(IBinder iBinder) {
                this.f30144a = iBinder;
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7646a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7733a(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7732a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (addLocalCapabilityResponse != null) {
                        obtain.writeInt(1);
                        addLocalCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7731a(ChannelReceiveFileResponse channelReceiveFileResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (channelReceiveFileResponse != null) {
                        obtain.writeInt(1);
                        channelReceiveFileResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7730a(ChannelSendFileResponse channelSendFileResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (channelSendFileResponse != null) {
                        obtain.writeInt(1);
                        channelSendFileResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7729a(CloseChannelResponse closeChannelResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (closeChannelResponse != null) {
                        obtain.writeInt(1);
                        closeChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7728a(DeleteDataItemsResponse deleteDataItemsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (deleteDataItemsResponse != null) {
                        obtain.writeInt(1);
                        deleteDataItemsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7727a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getAllCapabilitiesResponse != null) {
                        obtain.writeInt(1);
                        getAllCapabilitiesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7726a(GetCapabilityResponse getCapabilityResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCapabilityResponse != null) {
                        obtain.writeInt(1);
                        getCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7725a(GetChannelInputStreamResponse getChannelInputStreamResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getChannelInputStreamResponse != null) {
                        obtain.writeInt(1);
                        getChannelInputStreamResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7724a(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getChannelOutputStreamResponse != null) {
                        obtain.writeInt(1);
                        getChannelOutputStreamResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7723a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncOptInOutDoneResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncOptInOutDoneResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7722a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncOptInStatusResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncOptInStatusResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7721a(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getCloudSyncSettingResponse != null) {
                        obtain.writeInt(1);
                        getCloudSyncSettingResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7720a(GetConfigResponse getConfigResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConfigResponse != null) {
                        obtain.writeInt(1);
                        getConfigResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7719a(GetConfigsResponse getConfigsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConfigsResponse != null) {
                        obtain.writeInt(1);
                        getConfigsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7718a(GetConnectedNodesResponse getConnectedNodesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getConnectedNodesResponse != null) {
                        obtain.writeInt(1);
                        getConnectedNodesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7717a(GetDataItemResponse getDataItemResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getDataItemResponse != null) {
                        obtain.writeInt(1);
                        getDataItemResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7716a(GetFdForAssetResponse getFdForAssetResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getFdForAssetResponse != null) {
                        obtain.writeInt(1);
                        getFdForAssetResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7715a(GetLocalNodeResponse getLocalNodeResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (getLocalNodeResponse != null) {
                        obtain.writeInt(1);
                        getLocalNodeResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7714a(OpenChannelResponse openChannelResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (openChannelResponse != null) {
                        obtain.writeInt(1);
                        openChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7713a(PutDataResponse putDataResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (putDataResponse != null) {
                        obtain.writeInt(1);
                        putDataResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7712a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (removeLocalCapabilityResponse != null) {
                        obtain.writeInt(1);
                        removeLocalCapabilityResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7711a(SendMessageResponse sendMessageResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (sendMessageResponse != null) {
                        obtain.writeInt(1);
                        sendMessageResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: a */
            public void mo7710a(StorageInfoResponse storageInfoResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (storageInfoResponse != null) {
                        obtain.writeInt(1);
                        storageInfoResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30144a;
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9615w
            /* renamed from: b */
            public void mo7709b(CloseChannelResponse closeChannelResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (closeChannelResponse != null) {
                        obtain.writeInt(1);
                        closeChannelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30144a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9616a() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        /* renamed from: a */
        public static AbstractC9615w m7734a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9615w)) ? new C9617a(iBinder) : (AbstractC9615w) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            RemoveLocalCapabilityResponse removeLocalCapabilityResponse = null;
            GetConfigResponse getConfigResponse = null;
            GetConfigsResponse getConfigsResponse = null;
            GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse = null;
            GetCloudSyncSettingResponse getCloudSyncSettingResponse = null;
            GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse = null;
            PutDataResponse putDataResponse = null;
            GetDataItemResponse getDataItemResponse = null;
            DataHolder dataHolder = null;
            DeleteDataItemsResponse deleteDataItemsResponse = null;
            SendMessageResponse sendMessageResponse = null;
            GetFdForAssetResponse getFdForAssetResponse = null;
            GetLocalNodeResponse getLocalNodeResponse = null;
            GetConnectedNodesResponse getConnectedNodesResponse = null;
            OpenChannelResponse openChannelResponse = null;
            CloseChannelResponse closeChannelResponse = null;
            CloseChannelResponse closeChannelResponse2 = null;
            GetChannelInputStreamResponse getChannelInputStreamResponse = null;
            GetChannelOutputStreamResponse getChannelOutputStreamResponse = null;
            ChannelReceiveFileResponse channelReceiveFileResponse = null;
            ChannelSendFileResponse channelSendFileResponse = null;
            Status status = null;
            StorageInfoResponse storageInfoResponse = null;
            GetCapabilityResponse getCapabilityResponse = null;
            GetAllCapabilitiesResponse getAllCapabilitiesResponse = null;
            AddLocalCapabilityResponse addLocalCapabilityResponse = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getConfigResponse = GetConfigResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getConfigResponse);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        putDataResponse = PutDataResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(putDataResponse);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getDataItemResponse = GetDataItemResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getDataItemResponse);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(dataHolder);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        deleteDataItemsResponse = DeleteDataItemsResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(deleteDataItemsResponse);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        sendMessageResponse = SendMessageResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(sendMessageResponse);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getFdForAssetResponse = GetFdForAssetResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getFdForAssetResponse);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getLocalNodeResponse = GetLocalNodeResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getLocalNodeResponse);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getConnectedNodesResponse = GetConnectedNodesResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getConnectedNodesResponse);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        status = Status.CREATOR.createFromParcel(parcel);
                    }
                    a(status);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        storageInfoResponse = StorageInfoResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(storageInfoResponse);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getConfigsResponse = GetConfigsResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getConfigsResponse);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        openChannelResponse = OpenChannelResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(openChannelResponse);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        closeChannelResponse = CloseChannelResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(closeChannelResponse);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        closeChannelResponse2 = CloseChannelResponse.CREATOR.createFromParcel(parcel);
                    }
                    b(closeChannelResponse2);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getChannelInputStreamResponse = GetChannelInputStreamResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getChannelInputStreamResponse);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getChannelOutputStreamResponse = GetChannelOutputStreamResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getChannelOutputStreamResponse);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        channelReceiveFileResponse = ChannelReceiveFileResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(channelReceiveFileResponse);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        channelSendFileResponse = ChannelSendFileResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(channelSendFileResponse);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCapabilityResponse = GetCapabilityResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getCapabilityResponse);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getAllCapabilitiesResponse = GetAllCapabilitiesResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getAllCapabilitiesResponse);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        addLocalCapabilityResponse = AddLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(addLocalCapabilityResponse);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        removeLocalCapabilityResponse = RemoveLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(removeLocalCapabilityResponse);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCloudSyncOptInOutDoneResponse = GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getCloudSyncOptInOutDoneResponse);
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCloudSyncSettingResponse = GetCloudSyncSettingResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getCloudSyncSettingResponse);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (parcel.readInt() != 0) {
                        getCloudSyncOptInStatusResponse = GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(parcel);
                    }
                    a(getCloudSyncOptInStatusResponse);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo7646a(Status status);

    /* renamed from: a */
    void mo7733a(DataHolder dataHolder);

    /* renamed from: a */
    void mo7732a(AddLocalCapabilityResponse addLocalCapabilityResponse);

    /* renamed from: a */
    void mo7731a(ChannelReceiveFileResponse channelReceiveFileResponse);

    /* renamed from: a */
    void mo7730a(ChannelSendFileResponse channelSendFileResponse);

    /* renamed from: a */
    void mo7729a(CloseChannelResponse closeChannelResponse);

    /* renamed from: a */
    void mo7728a(DeleteDataItemsResponse deleteDataItemsResponse);

    /* renamed from: a */
    void mo7727a(GetAllCapabilitiesResponse getAllCapabilitiesResponse);

    /* renamed from: a */
    void mo7726a(GetCapabilityResponse getCapabilityResponse);

    /* renamed from: a */
    void mo7725a(GetChannelInputStreamResponse getChannelInputStreamResponse);

    /* renamed from: a */
    void mo7724a(GetChannelOutputStreamResponse getChannelOutputStreamResponse);

    /* renamed from: a */
    void mo7723a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse);

    /* renamed from: a */
    void mo7722a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse);

    /* renamed from: a */
    void mo7721a(GetCloudSyncSettingResponse getCloudSyncSettingResponse);

    /* renamed from: a */
    void mo7720a(GetConfigResponse getConfigResponse);

    /* renamed from: a */
    void mo7719a(GetConfigsResponse getConfigsResponse);

    /* renamed from: a */
    void mo7718a(GetConnectedNodesResponse getConnectedNodesResponse);

    /* renamed from: a */
    void mo7717a(GetDataItemResponse getDataItemResponse);

    /* renamed from: a */
    void mo7716a(GetFdForAssetResponse getFdForAssetResponse);

    /* renamed from: a */
    void mo7715a(GetLocalNodeResponse getLocalNodeResponse);

    /* renamed from: a */
    void mo7714a(OpenChannelResponse openChannelResponse);

    /* renamed from: a */
    void mo7713a(PutDataResponse putDataResponse);

    /* renamed from: a */
    void mo7712a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse);

    /* renamed from: a */
    void mo7711a(SendMessageResponse sendMessageResponse);

    /* renamed from: a */
    void mo7710a(StorageInfoResponse storageInfoResponse);

    /* renamed from: b */
    void mo7709b(CloseChannelResponse closeChannelResponse);
}
