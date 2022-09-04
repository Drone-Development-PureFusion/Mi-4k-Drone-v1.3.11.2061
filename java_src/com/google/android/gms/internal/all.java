package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
/* loaded from: classes2.dex */
public interface all extends IInterface {

    /* renamed from: com.google.android.gms.internal.all$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6502a extends Binder implements all {

        /* renamed from: com.google.android.gms.internal.all$a$a */
        /* loaded from: classes2.dex */
        private static class C6503a implements all {

            /* renamed from: a */
            private IBinder f22170a;

            C6503a(IBinder iBinder) {
                this.f22170a = iBinder;
            }

            @Override // com.google.android.gms.internal.all
            /* renamed from: a */
            public void mo16877a(ListSubscriptionsResult listSubscriptionsResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                    if (listSubscriptionsResult != null) {
                        obtain.writeInt(1);
                        listSubscriptionsResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22170a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22170a;
            }
        }

        public AbstractBinderC6502a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
        }

        /* renamed from: a */
        public static all m16939a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof all)) ? new C6503a(iBinder) : (all) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                    a(parcel.readInt() != 0 ? ListSubscriptionsResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16877a(ListSubscriptionsResult listSubscriptionsResult);
}
