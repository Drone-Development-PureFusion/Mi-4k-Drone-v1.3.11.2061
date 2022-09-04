package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.alq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class DataDeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataDeleteRequest> CREATOR = new C5241r();

    /* renamed from: a */
    private final int f18851a;

    /* renamed from: b */
    private final long f18852b;

    /* renamed from: c */
    private final long f18853c;

    /* renamed from: d */
    private final List<DataSource> f18854d;

    /* renamed from: e */
    private final List<DataType> f18855e;

    /* renamed from: f */
    private final List<Session> f18856f;

    /* renamed from: g */
    private final boolean f18857g;

    /* renamed from: h */
    private final boolean f18858h;

    /* renamed from: i */
    private final alq f18859i;

    /* renamed from: com.google.android.gms.fitness.request.DataDeleteRequest$a */
    /* loaded from: classes2.dex */
    public static class C5185a {

        /* renamed from: a */
        private long f18860a;

        /* renamed from: b */
        private long f18861b;

        /* renamed from: c */
        private List<DataSource> f18862c = new ArrayList();

        /* renamed from: d */
        private List<DataType> f18863d = new ArrayList();

        /* renamed from: e */
        private List<Session> f18864e = new ArrayList();

        /* renamed from: f */
        private boolean f18865f = false;

        /* renamed from: g */
        private boolean f18866g = false;

        /* renamed from: d */
        private void m21362d() {
            if (this.f18864e.isEmpty()) {
                return;
            }
            for (Session session : this.f18864e) {
                C4588d.m23621a(session.m21570a(TimeUnit.MILLISECONDS) >= this.f18860a && session.m21568b(TimeUnit.MILLISECONDS) <= this.f18861b, "Session %s is outside the time interval [%d, %d]", session, Long.valueOf(this.f18860a), Long.valueOf(this.f18861b));
            }
        }

        /* renamed from: a */
        public C5185a m21372a() {
            C4588d.m23618b(this.f18863d.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
            C4588d.m23618b(this.f18862c.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
            this.f18865f = true;
            return this;
        }

        /* renamed from: a */
        public C5185a m21371a(long j, long j2, TimeUnit timeUnit) {
            C4588d.m23617b(j > 0, "Invalid start time :%d", Long.valueOf(j));
            C4588d.m23617b(j2 > j, "Invalid end time :%d", Long.valueOf(j2));
            this.f18860a = timeUnit.toMillis(j);
            this.f18861b = timeUnit.toMillis(j2);
            return this;
        }

        /* renamed from: a */
        public C5185a m21370a(DataSource dataSource) {
            boolean z = true;
            C4588d.m23618b(!this.f18865f, "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
            if (dataSource == null) {
                z = false;
            }
            C4588d.m23618b(z, "Must specify a valid data source");
            if (!this.f18862c.contains(dataSource)) {
                this.f18862c.add(dataSource);
            }
            return this;
        }

        /* renamed from: a */
        public C5185a m21369a(DataType dataType) {
            boolean z = true;
            C4588d.m23618b(!this.f18865f, "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
            if (dataType == null) {
                z = false;
            }
            C4588d.m23618b(z, "Must specify a valid data type");
            if (!this.f18863d.contains(dataType)) {
                this.f18863d.add(dataType);
            }
            return this;
        }

        /* renamed from: a */
        public C5185a m21368a(Session session) {
            boolean z = true;
            C4588d.m23618b(!this.f18866g, "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
            C4588d.m23618b(session != null, "Must specify a valid session");
            if (session.m21568b(TimeUnit.MILLISECONDS) <= 0) {
                z = false;
            }
            C4588d.m23618b(z, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            this.f18864e.add(session);
            return this;
        }

        /* renamed from: b */
        public C5185a m21366b() {
            C4588d.m23618b(this.f18864e.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
            this.f18866g = true;
            return this;
        }

        /* renamed from: c */
        public DataDeleteRequest m21364c() {
            boolean z = false;
            C4588d.m23622a(this.f18860a > 0 && this.f18861b > this.f18860a, "Must specify a valid time interval");
            boolean z2 = this.f18865f || !this.f18862c.isEmpty() || !this.f18863d.isEmpty();
            boolean z3 = this.f18866g || !this.f18864e.isEmpty();
            if (z2 || z3) {
                z = true;
            }
            C4588d.m23622a(z, "No data or session marked for deletion");
            m21362d();
            return new DataDeleteRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataDeleteRequest(int i, long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2, IBinder iBinder) {
        this.f18851a = i;
        this.f18852b = j;
        this.f18853c = j2;
        this.f18854d = Collections.unmodifiableList(list);
        this.f18855e = Collections.unmodifiableList(list2);
        this.f18856f = list3;
        this.f18857g = z;
        this.f18858h = z2;
        this.f18859i = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public DataDeleteRequest(long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2, alq alqVar) {
        this.f18851a = 3;
        this.f18852b = j;
        this.f18853c = j2;
        this.f18854d = Collections.unmodifiableList(list);
        this.f18855e = Collections.unmodifiableList(list2);
        this.f18856f = list3;
        this.f18857g = z;
        this.f18858h = z2;
        this.f18859i = alqVar;
    }

    private DataDeleteRequest(C5185a c5185a) {
        this(c5185a.f18860a, c5185a.f18861b, c5185a.f18862c, c5185a.f18863d, c5185a.f18864e, c5185a.f18865f, c5185a.f18866g, null);
    }

    public DataDeleteRequest(DataDeleteRequest dataDeleteRequest, alq alqVar) {
        this(dataDeleteRequest.f18852b, dataDeleteRequest.f18853c, dataDeleteRequest.f18854d, dataDeleteRequest.f18855e, dataDeleteRequest.f18856f, dataDeleteRequest.f18857g, dataDeleteRequest.f18858h, alqVar);
    }

    /* renamed from: a */
    private boolean m21385a(DataDeleteRequest dataDeleteRequest) {
        return this.f18852b == dataDeleteRequest.f18852b && this.f18853c == dataDeleteRequest.f18853c && C4585c.m23634a(this.f18854d, dataDeleteRequest.f18854d) && C4585c.m23634a(this.f18855e, dataDeleteRequest.f18855e) && C4585c.m23634a(this.f18856f, dataDeleteRequest.f18856f) && this.f18857g == dataDeleteRequest.f18857g && this.f18858h == dataDeleteRequest.f18858h;
    }

    /* renamed from: a */
    public long m21384a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18852b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public List<DataSource> m21386a() {
        return this.f18854d;
    }

    /* renamed from: b */
    public long m21382b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18853c, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public List<DataType> m21383b() {
        return this.f18855e;
    }

    /* renamed from: c */
    public List<Session> m21381c() {
        return this.f18856f;
    }

    /* renamed from: d */
    public boolean m21380d() {
        return this.f18857g;
    }

    /* renamed from: e */
    public boolean m21379e() {
        return this.f18858h;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataDeleteRequest) && m21385a((DataDeleteRequest) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m21378f() {
        return this.f18851a;
    }

    /* renamed from: g */
    public boolean m21377g() {
        return this.f18857g;
    }

    /* renamed from: h */
    public boolean m21376h() {
        return this.f18858h;
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18852b), Long.valueOf(this.f18853c));
    }

    /* renamed from: i */
    public long m21375i() {
        return this.f18853c;
    }

    /* renamed from: j */
    public long m21374j() {
        return this.f18852b;
    }

    /* renamed from: k */
    public IBinder m21373k() {
        if (this.f18859i == null) {
            return null;
        }
        return this.f18859i.asBinder();
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("startTimeMillis", Long.valueOf(this.f18852b)).m23632a("endTimeMillis", Long.valueOf(this.f18853c)).m23632a("dataSources", this.f18854d).m23632a("dateTypes", this.f18855e).m23632a("sessions", this.f18856f).m23632a("deleteAllData", Boolean.valueOf(this.f18857g)).m23632a("deleteAllSessions", Boolean.valueOf(this.f18858h)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5241r.m20992a(this, parcel, i);
    }
}
