package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
/* renamed from: com.google.android.gms.cast.internal.j */
/* loaded from: classes2.dex */
public interface AbstractC4434j extends IInterface {

    /* renamed from: com.google.android.gms.cast.internal.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4435a extends Binder implements AbstractC4434j {

        /* renamed from: com.google.android.gms.cast.internal.j$a$a */
        /* loaded from: classes2.dex */
        private static class C4436a implements AbstractC4434j {

            /* renamed from: a */
            private IBinder f16659a;

            C4436a(IBinder iBinder) {
                this.f16659a = iBinder;
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24194a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.f16659a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24193a(double d, double d2, boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f16659a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24192a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.f16659a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24191a(String str, LaunchOptions launchOptions) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    if (launchOptions != null) {
                        obtain.writeInt(1);
                        launchOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16659a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24190a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f16659a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24189a(String str, String str2, long j) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    this.f16659a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24188a(String str, String str2, long j, String str3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    obtain.writeString(str3);
                    this.f16659a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24187a(String str, String str2, JoinOptions joinOptions) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (joinOptions != null) {
                        obtain.writeInt(1);
                        joinOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16659a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24186a(String str, boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f16659a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24185a(String str, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f16659a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: a */
            public void mo24184a(boolean z, double d, boolean z2) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeDouble(d);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f16659a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16659a;
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: b */
            public void mo24183b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.f16659a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: b */
            public void mo24182b(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.f16659a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: c */
            public void mo24181c() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.f16659a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.internal.AbstractC4434j
            /* renamed from: c */
            public void mo24180c(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.f16659a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4434j m24195a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4434j)) ? new C4436a(iBinder) : (AbstractC4434j) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readString, z);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString());
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    b();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString());
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    c();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    boolean z2 = parcel.readInt() != 0;
                    double readDouble = parcel.readDouble();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z2, readDouble, z);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString(), parcel.readLong());
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    b(parcel.readString());
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    c(parcel.readString());
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readInt() != 0 ? LaunchOptions.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? JoinOptions.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo24194a();

    /* renamed from: a */
    void mo24193a(double d, double d2, boolean z);

    /* renamed from: a */
    void mo24192a(String str);

    /* renamed from: a */
    void mo24191a(String str, LaunchOptions launchOptions);

    /* renamed from: a */
    void mo24190a(String str, String str2);

    /* renamed from: a */
    void mo24189a(String str, String str2, long j);

    /* renamed from: a */
    void mo24188a(String str, String str2, long j, String str3);

    /* renamed from: a */
    void mo24187a(String str, String str2, JoinOptions joinOptions);

    /* renamed from: a */
    void mo24186a(String str, boolean z);

    /* renamed from: a */
    void mo24185a(String str, byte[] bArr, long j);

    /* renamed from: a */
    void mo24184a(boolean z, double d, boolean z2);

    /* renamed from: b */
    void mo24183b();

    /* renamed from: b */
    void mo24182b(String str);

    /* renamed from: c */
    void mo24181c();

    /* renamed from: c */
    void mo24180c(String str);
}
