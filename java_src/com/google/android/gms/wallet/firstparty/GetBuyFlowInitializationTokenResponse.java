package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenResponse> CREATOR = new C9363d();

    /* renamed from: a */
    byte[] f29624a;

    /* renamed from: b */
    private final int f29625b;

    GetBuyFlowInitializationTokenResponse() {
        this(1, new byte[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetBuyFlowInitializationTokenResponse(int i, byte[] bArr) {
        this.f29625b = i;
        this.f29624a = bArr;
    }

    /* renamed from: a */
    public int m8426a() {
        return this.f29625b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9363d.m8412a(this, parcel, i);
    }
}
