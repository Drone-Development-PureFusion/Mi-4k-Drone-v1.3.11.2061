package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.p248a.AbstractC8588e;
/* renamed from: com.google.android.gms.maps.a.ag */
/* loaded from: classes2.dex */
public interface AbstractC8389ag extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.ag$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8390a extends Binder implements AbstractC8389ag {

        /* renamed from: com.google.android.gms.maps.a.ag$a$a */
        /* loaded from: classes2.dex */
        private static class C8391a implements AbstractC8389ag {

            /* renamed from: a */
            private IBinder f27319a;

            C8391a(IBinder iBinder) {
                this.f27319a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8389ag
            /* renamed from: a */
            public void mo11552a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    this.f27319a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8389ag
            /* renamed from: a */
            public void mo11551a(AbstractC8588e abstractC8588e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    obtain.writeStrongBinder(abstractC8588e != null ? abstractC8588e.asBinder() : null);
                    this.f27319a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27319a;
            }
        }

        public AbstractBinderC8390a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        }

        /* renamed from: a */
        public static AbstractC8389ag m11853a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8389ag)) ? new C8391a(iBinder) : (AbstractC8389ag) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    a(AbstractC8588e.AbstractBinderC8589a.m11183a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11552a();

    /* renamed from: a */
    void mo11551a(AbstractC8588e abstractC8588e);
}
