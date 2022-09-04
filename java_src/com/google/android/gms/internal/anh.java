package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.AbstractC8240d;
/* loaded from: classes2.dex */
public interface anh extends IInterface {

    /* renamed from: com.google.android.gms.internal.anh$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6631a extends Binder implements anh {

        /* renamed from: com.google.android.gms.internal.anh$a$a */
        /* loaded from: classes2.dex */
        private static class C6632a implements anh {

            /* renamed from: a */
            private IBinder f22478a;

            C6632a(IBinder iBinder) {
                this.f22478a = iBinder;
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: a */
            public void mo16652a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeInt(i);
                    this.f22478a.transact(AbstractC8240d.f27000bc, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: a */
            public void mo16651a(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f22478a.transact(AbstractC8240d.f26999bb, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: a */
            public void mo16650a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeString(str);
                    this.f22478a.transact(1003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: a */
            public void mo16649a(String str, int i, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    this.f22478a.transact(AbstractC8240d.f26969aY, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: a */
            public void mo16648a(String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f22478a.transact(1002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: a */
            public void mo16647a(String str, String str2, String str3, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeByteArray(bArr);
                    this.f22478a.transact(1001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: a */
            public void mo16646a(String str, byte[] bArr, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f22478a.transact(1007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22478a;
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: b */
            public void mo16645b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeInt(i);
                    this.f22478a.transact(AbstractC8240d.f27002be, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: b */
            public void mo16644b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeString(str);
                    this.f22478a.transact(AbstractC8240d.f26998ba, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: c */
            public void mo16643c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeInt(i);
                    this.f22478a.transact(AbstractC8240d.f27003bf, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anh
            /* renamed from: d */
            public void mo16642d(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    obtain.writeInt(i);
                    this.f22478a.transact(AbstractC8240d.f27004bg, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC6631a() {
            attachInterface(this, "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
        }

        /* renamed from: a */
        public static anh m16653a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anh)) ? new C6632a(iBinder) : (anh) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1001:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 1002:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1003:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26969aY /* 1006 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    a(parcel.readString(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 1007:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    a(parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26998ba /* 1008 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    b(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26999bb /* 1009 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    a(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27000bc /* 1010 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27002be /* 1012 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27003bf /* 1013 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    c(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27004bg /* 1014 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    d(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16652a(int i);

    /* renamed from: a */
    void mo16651a(int i, String str);

    /* renamed from: a */
    void mo16650a(String str);

    /* renamed from: a */
    void mo16649a(String str, int i, byte[] bArr);

    /* renamed from: a */
    void mo16648a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo16647a(String str, String str2, String str3, byte[] bArr);

    /* renamed from: a */
    void mo16646a(String str, byte[] bArr, boolean z);

    /* renamed from: b */
    void mo16645b(int i);

    /* renamed from: b */
    void mo16644b(String str);

    /* renamed from: c */
    void mo16643c(int i);

    /* renamed from: d */
    void mo16642d(int i);
}
