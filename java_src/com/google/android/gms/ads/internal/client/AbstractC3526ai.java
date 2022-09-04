package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3523ah;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.internal.AbstractC7839vf;
import com.google.android.gms.internal.AbstractC7842vg;
import com.google.android.gms.internal.AbstractC7845vh;
import com.google.android.gms.internal.AbstractC7848vi;
/* renamed from: com.google.android.gms.ads.internal.client.ai */
/* loaded from: classes2.dex */
public interface AbstractC3526ai extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.ai$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3527a extends Binder implements AbstractC3526ai {

        /* renamed from: com.google.android.gms.ads.internal.client.ai$a$a */
        /* loaded from: classes2.dex */
        private static class C3528a implements AbstractC3526ai {

            /* renamed from: a */
            private IBinder f13945a;

            C3528a(IBinder iBinder) {
                this.f13945a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
            /* renamed from: a */
            public AbstractC3523ah mo27313a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.f13945a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3523ah.AbstractBinderC3524a.m27575a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
            /* renamed from: a */
            public void mo27312a(AbstractC3520ag abstractC3520ag) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(abstractC3520ag != null ? abstractC3520ag.asBinder() : null);
                    this.f13945a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
            /* renamed from: a */
            public void mo27311a(AbstractC3544ao abstractC3544ao) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(abstractC3544ao != null ? abstractC3544ao.asBinder() : null);
                    this.f13945a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
            /* renamed from: a */
            public void mo27310a(NativeAdOptionsParcel nativeAdOptionsParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (nativeAdOptionsParcel != null) {
                        obtain.writeInt(1);
                        nativeAdOptionsParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13945a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
            /* renamed from: a */
            public void mo27309a(AbstractC7839vf abstractC7839vf) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(abstractC7839vf != null ? abstractC7839vf.asBinder() : null);
                    this.f13945a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
            /* renamed from: a */
            public void mo27308a(AbstractC7842vg abstractC7842vg) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(abstractC7842vg != null ? abstractC7842vg.asBinder() : null);
                    this.f13945a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
            /* renamed from: a */
            public void mo27307a(String str, AbstractC7848vi abstractC7848vi, AbstractC7845vh abstractC7845vh) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC7848vi != null ? abstractC7848vi.asBinder() : null);
                    if (abstractC7845vh != null) {
                        iBinder = abstractC7845vh.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f13945a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13945a;
            }
        }

        public AbstractBinderC3527a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        }

        /* renamed from: a */
        public static AbstractC3526ai m27574a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3526ai)) ? new C3528a(iBinder) : (AbstractC3526ai) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            NativeAdOptionsParcel nativeAdOptionsParcel = null;
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    AbstractC3523ah a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    a(AbstractC3520ag.AbstractBinderC3521a.m27576a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    a(AbstractC7839vf.AbstractBinderC7840a.m13331a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    a(AbstractC7842vg.AbstractBinderC7843a.m13330a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    a(parcel.readString(), AbstractC7848vi.AbstractBinderC7849a.m13328a(parcel.readStrongBinder()), AbstractC7845vh.AbstractBinderC7846a.m13329a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (parcel.readInt() != 0) {
                        nativeAdOptionsParcel = (NativeAdOptionsParcel) NativeAdOptionsParcel.CREATOR.createFromParcel(parcel);
                    }
                    a(nativeAdOptionsParcel);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    a(AbstractC3544ao.AbstractBinderC3545a.m27566a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC3523ah mo27313a();

    /* renamed from: a */
    void mo27312a(AbstractC3520ag abstractC3520ag);

    /* renamed from: a */
    void mo27311a(AbstractC3544ao abstractC3544ao);

    /* renamed from: a */
    void mo27310a(NativeAdOptionsParcel nativeAdOptionsParcel);

    /* renamed from: a */
    void mo27309a(AbstractC7839vf abstractC7839vf);

    /* renamed from: a */
    void mo27308a(AbstractC7842vg abstractC7842vg);

    /* renamed from: a */
    void mo27307a(String str, AbstractC7848vi abstractC7848vi, AbstractC7845vh abstractC7845vh);
}
