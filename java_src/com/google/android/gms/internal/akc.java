package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* loaded from: classes2.dex */
public interface akc extends IInterface {

    /* renamed from: com.google.android.gms.internal.akc$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6448a extends Binder implements akc {

        /* renamed from: com.google.android.gms.internal.akc$a$a */
        /* loaded from: classes2.dex */
        private static class C6449a implements akc {

            /* renamed from: a */
            private IBinder f22121a;

            C6449a(IBinder iBinder) {
                this.f22121a = iBinder;
            }

            @Override // com.google.android.gms.internal.akc
            /* renamed from: a */
            public int mo17055a(AbstractC4170e abstractC4170e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    this.f22121a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.akc
            /* renamed from: a */
            public int mo17053a(AbstractC4170e abstractC4170e, String str, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f22121a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.akc
            /* renamed from: a */
            public AbstractC4170e mo17054a(AbstractC4170e abstractC4170e, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f22121a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22121a;
            }
        }

        /* renamed from: a */
        public static akc m17056a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof akc)) ? new C6449a(iBinder) : (akc) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    int a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    AbstractC4170e a2 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2 != null ? a2.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    int a3 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(a3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamite.IDynamiteLoader");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo17055a(AbstractC4170e abstractC4170e, String str);

    /* renamed from: a */
    int mo17053a(AbstractC4170e abstractC4170e, String str, boolean z);

    /* renamed from: a */
    AbstractC4170e mo17054a(AbstractC4170e abstractC4170e, String str, int i);
}
