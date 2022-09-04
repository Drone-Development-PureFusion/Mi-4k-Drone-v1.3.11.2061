package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.AbstractC4562ad;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.AbstractC8959b;
import java.util.List;
/* renamed from: com.google.android.gms.plus.internal.d */
/* loaded from: classes2.dex */
public interface AbstractC8965d extends IInterface {

    /* renamed from: com.google.android.gms.plus.internal.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8966a extends Binder implements AbstractC8965d {

        /* renamed from: com.google.android.gms.plus.internal.d$a$a */
        /* loaded from: classes2.dex */
        private static class C8967a implements AbstractC8965d {

            /* renamed from: a */
            private IBinder f28512a;

            C8967a(IBinder iBinder) {
                this.f28512a = iBinder;
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public AbstractC4562ad mo9651a(AbstractC8959b abstractC8959b, int i, int i2, int i3, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    this.f28512a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4562ad.AbstractBinderC4563a.m23700a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public String mo9654a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f28512a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9653a(SafeParcelResponse safeParcelResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    if (safeParcelResponse != null) {
                        obtain.writeInt(1);
                        safeParcelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28512a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9652a(AbstractC8959b abstractC8959b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    this.f28512a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9650a(AbstractC8959b abstractC8959b, int i, String str, Uri uri, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f28512a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9649a(AbstractC8959b abstractC8959b, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28512a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9648a(AbstractC8959b abstractC8959b, SafeParcelResponse safeParcelResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    if (safeParcelResponse != null) {
                        obtain.writeInt(1);
                        safeParcelResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28512a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9647a(AbstractC8959b abstractC8959b, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeString(str);
                    this.f28512a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9646a(AbstractC8959b abstractC8959b, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f28512a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9645a(AbstractC8959b abstractC8959b, List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeStringList(list);
                    this.f28512a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9644a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeString(str);
                    this.f28512a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: a */
            public void mo9643a(String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeString(str);
                    if (favaDiagnosticsEntity != null) {
                        obtain.writeInt(1);
                        favaDiagnosticsEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (favaDiagnosticsEntity2 != null) {
                        obtain.writeInt(1);
                        favaDiagnosticsEntity2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28512a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28512a;
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: b */
            public void mo9642b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f28512a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: b */
            public void mo9641b(AbstractC8959b abstractC8959b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    this.f28512a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: b */
            public void mo9640b(AbstractC8959b abstractC8959b, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeString(str);
                    this.f28512a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: c */
            public String mo9639c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f28512a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: c */
            public void mo9638c(AbstractC8959b abstractC8959b, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeString(str);
                    this.f28512a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: d */
            public void mo9636d(AbstractC8959b abstractC8959b, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeString(str);
                    this.f28512a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: d */
            public boolean mo9637d() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f28512a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: e */
            public String mo9635e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f28512a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.plus.internal.AbstractC8965d
            /* renamed from: e */
            public void mo9634e(AbstractC8959b abstractC8959b, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(abstractC8959b != null ? abstractC8959b.asBinder() : null);
                    obtain.writeString(str);
                    this.f28512a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8965d m9655a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8965d)) ? new C8967a(iBinder) : (AbstractC8965d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    b(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(parcel.readInt() != 0 ? (SafeParcelResponse) SafeParcelResponse.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    AbstractC4562ad a2 = a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    c(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    b(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    d(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    boolean d = d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d ? 1 : 0);
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    String e = e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    return true;
                case 44:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    e(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(AbstractC8959b.AbstractBinderC8960a.m9667a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (SafeParcelResponse) SafeParcelResponse.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    a(parcel.readString(), parcel.readInt() != 0 ? (FavaDiagnosticsEntity) FavaDiagnosticsEntity.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (FavaDiagnosticsEntity) FavaDiagnosticsEntity.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC4562ad mo9651a(AbstractC8959b abstractC8959b, int i, int i2, int i3, String str);

    /* renamed from: a */
    String mo9654a();

    /* renamed from: a */
    void mo9653a(SafeParcelResponse safeParcelResponse);

    /* renamed from: a */
    void mo9652a(AbstractC8959b abstractC8959b);

    /* renamed from: a */
    void mo9650a(AbstractC8959b abstractC8959b, int i, String str, Uri uri, String str2, String str3);

    /* renamed from: a */
    void mo9649a(AbstractC8959b abstractC8959b, Uri uri, Bundle bundle);

    /* renamed from: a */
    void mo9648a(AbstractC8959b abstractC8959b, SafeParcelResponse safeParcelResponse);

    /* renamed from: a */
    void mo9647a(AbstractC8959b abstractC8959b, String str);

    /* renamed from: a */
    void mo9646a(AbstractC8959b abstractC8959b, String str, String str2);

    /* renamed from: a */
    void mo9645a(AbstractC8959b abstractC8959b, List<String> list);

    /* renamed from: a */
    void mo9644a(String str);

    /* renamed from: a */
    void mo9643a(String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2);

    /* renamed from: b */
    void mo9642b();

    /* renamed from: b */
    void mo9641b(AbstractC8959b abstractC8959b);

    /* renamed from: b */
    void mo9640b(AbstractC8959b abstractC8959b, String str);

    /* renamed from: c */
    String mo9639c();

    /* renamed from: c */
    void mo9638c(AbstractC8959b abstractC8959b, String str);

    /* renamed from: d */
    void mo9636d(AbstractC8959b abstractC8959b, String str);

    /* renamed from: d */
    boolean mo9637d();

    /* renamed from: e */
    String mo9635e();

    /* renamed from: e */
    void mo9634e(AbstractC8959b abstractC8959b, String str);
}
