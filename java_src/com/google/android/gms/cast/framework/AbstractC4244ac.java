package com.google.android.gms.cast.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.ac */
/* loaded from: classes2.dex */
public interface AbstractC4244ac extends IInterface {

    /* renamed from: com.google.android.gms.cast.framework.ac$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4245a extends Binder implements AbstractC4244ac {
        public AbstractBinderC4245a() {
            attachInterface(this, "com.google.android.gms.cast.framework.ISessionProvider");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    AbstractC4170e a = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    boolean b = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    String c = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.cast.framework.ISessionProvider");
                    int a2 = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.cast.framework.ISessionProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo24707a();

    /* renamed from: a */
    AbstractC4170e mo24706a(String str);

    /* renamed from: b */
    boolean mo24705b();

    /* renamed from: c */
    String mo24704c();
}
