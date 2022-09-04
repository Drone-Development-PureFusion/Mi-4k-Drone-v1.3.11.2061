package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.GoalsResult;
/* loaded from: classes2.dex */
public interface alb extends IInterface {

    /* renamed from: com.google.android.gms.internal.alb$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6483a extends Binder implements alb {

        /* renamed from: com.google.android.gms.internal.alb$a$a */
        /* loaded from: classes2.dex */
        private static class C6484a implements alb {

            /* renamed from: a */
            private IBinder f22156a;

            C6484a(IBinder iBinder) {
                this.f22156a = iBinder;
            }

            @Override // com.google.android.gms.internal.alb
            /* renamed from: a */
            public void mo16986a(GoalsResult goalsResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoalsReadCallback");
                    if (goalsResult != null) {
                        obtain.writeInt(1);
                        goalsResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22156a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22156a;
            }
        }

        /* renamed from: a */
        public static alb m16987a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alb)) ? new C6484a(iBinder) : (alb) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
                    a(parcel.readInt() != 0 ? GoalsResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoalsReadCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16986a(GoalsResult goalsResult);
}
