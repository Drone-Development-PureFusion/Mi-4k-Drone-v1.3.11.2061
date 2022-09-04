package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractC3556d;
/* renamed from: com.google.android.gms.ads.internal.client.c */
/* loaded from: classes2.dex */
public interface AbstractC3553c extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3554a extends Binder implements AbstractC3553c {

        /* renamed from: com.google.android.gms.ads.internal.client.c$a$a */
        /* loaded from: classes2.dex */
        private static class C3555a implements AbstractC3553c {

            /* renamed from: a */
            private IBinder f13954a;

            C3555a(IBinder iBinder) {
                this.f13954a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: a */
            public void mo18067a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    this.f13954a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: a */
            public void mo18064a(AbstractC3556d abstractC3556d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    obtain.writeStrongBinder(abstractC3556d != null ? abstractC3556d.asBinder() : null);
                    this.f13954a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: a */
            public void mo18059a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f13954a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13954a;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: b */
            public void mo18058b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    this.f13954a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: c */
            public boolean mo18055c() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    this.f13954a.transact(4, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: d */
            public int mo18053d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    this.f13954a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: e */
            public float mo18051e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    this.f13954a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: f */
            public float mo18050f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    this.f13954a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
            /* renamed from: g */
            public float mo18049g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IVideoController");
                    this.f13954a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC3554a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
        }

        /* renamed from: a */
        public static AbstractC3553c m27561a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3553c)) ? new C3555a(iBinder) : (AbstractC3553c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    boolean c = c();
                    parcel2.writeNoException();
                    if (c) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    int d = d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    float e = e();
                    parcel2.writeNoException();
                    parcel2.writeFloat(e);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    float f = f();
                    parcel2.writeNoException();
                    parcel2.writeFloat(f);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    a(AbstractC3556d.AbstractBinderC3557a.m27560a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IVideoController");
                    float g = g();
                    parcel2.writeNoException();
                    parcel2.writeFloat(g);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IVideoController");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo18067a();

    /* renamed from: a */
    void mo18064a(AbstractC3556d abstractC3556d);

    /* renamed from: a */
    void mo18059a(boolean z);

    /* renamed from: b */
    void mo18058b();

    /* renamed from: c */
    boolean mo18055c();

    /* renamed from: d */
    int mo18053d();

    /* renamed from: e */
    float mo18051e();

    /* renamed from: f */
    float mo18050f();

    /* renamed from: g */
    float mo18049g();
}
