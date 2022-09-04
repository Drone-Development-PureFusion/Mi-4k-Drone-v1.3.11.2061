package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8576a;
/* renamed from: com.google.android.gms.maps.a.n */
/* loaded from: classes2.dex */
public interface AbstractC8464n extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.n$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8465a extends Binder implements AbstractC8464n {

        /* renamed from: com.google.android.gms.maps.a.n$a$a */
        /* loaded from: classes2.dex */
        private static class C8466a implements AbstractC8464n {

            /* renamed from: a */
            private IBinder f27343a;

            C8466a(IBinder iBinder) {
                this.f27343a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8464n
            /* renamed from: a */
            public void mo11526a(AbstractC8576a abstractC8576a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    obtain.writeStrongBinder(abstractC8576a != null ? abstractC8576a.asBinder() : null);
                    this.f27343a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27343a;
            }
        }

        public AbstractBinderC8465a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnPolylineClickListener");
        }

        /* renamed from: a */
        public static AbstractC8464n m11655a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8464n)) ? new C8466a(iBinder) : (AbstractC8464n) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    a(AbstractC8576a.AbstractBinderC8577a.m11255a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11526a(AbstractC8576a abstractC8576a);
}
