package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7804uq;
/* renamed from: com.google.android.gms.internal.ur */
/* loaded from: classes2.dex */
public interface AbstractC7807ur extends IInterface {

    /* renamed from: com.google.android.gms.internal.ur$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7808a extends Binder implements AbstractC7807ur {

        /* renamed from: com.google.android.gms.internal.ur$a$a */
        /* loaded from: classes2.dex */
        private static class C7809a implements AbstractC7807ur {

            /* renamed from: a */
            private IBinder f25945a;

            C7809a(IBinder iBinder) {
                this.f25945a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7807ur
            /* renamed from: a */
            public void mo13242a(AbstractC7804uq abstractC7804uq) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    obtain.writeStrongBinder(abstractC7804uq != null ? abstractC7804uq.asBinder() : null);
                    this.f25945a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25945a;
            }
        }

        public AbstractBinderC7808a() {
            attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        }

        /* renamed from: a */
        public static AbstractC7807ur m13417a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7807ur)) ? new C7809a(iBinder) : (AbstractC7807ur) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    a(AbstractC7804uq.AbstractBinderC7805a.m13423a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo13242a(AbstractC7804uq abstractC7804uq);
}
