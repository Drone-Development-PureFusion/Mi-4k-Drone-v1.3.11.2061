package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.analytics.C3855h;
import com.google.android.gms.analytics.C3936l;
import com.google.android.gms.analytics.C3940p;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6217ads;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adp;
import com.google.android.gms.internal.adx;
import com.tencent.stat.DeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.analytics.internal.ab */
/* loaded from: classes2.dex */
public class C3860ab extends AbstractC3920t {

    /* renamed from: a */
    private boolean f14972a;

    /* renamed from: b */
    private final C3931z f14973b;

    /* renamed from: c */
    private final C3895i f14974c;

    /* renamed from: d */
    private final C3894h f14975d;

    /* renamed from: e */
    private final C3926y f14976e;

    /* renamed from: g */
    private final AbstractC3876aj f14978g;

    /* renamed from: h */
    private final AbstractC3876aj f14979h;

    /* renamed from: j */
    private long f14981j;

    /* renamed from: k */
    private boolean f14982k;

    /* renamed from: f */
    private long f14977f = Long.MIN_VALUE;

    /* renamed from: i */
    private final C3905m f14980i = new C3905m(n());

    /* JADX INFO: Access modifiers changed from: protected */
    public C3860ab(C3922v c3922v, C3924w c3924w) {
        super(c3922v);
        C4588d.m23627a(c3924w);
        this.f14975d = c3924w.m26081k(c3922v);
        this.f14973b = c3924w.m26079m(c3922v);
        this.f14974c = c3924w.m26078n(c3922v);
        this.f14976e = c3924w.m26077o(c3922v);
        this.f14978g = new AbstractC3876aj(c3922v) { // from class: com.google.android.gms.analytics.internal.ab.1
            @Override // com.google.android.gms.analytics.internal.AbstractC3876aj
            /* renamed from: a */
            public void mo26053a() {
                C3860ab.this.m26434L();
            }
        };
        this.f14979h = new AbstractC3876aj(c3922v) { // from class: com.google.android.gms.analytics.internal.ab.2
            @Override // com.google.android.gms.analytics.internal.AbstractC3876aj
            /* renamed from: a */
            public void mo26053a() {
                C3860ab.this.m26433M();
            }
        };
    }

