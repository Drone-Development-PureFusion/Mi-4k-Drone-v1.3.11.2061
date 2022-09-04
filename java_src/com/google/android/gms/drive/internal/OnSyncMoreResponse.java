package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class OnSyncMoreResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnSyncMoreResponse> CREATOR = new C4853ai();

    /* renamed from: a */
    final int f17787a;

    /* renamed from: b */
    final boolean f17788b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnSyncMoreResponse(int i, boolean z) {
        this.f17787a = i;
        this.f17788b = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4853ai.m22571a(this, parcel, i);
    }
}
