package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.C3836c;
import com.google.android.gms.analytics.internal.AbstractC3920t;
import com.google.android.gms.analytics.internal.C3858a;
import com.google.android.gms.analytics.internal.C3887c;
import com.google.android.gms.analytics.internal.C3891e;
import com.google.android.gms.analytics.internal.C3908o;
import com.google.android.gms.analytics.internal.C3909p;
import com.google.android.gms.analytics.internal.C3921u;
import com.google.android.gms.analytics.internal.C3922v;
import com.google.android.gms.analytics.internal.C3925x;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ado;
import com.tencent.stat.DeviceInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
/* renamed from: com.google.android.gms.analytics.g */
/* loaded from: classes2.dex */
public class C3852g extends AbstractC3920t {

    /* renamed from: a */
    private boolean f14933a;

    /* renamed from: b */
    private final Map<String, String> f14934b = new HashMap();

    /* renamed from: c */
    private final Map<String, String> f14935c = new HashMap();

    /* renamed from: d */
    private final C3891e f14936d;

    /* renamed from: e */
    private final C3854a f14937e;

    /* renamed from: f */
    private C3835b f14938f;

    /* renamed from: g */
    private C3908o f14939g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.analytics.g$a */
    /* loaded from: classes2.dex */
    public class C3854a extends AbstractC3920t implements C3836c.AbstractC3837a {

        /* renamed from: b */
        private boolean f14949b;

        /* renamed from: c */
        private int f14950c;

        /* renamed from: d */
        private long f14951d = -1;

        /* renamed from: e */
        private boolean f14952e;

        /* renamed from: f */
        private long f14953f;

        protected C3854a(C3922v c3922v) {
            super(c3922v);
        }

        /* renamed from: d */
        private void m26469d() {
            if (this.f14951d >= 0 || this.f14949b) {
                s().m26589a(C3852g.this.f14937e);
            } else {
                s().m26582b(C3852g.this.f14937e);
            }
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3920t
        /* renamed from: a */
        protected void mo26047a() {
        }

        /* renamed from: a */
        public void m26475a(long j) {
            this.f14951d = j;
            m26469d();
        }

        @Override // com.google.android.gms.analytics.C3836c.AbstractC3837a
        /* renamed from: a */
        public void mo26474a(Activity activity) {
            if (this.f14950c == 0 && m26470c()) {
                this.f14952e = true;
            }
            this.f14950c++;
            if (this.f14949b) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    C3852g.this.m26517a(intent.getData());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                C3852g.this.m26513a("&cd", C3852g.this.f14939g != null ? C3852g.this.f14939g.m26212a(activity) : activity.getClass().getCanonicalName());
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    String m26518a = C3852g.m26518a(activity);
                    if (!TextUtils.isEmpty(m26518a)) {
                        hashMap.put("&dr", m26518a);
                    }
                }
                C3852g.this.m26511a((Map<String, String>) hashMap);
            }
        }

        /* renamed from: a */
        public void m26473a(boolean z) {
            this.f14949b = z;
            m26469d();
        }

        @Override // com.google.android.gms.analytics.C3836c.AbstractC3837a
        /* renamed from: b */
        public void mo26471b(Activity activity) {
            this.f14950c--;
            this.f14950c = Math.max(0, this.f14950c);
            if (this.f14950c == 0) {
                this.f14953f = n().mo16432b();
            }
        }

        /* renamed from: b */
        public synchronized boolean m26472b() {
            boolean z;
            z = this.f14952e;
            this.f14952e = false;
            return z;
        }

