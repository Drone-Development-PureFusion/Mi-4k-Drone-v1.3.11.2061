package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GeneratePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeneratePasswordRequest> CREATOR = new C4026i();

    /* renamed from: a */
    final int f15449a;

    /* renamed from: b */
    private final PasswordSpecification f15450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeneratePasswordRequest(int i, PasswordSpecification passwordSpecification) {
        this.f15449a = i;
        this.f15450b = passwordSpecification;
    }

    /* renamed from: a */
    public PasswordSpecification m25746a() {
        return this.f15450b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4026i.m25721a(this, parcel, i);
    }
}
