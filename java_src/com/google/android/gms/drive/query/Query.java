package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes.dex */
public class Query extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Query> CREATOR = new C5033d();

    /* renamed from: a */
    final LogicalFilter f18021a;

    /* renamed from: b */
    final String f18022b;

    /* renamed from: c */
    final SortOrder f18023c;

    /* renamed from: d */
    final List<String> f18024d;

    /* renamed from: e */
    final boolean f18025e;

    /* renamed from: f */
    final List<DriveSpace> f18026f;

    /* renamed from: g */
    final boolean f18027g;

    /* renamed from: h */
    final int f18028h;

    /* renamed from: i */
    private final Set<DriveSpace> f18029i;

    /* renamed from: com.google.android.gms.drive.query.Query$a */
    /* loaded from: classes.dex */
    public static class C5027a {

        /* renamed from: a */
        private final List<Filter> f18030a = new ArrayList();

        /* renamed from: b */
        private String f18031b;

        /* renamed from: c */
        private SortOrder f18032c;

        /* renamed from: d */
        private List<String> f18033d;

        /* renamed from: e */
        private boolean f18034e;

        /* renamed from: f */
        private Set<DriveSpace> f18035f;

        /* renamed from: g */
        private boolean f18036g;

        public C5027a() {
        }

        public C5027a(Query query) {
            this.f18030a.add(query.m22053a());
            this.f18031b = query.m22052b();
            this.f18032c = query.m22051c();
            this.f18033d = query.m22050d();
            this.f18034e = query.m22049e();
            this.f18035f = query.m22048f();
            this.f18036g = query.m22047g();
        }

        /* renamed from: a */
        public C5027a m22045a(Filter filter) {
            if (!(filter instanceof MatchAllFilter)) {
                this.f18030a.add(filter);
            }
            return this;
        }

        /* renamed from: a */
        public C5027a m22044a(SortOrder sortOrder) {
            this.f18032c = sortOrder;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C5027a m22043a(String str) {
            this.f18031b = str;
            return this;
        }

        /* renamed from: a */
        public Query m22046a() {
            return new Query(new LogicalFilter(Operator.f18101f, this.f18030a), this.f18031b, this.f18032c, this.f18033d, this.f18034e, this.f18035f, this.f18036g);
        }
    }

    private Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2, Set<DriveSpace> set, boolean z2) {
        this.f18028h = i;
        this.f18021a = logicalFilter;
        this.f18022b = str;
        this.f18023c = sortOrder;
        this.f18024d = list;
        this.f18025e = z;
        this.f18026f = list2;
        this.f18029i = set;
        this.f18027g = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2, boolean z2) {
        this(i, logicalFilter, str, sortOrder, list, z, list2, list2 == null ? null : new HashSet(list2), z2);
    }

    private Query(LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, Set<DriveSpace> set, boolean z2) {
        this(1, logicalFilter, str, sortOrder, list, z, set == null ? null : new ArrayList(set), set, z2);
    }

    /* renamed from: a */
    public Filter m22053a() {
        return this.f18021a;
    }

    @Deprecated
    /* renamed from: b */
    public String m22052b() {
        return this.f18022b;
    }

    /* renamed from: c */
    public SortOrder m22051c() {
        return this.f18023c;
    }

    /* renamed from: d */
    public List<String> m22050d() {
        return this.f18024d;
    }

    /* renamed from: e */
    public boolean m22049e() {
        return this.f18025e;
    }

    /* renamed from: f */
    public Set<DriveSpace> m22048f() {
        return this.f18029i;
    }

    /* renamed from: g */
    public boolean m22047g() {
        return this.f18027g;
    }

    public String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", this.f18021a, this.f18023c, this.f18022b, this.f18026f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5033d.m22021a(this, parcel, i);
    }
}
