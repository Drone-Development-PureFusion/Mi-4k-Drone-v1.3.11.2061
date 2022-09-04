package p005b.p006a.p007a.p029b.p036g.p037a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p040d.C0467a;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p056p.AbstractC0684i;
import p005b.p006a.p007a.p029b.p056p.C0679d;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.t */
/* loaded from: classes.dex */
public class C0457t extends AbstractC0436c {

    /* renamed from: a */
    boolean f616a = false;

    /* renamed from: b */
    AbstractC0684i f617b = null;

    /* renamed from: a */
    public void m39260a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f616a) {
            return;
        }
        if (this.f617b instanceof AbstractC0669m) {
            ((AbstractC0669m) this.f617b).mo38474j();
        }
        if (c0479k.m39189f() != this.f617b) {
            e("The object at the of the stack is not the statusListener pushed earlier.");
        } else {
            c0479k.m39187g();
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f616a = false;
        String value = attributes.getValue(AbstractC0436c.f562i);
        if (C0724u.m38372e(value)) {
            c("Missing class name for statusListener. Near [" + str + "] line " + c(c0479k));
            this.f616a = true;
            return;
        }
        try {
            if (C0679d.class.getName().equals(value)) {
                C0679d.m38525b(this.f1199s);
            } else {
                this.f617b = (AbstractC0684i) C0724u.m38382a(value, AbstractC0684i.class, this.f1199s);
                c0479k.c_().mo39315n().mo38505a(this.f617b);
                if (this.f617b instanceof AbstractC0661e) {
                    ((AbstractC0661e) this.f617b).mo38551a(this.f1199s);
                }
            }
            d("Added status listener of type [" + value + "]");
            c0479k.m39199a(this.f617b);
        } catch (Exception e) {
            this.f616a = true;
            a("Could not create an StatusListener of type [" + value + "].", e);
            throw new C0467a(e);
        }
    }
}
