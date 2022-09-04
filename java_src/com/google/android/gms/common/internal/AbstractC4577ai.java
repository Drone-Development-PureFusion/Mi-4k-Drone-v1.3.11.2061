package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.common.internal.ai */
/* loaded from: classes2.dex */
public interface AbstractC4577ai extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.ai$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4578a extends Binder implements AbstractC4577ai {

        /* renamed from: com.google.android.gms.common.internal.ai$a$a */
        /* loaded from: classes2.dex */
        private static class C4579a implements AbstractC4577ai {

            /* renamed from: a */
            private IBinder f17035a;

            C4579a(IBinder iBinder) {
                this.f17035a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4577ai
            /* renamed from: a */
            public void mo23646a(ResolveAccountResponse resolveAccountResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    if (resolveAccountResponse != null) {
                        obtain.writeInt(1);
                        resolveAccountResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17035a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17035a;
            }
        }

        /* renamed from: a */
        public static AbstractC4577ai m23647a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4577ai)) ? new C4579a(iBinder) : (AbstractC4577ai) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    a(parcel.readInt() != 0 ? ResolveAccountResponse.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo23646a(ResolveAccountResponse resolveAccountResponse);
}
