package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
/* loaded from: classes2.dex */
public class DailyTotalResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<DailyTotalResult> CREATOR = new C5251b();

    /* renamed from: a */
    private final int f19082a;

    /* renamed from: b */
    private final Status f19083b;

    /* renamed from: c */
    private final DataSet f19084c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DailyTotalResult(int i, Status status, DataSet dataSet) {
        this.f19082a = i;
        this.f19083b = status;
        this.f19084c = dataSet;
    }

    public DailyTotalResult(DataSet dataSet, Status status) {
        this.f19082a = 1;
        this.f19083b = status;
        this.f19084c = dataSet;
    }

    /* renamed from: a */
    public static DailyTotalResult m20962a(Status status, DataType dataType) {
        return new DailyTotalResult(DataSet.m21706a(new DataSource.C5131a().m21670a(dataType).m21673a(1).m21674a()), status);
    }

    /* renamed from: a */
    private boolean m20961a(DailyTotalResult dailyTotalResult) {
        return this.f19083b.equals(dailyTotalResult.f19083b) && C4585c.m23634a(this.f19084c, dailyTotalResult.f19084c);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19083b;
    }

    @Nullable
    /* renamed from: b */
    public DataSet m20960b() {
        return this.f19084c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20959c() {
        return this.f19082a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DailyTotalResult) && m20961a((DailyTotalResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19083b, this.f19084c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19083b).m23632a("dataPoint", this.f19084c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5251b.m20900a(this, parcel, i);
    }
}
