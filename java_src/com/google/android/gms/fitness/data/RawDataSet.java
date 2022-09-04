package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akf;
import java.util.List;
@KeepName
/* loaded from: classes2.dex */
public final class RawDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RawDataSet> CREATOR = new C5142ad();

    /* renamed from: a */
    final int f18633a;

    /* renamed from: b */
    public final int f18634b;

    /* renamed from: c */
    public final int f18635c;

    /* renamed from: d */
    public final List<RawDataPoint> f18636d;

    /* renamed from: e */
    public final boolean f18637e;

    public RawDataSet(int i, int i2, int i3, List<RawDataPoint> list, boolean z) {
        this.f18633a = i;
        this.f18634b = i2;
        this.f18635c = i3;
        this.f18636d = list;
        this.f18637e = z;
    }

    public RawDataSet(DataSet dataSet, List<DataSource> list, List<DataType> list2) {
        this.f18633a = 3;
        this.f18636d = dataSet.m21704a(list);
        this.f18637e = dataSet.m21695f();
        this.f18634b = akf.m17048a(dataSet.m21702b(), list);
        this.f18635c = akf.m17048a(dataSet.m21699c(), list2);
    }

    /* renamed from: a */
    private boolean m21575a(RawDataSet rawDataSet) {
        return this.f18634b == rawDataSet.f18634b && this.f18637e == rawDataSet.f18637e && C4585c.m23634a(this.f18636d, rawDataSet.f18636d);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawDataSet) && m21575a((RawDataSet) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f18634b));
    }

    public String toString() {
        return String.format("RawDataSet{%s@[%s]}", Integer.valueOf(this.f18634b), this.f18636d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5142ad.m21487a(this, parcel, i);
    }
}
