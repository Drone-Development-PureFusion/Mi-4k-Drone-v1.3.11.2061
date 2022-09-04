package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a;
import com.google.android.gms.internal.AbstractC8011xs;
import com.google.android.gms.internal.AbstractC8017xu;
import com.google.android.gms.internal.AbstractC8020xv;
import com.google.android.gms.p232c.AbstractC4170e;
import java.util.List;
/* renamed from: com.google.android.gms.internal.xr */
/* loaded from: classes2.dex */
public interface AbstractC8008xr extends IInterface {

    /* renamed from: com.google.android.gms.internal.xr$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8009a extends Binder implements AbstractC8008xr {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.internal.xr$a$a */
        /* loaded from: classes2.dex */
        public static class C8010a implements AbstractC8008xr {

            /* renamed from: a */
            private IBinder f26312a;

            C8010a(IBinder iBinder) {
                this.f26312a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public AbstractC4170e mo12977a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12976a(AdRequestParcel adRequestParcel, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f26312a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12975a(AdRequestParcel adRequestParcel, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f26312a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12974a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f26312a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12973a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC3763a abstractC3763a, String str2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (abstractC3763a != null) {
                        iBinder = abstractC3763a.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str2);
                    this.f26312a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12972a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (abstractC8011xs != null) {
                        iBinder = abstractC8011xs.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f26312a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12971a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (abstractC8011xs != null) {
                        iBinder = abstractC8011xs.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f26312a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12970a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (abstractC8011xs != null) {
                        iBinder = abstractC8011xs.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (nativeAdOptionsParcel != null) {
                        obtain.writeInt(1);
                        nativeAdOptionsParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringList(list);
                    this.f26312a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12969a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (abstractC8011xs != null) {
                        iBinder = abstractC8011xs.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f26312a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: a */
            public void mo12968a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (abstractC8011xs != null) {
                        iBinder = abstractC8011xs.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f26312a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26312a;
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: b */
            public void mo12966b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: c */
            public void mo12965c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: d */
            public void mo12964d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: e */
            public void mo12963e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: f */
            public void mo12962f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: g */
            public boolean mo12961g() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: h */
            public AbstractC8017xu mo12960h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8017xu.AbstractBinderC8018a.m13039a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: i */
            public AbstractC8020xv mo12959i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8020xv.AbstractBinderC8021a.m13038a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: j */
            public Bundle mo12958j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: k */
            public Bundle mo12957k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8008xr
            /* renamed from: l */
            public Bundle mo12956l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f26312a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8009a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }

        /* renamed from: a */
        public static AbstractC8008xr m13051a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8008xr)) ? new C8010a(iBinder) : (AbstractC8008xr) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            IBinder iBinder = null;
            IBinder iBinder2 = null;
            NativeAdOptionsParcel nativeAdOptionsParcel = null;
            IBinder iBinder3 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), AbstractC8011xs.AbstractBinderC8012a.m13050a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    AbstractC4170e a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder2 = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder2);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), AbstractC8011xs.AbstractBinderC8012a.m13050a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    c();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), AbstractC8011xs.AbstractBinderC8012a.m13050a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), AbstractC8011xs.AbstractBinderC8012a.m13050a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), AbstractC3763a.AbstractBinderC3764a.m26947a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    f();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    boolean g = g();
                    parcel2.writeNoException();
                    if (g) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    AbstractC4170e m25295a = AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder());
                    AdRequestParcel adRequestParcel = parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null;
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    AbstractC8011xs m13050a = AbstractC8011xs.AbstractBinderC8012a.m13050a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        nativeAdOptionsParcel = (NativeAdOptionsParcel) NativeAdOptionsParcel.CREATOR.createFromParcel(parcel);
                    }
                    a(m25295a, adRequestParcel, readString, readString2, m13050a, nativeAdOptionsParcel, parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    AbstractC8017xu h = h();
                    parcel2.writeNoException();
                    if (h != null) {
                        iBinder3 = h.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder3);
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    AbstractC8020xv i4 = i();
                    parcel2.writeNoException();
                    if (i4 != null) {
                        iBinder = i4.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    Bundle j = j();
                    parcel2.writeNoException();
                    if (j == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    Bundle k = k();
                    parcel2.writeNoException();
                    if (k == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    k.writeToParcel(parcel2, 1);
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    Bundle l = l();
                    parcel2.writeNoException();
                    if (l == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    l.writeToParcel(parcel2, 1);
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(parcel.readInt() != 0 ? (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo12977a();

    /* renamed from: a */
    void mo12976a(AdRequestParcel adRequestParcel, String str);

    /* renamed from: a */
    void mo12975a(AdRequestParcel adRequestParcel, String str, String str2);

    /* renamed from: a */
    void mo12974a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo12973a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC3763a abstractC3763a, String str2);

    /* renamed from: a */
    void mo12972a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs);

    /* renamed from: a */
    void mo12971a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs);

    /* renamed from: a */
    void mo12970a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list);

    /* renamed from: a */
    void mo12969a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs);

    /* renamed from: a */
    void mo12968a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs);

    /* renamed from: b */
    void mo12966b();

    /* renamed from: c */
    void mo12965c();

    /* renamed from: d */
    void mo12964d();

    /* renamed from: e */
    void mo12963e();

    /* renamed from: f */
    void mo12962f();

    /* renamed from: g */
    boolean mo12961g();

    /* renamed from: h */
    AbstractC8017xu mo12960h();

    /* renamed from: i */
    AbstractC8020xv mo12959i();

    /* renamed from: j */
    Bundle mo12958j();

    /* renamed from: k */
    Bundle mo12957k();

    /* renamed from: l */
    Bundle mo12956l();
}
