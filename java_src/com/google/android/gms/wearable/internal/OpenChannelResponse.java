package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenChannelResponse> CREATOR = new C9494af();

    /* renamed from: a */
    public final int f29979a;

    /* renamed from: b */
    public final int f29980b;

    /* renamed from: c */
    public final ChannelImpl f29981c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenChannelResponse(int i, int i2, ChannelImpl channelImpl) {
        this.f29979a = i;
        this.f29980b = i2;
        this.f29981c = channelImpl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9494af.m8010a(this, parcel, i);
    }
}
