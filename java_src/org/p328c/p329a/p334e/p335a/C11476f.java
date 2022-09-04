package org.p328c.p329a.p334e.p335a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.p328c.p329a.p334e.AbstractC11468a;
import org.p328c.p329a.p334e.AbstractC11477b;
import org.p328c.p329a.p334e.AbstractC11480c;
import org.p328c.p329a.p334e.C11481d;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.a.e.a.f */
/* loaded from: classes.dex */
public class C11476f extends C11469a {
    public C11476f(C11651k c11651k) {
        super(c11651k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p329a.p334e.p335a.C11469a
    /* renamed from: b */
    public Collection<C11643d> mo968b(C11481d c11481d) {
        Collection<C11643d> mo968b = super.mo968b(c11481d);
        String m961a = ((AbstractC11480c) c11481d.m946e(AbstractC11480c.class)).m961a();
        ArrayList arrayList = new ArrayList();
        for (C11643d c11643d : mo968b) {
            if (Arrays.asList(((AbstractC11477b) c11643d.mo424a((Class<Annotation>) AbstractC11477b.class)).m964a()).contains(m961a)) {
                arrayList.add(c11643d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p329a.p334e.p335a.C11469a
    /* renamed from: c */
    public Collection<Field> mo967c(C11481d c11481d) {
        Collection<Field> mo967c = super.mo967c(c11481d);
        String m961a = ((AbstractC11480c) c11481d.m946e(AbstractC11480c.class)).m961a();
        ArrayList arrayList = new ArrayList();
        for (Field field : mo967c) {
            if (Arrays.asList(((AbstractC11468a) field.getAnnotation(AbstractC11468a.class)).m997a()).contains(m961a)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p329a.p334e.p335a.C11469a
    /* renamed from: d */
    public Collection<Field> mo966d(C11481d c11481d) {
        Collection<Field> mo966d = super.mo966d(c11481d);
        String m961a = ((AbstractC11480c) c11481d.m946e(AbstractC11480c.class)).m961a();
        ArrayList arrayList = new ArrayList();
        for (Field field : mo966d) {
            if (Arrays.asList(((AbstractC11477b) field.getAnnotation(AbstractC11477b.class)).m964a()).contains(m961a)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p329a.p334e.p335a.C11469a
    /* renamed from: e */
    public Collection<C11643d> mo965e(C11481d c11481d) {
        Collection<C11643d> mo965e = super.mo965e(c11481d);
        String m961a = ((AbstractC11480c) c11481d.m946e(AbstractC11480c.class)).m961a();
        ArrayList arrayList = new ArrayList();
        for (C11643d c11643d : mo965e) {
            if (Arrays.asList(((AbstractC11468a) c11643d.mo424a((Class<Annotation>) AbstractC11468a.class)).m997a()).contains(m961a)) {
                arrayList.add(c11643d);
            }
        }
        return arrayList;
    }
}
