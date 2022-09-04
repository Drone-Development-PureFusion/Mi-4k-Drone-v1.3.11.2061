package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetClientTokenRequest> CREATOR = new C9364e();

    /* renamed from: a */
    WalletCustomTheme f29626a;

    /* renamed from: b */
    private final int f29627b;

    GetClientTokenRequest() {
        this(1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetClientTokenRequest(int i, WalletCustomTheme walletCustomTheme) {
        this.f29627b = i;
        this.f29626a = walletCustomTheme;
    }

    /* renamed from: a */
    public int m8425a() {
        return this.f29627b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9364e.m8409a(this, parcel, i);
    }
}
