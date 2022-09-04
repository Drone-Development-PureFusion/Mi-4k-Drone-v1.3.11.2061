package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public interface ape extends IInterface {

    /* renamed from: com.google.android.gms.internal.ape$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6707a extends Binder implements ape {

        /* renamed from: com.google.android.gms.internal.ape$a$a */
        /* loaded from: classes2.dex */
        private static class C6708a implements ape {

            /* renamed from: a */
            private IBinder f22697a;

            C6708a(IBinder iBinder) {
                this.f22697a = iBinder;
            }

            @Override // com.google.android.gms.internal.ape
            /* renamed from: a */
            public void mo16254a(boolean z, String str) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f22697a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22697a;
            }
        }

        public AbstractBinderC6707a() {
            attachInterface(this, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
        }

        /* renamed from: a */
        public static ape m16401a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ape)) ? new C6708a(iBinder) : (ape) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    a(parcel.readInt() != 0, parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16254a(boolean z, String str);
}
