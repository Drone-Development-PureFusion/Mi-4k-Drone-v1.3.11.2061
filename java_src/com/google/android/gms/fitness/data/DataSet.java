package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class DataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataSet> CREATOR = new C5155m();

    /* renamed from: a */
    private final int f18398a;

    /* renamed from: b */
    private final DataSource f18399b;

    /* renamed from: c */
    private final DataType f18400c;

    /* renamed from: d */
    private final List<DataPoint> f18401d;

    /* renamed from: e */
    private final List<DataSource> f18402e;

    /* renamed from: f */
    private boolean f18403f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataSet(int i, DataSource dataSource, DataType dataType, List<RawDataPoint> list, List<DataSource> list2, boolean z) {
        this.f18403f = false;
        this.f18398a = i;
        this.f18399b = dataSource;
        this.f18400c = dataSource.m21691a();
        this.f18403f = z;
        this.f18401d = new ArrayList(list.size());
        this.f18402e = i < 2 ? Collections.singletonList(dataSource) : list2;
        for (RawDataPoint rawDataPoint : list) {
            this.f18401d.add(new DataPoint(this.f18402e, rawDataPoint));
        }
    }

    public DataSet(DataSource dataSource) {
        this.f18403f = false;
        this.f18398a = 3;
        this.f18399b = (DataSource) C4588d.m23627a(dataSource);
        this.f18400c = dataSource.m21691a();
        this.f18401d = new ArrayList();
        this.f18402e = new ArrayList();
        this.f18402e.add(this.f18399b);
    }

    public DataSet(RawDataSet rawDataSet, List<DataSource> list) {
        this.f18403f = false;
        this.f18398a = 3;
        this.f18399b = (DataSource) m21703a(list, rawDataSet.f18634b);
        this.f18400c = this.f18399b.m21691a();
        this.f18402e = list;
        this.f18403f = rawDataSet.f18637e;
        List<RawDataPoint> list2 = rawDataSet.f18636d;
        this.f18401d = new ArrayList(list2.size());
        for (RawDataPoint rawDataPoint : list2) {
            this.f18401d.add(new DataPoint(this.f18402e, rawDataPoint));
        }
    }

    /* renamed from: a */
    public static DataSet m21706a(DataSource dataSource) {
        C4588d.m23626a(dataSource, "DataSource should be specified");
        return new DataSet(dataSource);
    }

    /* renamed from: a */
    private static <T> T m21703a(List<T> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a */
    private boolean m21707a(DataSet dataSet) {
        return C4585c.m23634a(m21699c(), dataSet.m21699c()) && C4585c.m23634a(this.f18399b, dataSet.f18399b) && C4585c.m23634a(this.f18401d, dataSet.f18401d) && this.f18403f == dataSet.f18403f;
    }

    /* renamed from: c */
    public static void m21698c(DataPoint dataPoint) {
        String m17021a = akl.m17021a(dataPoint, C5152j.f18749a);
        if (m17021a != null) {
            String valueOf = String.valueOf(dataPoint);
            Log.w("Fitness", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid data point: ").append(valueOf).toString());
            throw new IllegalArgumentException(m17021a);
        }
    }

    /* renamed from: a */
    public DataPoint m21709a() {
        return DataPoint.m21730a(this.f18399b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<RawDataPoint> m21704a(List<DataSource> list) {
        ArrayList arrayList = new ArrayList(this.f18401d.size());
        for (DataPoint dataPoint : this.f18401d) {
            arrayList.add(new RawDataPoint(dataPoint, list));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m21708a(DataPoint dataPoint) {
        DataSource m21720c = dataPoint.m21720c();
        C4588d.m23617b(m21720c.m21679i().equals(this.f18399b.m21679i()), "Conflicting data sources found %s vs %s", m21720c, this.f18399b);
        dataPoint.m21714h();
        m21698c(dataPoint);
        m21701b(dataPoint);
    }

    /* renamed from: a */
    public void m21705a(Iterable<DataPoint> iterable) {
        for (DataPoint dataPoint : iterable) {
            m21708a(dataPoint);
        }
    }

    /* renamed from: b */
    public DataSource m21702b() {
        return this.f18399b;
    }

    /* renamed from: b */
    public void m21701b(DataPoint dataPoint) {
        this.f18401d.add(dataPoint);
        DataSource m21718d = dataPoint.m21718d();
        if (m21718d == null || this.f18402e.contains(m21718d)) {
            return;
        }
        this.f18402e.add(m21718d);
    }

    /* renamed from: b */
    public void m21700b(Iterable<DataPoint> iterable) {
        for (DataPoint dataPoint : iterable) {
            m21701b(dataPoint);
        }
    }

    /* renamed from: c */
    public DataType m21699c() {
        return this.f18399b.m21691a();
    }

    /* renamed from: d */
    public List<DataPoint> m21697d() {
        return Collections.unmodifiableList(this.f18401d);
    }

    /* renamed from: e */
    public boolean m21696e() {
        return this.f18401d.isEmpty();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataSet) && m21707a((DataSet) obj));
    }

    /* renamed from: f */
    public boolean m21695f() {
        return this.f18403f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m21694g() {
        return this.f18398a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public List<RawDataPoint> m21693h() {
        return m21704a(this.f18402e);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18399b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public List<DataSource> m21692i() {
        return this.f18402e;
    }

    public String toString() {
        List<RawDataPoint> m21693h = m21693h();
        Object[] objArr = new Object[2];
        objArr[0] = this.f18399b.m21678j();
        Object obj = m21693h;
        if (this.f18401d.size() >= 10) {
            obj = String.format("%d data points, first 5: %s", Integer.valueOf(this.f18401d.size()), m21693h.subList(0, 5));
        }
        objArr[1] = obj;
        return String.format("DataSet{%s %s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5155m.m21445a(this, parcel, i);
    }
}
