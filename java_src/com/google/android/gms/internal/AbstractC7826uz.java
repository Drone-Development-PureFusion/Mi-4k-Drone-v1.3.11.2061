package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.p232c.AbstractC4170e;
import java.util.List;
/* renamed from: com.google.android.gms.internal.uz */
/* loaded from: classes2.dex */
public interface AbstractC7826uz extends IInterface {

    /* renamed from: com.google.android.gms.internal.uz$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7827a extends Binder implements AbstractC7826uz {

        /* renamed from: com.google.android.gms.internal.uz$a$a */
        /* loaded from: classes2.dex */
        private static class C7828a implements AbstractC7826uz {

            /* renamed from: a */
            private IBinder f25965a;

            C7828a(IBinder iBinder) {
                this.f25965a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: a */
            public String mo13390a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25965a;
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: b */
            public List mo13389b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: c */
            public String mo13388c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: d */
            public AbstractC7813uu mo13387d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7813uu.AbstractBinderC7814a.m13408a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: e */
            public String mo13386e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: f */
            public double mo13385f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readDouble();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: g */
            public String mo13384g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: h */
            public String mo13383h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: i */
            public AbstractC3553c mo13382i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3553c.AbstractBinderC3554a.m27561a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: j */
            public AbstractC4170e mo13381j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: n */
            public Bundle mo13380n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7826uz
            /* renamed from: p */
            public void mo13379p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    this.f25965a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC7827a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        }

        /* renamed from: a */
        public static AbstractC7826uz m13391a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7826uz)) ? new C7828a(iBinder) : (AbstractC7826uz) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    AbstractC4170e j = j();
                    parcel2.writeNoException();
                    if (j != null) {
                        iBinder = j.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    List b = b();
                    parcel2.writeNoException();
                    parcel2.writeList(b);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    AbstractC7813uu d = d();
                    parcel2.writeNoException();
                    if (d != null) {
                        iBinder = d.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    String e = e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    double f = f();
                    parcel2.writeNoException();
                    parcel2.writeDouble(f);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    String g = g();
                    parcel2.writeNoException();
                    parcel2.writeString(g);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    String h = h();
                    parcel2.writeNoException();
                    parcel2.writeString(h);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    Bundle n = n();
                    parcel2.writeNoException();
                    if (n != null) {
                        parcel2.writeInt(1);
                        n.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    p();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    AbstractC3553c i3 = i();
                    parcel2.writeNoException();
                    if (i3 != null) {
                        iBinder = i3.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo13390a();

    /* renamed from: b */
    List mo13389b();

    /* renamed from: c */
    String mo13388c();

    /* renamed from: d */
    AbstractC7813uu mo13387d();

    /* renamed from: e */
    String mo13386e();

    /* renamed from: f */
    double mo13385f();

    /* renamed from: g */
    String mo13384g();

    /* renamed from: h */
    String mo13383h();

    /* renamed from: i */
    AbstractC3553c mo13382i();

    /* renamed from: j */
    AbstractC4170e mo13381j();

    /* renamed from: n */
    Bundle mo13380n();

    /* renamed from: p */
    void mo13379p();
}
