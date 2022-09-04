package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractC3526ai;
import com.google.android.gms.ads.internal.client.AbstractC3532ak;
import com.google.android.gms.ads.internal.client.AbstractC3547ap;
import com.google.android.gms.ads.internal.reward.client.AbstractC3749b;
import com.google.android.gms.internal.AbstractC7817uw;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.AbstractC8066yq;
import com.google.android.gms.internal.AbstractC8085yz;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.client.an */
/* loaded from: classes2.dex */
public interface AbstractC3541an extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.an$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3542a extends Binder implements AbstractC3541an {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.ads.internal.client.an$a$a */
        /* loaded from: classes2.dex */
        public static class C3543a implements AbstractC3541an {

            /* renamed from: a */
            private IBinder f13950a;

            C3543a(IBinder iBinder) {
                this.f13950a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13950a;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC3526ai createAdLoaderBuilder(AbstractC4170e abstractC4170e, String str, AbstractC8005xq abstractC8005xq, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    if (abstractC8005xq != null) {
                        iBinder = abstractC8005xq.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f13950a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3526ai.AbstractBinderC3527a.m27574a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC8066yq createAdOverlay(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f13950a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8066yq.AbstractBinderC8067a.m12875a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC3532ak createBannerAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
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
                    this.f13950a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3532ak.AbstractBinderC3533a.m27571a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC8085yz createInAppPurchaseManager(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f13950a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8085yz.AbstractBinderC8086a.m12850a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC3532ak createInterstitialAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
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
                    this.f13950a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3532ak.AbstractBinderC3533a.m27571a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC7817uw createNativeAdViewDelegate(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC4170e2 != null) {
                        iBinder = abstractC4170e2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f13950a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7817uw.AbstractBinderC7818a.m13401a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC3749b createRewardedVideoAd(AbstractC4170e abstractC4170e, AbstractC8005xq abstractC8005xq, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC8005xq != null) {
                        iBinder = abstractC8005xq.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f13950a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3749b.AbstractBinderC3750a.m26974a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC3532ak createSearchAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f13950a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3532ak.AbstractBinderC3533a.m27571a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC3547ap getMobileAdsSettingsManager(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f13950a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3547ap.AbstractBinderC3548a.m27564a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
            public AbstractC3547ap getMobileAdsSettingsManagerWithClientJarVersion(AbstractC4170e abstractC4170e, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    this.f13950a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3547ap.AbstractBinderC3548a.m27564a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC3542a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
        }

        public static AbstractC3541an asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3541an)) ? new C3543a(iBinder) : (AbstractC3541an) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC3532ak createBannerAdManager = createBannerAdManager(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createBannerAdManager != null) {
                        iBinder = createBannerAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC3532ak createInterstitialAdManager = createInterstitialAdManager(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createInterstitialAdManager != null) {
                        iBinder = createInterstitialAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC3526ai createAdLoaderBuilder = createAdLoaderBuilder(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString(), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createAdLoaderBuilder != null) {
                        iBinder = createAdLoaderBuilder.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC3547ap mobileAdsSettingsManager = getMobileAdsSettingsManager(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (mobileAdsSettingsManager != null) {
                        iBinder = mobileAdsSettingsManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC7817uw createNativeAdViewDelegate = createNativeAdViewDelegate(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createNativeAdViewDelegate != null) {
                        iBinder = createNativeAdViewDelegate.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC3749b createRewardedVideoAd = createRewardedVideoAd(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createRewardedVideoAd != null) {
                        iBinder = createRewardedVideoAd.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC8085yz createInAppPurchaseManager = createInAppPurchaseManager(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createInAppPurchaseManager != null) {
                        iBinder = createInAppPurchaseManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC8066yq createAdOverlay = createAdOverlay(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createAdOverlay != null) {
                        iBinder = createAdOverlay.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC3547ap mobileAdsSettingsManagerWithClientJarVersion = getMobileAdsSettingsManagerWithClientJarVersion(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (mobileAdsSettingsManagerWithClientJarVersion != null) {
                        iBinder = mobileAdsSettingsManagerWithClientJarVersion.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    AbstractC3532ak createSearchAdManager = createSearchAdManager(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    if (createSearchAdManager != null) {
                        iBinder = createSearchAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IClientApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    AbstractC3526ai createAdLoaderBuilder(AbstractC4170e abstractC4170e, String str, AbstractC8005xq abstractC8005xq, int i);

    AbstractC8066yq createAdOverlay(AbstractC4170e abstractC4170e);

    AbstractC3532ak createBannerAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i);

    AbstractC8085yz createInAppPurchaseManager(AbstractC4170e abstractC4170e);

    AbstractC3532ak createInterstitialAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i);

    AbstractC7817uw createNativeAdViewDelegate(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2);

    AbstractC3749b createRewardedVideoAd(AbstractC4170e abstractC4170e, AbstractC8005xq abstractC8005xq, int i);

    AbstractC3532ak createSearchAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, int i);

    AbstractC3547ap getMobileAdsSettingsManager(AbstractC4170e abstractC4170e);

    AbstractC3547ap getMobileAdsSettingsManagerWithClientJarVersion(AbstractC4170e abstractC4170e, int i);
}
