package com.google.android.gms.contextmanager.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.AbstractC4773g;
import com.google.android.gms.contextmanager.internal.AbstractC4776h;
/* renamed from: com.google.android.gms.contextmanager.internal.i */
/* loaded from: classes2.dex */
public interface AbstractC4779i extends IInterface {

    /* renamed from: com.google.android.gms.contextmanager.internal.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4780a extends Binder implements AbstractC4779i {

        /* renamed from: com.google.android.gms.contextmanager.internal.i$a$a */
        /* loaded from: classes2.dex */
        private static class C4781a implements AbstractC4779i {

            /* renamed from: a */
            private IBinder f17495a;

            C4781a(IBinder iBinder) {
                this.f17495a = iBinder;
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22787a(AbstractC4776h abstractC4776h, String str, String str2, String str3, SnapshotRequest snapshotRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (snapshotRequest != null) {
                        obtain.writeInt(1);
                        snapshotRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22786a(AbstractC4776h abstractC4776h, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (fenceQueryRequestImpl != null) {
                        obtain.writeInt(1);
                        fenceQueryRequestImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22785a(AbstractC4776h abstractC4776h, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (fenceUpdateRequestImpl != null) {
                        obtain.writeInt(1);
                        fenceUpdateRequestImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22784a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22783a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (relationFilterImpl != null) {
                        obtain.writeInt(1);
                        relationFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22782a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, AbstractC4773g abstractC4773g) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (relationFilterImpl != null) {
                        obtain.writeInt(1);
                        relationFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC4773g != null) {
                        iBinder = abstractC4773g.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f17495a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22781a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, AbstractC4773g abstractC4773g, PendingIntent pendingIntent) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (contextDataFilterImpl != null) {
                        obtain.writeInt(1);
                        contextDataFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (relationFilterImpl != null) {
                        obtain.writeInt(1);
                        relationFilterImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC4773g != null) {
                        iBinder = abstractC4773g.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22780a(AbstractC4776h abstractC4776h, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (interestUpdateBatchImpl != null) {
                        obtain.writeInt(1);
                        interestUpdateBatchImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22779a(AbstractC4776h abstractC4776h, String str, String str2, String str3, WriteBatchImpl writeBatchImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (writeBatchImpl != null) {
                        obtain.writeInt(1);
                        writeBatchImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22778a(AbstractC4776h abstractC4776h, String str, String str2, String str3, AbstractC4773g abstractC4773g) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (abstractC4773g != null) {
                        iBinder = abstractC4773g.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f17495a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.contextmanager.internal.AbstractC4779i
            /* renamed from: a */
            public void mo22777a(AbstractC4776h abstractC4776h, String str, String str2, String str3, AbstractC4773g abstractC4773g, PendingIntent pendingIntent) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    obtain.writeStrongBinder(abstractC4776h != null ? abstractC4776h.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (abstractC4773g != null) {
                        iBinder = abstractC4773g.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17495a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17495a;
            }
        }

        /* renamed from: a */
        public static AbstractC4779i m22788a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4779i)) ? new C4781a(iBinder) : (AbstractC4779i) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            PendingIntent pendingIntent = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? WriteBatchImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? RelationFilterImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? RelationFilterImpl.CREATOR.createFromParcel(parcel) : null, AbstractC4773g.AbstractBinderC4774a.m22798a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC4773g.AbstractBinderC4774a.m22798a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    AbstractC4776h m22795a = AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    ContextDataFilterImpl createFromParcel = parcel.readInt() != 0 ? ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null;
                    RelationFilterImpl createFromParcel2 = parcel.readInt() != 0 ? RelationFilterImpl.CREATOR.createFromParcel(parcel) : null;
                    AbstractC4773g m22798a = AbstractC4773g.AbstractBinderC4774a.m22798a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                    }
                    a(m22795a, readString, readString2, readString3, createFromParcel, createFromParcel2, m22798a, pendingIntent);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC4773g.AbstractBinderC4774a.m22798a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? InterestUpdateBatchImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FenceUpdateRequestImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ContextDataFilterImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SnapshotRequest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    a(AbstractC4776h.AbstractBinderC4777a.m22795a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FenceQueryRequestImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.internal.IContextManagerService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo22787a(AbstractC4776h abstractC4776h, String str, String str2, String str3, SnapshotRequest snapshotRequest);

    /* renamed from: a */
    void mo22786a(AbstractC4776h abstractC4776h, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl);

    /* renamed from: a */
    void mo22785a(AbstractC4776h abstractC4776h, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl);

    /* renamed from: a */
    void mo22784a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl);

    /* renamed from: a */
    void mo22783a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl);

    /* renamed from: a */
    void mo22782a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, AbstractC4773g abstractC4773g);

    /* renamed from: a */
    void mo22781a(AbstractC4776h abstractC4776h, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, RelationFilterImpl relationFilterImpl, AbstractC4773g abstractC4773g, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo22780a(AbstractC4776h abstractC4776h, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl);

    /* renamed from: a */
    void mo22779a(AbstractC4776h abstractC4776h, String str, String str2, String str3, WriteBatchImpl writeBatchImpl);

    /* renamed from: a */
    void mo22778a(AbstractC4776h abstractC4776h, String str, String str2, String str3, AbstractC4773g abstractC4773g);

    /* renamed from: a */
    void mo22777a(AbstractC4776h abstractC4776h, String str, String str2, String str3, AbstractC4773g abstractC4773g, PendingIntent pendingIntent);
}
