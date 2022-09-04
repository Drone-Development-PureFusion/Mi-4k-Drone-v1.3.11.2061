package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.v */
/* loaded from: classes2.dex */
public interface AbstractC4365v extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.v$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4366a extends Binder implements AbstractC4365v {

        /* renamed from: com.google.android.gms.cast.framework.v$a$a */
        /* loaded from: classes2.dex */
        private static class C4367a implements AbstractC4365v {

            /* renamed from: a */
            private IBinder f16470a;

            C4367a(IBinder iBinder) {
                this.f16470a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4365v
            /* renamed from: a */
            public int mo24390a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastStateListener");
                    this.f16470a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4365v
            /* renamed from: a */
            public void mo24389a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastStateListener");
                    obtain.writeInt(i);
                    this.f16470a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16470a;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4365v
            /* renamed from: b */
            public AbstractC4170e mo24388b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastStateListener");
                    this.f16470a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC4366a() {
            attachInterface(this, "com.google.android.gms.cast.framework.ICastStateListener");
        }

        /* renamed from: a */
        public static AbstractC4365v m24391a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastStateListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4365v)) ? new C4367a(iBinder) : (AbstractC4365v) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastStateListener");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastStateListener");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastStateListener");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ICastStateListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24390a();

    /* renamed from: a */
    void mo24389a(int i);

    /* renamed from: b */
    AbstractC4170e mo24388b();
}
