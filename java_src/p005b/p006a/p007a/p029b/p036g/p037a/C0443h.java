package p005b.p006a.p007a.p029b.p036g.p037a;

import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.h */
/* loaded from: classes.dex */
public class C0443h extends AbstractC0436c {

    /* renamed from: a */
    boolean f588a = false;

    /* renamed from: a */
    public void m39280a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f588a = false;
        String value = attributes.getValue(AbstractC0437d.f571f);
        String value2 = attributes.getValue(AbstractC0437d.f570e);
        if (C0724u.m38372e(value)) {
            this.f588a = true;
            c("No 'conversionWord' attribute in <conversionRule>");
        } else if (C0724u.m38372e(value2)) {
            this.f588a = true;
            c0479k.c("No 'converterClass' attribute in <conversionRule>");
        } else {
            try {
                Map map = (Map) this.f1199s.mo39316f(C0494h.f719g);
                if (map == null) {
                    map = new HashMap();
                    this.f1199s.mo39320a(C0494h.f719g, map);
                }
                d("registering conversion word " + value + " with class [" + value2 + "]");
                map.put(value, value2);
            } catch (Exception e) {
                this.f588a = true;
                c("Could not add conversion rule to PatternLayout.");
            }
        }
    }
}
