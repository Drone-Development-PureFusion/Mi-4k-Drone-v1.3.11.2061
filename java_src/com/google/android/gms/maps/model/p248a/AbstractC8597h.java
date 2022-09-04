package com.google.android.gms.maps.model.p248a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* renamed from: com.google.android.gms.maps.model.a.h */
/* loaded from: classes2.dex */
public interface AbstractC8597h extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.a.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8598a extends Binder implements AbstractC8597h {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.maps.model.a.h$a$a */
        /* loaded from: classes2.dex */
        public static class C8599a implements AbstractC8597h {

            /* renamed from: a */
            private IBinder f27561a;

            C8599a(IBinder iBinder) {
                this.f27561a = iBinder;
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: a */
            public void mo11138a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: a */
            public void mo11137a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    obtain.writeFloat(f);
                    this.f27561a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: a */
            public void mo11136a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    obtain.writeInt(i);
                    this.f27561a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: a */
            public void mo11134a(List<LatLng> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    obtain.writeTypedList(list);
                    this.f27561a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: a */
            public void mo11133a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27561a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: a */
            public boolean mo11135a(AbstractC8597h abstractC8597h) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    obtain.writeStrongBinder(abstractC8597h != null ? abstractC8597h.asBinder() : null);
                    this.f27561a.transact(19, obtain, obtain2, 0);
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
                return this.f27561a;
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: b */
            public String mo11132b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: b */
            public void mo11131b(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    obtain.writeFloat(f);
                    this.f27561a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: b */
            public void mo11130b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    obtain.writeInt(i);
                    this.f27561a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: b */
            public void mo11129b(List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    obtain.writeList(list);
                    this.f27561a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: b */
            public void mo11128b(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27561a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: c */
            public List<LatLng> mo11127c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(LatLng.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: c */
            public void mo11126c(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27561a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: d */
            public List mo11125d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: e */
            public float mo11124e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: f */
            public int mo11123f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: g */
            public int mo11122g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: h */
            public float mo11121h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: i */
            public boolean mo11120i() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(16, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: j */
            public boolean mo11119j() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(18, obtain, obtain2, 0);
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

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: k */
            public int mo11118k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8597h
            /* renamed from: l */
            public boolean mo11117l() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.f27561a.transact(22, obtain, obtain2, 0);
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
        }

        /* renamed from: a */
        public static AbstractC8597h m11139a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8597h)) ? new C8599a(iBinder) : (AbstractC8597h) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            int i6 = 0;
            boolean z3 = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    String b = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    a(parcel.createTypedArrayList(LatLng.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    List<LatLng> c = c();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(c);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    b(parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    List d = d();
                    parcel2.writeNoException();
                    parcel2.writeList(d);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    a(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    float e = e();
                    parcel2.writeNoException();
                    parcel2.writeFloat(e);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    int f = f();
                    parcel2.writeNoException();
                    parcel2.writeInt(f);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    int g = g();
                    parcel2.writeNoException();
                    parcel2.writeInt(g);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    b(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    float h = h();
                    parcel2.writeNoException();
                    parcel2.writeFloat(h);
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    boolean i7 = i();
                    parcel2.writeNoException();
                    if (i7) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    b(z2);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    boolean j = j();
                    parcel2.writeNoException();
                    if (j) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    boolean a = a(m11139a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a) {
                        i6 = 1;
                    }
                    parcel2.writeInt(i6);
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    int k = k();
                    parcel2.writeNoException();
                    parcel2.writeInt(k);
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    c(z3);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    boolean l = l();
                    parcel2.writeNoException();
                    if (l) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11138a();

    /* renamed from: a */
    void mo11137a(float f);

    /* renamed from: a */
    void mo11136a(int i);

    /* renamed from: a */
    void mo11134a(List<LatLng> list);

    /* renamed from: a */
    void mo11133a(boolean z);

    /* renamed from: a */
    boolean mo11135a(AbstractC8597h abstractC8597h);

    /* renamed from: b */
    String mo11132b();

    /* renamed from: b */
    void mo11131b(float f);

    /* renamed from: b */
    void mo11130b(int i);

    /* renamed from: b */
    void mo11129b(List list);

    /* renamed from: b */
    void mo11128b(boolean z);

    /* renamed from: c */
    List<LatLng> mo11127c();

    /* renamed from: c */
    void mo11126c(boolean z);

    /* renamed from: d */
    List mo11125d();

    /* renamed from: e */
    float mo11124e();

    /* renamed from: f */
    int mo11123f();

    /* renamed from: g */
    int mo11122g();

    /* renamed from: h */
    float mo11121h();

    /* renamed from: i */
    boolean mo11120i();

    /* renamed from: j */
    boolean mo11119j();

    /* renamed from: k */
    int mo11118k();

    /* renamed from: l */
    boolean mo11117l();
}
