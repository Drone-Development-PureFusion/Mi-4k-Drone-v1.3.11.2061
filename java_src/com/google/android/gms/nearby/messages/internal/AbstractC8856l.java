package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.messages.internal.l */
/* loaded from: classes2.dex */
public interface AbstractC8856l extends IInterface {

    /* renamed from: com.google.android.gms.nearby.messages.internal.l$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8857a extends Binder implements AbstractC8856l {

        /* renamed from: com.google.android.gms.nearby.messages.internal.l$a$a */
        /* loaded from: classes2.dex */
        private static class C8858a implements AbstractC8856l {

            /* renamed from: a */
            private IBinder f28334a;

            C8858a(IBinder iBinder) {
                this.f28334a = iBinder;
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9861a(GetPermissionStatusRequest getPermissionStatusRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (getPermissionStatusRequest != null) {
                        obtain.writeInt(1);
                        getPermissionStatusRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28334a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9860a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (handleClientLifecycleEventRequest != null) {
                        obtain.writeInt(1);
                        handleClientLifecycleEventRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28334a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9859a(PublishRequest publishRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (publishRequest != null) {
                        obtain.writeInt(1);
                        publishRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28334a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9858a(RegisterStatusCallbackRequest registerStatusCallbackRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (registerStatusCallbackRequest != null) {
                        obtain.writeInt(1);
                        registerStatusCallbackRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28334a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9857a(SubscribeRequest subscribeRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (subscribeRequest != null) {
                        obtain.writeInt(1);
                        subscribeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28334a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9856a(UnpublishRequest unpublishRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (unpublishRequest != null) {
                        obtain.writeInt(1);
                        unpublishRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28334a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9855a(UnsubscribeRequest unsubscribeRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (unsubscribeRequest != null) {
                        obtain.writeInt(1);
                        unsubscribeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28334a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8856l
            /* renamed from: a */
            public void mo9854a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    obtain.writeString(str);
                    this.f28334a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28334a;
            }
        }

        /* renamed from: a */
        public static AbstractC8856l m9862a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8856l)) ? new C8858a(iBinder) : (AbstractC8856l) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            HandleClientLifecycleEventRequest handleClientLifecycleEventRequest = null;
            PublishRequest publishRequest = null;
            UnpublishRequest unpublishRequest = null;
            SubscribeRequest subscribeRequest = null;
            UnsubscribeRequest unsubscribeRequest = null;
            GetPermissionStatusRequest getPermissionStatusRequest = null;
            RegisterStatusCallbackRequest registerStatusCallbackRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        publishRequest = PublishRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(publishRequest);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        unpublishRequest = UnpublishRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unpublishRequest);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        subscribeRequest = SubscribeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(subscribeRequest);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        unsubscribeRequest = UnsubscribeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unsubscribeRequest);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    a(parcel.readString());
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        getPermissionStatusRequest = GetPermissionStatusRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getPermissionStatusRequest);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        registerStatusCallbackRequest = RegisterStatusCallbackRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(registerStatusCallbackRequest);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        handleClientLifecycleEventRequest = HandleClientLifecycleEventRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(handleClientLifecycleEventRequest);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9861a(GetPermissionStatusRequest getPermissionStatusRequest);

    /* renamed from: a */
    void mo9860a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest);

    /* renamed from: a */
    void mo9859a(PublishRequest publishRequest);

    /* renamed from: a */
    void mo9858a(RegisterStatusCallbackRequest registerStatusCallbackRequest);

    /* renamed from: a */
    void mo9857a(SubscribeRequest subscribeRequest);

    /* renamed from: a */
    void mo9856a(UnpublishRequest unpublishRequest);

    /* renamed from: a */
    void mo9855a(UnsubscribeRequest unsubscribeRequest);

    /* renamed from: a */
    void mo9854a(String str);
}
