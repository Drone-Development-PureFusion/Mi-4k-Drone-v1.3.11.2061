package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class SessionReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionReadRequest> CREATOR = new C5229f();

    /* renamed from: a */
    private final int f18997a;

    /* renamed from: b */
    private final String f18998b;

    /* renamed from: c */
    private final String f18999c;

    /* renamed from: d */
    private final long f19000d;

    /* renamed from: e */
    private final long f19001e;

    /* renamed from: f */
    private final List<DataType> f19002f;

    /* renamed from: g */
    private final List<DataSource> f19003g;

    /* renamed from: h */
    private boolean f19004h;

    /* renamed from: i */
    private final boolean f19005i;

    /* renamed from: j */
    private final List<String> f19006j;

    /* renamed from: k */
    private final alo f19007k;

    /* renamed from: com.google.android.gms.fitness.request.SessionReadRequest$a */
    /* loaded from: classes2.dex */
    public static class C5199a {

        /* renamed from: a */
        private String f19008a;

        /* renamed from: b */
        private String f19009b;

        /* renamed from: c */
        private long f19010c = 0;

        /* renamed from: d */
        private long f19011d = 0;

        /* renamed from: e */
        private List<DataType> f19012e = new ArrayList();

        /* renamed from: f */
        private List<DataSource> f19013f = new ArrayList();

        /* renamed from: g */
        private boolean f19014g = false;

        /* renamed from: h */
        private boolean f19015h = false;

        /* renamed from: i */
        private List<String> f19016i = new ArrayList();

        /* renamed from: a */
        public C5199a m21172a() {
            this.f19014g = true;
            return this;
        }

        /* renamed from: a */
        public C5199a m21171a(long j, long j2, TimeUnit timeUnit) {
            this.f19010c = timeUnit.toMillis(j);
            this.f19011d = timeUnit.toMillis(j2);
            return this;
        }

        /* renamed from: a */
        public C5199a m21170a(DataSource dataSource) {
            C4588d.m23626a(dataSource, "Attempting to add a null data source");
            if (!this.f19013f.contains(dataSource)) {
                this.f19013f.add(dataSource);
            }
            return this;
        }

        /* renamed from: a */
        public C5199a m21169a(DataType dataType) {
            C4588d.m23626a(dataType, "Attempting to use a null data type");
            if (!this.f19012e.contains(dataType)) {
                this.f19012e.add(dataType);
            }
            return this;
        }

        /* renamed from: a */
        public C5199a m21167a(String str) {
            this.f19008a = str;
            return this;
        }

        /* renamed from: b */
        public C5199a m21166b() {
            this.f19015h = true;
            return this;
        }

        /* renamed from: b */
        public C5199a m21164b(String str) {
            this.f19009b = str;
            return this;
        }

        /* renamed from: c */
        public C5199a m21161c(String str) {
            C4588d.m23626a(str, (Object) "Attempting to use a null package name");
            if (!this.f19016i.contains(str)) {
                this.f19016i.add(str);
            }
            return this;
        }

        /* renamed from: c */
        public SessionReadRequest m21163c() {
            C4588d.m23617b(this.f19010c > 0, "Invalid start time: %s", Long.valueOf(this.f19010c));
            C4588d.m23617b(this.f19011d > 0 && this.f19011d > this.f19010c, "Invalid end time: %s", Long.valueOf(this.f19011d));
            return new SessionReadRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionReadRequest(int i, String str, String str2, long j, long j2, List<DataType> list, List<DataSource> list2, boolean z, boolean z2, List<String> list3, IBinder iBinder) {
        this.f18997a = i;
        this.f18998b = str;
        this.f18999c = str2;
        this.f19000d = j;
        this.f19001e = j2;
        this.f19002f = list;
        this.f19003g = list2;
        this.f19004h = z;
        this.f19005i = z2;
        this.f19006j = list3;
        this.f19007k = alo.AbstractBinderC6508a.m16934a(iBinder);
    }

    private SessionReadRequest(C5199a c5199a) {
        this(c5199a.f19008a, c5199a.f19009b, c5199a.f19010c, c5199a.f19011d, c5199a.f19012e, c5199a.f19013f, c5199a.f19014g, c5199a.f19015h, c5199a.f19016i, null);
    }

    public SessionReadRequest(SessionReadRequest sessionReadRequest, alo aloVar) {
        this(sessionReadRequest.f18998b, sessionReadRequest.f18999c, sessionReadRequest.f19000d, sessionReadRequest.f19001e, sessionReadRequest.f19002f, sessionReadRequest.f19003g, sessionReadRequest.f19004h, sessionReadRequest.f19005i, sessionReadRequest.f19006j, aloVar);
    }

    public SessionReadRequest(String str, String str2, long j, long j2, List<DataType> list, List<DataSource> list2, boolean z, boolean z2, List<String> list3, alo aloVar) {
        this(5, str, str2, j, j2, list, list2, z, z2, list3, aloVar == null ? null : aloVar.asBinder());
    }

    /* renamed from: a */
    private boolean m21186a(SessionReadRequest sessionReadRequest) {
        return C4585c.m23634a(this.f18998b, sessionReadRequest.f18998b) && this.f18999c.equals(sessionReadRequest.f18999c) && this.f19000d == sessionReadRequest.f19000d && this.f19001e == sessionReadRequest.f19001e && C4585c.m23634a(this.f19002f, sessionReadRequest.f19002f) && C4585c.m23634a(this.f19003g, sessionReadRequest.f19003g) && this.f19004h == sessionReadRequest.f19004h && this.f19006j.equals(sessionReadRequest.f19006j) && this.f19005i == sessionReadRequest.f19005i;
    }

    /* renamed from: a */
    public long m21185a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f19000d, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public String m21187a() {
        return this.f18998b;
    }

    /* renamed from: b */
    public long m21183b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f19001e, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public String m21184b() {
        return this.f18999c;
    }

    /* renamed from: c */
    public List<DataType> m21182c() {
        return this.f19002f;
    }

    /* renamed from: d */
    public List<DataSource> m21181d() {
        return this.f19003g;
    }

    /* renamed from: e */
    public boolean m21180e() {
        return this.f19004h;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionReadRequest) && m21186a((SessionReadRequest) obj));
    }

    /* renamed from: f */
    public List<String> m21179f() {
        return this.f19006j;
    }

    /* renamed from: g */
    public boolean m21178g() {
        return this.f19005i;
    }

    /* renamed from: h */
    public long m21177h() {
        return this.f19001e;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18998b, this.f18999c, Long.valueOf(this.f19000d), Long.valueOf(this.f19001e));
    }

    /* renamed from: i */
    public long m21176i() {
        return this.f19000d;
    }

    /* renamed from: j */
    public boolean m21175j() {
        return this.f19004h;
    }

    /* renamed from: k */
    public IBinder m21174k() {
        if (this.f19007k == null) {
            return null;
        }
        return this.f19007k.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m21173l() {
        return this.f18997a;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("sessionName", this.f18998b).m23632a("sessionId", this.f18999c).m23632a("startTimeMillis", Long.valueOf(this.f19000d)).m23632a("endTimeMillis", Long.valueOf(this.f19001e)).m23632a("dataTypes", this.f19002f).m23632a("dataSources", this.f19003g).m23632a("sessionsFromAllApps", Boolean.valueOf(this.f19004h)).m23632a("excludedPackages", this.f19006j).m23632a("useServer", Boolean.valueOf(this.f19005i)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5229f.m21028a(this, parcel, i);
    }
}
