package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7835vd;
/* renamed from: com.google.android.gms.internal.vh */
/* loaded from: classes2.dex */
public interface AbstractC7845vh extends IInterface {

    /* renamed from: com.google.android.gms.internal.vh$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7846a extends Binder implements AbstractC7845vh {

        /* renamed from: com.google.android.gms.internal.vh$a$a */
        /* loaded from: classes2.dex */
        private static class C7847a implements AbstractC7845vh {

            /* renamed from: a */
            private IBinder f25978a;

            C7847a(IBinder iBinder) {
                this.f25978a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7845vh
            /* renamed from: a */
            public void mo13321a(AbstractC7835vd abstractC7835vd, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    obtain.writeStrongBinder(abstractC7835vd != null ? abstractC7835vd.asBinder() : null);
                    obtain.writeString(str);
                    this.f25978a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25978a;
            }
        }

        public AbstractBinderC7846a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        }

        /* renamed from: a */
        public static AbstractC7845vh m13329a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7845vh)) ? new C7847a(iBinder) : (AbstractC7845vh) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    a(AbstractC7835vd.AbstractBinderC7836a.m13344a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo13321a(AbstractC7835vd abstractC7835vd, String str);
}
