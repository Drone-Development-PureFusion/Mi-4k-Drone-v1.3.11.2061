package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new C8769f();

    /* renamed from: a */
    final int f28069a;

    /* renamed from: b */
    private final long f28070b;

    /* renamed from: c */
    private final int f28071c;

    /* renamed from: d */
    private final long f28072d;

    /* renamed from: e */
    private final long f28073e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PayloadTransferUpdate(int i, long j, int i2, long j2, long j3) {
        this.f28069a = i;
        this.f28070b = j;
        this.f28071c = i2;
        this.f28072d = j2;
        this.f28073e = j3;
    }

    /* renamed from: a */
    public long m10189a() {
        return this.f28070b;
    }

    /* renamed from: b */
    public int m10188b() {
        return this.f28071c;
    }

    /* renamed from: c */
    public long m10187c() {
        return this.f28072d;
    }

    /* renamed from: d */
    public long m10186d() {
        return this.f28073e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadTransferUpdate)) {
            return false;
        }
        PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
        return this.f28069a == payloadTransferUpdate.f28069a && C4585c.m23634a(Long.valueOf(this.f28070b), Long.valueOf(payloadTransferUpdate.f28070b)) && C4585c.m23634a(Integer.valueOf(this.f28071c), Integer.valueOf(payloadTransferUpdate.f28071c)) && C4585c.m23634a(Long.valueOf(this.f28072d), Long.valueOf(payloadTransferUpdate.f28072d)) && C4585c.m23634a(Long.valueOf(this.f28073e), Long.valueOf(payloadTransferUpdate.f28073e));
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28069a), Long.valueOf(this.f28070b), Integer.valueOf(this.f28071c), Long.valueOf(this.f28072d), Long.valueOf(this.f28073e));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8769f.m10169a(this, parcel, i);
    }
}
