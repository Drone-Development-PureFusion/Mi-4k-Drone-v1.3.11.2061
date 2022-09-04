package com.google.android.gms.p232c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.c.e */
/* loaded from: classes.dex */
public interface AbstractC4170e extends IInterface {

    /* renamed from: com.google.android.gms.c.e$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC4171a extends Binder implements AbstractC4170e {

        /* renamed from: com.google.android.gms.c.e$a$a */
        /* loaded from: classes2.dex */
        private static class C4172a implements AbstractC4170e {

            /* renamed from: a */
            private IBinder f15770a;

            C4172a(IBinder iBinder) {
                this.f15770a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15770a;
            }
        }

        public AbstractBinderC4171a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static AbstractC4170e m25295a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4170e)) ? new C4172a(iBinder) : (AbstractC4170e) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }
}
