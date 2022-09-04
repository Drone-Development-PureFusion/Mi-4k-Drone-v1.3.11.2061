package org.p328c.p337b.p341d.p344c;

import java.util.ArrayList;
import java.util.List;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p350f.p351a.C11646f;
/* renamed from: org.c.b.d.c.e */
/* loaded from: classes.dex */
public class C11539e extends AbstractC11650j {

    /* renamed from: a */
    private final AbstractC11650j f36654a;

    /* renamed from: b */
    private final Object f36655b;

    /* renamed from: c */
    private final List<C11643d> f36656c;

    public C11539e(AbstractC11650j abstractC11650j, List<C11643d> list, Object obj) {
        this.f36654a = abstractC11650j;
        this.f36656c = list;
        this.f36655b = obj;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11650j
    /* renamed from: a */
    public void mo318a() {
        ArrayList arrayList = new ArrayList();
        try {
            this.f36654a.mo318a();
            for (C11643d c11643d : this.f36656c) {
                try {
                    c11643d.m455a(this.f36655b, new Object[0]);
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            }
        } catch (Throwable th2) {
            try {
                arrayList.add(th2);
                for (C11643d c11643d2 : this.f36656c) {
                    try {
                        c11643d2.m455a(this.f36655b, new Object[0]);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            } catch (Throwable th4) {
                for (C11643d c11643d3 : this.f36656c) {
                    try {
                        c11643d3.m455a(this.f36655b, new Object[0]);
                    } catch (Throwable th5) {
                        arrayList.add(th5);
                    }
                }
                throw th4;
            }
        }
        C11646f.m438a(arrayList);
    }
}
