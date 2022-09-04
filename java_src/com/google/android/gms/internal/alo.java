package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SessionReadResult;
/* loaded from: classes2.dex */
public interface alo extends IInterface {

    /* renamed from: com.google.android.gms.internal.alo$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6508a extends Binder implements alo {

        /* renamed from: com.google.android.gms.internal.alo$a$a */
        /* loaded from: classes2.dex */
        private static class C6509a implements alo {

            /* renamed from: a */
            private IBinder f22173a;

            C6509a(IBinder iBinder) {
                this.f22173a = iBinder;
            }

            @Override // com.google.android.gms.internal.alo
            /* renamed from: a */
            public void mo16846a(SessionReadResult sessionReadResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionReadCallback");
                    if (sessionReadResult != null) {
                        obtain.writeInt(1);
                        sessionReadResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22173a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22173a;
            }
        }

        public AbstractBinderC6508a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.ISessionReadCallback");
        }

        /* renamed from: a */
        public static alo m16934a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alo)) ? new C6509a(iBinder) : (alo) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
                    a(parcel.readInt() != 0 ? SessionReadResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.ISessionReadCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16846a(SessionReadResult sessionReadResult);
}
