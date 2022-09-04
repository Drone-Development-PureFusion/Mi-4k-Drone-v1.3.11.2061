package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GetClientTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetClientTokenResponse> CREATOR = new C9365f();

    /* renamed from: a */
    byte[] f29628a;

    /* renamed from: b */
    private final int f29629b;

    GetClientTokenResponse() {
        this(1, new byte[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetClientTokenResponse(int i, byte[] bArr) {
        this.f29629b = i;
        this.f29628a = bArr;
    }

    /* renamed from: a */
    public int m8424a() {
        return this.f29629b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9365f.m8406a(this, parcel, i);
    }
}
