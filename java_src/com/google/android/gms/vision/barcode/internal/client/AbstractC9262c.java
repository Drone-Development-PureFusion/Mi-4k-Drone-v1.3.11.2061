package com.google.android.gms.vision.barcode.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
/* renamed from: com.google.android.gms.vision.barcode.internal.client.c */
/* loaded from: classes2.dex */
public interface AbstractC9262c extends IInterface {

    /* renamed from: com.google.android.gms.vision.barcode.internal.client.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9263a extends Binder implements AbstractC9262c {

        /* renamed from: com.google.android.gms.vision.barcode.internal.client.c$a$a */
        /* loaded from: classes2.dex */
        private static class C9264a implements AbstractC9262c {

            /* renamed from: a */
            private IBinder f29253a;

            C9264a(IBinder iBinder) {
                this.f29253a = iBinder;
            }

            @Override // com.google.android.gms.vision.barcode.internal.client.AbstractC9262c
            /* renamed from: a */
            public void mo8786a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                    this.f29253a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.vision.barcode.internal.client.AbstractC9262c
            /* renamed from: a */
            public Barcode[] mo8785a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29253a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Barcode[]) obtain2.createTypedArray(Barcode.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29253a;
            }

            @Override // com.google.android.gms.vision.barcode.internal.client.AbstractC9262c
            /* renamed from: b */
            public Barcode[] mo8784b(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29253a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Barcode[]) obtain2.createTypedArray(Barcode.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC9262c m8787a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9262c)) ? new C9264a(iBinder) : (AbstractC9262c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            FrameMetadataParcel frameMetadataParcel = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                    AbstractC4170e m25295a = AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        frameMetadataParcel = (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel);
                    }
                    Barcode[] a = a(m25295a, frameMetadataParcel);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                    AbstractC4170e m25295a2 = AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        frameMetadataParcel = (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel);
                    }
                    Barcode[] b = b(m25295a2, frameMetadataParcel);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(b, 1);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo8786a();

    /* renamed from: a */
    Barcode[] mo8785a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel);

    /* renamed from: b */
    Barcode[] mo8784b(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel);
}
