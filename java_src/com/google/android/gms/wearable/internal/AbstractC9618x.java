package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;
/* renamed from: com.google.android.gms.wearable.internal.x */
/* loaded from: classes2.dex */
public interface AbstractC9618x extends IInterface {

    /* renamed from: com.google.android.gms.wearable.internal.x$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9619a extends Binder implements AbstractC9618x {

        /* renamed from: com.google.android.gms.wearable.internal.x$a$a */
        /* loaded from: classes2.dex */
        private static class C9620a implements AbstractC9618x {

            /* renamed from: a */
            private IBinder f30145a;

            C9620a(IBinder iBinder) {
                this.f30145a = iBinder;
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7707a(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7706a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (amsEntityUpdateParcelable != null) {
                        obtain.writeInt(1);
                        amsEntityUpdateParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7705a(AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (ancsNotificationParcelable != null) {
                        obtain.writeInt(1);
                        ancsNotificationParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7704a(CapabilityInfoParcelable capabilityInfoParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (capabilityInfoParcelable != null) {
                        obtain.writeInt(1);
                        capabilityInfoParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7703a(ChannelEventParcelable channelEventParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (channelEventParcelable != null) {
                        obtain.writeInt(1);
                        channelEventParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7702a(MessageEventParcelable messageEventParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (messageEventParcelable != null) {
                        obtain.writeInt(1);
                        messageEventParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7701a(NodeParcelable nodeParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (nodeParcelable != null) {
                        obtain.writeInt(1);
                        nodeParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: a */
            public void mo7700a(List<NodeParcelable> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    obtain.writeTypedList(list);
                    this.f30145a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30145a;
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9618x
            /* renamed from: b */
            public void mo7699b(NodeParcelable nodeParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (nodeParcelable != null) {
                        obtain.writeInt(1);
                        nodeParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30145a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9619a() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }

        /* renamed from: a */
        public static AbstractC9618x m7708a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9618x)) ? new C9620a(iBinder) : (AbstractC9618x) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AmsEntityUpdateParcelable amsEntityUpdateParcelable = null;
            DataHolder dataHolder = null;
            MessageEventParcelable messageEventParcelable = null;
            NodeParcelable nodeParcelable = null;
            NodeParcelable nodeParcelable2 = null;
            AncsNotificationParcelable ancsNotificationParcelable = null;
            ChannelEventParcelable channelEventParcelable = null;
            CapabilityInfoParcelable capabilityInfoParcelable = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(dataHolder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        messageEventParcelable = MessageEventParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(messageEventParcelable);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        nodeParcelable = NodeParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(nodeParcelable);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        nodeParcelable2 = NodeParcelable.CREATOR.createFromParcel(parcel);
                    }
                    b(nodeParcelable2);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        ancsNotificationParcelable = AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(ancsNotificationParcelable);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        channelEventParcelable = ChannelEventParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(channelEventParcelable);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        capabilityInfoParcelable = CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(capabilityInfoParcelable);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        amsEntityUpdateParcelable = AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(amsEntityUpdateParcelable);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo7707a(DataHolder dataHolder);

    /* renamed from: a */
    void mo7706a(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    /* renamed from: a */
    void mo7705a(AncsNotificationParcelable ancsNotificationParcelable);

    /* renamed from: a */
    void mo7704a(CapabilityInfoParcelable capabilityInfoParcelable);

    /* renamed from: a */
    void mo7703a(ChannelEventParcelable channelEventParcelable);

    /* renamed from: a */
    void mo7702a(MessageEventParcelable messageEventParcelable);

    /* renamed from: a */
    void mo7701a(NodeParcelable nodeParcelable);

    /* renamed from: a */
    void mo7700a(List<NodeParcelable> list);

    /* renamed from: b */
    void mo7699b(NodeParcelable nodeParcelable);
}
