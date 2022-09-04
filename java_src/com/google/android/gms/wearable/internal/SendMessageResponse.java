package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendMessageResponse> CREATOR = new C9499ak();

    /* renamed from: a */
    public final int f29993a;

    /* renamed from: b */
    public final int f29994b;

    /* renamed from: c */
    public final int f29995c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendMessageResponse(int i, int i2, int i3) {
        this.f29993a = i;
        this.f29994b = i2;
        this.f29995c = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9499ak.m7995a(this, parcel, i);
    }
}
