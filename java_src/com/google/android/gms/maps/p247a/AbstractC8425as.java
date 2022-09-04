package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.as */
/* loaded from: classes2.dex */
public interface AbstractC8425as extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.as$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8426a extends Binder implements AbstractC8425as {

        /* renamed from: com.google.android.gms.maps.a.as$a$a */
        /* loaded from: classes2.dex */
        private static class C8427a implements AbstractC8425as {

            /* renamed from: a */
            private IBinder f27331a;

            C8427a(IBinder iBinder) {
                this.f27331a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8425as
            /* renamed from: a */
            public void mo11533a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27331a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27331a;
            }
        }

        public AbstractBinderC8426a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        }

        /* renamed from: a */
        public static AbstractC8425as m11838a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8425as)) ? new C8427a(iBinder) : (AbstractC8425as) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11533a(AbstractC4170e abstractC4170e);
}
