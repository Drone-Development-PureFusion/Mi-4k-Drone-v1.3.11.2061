package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SyncInfoResult;
/* loaded from: classes2.dex */
public interface alr extends IInterface {

    /* renamed from: com.google.android.gms.internal.alr$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6514a extends Binder implements alr {

        /* renamed from: com.google.android.gms.internal.alr$a$a */
        /* loaded from: classes2.dex */
        private static class C6515a implements alr {

            /* renamed from: a */
            private IBinder f22176a;

            C6515a(IBinder iBinder) {
                this.f22176a = iBinder;
            }

            @Override // com.google.android.gms.internal.alr
            /* renamed from: a */
            public void mo16930a(SyncInfoResult syncInfoResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.ISyncInfoCallback");
                    if (syncInfoResult != null) {
                        obtain.writeInt(1);
                        syncInfoResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22176a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22176a;
            }
        }

        /* renamed from: a */
        public static alr m16931a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alr)) ? new C6515a(iBinder) : (alr) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
                    a(parcel.readInt() != 0 ? SyncInfoResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.ISyncInfoCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16930a(SyncInfoResult syncInfoResult);
}
