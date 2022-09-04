package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akf;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
@KeepName
/* loaded from: classes2.dex */
public final class RawDataPoint extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RawDataPoint> CREATOR = new C5141ac();

    /* renamed from: a */
    final int f18625a;

    /* renamed from: b */
    public final long f18626b;

    /* renamed from: c */
    public final long f18627c;

    /* renamed from: d */
    public final Value[] f18628d;

    /* renamed from: e */
    public final int f18629e;

    /* renamed from: f */
    public final int f18630f;

    /* renamed from: g */
    public final long f18631g;

    /* renamed from: h */
    public final long f18632h;

    public RawDataPoint(int i, long j, long j2, Value[] valueArr, int i2, int i3, long j3, long j4) {
        this.f18625a = i;
        this.f18626b = j;
        this.f18627c = j2;
        this.f18629e = i2;
        this.f18630f = i3;
        this.f18631g = j3;
        this.f18632h = j4;
        this.f18628d = valueArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RawDataPoint(DataPoint dataPoint, List<DataSource> list) {
        this.f18625a = 4;
        this.f18626b = dataPoint.m21726a(TimeUnit.NANOSECONDS);
        this.f18627c = dataPoint.m21721b(TimeUnit.NANOSECONDS);
        this.f18628d = dataPoint.m21736a();
        this.f18629e = akf.m17048a(dataPoint.m21720c(), list);
        this.f18630f = akf.m17048a(dataPoint.m21717e(), list);
        this.f18631g = dataPoint.m21716f();
        this.f18632h = dataPoint.m21715g();
    }

    /* renamed from: a */
    private boolean m21576a(RawDataPoint rawDataPoint) {
        return this.f18626b == rawDataPoint.f18626b && this.f18627c == rawDataPoint.f18627c && Arrays.equals(this.f18628d, rawDataPoint.f18628d) && this.f18629e == rawDataPoint.f18629e && this.f18630f == rawDataPoint.f18630f && this.f18631g == rawDataPoint.f18631g;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawDataPoint) && m21576a((RawDataPoint) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18626b), Long.valueOf(this.f18627c));
    }

    public String toString() {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", Arrays.toString(this.f18628d), Long.valueOf(this.f18627c), Long.valueOf(this.f18626b), Integer.valueOf(this.f18629e), Integer.valueOf(this.f18630f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5141ac.m21490a(this, parcel, i);
    }
}
