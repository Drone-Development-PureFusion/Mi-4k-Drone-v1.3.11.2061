package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC7831vb;
/* renamed from: com.google.android.gms.internal.vg */
/* loaded from: classes2.dex */
public interface AbstractC7842vg extends IInterface {

    /* renamed from: com.google.android.gms.internal.vg$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC7843a extends Binder implements AbstractC7842vg {

        /* renamed from: com.google.android.gms.internal.vg$a$a */
        /* loaded from: classes2.dex */
        private static class C7844a implements AbstractC7842vg {

            /* renamed from: a */
            private IBinder f25977a;

            C7844a(IBinder iBinder) {
                this.f25977a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC7842vg
            /* renamed from: a */
            public void mo13323a(AbstractC7831vb abstractC7831vb) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    obtain.writeStrongBinder(abstractC7831vb != null ? abstractC7831vb.asBinder() : null);
                    this.f25977a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25977a;
            }
        }

        public AbstractBinderC7843a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        }

        /* renamed from: a */
        public static AbstractC7842vg m13330a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7842vg)) ? new C7844a(iBinder) : (AbstractC7842vg) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    a(AbstractC7831vb.AbstractBinderC7832a.m13365a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo13323a(AbstractC7831vb abstractC7831vb);
}
