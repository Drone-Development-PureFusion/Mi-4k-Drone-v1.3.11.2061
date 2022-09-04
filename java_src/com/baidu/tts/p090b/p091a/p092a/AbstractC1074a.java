package com.baidu.tts.p090b.p091a.p092a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p090b.p091a.AbstractC1084b;
import com.baidu.tts.p090b.p091a.p093b.AbstractC1086b;
import com.baidu.tts.p102f.EnumC1173e;
import com.baidu.tts.p110j.AbstractC1196a;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.baidu.tts.b.a.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1074a extends AbstractC1196a implements AbstractC1079d {

    /* renamed from: a */
    protected AbstractC1086b f2492a;

    /* renamed from: b */
    protected List<AbstractC1084b> f2493b = new ArrayList();

    /* renamed from: c */
    protected volatile AbstractC1075b f2494c;

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public int mo36712a(C1234e c1234e) {
        return this.f2494c.mo36712a(c1234e);
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public int mo36711a(C1235f c1235f) {
        return this.f2494c.mo36711a(c1235f);
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public int mo36710a(C1236g c1236g) {
        return this.f2494c.mo36710a(c1236g);
    }

    /* renamed from: a */
    public AbstractC1075b m36744a() {
        return this.f2494c;
    }

    /* renamed from: a */
    public void m36743a(AbstractC1075b abstractC1075b) {
        this.f2494c = abstractC1075b;
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public void mo36716a(AbstractC1086b abstractC1086b) {
        this.f2494c.mo36716a(abstractC1086b);
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public void mo36715a(AbstractC1084b abstractC1084b) {
        this.f2494c.mo36715a(abstractC1084b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36742a(C1237h c1237h) {
        if (C()) {
            if (c1237h == null) {
                c1237h = new C1237h();
            }
            c1237h.m36156a(EnumC1173e.SYN_START);
            if (this.f2493b == null) {
                return;
            }
            for (AbstractC1084b abstractC1084b : this.f2493b) {
                if (abstractC1084b != null) {
                    abstractC1084b.mo36694a(c1237h);
                }
            }
        }
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public void mo36708a(C1238i c1238i) {
        this.f2494c.mo36708a(c1238i);
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public void mo36714a(Object obj) {
        this.f2494c.mo36714a((AbstractC1075b) obj);
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: b */
    public int mo36707b(C1234e c1234e) {
        return this.f2494c.mo36707b(c1234e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36741b(C1237h c1237h) {
        if (C()) {
            if (c1237h == null) {
                c1237h = new C1237h();
            }
            c1237h.m36156a(EnumC1173e.SYN_DATA);
            if (this.f2493b == null) {
                return;
            }
            for (AbstractC1084b abstractC1084b : this.f2493b) {
                if (abstractC1084b != null) {
                    abstractC1084b.mo36692c(c1237h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m36740c(C1237h c1237h) {
        if (C()) {
            if (c1237h == null) {
                c1237h = new C1237h();
            }
            c1237h.m36156a(EnumC1173e.SYN_FINISH);
            if (this.f2493b == null) {
                return;
            }
            for (AbstractC1084b abstractC1084b : this.f2493b) {
                if (abstractC1084b != null) {
                    abstractC1084b.mo36693b(c1237h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36739d(C1237h c1237h) {
        if (c1237h == null) {
            c1237h = new C1237h();
        }
        c1237h.m36156a(EnumC1173e.SYN_STOP);
        if (this.f2493b != null) {
            for (AbstractC1084b abstractC1084b : this.f2493b) {
                if (abstractC1084b != null) {
                    abstractC1084b.mo36690e(c1237h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36738e(C1237h c1237h) {
        if (c1237h == null) {
            c1237h = new C1237h();
        }
        c1237h.m36156a(EnumC1173e.SYN_ERROR);
        if (this.f2493b != null) {
            for (AbstractC1084b abstractC1084b : this.f2493b) {
                if (abstractC1084b != null) {
                    abstractC1084b.mo36691d(c1237h);
                }
            }
        }
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: g */
    protected TtsError mo36258g() {
        return this.f2494c.mo36091b();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: h */
    protected void mo36257h() {
        this.f2494c.mo36713a();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: i */
    protected void mo36256i() {
        this.f2494c.mo36090c();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: j */
    protected void mo36255j() {
        this.f2494c.mo36089d();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: k */
    protected void mo36254k() {
        this.f2494c.mo36088e();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: l */
    protected void mo36253l() {
        this.f2494c.mo36087f();
    }
}
