package org.p328c.p329a.p334e.p336b;

import java.util.ArrayList;
import java.util.List;
import org.p328c.p329a.p334e.AbstractC11482e;
import org.p328c.p329a.p334e.AbstractC11484g;
import org.p328c.p329a.p334e.C11481d;
/* renamed from: org.c.a.e.b.b */
/* loaded from: classes.dex */
public class C11479b extends AbstractC11482e {
    @Override // org.p328c.p329a.p334e.AbstractC11482e
    /* renamed from: a */
    public List<AbstractC11484g> mo945a(C11481d c11481d) {
        ArrayList arrayList = new ArrayList();
        for (int i : ((AbstractC11478a) c11481d.m946e(AbstractC11478a.class)).m962a()) {
            arrayList.add(AbstractC11484g.m943a("ints", Integer.valueOf(i)));
        }
        return arrayList;
    }
}
