package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataSourcesResult;
/* loaded from: classes2.dex */
public interface aky extends IInterface {

    /* renamed from: com.google.android.gms.internal.aky$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6476a extends Binder implements aky {

        /* renamed from: com.google.android.gms.internal.aky$a$a */
        /* loaded from: classes2.dex */
        private static class C6477a implements aky {

            /* renamed from: a */
            private IBinder f22153a;

            C6477a(IBinder iBinder) {
                this.f22153a = iBinder;
            }

            @Override // com.google.android.gms.internal.aky
            /* renamed from: a */
            public void mo16863a(DataSourcesResult dataSourcesResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    if (dataSourcesResult != null) {
                        obtain.writeInt(1);
                        dataSourcesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22153a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22153a;
            }
        }

        public AbstractBinderC6476a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
        }

        /* renamed from: a */
        public static aky m16991a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aky)) ? new C6477a(iBinder) : (aky) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    a(parcel.readInt() != 0 ? DataSourcesResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16863a(DataSourcesResult dataSourcesResult);
}
