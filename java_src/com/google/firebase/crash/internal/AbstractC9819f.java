package com.google.firebase.crash.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.firebase.crash.internal.f */
/* loaded from: classes.dex */
public interface AbstractC9819f extends IInterface {

    /* renamed from: com.google.firebase.crash.internal.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9820a extends Binder implements AbstractC9819f {

        /* renamed from: com.google.firebase.crash.internal.f$a$a */
        /* loaded from: classes2.dex */
        private static class C9821a implements AbstractC9819f {

            /* renamed from: a */
            private IBinder f30637a;

            C9821a(IBinder iBinder) {
                this.f30637a = iBinder;
            }

            @Override // com.google.firebase.crash.internal.AbstractC9819f
            /* renamed from: a */
            public void mo6887a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                    this.f30637a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.crash.internal.AbstractC9819f
            /* renamed from: a */
            public void mo6886a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30637a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30637a;
            }

            @Override // com.google.firebase.crash.internal.AbstractC9819f
            /* renamed from: b */
            public void mo6885b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f30637a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC9819f m6888a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9819f)) ? new C9821a(iBinder) : (AbstractC9819f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.crash.internal.IFirebaseCrashSenderService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo6887a();

    /* renamed from: a */
    void mo6886a(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    void mo6885b(AbstractC4170e abstractC4170e);
}
