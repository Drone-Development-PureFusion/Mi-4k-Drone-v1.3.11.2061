package com.baidu.tts.p116o.p117a;

import android.content.Context;
import com.baidu.tts.aop.tts.ITts;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.auth.C1062a;
import com.baidu.tts.p086a.p089c.C1055b;
import com.baidu.tts.p086a.p089c.C1059c;
import com.baidu.tts.p090b.p091a.C1072a;
import com.baidu.tts.p090b.p091a.p092a.AbstractC1079d;
import com.baidu.tts.p090b.p094b.p095a.C1109f;
import com.baidu.tts.p102f.EnumC1174f;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1181m;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.p114m.C1239j;
/* renamed from: com.baidu.tts.o.a.c */
/* loaded from: classes.dex */
public class C1245c implements ITts {

    /* renamed from: a */
    static final /* synthetic */ boolean f3092a;

    /* renamed from: c */
    private TtsListener f3094c;

    /* renamed from: d */
    private EnumC1181m f3095d;

    /* renamed from: e */
    private C1059c f3096e;

    /* renamed from: b */
    private C1239j f3093b = new C1239j();

    /* renamed from: g */
    private C1247d f3098g = new C1247d(this);

    /* renamed from: h */
    private C1244b f3099h = new C1244b(this);

    /* renamed from: f */
    private volatile AbstractC1243a f3097f = this.f3098g;

