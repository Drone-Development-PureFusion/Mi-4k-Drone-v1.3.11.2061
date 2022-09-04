package org.p328c.p329a.p333d;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.p328c.p350f.C11673g;
import org.p328c.p350f.p351a.AbstractC11648h;
/* renamed from: org.c.a.d.a */
/* loaded from: classes2.dex */
public class C11467a extends C11673g {
    public C11467a(Class<?> cls, AbstractC11648h abstractC11648h) {
        super(abstractC11648h, cls, m998a(cls.getClasses()));
    }

    /* renamed from: a */
    private static Class<?>[] m998a(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class<?> cls : clsArr) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add(cls);
            }
        }
        return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }
}
