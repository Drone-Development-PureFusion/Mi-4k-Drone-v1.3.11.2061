package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.client.al */
/* loaded from: classes2.dex */
public interface AbstractC3535al extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.al$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3536a extends Binder implements AbstractC3535al {

        /* renamed from: com.google.android.gms.ads.internal.client.al$a$a */
        /* loaded from: classes2.dex */
        private static class C3537a implements AbstractC3535al {

            /* renamed from: a */
            private IBinder f13948a;

            C3537a(IBinder iBinder) {
                this.f13948a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3535al
            /* renamed from: a */
            public IBinder mo27569a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (abstractC8005xq != null) {
                        iBinder = abstractC8005xq.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f13948a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3535al
            /* renamed from: a */
            public IBinder mo27568a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i, int i2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (abstractC8005xq != null) {
                        iBinder = abstractC8005xq.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f13948a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13948a;
            }
        }

        /* renamed from: a */
        public static AbstractC3535al m27570a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3535al)) ? new C3537a(iBinder) : (AbstractC3535al) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AdSizeParcel adSizeParcel = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    AbstractC4170e m25295a = AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        adSizeParcel = (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel);
                    }
                    IBinder a = a(m25295a, adSizeParcel, parcel.readString(), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    AbstractC4170e m25295a2 = AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        adSizeParcel = (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel);
                    }
                    IBinder a2 = a(m25295a2, adSizeParcel, parcel.readString(), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo27569a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i);

    /* renamed from: a */
    IBinder mo27568a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i, int i2);
}
