package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
/* renamed from: com.google.android.gms.nearby.messages.internal.j */
/* loaded from: classes2.dex */
public interface AbstractC8850j extends IInterface {

    /* renamed from: com.google.android.gms.nearby.messages.internal.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8851a extends Binder implements AbstractC8850j {

        /* renamed from: com.google.android.gms.nearby.messages.internal.j$a$a */
        /* loaded from: classes2.dex */
        private static class C8852a implements AbstractC8850j {

            /* renamed from: a */
            private IBinder f28332a;

            C8852a(IBinder iBinder) {
                this.f28332a = iBinder;
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8850j
            /* renamed from: a */
            public void mo9825a(MessageWrapper messageWrapper) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if (messageWrapper != null) {
                        obtain.writeInt(1);
                        messageWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28332a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8850j
            /* renamed from: a */
            public void mo9824a(List<Update> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    obtain.writeTypedList(list);
                    this.f28332a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28332a;
            }

            @Override // com.google.android.gms.nearby.messages.internal.AbstractC8850j
            /* renamed from: b */
            public void mo9823b(MessageWrapper messageWrapper) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if (messageWrapper != null) {
                        obtain.writeInt(1);
                        messageWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28332a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8851a() {
            attachInterface(this, "com.google.android.gms.nearby.messages.internal.IMessageListener");
        }

        /* renamed from: a */
        public static AbstractC8850j m9864a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8850j)) ? new C8852a(iBinder) : (AbstractC8850j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            MessageWrapper messageWrapper = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if (parcel.readInt() != 0) {
                        messageWrapper = (MessageWrapper) MessageWrapper.CREATOR.createFromParcel(parcel);
                    }
                    a(messageWrapper);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if (parcel.readInt() != 0) {
                        messageWrapper = (MessageWrapper) MessageWrapper.CREATOR.createFromParcel(parcel);
                    }
                    b(messageWrapper);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    a(parcel.createTypedArrayList(Update.CREATOR));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo9825a(MessageWrapper messageWrapper);

    /* renamed from: a */
    void mo9824a(List<Update> list);

    /* renamed from: b */
    void mo9823b(MessageWrapper messageWrapper);
}
