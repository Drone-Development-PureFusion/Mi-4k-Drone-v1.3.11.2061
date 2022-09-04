package com.google.android.gms.location.places.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.location.places.internal.i */
/* loaded from: classes2.dex */
public interface AbstractC8269i extends IInterface {

    /* renamed from: com.google.android.gms.location.places.internal.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8270a extends Binder implements AbstractC8269i {

        /* renamed from: com.google.android.gms.location.places.internal.i$a$a */
        /* loaded from: classes2.dex */
        private static class C8271a implements AbstractC8269i {

            /* renamed from: a */
            private IBinder f27135a;

            C8271a(IBinder iBinder) {
                this.f27135a = iBinder;
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8269i
            /* renamed from: a */
            public void mo12054a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27135a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8269i
            /* renamed from: a */
            public void mo12053a(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27135a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27135a;
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8269i
            /* renamed from: b */
            public void mo12052b(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27135a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8269i
            /* renamed from: c */
            public void mo12051c(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27135a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8269i
            /* renamed from: d */
            public void mo12050d(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27135a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8270a() {
            attachInterface(this, "com.google.android.gms.location.places.internal.IPlacesCallbacks");
        }

        /* renamed from: a */
        public static AbstractC8269i m12215a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8269i)) ? new C8271a(iBinder) : (AbstractC8269i) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DataHolder dataHolder = null;
            DataHolder dataHolder2 = null;
            DataHolder dataHolder3 = null;
            DataHolder dataHolder4 = null;
            Status status = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        dataHolder2 = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(dataHolder2);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        dataHolder3 = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    b(dataHolder3);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        dataHolder4 = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    c(dataHolder4);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        status = Status.CREATOR.createFromParcel(parcel);
                    }
                    a(status);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    d(dataHolder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12054a(Status status);

    /* renamed from: a */
    void mo12053a(DataHolder dataHolder);

    /* renamed from: b */
    void mo12052b(DataHolder dataHolder);

    /* renamed from: c */
    void mo12051c(DataHolder dataHolder);

    /* renamed from: d */
    void mo12050d(DataHolder dataHolder);
}
