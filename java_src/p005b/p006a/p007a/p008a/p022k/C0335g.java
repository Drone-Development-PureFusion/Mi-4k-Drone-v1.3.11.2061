package p005b.p006a.p007a.p008a.p022k;

import java.util.List;
import java.util.TimeZone;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p058r.C0703b;
/* renamed from: b.a.a.a.k.g */
/* loaded from: classes.dex */
public class C0335g extends AbstractC0333e {

    /* renamed from: a */
    long f337a = -1;

    /* renamed from: b */
    String f338b = null;

    /* renamed from: c */
    C0703b f339c = null;

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        return this.f339c.m38440a(abstractC0366d.mo39526n());
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        String d = d();
        if (d == null) {
            d = C0494h.f721i;
        }
        String str = d.equals(C0494h.f720h) ? C0494h.f721i : d;
        try {
            this.f339c = new C0703b(str);
        } catch (IllegalArgumentException e) {
            c("Could not instantiate SimpleDateFormat with pattern " + str, e);
            this.f339c = new C0703b(C0494h.f721i);
        }
        List<String> e2 = e();
        if (e2 == null || e2.size() <= 1) {
            return;
        }
        this.f339c.m38439a(TimeZone.getTimeZone(e2.get(1)));
    }
}
