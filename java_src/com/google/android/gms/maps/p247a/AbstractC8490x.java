package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.p248a.AbstractC8579b;
import com.google.android.gms.maps.p247a.AbstractC8368a;
import com.google.android.gms.maps.p247a.AbstractC8440d;
import com.google.android.gms.maps.p247a.AbstractC8443e;
import com.google.android.gms.maps.p247a.AbstractC8452h;
import com.google.android.gms.maps.p247a.AbstractC8455i;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.x */
/* loaded from: classes2.dex */
public interface AbstractC8490x extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.x$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8491a extends Binder implements AbstractC8490x {

        /* renamed from: com.google.android.gms.maps.a.x$a$a */
        /* loaded from: classes2.dex */
        private static class C8492a implements AbstractC8490x {

            /* renamed from: a */
            private IBinder f27353a;

            C8492a(IBinder iBinder) {
                this.f27353a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: a */
            public AbstractC8368a mo11636a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f27353a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8368a.AbstractBinderC8369a.m11871a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: a */
            public AbstractC8443e mo11633a(AbstractC4170e abstractC4170e, GoogleMapOptions googleMapOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (googleMapOptions != null) {
                        obtain.writeInt(1);
                        googleMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27353a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8443e.AbstractBinderC8444a.m11741a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: a */
            public AbstractC8455i mo11632a(AbstractC4170e abstractC4170e, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (streetViewPanoramaOptions != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27353a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8455i.AbstractBinderC8456a.m11689a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: a */
            public void mo11635a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27353a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: a */
            public void mo11634a(AbstractC4170e abstractC4170e, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    this.f27353a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27353a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: b */
            public AbstractC8440d mo11630b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27353a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8440d.AbstractBinderC8441a.m11758a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: b */
            public AbstractC8579b mo11631b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f27353a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8579b.AbstractBinderC8580a.m11236a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8490x
            /* renamed from: c */
            public AbstractC8452h mo11629c(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27353a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8452h.AbstractBinderC8453a.m11702a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8490x m11637a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8490x)) ? new C8492a(iBinder) : (AbstractC8490x) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    AbstractC8440d b = b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    AbstractC8443e a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (GoogleMapOptions) GoogleMapOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    AbstractC8368a a2 = a();
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    AbstractC8579b b2 = b();
                    parcel2.writeNoException();
                    if (b2 != null) {
                        iBinder = b2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    AbstractC8455i a3 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (StreetViewPanoramaOptions) StreetViewPanoramaOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a3 != null) {
                        iBinder = a3.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    AbstractC8452h c = c(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (c != null) {
                        iBinder = c.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC8368a mo11636a();

    /* renamed from: a */
    AbstractC8443e mo11633a(AbstractC4170e abstractC4170e, GoogleMapOptions googleMapOptions);

    /* renamed from: a */
    AbstractC8455i mo11632a(AbstractC4170e abstractC4170e, StreetViewPanoramaOptions streetViewPanoramaOptions);

    /* renamed from: a */
    void mo11635a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo11634a(AbstractC4170e abstractC4170e, int i);

    /* renamed from: b */
    AbstractC8440d mo11630b(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    AbstractC8579b mo11631b();

    /* renamed from: c */
    AbstractC8452h mo11629c(AbstractC4170e abstractC4170e);
}
