package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.AbstractC5167y;
import com.google.android.gms.fitness.data.DataSource;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class FitnessSensorServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FitnessSensorServiceRequest> CREATOR = new C5267b();

    /* renamed from: a */
    public static final int f19132a = -1;

    /* renamed from: b */
    private final int f19133b;

    /* renamed from: c */
    private final DataSource f19134c;

    /* renamed from: d */
    private final AbstractC5167y f19135d;

    /* renamed from: e */
    private final long f19136e;

    /* renamed from: f */
    private final long f19137f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FitnessSensorServiceRequest(int i, DataSource dataSource, IBinder iBinder, long j, long j2) {
        this.f19133b = i;
        this.f19134c = dataSource;
        this.f19135d = AbstractC5167y.AbstractBinderC5168a.m21419a(iBinder);
        this.f19136e = j;
        this.f19137f = j2;
    }

    /* renamed from: a */
    private boolean m20855a(FitnessSensorServiceRequest fitnessSensorServiceRequest) {
        return C4585c.m23634a(this.f19134c, fitnessSensorServiceRequest.f19134c) && this.f19136e == fitnessSensorServiceRequest.f19136e && this.f19137f == fitnessSensorServiceRequest.f19137f;
    }

    /* renamed from: a */
    public long m20854a(TimeUnit timeUnit) {
        if (this.f19136e == -1) {
            return -1L;
        }
        return timeUnit.convert(this.f19136e, TimeUnit.MICROSECONDS);
    }

    /* renamed from: a */
    public DataSource m20856a() {
        return this.f19134c;
    }

    /* renamed from: b */
    public long m20852b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f19137f, TimeUnit.MICROSECONDS);
    }

    /* renamed from: b */
    public AbstractC5266a m20853b() {
        return new C5268c(this.f19135d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20851c() {
        return this.f19133b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public IBinder m20850d() {
        return this.f19135d.asBinder();
    }

    /* renamed from: e */
    public long m20849e() {
        return this.f19136e;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FitnessSensorServiceRequest) && m20855a((FitnessSensorServiceRequest) obj));
    }

    /* renamed from: f */
    public long m20848f() {
        return this.f19137f;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19134c, Long.valueOf(this.f19136e), Long.valueOf(this.f19137f));
    }

    public String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", this.f19134c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5267b.m20845a(this, parcel, i);
    }
}
