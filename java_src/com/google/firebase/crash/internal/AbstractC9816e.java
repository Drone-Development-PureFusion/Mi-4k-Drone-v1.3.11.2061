package com.google.firebase.crash.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.firebase.crash.internal.e */
/* loaded from: classes.dex */
public interface AbstractC9816e extends IInterface {

    /* renamed from: com.google.firebase.crash.internal.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9817a extends Binder implements AbstractC9816e {

        /* renamed from: com.google.firebase.crash.internal.e$a$a */
        /* loaded from: classes2.dex */
        private static class C9818a implements AbstractC9816e {

            /* renamed from: a */
            private IBinder f30636a;

            C9818a(IBinder iBinder) {
                this.f30636a = iBinder;
            }

            @Override // com.google.firebase.crash.internal.AbstractC9816e
            /* renamed from: a */
            public void mo6891a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                    this.f30636a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.crash.internal.AbstractC9816e
            /* renamed from: a */
            public void mo6890a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30636a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30636a;
            }

            @Override // com.google.firebase.crash.internal.AbstractC9816e
            /* renamed from: b */
            public void mo6889b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30636a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC9816e m6892a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9816e)) ? new C9818a(iBinder) : (AbstractC9816e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.crash.internal.IFirebaseCrashReceiverService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo6891a();

    /* renamed from: a */
    void mo6890a(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    void mo6889b(AbstractC4170e abstractC4170e);
}
