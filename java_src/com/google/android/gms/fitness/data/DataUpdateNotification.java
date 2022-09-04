package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class DataUpdateNotification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataUpdateNotification> CREATOR = new C5159q();

    /* renamed from: a */
    public static final String f18476a = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";

    /* renamed from: b */
    public static final int f18477b = 1;

    /* renamed from: c */
    public static final int f18478c = 2;

    /* renamed from: d */
    public static final int f18479d = 3;

    /* renamed from: e */
    public static final String f18480e = "vnd.google.fitness.data_udpate_notification";

    /* renamed from: f */
    final int f18481f;

    /* renamed from: g */
    private final long f18482g;

    /* renamed from: h */
    private final long f18483h;

    /* renamed from: i */
    private final int f18484i;

    /* renamed from: j */
    private final DataSource f18485j;

    /* renamed from: k */
    private final DataType f18486k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataUpdateNotification(int i, long j, long j2, int i2, DataSource dataSource, DataType dataType) {
        this.f18481f = i;
        this.f18482g = j;
        this.f18483h = j2;
        this.f18484i = i2;
        this.f18485j = dataSource;
        this.f18486k = dataType;
    }

    /* renamed from: a */
    public static DataUpdateNotification m21650a(Intent intent) {
        return (DataUpdateNotification) C4631c.m23445a(intent, f18480e, CREATOR);
    }

    /* renamed from: a */
    private boolean m21649a(DataUpdateNotification dataUpdateNotification) {
        return this.f18482g == dataUpdateNotification.f18482g && this.f18483h == dataUpdateNotification.f18483h && this.f18484i == dataUpdateNotification.f18484i && C4585c.m23634a(this.f18485j, dataUpdateNotification.f18485j) && C4585c.m23634a(this.f18486k, dataUpdateNotification.f18486k);
    }

    /* renamed from: a */
    public long m21651a() {
        return this.f18482g;
    }

    /* renamed from: a */
    public long m21648a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18482g, TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public long m21647b() {
        return this.f18483h;
    }

    /* renamed from: b */
    public long m21646b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18483h, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public int m21645c() {
        return this.f18484i;
    }

    /* renamed from: d */
    public DataSource m21644d() {
        return this.f18485j;
    }

    /* renamed from: e */
    public DataType m21643e() {
        return this.f18486k;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateNotification) && m21649a((DataUpdateNotification) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18482g), Long.valueOf(this.f18483h), Integer.valueOf(this.f18484i), this.f18485j, this.f18486k);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("updateStartTimeNanos", Long.valueOf(this.f18482g)).m23632a("updateEndTimeNanos", Long.valueOf(this.f18483h)).m23632a("operationType", Integer.valueOf(this.f18484i)).m23632a("dataSource", this.f18485j).m23632a("dataType", this.f18486k).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5159q.m21435a(this, parcel, i);
    }
}
