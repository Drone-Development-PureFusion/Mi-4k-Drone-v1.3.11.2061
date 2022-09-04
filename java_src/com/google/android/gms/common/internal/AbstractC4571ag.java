package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.AbstractC4568af;
/* renamed from: com.google.android.gms.common.internal.ag */
/* loaded from: classes2.dex */
public interface AbstractC4571ag extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.ag$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4572a extends Binder implements AbstractC4571ag {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.common.internal.ag$a$a */
        /* loaded from: classes2.dex */
        public static class C4573a implements AbstractC4571ag {

            /* renamed from: a */
            private IBinder f17033a;

            C4573a(IBinder iBinder) {
                this.f17033a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23695a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    this.f17033a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23694a(AbstractC4568af abstractC4568af, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    this.f17033a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23693a(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23692a(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23691a(AbstractC4568af abstractC4568af, int i, String str, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23690a(AbstractC4568af abstractC4568af, int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f17033a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23689a(AbstractC4568af abstractC4568af, int i, String str, String str2, String str3, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStringArray(strArr);
                    this.f17033a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23688a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    this.f17033a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23687a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23686a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23685a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr, String str3, IBinder iBinder, String str4, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str4);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23684a(AbstractC4568af abstractC4568af, int i, String str, String[] strArr, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23683a(AbstractC4568af abstractC4568af, GetServiceRequest getServiceRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: a */
            public void mo23682a(AbstractC4568af abstractC4568af, ValidateAccountRequest validateAccountRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    if (validateAccountRequest != null) {
                        obtain.writeInt(1);
                        validateAccountRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17033a;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: b */
            public void mo23681b(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: b */
            public void mo23680b(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: c */
            public void mo23679c(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: c */
            public void mo23678c(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: d */
            public void mo23677d(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: d */
            public void mo23676d(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: e */
            public void mo23675e(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: e */
            public void mo23674e(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: f */
            public void mo23673f(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: f */
            public void mo23672f(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: g */
            public void mo23671g(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: g */
            public void mo23670g(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: h */
            public void mo23669h(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: h */
            public void mo23668h(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: i */
            public void mo23667i(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: i */
            public void mo23666i(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: j */
            public void mo23665j(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: j */
            public void mo23664j(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: k */
            public void mo23663k(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: k */
            public void mo23662k(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: l */
            public void mo23661l(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: l */
            public void mo23660l(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: m */
            public void mo23659m(AbstractC4568af abstractC4568af, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f17033a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: m */
            public void mo23658m(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: n */
            public void mo23657n(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: o */
            public void mo23656o(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: p */
            public void mo23655p(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: q */
            public void mo23654q(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: r */
            public void mo23653r(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: s */
            public void mo23652s(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.common.internal.AbstractC4571ag
            /* renamed from: t */
            public void mo23651t(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(abstractC4568af != null ? abstractC4568af.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17033a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC4571ag m23696a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC4571ag)) ? new C4573a(iBinder) : (AbstractC4571ag) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ValidateAccountRequest validateAccountRequest = null;
            Bundle bundle = null;
            Bundle bundle2 = null;
            Bundle bundle3 = null;
            Bundle bundle4 = null;
            Bundle bundle5 = null;
            Bundle bundle6 = null;
            Bundle bundle7 = null;
            Bundle bundle8 = null;
            Bundle bundle9 = null;
            Bundle bundle10 = null;
            Bundle bundle11 = null;
            Bundle bundle12 = null;
            Bundle bundle13 = null;
            Bundle bundle14 = null;
            Bundle bundle15 = null;
            Bundle bundle16 = null;
            Bundle bundle17 = null;
            Bundle bundle18 = null;
            Bundle bundle19 = null;
            Bundle bundle20 = null;
            GetServiceRequest getServiceRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(m23697a, readInt, readString, bundle);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a2 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    b(m23697a2, readInt2, readString2, bundle2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a3 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt3 = parcel.readInt();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    c(m23697a3, readInt3, readString3, bundle3);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a4 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt4 = parcel.readInt();
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    d(m23697a4, readInt4, readString4, bundle4);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a5 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt5 = parcel.readInt();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    e(m23697a5, readInt5, readString5, bundle5);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a6 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt6 = parcel.readInt();
                    String readString6 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    f(m23697a6, readInt6, readString6, bundle6);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a7 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt7 = parcel.readInt();
                    String readString7 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    g(m23697a7, readInt7, readString7, bundle7);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a8 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt8 = parcel.readInt();
                    String readString8 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    h(m23697a8, readInt8, readString8, bundle8);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a9 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt9 = parcel.readInt();
                    String readString9 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    i(m23697a9, readInt9, readString9, bundle9);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a10 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt10 = parcel.readInt();
                    String readString10 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle10 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    j(m23697a10, readInt10, readString10, bundle10);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a11 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt11 = parcel.readInt();
                    String readString11 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle11 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    k(m23697a11, readInt11, readString11, bundle11);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a12 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt12 = parcel.readInt();
                    String readString12 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle12 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    l(m23697a12, readInt12, readString12, bundle12);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a13 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt13 = parcel.readInt();
                    String readString13 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle13 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    m(m23697a13, readInt13, readString13, bundle13);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    b(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    c(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a14 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt14 = parcel.readInt();
                    String readString14 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle14 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    n(m23697a14, readInt14, readString14, bundle14);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    d(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a15 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt15 = parcel.readInt();
                    String readString15 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle15 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    o(m23697a15, readInt15, readString15, bundle15);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    e(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a16 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt16 = parcel.readInt();
                    String readString16 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle16 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    p(m23697a16, readInt16, readString16, bundle16);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    f(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    g(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    h(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    i(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a17 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt17 = parcel.readInt();
                    String readString17 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle17 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    q(m23697a17, readInt17, readString17, bundle17);
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a18 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt18 = parcel.readInt();
                    String readString18 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle18 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    r(m23697a18, readInt18, readString18, bundle18);
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    j(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a19 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt19 = parcel.readInt();
                    String readString19 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle19 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    s(m23697a19, readInt19, readString19, bundle19);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    k(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a20 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    int readInt20 = parcel.readInt();
                    String readString20 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle20 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    t(m23697a20, readInt20, readString20, bundle20);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    l(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    m(AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a21 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        getServiceRequest = GetServiceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m23697a21, getServiceRequest);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    AbstractC4568af m23697a22 = AbstractC4568af.AbstractBinderC4569a.m23697a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        validateAccountRequest = ValidateAccountRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m23697a22, validateAccountRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo23695a();

    /* renamed from: a */
    void mo23694a(AbstractC4568af abstractC4568af, int i);

    /* renamed from: a */
    void mo23693a(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: a */
    void mo23692a(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: a */
    void mo23691a(AbstractC4568af abstractC4568af, int i, String str, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo23690a(AbstractC4568af abstractC4568af, int i, String str, String str2);

    /* renamed from: a */
    void mo23689a(AbstractC4568af abstractC4568af, int i, String str, String str2, String str3, String[] strArr);

    /* renamed from: a */
    void mo23688a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr);

    /* renamed from: a */
    void mo23687a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr, Bundle bundle);

    /* renamed from: a */
    void mo23686a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr, String str3, Bundle bundle);

    /* renamed from: a */
    void mo23685a(AbstractC4568af abstractC4568af, int i, String str, String str2, String[] strArr, String str3, IBinder iBinder, String str4, Bundle bundle);

    /* renamed from: a */
    void mo23684a(AbstractC4568af abstractC4568af, int i, String str, String[] strArr, String str2, Bundle bundle);

    /* renamed from: a */
    void mo23683a(AbstractC4568af abstractC4568af, GetServiceRequest getServiceRequest);

    /* renamed from: a */
    void mo23682a(AbstractC4568af abstractC4568af, ValidateAccountRequest validateAccountRequest);

    /* renamed from: b */
    void mo23681b(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: b */
    void mo23680b(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: c */
    void mo23679c(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: c */
    void mo23678c(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: d */
    void mo23677d(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: d */
    void mo23676d(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: e */
    void mo23675e(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: e */
    void mo23674e(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: f */
    void mo23673f(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: f */
    void mo23672f(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: g */
    void mo23671g(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: g */
    void mo23670g(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: h */
    void mo23669h(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: h */
    void mo23668h(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: i */
    void mo23667i(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: i */
    void mo23666i(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: j */
    void mo23665j(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: j */
    void mo23664j(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: k */
    void mo23663k(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: k */
    void mo23662k(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: l */
    void mo23661l(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: l */
    void mo23660l(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: m */
    void mo23659m(AbstractC4568af abstractC4568af, int i, String str);

    /* renamed from: m */
    void mo23658m(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: n */
    void mo23657n(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: o */
    void mo23656o(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: p */
    void mo23655p(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: q */
    void mo23654q(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: r */
    void mo23653r(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: s */
    void mo23652s(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);

    /* renamed from: t */
    void mo23651t(AbstractC4568af abstractC4568af, int i, String str, Bundle bundle);
}
