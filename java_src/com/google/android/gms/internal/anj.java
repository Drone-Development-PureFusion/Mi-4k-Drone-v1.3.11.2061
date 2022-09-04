package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public interface anj extends IInterface {

    /* renamed from: com.google.android.gms.internal.anj$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6635a extends Binder implements anj {

        /* renamed from: com.google.android.gms.internal.anj$a$a */
        /* loaded from: classes2.dex */
        private static class C6636a implements anj {

            /* renamed from: a */
            private IBinder f22480a;

            C6636a(IBinder iBinder) {
                this.f22480a = iBinder;
            }

            @Override // com.google.android.gms.internal.anj
            /* renamed from: a */
            public void mo16612a(int i, Bundle bundle, int i2, Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i2);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22480a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22480a;
            }
        }

        public AbstractBinderC6635a() {
            attachInterface(this, "com.google.android.gms.panorama.internal.IPanoramaCallbacks");
        }

        /* renamed from: a */
        public static anj m16626a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anj)) ? new C6636a(iBinder) : (anj) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16612a(int i, Bundle bundle, int i2, Intent intent);
}
