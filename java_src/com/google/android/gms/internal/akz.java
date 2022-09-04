package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataTypeResult;
/* loaded from: classes2.dex */
public interface akz extends IInterface {

    /* renamed from: com.google.android.gms.internal.akz$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6478a extends Binder implements akz {

        /* renamed from: com.google.android.gms.internal.akz$a$a */
        /* loaded from: classes2.dex */
        private static class C6479a implements akz {

            /* renamed from: a */
            private IBinder f22154a;

            C6479a(IBinder iBinder) {
                this.f22154a = iBinder;
            }

            @Override // com.google.android.gms.internal.akz
            /* renamed from: a */
            public void mo16914a(DataTypeResult dataTypeResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataTypeCallback");
                    if (dataTypeResult != null) {
                        obtain.writeInt(1);
                        dataTypeResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22154a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22154a;
            }
        }

        public AbstractBinderC6478a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataTypeCallback");
        }

        /* renamed from: a */
        public static akz m16990a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof akz)) ? new C6479a(iBinder) : (akz) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
                    a(parcel.readInt() != 0 ? DataTypeResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IDataTypeCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16914a(DataTypeResult dataTypeResult);
}
