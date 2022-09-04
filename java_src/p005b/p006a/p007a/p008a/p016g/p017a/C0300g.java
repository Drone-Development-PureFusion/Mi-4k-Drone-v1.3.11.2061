package p005b.p006a.p007a.p008a.p016g.p017a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p026n.AbstractC0371i;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.g.a.g */
/* loaded from: classes.dex */
public class C0300g extends AbstractC0436c {

    /* renamed from: a */
    boolean f259a = false;

    /* renamed from: b */
    AbstractC0371i f260b;

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f259a) {
            return;
        }
        if (c0479k.m39189f() != this.f260b) {
            e("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
            return;
        }
        if (this.f260b instanceof AbstractC0669m) {
            ((AbstractC0669m) this.f260b).mo38474j();
            d("Starting LoggerContextListener");
        }
        ((C0286f) this.f1199s).m39761a(this.f260b);
        c0479k.m39187g();
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f259a = false;
        String value = attributes.getValue(AbstractC0436c.f562i);
        if (C0724u.m38372e(value)) {
            c("Mandatory \"class\" attribute not set for <loggerContextListener> element");
            this.f259a = true;
            return;
        }
        try {
            this.f260b = (AbstractC0371i) C0724u.m38382a(value, AbstractC0371i.class, this.f1199s);
            if (this.f260b instanceof AbstractC0661e) {
                ((AbstractC0661e) this.f260b).mo38551a(this.f1199s);
            }
            c0479k.m39199a(this.f260b);
            d("Adding LoggerContextListener of type [" + value + "] to the object stack");
        } catch (Exception e) {
            this.f259a = true;
            a("Could not create LoggerContextListener of type " + value + "].", e);
        }
    }
}
