package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.akj;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.fitness.request.c */
/* loaded from: classes2.dex */
public class C5222c {

    /* renamed from: a */
    public static final int f19057a = 1;

    /* renamed from: b */
    public static final int f19058b = 2;

    /* renamed from: c */
    public static final int f19059c = 3;

    /* renamed from: d */
    private final DataSource f19060d;

    /* renamed from: e */
    private final DataType f19061e;

    /* renamed from: f */
    private final long f19062f;

    /* renamed from: g */
    private final long f19063g;

    /* renamed from: h */
    private final long f19064h;

    /* renamed from: i */
    private final int f19065i;

    /* renamed from: j */
    private final LocationRequest f19066j;

    /* renamed from: k */
    private final long f19067k;

    /* renamed from: com.google.android.gms.fitness.request.c$a */
    /* loaded from: classes2.dex */
    public static class C5224a {

        /* renamed from: a */
        private DataSource f19068a;

        /* renamed from: b */
        private DataType f19069b;

        /* renamed from: c */
        private long f19070c = -1;

        /* renamed from: d */
        private long f19071d = 0;

        /* renamed from: e */
        private long f19072e = 0;

        /* renamed from: f */
        private boolean f19073f = false;

        /* renamed from: g */
        private int f19074g = 2;

        /* renamed from: h */
        private long f19075h = Long.MAX_VALUE;

        /* renamed from: a */
        public C5224a m21052a(int i) {
            this.f19074g = akj.m17029a(i);
            return this;
        }

        /* renamed from: a */
        public C5224a m21051a(int i, TimeUnit timeUnit) {
            C4588d.m23618b(i >= 0, "Cannot use a negative interval");
            this.f19073f = true;
            this.f19071d = timeUnit.toMicros(i);
            return this;
        }

        /* renamed from: a */
        public C5224a m21050a(long j, TimeUnit timeUnit) {
            C4588d.m23618b(j >= 0, "Cannot use a negative sampling interval");
            this.f19070c = timeUnit.toMicros(j);
            if (!this.f19073f) {
                this.f19071d = this.f19070c / 2;
            }
            return this;
        }

        /* renamed from: a */
        public C5224a m21049a(DataSource dataSource) {
            this.f19068a = dataSource;
            return this;
        }

        /* renamed from: a */
        public C5224a m21048a(DataType dataType) {
            this.f19069b = dataType;
            return this;
        }

        /* renamed from: a */
        public C5222c m21053a() {
            boolean z = false;
            C4588d.m23622a((this.f19068a == null && this.f19069b == null) ? false : true, "Must call setDataSource() or setDataType()");
            if (this.f19069b == null || this.f19068a == null || this.f19069b.equals(this.f19068a.m21691a())) {
                z = true;
            }
            C4588d.m23622a(z, "Specified data type is incompatible with specified data source");
            return new C5222c(this);
        }

        /* renamed from: b */
        public C5224a m21046b(int i, TimeUnit timeUnit) {
            C4588d.m23618b(i >= 0, "Cannot use a negative delivery interval");
            this.f19072e = timeUnit.toMicros(i);
            return this;
        }

        /* renamed from: b */
        public C5224a m21045b(long j, TimeUnit timeUnit) {
            boolean z = true;
            C4588d.m23617b(j > 0, "Invalid time out value specified: %d", Long.valueOf(j));
            if (timeUnit == null) {
                z = false;
            }
            C4588d.m23618b(z, "Invalid time unit specified");
            this.f19075h = timeUnit.toMicros(j);
            return this;
        }
    }

    private C5222c(DataSource dataSource, LocationRequest locationRequest) {
        this.f19066j = locationRequest;
        this.f19062f = TimeUnit.MILLISECONDS.toMicros(locationRequest.m12619c());
        this.f19063g = TimeUnit.MILLISECONDS.toMicros(locationRequest.m12613e());
        this.f19064h = this.f19062f;
        this.f19061e = dataSource.m21691a();
        this.f19065i = m21060a(locationRequest);
        this.f19060d = dataSource;
        long m12611f = locationRequest.m12611f();
        if (m12611f == Long.MAX_VALUE) {
            this.f19067k = Long.MAX_VALUE;
        } else {
            this.f19067k = TimeUnit.MILLISECONDS.toMicros(m12611f - SystemClock.elapsedRealtime());
        }
    }

    private C5222c(C5224a c5224a) {
        this.f19060d = c5224a.f19068a;
        this.f19061e = c5224a.f19069b;
        this.f19062f = c5224a.f19070c;
        this.f19063g = c5224a.f19071d;
        this.f19064h = c5224a.f19072e;
        this.f19065i = c5224a.f19074g;
        this.f19066j = null;
        this.f19067k = c5224a.f19075h;
    }

    /* renamed from: a */
    private static int m21060a(LocationRequest locationRequest) {
        switch (locationRequest.m12623b()) {
            case 100:
                return 3;
            case 104:
                return 1;
            default:
                return 2;
        }
    }

    /* renamed from: a */
    public static C5222c m21062a(DataSource dataSource, LocationRequest locationRequest) {
        return new C5222c(dataSource, locationRequest);
    }

    /* renamed from: a */
    private boolean m21061a(C5222c c5222c) {
        return C4585c.m23634a(this.f19060d, c5222c.f19060d) && C4585c.m23634a(this.f19061e, c5222c.f19061e) && this.f19062f == c5222c.f19062f && this.f19063g == c5222c.f19063g && this.f19064h == c5222c.f19064h && this.f19065i == c5222c.f19065i && C4585c.m23634a(this.f19066j, c5222c.f19066j) && this.f19067k == c5222c.f19067k;
    }

    /* renamed from: a */
    public long m21059a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f19062f, TimeUnit.MICROSECONDS);
    }

    /* renamed from: a */
    public DataSource m21063a() {
        return this.f19060d;
    }

    /* renamed from: b */
    public long m21057b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f19063g, TimeUnit.MICROSECONDS);
    }

    /* renamed from: b */
    public DataType m21058b() {
        return this.f19061e;
    }

    /* renamed from: c */
    public int m21056c() {
        return this.f19065i;
    }

    /* renamed from: c */
    public long m21055c(TimeUnit timeUnit) {
        return timeUnit.convert(this.f19064h, TimeUnit.MICROSECONDS);
    }

    /* renamed from: d */
    public long m21054d() {
        return this.f19067k;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5222c) && m21061a((C5222c) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19060d, this.f19061e, Long.valueOf(this.f19062f), Long.valueOf(this.f19063g), Long.valueOf(this.f19064h), Integer.valueOf(this.f19065i), this.f19066j, Long.valueOf(this.f19067k));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("dataSource", this.f19060d).m23632a("dataType", this.f19061e).m23632a("samplingRateMicros", Long.valueOf(this.f19062f)).m23632a("deliveryLatencyMicros", Long.valueOf(this.f19064h)).m23632a("timeOutMicros", Long.valueOf(this.f19067k)).toString();
    }
}
