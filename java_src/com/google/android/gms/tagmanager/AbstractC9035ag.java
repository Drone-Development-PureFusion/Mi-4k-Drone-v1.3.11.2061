package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.tagmanager.ag */
/* loaded from: classes2.dex */
public interface AbstractC9035ag extends IInterface {

    /* renamed from: com.google.android.gms.tagmanager.ag$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9036a extends Binder implements AbstractC9035ag {

        /* renamed from: com.google.android.gms.tagmanager.ag$a$a */
        /* loaded from: classes2.dex */
        private static class C9037a implements AbstractC9035ag {

            /* renamed from: a */
            private IBinder f28685a;

            C9037a(IBinder iBinder) {
                this.f28685a = iBinder;
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9035ag
            /* renamed from: a */
            public void mo9319a(String str, String str2, Bundle bundle, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementEventListener");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f28685a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28685a;
            }
        }

        public AbstractBinderC9036a() {
            attachInterface(this, "com.google.android.gms.tagmanager.IMeasurementEventListener");
        }

        /* renamed from: a */
        public static AbstractC9035ag m9320a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9035ag)) ? new C9037a(iBinder) : (AbstractC9035ag) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.IMeasurementEventListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9319a(String str, String str2, Bundle bundle, long j);
}
