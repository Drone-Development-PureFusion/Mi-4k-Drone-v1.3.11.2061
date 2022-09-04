package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public interface ana extends IInterface {

    /* renamed from: com.google.android.gms.internal.ana$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6600a extends Binder implements ana {

        /* renamed from: com.google.android.gms.internal.ana$a$a */
        /* loaded from: classes2.dex */
        private static class C6601a implements ana {

            /* renamed from: a */
            private IBinder f22415a;

            C6601a(IBinder iBinder) {
                this.f22415a = iBinder;
            }

            @Override // com.google.android.gms.internal.ana
            /* renamed from: a */
            public void mo16702a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    obtain.writeInt(i);
                    this.f22415a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ana
            /* renamed from: a */
            public void mo16701a(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    obtain.writeByteArray(bArr);
                    this.f22415a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22415a;
            }
        }

        /* renamed from: a */
        public static ana m16703a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ana)) ? new C6601a(iBinder) : (ana) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    a(parcel.createByteArray());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    a(parcel.readInt());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16702a(int i);

    /* renamed from: a */
    void mo16701a(byte[] bArr);
}
