package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.client.aj */
/* loaded from: classes2.dex */
public interface AbstractC3529aj extends IInterface {

    /* renamed from: com.google.android.gms.ads.internal.client.aj$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3530a extends Binder implements AbstractC3529aj {

        /* renamed from: com.google.android.gms.ads.internal.client.aj$a$a */
        /* loaded from: classes2.dex */
        private static class C3531a implements AbstractC3529aj {

            /* renamed from: a */
            private IBinder f13946a;

            C3531a(IBinder iBinder) {
                this.f13946a = iBinder;
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3529aj
            /* renamed from: a */
            public IBinder mo27572a(AbstractC4170e abstractC4170e, String str, AbstractC8005xq abstractC8005xq, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeString(str);
                    if (abstractC8005xq != null) {
                        iBinder = abstractC8005xq.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f13946a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13946a;
            }
        }

        /* renamed from: a */
        public static AbstractC3529aj m27573a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3529aj)) ? new C3531a(iBinder) : (AbstractC3529aj) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    IBinder a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readString(), AbstractC8005xq.AbstractBinderC8006a.m13054a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo27572a(AbstractC4170e abstractC4170e, String str, AbstractC8005xq abstractC8005xq, int i);
}
