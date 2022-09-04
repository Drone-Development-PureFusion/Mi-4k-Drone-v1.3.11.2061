package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.AbstractC4246ad;
import com.google.android.gms.cast.framework.AbstractC4356s;
import com.google.android.gms.cast.framework.AbstractC4359t;
import com.google.android.gms.cast.framework.AbstractC4362u;
import com.google.android.gms.cast.framework.AbstractC4374y;
import com.google.android.gms.cast.framework.AbstractC4377z;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.AbstractC4338f;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.internal.afh;
import com.google.android.gms.internal.afo;
import com.google.android.gms.internal.afp;
import com.google.android.gms.p232c.AbstractC4170e;
import java.util.Map;
/* loaded from: classes2.dex */
public interface aff extends IInterface {

    /* renamed from: com.google.android.gms.internal.aff$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6259a extends Binder implements aff {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.internal.aff$a$a */
        /* loaded from: classes2.dex */
        public static class C6260a implements aff {

            /* renamed from: a */
            private IBinder f21441a;

            C6260a(IBinder iBinder) {
                this.f21441a = iBinder;
            }

            @Override // com.google.android.gms.internal.aff
            /* renamed from: a */
            public AbstractC4338f mo17800a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC4170e abstractC4170e3, CastMediaOptions castMediaOptions) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC4170e2 != null ? abstractC4170e2.asBinder() : null);
                    if (abstractC4170e3 != null) {
                        iBinder = abstractC4170e3.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (castMediaOptions != null) {
                        obtain.writeInt(1);
                        castMediaOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21441a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4338f.AbstractBinderC4339a.m24486a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aff
            /* renamed from: a */
            public AbstractC4359t mo17799a(AbstractC4170e abstractC4170e, CastOptions castOptions, afh afhVar, Map map) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (castOptions != null) {
                        obtain.writeInt(1);
                        castOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (afhVar != null) {
                        iBinder = afhVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeMap(map);
                    this.f21441a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4359t.AbstractBinderC4360a.m24409a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aff
            /* renamed from: a */
            public AbstractC4362u mo17797a(CastOptions castOptions, AbstractC4170e abstractC4170e, AbstractC4356s abstractC4356s) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    if (castOptions != null) {
                        obtain.writeInt(1);
                        castOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC4356s != null) {
                        iBinder = abstractC4356s.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f21441a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4362u.AbstractBinderC4363a.m24398a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aff
            /* renamed from: a */
            public AbstractC4374y mo17801a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC4170e abstractC4170e3) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC4170e2 != null ? abstractC4170e2.asBinder() : null);
                    if (abstractC4170e3 != null) {
                        iBinder = abstractC4170e3.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f21441a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4374y.AbstractBinderC4375a.m24377a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aff
            /* renamed from: a */
            public AbstractC4377z mo17796a(String str, String str2, AbstractC4246ad abstractC4246ad) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC4246ad != null ? abstractC4246ad.asBinder() : null);
                    this.f21441a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4377z.AbstractBinderC4378a.m24371a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aff
            /* renamed from: a */
            public afo mo17798a(AbstractC4170e abstractC4170e, afp afpVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
                IBinder iBinder = null;
                int i6 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (afpVar != null) {
                        iBinder = afpVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (z) {
                        i6 = 1;
                    }
                    obtain.writeInt(i6);
                    obtain.writeLong(j);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    this.f21441a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return afo.AbstractBinderC6273a.m17759a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21441a;
            }
        }

        /* renamed from: a */
        public static aff m17802a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aff)) ? new C6260a(iBinder) : (aff) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    AbstractC4359t a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? CastOptions.CREATOR.createFromParcel(parcel) : null, afh.AbstractBinderC6261a.m17795a(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    AbstractC4377z a2 = a(parcel.readString(), parcel.readString(), AbstractC4246ad.AbstractBinderC4247a.m24884a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2 != null ? a2.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    AbstractC4362u a3 = a(parcel.readInt() != 0 ? CastOptions.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4356s.AbstractBinderC4357a.m24415a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a3 != null ? a3.asBinder() : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    AbstractC4338f a4 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? CastMediaOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a4 != null ? a4.asBinder() : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    AbstractC4374y a5 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a5 != null ? a5.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    afo a6 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), afp.AbstractBinderC6275a.m17756a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a6 != null ? a6.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4338f mo17800a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC4170e abstractC4170e3, CastMediaOptions castMediaOptions);

    /* renamed from: a */
    AbstractC4359t mo17799a(AbstractC4170e abstractC4170e, CastOptions castOptions, afh afhVar, Map map);

    /* renamed from: a */
    AbstractC4362u mo17797a(CastOptions castOptions, AbstractC4170e abstractC4170e, AbstractC4356s abstractC4356s);

    /* renamed from: a */
    AbstractC4374y mo17801a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC4170e abstractC4170e3);

    /* renamed from: a */
    AbstractC4377z mo17796a(String str, String str2, AbstractC4246ad abstractC4246ad);

    /* renamed from: a */
    afo mo17798a(AbstractC4170e abstractC4170e, afp afpVar, int i, int i2, boolean z, long j, int i3, int i4, int i5);
}
