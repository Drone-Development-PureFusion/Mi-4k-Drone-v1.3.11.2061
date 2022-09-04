package org.p328c.p350f;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p350f.p351a.C11651k;
import org.p328c.p350f.p352b.AbstractC11660c;
import org.p328c.p350f.p352b.C11659b;
import org.p328c.p350f.p352b.C11661d;
/* renamed from: org.c.f.e */
/* loaded from: classes.dex */
public class C11664e extends C11673g {

    /* renamed from: a */
    private static final AbstractC11660c f36812a = new C11659b();

    /* renamed from: b */
    private static final List<AbstractC11637l> f36813b = Collections.emptyList();

    /* renamed from: c */
    private final List<AbstractC11637l> f36814c;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.c.f.e$a */
    /* loaded from: classes.dex */
    public @interface AbstractC11665a {
        /* renamed from: a */
        int m351a() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.c.f.e$b */
    /* loaded from: classes.dex */
    public @interface AbstractC11666b {
        /* renamed from: a */
        String m350a() default "{index}";
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.c.f.e$c */
    /* loaded from: classes.dex */
    public @interface AbstractC11667c {
        /* renamed from: a */
        Class<? extends AbstractC11660c> m349a() default C11659b.class;
    }

    public C11664e(Class<?> cls) {
        super(cls, f36813b);
        this.f36814c = Collections.unmodifiableList(m358a(m355b(), ((AbstractC11666b) m353j().mo424a((Class<Annotation>) AbstractC11666b.class)).m350a(), m354b(cls)));
    }

    /* renamed from: a */
    private List<C11661d> m359a(Iterable<Object> iterable, String str) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            arrayList.add(m357a(str, i, obj));
            i++;
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<AbstractC11637l> m358a(Iterable<Object> iterable, String str, AbstractC11660c abstractC11660c) {
        try {
            List<C11661d> m359a = m359a(iterable, str);
            ArrayList arrayList = new ArrayList();
            for (C11661d c11661d : m359a) {
                arrayList.add(abstractC11660c.mo365a(c11661d));
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw m352k();
        }
    }

    /* renamed from: a */
    private C11661d m357a(String str, int i, Object obj) {
        return m356a(g(), str, i, obj instanceof Object[] ? (Object[]) obj : new Object[]{obj});
    }

    /* renamed from: a */
    private static C11661d m356a(C11651k c11651k, String str, int i, Object[] objArr) {
        return new C11661d("[" + MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i)), objArr) + "]", c11651k, Arrays.asList(objArr));
    }

    /* renamed from: b */
    private Iterable<Object> m355b() {
        Object m455a = m353j().m455a((Object) null, new Object[0]);
        if (m455a instanceof Iterable) {
            return (Iterable) m455a;
        }
        if (!(m455a instanceof Object[])) {
            throw m352k();
        }
        return Arrays.asList((Object[]) m455a);
    }

    /* renamed from: b */
    private AbstractC11660c m354b(Class<?> cls) {
        AbstractC11667c abstractC11667c = (AbstractC11667c) cls.getAnnotation(AbstractC11667c.class);
        return abstractC11667c == null ? f36812a : abstractC11667c.m349a().newInstance();
    }

    /* renamed from: j */
    private C11643d m353j() {
        for (C11643d c11643d : g().m417b(AbstractC11666b.class)) {
            if (c11643d.g() && c11643d.h()) {
                return c11643d;
            }
        }
        throw new Exception("No public static parameters method on class " + g().m410e());
    }

    /* renamed from: k */
    private Exception m352k() {
        return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", g().m410e(), m353j().mo450b()));
    }

    @Override // org.p328c.p350f.C11673g, org.p328c.p350f.AbstractC11668f
    /* renamed from: c */
    protected List<AbstractC11637l> mo312c() {
        return this.f36814c;
    }
}
