package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInStatusResponse> CREATOR = new C9604n();

    /* renamed from: a */
    public final int f29944a;

    /* renamed from: b */
    public final int f29945b;

    /* renamed from: c */
    public final boolean f29946c;

    /* renamed from: d */
    public final boolean f29947d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetCloudSyncOptInStatusResponse(int i, int i2, boolean z, boolean z2) {
        this.f29944a = i;
        this.f29945b = i2;
        this.f29946c = z;
        this.f29947d = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9604n.m7758a(this, parcel, i);
    }
}
