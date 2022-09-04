package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8594g;
/* renamed from: com.google.android.gms.maps.a.ah */
/* loaded from: classes2.dex */
public interface AbstractC8392ah extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ah$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8393a extends Binder implements AbstractC8392ah {

        /* renamed from: com.google.android.gms.maps.a.ah$a$a */
        /* loaded from: classes2.dex */
        private static class C8394a implements AbstractC8392ah {

            /* renamed from: a */
            private IBinder f27320a;

            C8394a(IBinder iBinder) {
                this.f27320a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8392ah
            /* renamed from: a */
            public void mo11539a(AbstractC8594g abstractC8594g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    obtain.writeStrongBinder(abstractC8594g != null ? abstractC8594g.asBinder() : null);
                    this.f27320a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27320a;
            }
        }

        public AbstractBinderC8393a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        }

        /* renamed from: a */
        public static AbstractC8392ah m11852a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8392ah)) ? new C8394a(iBinder) : (AbstractC8392ah) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    a(AbstractC8594g.AbstractBinderC8595a.m11170a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11539a(AbstractC8594g abstractC8594g);
}
