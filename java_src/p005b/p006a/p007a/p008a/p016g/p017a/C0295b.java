package p005b.p006a.p007a.p008a.p016g.p017a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p027o.AbstractC0392i;
import p005b.p006a.p007a.p008a.p027o.C0390h;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p056p.C0679d;
import p005b.p006a.p007a.p029b.p058r.C0708g;
import p005b.p006a.p007a.p029b.p058r.C0711j;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.g.a.b */
/* loaded from: classes.dex */
public class C0295b extends AbstractC0436c {

    /* renamed from: a */
    static final String f250a = "debug";

    /* renamed from: b */
    static final String f251b = "scan";

    /* renamed from: c */
    static final String f252c = "scanPeriod";

    /* renamed from: d */
    static final String f253d = "logback.debug";

    /* renamed from: a */
    String m39720a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException e) {
            return null;
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        d("End of configuration.");
        c0479k.m39187g();
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        String m38374c = C0724u.m38374c(f253d);
        if (m38374c == null) {
            m38374c = c0479k.m39188f(attributes.getValue("debug"));
        }
        if (C0724u.m38372e(m38374c) || m38374c.equalsIgnoreCase("false") || m38374c.equalsIgnoreCase("null")) {
            d("debug attribute not set");
        } else {
            C0679d.m38525b(this.f1199s);
        }
        m39721a(c0479k, attributes);
        new C0708g(this.f1199s).m38430a();
        c0479k.m39199a((Object) c_());
    }

    /* renamed from: a */
    void m39721a(C0479k c0479k, Attributes attributes) {
        String m39188f = c0479k.m39188f(attributes.getValue(f251b));
        if (C0724u.m38372e(m39188f) || "false".equalsIgnoreCase(m39188f)) {
            return;
        }
        C0390h c0390h = new C0390h();
        c0390h.a(this.f1199s);
        String m39188f2 = c0479k.m39188f(attributes.getValue(f252c));
        if (!C0724u.m38372e(m39188f2)) {
            try {
                C0711j m38424a = C0711j.m38424a(m39188f2);
                c0390h.m39453c(m38424a.m38423b());
                d("Setting ReconfigureOnChangeFilter scanning period to " + m38424a);
            } catch (NumberFormatException e) {
                a("Error while converting [" + m39188f + "] to long", e);
            }
        }
        c0390h.mo38474j();
        d("Adding ReconfigureOnChangeFilter as a turbo filter");
        ((C0286f) this.f1199s).m39760a((AbstractC0392i) c0390h);
    }
}
