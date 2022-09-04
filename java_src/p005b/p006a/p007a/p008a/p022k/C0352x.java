package p005b.p006a.p007a.p008a.p022k;

import p005b.p006a.p007a.p008a.p026n.AbstractC0367e;
import p005b.p006a.p007a.p008a.p026n.C0380r;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.a.k.x */
/* loaded from: classes.dex */
public class C0352x extends C0337i {
    @Override // p005b.p006a.p007a.p008a.p022k.C0329ac
    /* renamed from: a */
    protected String mo39602a(AbstractC0367e abstractC0367e) {
        StringBuilder sb = new StringBuilder(2048);
        m39601a(sb, null, 1, abstractC0367e);
        return sb.toString();
    }

    /* renamed from: a */
    protected void m39601a(StringBuilder sb, String str, int i, AbstractC0367e abstractC0367e) {
        if (abstractC0367e.mo39485e() != null) {
            m39601a(sb, str, i, abstractC0367e.mo39485e());
            str = null;
        }
        C0380r.m39502a(sb, i - 1);
        if (str != null) {
            sb.append(str);
        }
        C0380r.m39492c(sb, abstractC0367e);
        sb.append(C0494h.f715c);
        a(sb, i, abstractC0367e);
        AbstractC0367e[] mo39484f = abstractC0367e.mo39484f();
        if (mo39484f != null) {
            for (AbstractC0367e abstractC0367e2 : mo39484f) {
                m39601a(sb, C0494h.f728p, i + 1, abstractC0367e2);
            }
        }
    }
}
