package p005b.p006a.p007a.p029b.p036g.p037a;

import java.util.HashMap;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.p036g.p040d.C0467a;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.f */
/* loaded from: classes.dex */
public class C0441f<E> extends AbstractC0436c {

    /* renamed from: a */
    AbstractC0401a<E> f585a;

    /* renamed from: b */
    private boolean f586b = false;

    /* renamed from: a */
    private void m39281a(String str) {
        if (str.equals("ch.qos.logback.core.ConsoleAppender")) {
            e("ConsoleAppender is deprecated for LogcatAppender");
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (this.f586b) {
            return;
        }
        if (this.f585a instanceof AbstractC0669m) {
            this.f585a.mo38474j();
        }
        if (c0479k.m39189f() != this.f585a) {
            e("The object at the of the stack is not the appender named [" + this.f585a.mo38476g() + "] pushed earlier.");
        } else {
            c0479k.m39187g();
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f585a = null;
        this.f586b = false;
        String value = attributes.getValue(AbstractC0436c.f562i);
        if (C0724u.m38372e(value)) {
            c("Missing class name for appender. Near [" + str + "] line " + c(c0479k));
            this.f586b = true;
            return;
        }
        try {
            d("About to instantiate appender of type [" + value + "]");
            m39281a(value);
            this.f585a = (AbstractC0401a) C0724u.m38382a(value, AbstractC0401a.class, this.f1199s);
            this.f585a.a(this.f1199s);
            String m39188f = c0479k.m39188f(attributes.getValue("name"));
            if (C0724u.m38372e(m39188f)) {
                e("No appender name given for appender of type " + value + "].");
            } else {
                this.f585a.mo38479b_(m39188f);
                d("Naming appender as [" + m39188f + "]");
            }
            ((HashMap) c0479k.m39186h().get(AbstractC0437d.f578m)).put(m39188f, this.f585a);
            c0479k.m39199a(this.f585a);
        } catch (Exception e) {
            this.f586b = true;
            a("Could not create an Appender of type [" + value + "].", e);
            throw new C0467a(e);
        }
    }
}
