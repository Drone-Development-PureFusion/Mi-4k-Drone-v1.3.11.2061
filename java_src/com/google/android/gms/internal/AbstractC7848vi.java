package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7835vd;
/* renamed from: com.google.android.gms.internal.vi */
/* loaded from: classes2.dex */
public interface AbstractC7848vi extends IInterface {

    /* renamed from: com.google.android.gms.internal.vi$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7849a extends Binder implements AbstractC7848vi {

        /* renamed from: com.google.android.gms.internal.vi$a$a */
        /* loaded from: classes2.dex */
        private static class C7850a implements AbstractC7848vi {

            /* renamed from: a */
            private IBinder f25979a;

            C7850a(IBinder iBinder) {
                this.f25979a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7848vi
            /* renamed from: a */
            public void mo13320a(AbstractC7835vd abstractC7835vd) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    obtain.writeStrongBinder(abstractC7835vd != null ? abstractC7835vd.asBinder() : null);
                    this.f25979a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25979a;
            }
        }

        public AbstractBinderC7849a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        }

        /* renamed from: a */
        public static AbstractC7848vi m13328a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7848vi)) ? new C7850a(iBinder) : (AbstractC7848vi) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    a(AbstractC7835vd.AbstractBinderC7836a.m13344a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo13320a(AbstractC7835vd abstractC7835vd);
}
