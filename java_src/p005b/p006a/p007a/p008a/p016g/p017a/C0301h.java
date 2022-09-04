package p005b.p006a.p007a.p008a.p016g.p017a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p008a.p020j.AbstractC0315b;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p040d.C0467a;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.g.a.h */
/* loaded from: classes.dex */
public class C0301h extends AbstractC0436c {

    /* renamed from: a */
    private AbstractC0315b f261a;

    /* renamed from: b */
    private boolean f262b;

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f262b) {
            return;
        }
        c0479k.c_().mo39322a(this.f261a);
        this.f261a.mo38474j();
        if (c0479k.m39189f() != this.f261a) {
            e("The object at the of the stack is not the remote pushed earlier.");
        } else {
            c0479k.m39187g();
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        String value = attributes.getValue(AbstractC0436c.f562i);
        if (C0724u.m38372e(value)) {
            c("Missing class name for receiver. Near [" + str + "] line " + c(c0479k));
            this.f262b = true;
            return;
        }
        try {
            d("About to instantiate receiver of type [" + value + "]");
            this.f261a = (AbstractC0315b) C0724u.m38382a(value, AbstractC0315b.class, this.f1199s);
            this.f261a.a(this.f1199s);
            c0479k.m39199a(this.f261a);
        } catch (Exception e) {
            this.f262b = true;
            a("Could not create a receiver of type [" + value + "].", e);
            throw new C0467a(e);
        }
    }
}
