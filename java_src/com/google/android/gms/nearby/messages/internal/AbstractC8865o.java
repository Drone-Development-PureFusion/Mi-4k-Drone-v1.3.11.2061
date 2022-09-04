package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.messages.internal.o */
/* loaded from: classes2.dex */
public interface AbstractC8865o extends IInterface {

    /* renamed from: com.google.android.gms.nearby.messages.internal.o$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8866a extends Binder implements AbstractC8865o {

        /* renamed from: com.google.android.gms.nearby.messages.internal.o$a$a */
        /* loaded from: classes2.dex */
        private static class C8867a implements AbstractC8865o {

            /* renamed from: a */
            private IBinder f28337a;

            C8867a(IBinder iBinder) {
                this.f28337a = iBinder;
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8865o
            /* renamed from: a */
            public void mo9815a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
                    this.f28337a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28337a;
            }
        }

        public AbstractBinderC8866a() {
            attachInterface(this, "com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
        }

        /* renamed from: a */
        public static AbstractC8865o m9851a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8865o)) ? new C8867a(iBinder) : (AbstractC8865o) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
                    a();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9815a();
}
