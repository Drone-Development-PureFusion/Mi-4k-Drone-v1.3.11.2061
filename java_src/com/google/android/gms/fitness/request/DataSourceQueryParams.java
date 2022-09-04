package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
/* loaded from: classes2.dex */
public class DataSourceQueryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataSourceQueryParams> CREATOR = new C5244u();

    /* renamed from: a */
    final int f18902a;

    /* renamed from: b */
    public final DataSource f18903b;

    /* renamed from: c */
    public final long f18904c;

    /* renamed from: d */
    public final long f18905d;

    /* renamed from: e */
    public final long f18906e;

    /* renamed from: f */
    public final int f18907f;

    /* renamed from: g */
    public final int f18908g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataSourceQueryParams(int i, DataSource dataSource, long j, long j2, long j3, int i2, int i3) {
        this.f18902a = i;
        this.f18903b = dataSource;
        this.f18904c = j;
        this.f18905d = j2;
        this.f18906e = j3;
        this.f18907f = i2;
        this.f18908g = i3;
    }

    public String toString() {
        return String.format("{%1$s, %2$tF %2$tT - %3$tF %3$tT (%4$s %5$s)}", this.f18903b.m21678j(), Long.valueOf(this.f18905d / 1000000), Long.valueOf(this.f18906e / 1000000), Integer.valueOf(this.f18907f), Integer.valueOf(this.f18908g));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5244u.m20983a(this, parcel, i);
    }
}
