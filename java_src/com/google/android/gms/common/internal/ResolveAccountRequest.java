package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new C4589e();

    /* renamed from: a */
    final int f17003a;

    /* renamed from: b */
    private final Account f17004b;

    /* renamed from: c */
    private final int f17005c;

    /* renamed from: d */
    private final GoogleSignInAccount f17006d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f17003a = i;
        this.f17004b = account;
        this.f17005c = i2;
        this.f17006d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: a */
    public Account m23730a() {
        return this.f17004b;
    }

    /* renamed from: b */
    public int m23729b() {
        return this.f17005c;
    }

    @Nullable
    /* renamed from: c */
    public GoogleSignInAccount m23728c() {
        return this.f17006d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4589e.m23613a(this, parcel, i);
    }
}
