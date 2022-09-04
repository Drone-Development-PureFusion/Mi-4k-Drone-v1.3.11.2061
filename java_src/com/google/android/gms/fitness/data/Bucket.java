package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.C5129d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class Bucket extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Bucket> CREATOR = new C5151i();

    /* renamed from: a */
    public static final int f18378a = 1;

    /* renamed from: b */
    public static final int f18379b = 2;

    /* renamed from: c */
    public static final int f18380c = 3;

    /* renamed from: d */
    public static final int f18381d = 4;

    /* renamed from: e */
    private final int f18382e;

    /* renamed from: f */
    private final long f18383f;

    /* renamed from: g */
    private final long f18384g;

    /* renamed from: h */
    private final Session f18385h;

    /* renamed from: i */
    private final int f18386i;

    /* renamed from: j */
    private final List<DataSet> f18387j;

    /* renamed from: k */
    private final int f18388k;

    /* renamed from: l */
    private boolean f18389l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bucket(int i, long j, long j2, Session session, int i2, List<DataSet> list, int i3, boolean z) {
        this.f18389l = false;
        this.f18382e = i;
        this.f18383f = j;
        this.f18384g = j2;
        this.f18385h = session;
        this.f18386i = i2;
        this.f18387j = list;
        this.f18388k = i3;
        this.f18389l = z;
    }

    public Bucket(RawBucket rawBucket, List<DataSource> list) {
        this(2, rawBucket.f18618b, rawBucket.f18619c, rawBucket.f18620d, rawBucket.f18621e, m21748a(rawBucket.f18622f, list), rawBucket.f18623g, rawBucket.f18624h);
    }

    /* renamed from: a */
    public static String m21751a(int i) {
        switch (i) {
            case 0:
                return "unknown";
            case 1:
                return C3070c.C3071a.f11505i;
            case 2:
                return "session";
            case 3:
                return "type";
            case 4:
                return "segment";
            default:
                return "bug";
        }
    }

    /* renamed from: a */
    private static List<DataSet> m21748a(Collection<RawDataSet> collection, List<DataSource> list) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (RawDataSet rawDataSet : collection) {
            arrayList.add(new DataSet(rawDataSet, list));
        }
        return arrayList;
    }

    /* renamed from: b */
    private boolean m21745b(Bucket bucket) {
        return this.f18383f == bucket.f18383f && this.f18384g == bucket.f18384g && this.f18386i == bucket.f18386i && C4585c.m23634a(this.f18387j, bucket.f18387j) && this.f18388k == bucket.f18388k && this.f18389l == bucket.f18389l;
    }

    /* renamed from: a */
    public long m21747a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18383f, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public DataSet m21749a(DataType dataType) {
        for (DataSet dataSet : this.f18387j) {
            if (dataSet.m21699c().equals(dataType)) {
                return dataSet;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Session m21752a() {
        return this.f18385h;
    }

    /* renamed from: a */
    public boolean m21750a(Bucket bucket) {
        return this.f18383f == bucket.f18383f && this.f18384g == bucket.f18384g && this.f18386i == bucket.f18386i && this.f18388k == bucket.f18388k;
    }

    /* renamed from: b */
    public long m21744b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18384g, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public String m21746b() {
        return C5129d.m21768a(this.f18386i);
    }

    /* renamed from: c */
    public int m21743c() {
        return this.f18386i;
    }

    /* renamed from: d */
    public List<DataSet> m21742d() {
        return this.f18387j;
    }

    /* renamed from: e */
    public int m21741e() {
        return this.f18388k;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Bucket) && m21745b((Bucket) obj));
    }

    /* renamed from: f */
    public boolean m21740f() {
        if (this.f18389l) {
            return true;
        }
        for (DataSet dataSet : this.f18387j) {
            if (dataSet.m21695f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m21739g() {
        return this.f18382e;
    }

    /* renamed from: h */
    public long m21738h() {
        return this.f18383f;
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18383f), Long.valueOf(this.f18384g), Integer.valueOf(this.f18386i), Integer.valueOf(this.f18388k));
    }

    /* renamed from: i */
    public long m21737i() {
        return this.f18384g;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("startTime", Long.valueOf(this.f18383f)).m23632a("endTime", Long.valueOf(this.f18384g)).m23632a("activity", Integer.valueOf(this.f18386i)).m23632a("dataSets", this.f18387j).m23632a("bucketType", m21751a(this.f18388k)).m23632a("serverHasMoreData", Boolean.valueOf(this.f18389l)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5151i.m21463a(this, parcel, i);
    }
}
