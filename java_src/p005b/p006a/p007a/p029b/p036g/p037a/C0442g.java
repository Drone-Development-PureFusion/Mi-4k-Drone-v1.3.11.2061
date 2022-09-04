package p005b.p006a.p007a.p029b.p036g.p037a;

import java.util.HashMap;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p055o.AbstractC0658b;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.g */
/* loaded from: classes.dex */
public class C0442g<E> extends AbstractC0436c {

    /* renamed from: a */
    boolean f587a = false;

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f587a = false;
        Object m39189f = c0479k.m39189f();
        if (!(m39189f instanceof AbstractC0658b)) {
            this.f587a = true;
            c("Could not find an AppenderAttachable at the top of execution stack. Near [" + str + "] line " + c(c0479k));
            return;
        }
        AbstractC0658b abstractC0658b = (AbstractC0658b) m39189f;
        String m39188f = c0479k.m39188f(attributes.getValue(AbstractC0437d.f567b));
        if (C0724u.m38372e(m39188f)) {
            this.f587a = true;
            c("Missing appender ref attribute in <appender-ref> tag.");
            return;
        }
        AbstractC0401a<E> abstractC0401a = (AbstractC0401a) ((HashMap) c0479k.m39186h().get(AbstractC0437d.f578m)).get(m39188f);
        if (abstractC0401a != null) {
            d("Attaching appender named [" + m39188f + "] to " + abstractC0658b);
            abstractC0658b.mo38569a(abstractC0401a);
            return;
        }
        this.f587a = true;
        c("Could not find an appender named [" + m39188f + "]. Did you define it below instead of above in the configuration file?");
        c("See http://logback.qos.ch/codes.html#appender_order for more details.");
    }
}
