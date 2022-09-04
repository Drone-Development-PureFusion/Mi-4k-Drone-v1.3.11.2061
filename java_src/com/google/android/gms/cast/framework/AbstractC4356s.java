package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
/* renamed from: com.google.android.gms.cast.framework.s */
/* loaded from: classes2.dex */
public interface AbstractC4356s extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.s$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4357a extends Binder implements AbstractC4356s {

        /* renamed from: com.google.android.gms.cast.framework.s$a$a */
        /* loaded from: classes2.dex */
        private static class C4358a implements AbstractC4356s {

            /* renamed from: a */
            private IBinder f16467a;

            C4358a(IBinder iBinder) {
                this.f16467a = iBinder;
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4356s
            /* renamed from: a */
            public int mo24414a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
                    this.f16467a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4356s
            /* renamed from: a */
            public void mo24413a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
                    obtain.writeInt(i);
                    this.f16467a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4356s
            /* renamed from: a */
            public void mo24412a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
                    obtain.writeString(str);
                    this.f16467a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4356s
            /* renamed from: a */
            public void mo24411a(String str, LaunchOptions launchOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
                    obtain.writeString(str);
                    if (launchOptions != null) {
                        obtain.writeInt(1);
                        launchOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16467a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.cast.framework.AbstractC4356s
            /* renamed from: a */
            public void mo24410a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.framework.ICastConnectionController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f16467a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16467a;
            }
        }

        public AbstractBinderC4357a() {
            attachInterface(this, "com.google.android.gms.cast.framework.ICastConnectionController");
        }

        /* renamed from: a */
        public static AbstractC4356s m24415a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastConnectionController");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4356s)) ? new C4358a(iBinder) : (AbstractC4356s) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
                    a(parcel.readString(), parcel.readInt() != 0 ? LaunchOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ICastConnectionController");
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ICastConnectionController");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24414a();

    /* renamed from: a */
    void mo24413a(int i);

    /* renamed from: a */
    void mo24412a(String str);

    /* renamed from: a */
    void mo24411a(String str, LaunchOptions launchOptions);

    /* renamed from: a */
    void mo24410a(String str, String str2);
}
