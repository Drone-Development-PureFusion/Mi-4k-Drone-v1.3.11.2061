package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface agy extends IInterface {

    /* renamed from: com.google.android.gms.internal.agy$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC6317a extends Binder implements agy {

        /* renamed from: com.google.android.gms.internal.agy$a$a */
        /* loaded from: classes.dex */
        private static class C6318a implements agy {

            /* renamed from: a */
            private IBinder f21683a;

            C6318a(IBinder iBinder) {
                this.f21683a = iBinder;
            }

            @Override // com.google.android.gms.internal.agy
            /* renamed from: a */
            public void mo17537a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    obtain.writeInt(i);
                    this.f21683a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21683a;
            }
        }

        public AbstractBinderC6317a() {
            attachInterface(this, "com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
        }

        /* renamed from: a */
        public static agy m17538a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof agy)) ? new C6318a(iBinder) : (agy) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    a(parcel.readInt());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17537a(int i);
}
