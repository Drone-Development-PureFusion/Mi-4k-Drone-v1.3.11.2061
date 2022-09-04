package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.drive.internal.q */
/* loaded from: classes2.dex */
public interface AbstractC4973q extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.q$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4974a extends Binder implements AbstractC4973q {

        /* renamed from: com.google.android.gms.drive.internal.q$a$a */
        /* loaded from: classes2.dex */
        private static class C4975a implements AbstractC4973q {

            /* renamed from: a */
            private IBinder f17957a;

            C4975a(IBinder iBinder) {
                this.f17957a = iBinder;
            }

            @Override // com.google.android.gms.drive.internal.AbstractC4973q
            /* renamed from: a */
            public void mo22253a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f17957a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17957a;
            }
        }

        /* renamed from: a */
        public static AbstractC4973q m22254a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4973q)) ? new C4975a(iBinder) : (AbstractC4973q) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    a(parcel.readInt() != 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo22253a(boolean z);
}
