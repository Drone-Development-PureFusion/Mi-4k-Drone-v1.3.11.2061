package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.anv;
/* loaded from: classes2.dex */
public interface anw extends IInterface {

    /* renamed from: com.google.android.gms.internal.anw$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6657a extends Binder implements anw {

        /* renamed from: com.google.android.gms.internal.anw$a$a */
        /* loaded from: classes2.dex */
        private static class C6658a implements anw {

            /* renamed from: a */
            private IBinder f22507a;

            C6658a(IBinder iBinder) {
                this.f22507a = iBinder;
            }

            @Override // com.google.android.gms.internal.anw
            /* renamed from: a */
            public void mo16596a(anv anvVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    obtain.writeStrongBinder(anvVar != null ? anvVar.asBinder() : null);
                    this.f22507a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anw
            /* renamed from: a */
            public void mo16595a(anv anvVar, String str, int[] iArr, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    obtain.writeStrongBinder(anvVar != null ? anvVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f22507a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anw
            /* renamed from: a */
            public void mo16594a(anv anvVar, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    obtain.writeStrongBinder(anvVar != null ? anvVar.asBinder() : null);
                    obtain.writeByteArray(bArr);
                    this.f22507a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22507a;
            }

            @Override // com.google.android.gms.internal.anw
            /* renamed from: b */
            public void mo16593b(anv anvVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    obtain.writeStrongBinder(anvVar != null ? anvVar.asBinder() : null);
                    this.f22507a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.anw
            /* renamed from: c */
            public void mo16592c(anv anvVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    obtain.writeStrongBinder(anvVar != null ? anvVar.asBinder() : null);
                    this.f22507a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static anw m16597a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof anw)) ? new C6658a(iBinder) : (anw) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    a(anv.AbstractBinderC6655a.m16599a(parcel.readStrongBinder()), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    a(anv.AbstractBinderC6655a.m16599a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    a(anv.AbstractBinderC6655a.m16599a(parcel.readStrongBinder()), parcel.readString(), parcel.createIntArray(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    b(anv.AbstractBinderC6655a.m16599a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    c(anv.AbstractBinderC6655a.m16599a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16596a(anv anvVar);

    /* renamed from: a */
    void mo16595a(anv anvVar, String str, int[] iArr, int i, String str2);

    /* renamed from: a */
    void mo16594a(anv anvVar, byte[] bArr);

    /* renamed from: b */
    void mo16593b(anv anvVar);

    /* renamed from: c */
    void mo16592c(anv anvVar);
}
