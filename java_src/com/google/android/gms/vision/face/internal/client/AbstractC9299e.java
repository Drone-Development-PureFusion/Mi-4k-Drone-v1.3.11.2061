package com.google.android.gms.vision.face.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.vision.face.internal.client.AbstractC9296d;
/* renamed from: com.google.android.gms.vision.face.internal.client.e */
/* loaded from: classes2.dex */
public interface AbstractC9299e extends IInterface {

    /* renamed from: com.google.android.gms.vision.face.internal.client.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9300a extends Binder implements AbstractC9299e {

        /* renamed from: com.google.android.gms.vision.face.internal.client.e$a$a */
        /* loaded from: classes2.dex */
        private static class C9301a implements AbstractC9299e {

            /* renamed from: a */
            private IBinder f29352a;

            C9301a(IBinder iBinder) {
                this.f29352a = iBinder;
            }

            @Override // com.google.android.gms.vision.face.internal.client.AbstractC9299e
            /* renamed from: a */
            public AbstractC9296d mo8677a(AbstractC4170e abstractC4170e, FaceSettingsParcel faceSettingsParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (faceSettingsParcel != null) {
                        obtain.writeInt(1);
                        faceSettingsParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29352a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC9296d.AbstractBinderC9297a.m8682a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29352a;
            }
        }

        /* renamed from: a */
        public static AbstractC9299e m8678a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9299e)) ? new C9301a(iBinder) : (AbstractC9299e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                    AbstractC9296d a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (FaceSettingsParcel) FaceSettingsParcel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC9296d mo8677a(AbstractC4170e abstractC4170e, FaceSettingsParcel faceSettingsParcel);
}
