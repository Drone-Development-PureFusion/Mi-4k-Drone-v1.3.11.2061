package com.google.android.gms.maps.model.p248a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.model.a.i */
/* loaded from: classes2.dex */
public interface AbstractC8600i extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.a.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8601a extends Binder implements AbstractC8600i {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.maps.model.a.i$a$a */
        /* loaded from: classes2.dex */
        public static class C8602a implements AbstractC8600i {

            /* renamed from: a */
            private IBinder f27562a;

            C8602a(IBinder iBinder) {
                this.f27562a = iBinder;
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: a */
            public void mo11115a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: a */
            public void mo11114a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    obtain.writeFloat(f);
                    this.f27562a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: a */
            public void mo11112a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27562a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: a */
            public boolean mo11113a(AbstractC8600i abstractC8600i) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    obtain.writeStrongBinder(abstractC8600i != null ? abstractC8600i.asBinder() : null);
                    this.f27562a.transact(8, obtain, obtain2, 0);
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

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27562a;
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: b */
            public void mo11111b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: b */
            public void mo11110b(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    obtain.writeFloat(f);
                    this.f27562a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: b */
            public void mo11109b(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27562a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: c */
            public String mo11108c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: d */
            public float mo11107d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: e */
            public boolean mo11106e() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(7, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: f */
            public int mo11105f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: g */
            public boolean mo11104g() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(11, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8600i
            /* renamed from: h */
            public float mo11103h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.f27562a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8600i m11116a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8600i)) ? new C8602a(iBinder) : (AbstractC8600i) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            int i5 = 0;
            boolean z2 = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    a(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    float d = d();
                    parcel2.writeNoException();
                    parcel2.writeFloat(d);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    boolean e = e();
                    parcel2.writeNoException();
                    if (e) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    boolean a = a(m11116a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    int f = f();
                    parcel2.writeNoException();
                    parcel2.writeInt(f);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    b(z2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    boolean g = g();
                    parcel2.writeNoException();
                    if (g) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    b(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    float h = h();
                    parcel2.writeNoException();
                    parcel2.writeFloat(h);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11115a();

    /* renamed from: a */
    void mo11114a(float f);

    /* renamed from: a */
    void mo11112a(boolean z);

    /* renamed from: a */
    boolean mo11113a(AbstractC8600i abstractC8600i);

    /* renamed from: b */
    void mo11111b();

    /* renamed from: b */
    void mo11110b(float f);

    /* renamed from: b */
    void mo11109b(boolean z);

    /* renamed from: c */
    String mo11108c();

    /* renamed from: d */
    float mo11107d();

    /* renamed from: e */
    boolean mo11106e();

    /* renamed from: f */
    int mo11105f();

    /* renamed from: g */
    boolean mo11104g();

    /* renamed from: h */
    float mo11103h();
}
