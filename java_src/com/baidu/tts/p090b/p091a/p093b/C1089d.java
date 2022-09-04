package com.baidu.tts.p090b.p091a.p093b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p090b.p091a.AbstractC1084b;
import com.baidu.tts.p090b.p091a.p093b.C1092e;
import com.baidu.tts.p090b.p091a.p093b.C1096f;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p114m.C1231b;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
/* renamed from: com.baidu.tts.b.a.b.d */
/* loaded from: classes.dex */
public class C1089d extends AbstractC1085a {

    /* renamed from: b */
    private C1231b f2508b;

    /* renamed from: f */
    private TtsError f2512f;

    /* renamed from: g */
    private int f2513g = 0;

    /* renamed from: h */
    private int f2514h = 0;

    /* renamed from: c */
    private C1096f f2509c = new C1096f();

    /* renamed from: d */
    private C1092e f2510d = new C1092e();

    /* renamed from: e */
    private C1087c f2511e = new C1087c();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C1237h m36695b(C1237h c1237h) {
        int m36151b = c1237h.m36151b();
        c1237h.m36150b(m36151b >= 0 ? m36151b + this.f2514h : m36151b - this.f2514h);
        c1237h.m36146c(c1237h.m36147c() + this.f2513g);
        return c1237h;
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36665a(C1234e c1234e) {
        return this.f2510d.mo36665a(c1234e);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36664a(C1235f c1235f) {
        return this.f2510d.mo36664a(c1235f);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36663a(C1236g c1236g) {
        if (this.f2512f == null) {
            return this.f2510d.mo36663a(c1236g);
        }
        String m36164a = c1236g.m36164a();
        String m36162b = c1236g.m36162b();
        C1092e.C1094b m36196b = this.f2508b.m36196b();
        m36196b.m36677d(m36164a);
        m36196b.m36675e(m36162b);
        this.f2512f = this.f2510d.mo36689a();
        if (this.f2512f != null) {
            return this.f2512f.getDetailCode();
        }
        return 0;
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public TtsError mo36689a() {
        this.f2509c.a(new AbstractC1084b() { // from class: com.baidu.tts.b.a.b.d.1
            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: a */
            public void mo36694a(C1237h c1237h) {
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: b */
            public void mo36693b(C1237h c1237h) {
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: c */
            public void mo36692c(C1237h c1237h) {
                C1089d.this.f2514h = c1237h.m36151b();
                C1089d.this.f2513g = c1237h.m36147c();
                C1089d.this.a(c1237h);
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: d */
            public void mo36691d(C1237h c1237h) {
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: e */
            public void mo36690e(C1237h c1237h) {
            }
        });
        this.f2510d.a(new AbstractC1084b() { // from class: com.baidu.tts.b.a.b.d.2
            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: a */
            public void mo36694a(C1237h c1237h) {
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: b */
            public void mo36693b(C1237h c1237h) {
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: c */
            public void mo36692c(C1237h c1237h) {
                C1089d.this.a(C1089d.this.m36695b(c1237h));
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: d */
            public void mo36691d(C1237h c1237h) {
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: e */
            public void mo36690e(C1237h c1237h) {
            }
        });
        this.f2509c.a();
        this.f2512f = this.f2510d.mo36689a();
        if (this.f2512f != null) {
            return C1191c.m36299a().m36292b(EnumC1182n.MIX_ENGINE_OFFLINE_INIT_FAILURE);
        }
        return null;
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public TtsError mo36662a(C1238i c1238i) {
        this.f2514h = 0;
        this.f2513g = 0;
        if (this.f2511e.m36704a()) {
            TtsError mo36662a = this.f2509c.mo36662a(c1238i);
            if (mo36662a == null) {
                return mo36662a;
            }
            LoggerProxy.m36554d("MixSynthesizer", "online synthesize ttserror=" + mo36662a.getDetailMessage());
            c1238i.m36136b(c1238i.m36135c().substring(this.f2513g));
            return this.f2510d.mo36662a(c1238i);
        }
        return this.f2510d.mo36662a(c1238i);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public <AllSynthesizerParams> void mo36661a(AllSynthesizerParams allsynthesizerparams) {
        this.f2508b = (C1231b) allsynthesizerparams;
        C1096f.C1098b m36199a = this.f2508b.m36199a();
        m36199a.m36656a(3);
        m36199a.m36651b(500);
        this.f2509c.mo36661a((C1096f) m36199a);
        this.f2510d.mo36661a((C1092e) this.f2508b.m36196b());
        this.f2511e.m36702a(this.f2508b);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: b */
    public int mo36660b(C1234e c1234e) {
        return this.f2510d.mo36660b(c1234e);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: b */
    public TtsError mo36687b() {
        this.f2509c.b();
        this.f2510d.mo36687b();
        this.f2511e.m36702a((C1231b) null);
        return null;
    }
}
