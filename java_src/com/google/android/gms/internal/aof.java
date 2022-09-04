package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
/* loaded from: classes2.dex */
public interface aof extends IInterface {

    /* renamed from: com.google.android.gms.internal.aof$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6679a extends Binder implements aof {

        /* renamed from: com.google.android.gms.internal.aof$a$a */
        /* loaded from: classes2.dex */
        private static class C6680a implements aof {

            /* renamed from: a */
            private IBinder f22570a;

            C6680a(IBinder iBinder) {
                this.f22570a = iBinder;
            }

            @Override // com.google.android.gms.internal.aof
            /* renamed from: a */
            public void mo16511a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22570a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aof
            /* renamed from: a */
            public void mo16507a(Status status, GoogleNowAuthState googleNowAuthState) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (googleNowAuthState != null) {
                        obtain.writeInt(1);
                        googleNowAuthState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22570a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22570a;
            }
        }

        public AbstractBinderC6679a() {
            attachInterface(this, "com.google.android.gms.search.internal.ISearchAuthCallbacks");
        }

        /* renamed from: a */
        public static aof m16519a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aof)) ? new C6680a(iBinder) : (aof) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? GoogleNowAuthState.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16511a(Status status);

    /* renamed from: a */
    void mo16507a(Status status, GoogleNowAuthState googleNowAuthState);
}
