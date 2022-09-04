package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class DataSourcesResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<DataSourcesResult> CREATOR = new C5254e();

    /* renamed from: a */
    private final int f19098a;

    /* renamed from: b */
    private final List<DataSource> f19099b;

    /* renamed from: c */
    private final Status f19100c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataSourcesResult(int i, List<DataSource> list, Status status) {
        this.f19098a = i;
        this.f19099b = Collections.unmodifiableList(list);
        this.f19100c = status;
    }

    public DataSourcesResult(List<DataSource> list, Status status) {
        this.f19098a = 3;
        this.f19099b = Collections.unmodifiableList(list);
        this.f19100c = status;
    }

    /* renamed from: a */
    public static DataSourcesResult m20943a(Status status) {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    /* renamed from: a */
    private boolean m20941a(DataSourcesResult dataSourcesResult) {
        return this.f19100c.equals(dataSourcesResult.f19100c) && C4585c.m23634a(this.f19099b, dataSourcesResult.f19099b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19100c;
    }

    /* renamed from: a */
    public List<DataSource> m20942a(DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (DataSource dataSource : this.f19099b) {
            if (dataSource.m21691a().equals(dataType)) {
                arrayList.add(dataSource);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public List<DataSource> m20940b() {
        return this.f19099b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20939c() {
        return this.f19098a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataSourcesResult) && m20941a((DataSourcesResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19100c, this.f19099b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19100c).m23632a("dataSources", this.f19099b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5254e.m20891a(this, parcel, i);
    }
}
