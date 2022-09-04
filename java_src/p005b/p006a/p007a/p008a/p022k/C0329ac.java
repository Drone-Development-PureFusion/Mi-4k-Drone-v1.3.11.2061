package p005b.p006a.p007a.p008a.p022k;

import com.fimi.soul.utils.C3134q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0367e;
import p005b.p006a.p007a.p008a.p026n.C0378p;
import p005b.p006a.p007a.p008a.p026n.C0380r;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p031b.AbstractC0406b;
import p005b.p006a.p007a.p029b.p031b.C0405a;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.C0676a;
/* renamed from: b.a.a.a.k.ac */
/* loaded from: classes.dex */
public class C0329ac extends AbstractC0328ab {

    /* renamed from: a */
    protected static final int f328a = 2048;

    /* renamed from: b */
    int f329b;

    /* renamed from: c */
    List<AbstractC0406b<AbstractC0366d>> f330c = null;

    /* renamed from: d */
    int f331d = 0;

    /* renamed from: a */
    private void m39631a(AbstractC0406b<AbstractC0366d> abstractC0406b) {
        if (this.f330c == null) {
            this.f330c = new ArrayList();
        }
        this.f330c.add(abstractC0406b);
    }

    /* renamed from: a */
    private void m39629a(StringBuilder sb, AbstractC0367e abstractC0367e) {
        sb.append(abstractC0367e.mo39488b()).append(": ").append(abstractC0367e.mo39490a());
    }

    /* renamed from: a */
    private void m39628a(StringBuilder sb, String str, int i, AbstractC0367e abstractC0367e) {
        if (abstractC0367e == null) {
            return;
        }
        m39626b(sb, str, i, abstractC0367e);
        sb.append(C0494h.f715c);
        m39630a(sb, i, abstractC0367e);
        AbstractC0367e[] mo39484f = abstractC0367e.mo39484f();
        if (mo39484f != null) {
            for (AbstractC0367e abstractC0367e2 : mo39484f) {
                m39628a(sb, C0494h.f728p, i + 1, abstractC0367e2);
            }
        }
        m39628a(sb, C0494h.f727o, i, abstractC0367e.mo39485e());
    }

    /* renamed from: b */
    private void m39626b(StringBuilder sb, String str, int i, AbstractC0367e abstractC0367e) {
        C0380r.m39502a(sb, i - 1);
        if (str != null) {
            sb.append(str);
        }
        m39629a(sb, abstractC0367e);
    }

    /* renamed from: a */
    protected String mo39602a(AbstractC0367e abstractC0367e) {
        StringBuilder sb = new StringBuilder(2048);
        m39628a(sb, null, 1, abstractC0367e);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m39630a(StringBuilder sb, int i, AbstractC0367e abstractC0367e) {
        C0378p[] mo39487c = abstractC0367e.mo39487c();
        int mo39486d = abstractC0367e.mo39486d();
        boolean z = this.f329b > mo39487c.length;
        int length = z ? mo39487c.length : this.f329b;
        if (mo39486d > 0 && z) {
            length -= mo39486d;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C0380r.m39502a(sb, i);
            sb.append(mo39487c[i2]);
            mo39618a(sb, mo39487c[i2]);
            sb.append(C0494h.f715c);
        }
        if (mo39486d <= 0 || !z) {
            return;
        }
        C0380r.m39502a(sb, i);
        sb.append("... ").append(abstractC0367e.mo39486d()).append(" common frames omitted").append(C0494h.f715c);
    }

    /* renamed from: a */
    protected void mo39618a(StringBuilder sb, C0378p c0378p) {
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: b */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        AbstractC0406b<AbstractC0366d> abstractC0406b;
        boolean z = false;
        AbstractC0367e mo39532h = abstractC0366d.mo39532h();
        if (mo39532h == null) {
            return "";
        }
        if (this.f330c != null) {
            int i = 0;
            while (true) {
                if (i >= this.f330c.size()) {
                    z = true;
                    break;
                }
                try {
                } catch (C0405a e) {
                    this.f331d++;
                    if (this.f331d < 4) {
                        a("Exception thrown for evaluator named [" + abstractC0406b.mo39407a() + "]", e);
                    } else if (this.f331d == 4) {
                        C0676a c0676a = new C0676a("Exception thrown for evaluator named [" + abstractC0406b.mo39407a() + "].", this, e);
                        c0676a.a(new C0676a("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        a((AbstractC0682g) c0676a);
                    }
                }
                if (this.f330c.get(i).mo39408a((AbstractC0406b<AbstractC0366d>) abstractC0366d)) {
                    break;
                }
                i++;
            }
            if (!z) {
                return "";
            }
        }
        return mo39602a(mo39532h);
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        String d = d();
        if (d == null) {
            this.f329b = Integer.MAX_VALUE;
        } else {
            String lowerCase = d.toLowerCase();
            if (C3134q.f11777au.equals(lowerCase)) {
                this.f329b = Integer.MAX_VALUE;
            } else if ("short".equals(lowerCase)) {
                this.f329b = 1;
            } else {
                try {
                    this.f329b = Integer.parseInt(lowerCase);
                } catch (NumberFormatException e) {
                    c("Could not parse [" + lowerCase + "] as an integer");
                    this.f329b = Integer.MAX_VALUE;
                }
            }
        }
        List<String> e2 = e();
        if (e2 != null && e2.size() > 1) {
            int size = e2.size();
            for (int i = 1; i < size; i++) {
                m39631a((AbstractC0406b) ((Map) c_().mo39316f(C0494h.f724l)).get(e2.get(i)));
            }
        }
        super.j();
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f330c = null;
        super.k();
    }
}
