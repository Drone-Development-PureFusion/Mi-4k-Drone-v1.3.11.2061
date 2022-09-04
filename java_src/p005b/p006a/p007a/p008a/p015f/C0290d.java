package p005b.p006a.p007a.p008a.p015f;

import p005b.p006a.p007a.p029b.p035f.AbstractC0428a;
/* renamed from: b.a.a.a.f.d */
/* loaded from: classes.dex */
public class C0290d implements AbstractC0428a {

    /* renamed from: a */
    String f246a = "http://logback.qos.ch/css/classic.css";

    /* renamed from: a */
    public String m39728a() {
        return this.f246a;
    }

    /* renamed from: a */
    public void m39727a(String str) {
        this.f246a = str;
    }

    @Override // p005b.p006a.p007a.p029b.p035f.AbstractC0428a
    /* renamed from: a */
    public void mo39336a(StringBuilder sb) {
        sb.append("<link REL=StyleSheet HREF=\"");
        sb.append(this.f246a);
        sb.append("\" TITLE=\"Basic\" />");
    }
}
