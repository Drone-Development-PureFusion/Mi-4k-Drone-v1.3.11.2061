package com.baidu.tts.p090b.p094b.p095a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p114m.C1237h;
/* renamed from: com.baidu.tts.b.b.a.h */
/* loaded from: classes.dex */
public class C1113h extends AbstractC1105b {
    public C1113h(C1109f c1109f) {
        super(c1109f);
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1105b, com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: a */
    public void mo36588a(C1237h c1237h) {
        mo36091b();
        if (this.f2569a.a() != this) {
            this.f2569a.a(c1237h);
        }
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1105b, com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public TtsError mo36091b() {
        TtsError m36598t = this.f2569a.m36598t();
        a((AbstractC1105b) this.f2569a.m36601q());
        return m36598t;
    }

    @Override // com.baidu.tts.p090b.p094b.p095a.AbstractC1105b, com.baidu.tts.p090b.p094b.p095a.AbstractC1106c
    /* renamed from: o */
    public void mo36587o() {
        mo36091b();
        if (this.f2569a.a() != this) {
            this.f2569a.o();
        }
    }
}
