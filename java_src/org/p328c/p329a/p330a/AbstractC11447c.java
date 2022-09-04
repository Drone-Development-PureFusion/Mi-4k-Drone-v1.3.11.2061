package org.p328c.p329a.p330a;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.p328c.p337b.C11508c;
import org.p328c.p347e.AbstractC11624e;
import org.p328c.p347e.C11626f;
import org.p328c.p347e.p348a.AbstractC11598a;
/* renamed from: org.c.a.a.c */
/* loaded from: classes2.dex */
abstract class AbstractC11447c implements AbstractC11624e {
    /* renamed from: a */
    private List<Class<?>> m1035a(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            arrayList.add(C11508c.m897a(str2));
        }
        return arrayList;
    }

    /* renamed from: a */
    protected abstract AbstractC11598a mo1033a(List<Class<?>> list);

    @Override // org.p328c.p347e.AbstractC11624e
    /* renamed from: a */
    public AbstractC11598a mo525a(C11626f c11626f) {
        try {
            return mo1033a(m1035a(c11626f.m524a()));
        } catch (ClassNotFoundException e) {
            throw new AbstractC11624e.C11625a(e);
        }
    }
}
