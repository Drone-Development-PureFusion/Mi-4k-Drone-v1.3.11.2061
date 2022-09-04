package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class DataReadResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<DataReadResult> CREATOR = new C5252c();

    /* renamed from: a */
    private final int f19085a;

    /* renamed from: b */
    private final List<DataSet> f19086b;

    /* renamed from: c */
    private final Status f19087c;

    /* renamed from: d */
    private final List<Bucket> f19088d;

    /* renamed from: e */
    private int f19089e;

    /* renamed from: f */
    private final List<DataSource> f19090f;

    /* renamed from: g */
    private final List<DataType> f19091g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataReadResult(int i, List<RawDataSet> list, Status status, List<RawBucket> list2, int i2, List<DataSource> list3, List<DataType> list4) {
        this.f19085a = i;
        this.f19087c = status;
        this.f19089e = i2;
        this.f19090f = list3;
        this.f19091g = list4;
        this.f19086b = new ArrayList(list.size());
        for (RawDataSet rawDataSet : list) {
            this.f19086b.add(new DataSet(rawDataSet, list3));
        }
        this.f19088d = new ArrayList(list2.size());
        for (RawBucket rawBucket : list2) {
            this.f19088d.add(new Bucket(rawBucket, list3));
        }
    }

    public DataReadResult(List<DataSet> list, List<Bucket> list2, Status status) {
        this.f19085a = 5;
        this.f19086b = list;
        this.f19087c = status;
        this.f19088d = list2;
        this.f19089e = 1;
        this.f19090f = new ArrayList();
        this.f19091g = new ArrayList();
    }

    /* renamed from: a */
    public static DataReadResult m20958a(Status status, List<DataType> list, List<DataSource> list2) {
        ArrayList arrayList = new ArrayList();
        for (DataSource dataSource : list2) {
            arrayList.add(DataSet.m21706a(dataSource));
        }
        for (DataType dataType : list) {
            arrayList.add(DataSet.m21706a(new DataSource.C5131a().m21670a(dataType).m21673a(1).m21668a("Default").m21674a()));
        }
        return new DataReadResult(arrayList, Collections.emptyList(), status);
    }

    /* renamed from: a */
    private void m20957a(Bucket bucket, List<Bucket> list) {
        for (Bucket bucket2 : list) {
            if (bucket2.m21750a(bucket)) {
                for (DataSet dataSet : bucket.m21742d()) {
                    m20956a(dataSet, bucket2.m21742d());
                }
                return;
            }
        }
        this.f19088d.add(bucket);
    }

    /* renamed from: a */
    private void m20956a(DataSet dataSet, List<DataSet> list) {
        for (DataSet dataSet2 : list) {
            if (dataSet2.m21702b().equals(dataSet.m21702b())) {
                dataSet2.m21700b(dataSet.m21697d());
                return;
            }
        }
        list.add(dataSet);
    }

    /* renamed from: b */
    private boolean m20951b(DataReadResult dataReadResult) {
        return this.f19087c.equals(dataReadResult.f19087c) && C4585c.m23634a(this.f19086b, dataReadResult.f19086b) && C4585c.m23634a(this.f19088d, dataReadResult.f19088d);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19087c;
    }

    /* renamed from: a */
    public DataSet m20955a(DataSource dataSource) {
        for (DataSet dataSet : this.f19086b) {
            if (dataSource.equals(dataSet.m21702b())) {
                return dataSet;
            }
        }
        return DataSet.m21706a(dataSource);
    }

    /* renamed from: a */
    public DataSet m20954a(DataType dataType) {
        for (DataSet dataSet : this.f19086b) {
            if (dataType.equals(dataSet.m21699c())) {
                return dataSet;
            }
        }
        return DataSet.m21706a(new DataSource.C5131a().m21670a(dataType).m21673a(1).m21674a());
    }

    /* renamed from: a */
    public void m20953a(DataReadResult dataReadResult) {
        for (DataSet dataSet : dataReadResult.m20952b()) {
            m20956a(dataSet, this.f19086b);
        }
        for (Bucket bucket : dataReadResult.m20950c()) {
            m20957a(bucket, this.f19088d);
        }
    }

    /* renamed from: b */
    public List<DataSet> m20952b() {
        return this.f19086b;
    }

    /* renamed from: c */
    public List<Bucket> m20950c() {
        return this.f19088d;
    }

    /* renamed from: d */
    public int m20949d() {
        return this.f19089e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m20948e() {
        return this.f19085a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataReadResult) && m20951b((DataReadResult) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List<RawBucket> m20947f() {
        ArrayList arrayList = new ArrayList(this.f19088d.size());
        for (Bucket bucket : this.f19088d) {
            arrayList.add(new RawBucket(bucket, this.f19090f, this.f19091g));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<RawDataSet> m20946g() {
        ArrayList arrayList = new ArrayList(this.f19086b.size());
        for (DataSet dataSet : this.f19086b) {
            arrayList.add(new RawDataSet(dataSet, this.f19090f, this.f19091g));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public List<DataSource> m20945h() {
        return this.f19090f;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19087c, this.f19086b, this.f19088d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public List<DataType> m20944i() {
        return this.f19091g;
    }

    public String toString() {
        Object obj;
        Object obj2;
        C4585c.C4587a m23632a = C4585c.m23635a(this).m23632a("status", this.f19087c);
        if (this.f19086b.size() > 5) {
            obj = new StringBuilder(21).append(this.f19086b.size()).append(" data sets").toString();
        } else {
            obj = this.f19086b;
        }
        C4585c.C4587a m23632a2 = m23632a.m23632a("dataSets", obj);
        if (this.f19088d.size() > 5) {
            obj2 = new StringBuilder(19).append(this.f19088d.size()).append(" buckets").toString();
        } else {
            obj2 = this.f19088d;
        }
        return m23632a2.m23632a("buckets", obj2).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5252c.m20897a(this, parcel, i);
    }
}
