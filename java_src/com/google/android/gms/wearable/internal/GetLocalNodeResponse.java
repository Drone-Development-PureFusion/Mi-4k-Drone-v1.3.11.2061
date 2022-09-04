package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetLocalNodeResponse> CREATOR = new C9611u();

    /* renamed from: a */
    public final int f29966a;

    /* renamed from: b */
    public final int f29967b;

    /* renamed from: c */
    public final NodeParcelable f29968c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetLocalNodeResponse(int i, int i2, NodeParcelable nodeParcelable) {
        this.f29966a = i;
        this.f29967b = i2;
        this.f29968c = nodeParcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9611u.m7737a(this, parcel, i);
    }
}
