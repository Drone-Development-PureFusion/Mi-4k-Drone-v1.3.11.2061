package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.common.internal.ae */
/* loaded from: classes2.dex */
public interface AbstractC4565ae extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.ae$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4566a extends Binder implements AbstractC4565ae {

        /* renamed from: com.google.android.gms.common.internal.ae$a$a */
        /* loaded from: classes2.dex */
        private static class C4567a implements AbstractC4565ae {

            /* renamed from: a */
            private IBinder f17031a;

            C4567a(IBinder iBinder) {
                this.f17031a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4565ae
            /* renamed from: a */
            public AbstractC4170e mo23356a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICertData");
                    this.f17031a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17031a;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4565ae
            /* renamed from: b */
            public int mo23354b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICertData");
                    this.f17031a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC4566a() {
            attachInterface(this, "com.google.android.gms.common.internal.ICertData");
        }

        /* renamed from: a */
        public static AbstractC4565ae m23698a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4565ae)) ? new C4567a(iBinder) : (AbstractC4565ae) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
                    AbstractC4170e a = a();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
                    int b = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.ICertData");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4170e mo23356a();

    /* renamed from: b */
    int mo23354b();
}
