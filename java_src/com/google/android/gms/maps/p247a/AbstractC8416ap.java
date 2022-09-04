package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8594g;
/* renamed from: com.google.android.gms.maps.a.ap */
/* loaded from: classes2.dex */
public interface AbstractC8416ap extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ap$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8417a extends Binder implements AbstractC8416ap {

        /* renamed from: com.google.android.gms.maps.a.ap$a$a */
        /* loaded from: classes2.dex */
        private static class C8418a implements AbstractC8416ap {

            /* renamed from: a */
            private IBinder f27328a;

            C8418a(IBinder iBinder) {
                this.f27328a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8416ap
            /* renamed from: a */
            public boolean mo11548a(AbstractC8594g abstractC8594g) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    obtain.writeStrongBinder(abstractC8594g != null ? abstractC8594g.asBinder() : null);
                    this.f27328a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27328a;
            }
        }

        public AbstractBinderC8417a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
        }

        /* renamed from: a */
        public static AbstractC8416ap m11841a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8416ap)) ? new C8418a(iBinder) : (AbstractC8416ap) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    boolean a = a(AbstractC8594g.AbstractBinderC8595a.m11170a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    boolean mo11548a(AbstractC8594g abstractC8594g);
}
