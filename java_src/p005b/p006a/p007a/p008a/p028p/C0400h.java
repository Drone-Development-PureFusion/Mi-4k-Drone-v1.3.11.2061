package p005b.p006a.p007a.p008a.p028p;

import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p056p.AbstractC0684i;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.p.h */
/* loaded from: classes.dex */
public class C0400h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m39421a(C0286f c0286f) {
        String m38374c = C0724u.m38374c(C0393a.f463c);
        if (!C0724u.m38372e(m38374c)) {
            m39419a(c0286f, m38374c);
        }
    }

    /* renamed from: a */
    private static void m39420a(C0286f c0286f, AbstractC0684i abstractC0684i) {
        if (abstractC0684i != null) {
            if (abstractC0684i instanceof AbstractC0661e) {
                ((AbstractC0661e) abstractC0684i).mo38551a(c0286f);
            }
            if (abstractC0684i instanceof AbstractC0669m) {
                ((AbstractC0669m) abstractC0684i).mo38474j();
            }
            c0286f.n().mo38505a(abstractC0684i);
        }
    }

    /* renamed from: a */
    private static void m39419a(C0286f c0286f, String str) {
        m39420a(c0286f, m39418b(c0286f, str));
    }

    /* renamed from: b */
    private static AbstractC0684i m39418b(C0286f c0286f, String str) {
        try {
            return (AbstractC0684i) C0724u.m38382a(str, AbstractC0684i.class, c0286f);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
