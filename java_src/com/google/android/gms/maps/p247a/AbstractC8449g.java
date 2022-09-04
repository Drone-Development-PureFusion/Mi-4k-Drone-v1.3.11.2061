package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.p247a.AbstractC8467o;
import com.google.android.gms.maps.p247a.AbstractC8470p;
import com.google.android.gms.maps.p247a.AbstractC8473q;
import com.google.android.gms.maps.p247a.AbstractC8476r;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.g */
/* loaded from: classes2.dex */
public interface AbstractC8449g extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8450a extends Binder implements AbstractC8449g {

        /* renamed from: com.google.android.gms.maps.a.g$a$a */
        /* loaded from: classes2.dex */
        private static class C8451a implements AbstractC8449g {

            /* renamed from: a */
            private IBinder f27339a;

            C8451a(IBinder iBinder) {
                this.f27339a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public AbstractC4170e mo11713a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (streetViewPanoramaOrientation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOrientation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27339a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public StreetViewPanoramaOrientation mo11721a(AbstractC4170e abstractC4170e) {
                StreetViewPanoramaOrientation streetViewPanoramaOrientation = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27339a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) StreetViewPanoramaOrientation.CREATOR.createFromParcel(obtain2);
                    }
                    return streetViewPanoramaOrientation;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11720a(AbstractC8467o abstractC8467o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(abstractC8467o != null ? abstractC8467o.asBinder() : null);
                    this.f27339a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11719a(AbstractC8470p abstractC8470p) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(abstractC8470p != null ? abstractC8470p.asBinder() : null);
                    this.f27339a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11718a(AbstractC8473q abstractC8473q) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(abstractC8473q != null ? abstractC8473q.asBinder() : null);
                    this.f27339a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11717a(AbstractC8476r abstractC8476r) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(abstractC8476r != null ? abstractC8476r.asBinder() : null);
                    this.f27339a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11716a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27339a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11715a(LatLng latLng, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f27339a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11714a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (streetViewPanoramaCamera != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaCamera.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f27339a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11712a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeString(str);
                    this.f27339a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public void mo11711a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f27339a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: a */
            public boolean mo11722a() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f27339a.transact(5, obtain, obtain2, 0);
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
                return this.f27339a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: b */
            public void mo11709b(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27339a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: b */
            public boolean mo11710b() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f27339a.transact(6, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: c */
            public void mo11707c(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27339a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: c */
            public boolean mo11708c() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f27339a.transact(7, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: d */
            public void mo11705d(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27339a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: d */
            public boolean mo11706d() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f27339a.transact(8, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: e */
            public StreetViewPanoramaCamera mo11704e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f27339a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (StreetViewPanoramaCamera) StreetViewPanoramaCamera.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8449g
            /* renamed from: f */
            public StreetViewPanoramaLocation mo11703f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f27339a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (StreetViewPanoramaLocation) StreetViewPanoramaLocation.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8449g m11723a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8449g)) ? new C8451a(iBinder) : (AbstractC8449g) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    b(z2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    c(z3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    d(z4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean a = a();
                    parcel2.writeNoException();
                    if (a) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean b = b();
                    parcel2.writeNoException();
                    if (b) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean c = c();
                    parcel2.writeNoException();
                    if (c) {
                        i6 = 1;
                    }
                    parcel2.writeInt(i6);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean d = d();
                    parcel2.writeNoException();
                    if (d) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(parcel.readInt() != 0 ? (StreetViewPanoramaCamera) StreetViewPanoramaCamera.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaCamera e = e();
                    parcel2.writeNoException();
                    if (e == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    e.writeToParcel(parcel2, 1);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaLocation f = f();
                    parcel2.writeNoException();
                    if (f == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    f.writeToParcel(parcel2, 1);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(AbstractC8470p.AbstractBinderC8471a.m11653a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(AbstractC8467o.AbstractBinderC8468a.m11654a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(AbstractC8473q.AbstractBinderC8474a.m11652a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaOrientation a2 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a2 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    AbstractC4170e a3 = a(parcel.readInt() != 0 ? (StreetViewPanoramaOrientation) StreetViewPanoramaOrientation.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a3 != null) {
                        iBinder = a3.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    a(AbstractC8476r.AbstractBinderC8477a.m11651a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo11713a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    /* renamed from: a */
    StreetViewPanoramaOrientation mo11721a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo11720a(AbstractC8467o abstractC8467o);

    /* renamed from: a */
    void mo11719a(AbstractC8470p abstractC8470p);

    /* renamed from: a */
    void mo11718a(AbstractC8473q abstractC8473q);

    /* renamed from: a */
    void mo11717a(AbstractC8476r abstractC8476r);

    /* renamed from: a */
    void mo11716a(LatLng latLng);

    /* renamed from: a */
    void mo11715a(LatLng latLng, int i);

    /* renamed from: a */
    void mo11714a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j);

    /* renamed from: a */
    void mo11712a(String str);

    /* renamed from: a */
    void mo11711a(boolean z);

    /* renamed from: a */
    boolean mo11722a();

    /* renamed from: b */
    void mo11709b(boolean z);

    /* renamed from: b */
    boolean mo11710b();

    /* renamed from: c */
    void mo11707c(boolean z);

    /* renamed from: c */
    boolean mo11708c();

    /* renamed from: d */
    void mo11705d(boolean z);

    /* renamed from: d */
    boolean mo11706d();

    /* renamed from: e */
    StreetViewPanoramaCamera mo11704e();

    /* renamed from: f */
    StreetViewPanoramaLocation mo11703f();
}
