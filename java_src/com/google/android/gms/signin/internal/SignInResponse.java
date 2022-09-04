package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInResponse> CREATOR = new C9018i();

    /* renamed from: a */
    final int f28652a;

    /* renamed from: b */
    private final ConnectionResult f28653b;

    /* renamed from: c */
    private final ResolveAccountResponse f28654c;

    public SignInResponse(int i) {
        this(new ConnectionResult(i, null), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f28652a = i;
        this.f28653b = connectionResult;
        this.f28654c = resolveAccountResponse;
    }

    public SignInResponse(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, resolveAccountResponse);
    }

    /* renamed from: a */
    public ConnectionResult m9399a() {
        return this.f28653b;
    }

    /* renamed from: b */
    public ResolveAccountResponse m9398b() {
        return this.f28654c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9018i.m9357a(this, parcel, i);
    }
}
