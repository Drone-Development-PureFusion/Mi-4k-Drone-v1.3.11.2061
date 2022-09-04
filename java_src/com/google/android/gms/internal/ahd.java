package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.internal.ahc;
/* loaded from: classes2.dex */
public interface ahd extends IInterface {

    /* renamed from: com.google.android.gms.internal.ahd$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6333a extends Binder implements ahd {

        /* renamed from: com.google.android.gms.internal.ahd$a$a */
        /* loaded from: classes2.dex */
        private static class C6334a implements ahd {

            /* renamed from: a */
            private IBinder f21708a;

            C6334a(IBinder iBinder) {
                this.f21708a = iBinder;
            }

            @Override // com.google.android.gms.internal.ahd
            /* renamed from: a */
            public void mo17505a(ahc ahcVar, LogEventParcelable logEventParcelable) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (ahcVar != null) {
                        iBinder = ahcVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (logEventParcelable != null) {
                        obtain.writeInt(1);
                        logEventParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21708a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21708a;
            }
        }

        /* renamed from: a */
        public static ahd m17506a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ahd)) ? new C6334a(iBinder) : (ahd) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    a(ahc.AbstractBinderC6331a.m17508a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (LogEventParcelable) LogEventParcelable.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17505a(ahc ahcVar, LogEventParcelable logEventParcelable);
}
