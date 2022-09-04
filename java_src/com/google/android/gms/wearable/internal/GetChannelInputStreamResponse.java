package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetChannelInputStreamResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetChannelInputStreamResponse> CREATOR = new C9601k();

    /* renamed from: a */
    public final int f29935a;

    /* renamed from: b */
    public final int f29936b;

    /* renamed from: c */
    public final ParcelFileDescriptor f29937c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetChannelInputStreamResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.f29935a = i;
        this.f29936b = i2;
        this.f29937c = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9601k.m7767a(this, parcel, i);
    }
}
