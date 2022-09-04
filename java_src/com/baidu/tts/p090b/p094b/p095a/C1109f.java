package com.baidu.tts.p090b.p094b.p095a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p090b.p094b.AbstractC1103a;
import com.baidu.tts.p090b.p094b.C1114b;
import com.baidu.tts.p090b.p094b.p096b.AbstractC1118c;
import com.baidu.tts.p097c.C1119a;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p114m.C1230a;
import com.baidu.tts.p114m.C1237h;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.baidu.tts.b.b.a.f */
/* loaded from: classes.dex */
public class C1109f extends AbstractC1104a {

    /* renamed from: c */
    private ThreadPoolExecutor f2570c;

    /* renamed from: g */
    private C1113h f2572g = new C1113h(this);

    /* renamed from: h */
    private C1107d f2573h = new C1107d(this);

    /* renamed from: i */
    private C1112g f2574i = new C1112g(this);

    /* renamed from: j */
    private C1108e f2575j = new C1108e(this);

    /* renamed from: f */
    private AbstractC1118c f2571f = C1114b.m36586a().m36585b();

    /* renamed from: com.baidu.tts.b.b.a.f$a */
    /* loaded from: classes.dex */
    private class RunnableC1111a implements Runnable {

        /* renamed from: b */
        private C1237h f2578b;

        public RunnableC1111a(C1237h c1237h) {
            this.f2578b = c1237h;
        }

        @Override // java.lang.Runnable
        public void run() {
            LoggerProxy.m36554d("PlayQueueMachine", "enter run");
            C1109f.this.f2571f.mo36562a(this.f2578b);
            LoggerProxy.m36554d("PlayQueueMachine", "end run");
        }
    }

    public C1109f() {
        this.f2568b = this.f2572g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m36607b(float f, float f2) {
        return this.f2571f.mo36565a(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m36606b(int i) {
        return this.f2571f.mo36564a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36605b(AbstractC1103a abstractC1103a) {
        this.f2567a = abstractC1103a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void m36604b(T t) {
        this.f2571f.mo36561a((AbstractC1118c) ((C1230a) t).m36201a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36603e(C1237h c1237h) {
        this.f2570c.execute(new RunnableC1111a(c1237h));
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: m */
    public boolean mo36252m() {
        return this.f2568b == this.f2575j;
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: n */
    public boolean mo36251n() {
        return Thread.currentThread().isInterrupted() || this.f2568b == this.f2573h;
    }

    /* renamed from: p */
    public C1113h m36602p() {
        return this.f2572g;
    }

    /* renamed from: q */
    public C1107d m36601q() {
        return this.f2573h;
    }

    /* renamed from: r */
    public C1112g m36600r() {
        return this.f2574i;
    }

    /* renamed from: s */
    public C1108e m36599s() {
        return this.f2575j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public TtsError m36598t() {
        this.f2571f.mo36563a(new AbstractC1103a() { // from class: com.baidu.tts.b.b.a.f.1
            @Override // com.baidu.tts.p090b.p094b.AbstractC1103a
            /* renamed from: a */
            public void mo36591a(C1237h c1237h) {
                C1109f.this.b(c1237h);
            }

            @Override // com.baidu.tts.p090b.p094b.AbstractC1103a
            /* renamed from: b */
            public void mo36590b(C1237h c1237h) {
                C1109f.this.c(c1237h);
            }

            @Override // com.baidu.tts.p090b.p094b.AbstractC1103a
            /* renamed from: c */
            public void mo36589c(C1237h c1237h) {
                C1109f.this.d(c1237h);
            }
        });
        return this.f2571f.mo36566a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m36597u() {
        this.f2570c = new C1119a(100, "PlayExecutorPoolThread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m36596v() {
        this.f2571f.mo36558d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m36595w() {
        this.f2571f.mo36559c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36594x() {
        this.f2571f.mo36557e();
        if (this.f2570c != null) {
            if (!this.f2570c.isShutdown()) {
                this.f2570c.shutdownNow();
            }
            try {
                LoggerProxy.m36554d("PlayQueueMachine", "before await");
                LoggerProxy.m36554d("PlayQueueMachine", "after await isTer=" + this.f2570c.awaitTermination(EnumC1180l.DEFAULT.m36312a(), TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                LoggerProxy.m36554d("PlayQueueMachine", "InterruptedException");
            }
            this.f2570c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36593y() {
        this.f2571f.mo36556f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m36592z() {
        this.f2571f.mo36560b();
    }
}
