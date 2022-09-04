package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.GetRecentContextCall;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.internal.aec;
import com.google.firebase.appindexing.internal.ActionImpl;
/* loaded from: classes2.dex */
public interface aeb extends IInterface {

    /* renamed from: com.google.android.gms.internal.aeb$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6219a extends Binder implements aeb {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.internal.aeb$a$a */
        /* loaded from: classes2.dex */
        public static class C6220a implements aeb {

            /* renamed from: a */
            private IBinder f21337a;

            C6220a(IBinder iBinder) {
                this.f21337a = iBinder;
            }

            @Override // com.google.android.gms.internal.aeb
            /* renamed from: a */
            public void mo17913a(GetRecentContextCall.Request request, aec aecVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    if (request != null) {
                        obtain.writeInt(1);
                        request.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aecVar != null ? aecVar.asBinder() : null);
                    this.f21337a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aeb
            /* renamed from: a */
            public void mo17912a(aec aecVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(aecVar != null ? aecVar.asBinder() : null);
                    this.f21337a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aeb
            /* renamed from: a */
            public void mo17911a(aec aecVar, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(aecVar != null ? aecVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f21337a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aeb
            /* renamed from: a */
            public void mo17910a(aec aecVar, String str, UsageInfo[] usageInfoArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(aecVar != null ? aecVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeTypedArray(usageInfoArr, 0);
                    this.f21337a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aeb
            /* renamed from: a */
            public void mo17909a(aec aecVar, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(aecVar != null ? aecVar.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f21337a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.aeb
            /* renamed from: a */
            public void mo17908a(aec aecVar, ActionImpl[] actionImplArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(aecVar != null ? aecVar.asBinder() : null);
                    obtain.writeTypedArray(actionImplArr, 0);
                    this.f21337a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21337a;
            }

            @Override // com.google.android.gms.internal.aeb
            /* renamed from: b */
            public void mo17907b(aec aecVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(aecVar != null ? aecVar.asBinder() : null);
                    this.f21337a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static aeb m17914a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aeb)) ? new C6220a(iBinder) : (aeb) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(aec.AbstractBinderC6221a.m17906a(parcel.readStrongBinder()), parcel.readString(), (UsageInfo[]) parcel.createTypedArray(UsageInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(aec.AbstractBinderC6221a.m17906a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    b(aec.AbstractBinderC6221a.m17906a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(aec.AbstractBinderC6221a.m17906a(parcel.readStrongBinder()), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(parcel.readInt() != 0 ? (GetRecentContextCall.Request) GetRecentContextCall.Request.CREATOR.createFromParcel(parcel) : null, aec.AbstractBinderC6221a.m17906a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(aec.AbstractBinderC6221a.m17906a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    a(aec.AbstractBinderC6221a.m17906a(parcel.readStrongBinder()), (ActionImpl[]) parcel.createTypedArray(ActionImpl.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo17913a(GetRecentContextCall.Request request, aec aecVar);

    /* renamed from: a */
    void mo17912a(aec aecVar);

    /* renamed from: a */
    void mo17911a(aec aecVar, String str, String str2);

    /* renamed from: a */
    void mo17910a(aec aecVar, String str, UsageInfo[] usageInfoArr);

    /* renamed from: a */
    void mo17909a(aec aecVar, boolean z);

    /* renamed from: a */
    void mo17908a(aec aecVar, ActionImpl[] actionImplArr);

    /* renamed from: b */
    void mo17907b(aec aecVar);
}
