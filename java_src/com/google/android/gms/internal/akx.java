package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataReadResult;
/* loaded from: classes2.dex */
public interface akx extends IInterface {

    /* renamed from: com.google.android.gms.internal.akx$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6474a extends Binder implements akx {

        /* renamed from: com.google.android.gms.internal.akx$a$a */
        /* loaded from: classes2.dex */
        private static class C6475a implements akx {

            /* renamed from: a */
            private IBinder f22152a;

            C6475a(IBinder iBinder) {
                this.f22152a = iBinder;
            }

            @Override // com.google.android.gms.internal.akx
            /* renamed from: a */
            public void mo16893a(DataReadResult dataReadResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataReadCallback");
                    if (dataReadResult != null) {
                        obtain.writeInt(1);
                        dataReadResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22152a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22152a;
            }
        }

        public AbstractBinderC6474a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataReadCallback");
        }

        /* renamed from: a */
        public static akx m16992a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof akx)) ? new C6475a(iBinder) : (akx) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
                    a(parcel.readInt() != 0 ? DataReadResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IDataReadCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16893a(DataReadResult dataReadResult);
}
