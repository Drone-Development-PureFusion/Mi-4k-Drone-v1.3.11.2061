package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
@Deprecated
/* loaded from: classes.dex */
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigResponse> CREATOR = new C9606p();

    /* renamed from: a */
    public final int f29951a;

    /* renamed from: b */
    public final int f29952b;

    /* renamed from: c */
    public final ConnectionConfiguration f29953c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetConfigResponse(int i, int i2, ConnectionConfiguration connectionConfiguration) {
        this.f29951a = i;
        this.f29952b = i2;
        this.f29953c = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9606p.m7752a(this, parcel, i);
    }
}
