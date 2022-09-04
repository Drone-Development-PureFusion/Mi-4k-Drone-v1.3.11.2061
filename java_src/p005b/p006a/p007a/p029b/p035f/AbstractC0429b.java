package p005b.p006a.p007a.p029b.p035f;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.AbstractC0597k;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p045i.AbstractC0566b;
import p005b.p006a.p007a.p029b.p045i.C0578c;
import p005b.p006a.p007a.p029b.p045i.p047b.C0572f;
import p005b.p006a.p007a.p029b.p055o.C0674r;
/* renamed from: b.a.a.b.f.b */
/* loaded from: classes.dex */
public abstract class AbstractC0429b<E> extends AbstractC0597k<E> {

    /* renamed from: h */
    protected String f534h;

    /* renamed from: i */
    protected AbstractC0566b<E> f535i;

    /* renamed from: k */
    protected AbstractC0428a f537k;

    /* renamed from: j */
    protected String f536j = "Logback Log Messages";

    /* renamed from: l */
    protected long f538l = 0;

    /* renamed from: b */
    private void m39331b(StringBuilder sb) {
        AbstractC0566b<E> abstractC0566b = this.f535i;
        sb.append("<tr class=\"header\">");
        sb.append(C0494h.f715c);
        while (abstractC0566b != null) {
            if (mo39333a((AbstractC0566b) abstractC0566b) == null) {
                abstractC0566b = abstractC0566b.m38860b();
            } else {
                sb.append("<td class=\"");
                sb.append(mo39333a((AbstractC0566b) abstractC0566b));
                sb.append("\">");
                sb.append(mo39333a((AbstractC0566b) abstractC0566b));
                sb.append("</td>");
                sb.append(C0494h.f715c);
                abstractC0566b = abstractC0566b.m38860b();
            }
        }
        sb.append("</tr>");
        sb.append(C0494h.f715c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String mo39333a(AbstractC0566b abstractC0566b) {
        String simpleName = abstractC0566b.getClass().getSimpleName();
        int indexOf = simpleName.indexOf("Converter");
        return indexOf == -1 ? simpleName : simpleName.substring(0, indexOf);
    }

    /* renamed from: a */
    protected abstract Map<String, String> mo39335a();

    /* renamed from: a */
    public void m39334a(AbstractC0428a abstractC0428a) {
        this.f537k = abstractC0428a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m39332a(StringBuilder sb) {
        if (this.f538l >= 10000) {
            this.f538l = 0L;
            sb.append("</table>");
            sb.append(C0494h.f715c);
            sb.append("<p></p>");
            sb.append("<table cellspacing=\"0\">");
            sb.append(C0494h.f715c);
            m39331b(sb);
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: d */
    public String mo38765d() {
        return "text/html";
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: e */
    public String mo38763e() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
        sb.append(" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        sb.append(C0494h.f715c);
        sb.append("<html>");
        sb.append(C0494h.f715c);
        sb.append("  <head>");
        sb.append(C0494h.f715c);
        sb.append("    <title>");
        sb.append(this.f536j);
        sb.append("</title>");
        sb.append(C0494h.f715c);
        this.f537k.mo39336a(sb);
        sb.append(C0494h.f715c);
        sb.append("  </head>");
        sb.append(C0494h.f715c);
        sb.append("<body>");
        sb.append(C0494h.f715c);
        return sb.toString();
    }

    /* renamed from: e_ */
    public void m39330e_(String str) {
        this.f534h = str;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: f */
    public String mo38762f() {
        StringBuilder sb = new StringBuilder();
        sb.append("<hr/>");
        sb.append(C0494h.f715c);
        sb.append("<p>Log session start time ");
        sb.append(new Date());
        sb.append("</p><p></p>");
        sb.append(C0494h.f715c);
        sb.append(C0494h.f715c);
        sb.append("<table cellspacing=\"0\">");
        sb.append(C0494h.f715c);
        m39331b(sb);
        return sb.toString();
    }

    /* renamed from: f */
    public void m39329f(String str) {
        this.f536j = str;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: g */
    public String mo38761g() {
        return "</table>";
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: h */
    public String mo38760h() {
        return C0494h.f715c + "</body></html>";
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        boolean z = false;
        try {
            C0572f c0572f = new C0572f(this.f534h);
            c0572f.a(c_());
            this.f535i = c0572f.m38841a(c0572f.m38842a(), m39326n());
            C0578c.m38816a(this.f535i);
        } catch (C0674r e) {
            a("Incorrect pattern found", e);
            z = true;
        }
        if (!z) {
            this.f1026c = true;
        }
    }

    /* renamed from: l */
    public String m39328l() {
        return this.f534h;
    }

    /* renamed from: m */
    public AbstractC0428a m39327m() {
        return this.f537k;
    }

    /* renamed from: n */
    public Map<String, String> m39326n() {
        Map map;
        HashMap hashMap = new HashMap();
        Map<String, String> mo39335a = mo39335a();
        if (mo39335a != null) {
            hashMap.putAll(mo39335a);
        }
        AbstractC0427f c_ = c_();
        if (c_ != null && (map = (Map) c_.mo39316f(C0494h.f719g)) != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: o */
    public String m39325o() {
        return this.f536j;
    }
}
