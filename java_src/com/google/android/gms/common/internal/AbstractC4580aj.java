package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.common.internal.aj */
/* loaded from: classes2.dex */
public interface AbstractC4580aj extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.aj$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4581a extends Binder implements AbstractC4580aj {

        /* renamed from: com.google.android.gms.common.internal.aj$a$a */
        /* loaded from: classes2.dex */
        private static class C4582a implements AbstractC4580aj {

            /* renamed from: a */
            private IBinder f17036a;

            C4582a(IBinder iBinder) {
                this.f17036a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4580aj
            /* renamed from: a */
            public AbstractC4170e mo23644a(AbstractC4170e abstractC4170e, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f17036a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4580aj
            /* renamed from: a */
            public AbstractC4170e mo23643a(AbstractC4170e abstractC4170e, SignInButtonConfig signInButtonConfig) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (signInButtonConfig != null) {
                        obtain.writeInt(1);
                        signInButtonConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17036a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17036a;
            }
        }

        /* renamed from: a */
        public static AbstractC4580aj m23645a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4580aj)) ? new C4582a(iBinder) : (AbstractC4580aj) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                    AbstractC4170e a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                    AbstractC4170e a2 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? SignInButtonConfig.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo23644a(AbstractC4170e abstractC4170e, int i, int i2);

    /* renamed from: a */
    AbstractC4170e mo23643a(AbstractC4170e abstractC4170e, SignInButtonConfig signInButtonConfig);
}
