package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8594g;
/* renamed from: com.google.android.gms.maps.a.aq */
/* loaded from: classes2.dex */
public interface AbstractC8419aq extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.aq$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8420a extends Binder implements AbstractC8419aq {

        /* renamed from: com.google.android.gms.maps.a.aq$a$a */
        /* loaded from: classes2.dex */
        private static class C8421a implements AbstractC8419aq {

            /* renamed from: a */
            private IBinder f27329a;

            C8421a(IBinder iBinder) {
                this.f27329a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8419aq
            /* renamed from: a */
            public void mo11542a(AbstractC8594g abstractC8594g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(abstractC8594g != null ? abstractC8594g.asBinder() : null);
                    this.f27329a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27329a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8419aq
            /* renamed from: b */
            public void mo11541b(AbstractC8594g abstractC8594g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(abstractC8594g != null ? abstractC8594g.asBinder() : null);
                    this.f27329a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8419aq
            /* renamed from: c */
            public void mo11540c(AbstractC8594g abstractC8594g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(abstractC8594g != null ? abstractC8594g.asBinder() : null);
                    this.f27329a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8420a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        /* renamed from: a */
        public static AbstractC8419aq m11840a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8419aq)) ? new C8421a(iBinder) : (AbstractC8419aq) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    a(AbstractC8594g.AbstractBinderC8595a.m11170a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    c(AbstractC8594g.AbstractBinderC8595a.m11170a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    b(AbstractC8594g.AbstractBinderC8595a.m11170a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11542a(AbstractC8594g abstractC8594g);

    /* renamed from: b */
    void mo11541b(AbstractC8594g abstractC8594g);

    /* renamed from: c */
    void mo11540c(AbstractC8594g abstractC8594g);
}
