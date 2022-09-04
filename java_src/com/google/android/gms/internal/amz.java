package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;
/* loaded from: classes2.dex */
public interface amz extends IInterface {

    /* renamed from: com.google.android.gms.internal.amz$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6597a extends Binder implements amz {

        /* renamed from: com.google.android.gms.internal.amz$a$a */
        /* loaded from: classes2.dex */
        private static class C6598a implements amz {

            /* renamed from: a */
            private IBinder f22414a;

            C6598a(IBinder iBinder) {
                this.f22414a = iBinder;
            }

            @Override // com.google.android.gms.internal.amz
            /* renamed from: a */
            public void mo16709a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.f22414a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.amz
            /* renamed from: a */
            public void mo16708a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    obtain.writeInt(i);
                    this.f22414a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.amz
            /* renamed from: a */
            public void mo16707a(Device device, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeByteArray(bArr);
                    this.f22414a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.amz
            /* renamed from: a */
            public void mo16706a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    obtain.writeString(str);
                    this.f22414a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22414a;
            }

            @Override // com.google.android.gms.internal.amz
            /* renamed from: b */
            public void mo16705b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.f22414a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.amz
            /* renamed from: b */
            public void mo16704b(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    obtain.writeString(str);
                    this.f22414a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static amz m16710a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof amz)) ? new C6598a(iBinder) : (amz) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a(parcel.readInt() != 0 ? Device.CREATOR.createFromParcel(parcel) : null, parcel.createByteArray());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a(parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    a(parcel.readString());
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    b();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    b(parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16709a();

    /* renamed from: a */
    void mo16708a(int i);

    /* renamed from: a */
    void mo16707a(Device device, byte[] bArr);

    /* renamed from: a */
    void mo16706a(String str);

    /* renamed from: b */
    void mo16705b();

    /* renamed from: b */
    void mo16704b(String str);
}
