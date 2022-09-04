package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ChannelSendFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelSendFileResponse> CREATOR = new C9573bk();

    /* renamed from: a */
    public final int f29915a;

    /* renamed from: b */
    public final int f29916b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelSendFileResponse(int i, int i2) {
        this.f29915a = i;
        this.f29916b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9573bk.m7847a(this, parcel, i);
    }
}
