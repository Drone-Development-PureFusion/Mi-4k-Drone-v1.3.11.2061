package com.baidu.tts.p090b.p091a.p092a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
/* renamed from: com.baidu.tts.b.a.a.h */
/* loaded from: classes.dex */
public class C1083h extends AbstractC1075b {
    public C1083h(C1076c c1076c) {
        super(c1076c);
    }

    /* renamed from: a */
    private void m36709a(C1237h c1237h) {
        c1237h.m36158a(C1191c.m36299a().m36292b(EnumC1182n.OFFLINE_ENGINE_UNINITIALIZED));
        this.f2495a.e(c1237h);
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1075b, com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public int mo36712a(C1234e c1234e) {
        m36709a(new C1237h());
        return -1;
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1075b, com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public int mo36711a(C1235f c1235f) {
        m36709a(new C1237h());
        return -1;
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1075b, com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public int mo36710a(C1236g c1236g) {
        m36709a(new C1237h());
        return -1;
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1075b, com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: a */
    public void mo36708a(C1238i c1238i) {
        m36709a(C1237h.m36148b(c1238i));
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1075b, com.baidu.tts.p090b.p091a.p092a.AbstractC1079d
    /* renamed from: b */
    public int mo36707b(C1234e c1234e) {
        m36709a(new C1237h());
        return -1;
    }

    @Override // com.baidu.tts.p090b.p091a.p092a.AbstractC1075b, com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public TtsError mo36091b() {
        TtsError m36723s = this.f2495a.m36723s();
        a((AbstractC1075b) this.f2495a.m36726p());
        return m36723s;
    }
}
