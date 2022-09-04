package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DeleteDataItemsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteDataItemsResponse> CREATOR = new C9598h();

    /* renamed from: a */
    public final int f29926a;

    /* renamed from: b */
    public final int f29927b;

    /* renamed from: c */
    public final int f29928c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeleteDataItemsResponse(int i, int i2, int i3) {
        this.f29926a = i;
        this.f29927b = i2;
        this.f29928c = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9598h.m7776a(this, parcel, i);
    }
}
