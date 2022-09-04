package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.alq;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class DataUpdateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataUpdateRequest> CREATOR = new C5203aa();

    /* renamed from: a */
    private final int f18937a;

    /* renamed from: b */
    private final long f18938b;

    /* renamed from: c */
    private final long f18939c;

    /* renamed from: d */
    private final DataSet f18940d;

    /* renamed from: e */
    private final alq f18941e;

    /* renamed from: com.google.android.gms.fitness.request.DataUpdateRequest$a */
    /* loaded from: classes2.dex */
    public static class C5195a {

        /* renamed from: a */
        private long f18942a;

        /* renamed from: b */
        private long f18943b;

        /* renamed from: c */
        private DataSet f18944c;

        /* renamed from: b */
        private void m21249b() {
            C4588d.m23628a(this.f18942a, "Must set a non-zero value for startTimeMillis/startTime");
            C4588d.m23628a(this.f18943b, "Must set a non-zero value for endTimeMillis/endTime");
            C4588d.m23626a(this.f18944c, "Must set the data set");
            for (DataPoint dataPoint : this.f18944c.m21697d()) {
                long m21721b = dataPoint.m21721b(TimeUnit.MILLISECONDS);
                long m21719c = dataPoint.m21719c(TimeUnit.MILLISECONDS);
                C4588d.m23621a(!((m21721b > m21719c ? 1 : (m21721b == m21719c ? 0 : -1)) > 0 || (((m21721b > 0L ? 1 : (m21721b == 0L ? 0 : -1)) != 0 && (m21721b > this.f18942a ? 1 : (m21721b == this.f18942a ? 0 : -1)) < 0) || (((m21721b > 0L ? 1 : (m21721b == 0L ? 0 : -1)) != 0 && (m21721b > this.f18943b ? 1 : (m21721b == this.f18943b ? 0 : -1)) > 0) || (m21719c > this.f18943b ? 1 : (m21719c == this.f18943b ? 0 : -1)) > 0 || (m21719c > this.f18942a ? 1 : (m21719c == this.f18942a ? 0 : -1)) < 0))), "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", Long.valueOf(m21721b), Long.valueOf(m21719c), Long.valueOf(this.f18942a), Long.valueOf(this.f18943b));
            }
        }

        /* renamed from: a */
        public C5195a m21252a(long j, long j2, TimeUnit timeUnit) {
            C4588d.m23617b(j > 0, "Invalid start time :%d", Long.valueOf(j));
            C4588d.m23617b(j2 >= j, "Invalid end time :%d", Long.valueOf(j2));
            this.f18942a = timeUnit.toMillis(j);
            this.f18943b = timeUnit.toMillis(j2);
            return this;
        }

        /* renamed from: a */
        public C5195a m21251a(DataSet dataSet) {
            C4588d.m23626a(dataSet, "Must set the data set");
            this.f18944c = dataSet;
            return this;
        }

        /* renamed from: a */
        public DataUpdateRequest m21253a() {
            m21249b();
            return new DataUpdateRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataUpdateRequest(int i, long j, long j2, DataSet dataSet, IBinder iBinder) {
        this.f18937a = i;
        this.f18938b = j;
        this.f18939c = j2;
        this.f18940d = dataSet;
        this.f18941e = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public DataUpdateRequest(long j, long j2, DataSet dataSet, IBinder iBinder) {
        this.f18937a = 1;
        this.f18938b = j;
        this.f18939c = j2;
        this.f18940d = dataSet;
        this.f18941e = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    private DataUpdateRequest(C5195a c5195a) {
        this(c5195a.f18942a, c5195a.f18943b, c5195a.f18944c, null);
    }

    public DataUpdateRequest(DataUpdateRequest dataUpdateRequest, IBinder iBinder) {
        this(dataUpdateRequest.m21261a(), dataUpdateRequest.m21258b(), dataUpdateRequest.m21256c(), iBinder);
    }

    /* renamed from: a */
    private boolean m21260a(DataUpdateRequest dataUpdateRequest) {
        return this.f18938b == dataUpdateRequest.f18938b && this.f18939c == dataUpdateRequest.f18939c && C4585c.m23634a(this.f18940d, dataUpdateRequest.f18940d);
    }

    /* renamed from: a */
    public long m21261a() {
        return this.f18938b;
    }

    /* renamed from: a */
    public long m21259a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18938b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public long m21258b() {
        return this.f18939c;
    }

    /* renamed from: b */
    public long m21257b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18939c, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public DataSet m21256c() {
        return this.f18940d;
    }

    /* renamed from: d */
    public IBinder m21255d() {
        if (this.f18941e == null) {
            return null;
        }
        return this.f18941e.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m21254e() {
        return this.f18937a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateRequest) && m21260a((DataUpdateRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18938b), Long.valueOf(this.f18939c), this.f18940d);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("startTimeMillis", Long.valueOf(this.f18938b)).m23632a("endTimeMillis", Long.valueOf(this.f18939c)).m23632a("dataSet", this.f18940d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5203aa.m21104a(this, parcel, i);
    }
}
