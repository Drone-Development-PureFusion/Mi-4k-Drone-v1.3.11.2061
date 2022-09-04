package org.p328c.p346d;

import org.p328c.p337b.C11503b;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11643d;
@Deprecated
/* renamed from: org.c.d.n */
/* loaded from: classes.dex */
public class C11588n implements AbstractC11576f {
    @Override // org.p328c.p346d.AbstractC11576f
    /* renamed from: a */
    public AbstractC11650j mo603a(final AbstractC11650j abstractC11650j, final C11643d c11643d, Object obj) {
        return new AbstractC11650j() { // from class: org.c.d.n.1
            @Override // org.p328c.p350f.p351a.AbstractC11650j
            /* renamed from: a */
            public void mo318a() {
                C11588n.this.m602b(c11643d);
                try {
                    try {
                        abstractC11650j.mo318a();
                        C11588n.this.m604a(c11643d);
                    } catch (C11503b e) {
                        throw e;
                    } catch (Throwable th) {
                        C11588n.this.m605a(th, c11643d);
                        throw th;
                    }
                } finally {
                    C11588n.this.m601c(c11643d);
                }
            }
        };
    }

    /* renamed from: a */
    public void m605a(Throwable th, C11643d c11643d) {
    }

    /* renamed from: a */
    public void m604a(C11643d c11643d) {
    }

    /* renamed from: b */
    public void m602b(C11643d c11643d) {
    }

    /* renamed from: c */
    public void m601c(C11643d c11643d) {
    }
}
