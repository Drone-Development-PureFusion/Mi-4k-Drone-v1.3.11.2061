package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class DeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteRequest> CREATOR = new C4025h();

    /* renamed from: a */
    final int f15447a;

    /* renamed from: b */
    private final Credential f15448b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeleteRequest(int i, Credential credential) {
        this.f15447a = i;
        this.f15448b = credential;
    }

    public DeleteRequest(Credential credential) {
        this(1, credential);
    }

    /* renamed from: a */
    public Credential m25747a() {
        return this.f15448b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4025h.m25724a(this, parcel, i);
    }
}
