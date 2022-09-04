package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.p232c.AbstractC4170e;
import java.util.List;
/* renamed from: com.google.android.gms.internal.vb */
/* loaded from: classes2.dex */
public interface AbstractC7831vb extends IInterface {

    /* renamed from: com.google.android.gms.internal.vb$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7832a extends Binder implements AbstractC7831vb {

        /* renamed from: com.google.android.gms.internal.vb$a$a */
        /* loaded from: classes2.dex */
        private static class C7833a implements AbstractC7831vb {

            /* renamed from: a */
            private IBinder f25970a;

            C7833a(IBinder iBinder) {
                this.f25970a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: a */
            public String mo13364a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25970a;
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: b */
            public List mo13363b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: c */
            public String mo13362c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: d */
            public AbstractC7813uu mo13361d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7813uu.AbstractBinderC7814a.m13408a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: e */
            public String mo13360e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: f */
            public String mo13359f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: g */
            public AbstractC4170e mo13358g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: h */
            public Bundle mo13357h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7831vb
            /* renamed from: i */
            public void mo13356i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.f25970a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC7832a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        }

        /* renamed from: a */
        public static AbstractC7831vb m13365a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7831vb)) ? new C7833a(iBinder) : (AbstractC7831vb) queryLocalInterface;
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
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    AbstractC4170e g = g();
                    parcel2.writeNoException();
                    if (g != null) {
                        iBinder = g.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    List b = b();
                    parcel2.writeNoException();
                    parcel2.writeList(b);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    AbstractC7813uu d = d();
                    parcel2.writeNoException();
                    if (d != null) {
                        iBinder = d.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String e = e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String f = f();
                    parcel2.writeNoException();
                    parcel2.writeString(f);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    Bundle h = h();
                    parcel2.writeNoException();
                    if (h != null) {
                        parcel2.writeInt(1);
                        h.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    i();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo13364a();

    /* renamed from: b */
    List mo13363b();

    /* renamed from: c */
    String mo13362c();

    /* renamed from: d */
    AbstractC7813uu mo13361d();

    /* renamed from: e */
    String mo13360e();

    /* renamed from: f */
    String mo13359f();

    /* renamed from: g */
    AbstractC4170e mo13358g();

    /* renamed from: h */
    Bundle mo13357h();

    /* renamed from: i */
    void mo13356i();
}
