package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7097hm;
import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.AbstractC7136hy;
import com.google.android.gms.internal.AbstractC7316kt;
import com.google.firebase.C9751b;
import com.google.firebase.database.C9866d;
import com.google.firebase.database.C9874g;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p005b.p006a.p007a.p029b.p052m.C0636h;
/* renamed from: com.google.android.gms.internal.ic */
/* loaded from: classes2.dex */
public class C7146ic {

    /* renamed from: a */
    protected AbstractC7316kt f24049a;

    /* renamed from: b */
    protected AbstractC7153ig f24050b;

    /* renamed from: c */
    protected AbstractC7136hy f24051c;

    /* renamed from: d */
    protected AbstractC7199ip f24052d;

    /* renamed from: e */
    protected String f24053e;

    /* renamed from: f */
    protected String f24054f;

    /* renamed from: h */
    protected boolean f24056h;

    /* renamed from: j */
    protected C9751b f24058j;

    /* renamed from: m */
    private AbstractC7163il f24061m;

    /* renamed from: g */
    protected AbstractC7316kt.EnumC7317a f24055g = AbstractC7316kt.EnumC7317a.INFO;

    /* renamed from: i */
    protected long f24057i = C0636h.f1132b;

    /* renamed from: k */
    private boolean f24059k = false;

    /* renamed from: l */
    private boolean f24060l = false;

    /* renamed from: A */
    private void m15417A() {
        if (this.f24053e == null) {
            this.f24053e = "default";
        }
    }

    /* renamed from: a */
    private static AbstractC7097hm m15414a(final AbstractC7136hy abstractC7136hy) {
        return new AbstractC7097hm() { // from class: com.google.android.gms.internal.ic.1
            @Override // com.google.android.gms.internal.AbstractC7097hm
            /* renamed from: a */
            public void mo6823a(boolean z, final AbstractC7097hm.AbstractC7098a abstractC7098a) {
                AbstractC7136hy.this.mo15437a(z, new AbstractC7136hy.AbstractC7137a() { // from class: com.google.android.gms.internal.ic.1.1
                    @Override // com.google.android.gms.internal.AbstractC7136hy.AbstractC7137a
                    /* renamed from: a */
                    public void mo15385a(String str) {
                        abstractC7098a.mo6825a(str);
                    }

                    @Override // com.google.android.gms.internal.AbstractC7136hy.AbstractC7137a
                    /* renamed from: b */
                    public void mo15384b(String str) {
                        abstractC7098a.mo6824b(str);
                    }
                });
            }
        };
    }

    /* renamed from: c */
    private String m15409c(String str) {
        return "Firebase/5/" + C9874g.m6731g() + "/" + str;
    }

    /* renamed from: q */
    private AbstractC7163il m15395q() {
        if (this.f24061m == null) {
            if (C7377lz.m14642a()) {
                m15394r();
            } else if (EnumC7154ih.m15374a()) {
                EnumC7154ih enumC7154ih = EnumC7154ih.INSTANCE;
                enumC7154ih.m15373b();
                this.f24061m = enumC7154ih;
            } else {
                this.f24061m = EnumC7158ii.INSTANCE;
            }
        }
        return this.f24061m;
    }

    /* renamed from: r */
    private synchronized void m15394r() {
        this.f24061m = new C7058gw(this.f24058j);
    }

    /* renamed from: s */
    private void m15393s() {
        m15390v();
        m15395q();
        m15387y();
        m15388x();
        m15389w();
        m15417A();
        m15386z();
    }

    /* renamed from: t */
    private void m15392t() {
        this.f24050b.mo15155b();
        this.f24052d.mo14623d();
    }

    /* renamed from: u */
    private ScheduledExecutorService m15391u() {
        AbstractC7199ip m15399m = m15399m();
        if (!(m15399m instanceof AbstractC7383me)) {
            throw new RuntimeException("Custom run loops are not supported!");
        }
        return ((AbstractC7383me) m15399m).m14622e();
    }

    /* renamed from: v */
    private void m15390v() {
        if (this.f24049a == null) {
            this.f24049a = m15395q().mo15350a(this, this.f24055g, null);
        }
    }

    /* renamed from: w */
    private void m15389w() {
        if (this.f24052d == null) {
            this.f24052d = this.f24061m.mo15347b(this);
        }
    }

    /* renamed from: x */
    private void m15388x() {
        if (this.f24050b == null) {
            this.f24050b = m15395q().mo15352a(this);
        }
    }

    /* renamed from: y */
    private void m15387y() {
        if (this.f24054f == null) {
            this.f24054f = m15409c(m15395q().mo15346c(this));
        }
    }

    /* renamed from: z */
    private void m15386z() {
        if (this.f24051c == null) {
            this.f24051c = m15395q().mo15348a(m15391u());
        }
    }

    /* renamed from: a */
    public AbstractC7103hr m15415a(C7101hp c7101hp, AbstractC7103hr.AbstractC7104a abstractC7104a) {
        return m15395q().mo15351a(this, m15403i(), c7101hp, abstractC7104a);
    }

    /* renamed from: a */
    public C7315ks m15413a(String str) {
        return new C7315ks(this.f24049a, str);
    }

    /* renamed from: a */
    public boolean m15416a() {
        return this.f24059k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC7257jp m15411b(String str) {
        if (this.f24056h) {
            AbstractC7257jp mo15349a = this.f24061m.mo15349a(this, str);
            if (mo15349a != null) {
                return mo15349a;
            }
            throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
        }
        return new C7256jo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m15412b() {
        if (!this.f24059k) {
            this.f24059k = true;
            m15393s();
        }
    }

    /* renamed from: c */
    public void m15410c() {
        if (this.f24060l) {
            m15392t();
            this.f24060l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m15408d() {
        this.f24060l = true;
        this.f24050b.mo15157a();
        this.f24052d.mo14624c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m15407e() {
        if (m15416a()) {
            throw new C9866d("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    /* renamed from: f */
    public List<String> m15406f() {
        return null;
    }

    /* renamed from: g */
    public AbstractC7316kt.EnumC7317a m15405g() {
        return this.f24055g;
    }

    /* renamed from: h */
    public AbstractC7316kt m15404h() {
        return this.f24049a;
    }

    /* renamed from: i */
    public C7099hn m15403i() {
        return new C7099hn(m15404h(), m15414a(m15396p()), m15391u(), m15402j(), C9874g.m6731g(), m15398n());
    }

    /* renamed from: j */
    public boolean m15402j() {
        return this.f24056h;
    }

    /* renamed from: k */
    public long m15401k() {
        return this.f24057i;
    }

    /* renamed from: l */
    public AbstractC7153ig m15400l() {
        return this.f24050b;
    }

    /* renamed from: m */
    public AbstractC7199ip m15399m() {
        return this.f24052d;
    }

    /* renamed from: n */
    public String m15398n() {
        return this.f24054f;
    }

    /* renamed from: o */
    public String m15397o() {
        return this.f24053e;
    }

    /* renamed from: p */
    public AbstractC7136hy m15396p() {
        return this.f24051c;
    }
}
