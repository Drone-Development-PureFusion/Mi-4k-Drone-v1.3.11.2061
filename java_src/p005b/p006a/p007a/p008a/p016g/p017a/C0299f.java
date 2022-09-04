package p005b.p006a.p007a.p008a.p016g.p017a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.g.a.f */
/* loaded from: classes.dex */
public class C0299f extends AbstractC0436c {

    /* renamed from: a */
    public static final String f256a = "level";

    /* renamed from: b */
    boolean f257b = false;

    /* renamed from: c */
    C0283e f258c;

    /* renamed from: a */
    public void m39718a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f257b) {
            return;
        }
        Object m39189f = c0479k.m39189f();
        if (m39189f == this.f258c) {
            c0479k.m39187g();
            return;
        }
        e("The object on the top the of the stack is not " + this.f258c + " pushed earlier");
        e("It is: " + m39189f);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f257b = false;
        this.f258c = null;
        C0286f c0286f = (C0286f) this.f1199s;
        String m39188f = c0479k.m39188f(attributes.getValue("name"));
        if (C0724u.m38372e(m39188f)) {
            this.f257b = true;
            c("No 'name' attribute in element " + str + ", around " + d(c0479k));
            return;
        }
        this.f258c = c0286f.mo126e(m39188f);
        String m39188f2 = c0479k.m39188f(attributes.getValue("level"));
        if (!C0724u.m38372e(m39188f2)) {
            if (AbstractC0437d.f575j.equalsIgnoreCase(m39188f2) || AbstractC0437d.f576k.equalsIgnoreCase(m39188f2)) {
                d("Setting level of logger [" + m39188f + "] to null, i.e. INHERITED");
                this.f258c.m39792a((C0281d) null);
            } else {
                C0281d m39800a = C0281d.m39800a(m39188f2);
                d("Setting level of logger [" + m39188f + "] to " + m39800a);
                this.f258c.m39792a(m39800a);
            }
        }
        String m39188f3 = c0479k.m39188f(attributes.getValue(AbstractC0437d.f568c));
        if (!C0724u.m38372e(m39188f3)) {
            boolean booleanValue = Boolean.valueOf(m39188f3).booleanValue();
            d("Setting additivity of logger [" + m39188f + "] to " + booleanValue);
            this.f258c.m39785a(booleanValue);
        }
        c0479k.m39199a(this.f258c);
    }
}
