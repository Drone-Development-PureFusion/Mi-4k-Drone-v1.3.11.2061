package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.p247a.AbstractC8449g;
import com.google.android.gms.maps.p247a.AbstractC8479s;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.i */
/* loaded from: classes2.dex */
public interface AbstractC8455i extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8456a extends Binder implements AbstractC8455i {

        /* renamed from: com.google.android.gms.maps.a.i$a$a */
        /* loaded from: classes2.dex */
        private static class C8457a implements AbstractC8455i {

            /* renamed from: a */
            private IBinder f27341a;

            C8457a(IBinder iBinder) {
                this.f27341a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: a */
            public AbstractC8449g mo11688a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f27341a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8449g.AbstractBinderC8450a.m11723a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: a */
            public void mo11687a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27341a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: a */
            public void mo11686a(AbstractC8479s abstractC8479s) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    obtain.writeStrongBinder(abstractC8479s != null ? abstractC8479s.asBinder() : null);
                    this.f27341a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27341a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: b */
            public void mo11685b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f27341a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: b */
            public void mo11684b(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27341a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: c */
            public void mo11683c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f27341a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: d */
            public void mo11682d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f27341a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: e */
            public void mo11681e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f27341a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8455i
            /* renamed from: f */
            public AbstractC4170e mo11680f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f27341a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8455i m11689a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8455i)) ? new C8457a(iBinder) : (AbstractC8455i) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            IBinder iBinder2 = null;
            Bundle bundle = null;
            Bundle bundle2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    AbstractC8449g a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder2 = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder2);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(bundle);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    c();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    b(bundle2);
                    parcel2.writeNoException();
                    if (bundle2 != null) {
                        parcel2.writeInt(1);
                        bundle2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    AbstractC4170e f = f();
                    parcel2.writeNoException();
                    if (f != null) {
                        iBinder = f.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    a(AbstractC8479s.AbstractBinderC8480a.m11650a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC8449g mo11688a();

    /* renamed from: a */
    void mo11687a(Bundle bundle);

    /* renamed from: a */
    void mo11686a(AbstractC8479s abstractC8479s);

    /* renamed from: b */
    void mo11685b();

    /* renamed from: b */
    void mo11684b(Bundle bundle);

    /* renamed from: c */
    void mo11683c();

    /* renamed from: d */
    void mo11682d();

    /* renamed from: e */
    void mo11681e();

    /* renamed from: f */
    AbstractC4170e mo11680f();
}
