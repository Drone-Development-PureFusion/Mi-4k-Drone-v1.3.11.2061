package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.C3836c;
import com.google.android.gms.analytics.C3940p;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import java.lang.Thread;
/* renamed from: com.google.android.gms.analytics.internal.v */
/* loaded from: classes2.dex */
public class C3922v {

    /* renamed from: a */
    private static volatile C3922v f15155a;

    /* renamed from: b */
    private final Context f15156b;

    /* renamed from: c */
    private final Context f15157c;

    /* renamed from: d */
    private final AbstractC4682e f15158d;

    /* renamed from: e */
    private final C3874ah f15159e;

    /* renamed from: f */
    private final C3893g f15160f;

    /* renamed from: g */
    private final C3940p f15161g;

    /* renamed from: h */
    private final C3911r f15162h;

    /* renamed from: i */
    private final C3879al f15163i;

    /* renamed from: j */
    private final C3910q f15164j;

    /* renamed from: k */
    private final C3897j f15165k;

    /* renamed from: l */
    private final C3836c f15166l;

    /* renamed from: m */
    private final C3867ad f15167m;

    /* renamed from: n */
    private final C3858a f15168n;

    /* renamed from: o */
    private final C3859aa f15169o;

    /* renamed from: p */
    private final C3878ak f15170p;

    protected C3922v(C3924w c3924w) {
        Context m26094a = c3924w.m26094a();
        C4588d.m23626a(m26094a, "Application context can't be null");
        Context m26091b = c3924w.m26091b();
        C4588d.m23627a(m26091b);
        this.f15156b = m26094a;
        this.f15157c = m26091b;
        this.f15158d = c3924w.m26084h(this);
        this.f15159e = c3924w.m26085g(this);
        C3893g m26086f = c3924w.m26086f(this);
        m26086f.E();
        this.f15160f = m26086f;
        if (m26109e().m26383a()) {
            C3893g m26108f = m26108f();
            String str = C3921u.f15153a;
            m26108f.s(new StringBuilder(String.valueOf(str).length() + 33).append("Google Analytics ").append(str).append(" is starting up.").toString());
        } else {
            C3893g m26108f2 = m26108f();
            String str2 = C3921u.f15153a;
            m26108f2.s(new StringBuilder(String.valueOf(str2).length() + 134).append("Google Analytics ").append(str2).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        }
        C3897j m26075q = c3924w.m26075q(this);
        m26075q.E();
        this.f15165k = m26075q;
        C3910q m26087e = c3924w.m26087e(this);
        m26087e.E();
        this.f15164j = m26087e;
        C3911r m26080l = c3924w.m26080l(this);
        C3867ad m26088d = c3924w.m26088d(this);
        C3858a m26089c = c3924w.m26089c(this);
        C3859aa m26090b = c3924w.m26090b(this);
        C3878ak m26092a = c3924w.m26092a(this);
        C3940p m26093a = c3924w.m26093a(m26094a);
        m26093a.m25968a(m26115a());
        this.f15161g = m26093a;
        C3836c m26083i = c3924w.m26083i(this);
        m26088d.E();
        this.f15167m = m26088d;
        m26089c.E();
        this.f15168n = m26089c;
        m26090b.E();
        this.f15169o = m26090b;
        m26092a.E();
        this.f15170p = m26092a;
        C3879al m26076p = c3924w.m26076p(this);
        m26076p.E();
        this.f15163i = m26076p;
        m26080l.E();
        this.f15162h = m26080l;
        if (m26109e().m26383a()) {
            m26108f().b("Device AnalyticsService version", C3921u.f15153a);
        }
        m26083i.m26594a();
        this.f15166l = m26083i;
        m26080l.m26164b();
    }

    /* renamed from: a */
    public static C3922v m26114a(Context context) {
        C4588d.m23627a(context);
        if (f15155a == null) {
            synchronized (C3922v.class) {
                if (f15155a == null) {
                    AbstractC4682e m23138d = C4685h.m23138d();
                    long mo16432b = m23138d.mo16432b();
                    C3922v c3922v = new C3922v(new C3924w(context));
                    f15155a = c3922v;
                    C3836c.m26578d();
                    long mo16432b2 = m23138d.mo16432b() - mo16432b;
                    long longValue = C3882ao.f15035Q.m26339a().longValue();
                    if (mo16432b2 > longValue) {
                        c3922v.m26108f().c("Slow initialization (ms)", Long.valueOf(mo16432b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f15155a;
    }

    /* renamed from: a */
    private void m26113a(AbstractC3920t abstractC3920t) {
        C4588d.m23626a(abstractC3920t, "Analytics service not created/initialized");
        C4588d.m23618b(abstractC3920t.m26118C(), "Analytics service not initialized");
    }

    /* renamed from: a */
    protected Thread.UncaughtExceptionHandler m26115a() {
        return new Thread.UncaughtExceptionHandler() { // from class: com.google.android.gms.analytics.internal.v.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                C3893g m26107g = C3922v.this.m26107g();
                if (m26107g != null) {
                    m26107g.e("Job execution failed", th);
                }
            }
        };
    }

    /* renamed from: b */
    public Context m26112b() {
        return this.f15156b;
    }

    /* renamed from: c */
    public Context m26111c() {
        return this.f15157c;
    }

    /* renamed from: d */
    public AbstractC4682e m26110d() {
        return this.f15158d;
    }

    /* renamed from: e */
    public C3874ah m26109e() {
        return this.f15159e;
    }

    /* renamed from: f */
    public C3893g m26108f() {
        m26113a(this.f15160f);
        return this.f15160f;
    }

    /* renamed from: g */
    public C3893g m26107g() {
        return this.f15160f;
    }

    /* renamed from: h */
    public C3940p m26106h() {
        C4588d.m23627a(this.f15161g);
        return this.f15161g;
    }

    /* renamed from: i */
    public C3911r m26105i() {
        m26113a(this.f15162h);
        return this.f15162h;
    }

    /* renamed from: j */
    public C3879al m26104j() {
        m26113a(this.f15163i);
        return this.f15163i;
    }

    /* renamed from: k */
    public C3836c m26103k() {
        C4588d.m23627a(this.f15166l);
        C4588d.m23618b(this.f15166l.m26580c(), "Analytics instance not initialized");
        return this.f15166l;
    }

    /* renamed from: l */
    public C3910q m26102l() {
        m26113a(this.f15164j);
        return this.f15164j;
    }

    /* renamed from: m */
    public C3897j m26101m() {
        m26113a(this.f15165k);
        return this.f15165k;
    }

    /* renamed from: n */
    public C3897j m26100n() {
        if (this.f15165k == null || !this.f15165k.C()) {
            return null;
        }
        return this.f15165k;
    }

    /* renamed from: o */
    public C3858a m26099o() {
        m26113a(this.f15168n);
        return this.f15168n;
    }

    /* renamed from: p */
    public C3867ad m26098p() {
        m26113a(this.f15167m);
        return this.f15167m;
    }

    /* renamed from: q */
    public C3859aa m26097q() {
        m26113a(this.f15169o);
        return this.f15169o;
    }

    /* renamed from: r */
    public C3878ak m26096r() {
        return this.f15170p;
    }

    /* renamed from: s */
    public void m26095s() {
        C3940p.m25962d();
    }
}