    /* renamed from: K */
    private void m26435K() {
        m();
        Context m26112b = k().m26112b();
        if (!C3900k.m26235a(m26112b)) {
            t("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C3901l.m26232a(m26112b)) {
            u("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.m26634a(m26112b)) {
            t("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        } else if (CampaignTrackingService.m26632a(m26112b)) {
        } else {
            t("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m26434L() {
        m26424a(new AbstractC3880am() { // from class: com.google.android.gms.analytics.internal.ab.4
            @Override // com.google.android.gms.analytics.internal.AbstractC3880am
            /* renamed from: a */
            public void mo26225a(Throwable th) {
                C3860ab.this.m26438H();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m26433M() {
        try {
            this.f14973b.m26021i();
            m26438H();
        } catch (SQLiteException e) {
            d("Failed to delete stale hits", e);
        }
        this.f14979h.m26357a(q().m26388C());
    }

    /* renamed from: N */
    private boolean m26432N() {
        if (this.f14982k) {
            return false;
        }
        return (!q().m26383a() || q().m26382b()) && m26437I() > 0;
    }

    /* renamed from: O */
    private void m26431O() {
        C3879al u = u();
        if (u.m26346b() && !u.m26345c()) {
            long m26439G = m26439G();
            if (m26439G == 0 || Math.abs(n().mo16434a() - m26439G) > q().m26373k()) {
                return;
            }
            a("Dispatch alarm scheduled (ms)", Long.valueOf(q().m26374j()));
            u.m26344d();
        }
    }

    /* renamed from: P */
    private void m26430P() {
        long min;
        m26431O();
        long m26437I = m26437I();
        long m26247d = w().m26247d();
        if (m26247d != 0) {
            min = m26437I - Math.abs(n().mo16434a() - m26247d);
            if (min <= 0) {
                min = Math.min(q().m26376h(), m26437I);
            }
        } else {
            min = Math.min(q().m26376h(), m26437I);
        }
        a("Dispatch scheduled (ms)", Long.valueOf(min));
        if (!this.f14978g.m26351c()) {
            this.f14978g.m26357a(min);
            return;
        }
        this.f14978g.m26353b(Math.max(1L, min + this.f14978g.m26354b()));
    }

    /* renamed from: Q */
    private void m26429Q() {
        m26428R();
        m26427S();
    }

    /* renamed from: R */
    private void m26428R() {
        if (this.f14978g.m26351c()) {
            q("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f14978g.m26350d();
    }

    /* renamed from: S */
    private void m26427S() {
        C3879al u = u();
        if (u.m26345c()) {
            u.m26343e();
        }
    }

    /* renamed from: a */
    private void m26420a(C3925x c3925x, adp adpVar) {
        C4588d.m23627a(c3925x);
        C4588d.m23627a(adpVar);
        C3855h c3855h = new C3855h(k());
        c3855h.m26468b(c3925x.m26071c());
        c3855h.m26466c(c3925x.m26070d());
        C3936l mo25978l = c3855h.mo25978l();
        adx adxVar = (adx) mo25978l.m25995b(adx.class);
        adxVar.m17958a(UriUtil.DATA_SCHEME);
        adxVar.m17954b(true);
        mo25978l.m25998a(adpVar);
        C6217ads c6217ads = (C6217ads) mo25978l.m25995b(C6217ads.class);
        ado adoVar = (ado) mo25978l.m25995b(ado.class);
        for (Map.Entry<String, String> entry : c3925x.m26068f().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                adoVar.m18030a(value);
            } else if ("av".equals(key)) {
                adoVar.m18028b(value);
            } else if (DeviceInfo.TAG_ANDROID_ID.equals(key)) {
                adoVar.m18026c(value);
            } else if ("aiid".equals(key)) {
                adoVar.m18024d(value);
            } else if ("uid".equals(key)) {
                adxVar.m17952c(value);
            } else {
                c6217ads.m17995a(key, value);
            }
        }
        b("Sending installation campaign to", c3925x.m26071c(), adpVar);
        mo25978l.m25999a(w().m26249b());
        mo25978l.m25991e();
    }

    /* renamed from: b */
    private boolean m26413b(String str) {
        return o().checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: F */
    public void m26440F() {
        C3940p.m25962d();
        D();
        r("Sync dispatching local hits");
        long j = this.f14981j;
        if (!q().m26383a()) {
            m26408g();
        }
        do {
            try {
            } catch (Throwable th) {
                e("Sync local dispatch failed", th);
                m26438H();
                return;
            }
        } while (m26405j());
        w().m26246e();
        m26438H();
        if (this.f14981j != j) {
            this.f14975d.m26283c();
        }
    }

    /* renamed from: G */
    public long m26439G() {
        C3940p.m25962d();
        D();
        try {
            return this.f14973b.m26020j();
        } catch (SQLiteException e) {
            e("Failed to get min/max hit times from local store", e);
            return 0L;
        }
    }

    /* renamed from: H */
    public void m26438H() {
        boolean z;
        k().m26095s();
        D();
        if (!m26432N()) {
            this.f14975d.m26284b();
            m26429Q();
        } else if (this.f14973b.m26022h()) {
            this.f14975d.m26284b();
            m26429Q();
        } else {
            if (!C3882ao.f15028J.m26339a().booleanValue()) {
                this.f14975d.m26285a();
                z = this.f14975d.m26281e();
            } else {
                z = true;
            }
            if (z) {
                m26430P();
                return;
            }
            m26429Q();
            m26431O();
        }
    }

    /* renamed from: I */
    public long m26437I() {
        if (this.f14977f != Long.MIN_VALUE) {
            return this.f14977f;
        }
        return v().m26176f() ? v().m26175g() * 1000 : q().m26375i();
    }

    /* renamed from: J */
    public void m26436J() {
        D();
        m();
        this.f14982k = true;
        this.f14976e.m26057e();
        m26438H();
    }

    /* renamed from: a */
    public long m26419a(C3925x c3925x, boolean z) {
        C4588d.m23627a(c3925x);
        D();
        m();
        try {
            try {
                this.f14973b.m26035b();
                this.f14973b.m26045a(c3925x.m26074a(), c3925x.m26072b());
                long m26044a = this.f14973b.m26044a(c3925x.m26074a(), c3925x.m26072b(), c3925x.m26071c());
                if (!z) {
                    c3925x.m26073a(m26044a);
                } else {
                    c3925x.m26073a(1 + m26044a);
                }
                this.f14973b.m26042a(c3925x);
                this.f14973b.m26030c();
                try {
                    return m26044a;
                } catch (SQLiteException e) {
                    return m26044a;
                }
            } catch (SQLiteException e2) {
                e("Failed to update Analytics property", e2);
                try {
                    this.f14973b.m26027d();
                } catch (SQLiteException e3) {
                    e("Failed to end transaction", e3);
                }
                return -1L;
            }
        } finally {
            try {
                this.f14973b.m26027d();
            } catch (SQLiteException e4) {
                e("Failed to end transaction", e4);
            }
        }
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        this.f14973b.E();
        this.f14974c.E();
        this.f14976e.E();
    }

    /* renamed from: a */
    public void m26426a(long j) {
        C3940p.m25962d();
        D();
        if (j < 0) {
            j = 0;
        }
        this.f14977f = j;
        m26438H();
    }

    /* renamed from: a */
    public void m26424a(AbstractC3880am abstractC3880am) {
        m26423a(abstractC3880am, this.f14981j);
    }

    /* renamed from: a */
    public void m26423a(final AbstractC3880am abstractC3880am, final long j) {
        C3940p.m25962d();
        D();
        long j2 = -1;
        long m26247d = w().m26247d();
        if (m26247d != 0) {
            j2 = Math.abs(n().mo16434a() - m26247d);
        }
        b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        if (!q().m26383a()) {
            m26408g();
        }
        try {
            if (m26405j()) {
                r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.ab.5
                    @Override // java.lang.Runnable
                    public void run() {
                        C3860ab.this.m26423a(abstractC3880am, j);
                    }
                });
                return;
            }
            w().m26246e();
            m26438H();
            if (abstractC3880am != null) {
                abstractC3880am.mo26225a(null);
            }
            if (this.f14981j == j) {
                return;
            }
            this.f14975d.m26283c();
        } catch (Throwable th) {
            e("Local dispatch failed", th);
            w().m26246e();
            m26438H();
            if (abstractC3880am == null) {
                return;
            }
            abstractC3880am.mo26225a(th);
        }
    }

    /* renamed from: a */
    public void m26422a(C3887c c3887c) {
        C4588d.m23627a(c3887c);
        C3940p.m25962d();
        D();
        if (this.f14982k) {
            r("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            a("Delivering hit", c3887c);
        }
        C3887c m26414b = m26414b(c3887c);
        m26408g();
        if (this.f14976e.m26066a(m26414b)) {
            r("Hit sent to the device AnalyticsService for delivery");
        } else if (q().m26383a()) {
            p().m26290a(m26414b, "Service unavailable on package side");
        } else {
            try {
                this.f14973b.m26043a(m26414b);
                m26438H();
            } catch (SQLiteException e) {
                e("Delivery failed to save hit to a database", e);
                p().m26290a(m26414b, "deliver: failed to insert hit to database");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m26421a(C3925x c3925x) {
        m();
        b("Sending first hit to property", c3925x.m26071c());
        if (w().m26248c().m26221a(q().m26385F())) {
            return;
        }
        String m26245f = w().m26245f();
        if (TextUtils.isEmpty(m26245f)) {
            return;
        }
        adp m26197a = C3909p.m26197a(p(), m26245f);
        b("Found relevant installation campaign", m26197a);
        m26420a(c3925x, m26197a);
    }

    /* renamed from: a */
    public void m26418a(String str) {
        C4588d.m23625a(str);
        m();
        l();
        adp m26197a = C3909p.m26197a(p(), str);
        if (m26197a == null) {
            d("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String m26245f = w().m26245f();
        if (str.equals(m26245f)) {
            t("Ignoring duplicate install campaign");
        } else if (!TextUtils.isEmpty(m26245f)) {
            d("Ignoring multiple install campaigns. original, new", m26245f, str);
        } else {
            w().m26250a(str);
            if (w().m26248c().m26221a(q().m26385F())) {
                d("Campaign received too late, ignoring", m26197a);
                return;
            }
            b("Received installation campaign", m26197a);
            for (C3925x c3925x : this.f14973b.m26026d(0L)) {
                m26420a(c3925x, m26197a);
            }
        }
    }

    /* renamed from: a */
    public void m26417a(boolean z) {
        m26438H();
    }

    /* renamed from: b */
    C3887c m26414b(C3887c c3887c) {
        Pair<String, Long> m26243a;
        if (TextUtils.isEmpty(c3887c.m26304h()) && (m26243a = w().m26244g().m26243a()) != null) {
            String str = (String) m26243a.first;
            String valueOf = String.valueOf((Long) m26243a.second);
            String sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
            HashMap hashMap = new HashMap(c3887c.m26311b());
            hashMap.put("_m", sb);
            return C3887c.m26316a(this, c3887c, hashMap);
        }
        return c3887c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m26416b() {
        D();
        C4588d.m23622a(!this.f14972a, "Analytics backend already started");
        this.f14972a = true;
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.ab.3
            @Override // java.lang.Runnable
            public void run() {
                C3860ab.this.m26412c();
            }
        });
    }

    /* renamed from: c */
    protected void m26412c() {
        D();
        if (!q().m26383a()) {
            m26435K();
        }
        w().m26249b();
        if (!m26413b("android.permission.ACCESS_NETWORK_STATE")) {
            u("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m26436J();
        }
        if (!m26413b("android.permission.INTERNET")) {
            u("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m26436J();
        }
        if (C3901l.m26232a(o())) {
            q("AnalyticsService registered in the app manifest and enabled");
        } else if (q().m26383a()) {
            u("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        } else {
            t("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.f14982k && !q().m26383a() && !this.f14973b.m26022h()) {
            m26408g();
        }
        m26438H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m26411d() {
        m();
        this.f14981j = n().mo16434a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m26410e() {
        m();
        if (!q().m26383a()) {
            m26406i();
        }
    }

    /* renamed from: f */
    public void m26409f() {
        C3940p.m25962d();
        D();
        q("Service disconnected");
    }

    /* renamed from: g */
    protected void m26408g() {
        if (!this.f14982k && q().m26381c() && !this.f14976e.m26061b()) {
            if (!this.f14980i.m26221a(q().m26360x())) {
                return;
            }
            this.f14980i.m26222a();
            q("Connecting to service");
            if (!this.f14976e.m26058d()) {
                return;
            }
            q("Connected to service");
            this.f14980i.m26220b();
            m26410e();
        }
    }

    /* renamed from: h */
    public void m26407h() {
        C3940p.m25962d();
        D();
        if (!q().m26383a()) {
            q("Delete all hits from local store");
            try {
                this.f14973b.m26025e();
                this.f14973b.m26024f();
                m26438H();
            } catch (SQLiteException e) {
                d("Failed to delete hits from store", e);
            }
        }
        m26408g();
        if (this.f14976e.m26059c()) {
            q("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[LOOP:1: B:15:0x0062->B:21:0x0059, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m26406i() {
        C3940p.m25962d();
        D();
        l();
        if (!q().m26381c()) {
            t("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.f14976e.m26061b()) {
            q("Service not connected");
        } else if (this.f14973b.m26022h()) {
        } else {
            q("Dispatching local hits to device AnalyticsService");
            while (true) {
                try {
                    List<C3887c> m26034b = this.f14973b.m26034b(q().m26372l());
                    if (!m26034b.isEmpty()) {
                        m26438H();
                        return;
                    }
                    while (true) {
                        if (!m26034b.isEmpty()) {
                            C3887c c3887c = m26034b.get(0);
                            if (!this.f14976e.m26066a(c3887c)) {
                                m26438H();
                                return;
                            }
                            m26034b.remove(c3887c);
                            try {
                                this.f14973b.m26029c(c3887c.m26309c());
                            } catch (SQLiteException e) {
                                e("Failed to remove hit that was send for delivery", e);
                                m26429Q();
                                return;
                            }
                        }
                    }
                    List<C3887c> m26034b2 = this.f14973b.m26034b(q().m26372l());
                    if (!m26034b2.isEmpty()) {
                    }
                } catch (SQLiteException e2) {
                    e("Failed to read hits from store", e2);
                    m26429Q();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
        if (r12.f14976e.m26061b() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
        if (q().m26383a() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
        q("Service connected, sending hits to the service");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
        if (r8.isEmpty() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0110, code lost:
        r0 = r8.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
        if (r12.f14976e.m26066a(r0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0148, code lost:
        r4 = java.lang.Math.max(r4, r0.m26309c());
        r8.remove(r0);
        b("Hit sent do device AnalyticsService for delivery", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0158, code lost:
        r12.f14973b.m26029c(r0.m26309c());
        r3.add(java.lang.Long.valueOf(r0.m26309c()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016e, code lost:
        e("Failed to remove hit that was send for delivery", r0);
        m26429Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0176, code lost:
        r12.f14973b.m26030c();
        r12.f14973b.m26027d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0182, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0183, code lost:
        e("Failed to commit local dispatch transaction", r0);
        m26429Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
        if (r12.f14974c.m26263b() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
        r8 = r12.f14974c.m26266a(r8);
        r9 = r8.iterator();
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
        if (r9.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
        r4 = java.lang.Math.max(r4, r9.next().longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018d, code lost:
        r12.f14973b.m26037a(r8);
        r3.addAll(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0195, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b4, code lost:
        e("Failed to remove successfully uploaded hits", r0);
        m26429Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bc, code lost:
        r12.f14973b.m26030c();
        r12.f14973b.m26027d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c9, code lost:
        e("Failed to commit local dispatch transaction", r0);
        m26429Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019a, code lost:
        if (r3.isEmpty() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
        r12.f14973b.m26030c();
        r12.f14973b.m26027d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
        e("Failed to commit local dispatch transaction", r0);
        m26429Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
        r12.f14973b.m26030c();
        r12.f14973b.m26027d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e1, code lost:
        e("Failed to commit local dispatch transaction", r0);
        m26429Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0202, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0066, code lost:
        q("Store is empty, nothing to dispatch");
        m26429Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x006e, code lost:
        r12.f14973b.m26030c();
        r12.f14973b.m26027d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x007a, code lost:
        e("Failed to commit local dispatch transaction", r0);
        m26429Q();
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean m26405j() {
        long j;
        boolean z = true;
        C3940p.m25962d();
        D();
        q("Dispatching a batch of local hits");
        boolean z2 = !this.f14976e.m26061b() && !q().m26383a();
        if (this.f14974c.m26263b()) {
            z = false;
        }
        if (!z2 || !z) {
            long max = Math.max(q().m26372l(), q().m26371m());
            ArrayList arrayList = new ArrayList();
            long j2 = 0;
            loop0: while (true) {
                try {
                    try {
                        this.f14973b.m26035b();
                        arrayList.clear();
                        try {
                            List<C3887c> m26034b = this.f14973b.m26034b(max);
                            if (!m26034b.isEmpty()) {
                                a("Hits loaded from store. count", Integer.valueOf(m26034b.size()));
                                Iterator<C3887c> it2 = m26034b.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (it2.next().m26309c() == j2) {
                                        d("Database contains successfully uploaded hit", Long.valueOf(j2), Integer.valueOf(m26034b.size()));
                                        m26429Q();
                                        try {
                                            this.f14973b.m26030c();
                                            this.f14973b.m26027d();
                                            break loop0;
                                        } catch (SQLiteException e) {
                                            e("Failed to commit local dispatch transaction", e);
                                            m26429Q();
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        } catch (SQLiteException e2) {
                            d("Failed to read hits from persisted store", e2);
                            m26429Q();
                            try {
                                this.f14973b.m26030c();
                                this.f14973b.m26027d();
                            } catch (SQLiteException e3) {
                                e("Failed to commit local dispatch transaction", e3);
                                m26429Q();
                            }
                        }
                    } catch (Throwable th) {
                        this.f14973b.m26030c();
                        this.f14973b.m26027d();
                        throw th;
                    }
                    this.f14973b.m26030c();
                    this.f14973b.m26027d();
                    throw th;
                } catch (SQLiteException e4) {
                    e("Failed to commit local dispatch transaction", e4);
                    m26429Q();
                }
                j2 = j;
            }
        } else {
            q("No network or service available. Will retry later");
        }
        return false;
    }
}
