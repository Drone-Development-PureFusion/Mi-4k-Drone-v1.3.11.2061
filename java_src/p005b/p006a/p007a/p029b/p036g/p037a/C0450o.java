package p005b.p006a.p007a.p029b.p036g.p037a;

import java.util.Stack;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p040d.C0475g;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p041e.C0491f;
import p005b.p006a.p007a.p029b.p058r.EnumC0702a;
/* renamed from: b.a.a.b.g.a.o */
/* loaded from: classes.dex */
public class C0450o extends AbstractC0447l {

    /* renamed from: a */
    Stack<C0445j> f606a = new Stack<>();

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        this.f606a.pop();
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
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
            case AS_COMPLEX_PROPERTY:
            case AS_COMPLEX_PROPERTY_COLLECTION:
                return false;
            case AS_BASIC_PROPERTY:
            case AS_BASIC_PROPERTY_COLLECTION:
                this.f606a.push(new C0445j(c0491f, m39129a, m39216d));
                return true;
            default:
                c("PropertySetter.canContainComponent returned " + m39129a);
                return false;
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: b */
    public void mo39269b(C0479k c0479k, String str) {
        String m39188f = c0479k.m39188f(str);
        C0445j peek = this.f606a.peek();
        switch (peek.f595b) {
            case AS_BASIC_PROPERTY:
                peek.f594a.m39124a(peek.f596c, m39188f);
                return;
            case AS_BASIC_PROPERTY_COLLECTION:
                peek.f594a.m39116b(peek.f596c, m39188f);
                return;
            default:
                return;
        }
    }
}
