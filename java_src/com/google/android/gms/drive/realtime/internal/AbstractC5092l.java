package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.drive.realtime.internal.l */
/* loaded from: classes2.dex */
public interface AbstractC5092l extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.l$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5093a extends Binder implements AbstractC5092l {

        /* renamed from: com.google.android.gms.drive.realtime.internal.l$a$a */
        /* loaded from: classes2.dex */
        private static class C5094a implements AbstractC5092l {

            /* renamed from: a */
            private IBinder f18197a;

            C5094a(IBinder iBinder) {
                this.f18197a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5092l
            /* renamed from: a */
            public void mo21878a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    obtain.writeInt(i);
                    this.f18197a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5092l
            /* renamed from: a */
            public void mo21877a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18197a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18197a;
            }
        }

        /* renamed from: a */
        public static AbstractC5092l m21879a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5092l)) ? new C5094a(iBinder) : (AbstractC5092l) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21878a(int i);

    /* renamed from: a */
    void mo21877a(Status status);
}
