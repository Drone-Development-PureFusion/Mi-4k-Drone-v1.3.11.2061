package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.drive.realtime.internal.h */
/* loaded from: classes2.dex */
public interface AbstractC5080h extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5081a extends Binder implements AbstractC5080h {

        /* renamed from: com.google.android.gms.drive.realtime.internal.h$a$a */
        /* loaded from: classes2.dex */
        private static class C5082a implements AbstractC5080h {

            /* renamed from: a */
            private IBinder f18193a;

            C5082a(IBinder iBinder) {
                this.f18193a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5080h
            /* renamed from: a */
            public void mo21888a(boolean z, boolean z2) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f18193a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18193a;
            }
        }

        /* renamed from: a */
        public static AbstractC5080h m21889a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5080h)) ? new C5082a(iBinder) : (AbstractC5080h) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    boolean z2 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z2, z);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21888a(boolean z, boolean z2);
}
