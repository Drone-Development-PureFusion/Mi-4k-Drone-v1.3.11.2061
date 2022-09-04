package p005b.p006a.p007a.p008a.p015f;

import java.util.Map;
import p005b.p006a.p007a.p008a.C0291g;
import p005b.p006a.p007a.p008a.p022k.C0344p;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p035f.AbstractC0429b;
import p005b.p006a.p007a.p029b.p035f.AbstractC0430c;
import p005b.p006a.p007a.p029b.p045i.AbstractC0566b;
/* renamed from: b.a.a.a.f.c */
/* loaded from: classes.dex */
public class C0289c extends AbstractC0429b<AbstractC0366d> {

    /* renamed from: a */
    static final String f244a = "%date%thread%level%logger%mdc%msg";

    /* renamed from: b */
    AbstractC0430c<AbstractC0366d> f245b = new C0288b();

    public C0289c() {
        this.f534h = f244a;
        this.f537k = new C0287a();
    }

    /* renamed from: a */
    private void m39730a(StringBuilder sb, AbstractC0566b<AbstractC0366d> abstractC0566b, AbstractC0366d abstractC0366d) {
        sb.append("<td class=\"");
        sb.append(mo39333a((AbstractC0566b) abstractC0566b));
        sb.append("\">");
        abstractC0566b.mo38798a(sb, abstractC0366d);
        sb.append("</td>");
        sb.append(C0494h.f715c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: a */
    public String mo38773a(AbstractC0366d abstractC0366d) {
        StringBuilder sb = new StringBuilder();
        a(sb);
        boolean z = true;
        long j = this.f538l;
        this.f538l = j + 1;
        if ((j & 1) == 0) {
            z = false;
        }
        String lowerCase = abstractC0366d.mo39538b().toString().toLowerCase();
        sb.append(C0494h.f715c);
        sb.append("<tr class=\"");
        sb.append(lowerCase);
        if (z) {
            sb.append(" odd\">");
        } else {
            sb.append(" even\">");
        }
        sb.append(C0494h.f715c);
        for (AbstractC0566b abstractC0566b = this.f535i; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            m39730a(sb, abstractC0566b, abstractC0366d);
        }
        sb.append("</tr>");
        sb.append(C0494h.f715c);
        if (abstractC0366d.mo39532h() != null) {
            this.f245b.mo39324a(sb, abstractC0366d);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p035f.AbstractC0429b
    /* renamed from: a */
    public String mo39333a(AbstractC0566b abstractC0566b) {
        if (abstractC0566b instanceof C0344p) {
            String d = ((C0344p) abstractC0566b).d();
            return d != null ? d : "MDC";
        }
        return super.mo39333a(abstractC0566b);
    }

    @Override // p005b.p006a.p007a.p029b.p035f.AbstractC0429b
    /* renamed from: a */
    protected Map<String, String> mo39335a() {
        return C0291g.f247a;
    }

    /* renamed from: a */
    public void m39731a(AbstractC0430c<AbstractC0366d> abstractC0430c) {
        this.f245b = abstractC0430c;
    }

    /* renamed from: b */
    public AbstractC0430c m39729b() {
        return this.f245b;
    }

    @Override // p005b.p006a.p007a.p029b.p035f.AbstractC0429b, p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        boolean z = false;
        if (this.f245b == null) {
            c("ThrowableRender cannot be null.");
            z = true;
        }
        if (!z) {
            super.mo38474j();
        }
    }
}
