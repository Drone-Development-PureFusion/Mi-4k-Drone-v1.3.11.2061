package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
@KeepName
/* loaded from: classes2.dex */
public final class RawBucket extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RawBucket> CREATOR = new C5140ab();

    /* renamed from: a */
    final int f18617a;

    /* renamed from: b */
    public final long f18618b;

    /* renamed from: c */
    public final long f18619c;

    /* renamed from: d */
    public final Session f18620d;

    /* renamed from: e */
    public final int f18621e;

    /* renamed from: f */
    public final List<RawDataSet> f18622f;

    /* renamed from: g */
    public final int f18623g;

    /* renamed from: h */
    public final boolean f18624h;

    public RawBucket(int i, long j, long j2, Session session, int i2, List<RawDataSet> list, int i3, boolean z) {
        this.f18617a = i;
        this.f18618b = j;
        this.f18619c = j2;
        this.f18620d = session;
        this.f18621e = i2;
        this.f18622f = list;
        this.f18623g = i3;
        this.f18624h = z;
    }

    public RawBucket(Bucket bucket, List<DataSource> list, List<DataType> list2) {
        this.f18617a = 2;
        this.f18618b = bucket.m21747a(TimeUnit.MILLISECONDS);
        this.f18619c = bucket.m21744b(TimeUnit.MILLISECONDS);
        this.f18620d = bucket.m21752a();
        this.f18621e = bucket.m21743c();
        this.f18623g = bucket.m21741e();
        this.f18624h = bucket.m21740f();
        List<DataSet> m21742d = bucket.m21742d();
        this.f18622f = new ArrayList(m21742d.size());
        for (DataSet dataSet : m21742d) {
            this.f18622f.add(new RawDataSet(dataSet, list, list2));
        }
    }

    /* renamed from: a */
    private boolean m21577a(RawBucket rawBucket) {
        return this.f18618b == rawBucket.f18618b && this.f18619c == rawBucket.f18619c && this.f18621e == rawBucket.f18621e && C4585c.m23634a(this.f18622f, rawBucket.f18622f) && this.f18623g == rawBucket.f18623g && this.f18624h == rawBucket.f18624h;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawBucket) && m21577a((RawBucket) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18618b), Long.valueOf(this.f18619c), Integer.valueOf(this.f18623g));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("startTime", Long.valueOf(this.f18618b)).m23632a("endTime", Long.valueOf(this.f18619c)).m23632a("activity", Integer.valueOf(this.f18621e)).m23632a("dataSets", this.f18622f).m23632a("bucketType", Integer.valueOf(this.f18623g)).m23632a("serverHasMoreData", Boolean.valueOf(this.f18624h)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5140ab.m21493a(this, parcel, i);
    }
}
