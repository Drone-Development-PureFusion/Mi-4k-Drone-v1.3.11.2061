package com.baidu.tts.p090b.p094b.p095a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p090b.p094b.AbstractC1103a;
import com.baidu.tts.p110j.AbstractC1196a;
import com.baidu.tts.p114m.C1237h;
/* renamed from: com.baidu.tts.b.b.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1104a extends AbstractC1196a implements AbstractC1106c {

    /* renamed from: a */
    protected AbstractC1103a f2567a;

    /* renamed from: b */
    protected volatile AbstractC1105b f2568b;

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: a */
    public int mo36613a(float f, float f2) {
        return this.f2568b.mo36613a(f, f2);
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: a */
    public int mo36612a(int i) {
        return this.f2568b.mo36612a(i);
    }

    /* renamed from: a */
    public AbstractC1105b m36619a() {
        return this.f2568b;
    }

    /* renamed from: a */
    public void m36618a(AbstractC1105b abstractC1105b) {
        this.f2568b = abstractC1105b;
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: a */
    public void mo36611a(AbstractC1103a abstractC1103a) {
        this.f2568b.mo36611a(abstractC1103a);
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: a */
    public void mo36588a(C1237h c1237h) {
        this.f2568b.mo36588a(c1237h);
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: a */
    public <T> void mo36610a(T t) {
        this.f2568b.mo36610a((AbstractC1105b) t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m36617b(C1237h c1237h) {
        if (!C() || this.f2567a == null) {
            return;
        }
        this.f2567a.mo36591a(c1237h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m36616c(C1237h c1237h) {
        if (!C() || this.f2567a == null) {
            return;
        }
        this.f2567a.mo36590b(c1237h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m36615d(C1237h c1237h) {
        if (!C() || this.f2567a == null) {
            return;
        }
        this.f2567a.mo36589c(c1237h);
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: g */
    protected TtsError mo36258g() {
        return this.f2568b.mo36091b();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: h */
    protected void mo36257h() {
        this.f2568b.mo36609a();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: i */
    protected void mo36256i() {
        this.f2568b.mo36090c();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: j */
    protected void mo36255j() {
        this.f2568b.mo36089d();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: k */
    protected void mo36254k() {
        this.f2568b.mo36088e();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: l */
    protected void mo36253l() {
        this.f2568b.mo36087f();
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: o */
    public void mo36587o() {
        this.f2568b.mo36587o();
    }
}
