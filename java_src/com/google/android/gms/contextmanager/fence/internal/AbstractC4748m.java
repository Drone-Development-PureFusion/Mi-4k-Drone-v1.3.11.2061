package com.google.android.gms.contextmanager.fence.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.m */
/* loaded from: classes2.dex */
public interface AbstractC4748m extends IInterface {

    /* renamed from: com.google.android.gms.contextmanager.fence.internal.m$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4749a extends Binder implements AbstractC4748m {

        /* renamed from: com.google.android.gms.contextmanager.fence.internal.m$a$a */
        /* loaded from: classes2.dex */
        private static class C4750a implements AbstractC4748m {

            /* renamed from: a */
            private IBinder f17402a;

            C4750a(IBinder iBinder) {
                this.f17402a = iBinder;
            }

            @Override // com.google.android.gms.contextmanager.fence.internal.AbstractC4748m
            /* renamed from: a */
            public void mo22900a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
                    if (fenceTriggerInfoImpl != null) {
                        obtain.writeInt(1);
                        fenceTriggerInfoImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17402a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17402a;
            }
        }

        public AbstractBinderC4749a() {
            attachInterface(this, "com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
        }

        /* renamed from: a */
        public static AbstractC4748m m22901a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4748m)) ? new C4750a(iBinder) : (AbstractC4748m) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
                    a(parcel.readInt() != 0 ? FenceTriggerInfoImpl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo22900a(FenceTriggerInfoImpl fenceTriggerInfoImpl);
}
