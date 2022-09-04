package com.google.android.gms.contextmanager.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.Relation;
/* renamed from: com.google.android.gms.contextmanager.internal.g */
/* loaded from: classes2.dex */
public interface AbstractC4773g extends IInterface {

    /* renamed from: com.google.android.gms.contextmanager.internal.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4774a extends Binder implements AbstractC4773g {

        /* renamed from: com.google.android.gms.contextmanager.internal.g$a$a */
        /* loaded from: classes2.dex */
        private static class C4775a implements AbstractC4773g {

            /* renamed from: a */
            private IBinder f17493a;

            C4775a(IBinder iBinder) {
                this.f17493a = iBinder;
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4773g
            /* renamed from: a */
            public void mo22797a(ContextData contextData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (contextData != null) {
                        obtain.writeInt(1);
                        contextData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17493a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4773g
            /* renamed from: a */
            public void mo22796a(Relation relation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (relation != null) {
                        obtain.writeInt(1);
                        relation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17493a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17493a;
            }
        }

        /* renamed from: a */
        public static AbstractC4773g m22798a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4773g)) ? new C4775a(iBinder) : (AbstractC4773g) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Relation relation = null;
            ContextData contextData = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (parcel.readInt() != 0) {
                        contextData = ContextData.CREATOR.createFromParcel(parcel);
                    }
                    a(contextData);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (parcel.readInt() != 0) {
                        relation = Relation.CREATOR.createFromParcel(parcel);
                    }
                    a(relation);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.internal.IContextListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo22797a(ContextData contextData);

    /* renamed from: a */
    void mo22796a(Relation relation);
}
