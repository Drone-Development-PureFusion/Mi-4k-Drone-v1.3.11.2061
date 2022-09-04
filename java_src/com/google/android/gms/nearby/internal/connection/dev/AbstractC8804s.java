package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.s */
/* loaded from: classes2.dex */
public interface AbstractC8804s extends IInterface {

    /* renamed from: com.google.android.gms.nearby.internal.connection.dev.s$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8805a extends Binder implements AbstractC8804s {

        /* renamed from: com.google.android.gms.nearby.internal.connection.dev.s$a$a */
        /* loaded from: classes2.dex */
        private static class C8806a implements AbstractC8804s {

            /* renamed from: a */
            private IBinder f28160a;

            C8806a(IBinder iBinder) {
                this.f28160a = iBinder;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8804s
            /* renamed from: a */
            public void mo10039a(OnEndpointFoundParams onEndpointFoundParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (onEndpointFoundParams != null) {
                        obtain.writeInt(1);
                        onEndpointFoundParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28160a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8804s
            /* renamed from: a */
            public void mo10038a(OnEndpointLostParams onEndpointLostParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (onEndpointLostParams != null) {
                        obtain.writeInt(1);
                        onEndpointLostParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28160a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8804s
            /* renamed from: a */
            public void mo10037a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (onStoppedDiscoveryParams != null) {
                        obtain.writeInt(1);
                        onStoppedDiscoveryParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28160a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28160a;
            }
        }

        /* renamed from: a */
        public static AbstractC8804s m10040a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8804s)) ? new C8806a(iBinder) : (AbstractC8804s) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            OnStoppedDiscoveryParams onStoppedDiscoveryParams = null;
            OnEndpointFoundParams onEndpointFoundParams = null;
            OnEndpointLostParams onEndpointLostParams = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (parcel.readInt() != 0) {
                        onEndpointFoundParams = OnEndpointFoundParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onEndpointFoundParams);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (parcel.readInt() != 0) {
                        onEndpointLostParams = OnEndpointLostParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onEndpointLostParams);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    if (parcel.readInt() != 0) {
                        onStoppedDiscoveryParams = OnStoppedDiscoveryParams.CREATOR.createFromParcel(parcel);
                    }
                    a(onStoppedDiscoveryParams);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.IDiscoveryCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo10039a(OnEndpointFoundParams onEndpointFoundParams);

    /* renamed from: a */
    void mo10038a(OnEndpointLostParams onEndpointLostParams);

    /* renamed from: a */
    void mo10037a(OnStoppedDiscoveryParams onStoppedDiscoveryParams);
}
