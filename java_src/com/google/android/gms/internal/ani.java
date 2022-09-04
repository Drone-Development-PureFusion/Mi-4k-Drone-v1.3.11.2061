package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.anh;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.nearby.connection.AppMetadata;
/* loaded from: classes2.dex */
public interface ani extends IInterface {

    /* renamed from: com.google.android.gms.internal.ani$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6633a extends Binder implements ani {

        /* renamed from: com.google.android.gms.internal.ani$a$a */
        /* loaded from: classes2.dex */
        private static class C6634a implements ani {

            /* renamed from: a */
            private IBinder f22479a;

            C6634a(IBinder iBinder) {
                this.f22479a = iBinder;
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public String mo16640a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.f22479a.transact(AbstractC8240d.f27006bi, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16639a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f22479a.transact(1002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16638a(anh anhVar, String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(anhVar != null ? anhVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f26999bb, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16637a(anh anhVar, String str, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(anhVar != null ? anhVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f22479a.transact(1003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16636a(anh anhVar, String str, AppMetadata appMetadata, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(anhVar != null ? anhVar.asBinder() : null);
                    obtain.writeString(str);
                    if (appMetadata != null) {
                        obtain.writeInt(1);
                        appMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f22479a.transact(1001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16635a(anh anhVar, String str, String str2, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(anhVar != null ? anhVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f22479a.transact(1007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16634a(anh anhVar, String str, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStrongBinder(anhVar != null ? anhVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f26998ba, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16633a(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f26967aW, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: a */
            public void mo16632a(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f27000bc, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22479a;
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: b */
            public void mo16631b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f27003bf, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: b */
            public void mo16630b(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f27002be, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: b */
            public void mo16629b(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f27001bd, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: c */
            public void mo16628c(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f27004bg, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ani
            /* renamed from: d */
            public String mo16627d(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f22479a.transact(AbstractC8240d.f27005bh, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static ani m16641a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ani)) ? new C6634a(iBinder) : (ani) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1001:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(anh.AbstractBinderC6631a.m16653a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? AppMetadata.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1002:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1003:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(anh.AbstractBinderC6631a.m16653a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26967aW /* 1004 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1007:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(anh.AbstractBinderC6631a.m16653a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26998ba /* 1008 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(anh.AbstractBinderC6631a.m16653a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26999bb /* 1009 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(anh.AbstractBinderC6631a.m16653a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27000bc /* 1010 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    a(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27001bd /* 1011 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    b(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27002be /* 1012 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    b(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27003bf /* 1013 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27004bg /* 1014 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    c(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27005bh /* 1015 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    String d = d(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case AbstractC8240d.f27006bi /* 1016 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo16640a();

    /* renamed from: a */
    void mo16639a(long j);

    /* renamed from: a */
    void mo16638a(anh anhVar, String str, long j);

    /* renamed from: a */
    void mo16637a(anh anhVar, String str, long j, long j2);

    /* renamed from: a */
    void mo16636a(anh anhVar, String str, AppMetadata appMetadata, long j, long j2);

    /* renamed from: a */
    void mo16635a(anh anhVar, String str, String str2, byte[] bArr, long j);

    /* renamed from: a */
    void mo16634a(anh anhVar, String str, byte[] bArr, long j);

    /* renamed from: a */
    void mo16633a(String str, long j);

    /* renamed from: a */
    void mo16632a(String[] strArr, byte[] bArr, long j);

    /* renamed from: b */
    void mo16631b(long j);

    /* renamed from: b */
    void mo16630b(String str, long j);

    /* renamed from: b */
    void mo16629b(String[] strArr, byte[] bArr, long j);

    /* renamed from: c */
    void mo16628c(long j);

    /* renamed from: d */
    String mo16627d(long j);
}
