package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.AbstractC6925ex;
import com.google.android.gms.internal.AbstractC6928ey;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
/* renamed from: com.google.android.gms.internal.ev */
/* loaded from: classes2.dex */
public interface AbstractC6919ev extends IInterface {

    /* renamed from: com.google.android.gms.internal.ev$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6920a extends Binder implements AbstractC6919ev {

        /* renamed from: com.google.android.gms.internal.ev$a$a */
        /* loaded from: classes2.dex */
        private static class C6921a implements AbstractC6919ev {

            /* renamed from: a */
            private IBinder f23312a;

            C6921a(IBinder iBinder) {
                this.f23312a = iBinder;
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15944a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23312a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15943a(Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15942a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (createWalletObjectsRequest != null) {
                        obtain.writeInt(1);
                        createWalletObjectsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15941a(FullWalletRequest fullWalletRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (fullWalletRequest != null) {
                        obtain.writeInt(1);
                        fullWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15940a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (isReadyToPayRequest != null) {
                        obtain.writeInt(1);
                        isReadyToPayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15939a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, AbstractC6925ex abstractC6925ex) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (maskedWalletRequest != null) {
                        obtain.writeInt(1);
                        maskedWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6925ex != null) {
                        iBinder = abstractC6925ex.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15938a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (maskedWalletRequest != null) {
                        obtain.writeInt(1);
                        maskedWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15937a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (notifyTransactionStatusRequest != null) {
                        obtain.writeInt(1);
                        notifyTransactionStatusRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23312a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15936a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (executeBuyFlowRequest != null) {
                        obtain.writeInt(1);
                        executeBuyFlowRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15935a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (getBuyFlowInitializationTokenRequest != null) {
                        obtain.writeInt(1);
                        getBuyFlowInitializationTokenRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15934a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (getClientTokenRequest != null) {
                        obtain.writeInt(1);
                        getClientTokenRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15933a(GetInstrumentsRequest getInstrumentsRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (getInstrumentsRequest != null) {
                        obtain.writeInt(1);
                        getInstrumentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15932a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (initializeBuyFlowRequest != null) {
                        obtain.writeInt(1);
                        initializeBuyFlowRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: a */
            public void mo15931a(String str, String str2, Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23312a;
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: b */
            public void mo15930b(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23312a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.AbstractC6919ev
            /* renamed from: b */
            public void mo15929b(Bundle bundle, AbstractC6928ey abstractC6928ey) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (abstractC6928ey != null) {
                        iBinder = abstractC6928ey.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f23312a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC6919ev m15945a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC6919ev)) ? new C6921a(iBinder) : (AbstractC6919ev) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? MaskedWalletRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? FullWalletRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? NotifyTransactionStatusRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? CreateWalletObjectsRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? MaskedWalletRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6925ex.AbstractBinderC6926a.m15926a(parcel.readStrongBinder()));
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? GetInstrumentsRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? GetBuyFlowInitializationTokenRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? InitializeBuyFlowRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? IsReadyToPayRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? GetClientTokenRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    a(parcel.readInt() != 0 ? ExecuteBuyFlowRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, AbstractC6928ey.AbstractBinderC6929a.m15924a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wallet.internal.IOwService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo15944a(Bundle bundle);

    /* renamed from: a */
    void mo15943a(Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15942a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15941a(FullWalletRequest fullWalletRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15940a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15939a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, AbstractC6925ex abstractC6925ex);

    /* renamed from: a */
    void mo15938a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15937a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle);

    /* renamed from: a */
    void mo15936a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15935a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15934a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15933a(GetInstrumentsRequest getInstrumentsRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15932a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: a */
    void mo15931a(String str, String str2, Bundle bundle, AbstractC6928ey abstractC6928ey);

    /* renamed from: b */
    void mo15930b(Bundle bundle);

    /* renamed from: b */
    void mo15929b(Bundle bundle, AbstractC6928ey abstractC6928ey);
}
