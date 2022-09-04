package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8597h;
/* renamed from: com.google.android.gms.maps.a.au */
/* loaded from: classes2.dex */
public interface AbstractC8431au extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.au$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8432a extends Binder implements AbstractC8431au {

        /* renamed from: com.google.android.gms.maps.a.au$a$a */
        /* loaded from: classes2.dex */
        private static class C8433a implements AbstractC8431au {

            /* renamed from: a */
            private IBinder f27333a;

            C8433a(IBinder iBinder) {
                this.f27333a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8431au
            /* renamed from: a */
            public void mo11527a(AbstractC8597h abstractC8597h) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                    obtain.writeStrongBinder(abstractC8597h != null ? abstractC8597h.asBinder() : null);
                    this.f27333a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27333a;
            }
        }

        public AbstractBinderC8432a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnPolygonClickListener");
        }

        /* renamed from: a */
        public static AbstractC8431au m11836a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8431au)) ? new C8433a(iBinder) : (AbstractC8431au) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                    a(AbstractC8597h.AbstractBinderC8598a.m11139a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11527a(AbstractC8597h abstractC8597h);
}
