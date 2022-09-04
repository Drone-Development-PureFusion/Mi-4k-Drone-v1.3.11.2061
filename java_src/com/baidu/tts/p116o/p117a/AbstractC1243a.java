package com.baidu.tts.p116o.p117a;

import android.content.Context;
import com.baidu.tts.aop.tts.ITts;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1181m;
import com.baidu.tts.p114m.C1239j;
/* renamed from: com.baidu.tts.o.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1243a implements ITts {

    /* renamed from: a */
    protected C1245c f3091a;

    public AbstractC1243a(C1245c c1245c) {
        this.f3091a = c1245c;
    }

    /* renamed from: a */
    public void m36120a(AbstractC1243a abstractC1243a) {
        this.f3091a.m36106a(abstractC1243a);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public AuthInfo auth(EnumC1181m enumC1181m) {
        return this.f3091a.m36105b(enumC1181m);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public EnumC1181m getMode() {
        return this.f3091a.m36095n();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public TtsListener getTtsListener() {
        return this.f3091a.m36096m();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public C1239j getTtsParams() {
        return this.f3091a.m36094o();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void setContext(Context context) {
        this.f3091a.m36116a(context);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void setMode(EnumC1181m enumC1181m) {
        this.f3091a.m36112a(enumC1181m);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setParam(EnumC1175g enumC1175g, String str) {
        return this.f3091a.m36113a(enumC1175g, str);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void setTtsListener(TtsListener ttsListener) {
        this.f3091a.m36114a(ttsListener);
    }
}
