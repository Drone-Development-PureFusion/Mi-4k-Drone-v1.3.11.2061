package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class CloseChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloseChannelResponse> CREATOR = new C9576bn();

    /* renamed from: a */
    public final int f29917a;

    /* renamed from: b */
    public final int f29918b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CloseChannelResponse(int i, int i2) {
        this.f29917a = i;
        this.f29918b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9576bn.m7842a(this, parcel, i);
    }
}
