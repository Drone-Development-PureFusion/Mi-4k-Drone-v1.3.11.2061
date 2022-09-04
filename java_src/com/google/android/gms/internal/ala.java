package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.FileUriResult;
/* loaded from: classes2.dex */
public interface ala extends IInterface {

    /* renamed from: com.google.android.gms.internal.ala$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6481a extends Binder implements ala {

        /* renamed from: com.google.android.gms.internal.ala$a$a */
        /* loaded from: classes2.dex */
        private static class C6482a implements ala {

            /* renamed from: a */
            private IBinder f22155a;

            C6482a(IBinder iBinder) {
                this.f22155a = iBinder;
            }

            @Override // com.google.android.gms.internal.ala
            /* renamed from: a */
            public void mo16988a(FileUriResult fileUriResult) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IFileUriCallback");
                    if (fileUriResult != null) {
                        obtain.writeInt(1);
                        fileUriResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22155a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22155a;
            }
        }

        /* renamed from: a */
        public static ala m16989a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IFileUriCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ala)) ? new C6482a(iBinder) : (ala) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IFileUriCallback");
                    a(parcel.readInt() != 0 ? FileUriResult.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IFileUriCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16988a(FileUriResult fileUriResult);
}
