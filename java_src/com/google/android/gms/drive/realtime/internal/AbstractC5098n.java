package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.drive.realtime.internal.n */
/* loaded from: classes2.dex */
public interface AbstractC5098n extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.n$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5099a extends Binder implements AbstractC5098n {

        /* renamed from: com.google.android.gms.drive.realtime.internal.n$a$a */
        /* loaded from: classes2.dex */
        private static class C5100a implements AbstractC5098n {

            /* renamed from: a */
            private IBinder f18199a;

            C5100a(IBinder iBinder) {
                this.f18199a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5098n
            /* renamed from: a */
            public void mo21823a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18199a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5098n
            /* renamed from: a */
            public void mo21822a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    obtain.writeString(str);
                    this.f18199a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18199a;
            }
        }

        /* renamed from: a */
        public static AbstractC5098n m21824a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5098n)) ? new C5100a(iBinder) : (AbstractC5098n) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21823a(Status status);

    /* renamed from: a */
    void mo21822a(String str);
}
