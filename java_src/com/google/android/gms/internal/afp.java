package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public interface afp extends IInterface {

    /* renamed from: com.google.android.gms.internal.afp$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6275a extends Binder implements afp {

        /* renamed from: com.google.android.gms.internal.afp$a$a */
        /* loaded from: classes2.dex */
        private static class C6276a implements afp {

            /* renamed from: a */
            private IBinder f21475a;

            C6276a(IBinder iBinder) {
                this.f21475a = iBinder;
            }

            @Override // com.google.android.gms.internal.afp
            /* renamed from: a */
            public int mo17755a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    this.f21475a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.afp
            /* renamed from: a */
            public void mo17754a(long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f21475a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21475a;
            }
        }

        public AbstractBinderC6275a() {
            attachInterface(this, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        }

        /* renamed from: a */
        public static afp m17756a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof afp)) ? new C6276a(iBinder) : (afp) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    a(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo17755a();

    /* renamed from: a */
    void mo17754a(long j, long j2);
}
