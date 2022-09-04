package com.google.android.gms.location.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.location.internal.g */
/* loaded from: classes2.dex */
public interface AbstractC8198g extends IInterface {

    /* renamed from: com.google.android.gms.location.internal.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8199a extends Binder implements AbstractC8198g {

        /* renamed from: com.google.android.gms.location.internal.g$a$a */
        /* loaded from: classes2.dex */
        private static class C8200a implements AbstractC8198g {

            /* renamed from: a */
            private IBinder f26805a;

            C8200a(IBinder iBinder) {
                this.f26805a = iBinder;
            }

            @Override // com.google.android.gms.location.internal.AbstractC8198g
            /* renamed from: a */
            public void mo12473a(FusedLocationProviderResult fusedLocationProviderResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    if (fusedLocationProviderResult != null) {
                        obtain.writeInt(1);
                        fusedLocationProviderResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26805a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26805a;
            }
        }

        public AbstractBinderC8199a() {
            attachInterface(this, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        }

        /* renamed from: a */
        public static AbstractC8198g m12474a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8198g)) ? new C8200a(iBinder) : (AbstractC8198g) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    a(parcel.readInt() != 0 ? FusedLocationProviderResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12473a(FusedLocationProviderResult fusedLocationProviderResult);
}
