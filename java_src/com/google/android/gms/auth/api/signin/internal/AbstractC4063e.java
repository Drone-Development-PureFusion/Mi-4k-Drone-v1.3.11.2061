package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
/* loaded from: classes.dex */
public interface AbstractC4063e extends IInterface {

    /* renamed from: com.google.android.gms.auth.api.signin.internal.e$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC4064a extends Binder implements AbstractC4063e {
        public AbstractBinderC4064a() {
            attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.IRevocationService");
                    a();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.signin.internal.IRevocationService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo25589a();
}
