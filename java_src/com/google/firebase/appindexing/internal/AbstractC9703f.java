package com.google.firebase.appindexing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.aif;
/* renamed from: com.google.firebase.appindexing.internal.f */
/* loaded from: classes2.dex */
public interface AbstractC9703f extends IInterface {

    /* renamed from: com.google.firebase.appindexing.internal.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9704a extends Binder implements AbstractC9703f {

        /* renamed from: com.google.firebase.appindexing.internal.f$a$a */
        /* loaded from: classes2.dex */
        private static class C9705a implements AbstractC9703f {

            /* renamed from: a */
            private IBinder f30342a;

            C9705a(IBinder iBinder) {
                this.f30342a = iBinder;
            }

            @Override // com.google.firebase.appindexing.internal.AbstractC9703f
            /* renamed from: a */
            public void mo7410a(aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.appindexing.internal.IAppIndexingService");
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f30342a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.appindexing.internal.AbstractC9703f
            /* renamed from: a */
            public void mo7409a(aif aifVar, Thing[] thingArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.appindexing.internal.IAppIndexingService");
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    obtain.writeTypedArray(thingArr, 0);
                    this.f30342a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.appindexing.internal.AbstractC9703f
            /* renamed from: a */
            public void mo7408a(aif aifVar, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.appindexing.internal.IAppIndexingService");
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    this.f30342a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30342a;
            }
        }

        /* renamed from: a */
        public static AbstractC9703f m7411a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9703f)) ? new C9705a(iBinder) : (AbstractC9703f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
                    a(aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()), (Thing[]) parcel.createTypedArray(Thing.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
                    a(aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
                    a(aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.appindexing.internal.IAppIndexingService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo7410a(aif aifVar);

    /* renamed from: a */
    void mo7409a(aif aifVar, Thing[] thingArr);

    /* renamed from: a */
    void mo7408a(aif aifVar, String[] strArr);
}
