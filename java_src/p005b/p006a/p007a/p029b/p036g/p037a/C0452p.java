package p005b.p006a.p007a.p029b.p036g.p037a;

import java.util.Stack;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p040d.C0475g;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p040d.C0483o;
import p005b.p006a.p007a.p029b.p036g.p041e.C0491f;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p058r.C0720s;
import p005b.p006a.p007a.p029b.p058r.C0724u;
import p005b.p006a.p007a.p029b.p058r.EnumC0702a;
/* renamed from: b.a.a.b.g.a.p */
/* loaded from: classes.dex */
public class C0452p extends AbstractC0447l {

    /* renamed from: a */
    Stack<C0446k> f608a = new Stack<>();

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        C0446k pop = this.f608a.pop();
        if (pop.f601d) {
            return;
        }
        C0491f c0491f = new C0491f(pop.m39277b());
        c0491f.a(this.f1199s);
        if (c0491f.m39129a("parent") == EnumC0702a.AS_COMPLEX_PROPERTY) {
            c0491f.m39117b("parent", pop.f598a.m39113c());
        }
        Object m39277b = pop.m39277b();
        if ((m39277b instanceof AbstractC0669m) && C0483o.m39163a(m39277b)) {
            ((AbstractC0669m) m39277b).mo38474j();
        }
        if (c0479k.m39189f() != pop.m39277b()) {
            c("The object on the top the of the stack is not the component pushed earlier.");
            return;
        }
        c0479k.m39187g();
        switch (pop.f599b) {
            case AS_COMPLEX_PROPERTY_COLLECTION:
                pop.f598a.m39125a(str, pop.m39277b());
                return;
            case AS_COMPLEX_PROPERTY:
                pop.f598a.m39117b(str, pop.m39277b());
                return;
            default:
                return;
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        C0446k peek = this.f608a.peek();
        String m39188f = c0479k.m39188f(attributes.getValue(AbstractC0436c.f562i));
        try {
            Class<?> m38396a = !C0724u.m38372e(m39188f) ? C0720s.m38396a(m39188f, this.f1199s) : peek.f598a.m39127a(peek.m39276c(), peek.m39279a(), c0479k.m39203a());
            if (m38396a == null) {
                peek.f601d = true;
                c("Could not find an appropriate class for property [" + str + "]");
                return;
            }
            if (C0724u.m38372e(m39188f)) {
                d("Assuming default type [" + m38396a.getName() + "] for [" + str + "] property");
            }
            peek.m39278a(m38396a.newInstance());
            if (peek.m39277b() instanceof AbstractC0661e) {
                ((AbstractC0661e) peek.m39277b()).mo38551a(this.f1199s);
            }
            c0479k.m39199a(peek.m39277b());
        } catch (Exception e) {
            peek.f601d = true;
            a("Could not create component [" + str + "] of type [" + m39188f + "]", e);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0447l
    /* renamed from: a */
    public boolean mo39268a(C0475g c0475g, Attributes attributes, C0479k c0479k) {
        String m39216d = c0475g.m39216d();
        if (c0479k.m39190e()) {
            return false;
        }
        C0491f c0491f = new C0491f(c0479k.m39189f());
        c0491f.a(this.f1199s);
        EnumC0702a m39129a = c0491f.m39129a(m39216d);
        switch (m39129a) {
            case NOT_FOUND:
            case AS_BASIC_PROPERTY:
            case AS_BASIC_PROPERTY_COLLECTION:
                return false;
            case AS_COMPLEX_PROPERTY_COLLECTION:
            case AS_COMPLEX_PROPERTY:
                this.f608a.push(new C0446k(c0491f, m39129a, m39216d));
                return true;
            default:
                c("PropertySetter.computeAggregationType returned " + m39129a);
                return false;
        }
    }
}
