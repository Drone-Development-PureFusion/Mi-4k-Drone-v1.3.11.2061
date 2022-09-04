package com.baidu.tts.p116o.p117a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p090b.p094b.p096b.C1116b;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1238i;
/* renamed from: com.baidu.tts.o.a.d */
/* loaded from: classes.dex */
public class C1247d extends AbstractC1243a {
    public C1247d(C1245c c1245c) {
        super(c1245c);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public TtsError mo36091b() {
        TtsError m36101h = this.f3091a.m36101h();
        if (m36101h != null) {
            EnumC1182n errorEnum = m36101h.getErrorEnum();
            if (errorEnum != null) {
                if (EnumC1182n.EnumC1183a.MIX_ERROR.equals(errorEnum.m36308a())) {
                    a(this.f3091a.m36102g());
                }
            }
        } else {
            a(this.f3091a.m36102g());
        }
        return m36101h;
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: c */
    public void mo36090c() {
        this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: d */
    public void mo36089d() {
        this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: e */
    public void mo36088e() {
        this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: f */
    public void mo36087f() {
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int freeCustomResource(C1234e c1234e) {
        return this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadCustomResource(C1234e c1234e) {
        return this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadEnglishModel(C1235f c1235f) {
        return this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadModel(C1236g c1236g) {
        return this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setAudioStreamType(int i) {
        this.f3091a.getTtsParams().m36122e().a(i);
        return 0;
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setStereoVolume(float f, float f2) {
        C1116b.C1117a m36122e = this.f3091a.getTtsParams().m36122e();
        m36122e.m36573a(f);
        m36122e.m36571b(f2);
        return 0;
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void speak(C1238i c1238i) {
        this.f3091a.m36093p();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void synthesize(C1238i c1238i) {
        this.f3091a.m36093p();
    }
}
