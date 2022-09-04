package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.location.internal.h */
/* loaded from: classes2.dex */
public interface AbstractC8201h extends IInterface {

    /* renamed from: com.google.android.gms.location.internal.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8202a extends Binder implements AbstractC8201h {

        /* renamed from: com.google.android.gms.location.internal.h$a$a */
        /* loaded from: classes2.dex */
        private static class C8203a implements AbstractC8201h {

            /* renamed from: a */
            private IBinder f26806a;

            C8203a(IBinder iBinder) {
                this.f26806a = iBinder;
            }

            @Override // com.google.android.gms.location.internal.AbstractC8201h
            /* renamed from: a */
            public void mo12399a(int i, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26806a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8201h
            /* renamed from: a */
            public void mo12398a(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f26806a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26806a;
            }

            @Override // com.google.android.gms.location.internal.AbstractC8201h
            /* renamed from: b */
            public void mo12397b(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f26806a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8202a() {
            attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
        }

        /* renamed from: a */
        public static AbstractC8201h m12472a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8201h)) ? new C8203a(iBinder) : (AbstractC8201h) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    a(parcel.readInt(), parcel.createStringArray());
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    b(parcel.readInt(), parcel.createStringArray());
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12399a(int i, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12398a(int i, String[] strArr);

    /* renamed from: b */
    void mo12397b(int i, String[] strArr);
}
