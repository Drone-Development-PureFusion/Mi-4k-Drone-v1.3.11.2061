package org.p328c.p353g;

import java.util.concurrent.ConcurrentHashMap;
/* renamed from: org.c.g.b */
/* loaded from: classes.dex */
public class C11677b {

    /* renamed from: a */
    private static final ConcurrentHashMap<AbstractC11686f, AbstractC11676a> f36830a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public AbstractC11676a m306a(AbstractC11686f abstractC11686f) {
        AbstractC11676a abstractC11676a = f36830a.get(abstractC11686f);
        if (abstractC11676a != null) {
            return abstractC11676a;
        }
        Class<? extends AbstractC11676a> m297a = abstractC11686f.m297a();
        if (m297a == null) {
            throw new IllegalArgumentException("Can't create validator, value is null in annotation " + abstractC11686f.getClass().getName());
        }
        try {
            f36830a.putIfAbsent(abstractC11686f, m297a.newInstance());
            return f36830a.get(abstractC11686f);
        } catch (Exception e) {
            throw new RuntimeException("Exception received when creating AnnotationValidator class " + m297a.getName(), e);
        }
    }
}
