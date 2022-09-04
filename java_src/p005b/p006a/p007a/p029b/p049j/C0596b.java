package p005b.p006a.p007a.p029b.p049j;

import p005b.p006a.p007a.p029b.AbstractC0675p;
import p005b.p006a.p007a.p029b.p058r.C0720s;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.j.b */
/* loaded from: classes.dex */
public class C0596b extends AbstractC0675p {

    /* renamed from: a */
    String f1025a;

    /* renamed from: a */
    public String m38770a() {
        return this.f1025a;
    }

    /* renamed from: a */
    public void m38769a(String str) {
        this.f1025a = str;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0673q
    /* renamed from: b */
    public String mo38527b() {
        if (!C0724u.m38372e(this.f1025a)) {
            return a(C0720s.m38397a(this.f1025a) != null);
        }
        c("The \"resource\" property must be set.");
        return null;
    }
}
