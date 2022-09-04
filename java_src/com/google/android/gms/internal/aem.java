package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ael;
/* loaded from: classes2.dex */
public interface aem extends IInterface {

    /* renamed from: com.google.android.gms.internal.aem$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6238a extends Binder implements aem {

        /* renamed from: com.google.android.gms.internal.aem$a$a */
        /* loaded from: classes2.dex */
        private static class C6239a implements aem {

            /* renamed from: a */
            private IBinder f21361a;

            C6239a(IBinder iBinder) {
                this.f21361a = iBinder;
            }

            @Override // com.google.android.gms.internal.aem
            /* renamed from: a */
            public void mo17852a(ael aelVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
                    obtain.writeStrongBinder(aelVar != null ? aelVar.asBinder() : null);
                    this.f21361a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aem
            /* renamed from: a */
            public void mo17851a(ael aelVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
                    obtain.writeStrongBinder(aelVar != null ? aelVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f21361a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21361a;
            }

            @Override // com.google.android.gms.internal.aem
            /* renamed from: b */
            public void mo17850b(ael aelVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
                    obtain.writeStrongBinder(aelVar != null ? aelVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f21361a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static aem m17853a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aem)) ? new C6239a(iBinder) : (aem) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
                    a(ael.AbstractBinderC6236a.m17856a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
                    b(ael.AbstractBinderC6236a.m17856a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
                    a(ael.AbstractBinderC6236a.m17856a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.appinvite.internal.IAppInviteService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17852a(ael aelVar);

    /* renamed from: a */
    void mo17851a(ael aelVar, String str);

    /* renamed from: b */
    void mo17850b(ael aelVar, String str);
}
