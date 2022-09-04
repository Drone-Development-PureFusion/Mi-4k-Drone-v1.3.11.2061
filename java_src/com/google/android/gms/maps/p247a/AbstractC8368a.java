package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.a */
/* loaded from: classes2.dex */
public interface AbstractC8368a extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8369a extends Binder implements AbstractC8368a {

        /* renamed from: com.google.android.gms.maps.a.a$a$a */
        /* loaded from: classes2.dex */
        private static class C8370a implements AbstractC8368a {

            /* renamed from: a */
            private IBinder f27312a;

            C8370a(IBinder iBinder) {
                this.f27312a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11870a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    this.f27312a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11869a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.f27312a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11868a(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f27312a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11867a(float f, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f27312a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11866a(CameraPosition cameraPosition) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (cameraPosition != null) {
                        obtain.writeInt(1);
                        cameraPosition.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27312a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11865a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27312a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11864a(LatLng latLng, float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeFloat(f);
                    this.f27312a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11863a(LatLngBounds latLngBounds, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f27312a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: a */
            public AbstractC4170e mo11862a(LatLngBounds latLngBounds, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f27312a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27312a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: b */
            public AbstractC4170e mo11861b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    this.f27312a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8368a
            /* renamed from: b */
            public AbstractC4170e mo11860b(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.f27312a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8368a m11871a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8368a)) ? new C8370a(iBinder) : (AbstractC8368a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a = a();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    if (b != null) {
                        iBinder = b.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a2 = a(parcel.readFloat(), parcel.readFloat());
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a3 = a(parcel.readFloat());
                    parcel2.writeNoException();
                    if (a3 != null) {
                        iBinder = a3.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e b2 = b(parcel.readFloat());
                    parcel2.writeNoException();
                    if (b2 != null) {
                        iBinder = b2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a4 = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (a4 != null) {
                        iBinder = a4.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a5 = a(parcel.readInt() != 0 ? (CameraPosition) CameraPosition.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a5 != null) {
                        iBinder = a5.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a6 = a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a6 != null) {
                        iBinder = a6.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a7 = a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readFloat());
                    parcel2.writeNoException();
                    if (a7 != null) {
                        iBinder = a7.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a8 = a(parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    if (a8 != null) {
                        iBinder = a8.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    AbstractC4170e a9 = a(parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (a9 != null) {
                        iBinder = a9.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo11870a();

    /* renamed from: a */
    AbstractC4170e mo11869a(float f);

    /* renamed from: a */
    AbstractC4170e mo11868a(float f, float f2);

    /* renamed from: a */
    AbstractC4170e mo11867a(float f, int i, int i2);

    /* renamed from: a */
    AbstractC4170e mo11866a(CameraPosition cameraPosition);

    /* renamed from: a */
    AbstractC4170e mo11865a(LatLng latLng);

    /* renamed from: a */
    AbstractC4170e mo11864a(LatLng latLng, float f);

    /* renamed from: a */
    AbstractC4170e mo11863a(LatLngBounds latLngBounds, int i);

    /* renamed from: a */
    AbstractC4170e mo11862a(LatLngBounds latLngBounds, int i, int i2, int i3);

    /* renamed from: b */
    AbstractC4170e mo11861b();

    /* renamed from: b */
    AbstractC4170e mo11860b(float f);
}
