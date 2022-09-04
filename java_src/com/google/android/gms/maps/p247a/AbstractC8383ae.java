package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8582c;
/* renamed from: com.google.android.gms.maps.a.ae */
/* loaded from: classes2.dex */
public interface AbstractC8383ae extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ae$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8384a extends Binder implements AbstractC8383ae {

        /* renamed from: com.google.android.gms.maps.a.ae$a$a */
        /* loaded from: classes2.dex */
        private static class C8385a implements AbstractC8383ae {

            /* renamed from: a */
            private IBinder f27317a;

            C8385a(IBinder iBinder) {
                this.f27317a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8383ae
            /* renamed from: a */
            public void mo11528a(AbstractC8582c abstractC8582c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCircleClickListener");
                    obtain.writeStrongBinder(abstractC8582c != null ? abstractC8582c.asBinder() : null);
                    this.f27317a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27317a;
            }
        }

        public AbstractBinderC8384a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnCircleClickListener");
        }

        /* renamed from: a */
        public static AbstractC8383ae m11855a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCircleClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8383ae)) ? new C8385a(iBinder) : (AbstractC8383ae) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCircleClickListener");
                    a(AbstractC8582c.AbstractBinderC8583a.m11228a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnCircleClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11528a(AbstractC8582c abstractC8582c);
}
