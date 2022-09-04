package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.internal.uy */
/* loaded from: classes2.dex */
public interface AbstractC7823uy extends IInterface {

    /* renamed from: com.google.android.gms.internal.uy$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7824a extends Binder implements AbstractC7823uy {

        /* renamed from: com.google.android.gms.internal.uy$a$a */
        /* loaded from: classes2.dex */
        private static class C7825a implements AbstractC7823uy {

            /* renamed from: a */
            private IBinder f25964a;

            C7825a(IBinder iBinder) {
                this.f25964a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7823uy
            /* renamed from: a */
            public IBinder mo13392a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC4170e abstractC4170e3, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeStrongBinder(abstractC4170e2 != null ? abstractC4170e2.asBinder() : null);
                    if (abstractC4170e3 != null) {
                        iBinder = abstractC4170e3.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f25964a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25964a;
            }
        }

        /* renamed from: a */
        public static AbstractC7823uy m13393a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7823uy)) ? new C7825a(iBinder) : (AbstractC7823uy) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    IBinder a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo13392a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC4170e abstractC4170e3, int i);
}
