package org.p328c.p350f;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.p328c.p337b.p338a.C11495a;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p349b.C11611c;
import org.p328c.p350f.p351a.AbstractC11648h;
import org.p328c.p350f.p351a.C11645e;
/* renamed from: org.c.f.g */
/* loaded from: classes.dex */
public class C11673g extends AbstractC11668f<AbstractC11637l> {

    /* renamed from: a */
    private final List<AbstractC11637l> f36828a;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.c.f.g$a */
    /* loaded from: classes.dex */
    public @interface AbstractC11674a {
        /* renamed from: a */
        Class<?>[] m310a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C11673g(Class<?> cls, List<AbstractC11637l> list) {
        super(cls);
        this.f36828a = Collections.unmodifiableList(list);
    }

    public C11673g(Class<?> cls, AbstractC11648h abstractC11648h) {
        this(abstractC11648h, cls, m313b(cls));
    }

    protected C11673g(Class<?> cls, Class<?>[] clsArr) {
        this(new C11495a(true), cls, clsArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C11673g(AbstractC11648h abstractC11648h, Class<?> cls, Class<?>[] clsArr) {
        this(cls, abstractC11648h.m430a(cls, clsArr));
    }

    public C11673g(AbstractC11648h abstractC11648h, Class<?>[] clsArr) {
        this((Class<?>) null, abstractC11648h.m430a((Class<?>) null, clsArr));
    }

    /* renamed from: a */
    public static AbstractC11637l m317a() {
        try {
            return new C11673g((Class<?>) null, new Class[0]);
        } catch (C11645e e) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    /* renamed from: b */
    private static Class<?>[] m313b(Class<?> cls) {
        AbstractC11674a abstractC11674a = (AbstractC11674a) cls.getAnnotation(AbstractC11674a.class);
        if (abstractC11674a == null) {
            throw new C11645e(String.format("class '%s' must have a SuiteClasses annotation", cls.getName()));
        }
        return abstractC11674a.m310a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: a */
    public C11622c mo311d(AbstractC11637l abstractC11637l) {
        return abstractC11637l.mo327d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo316a(AbstractC11637l abstractC11637l, C11611c c11611c) {
        abstractC11637l.mo341a(c11611c);
    }

    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: c */
    protected List<AbstractC11637l> mo312c() {
        return this.f36828a;
    }
}
