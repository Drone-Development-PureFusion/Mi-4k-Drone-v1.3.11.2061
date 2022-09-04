package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public final class GetBuyFlowInitializationTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new C9362c();

    /* renamed from: a */
    byte[] f29621a;

    /* renamed from: b */
    byte[] f29622b;

    /* renamed from: c */
    private final int f29623c;

    GetBuyFlowInitializationTokenRequest() {
        this(1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetBuyFlowInitializationTokenRequest(int i, byte[] bArr, byte[] bArr2) {
        this.f29623c = i;
        this.f29621a = bArr;
        this.f29622b = bArr2;
    }

    /* renamed from: a */
    public int m8427a() {
        return this.f29623c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9362c.m8415a(this, parcel, i);
    }
}
