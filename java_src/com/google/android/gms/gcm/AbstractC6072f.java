package com.google.android.gms.gcm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.gcm.f */
/* loaded from: classes2.dex */
public interface AbstractC6072f extends IInterface {

    /* renamed from: com.google.android.gms.gcm.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6073a extends Binder implements AbstractC6072f {

        /* renamed from: com.google.android.gms.gcm.f$a$a */
        /* loaded from: classes2.dex */
        private static class C6074a implements AbstractC6072f {

            /* renamed from: a */
            private IBinder f20560a;

            C6074a(IBinder iBinder) {
                this.f20560a = iBinder;
            }

            @Override // com.google.android.gms.gcm.AbstractC6072f
            /* renamed from: a */
            public void mo18814a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
                    obtain.writeInt(i);
                    this.f20560a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20560a;
            }
        }

        /* renamed from: a */
        public static AbstractC6072f m18815a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6072f)) ? new C6074a(iBinder) : (AbstractC6072f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.gcm.INetworkTaskCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo18814a(int i);
}
