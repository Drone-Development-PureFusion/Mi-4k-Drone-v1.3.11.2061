package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7826uz;
/* renamed from: com.google.android.gms.internal.vf */
/* loaded from: classes2.dex */
public interface AbstractC7839vf extends IInterface {

    /* renamed from: com.google.android.gms.internal.vf$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7840a extends Binder implements AbstractC7839vf {

        /* renamed from: com.google.android.gms.internal.vf$a$a */
        /* loaded from: classes2.dex */
        private static class C7841a implements AbstractC7839vf {

            /* renamed from: a */
            private IBinder f25976a;

            C7841a(IBinder iBinder) {
                this.f25976a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7839vf
            /* renamed from: a */
            public void mo13325a(AbstractC7826uz abstractC7826uz) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    obtain.writeStrongBinder(abstractC7826uz != null ? abstractC7826uz.asBinder() : null);
                    this.f25976a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25976a;
            }
        }

        public AbstractBinderC7840a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        }

        /* renamed from: a */
        public static AbstractC7839vf m13331a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7839vf)) ? new C7841a(iBinder) : (AbstractC7839vf) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    a(AbstractC7826uz.AbstractBinderC7827a.m13391a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo13325a(AbstractC7826uz abstractC7826uz);
}
