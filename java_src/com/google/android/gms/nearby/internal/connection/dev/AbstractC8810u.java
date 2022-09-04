package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.C4235f;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.nearby.connection.dev.AppMetadata;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8807t;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.u */
/* loaded from: classes2.dex */
public interface AbstractC8810u extends IInterface {

    /* renamed from: com.google.android.gms.nearby.internal.connection.dev.u$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8811a extends Binder implements AbstractC8810u {

        /* renamed from: com.google.android.gms.nearby.internal.connection.dev.u$a$a */
        /* loaded from: classes2.dex */
        private static class C8812a implements AbstractC8810u {

            /* renamed from: a */
            private IBinder f28162a;

            C8812a(IBinder iBinder) {
                this.f28162a = iBinder;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public String mo10023a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    this.f28162a.transact(AbstractC8240d.f27006bi, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public String mo10018a(GetLocalDeviceIdParams getLocalDeviceIdParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (getLocalDeviceIdParams != null) {
                        obtain.writeInt(1);
                        getLocalDeviceIdParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2013, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public String mo10017a(GetLocalEndpointIdParams getLocalEndpointIdParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (getLocalEndpointIdParams != null) {
                        obtain.writeInt(1);
                        getLocalEndpointIdParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2012, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10022a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f28162a.transact(1002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10021a(AcceptConnectionRequestParams acceptConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (acceptConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        acceptConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(C4235f.f16109k, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10020a(ClientDisconnectingParams clientDisconnectingParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (clientDisconnectingParams != null) {
                        obtain.writeInt(1);
                        clientDisconnectingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10019a(DisconnectFromEndpointParams disconnectFromEndpointParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (disconnectFromEndpointParams != null) {
                        obtain.writeInt(1);
                        disconnectFromEndpointParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10016a(RejectConnectionRequestParams rejectConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (rejectConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        rejectConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(C4235f.f16110l, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10015a(SendConnectionRequestParams sendConnectionRequestParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (sendConnectionRequestParams != null) {
                        obtain.writeInt(1);
                        sendConnectionRequestParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(C4235f.f16108j, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10014a(SendPayloadParams sendPayloadParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (sendPayloadParams != null) {
                        obtain.writeInt(1);
                        sendPayloadParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10013a(StartAdvertisingParams startAdvertisingParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (startAdvertisingParams != null) {
                        obtain.writeInt(1);
                        startAdvertisingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10012a(StartDiscoveryParams startDiscoveryParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (startDiscoveryParams != null) {
                        obtain.writeInt(1);
                        startDiscoveryParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(C4235f.f16106h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10011a(StopAdvertisingParams stopAdvertisingParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (stopAdvertisingParams != null) {
                        obtain.writeInt(1);
                        stopAdvertisingParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10010a(StopAllEndpointsParams stopAllEndpointsParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (stopAllEndpointsParams != null) {
                        obtain.writeInt(1);
                        stopAllEndpointsParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(2010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10009a(StopDiscoveryParams stopDiscoveryParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    if (stopDiscoveryParams != null) {
                        obtain.writeInt(1);
                        stopDiscoveryParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28162a.transact(C4235f.f16107i, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10008a(AbstractC8807t abstractC8807t, String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(abstractC8807t != null ? abstractC8807t.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f26999bb, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10007a(AbstractC8807t abstractC8807t, String str, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(abstractC8807t != null ? abstractC8807t.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f28162a.transact(1003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10006a(AbstractC8807t abstractC8807t, String str, AppMetadata appMetadata, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(abstractC8807t != null ? abstractC8807t.asBinder() : null);
                    obtain.writeString(str);
                    if (appMetadata != null) {
                        obtain.writeInt(1);
                        appMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f28162a.transact(1001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10005a(AbstractC8807t abstractC8807t, String str, String str2, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(abstractC8807t != null ? abstractC8807t.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f28162a.transact(1007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10004a(AbstractC8807t abstractC8807t, String str, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStrongBinder(abstractC8807t != null ? abstractC8807t.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f26998ba, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10003a(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f26967aW, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: a */
            public void mo10002a(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f27000bc, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28162a;
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: b */
            public void mo10001b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f27003bf, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: b */
            public void mo10000b(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f27002be, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: b */
            public void mo9999b(String[] strArr, byte[] bArr, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeStringArray(strArr);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f27001bd, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: c */
            public void mo9998c(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f27004bg, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u
            /* renamed from: d */
            public String mo9997d(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    obtain.writeLong(j);
                    this.f28162a.transact(AbstractC8240d.f27005bh, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8810u m10024a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8810u)) ? new C8812a(iBinder) : (AbstractC8810u) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AppMetadata appMetadata = null;
            switch (i) {
                case 1001:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    AbstractC8807t m10036a = AbstractC8807t.AbstractBinderC8808a.m10036a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        appMetadata = AppMetadata.CREATOR.createFromParcel(parcel);
                    }
                    a(m10036a, readString, appMetadata, parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1002:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1003:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(AbstractC8807t.AbstractBinderC8808a.m10036a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26967aW /* 1004 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1007:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(AbstractC8807t.AbstractBinderC8808a.m10036a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26998ba /* 1008 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(AbstractC8807t.AbstractBinderC8808a.m10036a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f26999bb /* 1009 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(AbstractC8807t.AbstractBinderC8808a.m10036a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27000bc /* 1010 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27001bd /* 1011 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    b(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27002be /* 1012 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    b(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27003bf /* 1013 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27004bg /* 1014 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    c(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case AbstractC8240d.f27005bh /* 1015 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    String d = d(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    return true;
                case AbstractC8240d.f27006bi /* 1016 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 2001:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? StartAdvertisingParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2002:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? StopAdvertisingParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C4235f.f16106h /* 2003 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? StartDiscoveryParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C4235f.f16107i /* 2004 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? StopDiscoveryParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C4235f.f16108j /* 2005 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? SendConnectionRequestParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C4235f.f16109k /* 2006 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? AcceptConnectionRequestParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C4235f.f16110l /* 2007 */:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? RejectConnectionRequestParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2008:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? SendPayloadParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2009:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? DisconnectFromEndpointParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2010:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? StopAllEndpointsParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2011:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    a(parcel.readInt() != 0 ? ClientDisconnectingParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2012:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    String a2 = a(parcel.readInt() != 0 ? GetLocalEndpointIdParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(a2);
                    return true;
                case 2013:
                    parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    String a3 = a(parcel.readInt() != 0 ? GetLocalDeviceIdParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(a3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo10023a();

    /* renamed from: a */
    String mo10018a(GetLocalDeviceIdParams getLocalDeviceIdParams);

    /* renamed from: a */
    String mo10017a(GetLocalEndpointIdParams getLocalEndpointIdParams);

    /* renamed from: a */
    void mo10022a(long j);

    /* renamed from: a */
    void mo10021a(AcceptConnectionRequestParams acceptConnectionRequestParams);

    /* renamed from: a */
    void mo10020a(ClientDisconnectingParams clientDisconnectingParams);

    /* renamed from: a */
    void mo10019a(DisconnectFromEndpointParams disconnectFromEndpointParams);

    /* renamed from: a */
    void mo10016a(RejectConnectionRequestParams rejectConnectionRequestParams);

    /* renamed from: a */
    void mo10015a(SendConnectionRequestParams sendConnectionRequestParams);

    /* renamed from: a */
    void mo10014a(SendPayloadParams sendPayloadParams);

    /* renamed from: a */
    void mo10013a(StartAdvertisingParams startAdvertisingParams);

    /* renamed from: a */
    void mo10012a(StartDiscoveryParams startDiscoveryParams);

    /* renamed from: a */
    void mo10011a(StopAdvertisingParams stopAdvertisingParams);

    /* renamed from: a */
    void mo10010a(StopAllEndpointsParams stopAllEndpointsParams);

    /* renamed from: a */
    void mo10009a(StopDiscoveryParams stopDiscoveryParams);

    /* renamed from: a */
    void mo10008a(AbstractC8807t abstractC8807t, String str, long j);

    /* renamed from: a */
    void mo10007a(AbstractC8807t abstractC8807t, String str, long j, long j2);

    /* renamed from: a */
    void mo10006a(AbstractC8807t abstractC8807t, String str, AppMetadata appMetadata, long j, long j2);

    /* renamed from: a */
    void mo10005a(AbstractC8807t abstractC8807t, String str, String str2, byte[] bArr, long j);

    /* renamed from: a */
    void mo10004a(AbstractC8807t abstractC8807t, String str, byte[] bArr, long j);

    /* renamed from: a */
    void mo10003a(String str, long j);

    /* renamed from: a */
    void mo10002a(String[] strArr, byte[] bArr, long j);

    /* renamed from: b */
    void mo10001b(long j);

    /* renamed from: b */
    void mo10000b(String str, long j);

    /* renamed from: b */
    void mo9999b(String[] strArr, byte[] bArr, long j);

    /* renamed from: c */
    void mo9998c(long j);

    /* renamed from: d */
    String mo9997d(long j);
}
