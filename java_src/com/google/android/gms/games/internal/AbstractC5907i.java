package com.google.android.gms.games.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.fitness.C5171e;
import com.google.android.gms.games.C5375d;
import com.google.android.gms.games.C5384f;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.nearby.connection.C8761b;
/* renamed from: com.google.android.gms.games.internal.i */
/* loaded from: classes2.dex */
public interface AbstractC5907i extends IInterface {

    /* renamed from: com.google.android.gms.games.internal.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5908a extends Binder implements AbstractC5907i {

        /* renamed from: com.google.android.gms.games.internal.i$a$a */
        /* loaded from: classes2.dex */
        private static class C5909a implements AbstractC5907i {

            /* renamed from: a */
            private IBinder f20060a;

            C5909a(IBinder iBinder) {
                this.f20060a = iBinder;
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: A */
            public void mo19935A(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5035, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: B */
            public void mo19934B(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5039, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: C */
            public void mo19933C(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(8001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: D */
            public void mo19932D(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5375d.f19453c, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: E */
            public void mo19931E(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5375d.f19454d, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: F */
            public void mo19930F(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5375d.f19456f, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: G */
            public void mo19929G(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: H */
            public void mo19928H(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: I */
            public void mo19927I(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: J */
            public void mo19926J(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: K */
            public void mo19925K(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: L */
            public void mo19924L(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: M */
            public void mo19923M(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: N */
            public void mo19922N(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: O */
            public void mo19921O(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(13001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: P */
            public void mo19920P(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(15001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: Q */
            public void mo19919Q(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(17001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: R */
            public void mo19918R(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(19006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: S */
            public void mo19917S(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: T */
            public void mo19916T(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: U */
            public void mo19915U(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: V */
            public void mo19914V(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: W */
            public void mo19913W(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: X */
            public void mo19912X(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: Y */
            public void mo19911Y(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: Z */
            public void mo19910Z(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19909a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.f20060a.transact(5016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19908a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(5036, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19907a(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f20060a.transact(5033, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19906a(int i, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19905a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(8002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19904a(int i, VideoCapabilities videoCapabilities) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (videoCapabilities != null) {
                        obtain.writeInt(1);
                        videoCapabilities.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(19001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19903a(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f20060a.transact(C5171e.f18824f, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19902a(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f20060a.transact(20010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19901a(int i, String str, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f20060a.transact(5034, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19900a(int i, boolean z) {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f20060a.transact(19002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19899a(int i, boolean z, boolean z2) {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f20060a.transact(19003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19898a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19897a(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18825g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19896a(DataHolder dataHolder, DataHolder dataHolder2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder2 != null) {
                        obtain.writeInt(1);
                        dataHolder2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18828j, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19895a(DataHolder dataHolder, Contents contents) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19894a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents2 != null) {
                        obtain.writeInt(1);
                        contents2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents3 != null) {
                        obtain.writeInt(1);
                        contents3.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19893a(DataHolder dataHolder, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f20060a.transact(5026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19892a(RealTimeMessage realTimeMessage) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (realTimeMessage != null) {
                        obtain.writeInt(1);
                        realTimeMessage.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19891a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f20060a.transact(8010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: a */
            public void mo19890a(DataHolder[] dataHolderArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeTypedArray(dataHolderArr, 0);
                    this.f20060a.transact(14001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: aa */
            public void mo19889aa(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20060a;
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: b */
            public void mo19888b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(5040, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: b */
            public void mo19887b(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5375d.f19455e, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: b */
            public void mo19886b(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f20060a.transact(C5171e.f18826h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: b */
            public void mo19885b(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: b */
            public void mo19884b(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: b */
            public void mo19883b(DataHolder dataHolder, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f20060a.transact(5027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: b */
            public void mo19882b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f20060a.transact(C5375d.f19452b, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: c */
            public void mo19881c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(13002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: c */
            public void mo19880c(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(11001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: c */
            public void mo19879c(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f20060a.transact(8007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: c */
            public void mo19878c(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: c */
            public void mo19877c(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18827i, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: c */
            public void mo19876c(DataHolder dataHolder, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f20060a.transact(5028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: c */
            public void mo19875c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f20060a.transact(8009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: d */
            public void mo19874d(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(17002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: d */
            public void mo19873d(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: d */
            public void mo19872d(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f20060a.transact(C5171e.f18815M, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: d */
            public void mo19871d(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: d */
            public void mo19870d(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18803A, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: d */
            public void mo19869d(DataHolder dataHolder, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f20060a.transact(5029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: d */
            public void mo19868d(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f20060a.transact(C5384f.f19471B, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: e */
            public void mo19867e(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(19004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: e */
            public void mo19866e(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(12015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: e */
            public void mo19865e(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f20060a.transact(12012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: e */
            public void mo19864e(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18804B, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: e */
            public void mo19863e(DataHolder dataHolder, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f20060a.transact(5030, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: e */
            public void mo19862e(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f20060a.transact(C5384f.f19472C, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: f */
            public void mo19861f(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(19008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: f */
            public void mo19860f(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(19007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: f */
            public void mo19859f(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f20060a.transact(20011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: f */
            public void mo19858f(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18805C, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: f */
            public void mo19857f(DataHolder dataHolder, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f20060a.transact(5031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: g */
            public void mo19856g(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(19009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: g */
            public void mo19855g(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(20020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: g */
            public void mo19854g(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18806D, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: h */
            public void mo19853h(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(19010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: h */
            public void mo19852h(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18807E, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: i */
            public void mo19851i(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(20016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: i */
            public void mo19850i(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18808F, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: j */
            public void mo19849j(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(20018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: j */
            public void mo19848j(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(9001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: k */
            public void mo19847k(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f20060a.transact(20019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: k */
            public void mo19846k(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: l */
            public void mo19845l(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5037, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: m */
            public void mo19844m(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(10001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: n */
            public void mo19843n(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(8003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: o */
            public void mo19842o(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C8761b.f28058g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: p */
            public void mo19841p(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C8761b.f28059h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: q */
            public void mo19840q(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(8006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: r */
            public void mo19839r(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(8008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: s */
            public void mo19838s(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18813K, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: t */
            public void mo19837t(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18814L, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: u */
            public void mo19836u(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18816N, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: v */
            public void mo19835v(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18817O, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: w */
            public void mo19834w(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(C5171e.f18818P, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: x */
            public void mo19833x(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: y */
            public void mo19832y(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.games.internal.AbstractC5907i
            /* renamed from: z */
            public void mo19831z(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20060a.transact(5038, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC5908a() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
        }

        /* renamed from: a */
        public static AbstractC5907i m19936a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5907i)) ? new C5909a(iBinder) : (AbstractC5907i) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            Contents contents = null;
            switch (i) {
                case C5171e.f18824f /* 5001 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18825g /* 5002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18826h /* 5003 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    b(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18827i /* 5004 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    c(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18828j /* 5005 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18803A /* 5006 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    d(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18804B /* 5007 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    e(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18805C /* 5008 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    f(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18806D /* 5009 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    g(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18807E /* 5010 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    h(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18808F /* 5011 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    i(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 5017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    k(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18813K /* 5018 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    s(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18814L /* 5019 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    t(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18815M /* 5020 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    d(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18816N /* 5021 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    u(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18817O /* 5022 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    v(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5171e.f18818P /* 5023 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    w(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5024:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    x(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5025:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    y(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5026:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 5027:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    b(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 5028:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    c(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 5029:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    d(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 5030:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    e(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 5031:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    f(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 5032:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt() != 0 ? RealTimeMessage.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5033:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5034:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readInt, readString, z);
                    parcel2.writeNoException();
                    return true;
                case 5035:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    A(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5036:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5037:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    l(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5038:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    z(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5039:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    B(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5040:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19471B /* 6001 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    d(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5384f.f19472C /* 6002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    e(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    C(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    n(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C8761b.f28058g /* 8004 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    o(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C8761b.f28059h /* 8005 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    p(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    q(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    c(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    r(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    c(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    j(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    m(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19452b /* 10002 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    b(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19453c /* 10003 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    D(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19454d /* 10004 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    E(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19455e /* 10005 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case C5375d.f19456f /* 10006 */:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    F(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 11001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    c(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    G(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    d(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Contents.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12005:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    H(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    I(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    J(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    M(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12011:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    b(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12012:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    e(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    N(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12014:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    K(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12015:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    e(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    L(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    DataHolder createFromParcel = parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null;
                    String readString2 = parcel.readString();
                    Contents createFromParcel2 = parcel.readInt() != 0 ? Contents.CREATOR.createFromParcel(parcel) : null;
                    Contents createFromParcel3 = parcel.readInt() != 0 ? Contents.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        contents = Contents.CREATOR.createFromParcel(parcel);
                    }
                    a(createFromParcel, readString2, createFromParcel2, createFromParcel3, contents);
                    parcel2.writeNoException();
                    return true;
                case 13001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    O(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    c(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 14001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a((DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    P(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    Q(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    d(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? VideoCapabilities.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 19002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readInt2, z);
                    parcel2.writeNoException();
                    return true;
                case 19003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    int readInt3 = parcel.readInt();
                    boolean z2 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(readInt3, z2, z);
                    parcel2.writeNoException();
                    return true;
                case 19004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    e(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    R(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 19007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    f(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 19008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    f(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    g(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    h(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20001:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    S(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20002:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    T(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20003:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    U(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20004:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    V(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20005:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    W(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20006:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    X(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20007:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    Y(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20008:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    Z(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20009:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    aa(parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20010:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 20011:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    f(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 20012:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20013:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    b(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20014:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    c(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20015:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    d(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20016:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    i(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20017:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    a(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20018:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    j(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20019:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    k(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20020:
                    parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    g(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: A */
    void mo19935A(DataHolder dataHolder);

    /* renamed from: B */
    void mo19934B(DataHolder dataHolder);

    /* renamed from: C */
    void mo19933C(DataHolder dataHolder);

    /* renamed from: D */
    void mo19932D(DataHolder dataHolder);

    /* renamed from: E */
    void mo19931E(DataHolder dataHolder);

    /* renamed from: F */
    void mo19930F(DataHolder dataHolder);

    /* renamed from: G */
    void mo19929G(DataHolder dataHolder);

    /* renamed from: H */
    void mo19928H(DataHolder dataHolder);

    /* renamed from: I */
    void mo19927I(DataHolder dataHolder);

    /* renamed from: J */
    void mo19926J(DataHolder dataHolder);

    /* renamed from: K */
    void mo19925K(DataHolder dataHolder);

    /* renamed from: L */
    void mo19924L(DataHolder dataHolder);

    /* renamed from: M */
    void mo19923M(DataHolder dataHolder);

    /* renamed from: N */
    void mo19922N(DataHolder dataHolder);

    /* renamed from: O */
    void mo19921O(DataHolder dataHolder);

    /* renamed from: P */
    void mo19920P(DataHolder dataHolder);

    /* renamed from: Q */
    void mo19919Q(DataHolder dataHolder);

    /* renamed from: R */
    void mo19918R(DataHolder dataHolder);

    /* renamed from: S */
    void mo19917S(DataHolder dataHolder);

    /* renamed from: T */
    void mo19916T(DataHolder dataHolder);

    /* renamed from: U */
    void mo19915U(DataHolder dataHolder);

    /* renamed from: V */
    void mo19914V(DataHolder dataHolder);

    /* renamed from: W */
    void mo19913W(DataHolder dataHolder);

    /* renamed from: X */
    void mo19912X(DataHolder dataHolder);

    /* renamed from: Y */
    void mo19911Y(DataHolder dataHolder);

    /* renamed from: Z */
    void mo19910Z(DataHolder dataHolder);

    /* renamed from: a */
    void mo19909a();

    /* renamed from: a */
    void mo19908a(int i);

    /* renamed from: a */
    void mo19907a(int i, int i2, String str);

    /* renamed from: a */
    void mo19906a(int i, Uri uri);

    /* renamed from: a */
    void mo19905a(int i, Bundle bundle);

    /* renamed from: a */
    void mo19904a(int i, VideoCapabilities videoCapabilities);

    /* renamed from: a */
    void mo19903a(int i, String str);

    /* renamed from: a */
    void mo19902a(int i, String str, String str2);

    /* renamed from: a */
    void mo19901a(int i, String str, boolean z);

    /* renamed from: a */
    void mo19900a(int i, boolean z);

    /* renamed from: a */
    void mo19899a(int i, boolean z, boolean z2);

    /* renamed from: a */
    void mo19898a(Status status);

    /* renamed from: a */
    void mo19897a(DataHolder dataHolder);

    /* renamed from: a */
    void mo19896a(DataHolder dataHolder, DataHolder dataHolder2);

    /* renamed from: a */
    void mo19895a(DataHolder dataHolder, Contents contents);

    /* renamed from: a */
    void mo19894a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3);

    /* renamed from: a */
    void mo19893a(DataHolder dataHolder, String[] strArr);

    /* renamed from: a */
    void mo19892a(RealTimeMessage realTimeMessage);

    /* renamed from: a */
    void mo19891a(String str);

    /* renamed from: a */
    void mo19890a(DataHolder[] dataHolderArr);

    /* renamed from: aa */
    void mo19889aa(DataHolder dataHolder);

    /* renamed from: b */
    void mo19888b(int i);

    /* renamed from: b */
    void mo19887b(int i, Bundle bundle);

    /* renamed from: b */
    void mo19886b(int i, String str);

    /* renamed from: b */
    void mo19885b(Status status);

    /* renamed from: b */
    void mo19884b(DataHolder dataHolder);

    /* renamed from: b */
    void mo19883b(DataHolder dataHolder, String[] strArr);

    /* renamed from: b */
    void mo19882b(String str);

    /* renamed from: c */
    void mo19881c(int i);

    /* renamed from: c */
    void mo19880c(int i, Bundle bundle);

    /* renamed from: c */
    void mo19879c(int i, String str);

    /* renamed from: c */
    void mo19878c(Status status);

    /* renamed from: c */
    void mo19877c(DataHolder dataHolder);

    /* renamed from: c */
    void mo19876c(DataHolder dataHolder, String[] strArr);

    /* renamed from: c */
    void mo19875c(String str);

    /* renamed from: d */
    void mo19874d(int i);

    /* renamed from: d */
    void mo19873d(int i, Bundle bundle);

    /* renamed from: d */
    void mo19872d(int i, String str);

    /* renamed from: d */
    void mo19871d(Status status);

    /* renamed from: d */
    void mo19870d(DataHolder dataHolder);

    /* renamed from: d */
    void mo19869d(DataHolder dataHolder, String[] strArr);

    /* renamed from: d */
    void mo19868d(String str);

    /* renamed from: e */
    void mo19867e(int i);

    /* renamed from: e */
    void mo19866e(int i, Bundle bundle);

    /* renamed from: e */
    void mo19865e(int i, String str);

    /* renamed from: e */
    void mo19864e(DataHolder dataHolder);

    /* renamed from: e */
    void mo19863e(DataHolder dataHolder, String[] strArr);

    /* renamed from: e */
    void mo19862e(String str);

    /* renamed from: f */
    void mo19861f(int i);

    /* renamed from: f */
    void mo19860f(int i, Bundle bundle);

    /* renamed from: f */
    void mo19859f(int i, String str);

    /* renamed from: f */
    void mo19858f(DataHolder dataHolder);

    /* renamed from: f */
    void mo19857f(DataHolder dataHolder, String[] strArr);

    /* renamed from: g */
    void mo19856g(int i);

    /* renamed from: g */
    void mo19855g(int i, Bundle bundle);

    /* renamed from: g */
    void mo19854g(DataHolder dataHolder);

    /* renamed from: h */
    void mo19853h(int i);

    /* renamed from: h */
    void mo19852h(DataHolder dataHolder);

    /* renamed from: i */
    void mo19851i(int i);

    /* renamed from: i */
    void mo19850i(DataHolder dataHolder);

    /* renamed from: j */
    void mo19849j(int i);

    /* renamed from: j */
    void mo19848j(DataHolder dataHolder);

    /* renamed from: k */
    void mo19847k(int i);

    /* renamed from: k */
    void mo19846k(DataHolder dataHolder);

    /* renamed from: l */
    void mo19845l(DataHolder dataHolder);

    /* renamed from: m */
    void mo19844m(DataHolder dataHolder);

    /* renamed from: n */
    void mo19843n(DataHolder dataHolder);

    /* renamed from: o */
    void mo19842o(DataHolder dataHolder);

    /* renamed from: p */
    void mo19841p(DataHolder dataHolder);

    /* renamed from: q */
    void mo19840q(DataHolder dataHolder);

    /* renamed from: r */
    void mo19839r(DataHolder dataHolder);

    /* renamed from: s */
    void mo19838s(DataHolder dataHolder);

    /* renamed from: t */
    void mo19837t(DataHolder dataHolder);

    /* renamed from: u */
    void mo19836u(DataHolder dataHolder);

    /* renamed from: v */
    void mo19835v(DataHolder dataHolder);

    /* renamed from: w */
    void mo19834w(DataHolder dataHolder);

    /* renamed from: x */
    void mo19833x(DataHolder dataHolder);

    /* renamed from: y */
    void mo19832y(DataHolder dataHolder);

    /* renamed from: z */
    void mo19831z(DataHolder dataHolder);
}
