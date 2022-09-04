package org.p328c.p329a.p334e.p335a;

import java.util.ArrayList;
import java.util.List;
import org.p328c.p329a.p334e.AbstractC11482e;
import org.p328c.p329a.p334e.AbstractC11484g;
import org.p328c.p329a.p334e.C11481d;
/* renamed from: org.c.a.e.a.d */
/* loaded from: classes2.dex */
public class C11474d extends AbstractC11482e {

    /* renamed from: a */
    private Class<?> f36581a;

    public C11474d(Class<?> cls) {
        this.f36581a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p328c.p329a.p334e.AbstractC11482e
    /* renamed from: a */
    public List<AbstractC11484g> mo945a(C11481d c11481d) {
        Object[] enumConstants = this.f36581a.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr : enumConstants) {
            arrayList.add(AbstractC11484g.m943a(objArr.toString(), objArr));
        }
        return arrayList;
    }
}
