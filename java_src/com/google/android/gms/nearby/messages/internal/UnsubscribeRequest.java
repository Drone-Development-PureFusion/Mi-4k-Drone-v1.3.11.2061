package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.AbstractC8850j;
import com.google.android.gms.nearby.messages.internal.AbstractC8853k;
/* loaded from: classes.dex */
public final class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnsubscribeRequest> CREATOR = new C8841aa();

    /* renamed from: a */
    final int f28316a;

    /* renamed from: b */
    public final AbstractC8850j f28317b;

    /* renamed from: c */
    public final AbstractC8853k f28318c;

    /* renamed from: d */
    public final PendingIntent f28319d;

    /* renamed from: e */
    public final int f28320e;
    @Deprecated

    /* renamed from: f */
    public final String f28321f;
    @Deprecated

    /* renamed from: g */
    public final String f28322g;
    @Deprecated

    /* renamed from: h */
    public final boolean f28323h;
    @Deprecated

    /* renamed from: i */
    public final ClientAppContext f28324i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnsubscribeRequest(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        this.f28316a = i;
        this.f28317b = AbstractC8850j.AbstractBinderC8851a.m9864a(iBinder);
        this.f28318c = AbstractC8853k.AbstractBinderC8854a.m9863a(iBinder2);
        this.f28319d = pendingIntent;
        this.f28320e = i2;
        this.f28321f = str;
        this.f28322g = str2;
        this.f28323h = z;
        this.f28324i = ClientAppContext.m9919a(clientAppContext, str2, str, z);
    }

    @VisibleForTesting
    public UnsubscribeRequest(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i) {
        this(1, iBinder, iBinder2, pendingIntent, i, null, null, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m9903a() {
        return this.f28318c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m9902b() {
        if (this.f28317b == null) {
            return null;
        }
        return this.f28317b.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8841aa.m9894a(this, parcel, i);
    }
}
