package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.p225a.C3433a;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.iid.C9909b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import p005b.p006a.p007a.p029b.C0494h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.af */
/* loaded from: classes2.dex */
public class C8654af extends AbstractC8683b {

    /* renamed from: a */
    static final Pair<String, Long> f27687a = new Pair<>("", 0L);

    /* renamed from: m */
    public boolean f27699m;

    /* renamed from: o */
    private SharedPreferences f27700o;

    /* renamed from: p */
    private String f27701p;

    /* renamed from: q */
    private boolean f27702q;

    /* renamed from: r */
    private long f27703r;

    /* renamed from: s */
    private SecureRandom f27704s;

    /* renamed from: b */
    public final C8658c f27688b = new C8658c("health_monitor", y().m10463V());

    /* renamed from: c */
    public final C8657b f27689c = new C8657b("last_upload", 0);

    /* renamed from: d */
    public final C8657b f27690d = new C8657b("last_upload_attempt", 0);

    /* renamed from: e */
    public final C8657b f27691e = new C8657b("backoff", 0);

    /* renamed from: f */
    public final C8657b f27692f = new C8657b("last_delete_stale", 0);

    /* renamed from: h */
    public final C8657b f27694h = new C8657b("time_before_start", 10000);

    /* renamed from: i */
    public final C8657b f27695i = new C8657b("session_timeout", 1800000);

    /* renamed from: j */
    public final C8656a f27696j = new C8656a("start_new_session", true);

    /* renamed from: k */
    public final C8657b f27697k = new C8657b("last_pause_time", 0);

    /* renamed from: l */
    public final C8657b f27698l = new C8657b("time_active", 0);

    /* renamed from: g */
    public final C8657b f27693g = new C8657b("midnight_offset", 0);

    /* renamed from: com.google.android.gms.measurement.internal.af$a */
    /* loaded from: classes2.dex */
    public final class C8656a {

        /* renamed from: b */
        private final String f27706b;

        /* renamed from: c */
        private final boolean f27707c;

        /* renamed from: d */
        private boolean f27708d;

        /* renamed from: e */
        private boolean f27709e;

        public C8656a(String str, boolean z) {
            C4588d.m23625a(str);
            this.f27706b = str;
            this.f27707c = z;
        }

        @WorkerThread
        /* renamed from: b */
        private void m10789b() {
            if (this.f27708d) {
                return;
            }
            this.f27708d = true;
            this.f27709e = C8654af.this.f27700o.getBoolean(this.f27706b, this.f27707c);
        }

        @WorkerThread
        /* renamed from: a */
        public void m10790a(boolean z) {
            SharedPreferences.Editor edit = C8654af.this.f27700o.edit();
            edit.putBoolean(this.f27706b, z);
            edit.apply();
            this.f27709e = z;
        }

