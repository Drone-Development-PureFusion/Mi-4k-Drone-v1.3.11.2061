package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInRequest> CREATOR = new C9017h();

    /* renamed from: a */
    final int f28650a;

    /* renamed from: b */
    final ResolveAccountRequest f28651b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInRequest(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f28650a = i;
        this.f28651b = resolveAccountRequest;
    }

    public SignInRequest(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    /* renamed from: a */
    public ResolveAccountRequest m9400a() {
        return this.f28651b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9017h.m9360a(this, parcel, i);
    }
}
