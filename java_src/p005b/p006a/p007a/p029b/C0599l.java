package p005b.p006a.p007a.p029b;

import java.util.HashSet;
import java.util.Set;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
/* renamed from: b.a.a.b.l */
/* loaded from: classes.dex */
public class C0599l {

    /* renamed from: a */
    private final Set<AbstractC0669m> f1033a = new HashSet();

    /* renamed from: a */
    public void m38754a() {
        for (AbstractC0669m abstractC0669m : this.f1033a) {
            if (abstractC0669m.mo38480b_()) {
                abstractC0669m.mo38473k();
            }
        }
        this.f1033a.clear();
    }

    /* renamed from: a */
    public void m38753a(AbstractC0669m abstractC0669m) {
        this.f1033a.add(abstractC0669m);
    }
}
