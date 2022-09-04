package com.google.android.gms.vision.barcode.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.vision.barcode.internal.client.AbstractC9262c;
/* renamed from: com.google.android.gms.vision.barcode.internal.client.d */
/* loaded from: classes2.dex */
public interface AbstractC9265d extends IInterface {

    /* renamed from: com.google.android.gms.vision.barcode.internal.client.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9266a extends Binder implements AbstractC9265d {

        /* renamed from: com.google.android.gms.vision.barcode.internal.client.d$a$a */
        /* loaded from: classes2.dex */
        private static class C9267a implements AbstractC9265d {

            /* renamed from: a */
            private IBinder f29254a;

            C9267a(IBinder iBinder) {
                this.f29254a = iBinder;
            }

            @Override // com.google.android.gms.vision.barcode.internal.client.AbstractC9265d
            /* renamed from: a */
            public AbstractC9262c mo8782a(AbstractC4170e abstractC4170e, BarcodeDetectorOptions barcodeDetectorOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (barcodeDetectorOptions != null) {
                        obtain.writeInt(1);
                        barcodeDetectorOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29254a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC9262c.AbstractBinderC9263a.m8787a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29254a;
            }
        }

        /* renamed from: a */
        public static AbstractC9265d m8783a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9265d)) ? new C9267a(iBinder) : (AbstractC9265d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    AbstractC9262c a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (BarcodeDetectorOptions) BarcodeDetectorOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC9262c mo8782a(AbstractC4170e abstractC4170e, BarcodeDetectorOptions barcodeDetectorOptions);
}
