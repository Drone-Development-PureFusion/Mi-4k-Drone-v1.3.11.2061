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
/* renamed from: com.google.android.gms.internal.xu */
/* loaded from: classes2.dex */
public interface AbstractC8017xu extends IInterface {

    /* renamed from: com.google.android.gms.internal.xu$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8018a extends Binder implements AbstractC8017xu {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.internal.xu$a$a */
        /* loaded from: classes2.dex */
        public static class C8019a implements AbstractC8017xu {

            /* renamed from: a */
            private IBinder f26315a;

            C8019a(IBinder iBinder) {
                this.f26315a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: a */
            public String mo13016a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: a */
            public void mo13015a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f26315a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26315a;
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: b */
            public List mo13014b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: b */
            public void mo13013b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f26315a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: c */
            public String mo13012c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: c */
            public void mo13011c(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f26315a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: d */
            public AbstractC7813uu mo13010d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7813uu.AbstractBinderC7814a.m13408a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: e */
            public String mo13009e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: f */
            public double mo13008f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readDouble();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: g */
            public String mo13007g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: h */
            public String mo13006h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: i */
            public void mo13005i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: j */
            public boolean mo13004j() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(13, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: k */
            public boolean mo13003k() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(14, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: l */
            public Bundle mo13002l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC8017xu
            /* renamed from: m */
            public AbstractC3553c mo13001m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    this.f26315a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC3553c.AbstractBinderC3554a.m27561a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8018a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }

        /* renamed from: a */
        public static AbstractC8017xu m13039a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8017xu)) ? new C8019a(iBinder) : (AbstractC8017xu) queryLocalInterface;
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
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    List b = b();
                    parcel2.writeNoException();
                    parcel2.writeList(b);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    AbstractC7813uu d = d();
                    parcel2.writeNoException();
                    if (d != null) {
                        iBinder = d.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    String e = e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    double f = f();
                    parcel2.writeNoException();
                    parcel2.writeDouble(f);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    String g = g();
                    parcel2.writeNoException();
                    parcel2.writeString(g);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    String h = h();
                    parcel2.writeNoException();
                    parcel2.writeString(h);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    i();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    boolean j = j();
                    parcel2.writeNoException();
                    parcel2.writeInt(j ? 1 : 0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    boolean k = k();
                    parcel2.writeNoException();
                    if (k) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    Bundle l = l();
                    parcel2.writeNoException();
                    if (l == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    l.writeToParcel(parcel2, 1);
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    c(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    AbstractC3553c m = m();
                    parcel2.writeNoException();
                    if (m != null) {
                        iBinder = m.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo13016a();

    /* renamed from: a */
    void mo13015a(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    List mo13014b();

    /* renamed from: b */
    void mo13013b(AbstractC4170e abstractC4170e);

    /* renamed from: c */
    String mo13012c();

    /* renamed from: c */
    void mo13011c(AbstractC4170e abstractC4170e);

    /* renamed from: d */
    AbstractC7813uu mo13010d();

    /* renamed from: e */
    String mo13009e();

    /* renamed from: f */
    double mo13008f();

    /* renamed from: g */
    String mo13007g();

    /* renamed from: h */
    String mo13006h();

    /* renamed from: i */
    void mo13005i();

    /* renamed from: j */
    boolean mo13004j();

    /* renamed from: k */
    boolean mo13003k();

    /* renamed from: l */
    Bundle mo13002l();

    /* renamed from: m */
    AbstractC3553c mo13001m();
}
