package p005b.p006a.p007a.p008a.p022k;

import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.k.p */
/* loaded from: classes.dex */
public class C0344p extends AbstractC0333e {

    /* renamed from: a */
    private String f341a;

    /* renamed from: b */
    private String f342b = "";

    /* renamed from: a */
    private String m39611a(Map<String, String> map) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z2) {
                z = false;
            } else {
                sb.append(", ");
                z = z2;
            }
            sb.append(entry.getKey()).append(SignatureVisitor.INSTANCEOF).append(entry.getValue());
            z2 = z;
        }
        return sb.toString();
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        Map<String, String> mo39528l = abstractC0366d.mo39528l();
        if (mo39528l == null) {
            return this.f342b;
        }
        if (this.f341a == null) {
            return m39611a(mo39528l);
        }
        String str = abstractC0366d.mo39528l().get(this.f341a);
        return str == null ? this.f342b : str;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        String[] m38373d = C0724u.m38373d(d());
        this.f341a = m38373d[0];
        if (m38373d[1] != null) {
            this.f342b = m38373d[1];
        }
        super.j();
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f341a = null;
        super.k();
    }
}
