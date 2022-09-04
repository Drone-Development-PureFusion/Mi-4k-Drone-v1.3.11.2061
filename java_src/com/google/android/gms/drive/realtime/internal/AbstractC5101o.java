package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.drive.realtime.internal.o */
/* loaded from: classes2.dex */
public interface AbstractC5101o extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.o$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5102a extends Binder implements AbstractC5101o {

        /* renamed from: com.google.android.gms.drive.realtime.internal.o$a$a */
        /* loaded from: classes2.dex */
        private static class C5103a implements AbstractC5101o {

            /* renamed from: a */
            private IBinder f18200a;

            C5103a(IBinder iBinder) {
                this.f18200a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5101o
            /* renamed from: a */
            public void mo21820a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    this.f18200a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5101o
            /* renamed from: a */
            public void mo21819a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18200a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18200a;
            }
        }

        /* renamed from: a */
        public static AbstractC5101o m21821a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5101o)) ? new C5103a(iBinder) : (AbstractC5101o) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21820a();

    /* renamed from: a */
    void mo21819a(Status status);
}
