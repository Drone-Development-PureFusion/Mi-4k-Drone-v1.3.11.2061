package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class Subscription extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Subscription> CREATOR = new C5147e();

    /* renamed from: a */
    private final int f18659a;

    /* renamed from: b */
    private final DataSource f18660b;

    /* renamed from: c */
    private final DataType f18661c;

    /* renamed from: d */
    private final long f18662d;

    /* renamed from: e */
    private final int f18663e;

    /* renamed from: com.google.android.gms.fitness.data.Subscription$a */
    /* loaded from: classes2.dex */
    public static class C5137a {

        /* renamed from: a */
        private DataSource f18664a;

        /* renamed from: b */
        private DataType f18665b;

        /* renamed from: c */
        private long f18666c = -1;

        /* renamed from: d */
        private int f18667d = 2;

        /* renamed from: a */
        public C5137a m21526a(DataSource dataSource) {
            this.f18664a = dataSource;
            return this;
        }

        /* renamed from: a */
        public C5137a m21525a(DataType dataType) {
            this.f18665b = dataType;
            return this;
        }

        /* renamed from: a */
        public Subscription m21527a() {
            boolean z = false;
            C4588d.m23622a((this.f18664a == null && this.f18665b == null) ? false : true, "Must call setDataSource() or setDataType()");
            if (this.f18665b == null || this.f18664a == null || this.f18665b.equals(this.f18664a.m21691a())) {
                z = true;
            }
            C4588d.m23622a(z, "Specified data type is incompatible with specified data source");
            return new Subscription(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Subscription(int i, DataSource dataSource, DataType dataType, long j, int i2) {
        this.f18659a = i;
        this.f18660b = dataSource;
        this.f18661c = dataType;
        this.f18662d = j;
        this.f18663e = i2;
    }

    private Subscription(C5137a c5137a) {
        this.f18659a = 1;
        this.f18661c = c5137a.f18665b;
        this.f18660b = c5137a.f18664a;
        this.f18662d = c5137a.f18666c;
        this.f18663e = c5137a.f18667d;
    }

    /* renamed from: a */
    private boolean m21534a(Subscription subscription) {
        return C4585c.m23634a(this.f18660b, subscription.f18660b) && C4585c.m23634a(this.f18661c, subscription.f18661c) && this.f18662d == subscription.f18662d && this.f18663e == subscription.f18663e;
    }

    /* renamed from: a */
    public DataSource m21535a() {
        return this.f18660b;
    }

    /* renamed from: b */
    public DataType m21533b() {
        return this.f18661c;
    }

    /* renamed from: c */
    public int m21532c() {
        return this.f18663e;
    }

    /* renamed from: d */
    public long m21531d() {
        return this.f18662d;
    }

    /* renamed from: e */
    public String m21530e() {
        Object[] objArr = new Object[1];
        objArr[0] = this.f18660b == null ? this.f18661c.m21659a() : this.f18660b.m21678j();
        return String.format("Subscription{%s}", objArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Subscription) && m21534a((Subscription) obj));
    }

    /* renamed from: f */
    public DataType m21529f() {
        return this.f18661c == null ? this.f18660b.m21691a() : this.f18661c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m21528g() {
        return this.f18659a;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18660b, this.f18660b, Long.valueOf(this.f18662d), Integer.valueOf(this.f18663e));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("dataSource", this.f18660b).m23632a("dataType", this.f18661c).m23632a("samplingIntervalMicros", Long.valueOf(this.f18662d)).m23632a("accuracyMode", Integer.valueOf(this.f18663e)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5147e.m21475a(this, parcel, i);
    }
}
