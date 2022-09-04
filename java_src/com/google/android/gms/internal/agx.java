package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.agw;
import com.google.android.gms.internal.agy;
/* loaded from: classes2.dex */
public interface agx extends IInterface {

    /* renamed from: com.google.android.gms.internal.agx$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6315a extends Binder implements agx {

        /* renamed from: com.google.android.gms.internal.agx$a$a */
        /* loaded from: classes2.dex */
        private static class C6316a implements agx {

            /* renamed from: a */
            private IBinder f21682a;

            C6316a(IBinder iBinder) {
                this.f21682a = iBinder;
            }

            @Override // com.google.android.gms.internal.agx
            /* renamed from: a */
            public void mo17544a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.f21682a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.agx
            /* renamed from: a */
            public void mo17543a(agw agwVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    if (agwVar != null) {
                        iBinder = agwVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f21682a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.agx
            /* renamed from: a */
            public void mo17542a(agw agwVar, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    if (agwVar != null) {
                        iBinder = agwVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f21682a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.agx
            /* renamed from: a */
            public void mo17541a(agw agwVar, agy agyVar, String str, String str2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    obtain.writeStrongBinder(agwVar != null ? agwVar.asBinder() : null);
                    if (agyVar != null) {
                        iBinder = agyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f21682a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.agx
            /* renamed from: a */
            public void mo17540a(agw agwVar, agy agyVar, String str, String str2, Bundle bundle) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    obtain.writeStrongBinder(agwVar != null ? agwVar.asBinder() : null);
                    if (agyVar != null) {
                        iBinder = agyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21682a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21682a;
            }

            @Override // com.google.android.gms.internal.agx
            /* renamed from: b */
            public void mo17539b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.f21682a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static agx m17545a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof agx)) ? new C6316a(iBinder) : (agx) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    b();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(agw.AbstractBinderC6313a.m17550a(parcel.readStrongBinder()), agy.AbstractBinderC6317a.m17538a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(agw.AbstractBinderC6313a.m17550a(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(agw.AbstractBinderC6313a.m17550a(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    a(agw.AbstractBinderC6313a.m17550a(parcel.readStrongBinder()), agy.AbstractBinderC6317a.m17538a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17544a();

    /* renamed from: a */
    void mo17543a(agw agwVar);

    /* renamed from: a */
    void mo17542a(agw agwVar, int i);

    /* renamed from: a */
    void mo17541a(agw agwVar, agy agyVar, String str, String str2);

    /* renamed from: a */
    void mo17540a(agw agwVar, agy agyVar, String str, String str2, Bundle bundle);

    /* renamed from: b */
    void mo17539b();
}
