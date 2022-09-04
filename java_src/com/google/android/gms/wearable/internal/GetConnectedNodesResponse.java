package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConnectedNodesResponse> CREATOR = new C9608r();

    /* renamed from: a */
    public final int f29957a;

    /* renamed from: b */
    public final int f29958b;

    /* renamed from: c */
    public final List<NodeParcelable> f29959c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetConnectedNodesResponse(int i, int i2, List<NodeParcelable> list) {
        this.f29957a = i;
        this.f29958b = i2;
        this.f29959c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9608r.m7746a(this, parcel, i);
    }
}
