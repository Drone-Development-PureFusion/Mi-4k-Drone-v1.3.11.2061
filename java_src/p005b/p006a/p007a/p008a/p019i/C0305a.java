package p005b.p006a.p007a.p008a.p019i;

import java.util.Map;
import java.util.Set;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0367e;
import p005b.p006a.p007a.p008a.p026n.C0378p;
import p005b.p006a.p007a.p029b.AbstractC0597k;
import p005b.p006a.p007a.p029b.p034e.C0426d;
/* renamed from: b.a.a.a.i.a */
/* loaded from: classes.dex */
public class C0305a extends AbstractC0597k<AbstractC0366d> {

    /* renamed from: a */
    private static final int f268a = 256;

    /* renamed from: b */
    private static final int f269b = 2048;

    /* renamed from: h */
    private StringBuilder f270h = new StringBuilder(256);

    /* renamed from: i */
    private boolean f271i = false;

    /* renamed from: j */
    private boolean f272j = false;

    @Override // p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: a */
    public String mo38773a(AbstractC0366d abstractC0366d) {
        Map<String, String> mo39528l;
        StackTraceElement[] mo39531i;
        if (this.f270h.capacity() > 2048) {
            this.f270h = new StringBuilder(256);
        } else {
            this.f270h.setLength(0);
        }
        this.f270h.append("<log4j:event logger=\"");
        this.f270h.append(abstractC0366d.mo39534f());
        this.f270h.append("\"\r\n");
        this.f270h.append("             timestamp=\"");
        this.f270h.append(abstractC0366d.mo39526n());
        this.f270h.append("\" level=\"");
        this.f270h.append(abstractC0366d.mo39538b());
        this.f270h.append("\" thread=\"");
        this.f270h.append(abstractC0366d.mo39540a());
        this.f270h.append("\">\r\n");
        this.f270h.append("  <log4j:message><![CDATA[");
        C0426d.m39337a(this.f270h, abstractC0366d.mo39535e());
        this.f270h.append("]]></log4j:message>\r\n");
        AbstractC0367e mo39532h = abstractC0366d.mo39532h();
        if (mo39532h != null) {
            C0378p[] mo39487c = mo39532h.mo39487c();
            this.f270h.append("  <log4j:throwable><![CDATA[");
            for (C0378p c0378p : mo39487c) {
                this.f270h.append('\t');
                this.f270h.append(c0378p.toString());
                this.f270h.append("\r\n");
            }
            this.f270h.append("]]></log4j:throwable>\r\n");
        }
        if (this.f271i && (mo39531i = abstractC0366d.mo39531i()) != null && mo39531i.length > 0) {
            StackTraceElement stackTraceElement = mo39531i[0];
            this.f270h.append("  <log4j:locationInfo class=\"");
            this.f270h.append(stackTraceElement.getClassName());
            this.f270h.append("\"\r\n");
            this.f270h.append("                      method=\"");
            this.f270h.append(C0426d.m39339a(stackTraceElement.getMethodName()));
            this.f270h.append("\" file=\"");
            this.f270h.append(stackTraceElement.getFileName());
            this.f270h.append("\" line=\"");
            this.f270h.append(stackTraceElement.getLineNumber());
            this.f270h.append("\"/>\r\n");
        }
        if (m39703b() && (mo39528l = abstractC0366d.mo39528l()) != null && mo39528l.size() != 0) {
            Set<Map.Entry<String, String>> entrySet = mo39528l.entrySet();
            this.f270h.append("  <log4j:properties>");
            for (Map.Entry<String, String> entry : entrySet) {
                this.f270h.append("\r\n    <log4j:data");
                this.f270h.append(" name='" + C0426d.m39339a(entry.getKey()) + "'");
                this.f270h.append(" value='" + C0426d.m39339a(entry.getValue()) + "'");
                this.f270h.append(" />");
            }
            this.f270h.append("\r\n  </log4j:properties>");
        }
        this.f270h.append("\r\n</log4j:event>\r\n\r\n");
        return this.f270h.toString();
    }

    /* renamed from: a */
    public void m39704a(boolean z) {
        this.f271i = z;
    }

    /* renamed from: a */
    public boolean m39706a() {
        return this.f271i;
    }

    /* renamed from: b */
    public void m39702b(boolean z) {
        this.f272j = z;
    }

    /* renamed from: b */
    public boolean m39703b() {
        return this.f272j;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: d */
    public String mo38765d() {
        return "text/xml";
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        super.mo38474j();
    }
}
