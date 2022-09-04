package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.AbstractC8853k;
import com.google.android.gms.nearby.messages.internal.AbstractC8862n;
/* loaded from: classes.dex */
public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterStatusCallbackRequest> CREATOR = new C8899x();

    /* renamed from: a */
    final int f28288a;

    /* renamed from: b */
    public final AbstractC8853k f28289b;

    /* renamed from: c */
    public final AbstractC8862n f28290c;

    /* renamed from: d */
    public boolean f28291d;
    @Deprecated

    /* renamed from: e */
    public String f28292e;
    @Deprecated

    /* renamed from: f */
    public final ClientAppContext f28293f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegisterStatusCallbackRequest(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        this.f28288a = i;
        this.f28289b = AbstractC8853k.AbstractBinderC8854a.m9863a(iBinder);
        this.f28290c = AbstractC8862n.AbstractBinderC8863a.m9852a(iBinder2);
        this.f28291d = z;
        this.f28292e = str;
        this.f28293f = ClientAppContext.m9919a(clientAppContext, null, str, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegisterStatusCallbackRequest(IBinder iBinder, IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m9909a() {
        return this.f28289b.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m9908b() {
        return this.f28290c.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8899x.m9775a(this, parcel, i);
    }
}
