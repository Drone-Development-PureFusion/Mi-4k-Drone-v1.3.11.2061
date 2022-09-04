package com.google.android.gms.cast.framework.media;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.media.e */
/* loaded from: classes2.dex */
public interface AbstractC4335e extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.media.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4336a extends Binder implements AbstractC4335e {

        /* renamed from: com.google.android.gms.cast.framework.media.e$a$a */
        /* loaded from: classes2.dex */
        private static class C4337a implements AbstractC4335e {

            /* renamed from: a */
            private IBinder f16434a;

            C4337a(IBinder iBinder) {
                this.f16434a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.media.AbstractC4335e
            /* renamed from: a */
            public int mo24489a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
                    this.f16434a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.media.AbstractC4335e
            /* renamed from: a */
            public WebImage mo24488a(MediaMetadata mediaMetadata, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
                    if (mediaMetadata != null) {
                        obtain.writeInt(1);
                        mediaMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f16434a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? WebImage.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16434a;
            }

            @Override // com.google.android.gms.cast.framework.media.AbstractC4335e
            /* renamed from: b */
            public AbstractC4170e mo24487b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.IImagePicker");
                    this.f16434a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC4170e.AbstractBinderC4171a.m25295a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC4336a() {
            attachInterface(this, "com.google.android.gms.cast.framework.media.IImagePicker");
        }

        /* renamed from: a */
        public static AbstractC4335e m24490a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4335e)) ? new C4337a(iBinder) : (AbstractC4335e) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            MediaMetadata mediaMetadata = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
                    if (parcel.readInt() != 0) {
                        mediaMetadata = MediaMetadata.CREATOR.createFromParcel(parcel);
                    }
                    WebImage a = a(mediaMetadata, parcel.readInt());
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
                    AbstractC4170e b = b();
                    parcel2.writeNoException();
                    if (b != null) {
                        iBinder = b.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.IImagePicker");
                    int a2 = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.media.IImagePicker");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24489a();

    /* renamed from: a */
    WebImage mo24488a(MediaMetadata mediaMetadata, int i);

    /* renamed from: b */
    AbstractC4170e mo24487b();
}
