package p005b.p006a.p007a.p029b.p036g.p037a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p037a.C0438e;
import p005b.p006a.p007a.p029b.p036g.p040d.C0467a;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.AbstractC0673q;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.i */
/* loaded from: classes.dex */
public class C0444i extends AbstractC0436c {

    /* renamed from: a */
    String f589a;

    /* renamed from: b */
    C0438e.EnumC0440a f590b;

    /* renamed from: c */
    String f591c;

    /* renamed from: d */
    AbstractC0673q f592d;

    /* renamed from: m */
    boolean f593m;

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f593m) {
            return;
        }
        if (c0479k.m39189f() != this.f592d) {
            e("The object at the of the stack is not the property definer for property named [" + this.f591c + "] pushed earlier.");
            return;
        }
        d("Popping property definer for property named [" + this.f591c + "] from the object stack");
        c0479k.m39187g();
        String mo38527b = this.f592d.mo38527b();
        if (mo38527b == null) {
            return;
        }
        C0438e.m39284a(c0479k, this.f591c, mo38527b, this.f590b);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f589a = null;
        this.f590b = null;
        this.f591c = null;
        this.f592d = null;
        this.f593m = false;
        this.f591c = attributes.getValue("name");
        this.f589a = attributes.getValue("scope");
        this.f590b = C0438e.m39282a(this.f589a);
        if (C0724u.m38372e(this.f591c)) {
            c("Missing property name for property definer. Near [" + str + "] line " + c(c0479k));
            this.f593m = true;
            return;
        }
        String value = attributes.getValue(AbstractC0436c.f562i);
        if (C0724u.m38372e(value)) {
            c("Missing class name for property definer. Near [" + str + "] line " + c(c0479k));
            this.f593m = true;
            return;
        }
        try {
            d("About to instantiate property definer of type [" + value + "]");
            this.f592d = (AbstractC0673q) C0724u.m38382a(value, AbstractC0673q.class, this.f1199s);
            this.f592d.a(this.f1199s);
            if (this.f592d instanceof AbstractC0669m) {
                ((AbstractC0669m) this.f592d).mo38474j();
            }
            c0479k.m39199a(this.f592d);
        } catch (Exception e) {
            this.f593m = true;
            a("Could not create an PropertyDefiner of type [" + value + "].", e);
            throw new C0467a(e);
        }
    }
}
