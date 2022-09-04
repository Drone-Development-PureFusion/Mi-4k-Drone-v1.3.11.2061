package com.baidu.tts.p090b.p091a.p092a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p090b.p091a.AbstractC1084b;
import com.baidu.tts.p090b.p091a.p093b.AbstractC1086b;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p103g.p104a.ThreadFactoryC1188a;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* renamed from: com.baidu.tts.b.a.a.c */
/* loaded from: classes.dex */
public class C1076c extends AbstractC1074a {

    /* renamed from: f */
    private ExecutorService f2496f;

    /* renamed from: g */
    private C1083h f2497g = new C1083h(this);

    /* renamed from: h */
    private C1080e f2498h = new C1080e(this);

    /* renamed from: i */
    private C1082g f2499i = new C1082g(this);

    /* renamed from: j */
    private C1081f f2500j = new C1081f(this);

    /* renamed from: com.baidu.tts.b.a.a.c$a */
    /* loaded from: classes.dex */
    private class CallableC1078a implements Callable<Void> {

        /* renamed from: b */
        private C1238i f2503b;

        public CallableC1078a(C1238i c1238i) {
            this.f2503b = c1238i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            try {
                C1076c.this.a(C1237h.m36148b(this.f2503b));
                TtsError mo36662a = C1076c.this.f2492a.mo36662a(this.f2503b);
                if (mo36662a == null) {
                    C1076c.this.c(C1237h.m36148b(this.f2503b));
                } else {
                    C1076c.this.e(C1237h.m36154a(this.f2503b, mo36662a));
                }
            } catch (InterruptedException e) {
            }
            return null;
        }
    }

    public C1076c() {
        this.f2494c = this.f2497g;
    }

    /* renamed from: a */
    private void m36736a(boolean z) {
        if (z) {
            d((C1237h) null);
            return;
        }
        C1237h c1237h = new C1237h();
        c1237h.m36158a(C1191c.m36299a().m36292b(EnumC1182n.TTS_ENGINE_STOP_FAILURE));
        d(c1237h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m36733b(C1235f c1235f) {
        return this.f2492a.mo36664a(c1235f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m36732b(C1236g c1236g) {
        return this.f2492a.mo36663a(c1236g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36735b(AbstractC1086b abstractC1086b) {
        this.f2492a = abstractC1086b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36734b(AbstractC1084b abstractC1084b) {
        if (this.f2493b == null) {
            this.f2493b = new ArrayList();
        }
        if (!this.f2493b.contains(abstractC1084b)) {
            this.f2493b.add(abstractC1084b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36731b(C1238i c1238i) {
        this.f2496f.submit(new CallableC1078a(c1238i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void m36730b(T t) {
        this.f2492a.mo36661a((AbstractC1086b) t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m36729c(C1234e c1234e) {
        return this.f2492a.mo36665a(c1234e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m36728d(C1234e c1234e) {
        return this.f2492a.mo36660b(c1234e);
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: m */
    public boolean mo36252m() {
        return this.f2494c == this.f2500j;
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: n */
    public boolean mo36251n() {
        return Thread.currentThread().isInterrupted() || this.f2494c == this.f2498h;
    }

    /* renamed from: o */
    public C1083h m36727o() {
        return this.f2497g;
    }

    /* renamed from: p */
    public C1080e m36726p() {
        return this.f2498h;
    }

    /* renamed from: q */
    public C1082g m36725q() {
        return this.f2499i;
    }

    /* renamed from: r */
    public C1081f m36724r() {
        return this.f2500j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public TtsError m36723s() {
        if (this.f2493b == null) {
            this.f2493b = new ArrayList();
        }
        this.f2492a.mo36705a(new AbstractC1084b() { // from class: com.baidu.tts.b.a.a.c.1
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
                C1076c.this.b(c1237h);
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
        return this.f2492a.mo36689a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36722t() {
        this.f2496f = Executors.newSingleThreadExecutor(new ThreadFactoryC1188a("EngineExecutorPoolThread"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m36721u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m36720v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m36719w() {
        if (this.f2496f != null) {
            if (!this.f2496f.isShutdown()) {
                this.f2496f.shutdownNow();
            }
            try {
                LoggerProxy.m36554d("EngineExecutor", "before awaitTermination");
                boolean awaitTermination = this.f2496f.awaitTermination(EnumC1180l.DEFAULT.m36312a(), TimeUnit.MILLISECONDS);
                LoggerProxy.m36554d("EngineExecutor", "after awaitTermination isTermination=" + awaitTermination);
                m36736a(awaitTermination);
            } catch (InterruptedException e) {
                m36736a(false);
            }
            this.f2496f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36718x() {
        this.f2492a.mo36687b();
        this.f2493b = null;
    }
}
