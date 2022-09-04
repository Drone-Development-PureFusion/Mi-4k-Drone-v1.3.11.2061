package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.database.connection.idl.AbstractC9850f;
/* renamed from: com.google.firebase.database.connection.idl.e */
/* loaded from: classes2.dex */
public interface AbstractC9847e extends IInterface {

    /* renamed from: com.google.firebase.database.connection.idl.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9848a extends Binder implements AbstractC9847e {

        /* renamed from: com.google.firebase.database.connection.idl.e$a$a */
        /* loaded from: classes2.dex */
        private static class C9849a implements AbstractC9847e {

            /* renamed from: a */
            private IBinder f30712a;

            C9849a(IBinder iBinder) {
                this.f30712a = iBinder;
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9847e
            /* renamed from: a */
            public void mo6792a(boolean z, AbstractC9850f abstractC9850f) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(abstractC9850f != null ? abstractC9850f.asBinder() : null);
                    this.f30712a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30712a;
            }
        }

        public AbstractBinderC9848a() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
        }

        /* renamed from: a */
        public static AbstractC9847e m6793a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9847e)) ? new C9849a(iBinder) : (AbstractC9847e) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
                    a(parcel.readInt() != 0, AbstractC9850f.AbstractBinderC9851a.m6791a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo6792a(boolean z, AbstractC9850f abstractC9850f);
}
