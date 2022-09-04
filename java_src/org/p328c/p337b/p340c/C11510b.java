package org.p328c.p337b.p340c;

import org.p328c.p337b.p341d.C11517b;
import org.p328c.p347e.AbstractC11630i;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.p348a.AbstractC11598a;
import org.p328c.p347e.p348a.C11603c;
/* renamed from: org.c.b.c.b */
/* loaded from: classes2.dex */
public final class C11510b extends AbstractC11630i {

    /* renamed from: a */
    private final AbstractC11630i f36617a;

    /* renamed from: b */
    private final AbstractC11598a f36618b;

    public C11510b(AbstractC11630i abstractC11630i, AbstractC11598a abstractC11598a) {
        this.f36617a = abstractC11630i;
        this.f36618b = abstractC11598a;
    }

    @Override // org.p328c.p347e.AbstractC11630i
    /* renamed from: a */
    public AbstractC11637l mo489a() {
        try {
            AbstractC11637l mo489a = this.f36617a.mo489a();
            this.f36618b.mo582a(mo489a);
            return mo489a;
        } catch (C11603c e) {
            return new C11517b(AbstractC11598a.class, new Exception(String.format("No tests found matching %s from %s", this.f36618b.mo580a(), this.f36617a.toString())));
        }
    }
}
