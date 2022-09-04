package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.drive.realtime.internal.c */
/* loaded from: classes2.dex */
public interface AbstractC5054c extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5055a extends Binder implements AbstractC5054c {

        /* renamed from: com.google.android.gms.drive.realtime.internal.c$a$a */
        /* loaded from: classes2.dex */
        private static class C5056a implements AbstractC5054c {

            /* renamed from: a */
            private IBinder f18130a;

            C5056a(IBinder iBinder) {
                this.f18130a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5054c
            /* renamed from: a */
            public void mo21936a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18130a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5054c
            /* renamed from: a */
            public void mo21935a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f18130a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18130a;
            }
        }

        /* renamed from: a */
        public static AbstractC5054c m21937a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5054c)) ? new C5056a(iBinder) : (AbstractC5054c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21936a(Status status);

    /* renamed from: a */
    void mo21935a(boolean z);
}
