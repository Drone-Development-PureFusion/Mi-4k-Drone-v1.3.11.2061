package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.wearable.internal.v */
/* loaded from: classes2.dex */
public interface AbstractC9612v extends IInterface {

    /* renamed from: com.google.android.gms.wearable.internal.v$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9613a extends Binder implements AbstractC9612v {

        /* renamed from: com.google.android.gms.wearable.internal.v$a$a */
        /* loaded from: classes2.dex */
        private static class C9614a implements AbstractC9612v {

            /* renamed from: a */
            private IBinder f30143a;

            C9614a(IBinder iBinder) {
                this.f30143a = iBinder;
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9612v
            /* renamed from: a */
            public void mo7735a(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f30143a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30143a;
            }
        }

        public AbstractBinderC9613a() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
        }

        /* renamed from: a */
        public static AbstractC9612v m7736a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9612v)) ? new C9614a(iBinder) : (AbstractC9612v) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    a(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo7735a(int i, int i2);
}
