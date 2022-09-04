package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.nearby.messages.internal.m */
/* loaded from: classes2.dex */
public interface AbstractC8859m extends IInterface {

    /* renamed from: com.google.android.gms.nearby.messages.internal.m$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8860a extends Binder implements AbstractC8859m {

        /* renamed from: com.google.android.gms.nearby.messages.internal.m$a$a */
        /* loaded from: classes2.dex */
        private static class C8861a implements AbstractC8859m {

            /* renamed from: a */
            private IBinder f28335a;

            C8861a(IBinder iBinder) {
                this.f28335a = iBinder;
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8859m
            /* renamed from: a */
            public void mo9821a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IPublishCallback");
                    this.f28335a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28335a;
            }
        }

        public AbstractBinderC8860a() {
            attachInterface(this, "com.google.android.gms.nearby.messages.internal.IPublishCallback");
        }

        /* renamed from: a */
        public static AbstractC8859m m9853a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8859m)) ? new C8861a(iBinder) : (AbstractC8859m) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
                    a();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.messages.internal.IPublishCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9821a();
}
