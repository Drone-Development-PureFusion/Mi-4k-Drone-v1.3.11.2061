package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnConnectionRequestParams> CREATOR = new C8819x();

    /* renamed from: a */
    final int f28089a;

    /* renamed from: b */
    private final String f28090b;

    /* renamed from: c */
    private final String f28091c;
    @Nullable

    /* renamed from: d */
    private final byte[] f28092d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnConnectionRequestParams(int i, String str, String str2, @Nullable byte[] bArr) {
        this.f28089a = i;
        this.f28090b = str;
        this.f28091c = str2;
        this.f28092d = bArr;
    }

    /* renamed from: a */
    public String m10160a() {
        return this.f28090b;
    }

    /* renamed from: b */
    public String m10159b() {
        return this.f28091c;
    }

    @Nullable
    /* renamed from: c */
    public byte[] m10158c() {
        return this.f28092d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnConnectionRequestParams)) {
            return false;
        }
        OnConnectionRequestParams onConnectionRequestParams = (OnConnectionRequestParams) obj;
        return this.f28089a == onConnectionRequestParams.f28089a && C4585c.m23634a(this.f28090b, onConnectionRequestParams.f28090b) && C4585c.m23634a(this.f28091c, onConnectionRequestParams.f28091c) && C4585c.m23634a(this.f28092d, onConnectionRequestParams.f28092d);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28089a), this.f28090b, this.f28091c, this.f28092d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8819x.m9990a(this, parcel, i);
    }
}
