package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.aof;
/* loaded from: classes2.dex */
public interface aog extends IInterface {

    /* renamed from: com.google.android.gms.internal.aog$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6681a extends Binder implements aog {

        /* renamed from: com.google.android.gms.internal.aog$a$a */
        /* loaded from: classes2.dex */
        private static class C6682a implements aog {

            /* renamed from: a */
            private IBinder f22571a;

            C6682a(IBinder iBinder) {
                this.f22571a = iBinder;
            }

            @Override // com.google.android.gms.internal.aog
            /* renamed from: a */
            public void mo16517a(aof aofVar, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
                    obtain.writeStrongBinder(aofVar != null ? aofVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f22571a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22571a;
            }

            @Override // com.google.android.gms.internal.aog
            /* renamed from: b */
            public void mo16516b(aof aofVar, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
                    obtain.writeStrongBinder(aofVar != null ? aofVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f22571a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static aog m16518a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aog)) ? new C6682a(iBinder) : (aog) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                    a(aof.AbstractBinderC6679a.m16519a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                    b(aof.AbstractBinderC6679a.m16519a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.search.internal.ISearchAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16517a(aof aofVar, String str, String str2);

    /* renamed from: b */
    void mo16516b(aof aofVar, String str, String str2);
}
