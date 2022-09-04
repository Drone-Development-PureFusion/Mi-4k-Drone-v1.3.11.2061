package com.google.android.gms.location.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;
/* renamed from: com.google.android.gms.location.internal.j */
/* loaded from: classes2.dex */
public interface AbstractC8207j extends IInterface {

    /* renamed from: com.google.android.gms.location.internal.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8208a extends Binder implements AbstractC8207j {

        /* renamed from: com.google.android.gms.location.internal.j$a$a */
        /* loaded from: classes2.dex */
        private static class C8209a implements AbstractC8207j {

            /* renamed from: a */
            private IBinder f26808a;

            C8209a(IBinder iBinder) {
                this.f26808a = iBinder;
            }

            @Override // com.google.android.gms.location.internal.AbstractC8207j
            /* renamed from: a */
            public void mo12396a(LocationSettingsResult locationSettingsResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
                    if (locationSettingsResult != null) {
                        obtain.writeInt(1);
                        locationSettingsResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26808a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26808a;
            }
        }

        public AbstractBinderC8208a() {
            attachInterface(this, "com.google.android.gms.location.internal.ISettingsCallbacks");
        }

        /* renamed from: a */
        public static AbstractC8207j m12436a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8207j)) ? new C8209a(iBinder) : (AbstractC8207j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                    a(parcel.readInt() != 0 ? LocationSettingsResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12396a(LocationSettingsResult locationSettingsResult);
}
