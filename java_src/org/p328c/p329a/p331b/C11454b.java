package org.p328c.p329a.p331b;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.p328c.p337b.p340c.C11511c;
import org.p328c.p337b.p341d.C11517b;
import org.p328c.p337b.p341d.C11542e;
import org.p328c.p347e.AbstractC11630i;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.C11629h;
import org.p328c.p347e.C11632j;
import org.p328c.p350f.C11673g;
import org.p328c.p350f.p351a.C11645e;
import p070c.p072b.C0759n;
/* renamed from: org.c.a.b.b */
/* loaded from: classes.dex */
public class C11454b {

    /* renamed from: a */
    private static final String f36559a = "malformed JUnit 3 test class: ";

    /* renamed from: b */
    private final C11457c f36560b;

    private C11454b(File file) {
        this.f36560b = C11457c.m1019a(file);
    }

    /* renamed from: a */
    public static C11454b m1032a(File file) {
        return new C11454b(file);
    }

    @Deprecated
    /* renamed from: a */
    public static C11454b m1030a(String str) {
        return m1032a(new File(str));
    }

    /* renamed from: a */
    private AbstractC11630i m1029a(List<C11622c> list) {
        final ArrayList arrayList = new ArrayList();
        for (C11622c c11622c : list) {
            arrayList.add(m1028a(c11622c));
        }
        return new AbstractC11630i() { // from class: org.c.a.b.b.1
            @Override // org.p328c.p347e.AbstractC11630i
            /* renamed from: a */
            public AbstractC11637l mo489a() {
                try {
                    return new C11673g(null, arrayList) { // from class: org.c.a.b.b.1.1
                    };
                } catch (C11645e e) {
                    return new C11517b(null, e);
                }
            }
        };
    }

    /* renamed from: a */
    private AbstractC11637l m1028a(C11622c c11622c) {
        if (c11622c.toString().equals("TestSuite with 0 tests")) {
            return C11673g.m317a();
        }
        if (c11622c.toString().startsWith(f36559a)) {
            return new C11542e(new C0759n(m1024b(c11622c)));
        }
        Class<?> m533i = c11622c.m533i();
        if (m533i == null) {
            throw new RuntimeException("Can't build a runner from description [" + c11622c + "]");
        }
        String m531k = c11622c.m531k();
        return m531k == null ? AbstractC11630i.m499a(m533i).mo489a() : AbstractC11630i.m498a(m533i, m531k).mo489a();
    }

    /* renamed from: a */
    private void m1027a(C11622c c11622c, C11622c c11622c2, List<C11622c> list) {
        if (!c11622c2.m541b().isEmpty()) {
            Iterator<C11622c> it2 = c11622c2.m541b().iterator();
            while (it2.hasNext()) {
                m1027a(c11622c2, it2.next(), list);
            }
        } else if (c11622c2.toString().equals("warning(junit.framework.TestSuite$1)")) {
            list.add(C11622c.m543a(f36559a + c11622c, new Annotation[0]));
        } else {
            list.add(c11622c2);
        }
    }

    /* renamed from: b */
    private Class<?> m1024b(C11622c c11622c) {
        try {
            return Class.forName(c11622c.toString().replace(f36559a, ""));
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    /* renamed from: d */
    private List<C11622c> m1021d(AbstractC11630i abstractC11630i) {
        ArrayList arrayList = new ArrayList();
        m1027a(null, abstractC11630i.mo489a().mo327d(), arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public C11632j m1031a(Class<?> cls) {
        return m1026a(AbstractC11630i.m499a(cls));
    }

    /* renamed from: a */
    public C11632j m1026a(AbstractC11630i abstractC11630i) {
        return m1025a(abstractC11630i, new C11629h());
    }

    /* renamed from: a */
    public C11632j m1025a(AbstractC11630i abstractC11630i, C11629h c11629h) {
        c11629h.m508a(this.f36560b.m1020a());
        return c11629h.m506a(m1023b(abstractC11630i).mo489a());
    }

    /* renamed from: b */
    public AbstractC11630i m1023b(AbstractC11630i abstractC11630i) {
        if (abstractC11630i instanceof C11511c) {
            return abstractC11630i;
        }
        List<C11622c> m1021d = m1021d(abstractC11630i);
        Collections.sort(m1021d, this.f36560b.m1015b());
        return m1029a(m1021d);
    }

    /* renamed from: c */
    public List<C11622c> m1022c(AbstractC11630i abstractC11630i) {
        return m1021d(m1023b(abstractC11630i));
    }
}
