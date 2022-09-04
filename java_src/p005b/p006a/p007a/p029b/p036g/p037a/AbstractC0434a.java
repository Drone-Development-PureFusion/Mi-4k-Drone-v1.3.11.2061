package p005b.p006a.p007a.p029b.p036g.p037a;

import java.util.Map;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p031b.AbstractC0406b;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0434a extends AbstractC0436c {

    /* renamed from: a */
    AbstractC0406b<?> f549a;

    /* renamed from: b */
    boolean f550b = false;

    /* renamed from: a */
    protected abstract String m39299a();

    /* renamed from: a */
    public void m39298a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f550b) {
            return;
        }
        if (this.f549a instanceof AbstractC0669m) {
            this.f549a.mo38474j();
            d("Starting evaluator named [" + this.f549a.mo39407a() + "]");
        }
        if (c0479k.m39189f() != this.f549a) {
            e("The object on the top the of the stack is not the evaluator pushed earlier.");
            return;
        }
        c0479k.m39187g();
        try {
            Map map = (Map) this.f1199s.mo39316f(C0494h.f724l);
            if (map == null) {
                c("Could not find EvaluatorMap");
            } else {
                map.put(this.f549a.mo39407a(), this.f549a);
            }
        } catch (Exception e) {
            a("Could not set evaluator named [" + this.f549a + "].", e);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f550b = false;
        this.f549a = null;
        String value = attributes.getValue(AbstractC0436c.f562i);
        if (C0724u.m38372e(value)) {
            value = m39299a();
            d("Assuming default evaluator class [" + value + "]");
        }
        String str2 = value;
        if (C0724u.m38372e(str2)) {
            m39299a();
            this.f550b = true;
            c("Mandatory \"class\" attribute not set for <evaluator>");
            return;
        }
        String value2 = attributes.getValue("name");
        if (C0724u.m38372e(value2)) {
            this.f550b = true;
            c("Mandatory \"name\" attribute not set for <evaluator>");
            return;
        }
        try {
            this.f549a = (AbstractC0406b) C0724u.m38382a(str2, AbstractC0406b.class, this.f1199s);
            this.f549a.a(this.f1199s);
            this.f549a.mo39406b(value2);
            c0479k.m39199a(this.f549a);
            d("Adding evaluator named [" + value2 + "] to the object stack");
        } catch (Exception e) {
            this.f550b = true;
            a("Could not create evaluator of type " + str2 + "].", e);
        }
    }
}
