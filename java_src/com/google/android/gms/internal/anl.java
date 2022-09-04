package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.anj;
/* loaded from: classes2.dex */
public interface anl extends IInterface {

    /* renamed from: com.google.android.gms.internal.anl$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6638a extends Binder implements anl {

        /* renamed from: com.google.android.gms.internal.anl$a$a */
        /* loaded from: classes2.dex */
        private static class C6639a implements anl {

            /* renamed from: a */
            private IBinder f22482a;

            C6639a(IBinder iBinder) {
                this.f22482a = iBinder;
            }

            @Override // com.google.android.gms.internal.anl
            /* renamed from: a */
            public void mo16620a(anj anjVar, Uri uri, Bundle bundle, boolean z) {
                IBinder iBinder = null;
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
                    if (anjVar != null) {
                        iBinder = anjVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f22482a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22482a;
            }
        }

        /* renamed from: a */
        public static anl m16621a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anl)) ? new C6639a(iBinder) : (anl) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
                    a(anj.AbstractBinderC6635a.m16626a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16620a(anj anjVar, Uri uri, Bundle bundle, boolean z);
}
