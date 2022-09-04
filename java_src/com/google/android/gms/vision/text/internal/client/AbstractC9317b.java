package com.google.android.gms.vision.text.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
/* renamed from: com.google.android.gms.vision.text.internal.client.b */
/* loaded from: classes2.dex */
public interface AbstractC9317b extends IInterface {

    /* renamed from: com.google.android.gms.vision.text.internal.client.b$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9318a extends Binder implements AbstractC9317b {

        /* renamed from: com.google.android.gms.vision.text.internal.client.b$a$a */
        /* loaded from: classes2.dex */
        private static class C9319a implements AbstractC9317b {

            /* renamed from: a */
            private IBinder f29410a;

            C9319a(IBinder iBinder) {
                this.f29410a = iBinder;
            }

            @Override // com.google.android.gms.vision.text.internal.client.AbstractC9317b
            /* renamed from: a */
            public void mo8629a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    this.f29410a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.vision.text.internal.client.AbstractC9317b
            /* renamed from: a */
            public LineBoxParcel[] mo8628a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29410a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (LineBoxParcel[]) obtain2.createTypedArray(LineBoxParcel.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.vision.text.internal.client.AbstractC9317b
            /* renamed from: a */
            public LineBoxParcel[] mo8627a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel, RecognitionOptions recognitionOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (recognitionOptions != null) {
                        obtain.writeInt(1);
                        recognitionOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29410a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (LineBoxParcel[]) obtain2.createTypedArray(LineBoxParcel.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29410a;
            }
        }

        /* renamed from: a */
        public static AbstractC9317b m8630a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9317b)) ? new C9319a(iBinder) : (AbstractC9317b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    LineBoxParcel[] a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    LineBoxParcel[] a2 = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (RecognitionOptions) RecognitionOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a2, 1);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo8629a();

    /* renamed from: a */
    LineBoxParcel[] mo8628a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel);

    /* renamed from: a */
    LineBoxParcel[] mo8627a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel, RecognitionOptions recognitionOptions);
}
