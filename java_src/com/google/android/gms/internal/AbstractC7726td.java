package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.internal.td */
/* loaded from: classes2.dex */
public interface AbstractC7726td extends IInterface {

    /* renamed from: com.google.android.gms.internal.td$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7727a extends Binder implements AbstractC7726td {

        /* renamed from: com.google.android.gms.internal.td$a$a */
        /* loaded from: classes2.dex */
        private static class C7728a implements AbstractC7726td {

            /* renamed from: a */
            private IBinder f25578a;

            C7728a(IBinder iBinder) {
                this.f25578a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7726td
            /* renamed from: a */
            public IBinder mo13639a(String str, AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f25578a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25578a;
            }

            @Override // com.google.android.gms.internal.AbstractC7726td
            /* renamed from: b */
            public IBinder mo13638b(String str, AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f25578a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC7726td m13640a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7726td)) ? new C7728a(iBinder) : (AbstractC7726td) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    IBinder a = a(parcel.readString(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    IBinder b = b(parcel.readString(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo13639a(String str, AbstractC4170e abstractC4170e);

    /* renamed from: b */
    IBinder mo13638b(String str, AbstractC4170e abstractC4170e);
}
