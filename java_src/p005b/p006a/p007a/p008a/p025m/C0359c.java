package p005b.p006a.p007a.p008a.p025m;

import java.util.Map;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p054n.AbstractC0644b;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.m.c */
/* loaded from: classes.dex */
public class C0359c extends AbstractC0644b<AbstractC0366d> {

    /* renamed from: b */
    private String f357b;

    /* renamed from: c */
    private String f358c;

    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0648f
    /* renamed from: a */
    public String mo38614a() {
        return this.f357b;
    }

    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0648f
    /* renamed from: a */
    public String mo38613a(AbstractC0366d abstractC0366d) {
        String str;
        Map<String, String> mo39528l = abstractC0366d.mo39528l();
        return (mo39528l == null || (str = mo39528l.get(this.f357b)) == null) ? this.f358c : str;
    }

    /* renamed from: a */
    public void m39584a(String str) {
        this.f357b = str;
    }

    /* renamed from: b */
    public String m39583b() {
        return this.f358c;
    }

    /* renamed from: b */
    public void m39582b(String str) {
        this.f358c = str;
    }

    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0644b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        int i = 0;
        if (C0724u.m38372e(this.f357b)) {
            c("The \"Key\" property must be set");
            i = 1;
        }
        if (C0724u.m38372e(this.f358c)) {
            i++;
            c("The \"DefaultValue\" property must be set");
        }
        if (i == 0) {
            this.f1158a = true;
        }
    }
}
