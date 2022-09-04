package org.p325b;
/* renamed from: org.b.l */
/* loaded from: classes2.dex */
public class C11434l {
    /* renamed from: a */
    public static <T> void m1078a(T t, AbstractC11433k<? super T> abstractC11433k) {
        m1077a("", t, abstractC11433k);
    }

    /* renamed from: a */
    public static <T> void m1077a(String str, T t, AbstractC11433k<? super T> abstractC11433k) {
        if (!abstractC11433k.mo900a(t)) {
            C11436n c11436n = new C11436n();
            c11436n.mo1086a(str).mo1086a("\nExpected: ").mo1083a((AbstractC11435m) abstractC11433k).mo1086a("\n     but: ");
            abstractC11433k.mo1070a(t, c11436n);
            throw new AssertionError(c11436n.toString());
        }
    }

    /* renamed from: a */
    public static void m1076a(String str, boolean z) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
