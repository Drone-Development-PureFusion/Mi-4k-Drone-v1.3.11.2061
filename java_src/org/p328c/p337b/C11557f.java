package org.p328c.p337b;

import org.p328c.C11565c;
/* renamed from: org.c.b.f */
/* loaded from: classes2.dex */
public class C11557f extends AbstractC11512d {

    /* renamed from: a */
    public Object f36682a;

    public C11557f(double d) {
        this.f36682a = Double.valueOf(d);
    }

    public C11557f(float f) {
        this.f36682a = Float.valueOf(f);
    }

    @Override // org.p328c.p337b.AbstractC11512d
    /* renamed from: a */
    protected void mo781a(Object obj, Object obj2) {
        if (obj instanceof Double) {
            C11565c.m729b(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.f36682a).doubleValue());
        } else {
            C11565c.m728b(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.f36682a).floatValue());
        }
    }
}
