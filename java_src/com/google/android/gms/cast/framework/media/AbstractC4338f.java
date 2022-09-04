package com.google.android.gms.cast.framework.media;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.cast.framework.media.f */
/* loaded from: classes.dex */
public interface AbstractC4338f extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.media.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4339a extends Binder implements AbstractC4338f {

        /* renamed from: com.google.android.gms.cast.framework.media.f$a$a */
        /* loaded from: classes2.dex */
        private static class C4340a implements AbstractC4338f {

            /* renamed from: a */
            private IBinder f16435a;

            C4340a(IBinder iBinder) {
                this.f16435a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.media.AbstractC4338f
            /* renamed from: a */
            public int mo24483a(Intent intent, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f16435a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.media.AbstractC4338f
            /* renamed from: a */
            public IBinder mo24484a(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16435a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.media.AbstractC4338f
            /* renamed from: a */
            public void mo24485a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    this.f16435a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16435a;
            }

            @Override // com.google.android.gms.cast.framework.media.AbstractC4338f
            /* renamed from: b */
            public void mo24482b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    this.f16435a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4338f m24486a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IMediaNotificationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4338f)) ? new C4340a(iBinder) : (AbstractC4338f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Intent intent = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    if (parcel.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    int a = a(intent, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    if (parcel.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    IBinder a2 = a(intent);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.media.IMediaNotificationService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24483a(Intent intent, int i, int i2);

    /* renamed from: a */
    IBinder mo24484a(Intent intent);

    /* renamed from: a */
    void mo24485a();

    /* renamed from: b */
    void mo24482b();
}
