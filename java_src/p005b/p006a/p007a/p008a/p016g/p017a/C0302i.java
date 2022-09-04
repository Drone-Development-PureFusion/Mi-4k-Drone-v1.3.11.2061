package p005b.p006a.p007a.p008a.p016g.p017a;

import org.p356d.AbstractC11747c;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.g.a.i */
/* loaded from: classes.dex */
public class C0302i extends AbstractC0436c {

    /* renamed from: a */
    C0283e f263a;

    /* renamed from: b */
    boolean f264b = false;

    /* renamed from: a */
    public void m39717a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f264b) {
            return;
        }
        Object m39189f = c0479k.m39189f();
        if (m39189f == this.f263a) {
            c0479k.m39187g();
            return;
        }
        e("The object on the top the of the stack is not the root logger");
        e("It is: " + m39189f);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f264b = false;
        this.f263a = ((C0286f) this.f1199s).mo126e(AbstractC11747c.f37061c);
        String m39188f = c0479k.m39188f(attributes.getValue("level"));
        if (!C0724u.m38372e(m39188f)) {
            C0281d m39800a = C0281d.m39800a(m39188f);
            d("Setting level of ROOT logger to " + m39800a);
            this.f263a.m39792a(m39800a);
        }
        c0479k.m39199a(this.f263a);
    }
}
