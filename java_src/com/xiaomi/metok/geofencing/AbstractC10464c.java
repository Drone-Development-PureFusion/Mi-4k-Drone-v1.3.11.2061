package com.xiaomi.metok.geofencing;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
/* renamed from: com.xiaomi.metok.geofencing.c */
/* loaded from: classes2.dex */
public interface AbstractC10464c extends IInterface {

    /* renamed from: com.xiaomi.metok.geofencing.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC10465a extends Binder implements AbstractC10464c {

        /* renamed from: com.xiaomi.metok.geofencing.c$a$a */
        /* loaded from: classes2.dex */
        private static class C10466a implements AbstractC10464c {

            /* renamed from: a */
            private IBinder f32536a;

            C10466a(IBinder iBinder) {
                this.f32536a = iBinder;
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: a */
            public String mo5058a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    this.f32536a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: a */
            public void mo5057a(double d, double d2, float f, long j, PendingIntent pendingIntent, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeFloat(f);
                    obtain.writeLong(j);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f32536a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: a */
            public void mo5056a(double d, double d2, float f, long j, String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeFloat(f);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f32536a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: a */
            public void mo5055a(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f32536a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: a */
            public void mo5054a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    obtain.writeString(str);
                    this.f32536a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: a */
            public void mo5053a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f32536a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: a */
            public void mo5052a(List<String> list, String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    obtain.writeStringList(list);
                    obtain.writeString(str);
                    this.f32536a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32536a;
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: b */
            public int mo5051b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    this.f32536a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xiaomi.metok.geofencing.AbstractC10464c
            /* renamed from: b */
            public List<String> mo5050b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.metok.geofencing.IGeoFencing");
                    obtain.writeString(str);
                    this.f32536a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC10464c m5059a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.metok.geofencing.IGeoFencing");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC10464c)) ? new C10466a(iBinder) : (AbstractC10464c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    a(parcel.createStringArrayList(), parcel.readString());
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    a(parcel.readString());
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    List<String> b = b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStringList(b);
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    int b2 = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b2);
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    a(parcel.readDouble(), parcel.readDouble(), parcel.readFloat(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    a(parcel.readDouble(), parcel.readDouble(), parcel.readFloat(), parcel.readLong(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                    return true;
                case 8:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    a(parcel.readString(), parcel.readString());
                    return true;
                case 9:
                    parcel.enforceInterface("com.xiaomi.metok.geofencing.IGeoFencing");
                    a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.xiaomi.metok.geofencing.IGeoFencing");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo5058a();

    /* renamed from: a */
    void mo5057a(double d, double d2, float f, long j, PendingIntent pendingIntent, String str, String str2);

    /* renamed from: a */
    void mo5056a(double d, double d2, float f, long j, String str, String str2, String str3);

    /* renamed from: a */
    void mo5055a(PendingIntent pendingIntent);

    /* renamed from: a */
    void mo5054a(String str);

    /* renamed from: a */
    void mo5053a(String str, String str2);

    /* renamed from: a */
    void mo5052a(List<String> list, String str);

    /* renamed from: b */
    int mo5051b();

    /* renamed from: b */
    List<String> mo5050b(String str);
}
