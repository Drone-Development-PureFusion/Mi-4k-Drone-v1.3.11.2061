package com.google.android.gms.maps.model.p248a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.maps.model.a.f */
/* loaded from: classes2.dex */
public interface AbstractC8591f extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.a.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8592a extends Binder implements AbstractC8591f {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.maps.model.a.f$a$a */
        /* loaded from: classes2.dex */
        public static class C8593a implements AbstractC8591f {

            /* renamed from: a */
            private IBinder f27559a;

            C8593a(IBinder iBinder) {
                this.f27559a = iBinder;
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8591f
            /* renamed from: a */
            public String mo11175a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f27559a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8591f
            /* renamed from: a */
            public boolean mo11174a(AbstractC8591f abstractC8591f) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    obtain.writeStrongBinder(abstractC8591f != null ? abstractC8591f.asBinder() : null);
                    this.f27559a.transact(4, obtain, obtain2, 0);
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
                return this.f27559a;
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8591f
            /* renamed from: b */
            public String mo11173b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f27559a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8591f
            /* renamed from: c */
            public void mo11172c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f27559a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.model.p248a.AbstractC8591f
            /* renamed from: d */
            public int mo11171d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f27559a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8591f m11176a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8591f)) ? new C8593a(iBinder) : (AbstractC8591f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    String b = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    c();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    boolean a2 = a(m11176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a2 ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    int d = d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    String mo11175a();

    /* renamed from: a */
    boolean mo11174a(AbstractC8591f abstractC8591f);

    /* renamed from: b */
    String mo11173b();

    /* renamed from: c */
    void mo11172c();

    /* renamed from: d */
    int mo11171d();
}
