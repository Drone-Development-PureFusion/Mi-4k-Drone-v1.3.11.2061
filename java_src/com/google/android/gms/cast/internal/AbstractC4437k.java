package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
/* renamed from: com.google.android.gms.cast.internal.k */
/* loaded from: classes2.dex */
public interface AbstractC4437k extends IInterface {

    /* renamed from: com.google.android.gms.cast.internal.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4438a extends Binder implements AbstractC4437k {
        public AbstractBinderC4438a() {
            attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            DeviceStatus deviceStatus = null;
            ApplicationMetadata applicationMetadata = null;
            ApplicationStatus applicationStatus = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    a(parcel.readInt());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if (parcel.readInt() != 0) {
                        applicationMetadata = ApplicationMetadata.CREATOR.createFromParcel(parcel);
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(applicationMetadata, readString, readString2, z);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    b(parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    String readString3 = parcel.readString();
                    double readDouble = parcel.readDouble();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readString3, readDouble, z);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    a(parcel.readString(), parcel.readString());
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    a(parcel.readString(), parcel.createByteArray());
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    d(parcel.readInt());
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    c(parcel.readInt());
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    e(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    a(parcel.readString(), parcel.readLong(), parcel.readInt());
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    a(parcel.readString(), parcel.readLong());
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if (parcel.readInt() != 0) {
                        applicationStatus = ApplicationStatus.CREATOR.createFromParcel(parcel);
                    }
                    a(applicationStatus);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if (parcel.readInt() != 0) {
                        deviceStatus = DeviceStatus.CREATOR.createFromParcel(parcel);
                    }
                    a(deviceStatus);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo24179a(int i);

    /* renamed from: a */
    void mo24178a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z);

    /* renamed from: a */
    void mo24177a(ApplicationStatus applicationStatus);

    /* renamed from: a */
    void mo24176a(DeviceStatus deviceStatus);

    /* renamed from: a */
    void mo24175a(String str, double d, boolean z);

    /* renamed from: a */
    void mo24174a(String str, long j);

    /* renamed from: a */
    void mo24173a(String str, long j, int i);

    /* renamed from: a */
    void mo24172a(String str, String str2);

    /* renamed from: a */
    void mo24171a(String str, byte[] bArr);

    /* renamed from: b */
    void mo24170b(int i);

    /* renamed from: c */
    void mo24169c(int i);

    /* renamed from: d */
    void mo24168d(int i);

    /* renamed from: e */
    void mo24167e(int i);
}
