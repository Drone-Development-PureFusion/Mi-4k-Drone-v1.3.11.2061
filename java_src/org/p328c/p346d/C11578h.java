package org.p328c.p346d;

import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.d.h */
/* loaded from: classes.dex */
public class C11578h extends AbstractC11650j {

    /* renamed from: a */
    private final AbstractC11650j f36702a;

    public C11578h(AbstractC11650j abstractC11650j, Iterable<AbstractC11585l> iterable, C11622c c11622c) {
        this.f36702a = m649a(abstractC11650j, iterable, c11622c);
    }

    /* renamed from: a */
    private static AbstractC11650j m649a(AbstractC11650j abstractC11650j, Iterable<AbstractC11585l> iterable, C11622c c11622c) {
        for (AbstractC11585l abstractC11585l : iterable) {
            abstractC11650j = abstractC11585l.mo587a(abstractC11650j, c11622c);
        }
        return abstractC11650j;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11650j
    /* renamed from: a */
    public void mo318a() {
        this.f36702a.mo318a();
    }
}
