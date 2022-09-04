package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.dev.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8804s;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8813v;
/* loaded from: classes2.dex */
public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartDiscoveryParams> CREATOR = new C8784f();

    /* renamed from: a */
    final int f28145a;
    @Nullable

    /* renamed from: b */
    private final AbstractC8813v f28146b;
    @Nullable

    /* renamed from: c */
    private final AbstractC8804s f28147c;

    /* renamed from: d */
    private final String f28148d;

    /* renamed from: e */
    private final long f28149e;

    /* renamed from: f */
    private final DiscoveryOptions f28150f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StartDiscoveryParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, String str, long j, DiscoveryOptions discoveryOptions) {
        this.f28145a = i;
        this.f28146b = AbstractC8813v.AbstractBinderC8814a.m9996a(iBinder);
        this.f28147c = AbstractC8804s.AbstractBinderC8805a.m10040a(iBinder2);
        this.f28148d = str;
        this.f28149e = j;
        this.f28150f = discoveryOptions;
    }

    @Nullable
    /* renamed from: a */
    public IBinder m10119a() {
        if (this.f28146b == null) {
            return null;
        }
        return this.f28146b.asBinder();
    }

    @Nullable
    /* renamed from: b */
    public IBinder m10118b() {
        if (this.f28147c == null) {
            return null;
        }
        return this.f28147c.asBinder();
    }

    /* renamed from: c */
    public String m10117c() {
        return this.f28148d;
    }

    /* renamed from: d */
    public long m10116d() {
        return this.f28149e;
    }

    /* renamed from: e */
    public DiscoveryOptions m10115e() {
        return this.f28150f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartDiscoveryParams)) {
            return false;
        }
        StartDiscoveryParams startDiscoveryParams = (StartDiscoveryParams) obj;
        return this.f28145a == startDiscoveryParams.f28145a && C4585c.m23634a(this.f28146b, startDiscoveryParams.f28146b) && C4585c.m23634a(this.f28147c, startDiscoveryParams.f28147c) && C4585c.m23634a(this.f28148d, startDiscoveryParams.f28148d) && C4585c.m23634a(Long.valueOf(this.f28149e), Long.valueOf(startDiscoveryParams.f28149e)) && C4585c.m23634a(this.f28150f, startDiscoveryParams.f28150f);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28145a), this.f28146b, this.f28147c, this.f28148d, Long.valueOf(this.f28149e), this.f28150f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8784f.m10073a(this, parcel, i);
    }
}
