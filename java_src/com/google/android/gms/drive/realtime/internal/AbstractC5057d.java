package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.drive.realtime.internal.d */
/* loaded from: classes2.dex */
public interface AbstractC5057d extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5058a extends Binder implements AbstractC5057d {

        /* renamed from: com.google.android.gms.drive.realtime.internal.d$a$a */
        /* loaded from: classes2.dex */
        private static class C5059a implements AbstractC5057d {

            /* renamed from: a */
            private IBinder f18131a;

            C5059a(IBinder iBinder) {
                this.f18131a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5057d
            /* renamed from: a */
            public void mo21933a(ParcelableCollaborator parcelableCollaborator) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (parcelableCollaborator != null) {
                        obtain.writeInt(1);
                        parcelableCollaborator.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18131a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18131a;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5057d
            /* renamed from: b */
            public void mo21932b(ParcelableCollaborator parcelableCollaborator) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (parcelableCollaborator != null) {
                        obtain.writeInt(1);
                        parcelableCollaborator.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f18131a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC5057d m21934a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5057d)) ? new C5059a(iBinder) : (AbstractC5057d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ParcelableCollaborator parcelableCollaborator = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (parcel.readInt() != 0) {
                        parcelableCollaborator = ParcelableCollaborator.CREATOR.createFromParcel(parcel);
                    }
                    a(parcelableCollaborator);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (parcel.readInt() != 0) {
                        parcelableCollaborator = ParcelableCollaborator.CREATOR.createFromParcel(parcel);
                    }
                    b(parcelableCollaborator);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo21933a(ParcelableCollaborator parcelableCollaborator);

    /* renamed from: b */
    void mo21932b(ParcelableCollaborator parcelableCollaborator);
}
