package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9042aj;
/* renamed from: com.google.android.gms.tagmanager.ak */
/* loaded from: classes2.dex */
public interface AbstractC9045ak extends IInterface {

    /* renamed from: com.google.android.gms.tagmanager.ak$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9046a extends Binder implements AbstractC9045ak {

        /* renamed from: com.google.android.gms.tagmanager.ak$a$a */
        /* loaded from: classes2.dex */
        private static class C9047a implements AbstractC9045ak {

            /* renamed from: a */
            private IBinder f28690a;

            C9047a(IBinder iBinder) {
                this.f28690a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28690a;
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9045ak
            public void initialize(AbstractC4170e abstractC4170e, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerApi");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC9042aj != null ? abstractC9042aj.asBinder() : null);
                    if (abstractC9032af != null) {
                        iBinder = abstractC9032af.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f28690a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9045ak
            public void preview(Intent intent, AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerApi");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f28690a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9045ak
            public void previewIntent(Intent intent, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerApi");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC4170e2 != null ? abstractC4170e2.asBinder() : null);
                    obtain.writeStrongBinder(abstractC9042aj != null ? abstractC9042aj.asBinder() : null);
                    if (abstractC9032af != null) {
                        iBinder = abstractC9032af.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f28690a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC9046a() {
            attachInterface(this, "com.google.android.gms.tagmanager.ITagManagerApi");
        }

        public static AbstractC9045ak asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9045ak)) ? new C9047a(iBinder) : (AbstractC9045ak) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Intent intent = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerApi");
                    initialize(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9042aj.AbstractBinderC9043a.m9316a(parcel.readStrongBinder()), AbstractC9032af.AbstractBinderC9033a.m9321a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerApi");
                    if (parcel.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    preview(intent, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerApi");
                    previewIntent(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC9042aj.AbstractBinderC9043a.m9316a(parcel.readStrongBinder()), AbstractC9032af.AbstractBinderC9033a.m9321a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.ITagManagerApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void initialize(AbstractC4170e abstractC4170e, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af);

    void preview(Intent intent, AbstractC4170e abstractC4170e);

    void previewIntent(Intent intent, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af);
}
