package p005b.p006a.p007a.p008a.p015f;

import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0367e;
import p005b.p006a.p007a.p008a.p026n.C0378p;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p034e.C0426d;
import p005b.p006a.p007a.p029b.p035f.AbstractC0430c;
/* renamed from: b.a.a.a.f.b */
/* loaded from: classes.dex */
public class C0288b implements AbstractC0430c<AbstractC0366d> {

    /* renamed from: a */
    static final String f243a = "<br />&nbsp;&nbsp;&nbsp;&nbsp;";

    @Override // p005b.p006a.p007a.p029b.p035f.AbstractC0430c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo39324a(StringBuilder sb, AbstractC0366d abstractC0366d) {
        sb.append("<tr><td class=\"Exception\" colspan=\"6\">");
        for (AbstractC0367e mo39532h = abstractC0366d.mo39532h(); mo39532h != null; mo39532h = mo39532h.mo39485e()) {
            m39734a(sb, mo39532h);
        }
        sb.append("</td></tr>");
    }

    /* renamed from: a */
    void m39734a(StringBuilder sb, AbstractC0367e abstractC0367e) {
        m39733b(sb, abstractC0367e);
        int mo39486d = abstractC0367e.mo39486d();
        C0378p[] mo39487c = abstractC0367e.mo39487c();
        for (int i = 0; i < mo39487c.length - mo39486d; i++) {
            C0378p c0378p = mo39487c[i];
            sb.append(f243a);
            sb.append(C0426d.m39339a(c0378p.toString()));
            sb.append(C0494h.f715c);
        }
        if (mo39486d > 0) {
            sb.append(f243a);
            sb.append("\t... ").append(mo39486d).append(" common frames omitted").append(C0494h.f715c);
        }
    }

    /* renamed from: b */
    public void m39733b(StringBuilder sb, AbstractC0367e abstractC0367e) {
        if (abstractC0367e.mo39486d() > 0) {
            sb.append("<br />").append(C0494h.f727o);
        }
        sb.append(abstractC0367e.mo39488b()).append(": ").append(C0426d.m39339a(abstractC0367e.mo39490a()));
        sb.append(C0494h.f715c);
    }
}
