package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class SaveRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveRequest> CREATOR = new C4033l();

    /* renamed from: a */
    final int f15451a;

    /* renamed from: b */
    private final Credential f15452b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SaveRequest(int i, Credential credential) {
        this.f15451a = i;
        this.f15452b = credential;
    }

    public SaveRequest(Credential credential) {
        this(1, credential);
    }

    /* renamed from: a */
    public Credential m25745a() {
        return this.f15452b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4033l.m25708a(this, parcel, i);
    }
}
