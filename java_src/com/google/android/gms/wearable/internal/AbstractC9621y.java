package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AbstractC9612v;
import com.google.android.gms.wearable.internal.AbstractC9615w;
/* renamed from: com.google.android.gms.wearable.internal.y */
/* loaded from: classes2.dex */
public interface AbstractC9621y extends IInterface {

    /* renamed from: com.google.android.gms.wearable.internal.y$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9622a extends Binder implements AbstractC9621y {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.wearable.internal.y$a$a */
        /* loaded from: classes2.dex */
        public static class C9623a implements AbstractC9621y {

            /* renamed from: a */
            private IBinder f30146a;

            C9623a(IBinder iBinder) {
                this.f30146a = iBinder;
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7697a(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7696a(AbstractC9615w abstractC9615w, byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeByte(b);
                    this.f30146a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7695a(AbstractC9615w abstractC9615w, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeInt(i);
                    this.f30146a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7694a(AbstractC9615w abstractC9615w, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7693a(AbstractC9615w abstractC9615w, Uri uri, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f30146a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7692a(AbstractC9615w abstractC9615w, Asset asset) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (asset != null) {
                        obtain.writeInt(1);
                        asset.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7691a(AbstractC9615w abstractC9615w, ConnectionConfiguration connectionConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (connectionConfiguration != null) {
                        obtain.writeInt(1);
                        connectionConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7690a(AbstractC9615w abstractC9615w, PutDataRequest putDataRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (putDataRequest != null) {
                        obtain.writeInt(1);
                        putDataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7689a(AbstractC9615w abstractC9615w, AddListenerRequest addListenerRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (addListenerRequest != null) {
                        obtain.writeInt(1);
                        addListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7688a(AbstractC9615w abstractC9615w, AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (ancsNotificationParcelable != null) {
                        obtain.writeInt(1);
                        ancsNotificationParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7687a(AbstractC9615w abstractC9615w, RemoveListenerRequest removeListenerRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (removeListenerRequest != null) {
                        obtain.writeInt(1);
                        removeListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7686a(AbstractC9615w abstractC9615w, AbstractC9612v abstractC9612v, String str) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (abstractC9612v != null) {
                        iBinder = abstractC9612v.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f30146a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7685a(AbstractC9615w abstractC9615w, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    this.f30146a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7684a(AbstractC9615w abstractC9615w, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f30146a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7683a(AbstractC9615w abstractC9615w, String str, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7682a(AbstractC9615w abstractC9615w, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f30146a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7681a(AbstractC9615w abstractC9615w, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f30146a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7680a(AbstractC9615w abstractC9615w, String str, String str2, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    this.f30146a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: a */
            public void mo7679a(AbstractC9615w abstractC9615w, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f30146a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30146a;
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7678b(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7677b(AbstractC9615w abstractC9615w, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeInt(i);
                    this.f30146a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7676b(AbstractC9615w abstractC9615w, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7675b(AbstractC9615w abstractC9615w, Uri uri, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f30146a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7674b(AbstractC9615w abstractC9615w, ConnectionConfiguration connectionConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (connectionConfiguration != null) {
                        obtain.writeInt(1);
                        connectionConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7673b(AbstractC9615w abstractC9615w, AbstractC9612v abstractC9612v, String str) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (abstractC9612v != null) {
                        iBinder = abstractC9612v.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f30146a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7672b(AbstractC9615w abstractC9615w, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    this.f30146a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7671b(AbstractC9615w abstractC9615w, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f30146a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: b */
            public void mo7670b(AbstractC9615w abstractC9615w, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f30146a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: c */
            public void mo7669c(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: c */
            public void mo7668c(AbstractC9615w abstractC9615w, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeInt(i);
                    this.f30146a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: c */
            public void mo7667c(AbstractC9615w abstractC9615w, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30146a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: c */
            public void mo7666c(AbstractC9615w abstractC9615w, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    this.f30146a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: d */
            public void mo7665d(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: d */
            public void mo7664d(AbstractC9615w abstractC9615w, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    this.f30146a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: e */
            public void mo7663e(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: e */
            public void mo7662e(AbstractC9615w abstractC9615w, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    this.f30146a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: f */
            public void mo7661f(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: f */
            public void mo7660f(AbstractC9615w abstractC9615w, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    obtain.writeString(str);
                    this.f30146a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: g */
            public void mo7659g(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: h */
            public void mo7658h(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: i */
            public void mo7657i(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: j */
            public void mo7656j(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: k */
            public void mo7655k(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: l */
            public void mo7654l(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: m */
            public void mo7653m(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: n */
            public void mo7652n(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: o */
            public void mo7651o(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.wearable.internal.AbstractC9621y
            /* renamed from: p */
            public void mo7650p(AbstractC9615w abstractC9615w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(abstractC9615w != null ? abstractC9615w.asBinder() : null);
                    this.f30146a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC9621y m7698a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC9621y)) ? new C9623a(iBinder) : (AbstractC9621y) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            ConnectionConfiguration connectionConfiguration = null;
            ConnectionConfiguration connectionConfiguration2 = null;
            PutDataRequest putDataRequest = null;
            Uri uri = null;
            Uri uri2 = null;
            Uri uri3 = null;
            Uri uri4 = null;
            Uri uri5 = null;
            Asset asset = null;
            AddListenerRequest addListenerRequest = null;
            RemoveListenerRequest removeListenerRequest = null;
            AncsNotificationParcelable ancsNotificationParcelable = null;
            ParcelFileDescriptor parcelFileDescriptor = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        connectionConfiguration = ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                    }
                    b(m7734a, connectionConfiguration);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    n(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    o(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    p(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a2 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        putDataRequest = PutDataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a2, putDataRequest);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a3 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a3, uri);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a4 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    b(m7734a4, uri2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a5 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri4 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    c(m7734a5, uri4);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a6 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        asset = Asset.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a6, asset);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    c(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    d(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a7 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        addListenerRequest = AddListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a7, addListenerRequest);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a8 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        removeListenerRequest = RemoveListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a8, removeListenerRequest);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    e(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    f(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a9 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        connectionConfiguration2 = ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a9, connectionConfiguration2);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    c(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    g(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    h(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a10 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        ancsNotificationParcelable = AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a10, ancsNotificationParcelable);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    c(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    i(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    f(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), AbstractC9612v.AbstractBinderC9613a.m7736a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), AbstractC9612v.AbstractBinderC9613a.m7736a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    j(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a11 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a11, readString, parcelFileDescriptor);
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a12 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    a(m7734a12, uri3, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a13 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri5 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    b(m7734a13, uri5, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    d(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    e(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 48:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    k(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    AbstractC9615w m7734a14 = AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    b(m7734a14, z);
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    l(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    m(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(AbstractC9615w.AbstractBinderC9616a.m7734a(parcel.readStrongBinder()), parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wearable.internal.IWearableService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo7697a(AbstractC9615w abstractC9615w);

    /* renamed from: a */
    void mo7696a(AbstractC9615w abstractC9615w, byte b);

    /* renamed from: a */
    void mo7695a(AbstractC9615w abstractC9615w, int i);

    /* renamed from: a */
    void mo7694a(AbstractC9615w abstractC9615w, Uri uri);

    /* renamed from: a */
    void mo7693a(AbstractC9615w abstractC9615w, Uri uri, int i);

    /* renamed from: a */
    void mo7692a(AbstractC9615w abstractC9615w, Asset asset);

    /* renamed from: a */
    void mo7691a(AbstractC9615w abstractC9615w, ConnectionConfiguration connectionConfiguration);

    /* renamed from: a */
    void mo7690a(AbstractC9615w abstractC9615w, PutDataRequest putDataRequest);

    /* renamed from: a */
    void mo7689a(AbstractC9615w abstractC9615w, AddListenerRequest addListenerRequest);

    /* renamed from: a */
    void mo7688a(AbstractC9615w abstractC9615w, AncsNotificationParcelable ancsNotificationParcelable);

    /* renamed from: a */
    void mo7687a(AbstractC9615w abstractC9615w, RemoveListenerRequest removeListenerRequest);

    /* renamed from: a */
    void mo7686a(AbstractC9615w abstractC9615w, AbstractC9612v abstractC9612v, String str);

    /* renamed from: a */
    void mo7685a(AbstractC9615w abstractC9615w, String str);

    /* renamed from: a */
    void mo7684a(AbstractC9615w abstractC9615w, String str, int i);

    /* renamed from: a */
    void mo7683a(AbstractC9615w abstractC9615w, String str, ParcelFileDescriptor parcelFileDescriptor);

    /* renamed from: a */
    void mo7682a(AbstractC9615w abstractC9615w, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2);

    /* renamed from: a */
    void mo7681a(AbstractC9615w abstractC9615w, String str, String str2);

    /* renamed from: a */
    void mo7680a(AbstractC9615w abstractC9615w, String str, String str2, byte[] bArr);

    /* renamed from: a */
    void mo7679a(AbstractC9615w abstractC9615w, boolean z);

    /* renamed from: b */
    void mo7678b(AbstractC9615w abstractC9615w);

    /* renamed from: b */
    void mo7677b(AbstractC9615w abstractC9615w, int i);

    /* renamed from: b */
    void mo7676b(AbstractC9615w abstractC9615w, Uri uri);

    /* renamed from: b */
    void mo7675b(AbstractC9615w abstractC9615w, Uri uri, int i);

    /* renamed from: b */
    void mo7674b(AbstractC9615w abstractC9615w, ConnectionConfiguration connectionConfiguration);

    /* renamed from: b */
    void mo7673b(AbstractC9615w abstractC9615w, AbstractC9612v abstractC9612v, String str);

    /* renamed from: b */
    void mo7672b(AbstractC9615w abstractC9615w, String str);

    /* renamed from: b */
    void mo7671b(AbstractC9615w abstractC9615w, String str, int i);

    /* renamed from: b */
    void mo7670b(AbstractC9615w abstractC9615w, boolean z);

    /* renamed from: c */
    void mo7669c(AbstractC9615w abstractC9615w);

    /* renamed from: c */
    void mo7668c(AbstractC9615w abstractC9615w, int i);

    /* renamed from: c */
    void mo7667c(AbstractC9615w abstractC9615w, Uri uri);

    /* renamed from: c */
    void mo7666c(AbstractC9615w abstractC9615w, String str);

    /* renamed from: d */
    void mo7665d(AbstractC9615w abstractC9615w);

    /* renamed from: d */
    void mo7664d(AbstractC9615w abstractC9615w, String str);

    /* renamed from: e */
    void mo7663e(AbstractC9615w abstractC9615w);

    /* renamed from: e */
    void mo7662e(AbstractC9615w abstractC9615w, String str);

    /* renamed from: f */
    void mo7661f(AbstractC9615w abstractC9615w);

    /* renamed from: f */
    void mo7660f(AbstractC9615w abstractC9615w, String str);

    /* renamed from: g */
    void mo7659g(AbstractC9615w abstractC9615w);

    /* renamed from: h */
    void mo7658h(AbstractC9615w abstractC9615w);

    /* renamed from: i */
    void mo7657i(AbstractC9615w abstractC9615w);

    /* renamed from: j */
    void mo7656j(AbstractC9615w abstractC9615w);

    /* renamed from: k */
    void mo7655k(AbstractC9615w abstractC9615w);

    /* renamed from: l */
    void mo7654l(AbstractC9615w abstractC9615w);

    /* renamed from: m */
    void mo7653m(AbstractC9615w abstractC9615w);

    /* renamed from: n */
    void mo7652n(AbstractC9615w abstractC9615w);

    /* renamed from: o */
    void mo7651o(AbstractC9615w abstractC9615w);

    /* renamed from: p */
    void mo7650p(AbstractC9615w abstractC9615w);
}
