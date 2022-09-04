package com.google.android.gms.analytics.internal;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4697t;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.analytics.internal.ah */
/* loaded from: classes2.dex */
public class C3874ah {

    /* renamed from: a */
    private final C3922v f15005a;

    /* renamed from: b */
    private volatile Boolean f15006b;

    /* renamed from: c */
    private String f15007c;

    /* renamed from: d */
    private Set<Integer> f15008d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3874ah(C3922v c3922v) {
        C4588d.m23627a(c3922v);
        this.f15005a = c3922v;
    }

    /* renamed from: A */
    public String m26390A() {
        return "google_analytics_v4.db";
    }

    /* renamed from: B */
    public String m26389B() {
        return "google_analytics2_v4.db";
    }

    /* renamed from: C */
    public long m26388C() {
        return 86400000L;
    }

    /* renamed from: D */
    public int m26387D() {
        return C3882ao.f15023E.m26339a().intValue();
    }

    /* renamed from: E */
    public int m26386E() {
        return C3882ao.f15024F.m26339a().intValue();
    }

    /* renamed from: F */
    public long m26385F() {
        return C3882ao.f15025G.m26339a().longValue();
    }

    /* renamed from: G */
    public long m26384G() {
        return C3882ao.f15034P.m26339a().longValue();
    }

    /* renamed from: a */
    public boolean m26383a() {
        return false;
    }

    /* renamed from: b */
    public boolean m26382b() {
        if (this.f15006b == null) {
            synchronized (this) {
                if (this.f15006b == null) {
                    ApplicationInfo applicationInfo = this.f15005a.m26112b().getApplicationInfo();
                    String m23098b = C4697t.m23098b();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f15006b = Boolean.valueOf(str != null && str.equals(m23098b));
                    }
                    if ((this.f15006b == null || !this.f15006b.booleanValue()) && "com.google.android.gms.analytics".equals(m23098b)) {
                        this.f15006b = Boolean.TRUE;
                    }
                    if (this.f15006b == null) {
                        this.f15006b = Boolean.TRUE;
                        this.f15005a.m26108f().u("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f15006b.booleanValue();
    }

    /* renamed from: c */
    public boolean m26381c() {
        return C3882ao.f15037b.m26339a().booleanValue();
    }

    /* renamed from: d */
    public int m26380d() {
        return C3882ao.f15056u.m26339a().intValue();
    }

    /* renamed from: e */
    public int m26379e() {
        return C3882ao.f15060y.m26339a().intValue();
    }

    /* renamed from: f */
    public int m26378f() {
        return C3882ao.f15061z.m26339a().intValue();
    }

    /* renamed from: g */
    public int m26377g() {
        return C3882ao.f15019A.m26339a().intValue();
    }

    /* renamed from: h */
    public long m26376h() {
        return C3882ao.f15045j.m26339a().longValue();
    }

    /* renamed from: i */
    public long m26375i() {
        return C3882ao.f15044i.m26339a().longValue();
    }

    /* renamed from: j */
    public long m26374j() {
        return C3882ao.f15048m.m26339a().longValue();
    }

    /* renamed from: k */
    public long m26373k() {
        return C3882ao.f15049n.m26339a().longValue();
    }

    /* renamed from: l */
    public int m26372l() {
        return C3882ao.f15050o.m26339a().intValue();
    }

    /* renamed from: m */
    public int m26371m() {
        return C3882ao.f15051p.m26339a().intValue();
    }

    /* renamed from: n */
    public long m26370n() {
        return C3882ao.f15021C.m26339a().intValue();
    }

    /* renamed from: o */
    public String m26369o() {
        return C3882ao.f15053r.m26339a();
    }

    /* renamed from: p */
    public String m26368p() {
        return C3882ao.f15052q.m26339a();
    }

    /* renamed from: q */
    public String m26367q() {
        return C3882ao.f15054s.m26339a();
    }

    /* renamed from: r */
    public String m26366r() {
        return C3882ao.f15055t.m26339a();
    }

    /* renamed from: s */
    public EnumC3866ac m26365s() {
        return EnumC3866ac.m26404a(C3882ao.f15057v.m26339a());
    }

    /* renamed from: t */
    public EnumC3870ae m26364t() {
        return EnumC3870ae.m26393a(C3882ao.f15058w.m26339a());
    }

    /* renamed from: u */
    public Set<Integer> m26363u() {
        String m26339a = C3882ao.f15020B.m26339a();
        if (this.f15008d == null || this.f15007c == null || !this.f15007c.equals(m26339a)) {
            String[] split = TextUtils.split(m26339a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            HashSet hashSet = new HashSet();
            for (String str : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException e) {
                }
            }
            this.f15007c = m26339a;
            this.f15008d = hashSet;
        }
        return this.f15008d;
    }

    /* renamed from: v */
    public long m26362v() {
        return C3882ao.f15029K.m26339a().longValue();
    }

    /* renamed from: w */
    public long m26361w() {
        return C3882ao.f15030L.m26339a().longValue();
    }

    /* renamed from: x */
    public long m26360x() {
        return C3882ao.f15033O.m26339a().longValue();
    }

    /* renamed from: y */
    public int m26359y() {
        return C3882ao.f15041f.m26339a().intValue();
    }

    /* renamed from: z */
    public int m26358z() {
        return C3882ao.f15043h.m26339a().intValue();
    }
}
