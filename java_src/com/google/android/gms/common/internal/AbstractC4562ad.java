package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.common.internal.ad */
/* loaded from: classes2.dex */
public interface AbstractC4562ad extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.ad$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4563a extends Binder implements AbstractC4562ad {

        /* renamed from: com.google.android.gms.common.internal.ad$a$a */
        /* loaded from: classes2.dex */
        private static class C4564a implements AbstractC4562ad {

            /* renamed from: a */
            private IBinder f17030a;

            C4564a(IBinder iBinder) {
                this.f17030a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4562ad
            /* renamed from: a */
            public void mo23699a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
                    this.f17030a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17030a;
            }
        }

        /* renamed from: a */
        public static AbstractC4562ad m23700a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4562ad)) ? new C4564a(iBinder) : (AbstractC4562ad) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
                    a();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.ICancelToken");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo23699a();
}
