package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.GoalsReadRequest;
/* loaded from: classes2.dex */
public interface ale extends IInterface {

    /* renamed from: com.google.android.gms.internal.ale$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6489a extends Binder implements ale {

        /* renamed from: com.google.android.gms.internal.ale$a$a */
        /* loaded from: classes2.dex */
        private static class C6490a implements ale {

            /* renamed from: a */
            private IBinder f22159a;

            C6490a(IBinder iBinder) {
                this.f22159a = iBinder;
            }

            @Override // com.google.android.gms.internal.ale
            /* renamed from: a */
            public void mo16974a(GoalsReadRequest goalsReadRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
                    if (goalsReadRequest != null) {
                        obtain.writeInt(1);
                        goalsReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22159a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22159a;
            }
        }

        /* renamed from: a */
        public static ale m16975a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ale)) ? new C6490a(iBinder) : (ale) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
                    a(parcel.readInt() != 0 ? GoalsReadRequest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16974a(GoalsReadRequest goalsReadRequest);
}
