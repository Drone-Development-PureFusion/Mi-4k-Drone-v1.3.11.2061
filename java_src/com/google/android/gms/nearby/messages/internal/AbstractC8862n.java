package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.messages.internal.n */
/* loaded from: classes2.dex */
public interface AbstractC8862n extends IInterface {

    /* renamed from: com.google.android.gms.nearby.messages.internal.n$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8863a extends Binder implements AbstractC8862n {

        /* renamed from: com.google.android.gms.nearby.messages.internal.n$a$a */
        /* loaded from: classes2.dex */
        private static class C8864a implements AbstractC8862n {

            /* renamed from: a */
            private IBinder f28336a;

            C8864a(IBinder iBinder) {
                this.f28336a = iBinder;
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8862n
            /* renamed from: a */
            public void mo9817a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IStatusCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f28336a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28336a;
            }
        }

        public AbstractBinderC8863a() {
            attachInterface(this, "com.google.android.gms.nearby.messages.internal.IStatusCallback");
        }

        /* renamed from: a */
        public static AbstractC8862n m9852a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8862n)) ? new C8864a(iBinder) : (AbstractC8862n) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
                    a(parcel.readInt() != 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.messages.internal.IStatusCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9817a(boolean z);
}
