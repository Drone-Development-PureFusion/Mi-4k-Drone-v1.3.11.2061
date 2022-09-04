package com.google.android.gms.iid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
/* renamed from: com.google.android.gms.iid.c */
/* loaded from: classes.dex */
public interface AbstractC6097c extends IInterface {

    /* renamed from: com.google.android.gms.iid.c$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC6098a extends Binder implements AbstractC6097c {

        /* renamed from: com.google.android.gms.iid.c$a$a */
        /* loaded from: classes.dex */
        private static class C6099a implements AbstractC6097c {

            /* renamed from: a */
            private IBinder f20628a;

            C6099a(IBinder iBinder) {
                this.f20628a = iBinder;
            }

            @Override // com.google.android.gms.iid.AbstractC6097c
            /* renamed from: a */
            public void mo18736a(Message message) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
                    if (message != null) {
                        obtain.writeInt(1);
                        message.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20628a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20628a;
            }
        }

        public AbstractBinderC6098a() {
            attachInterface(this, "com.google.android.gms.iid.IMessengerCompat");
        }

        /* renamed from: a */
        public static AbstractC6097c m18737a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6097c)) ? new C6099a(iBinder) : (AbstractC6097c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
                    a(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.iid.IMessengerCompat");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo18736a(Message message);
}
