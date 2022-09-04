package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.p247a.AbstractC8434b;
/* renamed from: com.google.android.gms.maps.a.ao */
/* loaded from: classes2.dex */
public interface AbstractC8413ao extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ao$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8414a extends Binder implements AbstractC8413ao {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.maps.a.ao$a$a */
        /* loaded from: classes2.dex */
        public static class C8415a implements AbstractC8413ao {

            /* renamed from: a */
            private IBinder f27327a;

            C8415a(IBinder iBinder) {
                this.f27327a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8413ao
            /* renamed from: a */
            public void mo11842a(AbstractC8434b abstractC8434b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    obtain.writeStrongBinder(abstractC8434b != null ? abstractC8434b.asBinder() : null);
                    this.f27327a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27327a;
            }
        }

        public AbstractBinderC8414a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
        }

        /* renamed from: a */
        public static AbstractC8413ao m11843a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8413ao)) ? new C8415a(iBinder) : (AbstractC8413ao) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    a(AbstractC8434b.AbstractBinderC8435a.m11835a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11842a(AbstractC8434b abstractC8434b);
}