    static {
        f3092a = !C1245c.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m36118a(float f, float f2) {
        return this.f3096e.m36819a(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m36117a(int i) {
        try {
            return this.f3096e.m36806f().mo36836a().mo36612a(i);
        } catch (Exception e) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m36113a(EnumC1175g enumC1175g, String str) {
        if (this.f3093b != null) {
            return this.f3093b.m36127a(enumC1175g, str);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m36111a(C1234e c1234e) {
        return this.f3096e.m36816a(c1234e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m36110a(C1235f c1235f) {
        return this.f3096e.m36815a(c1235f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m36109a(C1236g c1236g) {
        return this.f3096e.m36814a(c1236g);
    }

    /* renamed from: a */
    public C1247d m36119a() {
        return this.f3098g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36116a(Context context) {
        C1193b.m36288a().m36287a(context);
    }

    /* renamed from: a */
    public void m36115a(TtsError ttsError) {
        m36108a(C1237h.m36149b(ttsError));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36114a(TtsListener ttsListener) {
        if (ttsListener == null || ttsListener == this.f3094c) {
            return;
        }
        this.f3094c = ttsListener;
        if (this.f3096e == null) {
            return;
        }
        this.f3096e.m36817a(this.f3094c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36112a(EnumC1181m enumC1181m) {
        this.f3095d = enumC1181m;
    }

    /* renamed from: a */
    public void m36108a(C1237h c1237h) {
        if (this.f3094c != null) {
            this.f3094c.onError(c1237h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36107a(C1238i c1238i) {
        this.f3096e.m36813a(c1238i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36106a(AbstractC1243a abstractC1243a) {
        this.f3097f = abstractC1243a;
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public AuthInfo auth(EnumC1181m enumC1181m) {
        return this.f3097f.auth(enumC1181m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m36104b(C1234e c1234e) {
        return this.f3096e.m36811b(c1234e);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public TtsError mo36091b() {
        return this.f3097f.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AuthInfo m36105b(EnumC1181m enumC1181m) {
        return C1062a.m36796a().m36792a(enumC1181m, this.f3093b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36103b(C1238i c1238i) {
        this.f3096e.m36810b(c1238i);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: c */
    public void mo36090c() {
        this.f3097f.c();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: d */
    public void mo36089d() {
        this.f3097f.d();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: e */
    public void mo36088e() {
        this.f3097f.e();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: f */
    public void mo36087f() {
        this.f3097f.f();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int freeCustomResource(C1234e c1234e) {
        return this.f3097f.freeCustomResource(c1234e);
    }

    /* renamed from: g */
    public C1244b m36102g() {
        return this.f3099h;
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public EnumC1181m getMode() {
        return this.f3097f.getMode();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public TtsListener getTtsListener() {
        return this.f3097f.getTtsListener();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public C1239j getTtsParams() {
        return this.f3097f.getTtsParams();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public TtsError m36101h() {
        AbstractC1079d m36748a;
        Cloneable cloneable = null;
        if (this.f3095d == null) {
            this.f3095d = EnumC1181m.ONLINE;
        }
        if (this.f3093b == null) {
            this.f3093b = new C1239j();
        }
        TtsError mo36091b = C1193b.m36288a().mo36091b();
        if (f3092a || mo36091b == null) {
            switch (this.f3095d) {
                case ONLINE:
                    m36748a = C1072a.m36750a().m36748a(EnumC1174f.ONLINE);
                    cloneable = this.f3093b.m36124c();
                    break;
                case OFFLINE:
                    m36748a = C1072a.m36750a().m36748a(EnumC1174f.OFFLINE);
                    cloneable = this.f3093b.m36123d();
                    break;
                case MIX:
                    m36748a = C1072a.m36750a().m36748a(EnumC1174f.MIX);
                    cloneable = this.f3093b.m36128a();
                    break;
                default:
                    m36748a = null;
                    break;
            }
            if (m36748a == null || cloneable == null) {
                return C1191c.m36299a().m36292b(EnumC1182n.TTS_UNINITIAL);
            }
            m36748a.mo36714a((AbstractC1079d) cloneable);
            C1109f c1109f = new C1109f();
            c1109f.mo36610a((C1109f) this.f3093b.m36126b());
            this.f3096e = new C1059c();
            this.f3096e.m36818a(new C1055b(m36748a, c1109f, this.f3093b));
            if (this.f3094c != null) {
                this.f3096e.m36817a(this.f3094c);
            }
            return this.f3096e.m36820a();
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m36100i() {
        this.f3096e.m36812b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m36099j() {
        this.f3096e.m36809c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m36098k() {
        this.f3096e.m36808d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m36097l() {
        this.f3096e.m36807e();
        C1062a.m36796a().m36788b();
        C1193b.m36288a().mo36087f();
        this.f3093b = new C1239j();
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadCustomResource(C1234e c1234e) {
        return this.f3097f.loadCustomResource(c1234e);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadEnglishModel(C1235f c1235f) {
        return this.f3097f.loadEnglishModel(c1235f);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int loadModel(C1236g c1236g) {
        return this.f3097f.loadModel(c1236g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public TtsListener m36096m() {
        return this.f3094c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public EnumC1181m m36095n() {
        return this.f3095d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C1239j m36094o() {
        return this.f3093b;
    }

    /* renamed from: p */
    public int m36093p() {
        if (this.f3094c == null) {
            throw new IllegalStateException(EnumC1182n.TTS_UNINITIAL.m36306c());
        }
        m36115a(C1191c.m36299a().m36292b(EnumC1182n.TTS_UNINITIAL));
        return -1;
    }

    /* renamed from: q */
    public boolean m36092q() {
        return this.f3099h == this.f3097f;
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setAudioStreamType(int i) {
        return this.f3097f.setAudioStreamType(i);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void setContext(Context context) {
        this.f3097f.setContext(context);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void setMode(EnumC1181m enumC1181m) {
        this.f3097f.setMode(enumC1181m);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setParam(EnumC1175g enumC1175g, String str) {
        return this.f3097f.setParam(enumC1175g, str);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public int setStereoVolume(float f, float f2) {
        return this.f3097f.setStereoVolume(f, f2);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void setTtsListener(TtsListener ttsListener) {
        this.f3097f.setTtsListener(ttsListener);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void speak(C1238i c1238i) {
        this.f3097f.speak(c1238i);
    }

    @Override // com.baidu.tts.aop.tts.ITts
    public void synthesize(C1238i c1238i) {
        this.f3097f.synthesize(c1238i);
    }
}
