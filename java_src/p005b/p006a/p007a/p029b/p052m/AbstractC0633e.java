package p005b.p006a.p007a.p029b.p052m;

import p005b.p006a.p007a.p029b.C0546i;
import p005b.p006a.p007a.p029b.p052m.p053a.C0618i;
import p005b.p006a.p007a.p029b.p052m.p053a.EnumC0608c;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.m.e */
/* loaded from: classes.dex */
public abstract class AbstractC0633e extends C0662f implements AbstractC0632d {

    /* renamed from: a */
    private C0546i f1120a;

    /* renamed from: b */
    private boolean f1121b;

    /* renamed from: i */
    protected EnumC0608c f1122i = EnumC0608c.NONE;

    /* renamed from: j */
    C0618i f1123j;

    /* renamed from: k */
    protected String f1124k;

    /* renamed from: l */
    C0618i f1125l;

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0632d
    /* renamed from: a */
    public void mo38659a(C0546i c0546i) {
        this.f1120a = c0546i;
    }

    /* renamed from: a */
    public void m38658a(String str) {
        this.f1124k = str;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f1121b;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0632d
    /* renamed from: g */
    public EnumC0608c mo38657g() {
        return this.f1122i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m38656h() {
        if (this.f1124k.endsWith(".gz")) {
            d("Will use gz compression");
            this.f1122i = EnumC0608c.GZ;
        } else if (this.f1124k.endsWith(".zip")) {
            d("Will use zip compression");
            this.f1122i = EnumC0608c.ZIP;
        } else {
            d("No compression will be used");
            this.f1122i = EnumC0608c.NONE;
        }
    }

    /* renamed from: j */
    public void mo38474j() {
        this.f1121b = true;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f1121b = false;
    }

    /* renamed from: l */
    public String m38655l() {
        return this.f1124k;
    }

    /* renamed from: m */
    public boolean m38654m() {
        return this.f1120a.m38867e();
    }

    /* renamed from: n */
    public String m38653n() {
        return this.f1120a.m38871b();
    }
}
