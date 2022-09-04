package org.p328c.p346d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.d.g */
/* loaded from: classes2.dex */
public class C11577g implements AbstractC11585l {

    /* renamed from: a */
    private static final C11577g f36700a = new C11577g(Collections.emptyList());

    /* renamed from: b */
    private List<AbstractC11585l> f36701b;

    private C11577g(List<AbstractC11585l> list) {
        this.f36701b = list;
    }

    /* renamed from: a */
    public static C11577g m652a() {
        return f36700a;
    }

    /* renamed from: a */
    public static C11577g m651a(AbstractC11585l abstractC11585l) {
        return m652a().m650b(abstractC11585l);
    }

    @Override // org.p328c.p346d.AbstractC11585l
    /* renamed from: a */
    public AbstractC11650j mo587a(AbstractC11650j abstractC11650j, C11622c c11622c) {
        for (AbstractC11585l abstractC11585l : this.f36701b) {
            abstractC11650j = abstractC11585l.mo587a(abstractC11650j, c11622c);
        }
        return abstractC11650j;
    }

    /* renamed from: b */
    public C11577g m650b(AbstractC11585l abstractC11585l) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC11585l);
        arrayList.addAll(this.f36701b);
        return new C11577g(arrayList);
    }
}
