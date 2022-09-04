package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ChannelReceiveFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelReceiveFileResponse> CREATOR = new C9572bj();

    /* renamed from: a */
    public final int f29913a;

    /* renamed from: b */
    public final int f29914b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelReceiveFileResponse(int i, int i2) {
        this.f29913a = i;
        this.f29914b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9572bj.m7850a(this, parcel, i);
    }
}
