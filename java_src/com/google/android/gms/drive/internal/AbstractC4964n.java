package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import com.google.android.gms.drive.internal.AbstractC4967o;
import com.google.android.gms.drive.internal.AbstractC4970p;
/* renamed from: com.google.android.gms.drive.internal.n */
/* loaded from: classes2.dex */
public interface AbstractC4964n extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.n$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4965a extends Binder implements AbstractC4964n {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.drive.internal.n$a$a */
        /* loaded from: classes2.dex */
        public static class C4966a implements AbstractC4964n {

            /* renamed from: a */
            private IBinder f17954a;

            C4966a(IBinder iBinder) {
                this.f17954a = iBinder;
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public IntentSender mo22314a(CreateFileIntentSenderRequest createFileIntentSenderRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        createFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17954a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public IntentSender mo22301a(OpenFileIntentSenderRequest openFileIntentSenderRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        openFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17954a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public DriveServiceResponse mo22302a(OpenContentsRequest openContentsRequest, AbstractC4967o abstractC4967o) {
                DriveServiceResponse driveServiceResponse = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openContentsRequest != null) {
                        obtain.writeInt(1);
                        openContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveServiceResponse = DriveServiceResponse.CREATOR.createFromParcel(obtain2);
                    }
                    return driveServiceResponse;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public DriveServiceResponse mo22293a(StreamContentsRequest streamContentsRequest, AbstractC4967o abstractC4967o) {
                DriveServiceResponse driveServiceResponse = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (streamContentsRequest != null) {
                        obtain.writeInt(1);
                        streamContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveServiceResponse = DriveServiceResponse.CREATOR.createFromParcel(obtain2);
                    }
                    return driveServiceResponse;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22325a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (realtimeDocumentSyncRequest != null) {
                        obtain.writeInt(1);
                        realtimeDocumentSyncRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22324a(AddEventListenerRequest addEventListenerRequest, AbstractC4970p abstractC4970p, String str, AbstractC4967o abstractC4967o) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addEventListenerRequest != null) {
                        obtain.writeInt(1);
                        addEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4970p != null ? abstractC4970p.asBinder() : null);
                    obtain.writeString(str);
                    if (abstractC4967o != null) {
                        iBinder = abstractC4967o.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f17954a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22323a(AddPermissionRequest addPermissionRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addPermissionRequest != null) {
                        obtain.writeInt(1);
                        addPermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22322a(AuthorizeAccessRequest authorizeAccessRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (authorizeAccessRequest != null) {
                        obtain.writeInt(1);
                        authorizeAccessRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22321a(CancelPendingActionsRequest cancelPendingActionsRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (cancelPendingActionsRequest != null) {
                        obtain.writeInt(1);
                        cancelPendingActionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22320a(ChangeResourceParentsRequest changeResourceParentsRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (changeResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        changeResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22319a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (checkResourceIdsExistRequest != null) {
                        obtain.writeInt(1);
                        checkResourceIdsExistRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22318a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsAndUpdateMetadataRequest != null) {
                        obtain.writeInt(1);
                        closeContentsAndUpdateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22317a(CloseContentsRequest closeContentsRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsRequest != null) {
                        obtain.writeInt(1);
                        closeContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22316a(ControlProgressRequest controlProgressRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (controlProgressRequest != null) {
                        obtain.writeInt(1);
                        controlProgressRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22315a(CreateContentsRequest createContentsRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createContentsRequest != null) {
                        obtain.writeInt(1);
                        createContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22313a(CreateFileRequest createFileRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileRequest != null) {
                        obtain.writeInt(1);
                        createFileRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22312a(CreateFolderRequest createFolderRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFolderRequest != null) {
                        obtain.writeInt(1);
                        createFolderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22311a(DeleteResourceRequest deleteResourceRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (deleteResourceRequest != null) {
                        obtain.writeInt(1);
                        deleteResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22310a(DisconnectRequest disconnectRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (disconnectRequest != null) {
                        obtain.writeInt(1);
                        disconnectRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17954a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22309a(FetchThumbnailRequest fetchThumbnailRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (fetchThumbnailRequest != null) {
                        obtain.writeInt(1);
                        fetchThumbnailRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22308a(GetChangesRequest getChangesRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getChangesRequest != null) {
                        obtain.writeInt(1);
                        getChangesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22307a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getDriveIdFromUniqueIdentifierRequest != null) {
                        obtain.writeInt(1);
                        getDriveIdFromUniqueIdentifierRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22306a(GetMetadataRequest getMetadataRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getMetadataRequest != null) {
                        obtain.writeInt(1);
                        getMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22305a(GetPermissionsRequest getPermissionsRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getPermissionsRequest != null) {
                        obtain.writeInt(1);
                        getPermissionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22304a(ListParentsRequest listParentsRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (listParentsRequest != null) {
                        obtain.writeInt(1);
                        listParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22303a(LoadRealtimeRequest loadRealtimeRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (loadRealtimeRequest != null) {
                        obtain.writeInt(1);
                        loadRealtimeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22300a(QueryRequest queryRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22299a(QueryRequest queryRequest, AbstractC4970p abstractC4970p, AbstractC4967o abstractC4967o) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4970p != null ? abstractC4970p.asBinder() : null);
                    if (abstractC4967o != null) {
                        iBinder = abstractC4967o.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f17954a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22298a(RemoveEventListenerRequest removeEventListenerRequest, AbstractC4970p abstractC4970p, String str, AbstractC4967o abstractC4967o) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removeEventListenerRequest != null) {
                        obtain.writeInt(1);
                        removeEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4970p != null ? abstractC4970p.asBinder() : null);
                    obtain.writeString(str);
                    if (abstractC4967o != null) {
                        iBinder = abstractC4967o.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f17954a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22297a(RemovePermissionRequest removePermissionRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removePermissionRequest != null) {
                        obtain.writeInt(1);
                        removePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22296a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setFileUploadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setFileUploadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22295a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setPinnedDownloadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setPinnedDownloadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22294a(SetResourceParentsRequest setResourceParentsRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        setResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22292a(TrashResourceRequest trashResourceRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (trashResourceRequest != null) {
                        obtain.writeInt(1);
                        trashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22291a(UnsubscribeResourceRequest unsubscribeResourceRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (unsubscribeResourceRequest != null) {
                        obtain.writeInt(1);
                        unsubscribeResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22290a(UntrashResourceRequest untrashResourceRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (untrashResourceRequest != null) {
                        obtain.writeInt(1);
                        untrashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22289a(UpdateMetadataRequest updateMetadataRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updateMetadataRequest != null) {
                        obtain.writeInt(1);
                        updateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22288a(UpdatePermissionRequest updatePermissionRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updatePermissionRequest != null) {
                        obtain.writeInt(1);
                        updatePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22287a(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: a */
            public void mo22286a(AbstractC4970p abstractC4970p, AbstractC4967o abstractC4967o) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4970p != null ? abstractC4970p.asBinder() : null);
                    if (abstractC4967o != null) {
                        iBinder = abstractC4967o.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f17954a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17954a;
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: b */
            public void mo22285b(QueryRequest queryRequest, AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: b */
            public void mo22284b(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: c */
            public void mo22283c(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: d */
            public void mo22282d(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: e */
            public void mo22281e(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: f */
            public void mo22280f(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: g */
            public void mo22279g(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4964n
            /* renamed from: h */
            public void mo22278h(AbstractC4967o abstractC4967o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(abstractC4967o != null ? abstractC4967o.asBinder() : null);
                    this.f17954a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4964n m22326a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4964n)) ? new C4966a(iBinder) : (AbstractC4964n) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            StreamContentsRequest streamContentsRequest = null;
            GetMetadataRequest getMetadataRequest = null;
            QueryRequest queryRequest = null;
            UpdateMetadataRequest updateMetadataRequest = null;
            CreateContentsRequest createContentsRequest = null;
            CreateFileRequest createFileRequest = null;
            CreateFolderRequest createFolderRequest = null;
            OpenContentsRequest openContentsRequest = null;
            CloseContentsRequest closeContentsRequest = null;
            OpenFileIntentSenderRequest openFileIntentSenderRequest = null;
            CreateFileIntentSenderRequest createFileIntentSenderRequest = null;
            AuthorizeAccessRequest authorizeAccessRequest = null;
            ListParentsRequest listParentsRequest = null;
            AddEventListenerRequest addEventListenerRequest = null;
            RemoveEventListenerRequest removeEventListenerRequest = null;
            DisconnectRequest disconnectRequest = null;
            TrashResourceRequest trashResourceRequest = null;
            CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest = null;
            QueryRequest queryRequest2 = null;
            DeleteResourceRequest deleteResourceRequest = null;
            LoadRealtimeRequest loadRealtimeRequest = null;
            SetResourceParentsRequest setResourceParentsRequest = null;
            GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest = null;
            CheckResourceIdsExistRequest checkResourceIdsExistRequest = null;
            SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest = null;
            RealtimeDocumentSyncRequest realtimeDocumentSyncRequest = null;
            SetFileUploadPreferencesRequest setFileUploadPreferencesRequest = null;
            CancelPendingActionsRequest cancelPendingActionsRequest = null;
            UntrashResourceRequest untrashResourceRequest = null;
            FetchThumbnailRequest fetchThumbnailRequest = null;
            GetChangesRequest getChangesRequest = null;
            UnsubscribeResourceRequest unsubscribeResourceRequest = null;
            GetPermissionsRequest getPermissionsRequest = null;
            AddPermissionRequest addPermissionRequest = null;
            UpdatePermissionRequest updatePermissionRequest = null;
            RemovePermissionRequest removePermissionRequest = null;
            QueryRequest queryRequest3 = null;
            ControlProgressRequest controlProgressRequest = null;
            ChangeResourceParentsRequest changeResourceParentsRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getMetadataRequest = GetMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getMetadataRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(queryRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updateMetadataRequest = UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(updateMetadataRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createContentsRequest = CreateContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(createContentsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileRequest = CreateFileRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(createFileRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFolderRequest = CreateFolderRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(createFolderRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openContentsRequest = OpenContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    DriveServiceResponse a = a(openContentsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsRequest = CloseContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(closeContentsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    a(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openFileIntentSenderRequest = OpenFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    IntentSender a2 = a(openFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileIntentSenderRequest = CreateFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    IntentSender a3 = a(createFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (a3 != null) {
                        parcel2.writeInt(1);
                        a3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        authorizeAccessRequest = AuthorizeAccessRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(authorizeAccessRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        listParentsRequest = ListParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(listParentsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addEventListenerRequest = AddEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(addEventListenerRequest, AbstractC4970p.AbstractBinderC4971a.m22256a(parcel.readStrongBinder()), parcel.readString(), AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removeEventListenerRequest = RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(removeEventListenerRequest, AbstractC4970p.AbstractBinderC4971a.m22256a(parcel.readStrongBinder()), parcel.readString(), AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        disconnectRequest = DisconnectRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(disconnectRequest);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        trashResourceRequest = TrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(trashResourceRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsAndUpdateMetadataRequest = CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(closeContentsAndUpdateMetadataRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest2 = QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    b(queryRequest2, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        deleteResourceRequest = DeleteResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(deleteResourceRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        loadRealtimeRequest = LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(loadRealtimeRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setResourceParentsRequest = SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(setResourceParentsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getDriveIdFromUniqueIdentifierRequest = GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getDriveIdFromUniqueIdentifierRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        checkResourceIdsExistRequest = CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(checkResourceIdsExistRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    b(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    c(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setPinnedDownloadPreferencesRequest = SetPinnedDownloadPreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(setPinnedDownloadPreferencesRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        realtimeDocumentSyncRequest = RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(realtimeDocumentSyncRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    d(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setFileUploadPreferencesRequest = SetFileUploadPreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(setFileUploadPreferencesRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        cancelPendingActionsRequest = CancelPendingActionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(cancelPendingActionsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        untrashResourceRequest = UntrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(untrashResourceRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    e(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        fetchThumbnailRequest = FetchThumbnailRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fetchThumbnailRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    f(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getChangesRequest = GetChangesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getChangesRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        unsubscribeResourceRequest = UnsubscribeResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unsubscribeResourceRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getPermissionsRequest = GetPermissionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getPermissionsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 48:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addPermissionRequest = AddPermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(addPermissionRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updatePermissionRequest = UpdatePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(updatePermissionRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removePermissionRequest = RemovePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(removePermissionRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest3 = QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(queryRequest3, AbstractC4970p.AbstractBinderC4971a.m22256a(parcel.readStrongBinder()), AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    a(AbstractC4970p.AbstractBinderC4971a.m22256a(parcel.readStrongBinder()), AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        controlProgressRequest = ControlProgressRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(controlProgressRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 54:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    g(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 55:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        changeResourceParentsRequest = ChangeResourceParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(changeResourceParentsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 56:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        streamContentsRequest = StreamContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    DriveServiceResponse a4 = a(streamContentsRequest, AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a4 != null) {
                        parcel2.writeInt(1);
                        a4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 57:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    h(AbstractC4967o.AbstractBinderC4968a.m22277a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IDriveService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IntentSender mo22314a(CreateFileIntentSenderRequest createFileIntentSenderRequest);

    /* renamed from: a */
    IntentSender mo22301a(OpenFileIntentSenderRequest openFileIntentSenderRequest);

    /* renamed from: a */
    DriveServiceResponse mo22302a(OpenContentsRequest openContentsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    DriveServiceResponse mo22293a(StreamContentsRequest streamContentsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22325a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22324a(AddEventListenerRequest addEventListenerRequest, AbstractC4970p abstractC4970p, String str, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22323a(AddPermissionRequest addPermissionRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22322a(AuthorizeAccessRequest authorizeAccessRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22321a(CancelPendingActionsRequest cancelPendingActionsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22320a(ChangeResourceParentsRequest changeResourceParentsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22319a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22318a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22317a(CloseContentsRequest closeContentsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22316a(ControlProgressRequest controlProgressRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22315a(CreateContentsRequest createContentsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22313a(CreateFileRequest createFileRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22312a(CreateFolderRequest createFolderRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22311a(DeleteResourceRequest deleteResourceRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22310a(DisconnectRequest disconnectRequest);

    /* renamed from: a */
    void mo22309a(FetchThumbnailRequest fetchThumbnailRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22308a(GetChangesRequest getChangesRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22307a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22306a(GetMetadataRequest getMetadataRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22305a(GetPermissionsRequest getPermissionsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22304a(ListParentsRequest listParentsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22303a(LoadRealtimeRequest loadRealtimeRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22300a(QueryRequest queryRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22299a(QueryRequest queryRequest, AbstractC4970p abstractC4970p, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22298a(RemoveEventListenerRequest removeEventListenerRequest, AbstractC4970p abstractC4970p, String str, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22297a(RemovePermissionRequest removePermissionRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22296a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22295a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22294a(SetResourceParentsRequest setResourceParentsRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22292a(TrashResourceRequest trashResourceRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22291a(UnsubscribeResourceRequest unsubscribeResourceRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22290a(UntrashResourceRequest untrashResourceRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22289a(UpdateMetadataRequest updateMetadataRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22288a(UpdatePermissionRequest updatePermissionRequest, AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22287a(AbstractC4967o abstractC4967o);

    /* renamed from: a */
    void mo22286a(AbstractC4970p abstractC4970p, AbstractC4967o abstractC4967o);

    /* renamed from: b */
    void mo22285b(QueryRequest queryRequest, AbstractC4967o abstractC4967o);

    /* renamed from: b */
    void mo22284b(AbstractC4967o abstractC4967o);

    /* renamed from: c */
    void mo22283c(AbstractC4967o abstractC4967o);

    /* renamed from: d */
    void mo22282d(AbstractC4967o abstractC4967o);

    /* renamed from: e */
    void mo22281e(AbstractC4967o abstractC4967o);

    /* renamed from: f */
    void mo22280f(AbstractC4967o abstractC4967o);

    /* renamed from: g */
    void mo22279g(AbstractC4967o abstractC4967o);

    /* renamed from: h */
    void mo22278h(AbstractC4967o abstractC4967o);
}
