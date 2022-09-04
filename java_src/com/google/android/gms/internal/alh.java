package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
/* loaded from: classes2.dex */
public interface alh extends IInterface {

    /* renamed from: com.google.android.gms.internal.alh$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6495a extends Binder implements alh {

        /* renamed from: com.google.android.gms.internal.alh$a$a */
        /* loaded from: classes2.dex */
        private static class C6496a implements alh {

            /* renamed from: a */
            private IBinder f22162a;

            C6496a(IBinder iBinder) {
                this.f22162a = iBinder;
            }

            @Override // com.google.android.gms.internal.alh
            /* renamed from: a */
            public void mo16957a(ListSubscriptionsRequest listSubscriptionsRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if (listSubscriptionsRequest != null) {
                        obtain.writeInt(1);
                        listSubscriptionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22162a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alh
            /* renamed from: a */
            public void mo16956a(SubscribeRequest subscribeRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if (subscribeRequest != null) {
                        obtain.writeInt(1);
                        subscribeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22162a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alh
            /* renamed from: a */
            public void mo16955a(UnsubscribeRequest unsubscribeRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if (unsubscribeRequest != null) {
                        obtain.writeInt(1);
                        unsubscribeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22162a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22162a;
            }
        }

        /* renamed from: a */
        public static alh m16958a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alh)) ? new C6496a(iBinder) : (alh) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ListSubscriptionsRequest listSubscriptionsRequest = null;
            SubscribeRequest subscribeRequest = null;
            UnsubscribeRequest unsubscribeRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if (parcel.readInt() != 0) {
                        subscribeRequest = SubscribeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(subscribeRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if (parcel.readInt() != 0) {
                        unsubscribeRequest = UnsubscribeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unsubscribeRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if (parcel.readInt() != 0) {
                        listSubscriptionsRequest = ListSubscriptionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(listSubscriptionsRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16957a(ListSubscriptionsRequest listSubscriptionsRequest);

    /* renamed from: a */
    void mo16956a(SubscribeRequest subscribeRequest);

    /* renamed from: a */
    void mo16955a(UnsubscribeRequest unsubscribeRequest);
}
