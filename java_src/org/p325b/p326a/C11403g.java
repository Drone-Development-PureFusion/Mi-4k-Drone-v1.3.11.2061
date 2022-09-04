package org.p325b.p326a;

import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.g */
/* loaded from: classes.dex */
public class C11403g<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private final String f36520a;

    public C11403g() {
        this("ANYTHING");
    }

    public C11403g(String str) {
        this.f36520a = str;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static AbstractC11433k<Object> m1173a(String str) {
        return new C11403g(str);
    }

    @AbstractC11431i
    /* renamed from: b */
    public static AbstractC11433k<Object> m1172b() {
        return new C11403g();
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a(this.f36520a);
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return true;
    }
}
