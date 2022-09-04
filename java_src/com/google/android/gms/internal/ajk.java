package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ajj;
/* loaded from: classes2.dex */
public interface ajk extends IInterface {

    /* renamed from: com.google.android.gms.internal.ajk$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6412a extends Binder implements ajk {

        /* renamed from: com.google.android.gms.internal.ajk$a$a */
        /* loaded from: classes2.dex */
        private static class C6413a implements ajk {

            /* renamed from: a */
            private IBinder f22020a;

            C6413a(IBinder iBinder) {
                this.f22020a = iBinder;
            }

            @Override // com.google.android.gms.internal.ajk
            /* renamed from: a */
            public void mo17120a(ajj ajjVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
                    if (ajjVar != null) {
                        iBinder = ajjVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f22020a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22020a;
            }
        }

        /* renamed from: a */
        public static ajk m17121a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ajk)) ? new C6413a(iBinder) : (ajk) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
                    a(ajj.AbstractBinderC6410a.m17123a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.service.ICommonService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17120a(ajj ajjVar);
}
