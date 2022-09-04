package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.drive.internal.p */
/* loaded from: classes2.dex */
public interface AbstractC4970p extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.p$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4971a extends Binder implements AbstractC4970p {

        /* renamed from: com.google.android.gms.drive.internal.p$a$a */
        /* loaded from: classes2.dex */
        private static class C4972a implements AbstractC4970p {

            /* renamed from: a */
            private IBinder f17956a;

            C4972a(IBinder iBinder) {
                this.f17956a = iBinder;
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4970p
            /* renamed from: a */
            public void mo22255a(OnEventResponse onEventResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IEventCallback");
                    if (onEventResponse != null) {
                        obtain.writeInt(1);
                        onEventResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17956a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17956a;
            }
        }

        public AbstractBinderC4971a() {
            attachInterface(this, "com.google.android.gms.drive.internal.IEventCallback");
        }

        /* renamed from: a */
        public static AbstractC4970p m22256a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4970p)) ? new C4972a(iBinder) : (AbstractC4970p) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IEventCallback");
                    a(parcel.readInt() != 0 ? OnEventResponse.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IEventCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo22255a(OnEventResponse onEventResponse);
}
