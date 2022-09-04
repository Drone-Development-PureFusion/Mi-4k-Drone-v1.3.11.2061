package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.AbstractC8850j;
import com.google.android.gms.nearby.messages.internal.AbstractC8853k;
import com.google.android.gms.nearby.messages.internal.AbstractC8865o;
/* loaded from: classes.dex */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new C8900y();

    /* renamed from: a */
    final int f28294a;

    /* renamed from: b */
    public final AbstractC8850j f28295b;

    /* renamed from: c */
    public final Strategy f28296c;

    /* renamed from: d */
    public final AbstractC8853k f28297d;

    /* renamed from: e */
    public final MessageFilter f28298e;

    /* renamed from: f */
    public final PendingIntent f28299f;

    /* renamed from: g */
    public final int f28300g;
    @Deprecated

    /* renamed from: h */
    public final String f28301h;
    @Deprecated

    /* renamed from: i */
    public final String f28302i;

    /* renamed from: j */
    public final byte[] f28303j;
    @Deprecated

    /* renamed from: k */
    public final boolean f28304k;

    /* renamed from: l */
    public final AbstractC8865o f28305l;
    @Deprecated

    /* renamed from: m */
    public final boolean f28306m;
    @Deprecated

    /* renamed from: n */
    public final ClientAppContext f28307n;

    /* renamed from: o */
    public final boolean f28308o;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3) {
        this.f28294a = i;
        this.f28295b = AbstractC8850j.AbstractBinderC8851a.m9864a(iBinder);
        this.f28296c = strategy;
        this.f28297d = AbstractC8853k.AbstractBinderC8854a.m9863a(iBinder2);
        this.f28298e = messageFilter;
        this.f28299f = pendingIntent;
        this.f28300g = i2;
        this.f28301h = str;
        this.f28302i = str2;
        this.f28303j = bArr;
        this.f28304k = z;
        this.f28305l = iBinder3 == null ? null : AbstractC8865o.AbstractBinderC8866a.m9851a(iBinder3);
        this.f28306m = z2;
        this.f28307n = ClientAppContext.m9919a(clientAppContext, str2, str, z2);
        this.f28308o = z3;
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i, byte[] bArr, IBinder iBinder3, boolean z) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i, null, null, bArr, false, iBinder3, false, null, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m9907a() {
        if (this.f28297d == null) {
            return null;
        }
        return this.f28297d.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m9906b() {
        if (this.f28295b == null) {
            return null;
        }
        return this.f28295b.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public IBinder m9905c() {
        if (this.f28305l == null) {
            return null;
        }
        return this.f28305l.asBinder();
    }

    public String toString() {
        String sb;
        String valueOf = String.valueOf(this.f28295b);
        String valueOf2 = String.valueOf(this.f28296c);
        String valueOf3 = String.valueOf(this.f28297d);
        String valueOf4 = String.valueOf(this.f28298e);
        String valueOf5 = String.valueOf(this.f28299f);
        int i = this.f28300g;
        if (this.f28303j == null) {
            sb = null;
        } else {
            sb = new StringBuilder(19).append("<").append(this.f28303j.length).append(" bytes>").toString();
        }
        String valueOf6 = String.valueOf(this.f28305l);
        boolean z = this.f28306m;
        String valueOf7 = String.valueOf(this.f28307n);
        boolean z2 = this.f28308o;
        String str = this.f28301h;
        String str2 = this.f28302i;
        return new StringBuilder(String.valueOf(valueOf).length() + 295 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(sb).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(str).length() + String.valueOf(str2).length()).append("SubscribeRequest{messageListener=").append(valueOf).append(", strategy=").append(valueOf2).append(", callback=").append(valueOf3).append(", filter=").append(valueOf4).append(", pendingIntent=").append(valueOf5).append(", messageListenerKey=").append(i).append(", hint=").append(sb).append(", subscribeCallback=").append(valueOf6).append(", useRealClientApiKey=").append(z).append(", clientAppContext=").append(valueOf7).append(", isDiscardPendingIntent=").append(z2).append(", zeroPartyPackageName=").append(str).append(", realClientPackageName=").append(str2).append(", isIgnoreNearbyPermission=").append(this.f28304k).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8900y.m9772a(this, parcel, i);
    }
}
