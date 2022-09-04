package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.AbstractC8853k;
/* loaded from: classes.dex */
public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnpublishRequest> CREATOR = new C8901z();

    /* renamed from: a */
    final int f28309a;

    /* renamed from: b */
    public final MessageWrapper f28310b;

    /* renamed from: c */
    public final AbstractC8853k f28311c;
    @Deprecated

    /* renamed from: d */
    public final String f28312d;
    @Deprecated

    /* renamed from: e */
    public final String f28313e;
    @Deprecated

    /* renamed from: f */
    public final boolean f28314f;
    @Deprecated

    /* renamed from: g */
    public final ClientAppContext f28315g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnpublishRequest(int i, MessageWrapper messageWrapper, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        this.f28309a = i;
        this.f28310b = messageWrapper;
        this.f28311c = AbstractC8853k.AbstractBinderC8854a.m9863a(iBinder);
        this.f28312d = str;
        this.f28313e = str2;
        this.f28314f = z;
        this.f28315g = ClientAppContext.m9919a(clientAppContext, str2, str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnpublishRequest(MessageWrapper messageWrapper, IBinder iBinder, ClientAppContext clientAppContext) {
        this(1, messageWrapper, iBinder, null, null, false, clientAppContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m9904a() {
        return this.f28311c.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8901z.m9769a(this, parcel, i);
    }
}
