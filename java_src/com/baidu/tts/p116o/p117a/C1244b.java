package com.baidu.tts.p116o.p117a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1238i;
/* renamed from: com.baidu.tts.o.a.b */
/* loaded from: classes.dex */
public class C1244b extends AbstractC1243a {
    public C1244b(C1245c c1245c) {
        super(c1245c);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public TtsError mo36091b() {
        return null;
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: c */
    public void mo36090c() {
        this.f3091a.m36100i();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: d */
    public void mo36089d() {
        this.f3091a.m36099j();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: e */
    public void mo36088e() {
        this.f3091a.m36098k();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: f */
    public void mo36087f() {
        this.f3091a.m36097l();
        a(this.f3091a.m36119a());
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int freeCustomResource(C1234e c1234e) {
        return this.f3091a.m36104b(c1234e);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadCustomResource(C1234e c1234e) {
        return this.f3091a.m36111a(c1234e);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadEnglishModel(C1235f c1235f) {
        return this.f3091a.m36110a(c1235f);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadModel(C1236g c1236g) {
        return this.f3091a.m36109a(c1236g);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setAudioStreamType(int i) {
        return this.f3091a.m36117a(i);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setStereoVolume(float f, float f2) {
        return this.f3091a.m36118a(f, f2);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void speak(C1238i c1238i) {
        this.f3091a.m36107a(c1238i);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void synthesize(C1238i c1238i) {
        this.f3091a.m36103b(c1238i);
    }
}
