package com.google.android.gms.analytics.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.internal.d */
/* loaded from: classes2.dex */
public interface AbstractC3888d extends IInterface {

    /* renamed from: com.google.android.gms.analytics.internal.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3889a extends Binder implements AbstractC3888d {

        /* renamed from: com.google.android.gms.analytics.internal.d$a$a */
        /* loaded from: classes2.dex */
        private static class C3890a implements AbstractC3888d {

            /* renamed from: a */
            private IBinder f15078a;

            C3890a(IBinder iBinder) {
                this.f15078a = iBinder;
            }

            @Override // com.google.android.gms.analytics.internal.AbstractC3888d
            /* renamed from: a */
            public void mo26302a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.f15078a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.analytics.internal.AbstractC3888d
            /* renamed from: a */
            public void mo26301a(Map map, long j, String str, List<Command> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    obtain.writeMap(map);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeTypedList(list);
                    this.f15078a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15078a;
            }

            @Override // com.google.android.gms.analytics.internal.AbstractC3888d
            /* renamed from: b */
            public String mo26300b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.f15078a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC3888d m26303a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3888d)) ? new C3890a(iBinder) : (AbstractC3888d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    a(parcel.readHashMap(getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(Command.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    String b = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo26302a();

    /* renamed from: a */
    void mo26301a(Map map, long j, String str, List<Command> list);

    /* renamed from: b */
    String mo26300b();
}
