package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class OnLoadRealtimeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnLoadRealtimeResponse> CREATOR = new C4850af();

    /* renamed from: a */
    final int f17775a;

    /* renamed from: b */
    final boolean f17776b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnLoadRealtimeResponse(int i, boolean z) {
        this.f17775a = i;
        this.f17776b = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4850af.m22580a(this, parcel, i);
    }
}
