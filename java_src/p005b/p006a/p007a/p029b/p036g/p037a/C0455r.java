package p005b.p006a.p007a.p029b.p036g.p037a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p041e.C0491f;
/* renamed from: b.a.a.b.g.a.r */
/* loaded from: classes.dex */
public class C0455r extends AbstractC0436c {

    /* renamed from: a */
    static String f611a = "No name attribute in <param> element";

    /* renamed from: b */
    static String f612b = "No value attribute in <param> element";

    /* renamed from: c */
    boolean f613c = false;

    /* renamed from: a */
    public void m39266a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        if (value == null) {
            this.f613c = true;
            c(f611a);
        } else if (value2 == null) {
            this.f613c = true;
            c(f612b);
        } else {
            String trim = value2.trim();
            C0491f c0491f = new C0491f(c0479k.m39189f());
            c0491f.a(this.f1199s);
            c0491f.m39124a(c0479k.m39188f(value), c0479k.m39188f(trim));
        }
    }
}
