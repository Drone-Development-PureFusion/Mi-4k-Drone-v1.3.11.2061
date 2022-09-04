package p005b.p006a.p007a.p029b.p049j;

import java.io.File;
import p005b.p006a.p007a.p029b.AbstractC0675p;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.j.a */
/* loaded from: classes.dex */
public class C0595a extends AbstractC0675p {

    /* renamed from: a */
    String f1024a;

    /* renamed from: a */
    public String m38772a() {
        return this.f1024a;
    }

    /* renamed from: a */
    public void m38771a(String str) {
        this.f1024a = str;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0673q
    /* renamed from: b */
    public String mo38527b() {
        if (C0724u.m38372e(this.f1024a)) {
            c("The \"path\" property must be set.");
            return null;
        }
        return a(new File(this.f1024a).exists());
    }
}
