package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.aky;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class DataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataSourcesRequest> CREATOR = new C5245v();

    /* renamed from: a */
    private final int f18909a;

    /* renamed from: b */
    private final List<DataType> f18910b;

    /* renamed from: c */
    private final List<Integer> f18911c;

    /* renamed from: d */
    private final boolean f18912d;

    /* renamed from: e */
    private final aky f18913e;

    /* renamed from: com.google.android.gms.fitness.request.DataSourcesRequest$a */
    /* loaded from: classes2.dex */
    public static class C5189a {

        /* renamed from: a */
        private DataType[] f18914a = new DataType[0];

        /* renamed from: b */
        private int[] f18915b = {0, 1};

        /* renamed from: c */
        private boolean f18916c = false;

        /* renamed from: c */
        static /* synthetic */ boolean m21294c(C5189a c5189a) {
            return false;
        }

        /* renamed from: a */
        public C5189a m21297a(int... iArr) {
            this.f18915b = iArr;
            return this;
        }

        /* renamed from: a */
        public C5189a m21296a(DataType... dataTypeArr) {
            this.f18914a = dataTypeArr;
            return this;
        }

        /* renamed from: a */
        public DataSourcesRequest m21299a() {
            boolean z = true;
            C4588d.m23622a(this.f18914a.length > 0, "Must add at least one data type");
            if (this.f18915b.length <= 0) {
                z = false;
            }
            C4588d.m23622a(z, "Must add at least one data source type");
            return new DataSourcesRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataSourcesRequest(int i, List<DataType> list, List<Integer> list2, boolean z, IBinder iBinder) {
        this.f18909a = i;
        this.f18910b = list;
        this.f18911c = list2;
        this.f18912d = z;
        this.f18913e = aky.AbstractBinderC6476a.m16991a(iBinder);
    }

    private DataSourcesRequest(C5189a c5189a) {
        this(C4679b.m23164a(c5189a.f18914a), Arrays.asList(C4679b.m23165a(c5189a.f18915b)), C5189a.m21294c(c5189a), null);
    }

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, aky akyVar) {
        this(dataSourcesRequest.f18910b, dataSourcesRequest.f18911c, dataSourcesRequest.f18912d, akyVar);
    }

    public DataSourcesRequest(List<DataType> list, List<Integer> list2, boolean z, aky akyVar) {
        this.f18909a = 4;
        this.f18910b = list;
        this.f18911c = list2;
        this.f18912d = z;
        this.f18913e = akyVar;
    }

    /* renamed from: a */
    public List<DataType> m21304a() {
        return this.f18910b;
    }

    /* renamed from: b */
    public List<Integer> m21303b() {
        return this.f18911c;
    }

    /* renamed from: c */
    public boolean m21302c() {
        return this.f18912d;
    }

    /* renamed from: d */
    public IBinder m21301d() {
        if (this.f18913e == null) {
            return null;
        }
        return this.f18913e.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m21300e() {
        return this.f18909a;
    }

    public String toString() {
        C4585c.C4587a m23632a = C4585c.m23635a(this).m23632a("dataTypes", this.f18910b).m23632a("sourceTypes", this.f18911c);
        if (this.f18912d) {
            m23632a.m23632a("includeDbOnlySources", "true");
        }
        return m23632a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5245v.m20980a(this, parcel, i);
    }
}