        /* renamed from: c */
        boolean m26470c() {
            return n().mo16432b() >= this.f14953f + Math.max(1000L, this.f14951d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3852g(C3922v c3922v, String str, C3891e c3891e) {
        super(c3922v);
        if (str != null) {
            this.f14934b.put("&tid", str);
        }
        this.f14934b.put("useSecure", "1");
        this.f14934b.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        if (c3891e == null) {
            this.f14936d = new C3891e("tracking", n());
        } else {
            this.f14936d = c3891e;
        }
        this.f14937e = new C3854a(c3922v);
    }

    /* renamed from: a */
    static String m26518a(Activity activity) {
        C4588d.m23627a(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return stringExtra;
    }

    /* renamed from: a */
    private static void m26510a(Map<String, String> map, Map<String, String> map2) {
        C4588d.m23627a(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m26505b = m26505b(entry);
            if (m26505b != null) {
                map2.put(m26505b, entry.getValue());
            }
        }
    }

    /* renamed from: a */
    private static boolean m26512a(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        entry.getValue();
        return key.startsWith("&") && key.length() >= 2;
    }

    /* renamed from: b */
    private static String m26505b(Map.Entry<String, String> entry) {
        if (!m26512a(entry)) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    /* renamed from: b */
    private static void m26504b(Map<String, String> map, Map<String, String> map2) {
        C4588d.m23627a(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m26505b = m26505b(entry);
            if (m26505b != null && !map2.containsKey(m26505b)) {
                map2.put(m26505b, entry.getValue());
            }
        }
    }

    /* renamed from: c */
    private boolean m26502c() {
        return this.f14938f != null;
    }

    /* renamed from: a */
    public String m26514a(String str) {
        D();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f14934b.containsKey(str)) {
            return this.f14934b.get(str);
        }
        if (str.equals("&ul")) {
            return C3909p.m26193a(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return x().m26400b();
        }
        if (str.equals("&sr")) {
            return A().m26347c();
        }
        if (str.equals("&aid")) {
            return z().m26441c().m18027c();
        }
        if (str.equals("&an")) {
            return z().m26441c().m18032a();
        }
        if (str.equals("&av")) {
            return z().m26441c().m18029b();
        }
        if (!str.equals("&aiid")) {
            return null;
        }
        return z().m26441c().m18025d();
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        this.f14937e.E();
        String m26179c = v().m26179c();
        if (m26179c != null) {
            m26513a("&an", m26179c);
        }
        String m26180b = v().m26180b();
        if (m26180b != null) {
            m26513a("&av", m26180b);
        }
    }

    /* renamed from: a */
    public void m26521a(double d) {
        m26513a("&sf", Double.toString(d));
    }

    /* renamed from: a */
    public void m26520a(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            m26513a("&sr", new StringBuilder(23).append(i).append("x").append(i2).toString());
        } else {
            t("Invalid width or height. The values should be non-negative.");
        }
    }

    /* renamed from: a */
    public void m26519a(long j) {
        this.f14937e.m26475a(1000 * j);
    }

    /* renamed from: a */
    public void m26517a(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            return;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        String valueOf = String.valueOf(queryParameter);
        Uri parse = Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?"));
        String queryParameter2 = parse.getQueryParameter("utm_id");
        if (queryParameter2 != null) {
            this.f14935c.put("&ci", queryParameter2);
        }
        String queryParameter3 = parse.getQueryParameter("anid");
        if (queryParameter3 != null) {
            this.f14935c.put("&anid", queryParameter3);
        }
        String queryParameter4 = parse.getQueryParameter("utm_campaign");
        if (queryParameter4 != null) {
            this.f14935c.put("&cn", queryParameter4);
        }
        String queryParameter5 = parse.getQueryParameter("utm_content");
        if (queryParameter5 != null) {
            this.f14935c.put("&cc", queryParameter5);
        }
        String queryParameter6 = parse.getQueryParameter("utm_medium");
        if (queryParameter6 != null) {
            this.f14935c.put("&cm", queryParameter6);
        }
        String queryParameter7 = parse.getQueryParameter("utm_source");
        if (queryParameter7 != null) {
            this.f14935c.put("&cs", queryParameter7);
        }
        String queryParameter8 = parse.getQueryParameter("utm_term");
        if (queryParameter8 != null) {
            this.f14935c.put("&ck", queryParameter8);
        }
        String queryParameter9 = parse.getQueryParameter("dclid");
        if (queryParameter9 != null) {
            this.f14935c.put("&dclid", queryParameter9);
        }
        String queryParameter10 = parse.getQueryParameter("gclid");
        if (queryParameter10 != null) {
            this.f14935c.put("&gclid", queryParameter10);
        }
        String queryParameter11 = parse.getQueryParameter("aclid");
        if (queryParameter11 == null) {
            return;
        }
        this.f14935c.put("&aclid", queryParameter11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m26515a(C3908o c3908o) {
        q("Loading Tracker config values");
        this.f14939g = c3908o;
        if (this.f14939g.m26213a()) {
            String m26210b = this.f14939g.m26210b();
            m26513a("&tid", m26210b);
            a("trackingId loaded", (Object) m26210b);
        }
        if (this.f14939g.m26209c()) {
            String d = Double.toString(this.f14939g.m26208d());
            m26513a("&sf", d);
            a("Sample frequency loaded", (Object) d);
        }
        if (this.f14939g.m26207e()) {
            int m26206f = this.f14939g.m26206f();
            m26519a(m26206f);
            a("Session timeout loaded", Integer.valueOf(m26206f));
        }
        if (this.f14939g.m26205g()) {
            boolean m26204h = this.f14939g.m26204h();
            m26503b(m26204h);
            a("Auto activity tracking loaded", Boolean.valueOf(m26204h));
        }
        if (this.f14939g.m26203i()) {
            boolean m26202j = this.f14939g.m26202j();
            if (m26202j) {
                m26513a("&aip", "1");
            }
            a("Anonymize ip loaded", Boolean.valueOf(m26202j));
        }
        m26509a(this.f14939g.m26201k());
    }

    /* renamed from: a */
    public void m26513a(String str, String str2) {
        C4588d.m23626a(str, (Object) "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f14934b.put(str, str2);
    }

    /* renamed from: a */
    public void m26511a(Map<String, String> map) {
        final long mo16434a = n().mo16434a();
        if (s().m26575f()) {
            r("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        final boolean m26576e = s().m26576e();
        final HashMap hashMap = new HashMap();
        m26510a(this.f14934b, hashMap);
        m26510a(map, hashMap);
        final boolean m26194a = C3909p.m26194a(this.f14934b.get("useSecure"), true);
        m26504b(this.f14935c, hashMap);
        this.f14935c.clear();
        final String str = hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            p().m26288a(hashMap, "Missing hit type parameter");
            return;
        }
        final String str2 = hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            p().m26288a(hashMap, "Missing tracking id parameter");
            return;
        }
        final boolean m26508b = m26508b();
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt(this.f14934b.get("&a")) + 1;
                if (parseInt >= Integer.MAX_VALUE) {
                    parseInt = 1;
                }
                this.f14934b.put("&a", Integer.toString(parseInt));
            }
        }
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.g.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z = true;
                if (C3852g.this.f14937e.m26472b()) {
                    hashMap.put("sc", "start");
                }
                C3909p.m26187b(hashMap, "cid", C3852g.this.s().m26573h());
                String str3 = (String) hashMap.get("sf");
                if (str3 != null) {
                    double m26195a = C3909p.m26195a(str3, 100.0d);
                    if (C3909p.m26200a(m26195a, (String) hashMap.get("cid"))) {
                        C3852g.this.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(m26195a));
                        return;
                    }
                }
                C3858a y = C3852g.this.y();
                if (m26508b) {
                    C3909p.m26190a(hashMap, "ate", y.m26448b());
                    C3909p.m26192a(hashMap, "adid", y.m26446c());
                } else {
                    hashMap.remove("ate");
                    hashMap.remove("adid");
                }
                ado m26441c = C3852g.this.z().m26441c();
                C3909p.m26192a(hashMap, "an", m26441c.m18032a());
                C3909p.m26192a(hashMap, "av", m26441c.m18029b());
                C3909p.m26192a(hashMap, DeviceInfo.TAG_ANDROID_ID, m26441c.m18027c());
                C3909p.m26192a(hashMap, "aiid", m26441c.m18025d());
                hashMap.put("v", "1");
                hashMap.put("_v", C3921u.f15154b);
                C3909p.m26192a(hashMap, "ul", C3852g.this.A().m26348b().m17982f());
                C3909p.m26192a(hashMap, "sr", C3852g.this.A().m26347c());
                if (!(str.equals("transaction") || str.equals("item")) && !C3852g.this.f14936d.m26299a()) {
                    C3852g.this.p().m26288a(hashMap, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long m26188b = C3909p.m26188b((String) hashMap.get("ht"));
                if (m26188b == 0) {
                    m26188b = mo16434a;
                }
                if (m26576e) {
                    C3852g.this.p().c("Dry run enabled. Would have sent hit", new C3887c(C3852g.this, hashMap, m26188b, m26194a));
                    return;
                }
                String str4 = (String) hashMap.get("cid");
                HashMap hashMap2 = new HashMap();
                C3909p.m26191a(hashMap2, "uid", hashMap);
                C3909p.m26191a(hashMap2, "an", hashMap);
                C3909p.m26191a(hashMap2, DeviceInfo.TAG_ANDROID_ID, hashMap);
                C3909p.m26191a(hashMap2, "av", hashMap);
                C3909p.m26191a(hashMap2, "aiid", hashMap);
                String str5 = str2;
                if (TextUtils.isEmpty((CharSequence) hashMap.get("adid"))) {
                    z = false;
                }
                hashMap.put("_s", String.valueOf(C3852g.this.t().m26167a(new C3925x(0L, str4, str5, z, 0L, hashMap2))));
                C3852g.this.t().m26169a(new C3887c(C3852g.this, hashMap, m26188b, m26194a));
            }
        });
    }

    /* renamed from: a */
    public void m26509a(boolean z) {
        synchronized (this) {
            if (m26502c() == z) {
                return;
            }
            if (z) {
                this.f14938f = new C3835b(this, Thread.getDefaultUncaughtExceptionHandler(), o());
                Thread.setDefaultUncaughtExceptionHandler(this.f14938f);
                q("Uncaught exceptions will be reported to Google Analytics");
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this.f14938f.m26595c());
                q("Uncaught exceptions will not be reported to Google Analytics");
            }
        }
    }

    /* renamed from: b */
    public void m26506b(String str) {
        m26513a("&cd", str);
    }

    /* renamed from: b */
    public void m26503b(boolean z) {
        this.f14937e.m26473a(z);
    }

    /* renamed from: b */
    boolean m26508b() {
        return this.f14933a;
    }

    /* renamed from: c */
    public void m26500c(String str) {
        m26513a("&dl", str);
    }

    /* renamed from: c */
    public void m26499c(boolean z) {
        m26513a("useSecure", C3909p.m26189a(z));
    }

    /* renamed from: d */
    public void m26497d(String str) {
        m26513a("&dr", str);
    }

    /* renamed from: d */
    public void m26496d(boolean z) {
        m26513a("&aip", C3909p.m26189a(z));
    }

    /* renamed from: e */
    public void m26494e(String str) {
        m26513a("&dp", str);
    }

    /* renamed from: e */
    public void m26493e(boolean z) {
        this.f14933a = z;
    }

    /* renamed from: f */
    public void m26491f(String str) {
        m26513a("&dh", str);
    }

    /* renamed from: g */
    public void m26489g(String str) {
        m26513a("&dt", str);
    }

    /* renamed from: h */
    public void m26487h(String str) {
        m26513a("&ul", str);
    }

    /* renamed from: i */
    public void m26485i(String str) {
        m26513a("&de", str);
    }

    /* renamed from: j */
    public void m26483j(String str) {
        m26513a("&sd", str);
    }

    /* renamed from: k */
    public void m26481k(String str) {
        m26513a("&vp", str);
    }

    /* renamed from: l */
    public void m26480l(String str) {
        m26513a("&cid", str);
    }

    /* renamed from: m */
    public void m26479m(String str) {
        m26513a("&an", str);
    }

    /* renamed from: n */
    public void m26478n(String str) {
        m26513a("&aid", str);
    }

    /* renamed from: o */
    public void m26477o(String str) {
        m26513a("&aiid", str);
    }

    /* renamed from: p */
    public void m26476p(String str) {
        m26513a("&av", str);
    }
}
