package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class DataStatsResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<DataStatsResult> CREATOR = new C5255f();

    /* renamed from: a */
    private final int f19101a;

    /* renamed from: b */
    private final Status f19102b;

    /* renamed from: c */
    private final List<DataSourceStatsResult> f19103c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataStatsResult(int i, Status status, List<DataSourceStatsResult> list) {
        this.f19101a = i;
        this.f19102b = status;
        this.f19103c = list;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19102b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m20938b() {
        return this.f19101a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<DataSourceStatsResult> m20937c() {
        return this.f19103c;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "DataStatsResult{%s %d sources}", this.f19102b, Integer.valueOf(this.f19103c.size()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5255f.m20888a(this, parcel, i);
    }
}
