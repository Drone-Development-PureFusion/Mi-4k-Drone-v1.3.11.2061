package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import com.google.android.gms.fitness.C5129d;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class Session extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Session> CREATOR = new C5145c();

    /* renamed from: a */
    public static final String f18638a = "vnd.google.fitness.session";

    /* renamed from: b */
    public static final String f18639b = "vnd.google.fitness.session/";

    /* renamed from: c */
    private final int f18640c;

    /* renamed from: d */
    private final long f18641d;

    /* renamed from: e */
    private final long f18642e;

    /* renamed from: f */
    private final String f18643f;

    /* renamed from: g */
    private final String f18644g;

    /* renamed from: h */
    private final String f18645h;

    /* renamed from: i */
    private final int f18646i;

    /* renamed from: j */
    private final Application f18647j;

    /* renamed from: k */
    private final Long f18648k;

    /* renamed from: com.google.android.gms.fitness.data.Session$a */
    /* loaded from: classes2.dex */
    public static class C5135a {

        /* renamed from: d */
        private String f18652d;

        /* renamed from: e */
        private String f18653e;

        /* renamed from: g */
        private Long f18655g;

        /* renamed from: a */
        private long f18649a = 0;

        /* renamed from: b */
        private long f18650b = 0;

        /* renamed from: c */
        private String f18651c = null;

        /* renamed from: f */
        private int f18654f = 4;

        /* renamed from: g */
        static /* synthetic */ Application m21540g(C5135a c5135a) {
            return null;
        }

        /* renamed from: a */
        public C5135a m21554a(int i) {
            this.f18654f = i;
            return this;
        }

        /* renamed from: a */
        public C5135a m21553a(long j, TimeUnit timeUnit) {
            C4588d.m23622a(j > 0, "Start time should be positive.");
            this.f18649a = timeUnit.toMillis(j);
            return this;
        }

        /* renamed from: a */
        public C5135a m21551a(String str) {
            C4588d.m23617b(str.length() <= 100, "Session name cannot exceed %d characters", 100);
            this.f18651c = str;
            return this;
        }

        /* renamed from: a */
        public Session m21555a() {
            boolean z = false;
            C4588d.m23622a(this.f18649a > 0, "Start time should be specified.");
            if (this.f18650b == 0 || this.f18650b > this.f18649a) {
                z = true;
            }
            C4588d.m23622a(z, "End time should be later than start time.");
            if (this.f18652d == null) {
                String str = this.f18651c == null ? "" : this.f18651c;
                this.f18652d = new StringBuilder(String.valueOf(str).length() + 20).append(str).append(this.f18649a).toString();
            }
            if (this.f18653e == null) {
                this.f18653e = "";
            }
            return new Session(this);
        }

        /* renamed from: b */
        public C5135a m21550b(long j, TimeUnit timeUnit) {
            C4588d.m23622a(j >= 0, "End time should be positive.");
            this.f18650b = timeUnit.toMillis(j);
            return this;
        }

        /* renamed from: b */
        public C5135a m21548b(String str) {
            C4588d.m23619b(str != null && TextUtils.getTrimmedLength(str) > 0);
            this.f18652d = str;
            return this;
        }

        /* renamed from: c */
        public C5135a m21547c(long j, TimeUnit timeUnit) {
            this.f18655g = Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        /* renamed from: c */
        public C5135a m21545c(String str) {
            C4588d.m23617b(str.length() <= 1000, "Session description cannot exceed %d characters", 1000);
            this.f18653e = str;
            return this;
        }

        /* renamed from: d */
        public C5135a m21543d(String str) {
            return m21554a(C5129d.m21767a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Session(int i, long j, long j2, String str, String str2, String str3, int i2, Application application, Long l) {
        this.f18640c = i;
        this.f18641d = j;
        this.f18642e = j2;
        this.f18643f = str;
        this.f18644g = str2;
        this.f18645h = str3;
        this.f18646i = i2;
        this.f18647j = application;
        this.f18648k = l;
    }

    public Session(long j, long j2, String str, String str2, String str3, int i, Application application, Long l) {
        this(3, j, j2, str, str2, str3, i, application, l);
    }

    private Session(C5135a c5135a) {
        this(c5135a.f18649a, c5135a.f18650b, c5135a.f18651c, c5135a.f18652d, c5135a.f18653e, c5135a.f18654f, C5135a.m21540g(c5135a), c5135a.f18655g);
    }

    /* renamed from: a */
    public static Session m21573a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Session) C4631c.m23445a(intent, f18638a, CREATOR);
    }

    /* renamed from: a */
    public static String m21571a(String str) {
        String valueOf = String.valueOf(f18639b);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private boolean m21572a(Session session) {
        return this.f18641d == session.f18641d && this.f18642e == session.f18642e && C4585c.m23634a(this.f18643f, session.f18643f) && C4585c.m23634a(this.f18644g, session.f18644g) && C4585c.m23634a(this.f18645h, session.f18645h) && C4585c.m23634a(this.f18647j, session.f18647j) && this.f18646i == session.f18646i;
    }

    /* renamed from: a */
    public long m21570a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18641d, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public boolean m21574a() {
        return this.f18648k != null;
    }

    /* renamed from: b */
    public long m21568b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f18642e, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public boolean m21569b() {
        return this.f18642e == 0;
    }

    /* renamed from: c */
    public long m21566c(TimeUnit timeUnit) {
        C4588d.m23622a(this.f18648k != null, "Active time is not set");
        return timeUnit.convert(this.f18648k.longValue(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public String m21567c() {
        return this.f18643f;
    }

    /* renamed from: d */
    public String m21565d() {
        return this.f18644g;
    }

    /* renamed from: e */
    public String m21564e() {
        return this.f18645h;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Session) && m21572a((Session) obj));
    }

    /* renamed from: f */
    public String m21563f() {
        return C5129d.m21768a(this.f18646i);
    }

    /* renamed from: g */
    public int m21562g() {
        return this.f18646i;
    }

    /* renamed from: h */
    public Application m21561h() {
        return this.f18647j;
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18641d), Long.valueOf(this.f18642e), this.f18644g);
    }

    /* renamed from: i */
    public String m21560i() {
        if (this.f18647j == null) {
            return null;
        }
        return this.f18647j.m21765a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m21559j() {
        return this.f18640c;
    }

    /* renamed from: k */
    public long m21558k() {
        return this.f18641d;
    }

    /* renamed from: l */
    public long m21557l() {
        return this.f18642e;
    }

    /* renamed from: m */
    public Long m21556m() {
        return this.f18648k;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("startTime", Long.valueOf(this.f18641d)).m23632a("endTime", Long.valueOf(this.f18642e)).m23632a("name", this.f18643f).m23632a("identifier", this.f18644g).m23632a("description", this.f18645h).m23632a("activity", Integer.valueOf(this.f18646i)).m23632a("application", this.f18647j).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5145c.m21481a(this, parcel, i);
    }
}
