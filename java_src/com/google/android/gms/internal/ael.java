package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public interface ael extends IInterface {

    /* renamed from: com.google.android.gms.internal.ael$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6236a extends Binder implements ael {

        /* renamed from: com.google.android.gms.internal.ael$a$a */
        /* loaded from: classes2.dex */
        private static class C6237a implements ael {

            /* renamed from: a */
            private IBinder f21360a;

            C6237a(IBinder iBinder) {
                this.f21360a = iBinder;
            }

            @Override // com.google.android.gms.internal.ael
            /* renamed from: a */
            public void mo17855a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21360a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.ael
            /* renamed from: a */
            public void mo17854a(Status status, Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21360a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21360a;
            }
        }

        public AbstractBinderC6236a() {
            attachInterface(this, "com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
        }

        /* renamed from: a */
        public static ael m17856a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ael)) ? new C6237a(iBinder) : (ael) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17855a(Status status);

    /* renamed from: a */
    void mo17854a(Status status, Intent intent);
}
