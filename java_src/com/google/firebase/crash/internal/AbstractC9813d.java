package com.google.firebase.crash.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.firebase.crash.internal.d */
/* loaded from: classes2.dex */
public interface AbstractC9813d extends IInterface {

    /* renamed from: com.google.firebase.crash.internal.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9814a extends Binder implements AbstractC9813d {

        /* renamed from: com.google.firebase.crash.internal.d$a$a */
        /* loaded from: classes2.dex */
        private static class C9815a implements AbstractC9813d {

            /* renamed from: a */
            private IBinder f30635a;

            C9815a(IBinder iBinder) {
                this.f30635a = iBinder;
            }

            @Override // com.google.firebase.crash.internal.AbstractC9813d
            /* renamed from: a */
            public void mo6897a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30635a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.crash.internal.AbstractC9813d
            /* renamed from: a */
            public void mo6896a(AbstractC4170e abstractC4170e, FirebaseCrashOptions firebaseCrashOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (firebaseCrashOptions != null) {
                        obtain.writeInt(1);
                        firebaseCrashOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30635a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.crash.internal.AbstractC9813d
            /* renamed from: a */
            public void mo6895a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    obtain.writeString(str);
                    this.f30635a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30635a;
            }

            @Override // com.google.firebase.crash.internal.AbstractC9813d
            /* renamed from: b */
            public void mo6894b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30635a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.crash.internal.AbstractC9813d
            /* renamed from: b */
            public void mo6893b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    obtain.writeString(str);
                    this.f30635a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC9813d m6898a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9813d)) ? new C9815a(iBinder) : (AbstractC9813d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? FirebaseCrashOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    b(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.crash.internal.IFirebaseCrashApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo6897a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo6896a(AbstractC4170e abstractC4170e, FirebaseCrashOptions firebaseCrashOptions);

    /* renamed from: a */
    void mo6895a(String str);

    /* renamed from: b */
    void mo6894b(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    void mo6893b(String str);
}
