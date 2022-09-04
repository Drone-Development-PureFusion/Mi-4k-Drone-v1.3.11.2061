package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnConnectionResponseParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnConnectionResponseParams> CREATOR = new C8820y();

    /* renamed from: a */
    final int f28093a;

    /* renamed from: b */
    private final String f28094b;

    /* renamed from: c */
    private final int f28095c;
    @Nullable

    /* renamed from: d */
    private final byte[] f28096d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnConnectionResponseParams(int i, String str, int i2, @Nullable byte[] bArr) {
        this.f28093a = i;
        this.f28094b = str;
        this.f28095c = i2;
        this.f28096d = bArr;
    }

    /* renamed from: a */
    public String m10157a() {
        return this.f28094b;
    }

    /* renamed from: b */
    public int m10156b() {
        return this.f28095c;
    }

    @Nullable
    /* renamed from: c */
    public byte[] m10155c() {
        return this.f28096d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnConnectionResponseParams)) {
            return false;
        }
        OnConnectionResponseParams onConnectionResponseParams = (OnConnectionResponseParams) obj;
        return this.f28093a == onConnectionResponseParams.f28093a && C4585c.m23634a(this.f28094b, onConnectionResponseParams.f28094b) && C4585c.m23634a(Integer.valueOf(this.f28095c), Integer.valueOf(onConnectionResponseParams.f28095c)) && C4585c.m23634a(this.f28096d, onConnectionResponseParams.f28096d);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28093a), this.f28094b, Integer.valueOf(this.f28095c), this.f28096d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8820y.m9987a(this, parcel, i);
    }
}
