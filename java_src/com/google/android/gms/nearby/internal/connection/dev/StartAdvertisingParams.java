package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.dev.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8795p;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8816w;
/* loaded from: classes2.dex */
public final class StartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartAdvertisingParams> CREATOR = new C8783e();

    /* renamed from: a */
    final int f28139a;
    @Nullable

    /* renamed from: b */
    private final AbstractC8816w f28140b;
    @Nullable

    /* renamed from: c */
    private final AbstractC8795p f28141c;

    /* renamed from: d */
    private final String f28142d;

    /* renamed from: e */
    private final long f28143e;

    /* renamed from: f */
    private final AdvertisingOptions f28144f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StartAdvertisingParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, String str, long j, AdvertisingOptions advertisingOptions) {
        this.f28139a = i;
        this.f28140b = AbstractC8816w.AbstractBinderC8817a.m9994a(iBinder);
        this.f28141c = AbstractC8795p.AbstractBinderC8796a.m10049a(iBinder2);
        this.f28142d = str;
        this.f28143e = j;
        this.f28144f = advertisingOptions;
    }

    @Nullable
    /* renamed from: a */
    public IBinder m10124a() {
        if (this.f28140b == null) {
            return null;
        }
        return this.f28140b.asBinder();
    }

    @Nullable
    /* renamed from: b */
    public IBinder m10123b() {
        if (this.f28141c == null) {
            return null;
        }
        return this.f28141c.asBinder();
    }

    /* renamed from: c */
    public String m10122c() {
        return this.f28142d;
    }

    /* renamed from: d */
    public long m10121d() {
        return this.f28143e;
    }

    /* renamed from: e */
    public AdvertisingOptions m10120e() {
        return this.f28144f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartAdvertisingParams)) {
            return false;
        }
        StartAdvertisingParams startAdvertisingParams = (StartAdvertisingParams) obj;
        return this.f28139a == startAdvertisingParams.f28139a && C4585c.m23634a(this.f28140b, startAdvertisingParams.f28140b) && C4585c.m23634a(this.f28141c, startAdvertisingParams.f28141c) && C4585c.m23634a(this.f28142d, startAdvertisingParams.f28142d) && C4585c.m23634a(Long.valueOf(this.f28143e), Long.valueOf(startAdvertisingParams.f28143e)) && C4585c.m23634a(this.f28144f, startAdvertisingParams.f28144f);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28139a), this.f28140b, this.f28141c, this.f28142d, Long.valueOf(this.f28143e), this.f28144f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8783e.m10076a(this, parcel, i);
    }
}
