package com.baidu.tts.p086a.p089c;

import android.util.Log;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p090b.p091a.AbstractC1084b;
import com.baidu.tts.p090b.p091a.p092a.AbstractC1079d;
import com.baidu.tts.p090b.p094b.AbstractC1103a;
import com.baidu.tts.p090b.p094b.p095a.AbstractC1106c;
import com.baidu.tts.p102f.EnumC1177i;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.p114m.C1239j;
/* renamed from: com.baidu.tts.a.c.b */
/* loaded from: classes.dex */
public class C1055b implements AbstractC1054a {

    /* renamed from: a */
    private AbstractC1079d f2436a;

    /* renamed from: b */
    private AbstractC1106c f2437b;

    /* renamed from: c */
    private TtsListener f2438c;

    /* renamed from: d */
    private AbstractC1084b f2439d;

    /* renamed from: e */
    private AbstractC1103a f2440e;

    /* renamed from: f */
    private AbstractC1084b f2441f;

    public C1055b(AbstractC1079d abstractC1079d, AbstractC1106c abstractC1106c, C1239j c1239j) {
        this.f2436a = abstractC1079d;
        this.f2437b = abstractC1106c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m36826a(C1237h c1237h) {
        C1238i m36143e = c1237h.m36143e();
        if (m36143e == null) {
            return false;
        }
        return EnumC1177i.m36314a(m36143e.m36129g());
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: a */
    public int mo36835a(float f, float f2) {
        return this.f2437b.mo36613a(f, f2);
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: a */
    public int mo36829a(C1234e c1234e) {
        return this.f2436a.mo36712a(c1234e);
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: a */
    public int mo36828a(C1235f c1235f) {
        return this.f2436a.mo36711a(c1235f);
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: a */
    public int mo36827a(C1236g c1236g) {
        return this.f2436a.mo36710a(c1236g);
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: a */
    public AbstractC1106c mo36836a() {
        return this.f2437b;
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: a */
    public void mo36832a(TtsListener ttsListener) {
        this.f2438c = ttsListener;
        m36831a(this.f2436a);
        m36830a(this.f2437b);
    }

    /* renamed from: a */
    protected void m36831a(AbstractC1079d abstractC1079d) {
        if (this.f2439d == null) {
            this.f2439d = new AbstractC1084b() { // from class: com.baidu.tts.a.c.b.1
                @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
                /* renamed from: a */
                public void mo36694a(C1237h c1237h) {
                    if (C1055b.this.f2438c != null) {
                        C1055b.this.f2438c.onSynthesizeStart(c1237h);
                    }
                }

                @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
                /* renamed from: b */
                public void mo36693b(C1237h c1237h) {
                    if (C1055b.this.f2438c != null) {
                        C1055b.this.f2438c.onSynthesizeFinished(c1237h);
                    }
                }

                @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
                /* renamed from: c */
                public void mo36692c(C1237h c1237h) {
                    if (C1055b.this.f2438c != null) {
                        C1055b.this.f2438c.onSynthesizeDataArrived(c1237h);
                    }
                }

                @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
                /* renamed from: d */
                public void mo36691d(C1237h c1237h) {
                    if (C1055b.this.f2438c != null) {
                        C1055b.this.f2438c.onError(c1237h);
                    }
                }

                @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
                /* renamed from: e */
                public void mo36690e(C1237h c1237h) {
                    LoggerProxy.m36554d("TtsAdapter", "onSynthesizeStop");
                }
            };
        }
        abstractC1079d.mo36715a(this.f2439d);
    }

    /* renamed from: a */
    protected void m36830a(AbstractC1106c abstractC1106c) {
        if (this.f2440e == null) {
            this.f2440e = new AbstractC1103a() { // from class: com.baidu.tts.a.c.b.2
                @Override // com.baidu.tts.p090b.p094b.AbstractC1103a
                /* renamed from: a */
                public void mo36591a(C1237h c1237h) {
                    if (C1055b.this.f2438c != null) {
                        C1055b.this.f2438c.onPlayStart(c1237h);
                    }
                }

                @Override // com.baidu.tts.p090b.p094b.AbstractC1103a
                /* renamed from: b */
                public void mo36590b(C1237h c1237h) {
                    if (C1055b.this.f2438c != null) {
                        C1055b.this.f2438c.onPlayProgressUpdate(c1237h);
                    }
                }

                @Override // com.baidu.tts.p090b.p094b.AbstractC1103a
                /* renamed from: c */
                public void mo36589c(C1237h c1237h) {
                    if (C1055b.this.f2438c != null) {
                        try {
                            C1055b.this.f2438c.onPlayFinished(c1237h);
                        } catch (Exception e) {
                            Log.e("TtsAdapter", "onPlayFinished exception e=" + e.toString());
                        }
                    }
                }
            };
        }
        abstractC1106c.mo36611a(this.f2440e);
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: a */
    public void mo36825a(C1238i c1238i) {
        this.f2436a.mo36708a(c1238i);
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: b */
    public int mo36823b(C1234e c1234e) {
        return this.f2436a.mo36707b(c1234e);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public TtsError mo36091b() {
        TtsError b = this.f2436a.b();
        this.f2437b.b();
        m36821g();
        return b;
    }

    @Override // com.baidu.tts.p086a.p089c.AbstractC1054a
    /* renamed from: b */
    public void mo36822b(C1238i c1238i) {
        this.f2437b.mo36587o();
        this.f2436a.mo36708a(c1238i);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: c */
    public void mo36090c() {
        this.f2436a.c();
        this.f2437b.c();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: d */
    public void mo36089d() {
        this.f2436a.d();
        this.f2437b.d();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: e */
    public void mo36088e() {
        LoggerProxy.m36554d("TtsAdapter", "before engine stop");
        this.f2436a.e();
        LoggerProxy.m36554d("TtsAdapter", "after engine stop");
        this.f2437b.e();
        LoggerProxy.m36554d("TtsAdapter", "after play stop");
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: f */
    public void mo36087f() {
        LoggerProxy.m36554d("TtsAdapter", "before engine destroy");
        this.f2436a.f();
        LoggerProxy.m36554d("TtsAdapter", "after engine destroy");
        this.f2437b.f();
        LoggerProxy.m36554d("TtsAdapter", "after player destroy");
    }

    /* renamed from: g */
    protected void m36821g() {
        this.f2441f = new AbstractC1084b() { // from class: com.baidu.tts.a.c.b.3
            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: a */
            public void mo36694a(C1237h c1237h) {
                if (C1055b.this.m36826a(c1237h)) {
                    C1055b.this.f2437b.mo36588a(c1237h);
                }
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: b */
            public void mo36693b(C1237h c1237h) {
                if (C1055b.this.m36826a(c1237h)) {
                    C1055b.this.f2437b.mo36588a(c1237h);
                }
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: c */
            public void mo36692c(C1237h c1237h) {
                if (C1055b.this.m36826a(c1237h)) {
                    C1055b.this.f2437b.mo36588a(c1237h);
                }
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: d */
            public void mo36691d(C1237h c1237h) {
            }

            @Override // com.baidu.tts.p090b.p091a.AbstractC1084b
            /* renamed from: e */
            public void mo36690e(C1237h c1237h) {
            }
        };
        this.f2436a.mo36715a(this.f2441f);
    }
}
