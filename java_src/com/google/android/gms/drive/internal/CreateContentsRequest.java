package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class CreateContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateContentsRequest> CREATOR = new C4886bj();

    /* renamed from: a */
    final int f17684a;

    /* renamed from: b */
    final int f17685b;

    public CreateContentsRequest(int i) {
        this(1, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreateContentsRequest(int i, int i2) {
        this.f17684a = i;
        C4588d.m23618b(i2 == 536870912 || i2 == 805306368, "Cannot create a new read-only contents!");
        this.f17685b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4886bj.m22493a(this, parcel, i);
    }
}
