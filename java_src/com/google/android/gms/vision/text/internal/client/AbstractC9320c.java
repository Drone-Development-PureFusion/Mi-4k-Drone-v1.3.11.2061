package com.google.android.gms.vision.text.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.vision.text.internal.client.AbstractC9317b;
/* renamed from: com.google.android.gms.vision.text.internal.client.c */
/* loaded from: classes2.dex */
public interface AbstractC9320c extends IInterface {

    /* renamed from: com.google.android.gms.vision.text.internal.client.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9321a extends Binder implements AbstractC9320c {

        /* renamed from: com.google.android.gms.vision.text.internal.client.c$a$a */
        /* loaded from: classes2.dex */
        private static class C9322a implements AbstractC9320c {

            /* renamed from: a */
            private IBinder f29411a;

            C9322a(IBinder iBinder) {
                this.f29411a = iBinder;
            }

            @Override // com.google.android.gms.vision.text.internal.client.AbstractC9320c
            /* renamed from: a */
            public AbstractC9317b mo8625a(AbstractC4170e abstractC4170e, TextRecognizerOptions textRecognizerOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (textRecognizerOptions != null) {
                        obtain.writeInt(1);
                        textRecognizerOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29411a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC9317b.AbstractBinderC9318a.m8630a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29411a;
            }
        }

        /* renamed from: a */
        public static AbstractC9320c m8626a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9320c)) ? new C9322a(iBinder) : (AbstractC9320c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                    AbstractC9317b a = a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (TextRecognizerOptions) TextRecognizerOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    AbstractC9317b mo8625a(AbstractC4170e abstractC4170e, TextRecognizerOptions textRecognizerOptions);
}
