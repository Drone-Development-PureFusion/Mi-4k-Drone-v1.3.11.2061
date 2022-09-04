package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.tagmanager.ai */
/* loaded from: classes2.dex */
public interface AbstractC9039ai extends IInterface {

    /* renamed from: com.google.android.gms.tagmanager.ai$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9040a extends Binder implements AbstractC9039ai {

        /* renamed from: com.google.android.gms.tagmanager.ai$a$a */
        /* loaded from: classes2.dex */
        private static class C9041a implements AbstractC9039ai {

            /* renamed from: a */
            private IBinder f28688a;

            C9041a(IBinder iBinder) {
                this.f28688a = iBinder;
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9039ai
            /* renamed from: a */
            public void mo9317a(String str, String str2, Bundle bundle, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f28688a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28688a;
            }
        }

        public AbstractBinderC9040a() {
            attachInterface(this, "com.google.android.gms.tagmanager.IMeasurementInterceptor");
        }

        /* renamed from: a */
        public static AbstractC9039ai m9318a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9039ai)) ? new C9041a(iBinder) : (AbstractC9039ai) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9317a(String str, String str2, Bundle bundle, long j);
}
