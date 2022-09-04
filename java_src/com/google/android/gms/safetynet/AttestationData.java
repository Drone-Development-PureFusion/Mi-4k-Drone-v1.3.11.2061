package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AttestationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AttestationData> CREATOR = new C8996e();

    /* renamed from: a */
    public final int f28607a;

    /* renamed from: b */
    private String f28608b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AttestationData(int i, String str) {
        this.f28607a = i;
        this.f28608b = str;
    }

    /* renamed from: a */
    public String m9439a() {
        return this.f28608b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8996e.m9422a(this, parcel, i);
    }
}
