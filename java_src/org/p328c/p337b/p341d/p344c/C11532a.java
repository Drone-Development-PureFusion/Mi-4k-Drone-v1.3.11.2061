package org.p328c.p337b.p341d.p344c;

import org.p328c.p337b.C11503b;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.b.d.c.a */
/* loaded from: classes2.dex */
public class C11532a extends AbstractC11650j {

    /* renamed from: a */
    private final AbstractC11650j f36639a;

    /* renamed from: b */
    private final Class<? extends Throwable> f36640b;

    public C11532a(AbstractC11650j abstractC11650j, Class<? extends Throwable> cls) {
        this.f36639a = abstractC11650j;
        this.f36640b = cls;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11650j
    /* renamed from: a */
    public void mo318a() {
        boolean z;
        try {
            this.f36639a.mo318a();
            z = true;
        } catch (C11503b e) {
            throw e;
        } catch (Throwable th) {
            if (!this.f36640b.isAssignableFrom(th.getClass())) {
                throw new Exception("Unexpected exception, expected<" + this.f36640b.getName() + "> but was<" + th.getClass().getName() + ">", th);
            }
            z = false;
        }
        if (z) {
            throw new AssertionError("Expected exception: " + this.f36640b.getName());
        }
    }
}
