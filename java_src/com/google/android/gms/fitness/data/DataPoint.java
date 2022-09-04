package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.fimi.soul.module.setting.newhand.C2954b;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import com.google.android.gms.internal.ake;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class DataPoint extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataPoint> CREATOR = new C5154l();

    /* renamed from: a */
    private final int f18390a;

    /* renamed from: b */
    private final DataSource f18391b;

    /* renamed from: c */
    private long f18392c;

    /* renamed from: d */
    private long f18393d;

    /* renamed from: e */
    private final Value[] f18394e;

    /* renamed from: f */
    private DataSource f18395f;

    /* renamed from: g */
    private long f18396g;

    /* renamed from: h */
    private long f18397h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataPoint(int i, DataSource dataSource, long j, long j2, Value[] valueArr, DataSource dataSource2, long j3, long j4) {
        this.f18390a = i;
        this.f18391b = dataSource;
        this.f18395f = dataSource2;
        this.f18392c = j;
        this.f18393d = j2;
        this.f18394e = valueArr;
        this.f18396g = j3;
        this.f18397h = j4;
    }

    private DataPoint(DataSource dataSource) {
        this.f18390a = 4;
        this.f18391b = (DataSource) C4588d.m23626a(dataSource, "Data source cannot be null");
        List<Field> m21656b = dataSource.m21691a().m21656b();
        this.f18394e = new Value[m21656b.size()];
        int i = 0;
        Iterator<Field> it2 = m21656b.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                this.f18394e[i2] = new Value(it2.next().m21623b());
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public DataPoint(DataSource dataSource, DataSource dataSource2, RawDataPoint rawDataPoint) {
        this(4, dataSource, m21728a(Long.valueOf(rawDataPoint.f18626b), 0L), m21728a(Long.valueOf(rawDataPoint.f18627c), 0L), rawDataPoint.f18628d, dataSource2, m21728a(Long.valueOf(rawDataPoint.f18631g), 0L), m21728a(Long.valueOf(rawDataPoint.f18632h), 0L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataPoint(List<DataSource> list, RawDataPoint rawDataPoint) {
        this(m21727a(list, rawDataPoint.f18629e), m21727a(list, rawDataPoint.f18630f), rawDataPoint);
    }

    /* renamed from: a */
    private static long m21728a(Long l, long j) {
        return l != null ? l.longValue() : j;
    }

    /* renamed from: a */
    public static DataPoint m21732a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (DataPoint) C4631c.m23445a(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    /* renamed from: a */
    public static DataPoint m21730a(DataSource dataSource) {
        return new DataPoint(dataSource);
    }

    /* renamed from: a */
    private static DataSource m21727a(List<DataSource> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a */
    private boolean m21731a(DataPoint dataPoint) {
        return C4585c.m23634a(this.f18391b, dataPoint.f18391b) && this.f18392c == dataPoint.f18392c && this.f18393d == dataPoint.f18393d && Arrays.equals(this.f18394e, dataPoint.f18394e) && C4585c.m23634a(m21718d(), dataPoint.m21718d());
    }

    /* renamed from: b */
    private void m21722b(int i) {
        List<Field> m21656b = m21723b().m21656b();
        int size = m21656b.size();
        C4588d.m23617b(i == size, "Attempting to insert %s values, but needed %s: %s", Integer.valueOf(i), Integer.valueOf(size), m21656b);
    }

    /* renamed from: l */
    private boolean m21710l() {
        return m21723b() == DataType.f18461p;
    }

    /* renamed from: a */
    public long m21726a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18392c, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public DataPoint m21734a(long j, long j2, TimeUnit timeUnit) {
        this.f18393d = timeUnit.toNanos(j);
        this.f18392c = timeUnit.toNanos(j2);
        return this;
    }

    /* renamed from: a */
    public DataPoint m21733a(long j, TimeUnit timeUnit) {
        this.f18392c = timeUnit.toNanos(j);
        if (m21710l() && ake.m17050a(timeUnit)) {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            this.f18392c = ake.m17051a(this.f18392c, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    /* renamed from: a */
    public DataPoint m21725a(float... fArr) {
        m21722b(fArr.length);
        for (int i = 0; i < fArr.length; i++) {
            this.f18394e[i].m21519a(fArr[i]);
        }
        return this;
    }

    /* renamed from: a */
    public DataPoint m21724a(int... iArr) {
        m21722b(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            this.f18394e[i].m21518a(iArr[i]);
        }
        return this;
    }

    /* renamed from: a */
    public Value m21735a(int i) {
        DataType m21723b = m21723b();
        if (i < 0 || i >= m21723b.m21656b().size()) {
            throw new IllegalArgumentException(String.format("fieldIndex %s is out of range for %s", Integer.valueOf(i), m21723b));
        }
        return this.f18394e[i];
    }

    /* renamed from: a */
    public Value m21729a(Field field) {
        return this.f18394e[m21723b().m21657a(field)];
    }

    /* renamed from: a */
    public Value[] m21736a() {
        return this.f18394e;
    }

    /* renamed from: b */
    public long m21721b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18393d, TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public DataType m21723b() {
        return this.f18391b.m21691a();
    }

    /* renamed from: c */
    public long m21719c(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18392c, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public DataSource m21720c() {
        return this.f18391b;
    }

    /* renamed from: d */
    public DataSource m21718d() {
        return this.f18395f != null ? this.f18395f : this.f18391b;
    }

    /* renamed from: e */
    public DataSource m21717e() {
        return this.f18395f;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataPoint) && m21731a((DataPoint) obj));
    }

    /* renamed from: f */
    public long m21716f() {
        return this.f18396g;
    }

    /* renamed from: g */
    public long m21715g() {
        return this.f18397h;
    }

    /* renamed from: h */
    public void m21714h() {
        C4588d.m23617b(m21723b().m21659a().equals(m21720c().m21691a().m21659a()), "Conflicting data types found %s vs %s", m21723b(), m21723b());
        C4588d.m23617b(this.f18392c > 0, "Data point does not have the timestamp set: %s", this);
        C4588d.m23617b(this.f18393d <= this.f18392c, "Data point with start time greater than end time found: %s", this);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18391b, Long.valueOf(this.f18392c), Long.valueOf(this.f18393d));
    }

    /* renamed from: i */
    public int m21713i() {
        return this.f18390a;
    }

    /* renamed from: j */
    public long m21712j() {
        return this.f18392c;
    }

    /* renamed from: k */
    public long m21711k() {
        return this.f18393d;
    }

    public String toString() {
        Object[] objArr = new Object[7];
        objArr[0] = Arrays.toString(this.f18394e);
        objArr[1] = Long.valueOf(this.f18393d);
        objArr[2] = Long.valueOf(this.f18392c);
        objArr[3] = Long.valueOf(this.f18396g);
        objArr[4] = Long.valueOf(this.f18397h);
        objArr[5] = this.f18391b.m21678j();
        objArr[6] = this.f18395f != null ? this.f18395f.m21678j() : C2954b.f10832au;
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5154l.m21448a(this, parcel, i);
    }
}
