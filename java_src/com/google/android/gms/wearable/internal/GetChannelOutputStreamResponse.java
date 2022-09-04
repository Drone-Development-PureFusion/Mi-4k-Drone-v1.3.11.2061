package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetChannelOutputStreamResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetChannelOutputStreamResponse> CREATOR = new C9602l();

    /* renamed from: a */
    public final int f29938a;

    /* renamed from: b */
    public final int f29939b;

    /* renamed from: c */
    public final ParcelFileDescriptor f29940c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetChannelOutputStreamResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.f29938a = i;
        this.f29939b = i2;
        this.f29940c = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9602l.m7764a(this, parcel, i);
    }
}
