package com.google.android.gms.contextmanager.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
/* renamed from: com.google.android.gms.contextmanager.internal.h */
/* loaded from: classes2.dex */
public interface AbstractC4776h extends IInterface {

    /* renamed from: com.google.android.gms.contextmanager.internal.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4777a extends Binder implements AbstractC4776h {

        /* renamed from: com.google.android.gms.contextmanager.internal.h$a$a */
        /* loaded from: classes2.dex */
        private static class C4778a implements AbstractC4776h {

            /* renamed from: a */
            private IBinder f17494a;

            C4778a(IBinder iBinder) {
                this.f17494a = iBinder;
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
            /* renamed from: a */
            public void mo22794a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17494a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
            /* renamed from: a */
            public void mo22793a(Status status, Snapshot snapshot) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (snapshot != null) {
                        obtain.writeInt(1);
                        snapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17494a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
            /* renamed from: a */
            public void mo22792a(Status status, DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17494a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
            /* renamed from: a */
            public void mo22791a(Status status, DataHolder dataHolder, DataHolder dataHolder2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder2 != null) {
                        obtain.writeInt(1);
                        dataHolder2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17494a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
            /* renamed from: a */
            public void mo22790a(Status status, FenceStateMapImpl fenceStateMapImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (fenceStateMapImpl != null) {
                        obtain.writeInt(1);
                        fenceStateMapImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17494a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
            /* renamed from: a */
            public void mo22789a(Status status, WriteBatchImpl writeBatchImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (writeBatchImpl != null) {
                        obtain.writeInt(1);
                        writeBatchImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17494a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17494a;
            }
        }

        public AbstractBinderC4777a() {
            attachInterface(this, "com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
        }

        /* renamed from: a */
        public static AbstractC4776h m22795a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4776h)) ? new C4778a(iBinder) : (AbstractC4776h) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? WriteBatchImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Snapshot.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? FenceStateMapImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo22794a(Status status);

    /* renamed from: a */
    void mo22793a(Status status, Snapshot snapshot);

    /* renamed from: a */
    void mo22792a(Status status, DataHolder dataHolder);

    /* renamed from: a */
    void mo22791a(Status status, DataHolder dataHolder, DataHolder dataHolder2);

    /* renamed from: a */
    void mo22790a(Status status, FenceStateMapImpl fenceStateMapImpl);

    /* renamed from: a */
    void mo22789a(Status status, WriteBatchImpl writeBatchImpl);
}
