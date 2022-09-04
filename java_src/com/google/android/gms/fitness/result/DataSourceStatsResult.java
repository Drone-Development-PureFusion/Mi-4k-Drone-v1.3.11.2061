package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
/* loaded from: classes2.dex */
public class DataSourceStatsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataSourceStatsResult> CREATOR = new C5253d();

    /* renamed from: a */
    final int f19092a;

    /* renamed from: b */
    public final DataSource f19093b;

    /* renamed from: c */
    public final long f19094c;

    /* renamed from: d */
    public final boolean f19095d;

    /* renamed from: e */
    public final long f19096e;

    /* renamed from: f */
    public final long f19097f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataSourceStatsResult(int i, DataSource dataSource, long j, boolean z, long j2, long j3) {
        this.f19092a = i;
        this.f19093b = dataSource;
        this.f19094c = j;
        this.f19095d = z;
        this.f19096e = j2;
        this.f19097f = j3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5253d.m20894a(this, parcel, i);
    }
}
