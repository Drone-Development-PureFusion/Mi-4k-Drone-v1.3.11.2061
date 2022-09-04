package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataStatsResult;
/* loaded from: classes2.dex */
public interface aln extends IInterface {

    /* renamed from: com.google.android.gms.internal.aln$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6506a extends Binder implements aln {

        /* renamed from: com.google.android.gms.internal.aln$a$a */
        /* loaded from: classes2.dex */
        private static class C6507a implements aln {

            /* renamed from: a */
            private IBinder f22172a;

            C6507a(IBinder iBinder) {
                this.f22172a = iBinder;
            }

            @Override // com.google.android.gms.internal.aln
            /* renamed from: a */
            public void mo16935a(DataStatsResult dataStatsResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IReadStatsCallback");
                    if (dataStatsResult != null) {
                        obtain.writeInt(1);
                        dataStatsResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22172a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22172a;
            }
        }

        /* renamed from: a */
        public static aln m16936a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aln)) ? new C6507a(iBinder) : (aln) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
                    a(parcel.readInt() != 0 ? DataStatsResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IReadStatsCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16935a(DataStatsResult dataStatsResult);
}
