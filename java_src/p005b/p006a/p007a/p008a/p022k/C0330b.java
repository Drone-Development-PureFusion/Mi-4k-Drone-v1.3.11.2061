package p005b.p006a.p007a.p008a.p022k;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.C0363a;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p031b.AbstractC0406b;
import p005b.p006a.p007a.p029b.p031b.C0405a;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.C0676a;
/* renamed from: b.a.a.a.k.b */
/* loaded from: classes.dex */
public class C0330b extends AbstractC0333e {

    /* renamed from: a */
    public static final String f332a = "Caller+";

    /* renamed from: b */
    int f333b = 5;

    /* renamed from: c */
    List<AbstractC0406b<AbstractC0366d>> f334c = null;

    /* renamed from: d */
    final int f335d = 4;

    /* renamed from: e */
    int f336e = 0;

    /* renamed from: a */
    private void m39623a(AbstractC0406b<AbstractC0366d> abstractC0406b) {
        if (this.f334c == null) {
            this.f334c = new ArrayList();
        }
        this.f334c.add(abstractC0406b);
    }

    /* renamed from: a */
    protected String m39625a() {
        return f332a;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        boolean z;
        AbstractC0406b<AbstractC0366d> abstractC0406b;
        StringBuilder sb = new StringBuilder();
        if (this.f334c != null) {
            int i = 0;
            while (true) {
                if (i >= this.f334c.size()) {
                    z = false;
                    break;
                }
                try {
                } catch (C0405a e) {
                    this.f336e++;
                    if (this.f336e < 4) {
                        a("Exception thrown for evaluator named [" + abstractC0406b.mo39407a() + "]", e);
                    } else if (this.f336e == 4) {
                        C0676a c0676a = new C0676a("Exception thrown for evaluator named [" + abstractC0406b.mo39407a() + "].", this, e);
                        c0676a.a(new C0676a("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        a((AbstractC0682g) c0676a);
                    }
                }
                if (this.f334c.get(i).mo39408a((AbstractC0406b<AbstractC0366d>) abstractC0366d)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                return "";
            }
        }
        StackTraceElement[] mo39531i = abstractC0366d.mo39531i();
        if (mo39531i == null || mo39531i.length <= 0) {
            return C0363a.f362c;
        }
        int length = this.f333b < mo39531i.length ? this.f333b : mo39531i.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(m39625a());
            sb.append(i2);
            sb.append("\t at ");
            sb.append(mo39531i[i2]);
            sb.append(C0494h.f715c);
        }
        return sb.toString();
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        AbstractC0406b<AbstractC0366d> abstractC0406b;
        String d = d();
        if (d == null) {
            return;
        }
        try {
            this.f333b = Integer.parseInt(d);
        } catch (NumberFormatException e) {
            a("Failed to parse depth option [" + d + "]", e);
        }
        List<String> e2 = e();
        if (e2 == null || e2.size() <= 1) {
            return;
        }
        int size = e2.size();
        for (int i = 1; i < size; i++) {
            String str = e2.get(i);
            AbstractC0427f c_ = c_();
            if (c_ != null && (abstractC0406b = (AbstractC0406b) ((Map) c_.mo39316f(C0494h.f724l)).get(str)) != null) {
                m39623a(abstractC0406b);
            }
        }
    }
}
