package p005b.p006a.p007a.p008a.p016g.p017a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
@Deprecated
/* renamed from: b.a.a.a.g.a.e */
/* loaded from: classes.dex */
public class C0298e extends AbstractC0436c {

    /* renamed from: a */
    boolean f255a = false;

    /* renamed from: a */
    public void m39719a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        Object m39189f = c0479k.m39189f();
        if (!(m39189f instanceof C0283e)) {
            this.f255a = true;
            c("For element <level>, could not find a logger at the top of execution stack.");
            return;
        }
        C0283e c0283e = (C0283e) m39189f;
        String mo88d = c0283e.mo88d();
        String m39188f = c0479k.m39188f(attributes.getValue("value"));
        if (AbstractC0437d.f575j.equalsIgnoreCase(m39188f) || AbstractC0437d.f576k.equalsIgnoreCase(m39188f)) {
            c0283e.m39792a((C0281d) null);
        } else {
            c0283e.m39792a(C0281d.m39799a(m39188f, C0281d.f214s));
        }
        d(mo88d + " level set to " + c0283e.m39779c());
    }
}
