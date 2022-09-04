package com.google.android.gms.iid;

import android.annotation.TargetApi;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.iid.AbstractC6097c;
/* loaded from: classes.dex */
public class MessengerCompat implements Parcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR = new Parcelable.Creator<MessengerCompat>() { // from class: com.google.android.gms.iid.MessengerCompat.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MessengerCompat createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new MessengerCompat(readStrongBinder);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MessengerCompat[] newArray(int i) {
            return new MessengerCompat[i];
        }
    };

    /* renamed from: a */
    Messenger f20611a;

    /* renamed from: b */
    AbstractC6097c f20612b;

    /* renamed from: com.google.android.gms.iid.MessengerCompat$a */
    /* loaded from: classes.dex */
    private final class BinderC6094a extends AbstractC6097c.AbstractBinderC6098a {

        /* renamed from: a */
        Handler f20613a;

        BinderC6094a(Handler handler) {
            this.f20613a = handler;
        }

        @Override // com.google.android.gms.iid.AbstractC6097c
        /* renamed from: a */
        public void mo18736a(Message message) {
            message.arg2 = Binder.getCallingUid();
            this.f20613a.dispatchMessage(message);
        }
    }

    public MessengerCompat(Handler handler) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f20611a = new Messenger(handler);
        } else {
            this.f20612b = new BinderC6094a(handler);
        }
    }

    public MessengerCompat(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f20611a = new Messenger(iBinder);
        } else {
            this.f20612b = AbstractC6097c.AbstractBinderC6098a.m18737a(iBinder);
        }
    }

    /* renamed from: a */
    public static int m18762a(Message message) {
        return Build.VERSION.SDK_INT >= 21 ? m18760c(message) : message.arg2;
    }

    @TargetApi(21)
    /* renamed from: c */
    private static int m18760c(Message message) {
        return message.sendingUid;
    }

    /* renamed from: a */
    public IBinder m18763a() {
        return this.f20611a != null ? this.f20611a.getBinder() : this.f20612b.asBinder();
    }

    /* renamed from: b */
    public void m18761b(Message message) {
        if (this.f20611a != null) {
            this.f20611a.send(message);
        } else {
            this.f20612b.mo18736a(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m18763a().equals(((MessengerCompat) obj).m18763a());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return m18763a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f20611a != null) {
            parcel.writeStrongBinder(this.f20611a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f20612b.asBinder());
        }
    }
}
