package com.google.android.gms.config.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.Map;
/* renamed from: com.google.android.gms.config.internal.i */
/* loaded from: classes2.dex */
public interface AbstractC4718i extends IInterface {

    /* renamed from: com.google.android.gms.config.internal.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4719a extends Binder implements AbstractC4718i {

        /* renamed from: com.google.android.gms.config.internal.i$a$a */
        /* loaded from: classes2.dex */
        private static class C4720a implements AbstractC4718i {

            /* renamed from: a */
            private IBinder f17345a;

            C4720a(IBinder iBinder) {
                this.f17345a = iBinder;
            }

            @Override // com.google.android.gms.config.internal.AbstractC4718i
            /* renamed from: a */
            public void mo23029a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17345a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.config.internal.AbstractC4718i
            /* renamed from: a */
            public void mo23028a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (fetchConfigIpcResponse != null) {
                        obtain.writeInt(1);
                        fetchConfigIpcResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17345a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.config.internal.AbstractC4718i
            /* renamed from: a */
            public void mo23027a(Status status, Map map) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeMap(map);
                    this.f17345a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.config.internal.AbstractC4718i
            /* renamed from: a */
            public void mo23026a(Status status, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeByteArray(bArr);
                    this.f17345a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17345a;
            }
        }

        public AbstractBinderC4719a() {
            attachInterface(this, "com.google.android.gms.config.internal.IConfigCallbacks");
        }

        /* renamed from: a */
        public static AbstractC4718i m23030a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.config.internal.IConfigCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4718i)) ? new C4720a(iBinder) : (AbstractC4718i) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.createByteArray());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readHashMap(getClass().getClassLoader()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? FetchConfigIpcResponse.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.config.internal.IConfigCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo23029a(Status status);

    /* renamed from: a */
    void mo23028a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse);

    /* renamed from: a */
    void mo23027a(Status status, Map map);

    /* renamed from: a */
    void mo23026a(Status status, byte[] bArr);
}
