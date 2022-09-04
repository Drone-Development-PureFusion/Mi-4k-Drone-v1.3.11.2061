package org.p328c.p337b.p340c;

import java.util.Comparator;
import org.p328c.p347e.AbstractC11630i;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p348a.C11605e;
/* renamed from: org.c.b.c.c */
/* loaded from: classes2.dex */
public class C11511c extends AbstractC11630i {

    /* renamed from: a */
    private final AbstractC11630i f36619a;

    /* renamed from: b */
    private final Comparator<C11622c> f36620b;

    public C11511c(AbstractC11630i abstractC11630i, Comparator<C11622c> comparator) {
        this.f36619a = abstractC11630i;
        this.f36620b = comparator;
    }

    @Override // org.p328c.p347e.AbstractC11630i
    /* renamed from: a */
    public AbstractC11637l mo489a() {
        AbstractC11637l mo489a = this.f36619a.mo489a();
        new C11605e(this.f36620b).m578a(mo489a);
        return mo489a;
    }
}
