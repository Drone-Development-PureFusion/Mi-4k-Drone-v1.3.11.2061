package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.ake;
import com.google.android.gms.internal.alq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class SessionInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionInsertRequest> CREATOR = new C5228e();

    /* renamed from: a */
    private final int f18988a;

    /* renamed from: b */
    private final Session f18989b;

    /* renamed from: c */
    private final List<DataSet> f18990c;

    /* renamed from: d */
    private final List<DataPoint> f18991d;

    /* renamed from: e */
    private final alq f18992e;

    /* renamed from: com.google.android.gms.fitness.request.SessionInsertRequest$a */
    /* loaded from: classes2.dex */
    public static class C5197a {

        /* renamed from: a */
        private Session f18993a;

        /* renamed from: b */
        private List<DataSet> f18994b = new ArrayList();

        /* renamed from: c */
        private List<DataPoint> f18995c = new ArrayList();

        /* renamed from: d */
        private List<DataSource> f18996d = new ArrayList();

        /* renamed from: b */
        private void m21193b() {
            for (DataSet dataSet : this.f18994b) {
                for (DataPoint dataPoint : dataSet.m21697d()) {
                    m21192b(dataPoint);
                }
            }
            for (DataPoint dataPoint2 : this.f18995c) {
                m21192b(dataPoint2);
            }
        }

        /* renamed from: b */
        private void m21192b(DataPoint dataPoint) {
            m21188d(dataPoint);
            m21190c(dataPoint);
        }

        /* renamed from: c */
        private void m21190c(DataPoint dataPoint) {
            long m21570a = this.f18993a.m21570a(TimeUnit.NANOSECONDS);
            long m21568b = this.f18993a.m21568b(TimeUnit.NANOSECONDS);
            long m21721b = dataPoint.m21721b(TimeUnit.NANOSECONDS);
            long m21719c = dataPoint.m21719c(TimeUnit.NANOSECONDS);
            if (m21721b == 0 || m21719c == 0) {
                return;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (m21719c > m21568b) {
                m21719c = ake.m17051a(m21719c, TimeUnit.NANOSECONDS, timeUnit);
            }
            C4588d.m23621a(m21721b >= m21570a && m21719c <= m21568b, "Data point %s has start and end times outside session interval [%d, %d]", dataPoint, Long.valueOf(m21570a), Long.valueOf(m21568b));
            if (m21719c == dataPoint.m21719c(TimeUnit.NANOSECONDS)) {
                return;
            }
            Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", Long.valueOf(dataPoint.m21719c(TimeUnit.NANOSECONDS)), Long.valueOf(m21719c), timeUnit));
            dataPoint.m21734a(m21721b, m21719c, TimeUnit.NANOSECONDS);
        }

        /* renamed from: d */
        private void m21188d(DataPoint dataPoint) {
            long m21570a = this.f18993a.m21570a(TimeUnit.NANOSECONDS);
            long m21568b = this.f18993a.m21568b(TimeUnit.NANOSECONDS);
            long m21726a = dataPoint.m21726a(TimeUnit.NANOSECONDS);
            if (m21726a != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (m21726a < m21570a || m21726a > m21568b) {
                    m21726a = ake.m17051a(m21726a, TimeUnit.NANOSECONDS, timeUnit);
                }
                C4588d.m23621a(m21726a >= m21570a && m21726a <= m21568b, "Data point %s has time stamp outside session interval [%d, %d]", dataPoint, Long.valueOf(m21570a), Long.valueOf(m21568b));
                if (dataPoint.m21726a(TimeUnit.NANOSECONDS) == m21726a) {
                    return;
                }
                Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", Long.valueOf(dataPoint.m21726a(TimeUnit.NANOSECONDS)), Long.valueOf(m21726a), timeUnit));
                dataPoint.m21733a(m21726a, TimeUnit.NANOSECONDS);
            }
        }

        /* renamed from: a */
        public C5197a m21197a(DataPoint dataPoint) {
            C4588d.m23618b(dataPoint != null, "Must specify a valid aggregate data point.");
            DataSource m21720c = dataPoint.m21720c();
            C4588d.m23621a(!this.f18996d.contains(m21720c), "Data set/Aggregate data point for this data source %s is already added.", m21720c);
            DataSet.m21698c(dataPoint);
            this.f18996d.add(m21720c);
            this.f18995c.add(dataPoint);
            return this;
        }

        /* renamed from: a */
        public C5197a m21196a(DataSet dataSet) {
            boolean z = true;
            C4588d.m23618b(dataSet != null, "Must specify a valid data set.");
            DataSource m21702b = dataSet.m21702b();
            C4588d.m23621a(!this.f18996d.contains(m21702b), "Data set for this data source %s is already added.", m21702b);
            if (dataSet.m21697d().isEmpty()) {
                z = false;
            }
            C4588d.m23618b(z, "No data points specified in the input data set.");
            this.f18996d.add(m21702b);
            this.f18994b.add(dataSet);
            return this;
        }

        /* renamed from: a */
        public C5197a m21195a(Session session) {
            this.f18993a = session;
            return this;
        }

        /* renamed from: a */
        public SessionInsertRequest m21198a() {
            boolean z = true;
            C4588d.m23622a(this.f18993a != null, "Must specify a valid session.");
            if (this.f18993a.m21568b(TimeUnit.MILLISECONDS) == 0) {
                z = false;
            }
            C4588d.m23622a(z, "Must specify a valid end time, cannot insert a continuing session.");
            m21193b();
            return new SessionInsertRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionInsertRequest(int i, Session session, List<DataSet> list, List<DataPoint> list2, IBinder iBinder) {
        this.f18988a = i;
        this.f18989b = session;
        this.f18990c = Collections.unmodifiableList(list);
        this.f18991d = Collections.unmodifiableList(list2);
        this.f18992e = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public SessionInsertRequest(Session session, List<DataSet> list, List<DataPoint> list2, alq alqVar) {
        this.f18988a = 3;
        this.f18989b = session;
        this.f18990c = Collections.unmodifiableList(list);
        this.f18991d = Collections.unmodifiableList(list2);
        this.f18992e = alqVar;
    }

    private SessionInsertRequest(C5197a c5197a) {
        this(c5197a.f18993a, c5197a.f18994b, c5197a.f18995c, null);
    }

    public SessionInsertRequest(SessionInsertRequest sessionInsertRequest, alq alqVar) {
        this(sessionInsertRequest.f18989b, sessionInsertRequest.f18990c, sessionInsertRequest.f18991d, alqVar);
    }

    /* renamed from: a */
    private boolean m21203a(SessionInsertRequest sessionInsertRequest) {
        return C4585c.m23634a(this.f18989b, sessionInsertRequest.f18989b) && C4585c.m23634a(this.f18990c, sessionInsertRequest.f18990c) && C4585c.m23634a(this.f18991d, sessionInsertRequest.f18991d);
    }

    /* renamed from: a */
    public Session m21204a() {
        return this.f18989b;
    }

    /* renamed from: b */
    public List<DataSet> m21202b() {
        return this.f18990c;
    }

    /* renamed from: c */
    public List<DataPoint> m21201c() {
        return this.f18991d;
    }

    /* renamed from: d */
    public IBinder m21200d() {
        if (this.f18992e == null) {
            return null;
        }
        return this.f18992e.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m21199e() {
        return this.f18988a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionInsertRequest) && m21203a((SessionInsertRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18989b, this.f18990c, this.f18991d);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("session", this.f18989b).m23632a("dataSets", this.f18990c).m23632a("aggregateDataPoints", this.f18991d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5228e.m21031a(this, parcel, i);
    }
}
