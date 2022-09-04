package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GetInstrumentsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetInstrumentsResponse> CREATOR = new C9367h();

    /* renamed from: a */
    String[] f29632a;

    /* renamed from: b */
    byte[][] f29633b;

    /* renamed from: c */
    private final int f29634c;

    GetInstrumentsResponse() {
        this(1, new String[0], new byte[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetInstrumentsResponse(int i, String[] strArr, byte[][] bArr) {
        this.f29634c = i;
        this.f29632a = strArr;
        this.f29633b = bArr;
    }

    /* renamed from: a */
    public int m8422a() {
        return this.f29634c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9367h.m8400a(this, parcel, i);
    }
}
