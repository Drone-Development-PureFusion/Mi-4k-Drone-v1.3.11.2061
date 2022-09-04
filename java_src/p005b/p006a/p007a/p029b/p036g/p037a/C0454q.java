package p005b.p006a.p007a.p029b.p036g.p037a;

import com.xiaomi.mipush.sdk.Constants;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p040d.C0476h;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.q */
/* loaded from: classes.dex */
public class C0454q extends AbstractC0436c {

    /* renamed from: a */
    boolean f610a = false;

    /* renamed from: a */
    public void m39267a(C0479k c0479k) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f610a = false;
        String value = attributes.getValue("pattern");
        String value2 = attributes.getValue("actionClass");
        if (C0724u.m38372e(value)) {
            this.f610a = true;
            c("No 'pattern' attribute in <newRule>");
        } else if (C0724u.m38372e(value2)) {
            this.f610a = true;
            c("No 'actionClass' attribute in <newRule>");
        } else {
            try {
                d("About to add new Joran parsing rule [" + value + Constants.ACCEPT_TIME_SEPARATOR_SP + value2 + "].");
                c0479k.m39192c().m39165f().mo39159a(new C0476h(value), value2);
            } catch (Exception e) {
                this.f610a = true;
                c("Could not add new Joran parsing rule [" + value + Constants.ACCEPT_TIME_SEPARATOR_SP + value2 + "]");
            }
        }
    }
}
