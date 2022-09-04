package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;
/* loaded from: classes2.dex */
public interface alg extends IInterface {

    /* renamed from: com.google.android.gms.internal.alg$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6493a extends Binder implements alg {

        /* renamed from: com.google.android.gms.internal.alg$a$a */
        /* loaded from: classes2.dex */
        private static class C6494a implements alg {

            /* renamed from: a */
            private IBinder f22161a;

            C6494a(IBinder iBinder) {
                this.f22161a = iBinder;
            }

            @Override // com.google.android.gms.internal.alg
            /* renamed from: a */
            public void mo16959a(DeleteAllUserDataRequest deleteAllUserDataRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                    if (deleteAllUserDataRequest != null) {
                        obtain.writeInt(1);
                        deleteAllUserDataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22161a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22161a;
            }
        }

        /* renamed from: a */
        public static alg m16960a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alg)) ? new C6494a(iBinder) : (alg) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                    a(parcel.readInt() != 0 ? DeleteAllUserDataRequest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16959a(DeleteAllUserDataRequest deleteAllUserDataRequest);
}
