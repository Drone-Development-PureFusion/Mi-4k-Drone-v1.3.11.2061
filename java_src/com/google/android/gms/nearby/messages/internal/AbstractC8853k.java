package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.nearby.messages.internal.k */
/* loaded from: classes2.dex */
public interface AbstractC8853k extends IInterface {

    /* renamed from: com.google.android.gms.nearby.messages.internal.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8854a extends Binder implements AbstractC8853k {

        /* renamed from: com.google.android.gms.nearby.messages.internal.k$a$a */
        /* loaded from: classes2.dex */
        private static class C8855a implements AbstractC8853k {

            /* renamed from: a */
            private IBinder f28333a;

            C8855a(IBinder iBinder) {
                this.f28333a = iBinder;
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8853k
            /* renamed from: a */
            public void mo9782a(Status status) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28333a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28333a;
            }
        }

        public AbstractBinderC8854a() {
            attachInterface(this, "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
        }

        /* renamed from: a */
        public static AbstractC8853k m9863a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8853k)) ? new C8855a(iBinder) : (AbstractC8853k) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9782a(Status status);
}
