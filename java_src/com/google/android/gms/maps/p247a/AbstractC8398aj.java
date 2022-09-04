package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8594g;
/* renamed from: com.google.android.gms.maps.a.aj */
/* loaded from: classes2.dex */
public interface AbstractC8398aj extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.aj$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8399a extends Binder implements AbstractC8398aj {

        /* renamed from: com.google.android.gms.maps.a.aj$a$a */
        /* loaded from: classes2.dex */
        private static class C8400a implements AbstractC8398aj {

            /* renamed from: a */
            private IBinder f27322a;

            C8400a(IBinder iBinder) {
                this.f27322a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8398aj
            /* renamed from: a */
            public void mo11537a(AbstractC8594g abstractC8594g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                    obtain.writeStrongBinder(abstractC8594g != null ? abstractC8594g.asBinder() : null);
                    this.f27322a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27322a;
            }
        }

        public AbstractBinderC8399a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
        }

        /* renamed from: a */
        public static AbstractC8398aj m11850a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8398aj)) ? new C8400a(iBinder) : (AbstractC8398aj) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                    a(AbstractC8594g.AbstractBinderC8595a.m11170a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11537a(AbstractC8594g abstractC8594g);
}
