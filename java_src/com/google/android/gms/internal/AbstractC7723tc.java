package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.internal.tc */
/* loaded from: classes2.dex */
public interface AbstractC7723tc extends IInterface {

    /* renamed from: com.google.android.gms.internal.tc$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7724a extends Binder implements AbstractC7723tc {

        /* renamed from: com.google.android.gms.internal.tc$a$a */
        /* loaded from: classes2.dex */
        private static class C7725a implements AbstractC7723tc {

            /* renamed from: a */
            private IBinder f25577a;

            C7725a(IBinder iBinder) {
                this.f25577a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: a */
            public AbstractC4170e mo13649a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC4170e2 != null) {
                        iBinder = abstractC4170e2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f25577a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: a */
            public String mo13651a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    this.f25577a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: a */
            public String mo13648a(AbstractC4170e abstractC4170e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    this.f25577a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: a */
            public void mo13647a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeString(str);
                    this.f25577a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: a */
            public void mo13646a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f25577a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: a */
            public boolean mo13650a(AbstractC4170e abstractC4170e) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f25577a.transact(3, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: a */
            public boolean mo13645a(String str, boolean z) {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f25577a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25577a;
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: b */
            public AbstractC4170e mo13643b(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC4170e2 != null) {
                        iBinder = abstractC4170e2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f25577a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: b */
            public boolean mo13644b(AbstractC4170e abstractC4170e) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f25577a.transact(4, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: c */
            public String mo13642c(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f25577a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7723tc
            /* renamed from: d */
            public void mo13641d(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f25577a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC7724a() {
            attachInterface(this, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
        }

        /* renamed from: a */
        public static AbstractC7723tc m13652a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7723tc)) ? new C7725a(iBinder) : (AbstractC7723tc) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            int i3 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    boolean a2 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a2) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    boolean b = b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (b) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    AbstractC4170e a3 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a3 != null ? a3.asBinder() : null);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    String c = c(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    String a4 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(a4);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    d(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    AbstractC4170e b2 = b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (b2 != null) {
                        iBinder = b2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    boolean a5 = a(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    if (a5) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo13649a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2);

    /* renamed from: a */
    String mo13651a();

    /* renamed from: a */
    String mo13648a(AbstractC4170e abstractC4170e, String str);

    /* renamed from: a */
    void mo13647a(String str);

    /* renamed from: a */
    void mo13646a(String str, String str2);

    /* renamed from: a */
    boolean mo13650a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    boolean mo13645a(String str, boolean z);

    /* renamed from: b */
    AbstractC4170e mo13643b(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2);

    /* renamed from: b */
    boolean mo13644b(AbstractC4170e abstractC4170e);

    /* renamed from: c */
    String mo13642c(AbstractC4170e abstractC4170e);

    /* renamed from: d */
    void mo13641d(AbstractC4170e abstractC4170e);
}
