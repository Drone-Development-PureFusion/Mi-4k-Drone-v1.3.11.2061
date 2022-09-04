package com.google.android.gms.maps.p247a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.t */
/* loaded from: classes2.dex */
public interface AbstractC8482t extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.t$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8483a extends Binder implements AbstractC8482t {

        /* renamed from: com.google.android.gms.maps.a.t$a$a */
        /* loaded from: classes2.dex */
        private static class C8484a implements AbstractC8482t {

            /* renamed from: a */
            private IBinder f27349a;

            C8484a(IBinder iBinder) {
                this.f27349a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8482t
            /* renamed from: a */
            public void mo11525a(Bitmap bitmap) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27349a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8482t
            /* renamed from: a */
            public void mo11524a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27349a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27349a;
            }
        }

        public AbstractBinderC8483a() {
            attachInterface(this, "com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        }

        /* renamed from: a */
        public static AbstractC8482t m11648a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8482t)) ? new C8484a(iBinder) : (AbstractC8482t) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11525a(Bitmap bitmap);

    /* renamed from: a */
    void mo11524a(AbstractC4170e abstractC4170e);
}
