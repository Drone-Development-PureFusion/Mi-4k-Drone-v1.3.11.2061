package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SessionStopResult;
/* loaded from: classes2.dex */
public interface alp extends IInterface {

    /* renamed from: com.google.android.gms.internal.alp$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6510a extends Binder implements alp {

        /* renamed from: com.google.android.gms.internal.alp$a$a */
        /* loaded from: classes2.dex */
        private static class C6511a implements alp {

            /* renamed from: a */
            private IBinder f22174a;

            C6511a(IBinder iBinder) {
                this.f22174a = iBinder;
            }

            @Override // com.google.android.gms.internal.alp
            /* renamed from: a */
            public void mo16845a(SessionStopResult sessionStopResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionStopCallback");
                    if (sessionStopResult != null) {
                        obtain.writeInt(1);
                        sessionStopResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22174a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22174a;
            }
        }

        public AbstractBinderC6510a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.ISessionStopCallback");
        }

        /* renamed from: a */
        public static alp m16933a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alp)) ? new C6511a(iBinder) : (alp) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
                    a(parcel.readInt() != 0 ? SessionStopResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.ISessionStopCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16845a(SessionStopResult sessionStopResult);
}
