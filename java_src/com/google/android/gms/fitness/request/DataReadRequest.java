package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import com.google.android.gms.internal.akx;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class DataReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataReadRequest> CREATOR = new C5243t();

    /* renamed from: a */
    public static final int f18871a = 0;

    /* renamed from: b */
    private final int f18872b;

    /* renamed from: c */
    private final List<DataType> f18873c;

    /* renamed from: d */
    private final List<DataSource> f18874d;

    /* renamed from: e */
    private final long f18875e;

    /* renamed from: f */
    private final long f18876f;

    /* renamed from: g */
    private final List<DataType> f18877g;

    /* renamed from: h */
    private final List<DataSource> f18878h;

    /* renamed from: i */
    private final int f18879i;

    /* renamed from: j */
    private final long f18880j;

    /* renamed from: k */
    private final DataSource f18881k;

    /* renamed from: l */
    private final int f18882l;

    /* renamed from: m */
    private final boolean f18883m;

    /* renamed from: n */
    private final boolean f18884n;

    /* renamed from: o */
    private final akx f18885o;

    /* renamed from: p */
    private final List<Device> f18886p;

    /* renamed from: q */
    private final List<Integer> f18887q;

    /* renamed from: com.google.android.gms.fitness.request.DataReadRequest$a */
    /* loaded from: classes2.dex */
    public static class C5187a {

        /* renamed from: e */
        private DataSource f18892e;

        /* renamed from: f */
        private long f18893f;

        /* renamed from: g */
        private long f18894g;

        /* renamed from: a */
        private List<DataType> f18888a = new ArrayList();

        /* renamed from: b */
        private List<DataSource> f18889b = new ArrayList();

        /* renamed from: c */
        private List<DataType> f18890c = new ArrayList();

        /* renamed from: d */
        private List<DataSource> f18891d = new ArrayList();

        /* renamed from: h */
        private int f18895h = 0;

        /* renamed from: i */
        private long f18896i = 0;

        /* renamed from: j */
        private int f18897j = 0;

        /* renamed from: k */
        private boolean f18898k = false;

        /* renamed from: l */
        private boolean f18899l = false;

        /* renamed from: m */
        private final List<Device> f18900m = new ArrayList();

        /* renamed from: n */
        private final List<Integer> f18901n = new ArrayList();

        /* renamed from: k */
        static /* synthetic */ boolean m21308k(C5187a c5187a) {
            return false;
        }

        /* renamed from: a */
        public C5187a m21332a() {
            this.f18899l = true;
            return this;
        }

        /* renamed from: a */
        public C5187a m21331a(int i) {
            C4588d.m23617b(i > 0, "Invalid limit %d is specified", Integer.valueOf(i));
            this.f18897j = i;
            return this;
        }

        /* renamed from: a */
        public C5187a m21330a(int i, TimeUnit timeUnit) {
            C4588d.m23617b(this.f18895h == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f18895h));
            C4588d.m23617b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f18895h = 1;
            this.f18896i = timeUnit.toMillis(i);
            return this;
        }

        /* renamed from: a */
        public C5187a m21329a(int i, TimeUnit timeUnit, DataSource dataSource) {
            C4588d.m23617b(this.f18895h == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f18895h));
            C4588d.m23617b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            C4588d.m23618b(dataSource != null, "Invalid activity data source specified");
            C4588d.m23617b(dataSource.m21691a().equals(DataType.f18450e), "Invalid activity data source specified: %s", dataSource);
            this.f18892e = dataSource;
            this.f18895h = 3;
            this.f18896i = timeUnit.toMillis(i);
            return this;
        }

        /* renamed from: a */
        public C5187a m21328a(long j, long j2, TimeUnit timeUnit) {
            this.f18893f = timeUnit.toMillis(j);
            this.f18894g = timeUnit.toMillis(j2);
            return this;
        }

        /* renamed from: a */
        public C5187a m21327a(DataSource dataSource) {
            C4588d.m23626a(dataSource, "Attempting to add a null data source");
            C4588d.m23618b(!this.f18891d.contains(dataSource), "Cannot add the same data source as aggregated and detailed");
            if (!this.f18889b.contains(dataSource)) {
                this.f18889b.add(dataSource);
            }
            return this;
        }

        /* renamed from: a */
        public C5187a m21326a(DataSource dataSource, DataType dataType) {
            C4588d.m23626a(dataSource, "Attempting to add a null data source");
            C4588d.m23622a(!this.f18889b.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            DataType m21691a = dataSource.m21691a();
            C4588d.m23617b(DataType.f18445W.contains(m21691a), "Unsupported input data type specified for aggregation: %s", m21691a);
            C4588d.m23617b(DataType.m21658a(m21691a).contains(dataType), "Invalid output aggregate data type specified: %s -> %s", m21691a, dataType);
            if (!this.f18891d.contains(dataSource)) {
                this.f18891d.add(dataSource);
            }
            return this;
        }

        /* renamed from: a */
        public C5187a m21325a(DataType dataType) {
            C4588d.m23626a(dataType, "Attempting to use a null data type");
            C4588d.m23622a(!this.f18890c.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            if (!this.f18888a.contains(dataType)) {
                this.f18888a.add(dataType);
            }
            return this;
        }

        /* renamed from: a */
        public C5187a m21324a(DataType dataType, DataType dataType2) {
            C4588d.m23626a(dataType, "Attempting to use a null data type");
            C4588d.m23622a(!this.f18888a.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            C4588d.m23617b(DataType.f18445W.contains(dataType), "Unsupported input data type specified for aggregation: %s", dataType);
            C4588d.m23617b(DataType.m21658a(dataType).contains(dataType2), "Invalid output aggregate data type specified: %s -> %s", dataType, dataType2);
            if (!this.f18890c.contains(dataType)) {
                this.f18890c.add(dataType);
            }
            return this;
        }

        /* renamed from: b */
        public C5187a m21321b(int i, TimeUnit timeUnit) {
            C4588d.m23617b(this.f18895h == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f18895h));
            C4588d.m23617b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f18895h = 3;
            this.f18896i = timeUnit.toMillis(i);
            return this;
        }

        /* renamed from: b */
        public C5187a m21320b(int i, TimeUnit timeUnit, DataSource dataSource) {
            C4588d.m23617b(this.f18895h == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f18895h));
            C4588d.m23617b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            C4588d.m23618b(dataSource != null, "Invalid activity data source specified");
            C4588d.m23617b(dataSource.m21691a().equals(DataType.f18450e), "Invalid activity data source specified: %s", dataSource);
            this.f18892e = dataSource;
            this.f18895h = 4;
            this.f18896i = timeUnit.toMillis(i);
            return this;
        }

        /* renamed from: b */
        public DataReadRequest m21322b() {
            boolean z = true;
            C4588d.m23622a(!this.f18889b.isEmpty() || !this.f18888a.isEmpty() || !this.f18891d.isEmpty() || !this.f18890c.isEmpty(), "Must add at least one data source (aggregated or detailed)");
            C4588d.m23621a(this.f18893f > 0, "Invalid start time: %s", Long.valueOf(this.f18893f));
            C4588d.m23621a(this.f18894g > 0 && this.f18894g > this.f18893f, "Invalid end time: %s", Long.valueOf(this.f18894g));
            boolean z2 = this.f18891d.isEmpty() && this.f18890c.isEmpty();
            if ((!z2 || this.f18895h != 0) && (z2 || this.f18895h == 0)) {
                z = false;
            }
            C4588d.m23622a(z, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest(this);
        }

        /* renamed from: c */
        public C5187a m21318c(int i, TimeUnit timeUnit) {
            C4588d.m23617b(this.f18895h == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f18895h));
            C4588d.m23617b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f18895h = 4;
            this.f18896i = timeUnit.toMillis(i);
            return this;
        }

        /* renamed from: d */
        public C5187a m21316d(int i, TimeUnit timeUnit) {
            C4588d.m23617b(this.f18895h == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f18895h));
            C4588d.m23617b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f18895h = 2;
            this.f18896i = timeUnit.toMillis(i);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataReadRequest(int i, List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i2, long j3, DataSource dataSource, int i3, boolean z, boolean z2, IBinder iBinder, List<Device> list5, List<Integer> list6) {
        this.f18872b = i;
        this.f18873c = list;
        this.f18874d = list2;
        this.f18875e = j;
        this.f18876f = j2;
        this.f18877g = list3;
        this.f18878h = list4;
        this.f18879i = i2;
        this.f18880j = j3;
        this.f18881k = dataSource;
        this.f18882l = i3;
        this.f18883m = z;
        this.f18884n = z2;
        this.f18885o = iBinder == null ? null : akx.AbstractBinderC6474a.m16992a(iBinder);
        this.f18886p = list5 == null ? Collections.emptyList() : list5;
        this.f18887q = list6 == null ? Collections.emptyList() : list6;
    }

    private DataReadRequest(C5187a c5187a) {
        this(c5187a.f18888a, c5187a.f18889b, c5187a.f18893f, c5187a.f18894g, c5187a.f18890c, c5187a.f18891d, c5187a.f18895h, c5187a.f18896i, c5187a.f18892e, c5187a.f18897j, C5187a.m21308k(c5187a), c5187a.f18899l, null, c5187a.f18900m, c5187a.f18901n);
    }

    public DataReadRequest(DataReadRequest dataReadRequest, akx akxVar) {
        this(dataReadRequest.f18873c, dataReadRequest.f18874d, dataReadRequest.f18875e, dataReadRequest.f18876f, dataReadRequest.f18877g, dataReadRequest.f18878h, dataReadRequest.f18879i, dataReadRequest.f18880j, dataReadRequest.f18881k, dataReadRequest.f18882l, dataReadRequest.f18883m, dataReadRequest.f18884n, akxVar, dataReadRequest.f18886p, dataReadRequest.f18887q);
    }

    public DataReadRequest(List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, akx akxVar, List<Device> list5, List<Integer> list6) {
        this(6, list, list2, j, j2, list3, list4, i, j3, dataSource, i2, z, z2, akxVar == null ? null : akxVar.asBinder(), list5, list6);
    }

    /* renamed from: a */
    private boolean m21351a(DataReadRequest dataReadRequest) {
        return this.f18873c.equals(dataReadRequest.f18873c) && this.f18874d.equals(dataReadRequest.f18874d) && this.f18875e == dataReadRequest.f18875e && this.f18876f == dataReadRequest.f18876f && this.f18879i == dataReadRequest.f18879i && this.f18878h.equals(dataReadRequest.f18878h) && this.f18877g.equals(dataReadRequest.f18877g) && C4585c.m23634a(this.f18881k, dataReadRequest.f18881k) && this.f18880j == dataReadRequest.f18880j && this.f18884n == dataReadRequest.f18884n && this.f18882l == dataReadRequest.f18882l && this.f18883m == dataReadRequest.f18883m && C4585c.m23634a(this.f18885o, dataReadRequest.f18885o) && C4585c.m23634a(this.f18886p, dataReadRequest.f18886p) && C4585c.m23634a(this.f18887q, dataReadRequest.f18887q);
    }

    /* renamed from: a */
    public long m21350a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18875e, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public List<DataType> m21352a() {
        return this.f18873c;
    }

    /* renamed from: b */
    public long m21348b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18876f, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public List<DataSource> m21349b() {
        return this.f18874d;
    }

    /* renamed from: c */
    public long m21346c(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18880j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public List<DataType> m21347c() {
        return this.f18877g;
    }

    /* renamed from: d */
    public List<DataSource> m21345d() {
        return this.f18878h;
    }

    /* renamed from: e */
    public int m21344e() {
        return this.f18879i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataReadRequest) && m21351a((DataReadRequest) obj));
    }

    /* renamed from: f */
    public DataSource m21343f() {
        return this.f18881k;
    }

    /* renamed from: g */
    public int m21342g() {
        return this.f18882l;
    }

    /* renamed from: h */
    public boolean m21341h() {
        return this.f18884n;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f18879i), Long.valueOf(this.f18875e), Long.valueOf(this.f18876f));
    }

    /* renamed from: i */
    public boolean m21340i() {
        return this.f18883m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m21339j() {
        return this.f18872b;
    }

    /* renamed from: k */
    public long m21338k() {
        return this.f18876f;
    }

    /* renamed from: l */
    public long m21337l() {
        return this.f18875e;
    }

    /* renamed from: m */
    public long m21336m() {
        return this.f18880j;
    }

    /* renamed from: n */
    public IBinder m21335n() {
        if (this.f18885o == null) {
            return null;
        }
        return this.f18885o.asBinder();
    }

    /* renamed from: o */
    public List<Device> m21334o() {
        return this.f18886p;
    }

    /* renamed from: p */
    public List<Integer> m21333p() {
        return this.f18887q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataReadRequest{");
        if (!this.f18873c.isEmpty()) {
            for (DataType dataType : this.f18873c) {
                sb.append(dataType.m21654c()).append(" ");
            }
        }
        if (!this.f18874d.isEmpty()) {
            for (DataSource dataSource : this.f18874d) {
                sb.append(dataSource.m21678j()).append(" ");
            }
        }
        if (this.f18879i != 0) {
            sb.append("bucket by ").append(Bucket.m21751a(this.f18879i));
            if (this.f18880j > 0) {
                sb.append(" >").append(this.f18880j).append(LocaleUtil.MALAY);
            }
            sb.append(": ");
        }
        if (!this.f18877g.isEmpty()) {
            for (DataType dataType2 : this.f18877g) {
                sb.append(dataType2.m21654c()).append(" ");
            }
        }
        if (!this.f18878h.isEmpty()) {
            for (DataSource dataSource2 : this.f18878h) {
                sb.append(dataSource2.m21678j()).append(" ");
            }
        }
        sb.append(String.format("(%tF %tT - %tF %tT)", Long.valueOf(this.f18875e), Long.valueOf(this.f18875e), Long.valueOf(this.f18876f), Long.valueOf(this.f18876f)));
        if (this.f18881k != null) {
            sb.append("activities: ").append(this.f18881k.m21678j());
        }
        if (!this.f18887q.isEmpty()) {
            sb.append("quality: ");
            for (Integer num : this.f18887q) {
                sb.append(DataSource.m21686b(num.intValue())).append(" ");
            }
        }
        if (this.f18884n) {
            sb.append(" +server");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5243t.m20986a(this, parcel, i);
    }
}
