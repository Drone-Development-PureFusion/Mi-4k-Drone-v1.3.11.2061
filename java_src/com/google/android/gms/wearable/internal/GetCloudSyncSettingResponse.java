package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetCloudSyncSettingResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncSettingResponse> CREATOR = new C9605o();

    /* renamed from: a */
    public final int f29948a;

    /* renamed from: b */
    public final int f29949b;

    /* renamed from: c */
    public final boolean f29950c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetCloudSyncSettingResponse(int i, int i2, boolean z) {
        this.f29948a = i;
        this.f29949b = i2;
        this.f29950c = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9605o.m7755a(this, parcel, i);
    }
}
