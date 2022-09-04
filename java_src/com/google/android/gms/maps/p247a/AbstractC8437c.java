package com.google.android.gms.maps.p247a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.p247a.AbstractC8401ak;
/* renamed from: com.google.android.gms.maps.a.c */
/* loaded from: classes2.dex */
public interface AbstractC8437c extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8438a extends Binder implements AbstractC8437c {

        /* renamed from: com.google.android.gms.maps.a.c$a$a */
        /* loaded from: classes2.dex */
        private static class C8439a implements AbstractC8437c {

            /* renamed from: a */
            private IBinder f27335a;

            C8439a(IBinder iBinder) {
                this.f27335a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8437c
            /* renamed from: a */
            public void mo11530a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    this.f27335a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8437c
            /* renamed from: a */
            public void mo11529a(AbstractC8401ak abstractC8401ak) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    obtain.writeStrongBinder(abstractC8401ak != null ? abstractC8401ak.asBinder() : null);
                    this.f27335a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27335a;
            }
        }

        public AbstractBinderC8438a() {
            attachInterface(this, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        /* renamed from: a */
        public static AbstractC8437c m11759a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8437c)) ? new C8439a(iBinder) : (AbstractC8437c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    a(AbstractC8401ak.AbstractBinderC8402a.m11849a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11530a();

    /* renamed from: a */
    void mo11529a(AbstractC8401ak abstractC8401ak);
}
