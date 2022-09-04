package p005b.p006a.p007a.p029b.p036g.p037a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p037a.C0438e;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p058r.C0703b;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.u */
/* loaded from: classes.dex */
public class C0458u extends AbstractC0436c {

    /* renamed from: a */
    static String f618a = "datePattern";

    /* renamed from: b */
    static String f619b = "timeReference";

    /* renamed from: c */
    static String f620c = "contextBirth";

    /* renamed from: d */
    boolean f621d = false;

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        long currentTimeMillis;
        String value = attributes.getValue("key");
        if (C0724u.m38372e(value)) {
            c("Attribute named [key] cannot be empty");
            this.f621d = true;
        }
        String value2 = attributes.getValue(f618a);
        if (C0724u.m38372e(value2)) {
            c("Attribute named [" + f618a + "] cannot be empty");
            this.f621d = true;
        }
        if (f620c.equalsIgnoreCase(attributes.getValue(f619b))) {
            d("Using context birth as time reference.");
            currentTimeMillis = this.f1199s.mo39313q();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            d("Using current interpretation time, i.e. now, as time reference.");
        }
        if (this.f621d) {
            return;
        }
        C0438e.EnumC0440a m39282a = C0438e.m39282a(attributes.getValue("scope"));
        String m38440a = new C0703b(value2).m38440a(currentTimeMillis);
        d("Adding property to the context with key=\"" + value + "\" and value=\"" + m38440a + "\" to the " + m39282a + " scope");
        C0438e.m39284a(c0479k, value, m38440a, m39282a);
    }
}
