package org.p328c.p346d;

import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.d.e */
/* loaded from: classes2.dex */
public abstract class AbstractC11574e implements AbstractC11585l {
    /* renamed from: a */
    private AbstractC11650j m653a(final AbstractC11650j abstractC11650j) {
        return new AbstractC11650j() { // from class: org.c.d.e.1
            @Override // org.p328c.p350f.p351a.AbstractC11650j
            /* renamed from: a */
            public void mo318a() {
                AbstractC11574e.this.mo636a();
                try {
                    abstractC11650j.mo318a();
                } finally {
                    AbstractC11574e.this.mo631b();
                }
            }
        };
    }

    @Override // org.p328c.p346d.AbstractC11585l
    /* renamed from: a */
    public AbstractC11650j mo587a(AbstractC11650j abstractC11650j, C11622c c11622c) {
        return m653a(abstractC11650j);
    }

    /* renamed from: a */
    protected void mo636a() {
    }

    /* renamed from: b */
    protected void mo631b() {
    }
}
