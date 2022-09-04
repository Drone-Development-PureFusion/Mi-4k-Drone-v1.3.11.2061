package org.p328c.p337b.p341d.p344c;

import java.util.List;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11643d;
/* renamed from: org.c.b.d.c.f */
/* loaded from: classes.dex */
public class C11540f extends AbstractC11650j {

    /* renamed from: a */
    private final AbstractC11650j f36657a;

    /* renamed from: b */
    private final Object f36658b;

    /* renamed from: c */
    private final List<C11643d> f36659c;

    public C11540f(AbstractC11650j abstractC11650j, List<C11643d> list, Object obj) {
        this.f36657a = abstractC11650j;
        this.f36659c = list;
        this.f36658b = obj;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11650j
    /* renamed from: a */
    public void mo318a() {
        for (C11643d c11643d : this.f36659c) {
            c11643d.m455a(this.f36658b, new Object[0]);
        }
        this.f36657a.mo318a();
    }
}
