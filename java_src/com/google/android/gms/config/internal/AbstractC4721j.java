package com.google.android.gms.config.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.config.internal.AbstractC4718i;
import com.google.android.gms.phenotype.Configuration;
import java.util.List;
/* renamed from: com.google.android.gms.config.internal.j */
/* loaded from: classes2.dex */
public interface AbstractC4721j extends IInterface {

    /* renamed from: com.google.android.gms.config.internal.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4722a extends Binder implements AbstractC4721j {

        /* renamed from: com.google.android.gms.config.internal.j$a$a */
        /* loaded from: classes2.dex */
        private static class C4723a implements AbstractC4721j {

            /* renamed from: a */
            private IBinder f17346a;

            C4723a(IBinder iBinder) {
                this.f17346a = iBinder;
            }

            @Override // com.google.android.gms.config.internal.AbstractC4721j
            /* renamed from: a */
            public void mo23024a(AbstractC4718i abstractC4718i, FetchConfigIpcRequest fetchConfigIpcRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(abstractC4718i != null ? abstractC4718i.asBinder() : null);
                    if (fetchConfigIpcRequest != null) {
                        obtain.writeInt(1);
                        fetchConfigIpcRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17346a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.config.internal.AbstractC4721j
            /* renamed from: a */
            public void mo23023a(AbstractC4718i abstractC4718i, String str, Configuration configuration, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(abstractC4718i != null ? abstractC4718i.asBinder() : null);
                    obtain.writeString(str);
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str2);
                    this.f17346a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.config.internal.AbstractC4721j
            /* renamed from: a */
            public void mo23022a(AbstractC4718i abstractC4718i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(abstractC4718i != null ? abstractC4718i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f17346a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.config.internal.AbstractC4721j
            /* renamed from: a */
            public void mo23021a(AbstractC4718i abstractC4718i, String str, List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(abstractC4718i != null ? abstractC4718i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeList(list);
                    this.f17346a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17346a;
            }

            @Override // com.google.android.gms.config.internal.AbstractC4721j
            /* renamed from: b */
            public void mo23020b(AbstractC4718i abstractC4718i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(abstractC4718i != null ? abstractC4718i.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f17346a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4721j m23025a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.config.internal.IConfigService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4721j)) ? new C4723a(iBinder) : (AbstractC4721j) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            FetchConfigIpcRequest fetchConfigIpcRequest = null;
            Configuration configuration = null;
            switch (i) {
                case 4:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    a(AbstractC4718i.AbstractBinderC4719a.m23030a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    b(AbstractC4718i.AbstractBinderC4719a.m23030a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    a(AbstractC4718i.AbstractBinderC4719a.m23030a(parcel.readStrongBinder()), parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    AbstractC4718i m23030a = AbstractC4718i.AbstractBinderC4719a.m23030a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        configuration = Configuration.CREATOR.createFromParcel(parcel);
                    }
                    a(m23030a, readString, configuration, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    AbstractC4718i m23030a2 = AbstractC4718i.AbstractBinderC4719a.m23030a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        fetchConfigIpcRequest = FetchConfigIpcRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m23030a2, fetchConfigIpcRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.config.internal.IConfigService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo23024a(AbstractC4718i abstractC4718i, FetchConfigIpcRequest fetchConfigIpcRequest);

    /* renamed from: a */
    void mo23023a(AbstractC4718i abstractC4718i, String str, Configuration configuration, String str2);

    /* renamed from: a */
    void mo23022a(AbstractC4718i abstractC4718i, String str, String str2);

    /* renamed from: a */
    void mo23021a(AbstractC4718i abstractC4718i, String str, List list);

    /* renamed from: b */
    void mo23020b(AbstractC4718i abstractC4718i, String str, String str2);
}
