package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tagmanager.AbstractC9035ag;
import com.google.android.gms.tagmanager.AbstractC9039ai;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.aj */
/* loaded from: classes2.dex */
public interface AbstractC9042aj extends IInterface {

    /* renamed from: com.google.android.gms.tagmanager.aj$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9043a extends Binder implements AbstractC9042aj {

        /* renamed from: com.google.android.gms.tagmanager.aj$a$a */
        /* loaded from: classes2.dex */
        private static class C9044a implements AbstractC9042aj {

            /* renamed from: a */
            private IBinder f28689a;

            C9044a(IBinder iBinder) {
                this.f28689a = iBinder;
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public Map mo8898a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    this.f28689a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public void mo8897a(AbstractC9035ag abstractC9035ag) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    obtain.writeStrongBinder(abstractC9035ag != null ? abstractC9035ag.asBinder() : null);
                    this.f28689a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public void mo8896a(AbstractC9039ai abstractC9039ai) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    obtain.writeStrongBinder(abstractC9039ai != null ? abstractC9039ai.asBinder() : null);
                    this.f28689a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public void mo8895a(String str, String str2, Bundle bundle, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.IMeasurementProxy");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f28689a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28689a;
            }
        }

        public AbstractBinderC9043a() {
            attachInterface(this, "com.google.android.gms.tagmanager.IMeasurementProxy");
        }

        /* renamed from: a */
        public static AbstractC9042aj m9316a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9042aj)) ? new C9044a(iBinder) : (AbstractC9042aj) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    Map a = a();
                    parcel2.writeNoException();
                    parcel2.writeMap(a);
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    a(AbstractC9039ai.AbstractBinderC9040a.m9318a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    a(AbstractC9035ag.AbstractBinderC9036a.m9320a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.IMeasurementProxy");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    Map mo8898a();

    /* renamed from: a */
    void mo8897a(AbstractC9035ag abstractC9035ag);

    /* renamed from: a */
    void mo8896a(AbstractC9039ai abstractC9039ai);

    /* renamed from: a */
    void mo8895a(String str, String str2, Bundle bundle, long j);
}
