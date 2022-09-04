package p005b.p006a.p007a.p029b.p058r;

import java.util.Properties;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.r.g */
/* loaded from: classes.dex */
public class C0708g extends C0662f {
    public C0708g(AbstractC0427f abstractC0427f) {
        a(abstractC0427f);
    }

    /* renamed from: a */
    public void m38430a() {
        this.f1199s.mo39319a(C0494h.f694O, "localhost");
    }

    /* renamed from: a */
    public void m38429a(Properties properties) {
        if (properties == null) {
            return;
        }
        for (String str : properties.keySet()) {
            this.f1199s.mo39319a(str, properties.getProperty(str));
        }
    }
}
