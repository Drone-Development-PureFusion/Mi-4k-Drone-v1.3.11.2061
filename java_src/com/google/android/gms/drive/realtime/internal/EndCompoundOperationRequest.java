package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class EndCompoundOperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EndCompoundOperationRequest> CREATOR = new C5053b();

    /* renamed from: a */
    final int f18113a;

    public EndCompoundOperationRequest() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndCompoundOperationRequest(int i) {
        this.f18113a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5053b.m21938a(this, parcel, i);
    }
}
