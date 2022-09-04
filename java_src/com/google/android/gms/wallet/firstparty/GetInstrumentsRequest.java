package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GetInstrumentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetInstrumentsRequest> CREATOR = new C9366g();

    /* renamed from: a */
    int[] f29630a;

    /* renamed from: b */
    private final int f29631b;

    GetInstrumentsRequest() {
        this(1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetInstrumentsRequest(int i, int[] iArr) {
        this.f29631b = i;
        this.f29630a = iArr;
    }

    /* renamed from: a */
    public int m8423a() {
        return this.f29631b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9366g.m8403a(this, parcel, i);
    }
}
