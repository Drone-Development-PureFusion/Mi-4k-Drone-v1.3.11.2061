package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
/* loaded from: classes2.dex */
public class OnContentsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnContentsResponse> CREATOR = new C4979u();

    /* renamed from: a */
    final int f17747a;

    /* renamed from: b */
    final Contents f17748b;

    /* renamed from: c */
    final boolean f17749c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnContentsResponse(int i, Contents contents, boolean z) {
        this.f17747a = i;
        this.f17748b = contents;
        this.f17749c = z;
    }

    /* renamed from: a */
    public Contents m22616a() {
        return this.f17748b;
    }

    /* renamed from: b */
    public boolean m22615b() {
        return this.f17749c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4979u.m22241a(this, parcel, i);
    }
}
