package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import java.util.List;
/* loaded from: classes2.dex */
public interface anv extends IInterface {

    /* renamed from: com.google.android.gms.internal.anv$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6655a extends Binder implements anv {

        /* renamed from: com.google.android.gms.internal.anv$a$a */
        /* loaded from: classes2.dex */
        private static class C6656a implements anv {

            /* renamed from: a */
            private IBinder f22506a;

            C6656a(IBinder iBinder) {
                this.f22506a = iBinder;
            }

            @Override // com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16584a(Status status, AttestationData attestationData) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (attestationData != null) {
                        obtain.writeInt(1);
                        attestationData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22506a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16578a(Status status, SafeBrowsingData safeBrowsingData) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (safeBrowsingData != null) {
                        obtain.writeInt(1);
                        safeBrowsingData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22506a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16580a(Status status, List<HarmfulAppsData> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f22506a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16582a(Status status, boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f22506a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anv
            /* renamed from: a */
            public void mo16598a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    obtain.writeString(str);
                    this.f22506a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22506a;
            }
        }

        public AbstractBinderC6655a() {
            attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        }

        /* renamed from: a */
        public static anv m16599a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anv)) ? new C6656a(iBinder) : (anv) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? AttestationData.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    a(parcel.readString());
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? SafeBrowsingData.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(HarmfulAppsData.CREATOR));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16584a(Status status, AttestationData attestationData);

    /* renamed from: a */
    void mo16578a(Status status, SafeBrowsingData safeBrowsingData);

    /* renamed from: a */
    void mo16580a(Status status, List<HarmfulAppsData> list);

    /* renamed from: a */
    void mo16582a(Status status, boolean z);

    /* renamed from: a */
    void mo16598a(String str);
}