        @WorkerThread
        /* renamed from: a */
        public boolean m10791a() {
            m10789b();
            return this.f27709e;
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.af$b */
    /* loaded from: classes2.dex */
    public final class C8657b {

        /* renamed from: b */
        private final String f27711b;

        /* renamed from: c */
        private final long f27712c;

        /* renamed from: d */
        private boolean f27713d;

        /* renamed from: e */
        private long f27714e;

        public C8657b(String str, long j) {
            C4588d.m23625a(str);
            this.f27711b = str;
            this.f27712c = j;
        }

        @WorkerThread
        /* renamed from: b */
        private void m10786b() {
            if (this.f27713d) {
                return;
            }
            this.f27713d = true;
            this.f27714e = C8654af.this.f27700o.getLong(this.f27711b, this.f27712c);
        }

        @WorkerThread
        /* renamed from: a */
        public long m10788a() {
            m10786b();
            return this.f27714e;
        }

        @WorkerThread
        /* renamed from: a */
        public void m10787a(long j) {
            SharedPreferences.Editor edit = C8654af.this.f27700o.edit();
            edit.putLong(this.f27711b, j);
            edit.apply();
            this.f27714e = j;
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.af$c */
    /* loaded from: classes2.dex */
    public final class C8658c {

        /* renamed from: a */
        final String f27715a;

        /* renamed from: c */
        private final String f27717c;

        /* renamed from: d */
        private final String f27718d;

        /* renamed from: e */
        private final long f27719e;

        private C8658c(String str, long j) {
            C4588d.m23625a(str);
            C4588d.m23619b(j > 0);
            this.f27715a = String.valueOf(str).concat(":start");
            this.f27717c = String.valueOf(str).concat(":count");
            this.f27718d = String.valueOf(str).concat(":value");
            this.f27719e = j;
        }

        @WorkerThread
        /* renamed from: b */
        private void m10782b() {
            C8654af.this.j();
            long mo16434a = C8654af.this.p().mo16434a();
            SharedPreferences.Editor edit = C8654af.this.f27700o.edit();
            edit.remove(this.f27717c);
            edit.remove(this.f27718d);
            edit.putLong(this.f27715a, mo16434a);
            edit.apply();
        }

        @WorkerThread
        /* renamed from: c */
        private long m10781c() {
            C8654af.this.j();
            long m10780d = m10780d();
            if (m10780d == 0) {
                m10782b();
                return 0L;
            }
            return Math.abs(m10780d - C8654af.this.p().mo16434a());
        }

        @WorkerThread
        /* renamed from: d */
        private long m10780d() {
            return C8654af.this.m10804F().getLong(this.f27715a, 0L);
        }

        @WorkerThread
        /* renamed from: a */
        public Pair<String, Long> m10785a() {
            C8654af.this.j();
            long m10781c = m10781c();
            if (m10781c < this.f27719e) {
                return null;
            }
            if (m10781c > this.f27719e * 2) {
                m10782b();
                return null;
            }
            String string = C8654af.this.m10804F().getString(this.f27718d, null);
            long j = C8654af.this.m10804F().getLong(this.f27717c, 0L);
            m10782b();
            return (string == null || j <= 0) ? C8654af.f27687a : new Pair<>(string, Long.valueOf(j));
        }

        @WorkerThread
        /* renamed from: a */
        public void m10784a(String str) {
            m10783a(str, 1L);
        }

        @WorkerThread
        /* renamed from: a */
        public void m10783a(String str, long j) {
            C8654af.this.j();
            if (m10780d() == 0) {
                m10782b();
            }
            if (str == null) {
                str = "";
            }
            long j2 = C8654af.this.f27700o.getLong(this.f27717c, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor edit = C8654af.this.f27700o.edit();
                edit.putString(this.f27718d, str);
                edit.putLong(this.f27717c, j);
                edit.apply();
                return;
            }
            boolean z = (C8654af.this.m10805E().nextLong() & Long.MAX_VALUE) < (Long.MAX_VALUE / (j2 + j)) * j;
            SharedPreferences.Editor edit2 = C8654af.this.f27700o.edit();
            if (z) {
                edit2.putString(this.f27718d, str);
            }
            edit2.putLong(this.f27717c, j2 + j);
            edit2.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8654af(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: E */
    public SecureRandom m10805E() {
        j();
        if (this.f27704s == null) {
            this.f27704s = new SecureRandom();
        }
        return this.f27704s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: F */
    public SharedPreferences m10804F() {
        j();
        c();
        return this.f27700o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public String m10809A() {
        j();
        return m10804F().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: B */
    public Boolean m10808B() {
        j();
        if (!m10804F().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(m10804F().getBoolean("use_service", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: C */
    public void m10807C() {
        boolean z = true;
        j();
        w().m10843E().m10831a("Clearing collection preferences.");
        boolean contains = m10804F().contains("measurement_enabled");
        if (contains) {
            z = m10795c(true);
        }
        SharedPreferences.Editor edit = m10804F().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            m10798b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: D */
    public String m10806D() {
        j();
        String string = m10804F().getString("previous_os_version", null);
        String m10350g = n().m10350g();
        if (!TextUtils.isEmpty(m10350g) && !m10350g.equals(string)) {
            SharedPreferences.Editor edit = m10804F().edit();
            edit.putString("previous_os_version", m10350g);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    @NonNull
    /* renamed from: a */
    public Pair<String, Boolean> m10802a(String str) {
        j();
        long mo16432b = p().mo16432b();
        if (this.f27701p == null || mo16432b >= this.f27703r) {
            this.f27703r = mo16432b + y().m10438d(str);
            C3433a.m27868b(true);
            try {
                C3433a.C3434a m27869b = C3433a.m27869b(q());
                this.f27701p = m27869b.m27865a();
                if (this.f27701p == null) {
                    this.f27701p = "";
                }
                this.f27702q = m27869b.m27864b();
            } catch (Throwable th) {
                w().m10844D().m10830a("Unable to get advertising id", th);
                this.f27701p = "";
            }
            C3433a.m27868b(false);
            return new Pair<>(this.f27701p, Boolean.valueOf(this.f27702q));
        }
        return new Pair<>(this.f27701p, Boolean.valueOf(this.f27702q));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public void m10801a(boolean z) {
        j();
        w().m10843E().m10830a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m10804F().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m10799b(String str) {
        String str2 = (String) m10802a(str).first;
        MessageDigest m10498j = C8723m.m10498j("MD5");
        if (m10498j == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m10498j.digest(str2.getBytes())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public void m10798b(boolean z) {
        j();
        w().m10843E().m10830a("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m10804F().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public void m10796c(String str) {
        j();
        SharedPreferences.Editor edit = m10804F().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public boolean m10795c(boolean z) {
        j();
        return m10804F().getBoolean("measurement_enabled", z);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
        this.f27700o = q().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f27699m = this.f27700o.getBoolean("has_been_opened", false);
        if (!this.f27699m) {
            SharedPreferences.Editor edit = this.f27700o.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: f */
    public String m10794f() {
        byte[] bArr = new byte[16];
        m10805E().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: g */
    public String m10793g() {
        j();
        try {
            return C9909b.m6576a().m6575b();
        } catch (IllegalStateException e) {
            w().m10832z().m10831a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: z */
    public long m10792z() {
        c();
        j();
        long m10788a = this.f27693g.m10788a();
        if (m10788a == 0) {
            long nextInt = m10805E().nextInt(C0494h.f705Z) + 1;
            this.f27693g.m10787a(nextInt);
            return nextInt;
        }
        return m10788a;
    }
}
