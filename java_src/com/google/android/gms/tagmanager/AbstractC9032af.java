package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.af */
/* loaded from: classes2.dex */
public interface AbstractC9032af extends IInterface {

    /* renamed from: com.google.android.gms.tagmanager.af$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9033a extends Binder implements AbstractC9032af {

        /* renamed from: com.google.android.gms.tagmanager.af$a$a */
        /* loaded from: classes2.dex */
        private static class C9034a implements AbstractC9032af {

            /* renamed from: a */
            private IBinder f28684a;

            C9034a(IBinder iBinder) {
                this.f28684a = iBinder;
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9032af
            /* renamed from: a */
            public void mo8892a(String str, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f28684a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28684a;
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9032af
            /* renamed from: b */
            public String mo8891b(String str, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f28684a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9033a() {
            attachInterface(this, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
        }

        /* renamed from: a */
        public static AbstractC9032af m9321a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9032af)) ? new C9034a(iBinder) : (AbstractC9032af) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    a(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    String b = b(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo8892a(String str, Map map);

    /* renamed from: b */
    String mo8891b(String str, Map map);
}
