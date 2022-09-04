package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;
/* loaded from: classes2.dex */
public interface and extends IInterface {

    /* renamed from: com.google.android.gms.internal.and$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6606a extends Binder implements and {

        /* renamed from: com.google.android.gms.internal.and$a$a */
        /* loaded from: classes2.dex */
        private static class C6607a implements and {

            /* renamed from: a */
            private IBinder f22418a;

            C6607a(IBinder iBinder) {
                this.f22418a = iBinder;
            }

            @Override // com.google.android.gms.internal.and
            /* renamed from: a */
            public void mo16686a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    this.f22418a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.and
            /* renamed from: a */
            public void mo16685a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    obtain.writeInt(i);
                    this.f22418a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.and
            /* renamed from: a */
            public void mo16684a(Device device) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22418a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22418a;
            }
        }

        /* renamed from: a */
        public static and m16687a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof and)) ? new C6607a(iBinder) : (and) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    a(parcel.readInt() != 0 ? Device.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    a();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    a(parcel.readInt());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16686a();

    /* renamed from: a */
    void mo16685a(int i);

    /* renamed from: a */
    void mo16684a(Device device);
}
