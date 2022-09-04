package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
/* loaded from: classes2.dex */
public interface alk extends IInterface {

    /* renamed from: com.google.android.gms.internal.alk$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC6500a extends Binder implements alk {

        /* renamed from: com.google.android.gms.internal.alk$a$a */
        /* loaded from: classes2.dex */
        private static class C6501a implements alk {

            /* renamed from: a */
            private IBinder f22169a;

            C6501a(IBinder iBinder) {
                this.f22169a = iBinder;
            }

            @Override // com.google.android.gms.internal.alk
            /* renamed from: a */
            public void mo16945a(SessionInsertRequest sessionInsertRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionInsertRequest != null) {
                        obtain.writeInt(1);
                        sessionInsertRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22169a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alk
            /* renamed from: a */
            public void mo16944a(SessionReadRequest sessionReadRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionReadRequest != null) {
                        obtain.writeInt(1);
                        sessionReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22169a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alk
            /* renamed from: a */
            public void mo16943a(SessionRegistrationRequest sessionRegistrationRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionRegistrationRequest != null) {
                        obtain.writeInt(1);
                        sessionRegistrationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22169a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alk
            /* renamed from: a */
            public void mo16942a(SessionStartRequest sessionStartRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionStartRequest != null) {
                        obtain.writeInt(1);
                        sessionStartRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22169a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alk
            /* renamed from: a */
            public void mo16941a(SessionStopRequest sessionStopRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionStopRequest != null) {
                        obtain.writeInt(1);
                        sessionStopRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22169a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.internal.alk
            /* renamed from: a */
            public void mo16940a(SessionUnregistrationRequest sessionUnregistrationRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (sessionUnregistrationRequest != null) {
                        obtain.writeInt(1);
                        sessionUnregistrationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f22169a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22169a;
            }
        }

        /* renamed from: a */
        public static alk m16946a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof alk)) ? new C6501a(iBinder) : (alk) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            SessionUnregistrationRequest sessionUnregistrationRequest = null;
            SessionStartRequest sessionStartRequest = null;
            SessionStopRequest sessionStopRequest = null;
            SessionInsertRequest sessionInsertRequest = null;
            SessionReadRequest sessionReadRequest = null;
            SessionRegistrationRequest sessionRegistrationRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (parcel.readInt() != 0) {
                        sessionStartRequest = SessionStartRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sessionStartRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (parcel.readInt() != 0) {
                        sessionStopRequest = SessionStopRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sessionStopRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (parcel.readInt() != 0) {
                        sessionInsertRequest = SessionInsertRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sessionInsertRequest);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (parcel.readInt() != 0) {
                        sessionReadRequest = SessionReadRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sessionReadRequest);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (parcel.readInt() != 0) {
                        sessionRegistrationRequest = SessionRegistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sessionRegistrationRequest);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if (parcel.readInt() != 0) {
                        sessionUnregistrationRequest = SessionUnregistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(sessionUnregistrationRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo16945a(SessionInsertRequest sessionInsertRequest);

    /* renamed from: a */
    void mo16944a(SessionReadRequest sessionReadRequest);

    /* renamed from: a */
    void mo16943a(SessionRegistrationRequest sessionRegistrationRequest);

    /* renamed from: a */
    void mo16942a(SessionStartRequest sessionStartRequest);

    /* renamed from: a */
    void mo16941a(SessionStopRequest sessionStopRequest);

    /* renamed from: a */
    void mo16940a(SessionUnregistrationRequest sessionUnregistrationRequest);
}
