package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class OnMetadataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnMetadataResponse> CREATOR = new C4848ad();

    /* renamed from: a */
    final int f17777a;

    /* renamed from: b */
    final MetadataBundle f17778b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnMetadataResponse(int i, MetadataBundle metadataBundle) {
        this.f17777a = i;
        this.f17778b = metadataBundle;
    }

    /* renamed from: a */
    public MetadataBundle m22605a() {
        return this.f17778b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4848ad.m22586a(this, parcel, i);
    }
}
