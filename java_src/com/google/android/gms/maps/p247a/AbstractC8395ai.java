package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8594g;
/* renamed from: com.google.android.gms.maps.a.ai */
/* loaded from: classes2.dex */
public interface AbstractC8395ai extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ai$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8396a extends Binder implements AbstractC8395ai {

        /* renamed from: com.google.android.gms.maps.a.ai$a$a */
        /* loaded from: classes2.dex */
        private static class C8397a implements AbstractC8395ai {

            /* renamed from: a */
            private IBinder f27321a;

            C8397a(IBinder iBinder) {
                this.f27321a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8395ai
            /* renamed from: a */
            public void mo11536a(AbstractC8594g abstractC8594g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                    obtain.writeStrongBinder(abstractC8594g != null ? abstractC8594g.asBinder() : null);
                    this.f27321a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27321a;
            }
        }

        public AbstractBinderC8396a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
        }

        /* renamed from: a */
        public static AbstractC8395ai m11851a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8395ai)) ? new C8397a(iBinder) : (AbstractC8395ai) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                    a(AbstractC8594g.AbstractBinderC8595a.m11170a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11536a(AbstractC8594g abstractC8594g);
}
