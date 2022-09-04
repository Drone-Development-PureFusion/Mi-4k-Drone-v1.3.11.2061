package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInOutDoneResponse> CREATOR = new C9603m();

    /* renamed from: a */
    public final int f29941a;

    /* renamed from: b */
    public final int f29942b;

    /* renamed from: c */
    public final boolean f29943c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetCloudSyncOptInOutDoneResponse(int i, int i2, boolean z) {
        this.f29941a = i;
        this.f29942b = i2;
        this.f29943c = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9603m.m7761a(this, parcel, i);
    }
}
