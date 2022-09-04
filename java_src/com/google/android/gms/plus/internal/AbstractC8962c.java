package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.plus.internal.c */
/* loaded from: classes2.dex */
public interface AbstractC8962c extends IInterface {

    /* renamed from: com.google.android.gms.plus.internal.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8963a extends Binder implements AbstractC8962c {

        /* renamed from: com.google.android.gms.plus.internal.c$a$a */
        /* loaded from: classes2.dex */
        private static class C8964a implements AbstractC8962c {

            /* renamed from: a */
            private IBinder f28511a;

            C8964a(IBinder iBinder) {
                this.f28511a = iBinder;
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8962c
            /* renamed from: a */
            public AbstractC4170e mo9657a(AbstractC4170e abstractC4170e, int i, int i2, String str, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    this.f28511a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8962c
            /* renamed from: a */
            public AbstractC4170e mo9656a(AbstractC4170e abstractC4170e, int i, int i2, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f28511a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28511a;
            }
        }

        /* renamed from: a */
        public static AbstractC8962c m9658a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8962c)) ? new C8964a(iBinder) : (AbstractC8962c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    AbstractC4170e a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    AbstractC4170e a2 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo9657a(AbstractC4170e abstractC4170e, int i, int i2, String str, int i3);

    /* renamed from: a */
    AbstractC4170e mo9656a(AbstractC4170e abstractC4170e, int i, int i2, String str, String str2);
}
