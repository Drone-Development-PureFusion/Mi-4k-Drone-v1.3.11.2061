package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* loaded from: classes2.dex */
public interface afo extends IInterface {

    /* renamed from: com.google.android.gms.internal.afo$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6273a extends Binder implements afo {

        /* renamed from: com.google.android.gms.internal.afo$a$a */
        /* loaded from: classes2.dex */
        private static class C6274a implements afo {

            /* renamed from: a */
            private IBinder f21474a;

            C6274a(IBinder iBinder) {
                this.f21474a = iBinder;
            }

            @Override // com.google.android.gms.internal.afo
            /* renamed from: a */
            public Bitmap mo17758a(Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21474a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.afo
            /* renamed from: a */
            public void mo17757a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f21474a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21474a;
            }
        }

        /* renamed from: a */
        public static afo m17759a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof afo)) ? new C6274a(iBinder) : (afo) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
                    Bitmap a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    Bitmap mo17758a(Uri uri);

    /* renamed from: a */
    void mo17757a(AbstractC4170e abstractC4170e);
}
