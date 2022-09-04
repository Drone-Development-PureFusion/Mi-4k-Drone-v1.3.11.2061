package org.p328c.p329a.p332c;

import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11438p;
/* renamed from: org.c.a.c.c */
/* loaded from: classes2.dex */
public class C11463c {
    /* renamed from: a */
    public static AbstractC11433k<C11462b> m1003a() {
        return m1002a(0);
    }

    /* renamed from: a */
    public static AbstractC11433k<C11462b> m1002a(final int i) {
        return new AbstractC11438p<C11462b>() { // from class: org.c.a.c.c.1
            @Override // org.p325b.AbstractC11435m
            /* renamed from: a */
            public void mo905a(AbstractC11428g abstractC11428g) {
                abstractC11428g.mo1086a("has " + i + " failures");
            }

            @Override // org.p325b.AbstractC11438p
            /* renamed from: a */
            public boolean mo903b(C11462b c11462b) {
                return c11462b.m1006a() == i;
            }
        };
    }

    /* renamed from: a */
    public static AbstractC11433k<Object> m1001a(final String str) {
        return new AbstractC11415b<Object>() { // from class: org.c.a.c.c.2
            @Override // org.p325b.AbstractC11435m
            /* renamed from: a */
            public void mo905a(AbstractC11428g abstractC11428g) {
                abstractC11428g.mo1086a("has single failure containing " + str);
            }

            @Override // org.p325b.AbstractC11433k
            /* renamed from: a */
            public boolean mo900a(Object obj) {
                return obj.toString().contains(str) && C11463c.m1002a(1).mo900a(obj);
            }
        };
    }

    /* renamed from: b */
    public static AbstractC11433k<C11462b> m1000b(final String str) {
        return new AbstractC11415b<C11462b>() { // from class: org.c.a.c.c.3
            @Override // org.p325b.AbstractC11435m
            /* renamed from: a */
            public void mo905a(AbstractC11428g abstractC11428g) {
                abstractC11428g.mo1086a("has failure containing " + str);
            }

            @Override // org.p325b.AbstractC11433k
            /* renamed from: a */
            public boolean mo900a(Object obj) {
                return obj.toString().contains(str);
            }
        };
    }
}
