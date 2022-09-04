package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class ParcelablePayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelablePayload> CREATOR = new C8779ah();

    /* renamed from: a */
    final int f28119a;

    /* renamed from: b */
    private final long f28120b;

    /* renamed from: c */
    private final int f28121c;
    @Nullable

    /* renamed from: d */
    private final byte[] f28122d;
    @Nullable

    /* renamed from: e */
    private final ParcelFileDescriptor f28123e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelablePayload(int i, long j, int i2, @Nullable byte[] bArr, @Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.f28119a = i;
        this.f28120b = j;
        this.f28121c = i2;
        this.f28122d = bArr;
        this.f28123e = parcelFileDescriptor;
    }

    /* renamed from: a */
    public long m10140a() {
        return this.f28120b;
    }

    /* renamed from: b */
    public int m10139b() {
        return this.f28121c;
    }

    @Nullable
    /* renamed from: c */
    public byte[] m10138c() {
        return this.f28122d;
    }

    @Nullable
    /* renamed from: d */
    public ParcelFileDescriptor m10137d() {
        return this.f28123e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelablePayload)) {
            return false;
        }
        ParcelablePayload parcelablePayload = (ParcelablePayload) obj;
        return this.f28119a == parcelablePayload.f28119a && C4585c.m23634a(Long.valueOf(this.f28120b), Long.valueOf(parcelablePayload.f28120b)) && C4585c.m23634a(Integer.valueOf(this.f28121c), Integer.valueOf(parcelablePayload.f28121c)) && C4585c.m23634a(this.f28122d, parcelablePayload.f28122d) && C4585c.m23634a(this.f28123e, parcelablePayload.f28123e);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28119a), Long.valueOf(this.f28120b), Integer.valueOf(this.f28121c), this.f28122d, this.f28123e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8779ah.m10088a(this, parcel, i);
    }
}
