package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.realtime.internal.AbstractC5054c;
import com.google.android.gms.drive.realtime.internal.AbstractC5057d;
import com.google.android.gms.drive.realtime.internal.AbstractC5060e;
import com.google.android.gms.drive.realtime.internal.AbstractC5074f;
import com.google.android.gms.drive.realtime.internal.AbstractC5077g;
import com.google.android.gms.drive.realtime.internal.AbstractC5080h;
import com.google.android.gms.drive.realtime.internal.AbstractC5083i;
import com.google.android.gms.drive.realtime.internal.AbstractC5086j;
import com.google.android.gms.drive.realtime.internal.AbstractC5089k;
import com.google.android.gms.drive.realtime.internal.AbstractC5092l;
import com.google.android.gms.drive.realtime.internal.AbstractC5098n;
import com.google.android.gms.drive.realtime.internal.AbstractC5101o;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
/* renamed from: com.google.android.gms.drive.realtime.internal.m */
/* loaded from: classes2.dex */
public interface AbstractC5095m extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.m$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5096a extends Binder implements AbstractC5095m {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.drive.realtime.internal.m$a$a */
        /* loaded from: classes2.dex */
        public static class C5097a implements AbstractC5095m {

            /* renamed from: a */
            private IBinder f18198a;

            C5097a(IBinder iBinder) {
                this.f18198a = iBinder;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public ParcelableEventList mo21840a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f18198a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? ParcelableEventList.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21875a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    this.f18198a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21874a(int i, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21873a(int i, AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21872a(DriveId driveId, AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (driveId != null) {
                        obtain.writeInt(1);
                        driveId.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21871a(BeginCompoundOperationRequest beginCompoundOperationRequest, AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (beginCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        beginCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21870a(EndCompoundOperationRequest endCompoundOperationRequest, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21869a(EndCompoundOperationRequest endCompoundOperationRequest, AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21868a(ParcelableIndexReference parcelableIndexReference, AbstractC5098n abstractC5098n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcelableIndexReference != null) {
                        obtain.writeInt(1);
                        parcelableIndexReference.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5098n != null ? abstractC5098n.asBinder() : null);
                    this.f18198a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21867a(AbstractC5054c abstractC5054c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5054c != null ? abstractC5054c.asBinder() : null);
                    this.f18198a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21866a(AbstractC5057d abstractC5057d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5057d != null ? abstractC5057d.asBinder() : null);
                    this.f18198a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21865a(AbstractC5060e abstractC5060e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5060e != null ? abstractC5060e.asBinder() : null);
                    this.f18198a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21864a(AbstractC5080h abstractC5080h) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5080h != null ? abstractC5080h.asBinder() : null);
                    this.f18198a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21863a(AbstractC5083i abstractC5083i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5083i != null ? abstractC5083i.asBinder() : null);
                    this.f18198a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21862a(AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21861a(AbstractC5092l abstractC5092l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5092l != null ? abstractC5092l.asBinder() : null);
                    this.f18198a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21860a(AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21859a(String str, int i, int i2, AbstractC5077g abstractC5077g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(abstractC5077g != null ? abstractC5077g.asBinder() : null);
                    this.f18198a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21858a(String str, int i, int i2, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21857a(String str, int i, DataHolder dataHolder, AbstractC5077g abstractC5077g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5077g != null ? abstractC5077g.asBinder() : null);
                    this.f18198a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21856a(String str, int i, DataHolder dataHolder, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21855a(String str, int i, AbstractC5098n abstractC5098n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(abstractC5098n != null ? abstractC5098n.asBinder() : null);
                    this.f18198a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21854a(String str, int i, AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21853a(String str, int i, String str2, int i2, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21852a(String str, int i, String str2, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21851a(String str, DataHolder dataHolder, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21850a(String str, AbstractC5074f abstractC5074f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5074f != null ? abstractC5074f.asBinder() : null);
                    this.f18198a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21849a(String str, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21848a(String str, AbstractC5089k abstractC5089k) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5089k != null ? abstractC5089k.asBinder() : null);
                    this.f18198a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21847a(String str, AbstractC5092l abstractC5092l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5092l != null ? abstractC5092l.asBinder() : null);
                    this.f18198a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21846a(String str, AbstractC5098n abstractC5098n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5098n != null ? abstractC5098n.asBinder() : null);
                    this.f18198a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21845a(String str, AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21844a(String str, String str2, DataHolder dataHolder, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21843a(String str, String str2, AbstractC5074f abstractC5074f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC5074f != null ? abstractC5074f.asBinder() : null);
                    this.f18198a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21842a(String str, String str2, AbstractC5077g abstractC5077g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC5077g != null ? abstractC5077g.asBinder() : null);
                    this.f18198a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21841a(String str, String str2, AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: a */
            public void mo21839a(boolean z, AbstractC5101o abstractC5101o) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18198a;
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21838b(AbstractC5054c abstractC5054c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5054c != null ? abstractC5054c.asBinder() : null);
                    this.f18198a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21837b(AbstractC5086j abstractC5086j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5086j != null ? abstractC5086j.asBinder() : null);
                    this.f18198a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21836b(AbstractC5092l abstractC5092l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5092l != null ? abstractC5092l.asBinder() : null);
                    this.f18198a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21835b(AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21834b(String str, AbstractC5074f abstractC5074f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5074f != null ? abstractC5074f.asBinder() : null);
                    this.f18198a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21833b(String str, AbstractC5092l abstractC5092l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5092l != null ? abstractC5092l.asBinder() : null);
                    this.f18198a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21832b(String str, AbstractC5098n abstractC5098n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5098n != null ? abstractC5098n.asBinder() : null);
                    this.f18198a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21831b(String str, AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: b */
            public void mo21830b(String str, String str2, AbstractC5074f abstractC5074f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(abstractC5074f != null ? abstractC5074f.asBinder() : null);
                    this.f18198a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: c */
            public void mo21829c(AbstractC5054c abstractC5054c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5054c != null ? abstractC5054c.asBinder() : null);
                    this.f18198a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: c */
            public void mo21828c(AbstractC5101o abstractC5101o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5101o != null ? abstractC5101o.asBinder() : null);
                    this.f18198a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: c */
            public void mo21827c(String str, AbstractC5092l abstractC5092l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(abstractC5092l != null ? abstractC5092l.asBinder() : null);
                    this.f18198a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: d */
            public void mo21826d(AbstractC5054c abstractC5054c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5054c != null ? abstractC5054c.asBinder() : null);
                    this.f18198a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.drive.realtime.internal.AbstractC5095m
            /* renamed from: e */
            public void mo21825e(AbstractC5054c abstractC5054c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(abstractC5054c != null ? abstractC5054c.asBinder() : null);
                    this.f18198a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC5095m m21876a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC5095m)) ? new C5097a(iBinder) : (AbstractC5095m) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            EndCompoundOperationRequest endCompoundOperationRequest = null;
            DataHolder dataHolder = null;
            DataHolder dataHolder2 = null;
            DataHolder dataHolder3 = null;
            BeginCompoundOperationRequest beginCompoundOperationRequest = null;
            EndCompoundOperationRequest endCompoundOperationRequest2 = null;
            ParcelableIndexReference parcelableIndexReference = null;
            DataHolder dataHolder4 = null;
            DriveId driveId = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), AbstractC5098n.AbstractBinderC5099a.m21824a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5054c.AbstractBinderC5055a.m21937a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readString(), AbstractC5074f.AbstractBinderC5075a.m21895a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), AbstractC5092l.AbstractBinderC5093a.m21879a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, dataHolder, AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(parcel.readString(), AbstractC5092l.AbstractBinderC5093a.m21879a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(parcel.readString(), AbstractC5098n.AbstractBinderC5099a.m21824a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readInt(), parcel.readString(), AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readInt(), parcel.readInt(), AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readString(), AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(parcel.readString(), AbstractC5074f.AbstractBinderC5075a.m21895a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    c(parcel.readString(), AbstractC5092l.AbstractBinderC5093a.m21879a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        dataHolder2 = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(readString2, readInt, dataHolder2, AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    String readString3 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        dataHolder3 = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(readString3, readInt2, dataHolder3, AbstractC5077g.AbstractBinderC5078a.m21892a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readInt(), parcel.readInt(), AbstractC5077g.AbstractBinderC5078a.m21892a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        beginCompoundOperationRequest = BeginCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(beginCompoundOperationRequest, AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        endCompoundOperationRequest = EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(endCompoundOperationRequest, AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), AbstractC5074f.AbstractBinderC5075a.m21895a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readString(), AbstractC5077g.AbstractBinderC5078a.m21892a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    d(AbstractC5054c.AbstractBinderC5055a.m21937a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    e(AbstractC5054c.AbstractBinderC5055a.m21937a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        parcelableIndexReference = ParcelableIndexReference.CREATOR.createFromParcel(parcel);
                    }
                    a(parcelableIndexReference, AbstractC5098n.AbstractBinderC5099a.m21824a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), AbstractC5089k.AbstractBinderC5090a.m21882a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readInt(), AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(AbstractC5092l.AbstractBinderC5093a.m21879a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readInt(), AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5060e.AbstractBinderC5061a.m21931a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5057d.AbstractBinderC5058a.m21934a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(AbstractC5054c.AbstractBinderC5055a.m21937a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5083i.AbstractBinderC5084a.m21887a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5080h.AbstractBinderC5081a.m21889a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(parcel.readString(), AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(AbstractC5092l.AbstractBinderC5093a.m21879a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        endCompoundOperationRequest2 = EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(endCompoundOperationRequest2, AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    b(parcel.readString(), parcel.readString(), AbstractC5074f.AbstractBinderC5075a.m21895a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        dataHolder4 = DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(readString4, readString5, dataHolder4, AbstractC5086j.AbstractBinderC5087a.m21885a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    c(AbstractC5054c.AbstractBinderC5055a.m21937a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readString(), parcel.readInt(), AbstractC5098n.AbstractBinderC5099a.m21824a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readInt() != 0, AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 48:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        driveId = DriveId.CREATOR.createFromParcel(parcel);
                    }
                    a(driveId, AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    c(AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    a(parcel.readInt(), AbstractC5101o.AbstractBinderC5102a.m21821a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    ParcelableEventList a = a(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    ParcelableEventList mo21840a(String str, String str2, String str3);

    /* renamed from: a */
    void mo21875a();

    /* renamed from: a */
    void mo21874a(int i, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21873a(int i, AbstractC5101o abstractC5101o);

    /* renamed from: a */
    void mo21872a(DriveId driveId, AbstractC5101o abstractC5101o);

    /* renamed from: a */
    void mo21871a(BeginCompoundOperationRequest beginCompoundOperationRequest, AbstractC5101o abstractC5101o);

    /* renamed from: a */
    void mo21870a(EndCompoundOperationRequest endCompoundOperationRequest, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21869a(EndCompoundOperationRequest endCompoundOperationRequest, AbstractC5101o abstractC5101o);

    /* renamed from: a */
    void mo21868a(ParcelableIndexReference parcelableIndexReference, AbstractC5098n abstractC5098n);

    /* renamed from: a */
    void mo21867a(AbstractC5054c abstractC5054c);

    /* renamed from: a */
    void mo21866a(AbstractC5057d abstractC5057d);

    /* renamed from: a */
    void mo21865a(AbstractC5060e abstractC5060e);

    /* renamed from: a */
    void mo21864a(AbstractC5080h abstractC5080h);

    /* renamed from: a */
    void mo21863a(AbstractC5083i abstractC5083i);

    /* renamed from: a */
    void mo21862a(AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21861a(AbstractC5092l abstractC5092l);

    /* renamed from: a */
    void mo21860a(AbstractC5101o abstractC5101o);

    /* renamed from: a */
    void mo21859a(String str, int i, int i2, AbstractC5077g abstractC5077g);

    /* renamed from: a */
    void mo21858a(String str, int i, int i2, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21857a(String str, int i, DataHolder dataHolder, AbstractC5077g abstractC5077g);

    /* renamed from: a */
    void mo21856a(String str, int i, DataHolder dataHolder, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21855a(String str, int i, AbstractC5098n abstractC5098n);

    /* renamed from: a */
    void mo21854a(String str, int i, AbstractC5101o abstractC5101o);

    /* renamed from: a */
    void mo21853a(String str, int i, String str2, int i2, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21852a(String str, int i, String str2, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21851a(String str, DataHolder dataHolder, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21850a(String str, AbstractC5074f abstractC5074f);

    /* renamed from: a */
    void mo21849a(String str, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21848a(String str, AbstractC5089k abstractC5089k);

    /* renamed from: a */
    void mo21847a(String str, AbstractC5092l abstractC5092l);

    /* renamed from: a */
    void mo21846a(String str, AbstractC5098n abstractC5098n);

    /* renamed from: a */
    void mo21845a(String str, AbstractC5101o abstractC5101o);

    /* renamed from: a */
    void mo21844a(String str, String str2, DataHolder dataHolder, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21843a(String str, String str2, AbstractC5074f abstractC5074f);

    /* renamed from: a */
    void mo21842a(String str, String str2, AbstractC5077g abstractC5077g);

    /* renamed from: a */
    void mo21841a(String str, String str2, AbstractC5086j abstractC5086j);

    /* renamed from: a */
    void mo21839a(boolean z, AbstractC5101o abstractC5101o);

    /* renamed from: b */
    void mo21838b(AbstractC5054c abstractC5054c);

    /* renamed from: b */
    void mo21837b(AbstractC5086j abstractC5086j);

    /* renamed from: b */
    void mo21836b(AbstractC5092l abstractC5092l);

    /* renamed from: b */
    void mo21835b(AbstractC5101o abstractC5101o);

    /* renamed from: b */
    void mo21834b(String str, AbstractC5074f abstractC5074f);

    /* renamed from: b */
    void mo21833b(String str, AbstractC5092l abstractC5092l);

    /* renamed from: b */
    void mo21832b(String str, AbstractC5098n abstractC5098n);

    /* renamed from: b */
    void mo21831b(String str, AbstractC5101o abstractC5101o);

    /* renamed from: b */
    void mo21830b(String str, String str2, AbstractC5074f abstractC5074f);

    /* renamed from: c */
    void mo21829c(AbstractC5054c abstractC5054c);

    /* renamed from: c */
    void mo21828c(AbstractC5101o abstractC5101o);

    /* renamed from: c */
    void mo21827c(String str, AbstractC5092l abstractC5092l);

    /* renamed from: d */
    void mo21826d(AbstractC5054c abstractC5054c);

    /* renamed from: e */
    void mo21825e(AbstractC5054c abstractC5054c);
}
