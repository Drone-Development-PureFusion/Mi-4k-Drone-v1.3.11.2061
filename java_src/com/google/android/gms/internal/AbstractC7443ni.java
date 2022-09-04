package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7440nh;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.internal.ni */
/* loaded from: classes2.dex */
public interface AbstractC7443ni extends IInterface {

    /* renamed from: com.google.android.gms.internal.ni$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7444a extends Binder implements AbstractC7443ni {

        /* renamed from: com.google.android.gms.internal.ni$a$a */
        /* loaded from: classes2.dex */
        private static class C7445a implements AbstractC7443ni {

            /* renamed from: a */
            private IBinder f24901a;

            C7445a(IBinder iBinder) {
                this.f24901a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public AbstractC7440nh mo14462a(Uri uri, AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f24901a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public AbstractC7440nh mo14461a(Uri uri, AbstractC4170e abstractC4170e, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeLong(j);
                    this.f24901a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public AbstractC7440nh mo14460a(Uri uri, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC4170e2 != null) {
                        iBinder = abstractC4170e2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f24901a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public AbstractC7440nh mo14459a(Uri uri, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, String str) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC4170e2 != null) {
                        iBinder = abstractC4170e2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f24901a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public AbstractC7440nh mo14458a(Uri uri, AbstractC4170e abstractC4170e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    this.f24901a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public AbstractC7440nh mo14457a(Uri uri, AbstractC4170e abstractC4170e, String str, AbstractC4170e abstractC4170e2, long j, int i, boolean z) {
                IBinder iBinder = null;
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    if (abstractC4170e2 != null) {
                        iBinder = abstractC4170e2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f24901a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public String mo14464a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    this.f24901a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: a */
            public String mo14463a(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f24901a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24901a;
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: b */
            public AbstractC7440nh mo14455b(Uri uri, AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f24901a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: b */
            public AbstractC7440nh mo14454b(Uri uri, AbstractC4170e abstractC4170e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    this.f24901a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: b */
            public String mo14456b(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f24901a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC7443ni
            /* renamed from: c */
            public AbstractC7440nh mo14453c(Uri uri, AbstractC4170e abstractC4170e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    this.f24901a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7440nh.AbstractBinderC7441a.m14480a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC7443ni m14465a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.storage.network.INetworkRequestFactory");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7443ni)) ? new C7445a(iBinder) : (AbstractC7443ni) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh b = b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh a2 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2 != null ? a2.asBinder() : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh a3 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a3 != null ? a3.asBinder() : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh a4 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString(), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a4 != null ? a4.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh b2 = b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b2 != null ? b2.asBinder() : null);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh c = c(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(c != null ? c.asBinder() : null);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh a5 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a5 != null ? a5.asBinder() : null);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    AbstractC7440nh a6 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a6 != null ? a6.asBinder() : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    String a7 = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a7);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    String a8 = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(a8);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    String b3 = b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(b3);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.storage.network.INetworkRequestFactory");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC7440nh mo14462a(Uri uri, AbstractC4170e abstractC4170e);

    /* renamed from: a */
    AbstractC7440nh mo14461a(Uri uri, AbstractC4170e abstractC4170e, long j);

    /* renamed from: a */
    AbstractC7440nh mo14460a(Uri uri, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2);

    /* renamed from: a */
    AbstractC7440nh mo14459a(Uri uri, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, String str);

    /* renamed from: a */
    AbstractC7440nh mo14458a(Uri uri, AbstractC4170e abstractC4170e, String str);

    /* renamed from: a */
    AbstractC7440nh mo14457a(Uri uri, AbstractC4170e abstractC4170e, String str, AbstractC4170e abstractC4170e2, long j, int i, boolean z);

    /* renamed from: a */
    String mo14464a();

    /* renamed from: a */
    String mo14463a(Uri uri);

    /* renamed from: b */
    AbstractC7440nh mo14455b(Uri uri, AbstractC4170e abstractC4170e);

    /* renamed from: b */
    AbstractC7440nh mo14454b(Uri uri, AbstractC4170e abstractC4170e, String str);

    /* renamed from: b */
    String mo14456b(Uri uri);

    /* renamed from: c */
    AbstractC7440nh mo14453c(Uri uri, AbstractC4170e abstractC4170e, String str);
}
