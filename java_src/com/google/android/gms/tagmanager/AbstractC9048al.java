package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.apf;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9042aj;
/* renamed from: com.google.android.gms.tagmanager.al */
/* loaded from: classes2.dex */
public interface AbstractC9048al extends IInterface {

    /* renamed from: com.google.android.gms.tagmanager.al$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9049a extends Binder implements AbstractC9048al {

        /* renamed from: com.google.android.gms.tagmanager.al$a$a */
        /* loaded from: classes2.dex */
        private static class C9050a implements AbstractC9048al {

            /* renamed from: a */
            private IBinder f28691a;

            C9050a(IBinder iBinder) {
                this.f28691a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28691a;
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9048al
            public apf getService(AbstractC4170e abstractC4170e, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC9042aj != null ? abstractC9042aj.asBinder() : null);
                    if (abstractC9032af != null) {
                        iBinder = abstractC9032af.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f28691a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return apf.AbstractBinderC6709a.m16400a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9049a() {
            attachInterface(this, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        }

        public static AbstractC9048al asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9048al)) ? new C9050a(iBinder) : (AbstractC9048al) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    apf service = getService(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9042aj.AbstractBinderC9043a.m9316a(parcel.readStrongBinder()), AbstractC9032af.AbstractBinderC9033a.m9321a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(service != null ? service.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    apf getService(AbstractC4170e abstractC4170e, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af);
}
