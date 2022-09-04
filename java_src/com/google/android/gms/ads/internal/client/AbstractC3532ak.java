package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractC3517af;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3538am;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC8082yy;
import com.google.android.gms.internal.AbstractC8096zd;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.client.ak */
/* loaded from: classes2.dex */
public interface AbstractC3532ak extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.ak$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3533a extends Binder implements AbstractC3532ak {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.ads.internal.client.ak$a$a */
        /* loaded from: classes2.dex */
        public static class C3534a implements AbstractC3532ak {

            /* renamed from: a */
            private IBinder f13947a;

            C3534a(IBinder iBinder) {
                this.f13947a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public AbstractC4170e mo13193a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13191a(AdSizeParcel adSizeParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13947a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13190a(VideoOptionsParcel videoOptionsParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    if (videoOptionsParcel != null) {
                        obtain.writeInt(1);
                        videoOptionsParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13947a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13189a(AbstractC3517af abstractC3517af) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC3517af != null ? abstractC3517af.asBinder() : null);
                    this.f13947a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13188a(AbstractC3520ag abstractC3520ag) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC3520ag != null ? abstractC3520ag.asBinder() : null);
                    this.f13947a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13187a(AbstractC3538am abstractC3538am) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC3538am != null ? abstractC3538am.asBinder() : null);
                    this.f13947a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13186a(AbstractC3544ao abstractC3544ao) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC3544ao != null ? abstractC3544ao.asBinder() : null);
                    this.f13947a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13185a(AbstractC3755d abstractC3755d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC3755d != null ? abstractC3755d.asBinder() : null);
                    this.f13947a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13184a(AbstractC7807ur abstractC7807ur) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC7807ur != null ? abstractC7807ur.asBinder() : null);
                    this.f13947a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13183a(AbstractC8082yy abstractC8082yy) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC8082yy != null ? abstractC8082yy.asBinder() : null);
                    this.f13947a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13182a(AbstractC8096zd abstractC8096zd, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(abstractC8096zd != null ? abstractC8096zd.asBinder() : null);
                    obtain.writeString(str);
                    this.f13947a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13181a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeString(str);
                    this.f13947a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public void mo13180a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f13947a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: a */
            public boolean mo13192a(AdRequestParcel adRequestParcel) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    if (adRequestParcel != null) {
                        obtain.writeInt(1);
                        adRequestParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13947a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13947a;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: b */
            public void mo13179b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: c */
            public boolean mo13177c() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(3, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: d */
            public void mo13175d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: f */
            public void mo13174f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: h */
            public void mo13173h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: h_ */
            public void mo13172h_() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: i */
            public AdSizeParcel mo13171i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: j */
            public String mo13170j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: k */
            public boolean mo13169k() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(23, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: l */
            public AbstractC3553c mo13168l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3553c.AbstractBinderC3554a.m27561a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
            /* renamed from: l_ */
            public void mo13167l_() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f13947a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC3533a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
        }

        /* renamed from: a */
        public static AbstractC3532ak m27571a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3532ak)) ? new C3534a(iBinder) : (AbstractC3532ak) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            VideoOptionsParcel videoOptionsParcel = null;
            IBinder iBinder = null;
            AdRequestParcel adRequestParcel = null;
            AdSizeParcel adSizeParcel = null;
            IBinder iBinder2 = null;
            int i3 = 0;
            int i4 = 0;
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    AbstractC4170e a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    boolean c = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if (parcel.readInt() != 0) {
                        adRequestParcel = (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(parcel);
                    }
                    boolean a2 = a(adRequestParcel);
                    parcel2.writeNoException();
                    if (a2) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    h_();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC3520ag.AbstractBinderC3521a.m27576a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC3538am.AbstractBinderC3539a.m27567a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    f();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    l_();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    h();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    AdSizeParcel i5 = i();
                    parcel2.writeNoException();
                    if (i5 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    i5.writeToParcel(parcel2, 1);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if (parcel.readInt() != 0) {
                        adSizeParcel = (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel);
                    }
                    a(adSizeParcel);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC8082yy.AbstractBinderC8083a.m12851a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC8096zd.AbstractBinderC8097a.m12837a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    String j = j();
                    parcel2.writeNoException();
                    parcel2.writeString(j);
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC7807ur.AbstractBinderC7808a.m13417a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC3517af.AbstractBinderC3518a.m27577a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC3544ao.AbstractBinderC3545a.m27566a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    boolean k = k();
                    parcel2.writeNoException();
                    if (k) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(AbstractC3755d.AbstractBinderC3756a.m26971a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    AbstractC3553c l = l();
                    parcel2.writeNoException();
                    if (l != null) {
                        iBinder2 = l.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder2);
                    return true;
                case 29:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if (parcel.readInt() != 0) {
                        videoOptionsParcel = (VideoOptionsParcel) VideoOptionsParcel.CREATOR.createFromParcel(parcel);
                    }
                    a(videoOptionsParcel);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo13193a();

    /* renamed from: a */
    void mo13191a(AdSizeParcel adSizeParcel);

    /* renamed from: a */
    void mo13190a(VideoOptionsParcel videoOptionsParcel);

    /* renamed from: a */
    void mo13189a(AbstractC3517af abstractC3517af);

    /* renamed from: a */
    void mo13188a(AbstractC3520ag abstractC3520ag);

    /* renamed from: a */
    void mo13187a(AbstractC3538am abstractC3538am);

    /* renamed from: a */
    void mo13186a(AbstractC3544ao abstractC3544ao);

    /* renamed from: a */
    void mo13185a(AbstractC3755d abstractC3755d);

    /* renamed from: a */
    void mo13184a(AbstractC7807ur abstractC7807ur);

    /* renamed from: a */
    void mo13183a(AbstractC8082yy abstractC8082yy);

    /* renamed from: a */
    void mo13182a(AbstractC8096zd abstractC8096zd, String str);

    /* renamed from: a */
    void mo13181a(String str);

    /* renamed from: a */
    void mo13180a(boolean z);

    /* renamed from: a */
    boolean mo13192a(AdRequestParcel adRequestParcel);

    /* renamed from: b */
    void mo13179b();

    /* renamed from: c */
    boolean mo13177c();

    /* renamed from: d */
    void mo13175d();

    /* renamed from: f */
    void mo13174f();

    /* renamed from: h */
    void mo13173h();

    /* renamed from: h_ */
    void mo13172h_();

    /* renamed from: i */
    AdSizeParcel mo13171i();

    /* renamed from: j */
    String mo13170j();

    /* renamed from: k */
    boolean mo13169k();

    /* renamed from: l */
    AbstractC3553c mo13168l();

    /* renamed from: l_ */
    void mo13167l_();
}
