package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class GetAllCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAllCapabilitiesResponse> CREATOR = new C9599i();

    /* renamed from: a */
    public final int f29929a;

    /* renamed from: b */
    public final int f29930b;

    /* renamed from: c */
    public final List<CapabilityInfoParcelable> f29931c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetAllCapabilitiesResponse(int i, int i2, List<CapabilityInfoParcelable> list) {
        this.f29929a = i;
        this.f29930b = i2;
        this.f29931c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9599i.m7773a(this, parcel, i);
    }
}
