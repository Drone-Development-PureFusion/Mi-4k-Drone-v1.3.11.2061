package com.google.android.gms.vision.face.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
/* renamed from: com.google.android.gms.vision.face.internal.client.d */
/* loaded from: classes2.dex */
public interface AbstractC9296d extends IInterface {

    /* renamed from: com.google.android.gms.vision.face.internal.client.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9297a extends Binder implements AbstractC9296d {

        /* renamed from: com.google.android.gms.vision.face.internal.client.d$a$a */
        /* loaded from: classes2.dex */
        private static class C9298a implements AbstractC9296d {

            /* renamed from: a */
            private IBinder f29351a;

            C9298a(IBinder iBinder) {
                this.f29351a = iBinder;
            }

            @Override // com.google.android.gms.vision.face.internal.client.AbstractC9296d
            /* renamed from: a */
            public void mo8681a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    this.f29351a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.vision.face.internal.client.AbstractC9296d
            /* renamed from: a */
            public boolean mo8680a(int i) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    obtain.writeInt(i);
                    this.f29351a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.vision.face.internal.client.AbstractC9296d
            /* renamed from: a */
            public FaceParcel[] mo8679a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (frameMetadataParcel != null) {
                        obtain.writeInt(1);
                        frameMetadataParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29351a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (FaceParcel[]) obtain2.createTypedArray(FaceParcel.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29351a;
            }
        }

        /* renamed from: a */
        public static AbstractC9296d m8682a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9296d)) ? new C9298a(iBinder) : (AbstractC9296d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    FaceParcel[] a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (FrameMetadataParcel) FrameMetadataParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    boolean a2 = a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a2 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo8681a();

    /* renamed from: a */
    boolean mo8680a(int i);

    /* renamed from: a */
    FaceParcel[] mo8679a(AbstractC4170e abstractC4170e, FrameMetadataParcel frameMetadataParcel);
}
