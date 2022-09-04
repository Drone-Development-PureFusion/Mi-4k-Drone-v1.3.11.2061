package org.p328c.p347e;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: org.c.e.c */
/* loaded from: classes.dex */
public class C11622c implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final Collection<C11622c> f36760d;

    /* renamed from: e */
    private final String f36761e;

    /* renamed from: f */
    private final Serializable f36762f;

    /* renamed from: g */
    private final Annotation[] f36763g;

    /* renamed from: h */
    private volatile Class<?> f36764h;

    /* renamed from: c */
    private static final Pattern f36759c = Pattern.compile("([\\s\\S]*)\\((.*)\\)");

    /* renamed from: a */
    public static final C11622c f36757a = new C11622c(null, "No Tests", new Annotation[0]);

    /* renamed from: b */
    public static final C11622c f36758b = new C11622c(null, "Test mechanism", new Annotation[0]);

    private C11622c(Class<?> cls, String str, Serializable serializable, Annotation... annotationArr) {
        this.f36760d = new ConcurrentLinkedQueue();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        }
        if (serializable == null) {
            throw new IllegalArgumentException("The unique id must not be null.");
        }
        this.f36764h = cls;
        this.f36761e = str;
        this.f36762f = serializable;
        this.f36763g = annotationArr;
    }

    private C11622c(Class<?> cls, String str, Annotation... annotationArr) {
        this(cls, str, str, annotationArr);
    }

    /* renamed from: a */
    private String m551a(int i, String str) {
        Matcher matcher = f36759c.matcher(toString());
        return matcher.matches() ? matcher.group(i) : str;
    }

    /* renamed from: a */
    private static String m546a(String str, String str2) {
        return String.format("%s(%s)", str, str2);
    }

    /* renamed from: a */
    public static C11622c m550a(Class<?> cls) {
        return new C11622c(cls, cls.getName(), cls.getAnnotations());
    }

    /* renamed from: a */
    public static C11622c m549a(Class<?> cls, String str) {
        return new C11622c(cls, m546a(str, cls.getName()), new Annotation[0]);
    }

    /* renamed from: a */
    public static C11622c m548a(Class<?> cls, String str, Annotation... annotationArr) {
        return new C11622c(cls, m546a(str, cls.getName()), annotationArr);
    }

    /* renamed from: a */
    public static C11622c m547a(String str, Serializable serializable, Annotation... annotationArr) {
        return new C11622c(null, str, serializable, annotationArr);
    }

    /* renamed from: a */
    public static C11622c m545a(String str, String str2, Serializable serializable) {
        return new C11622c(null, m546a(str2, str), serializable, new Annotation[0]);
    }

    /* renamed from: a */
    public static C11622c m544a(String str, String str2, Annotation... annotationArr) {
        return new C11622c(null, m546a(str2, str), annotationArr);
    }

    /* renamed from: a */
    public static C11622c m543a(String str, Annotation... annotationArr) {
        return new C11622c(null, str, annotationArr);
    }

    /* renamed from: a */
    public String m552a() {
        return this.f36761e;
    }

    /* renamed from: a */
    public void m542a(C11622c c11622c) {
        this.f36760d.add(c11622c);
    }

    /* renamed from: b */
    public <T extends Annotation> T m540b(Class<T> cls) {
        Annotation[] annotationArr;
        for (Annotation annotation : this.f36763g) {
            if (annotation.annotationType().equals(cls)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    /* renamed from: b */
    public ArrayList<C11622c> m541b() {
        return new ArrayList<>(this.f36760d);
    }

    /* renamed from: c */
    public boolean m539c() {
        return !m538d();
    }

    /* renamed from: d */
    public boolean m538d() {
        return this.f36760d.isEmpty();
    }

    /* renamed from: e */
    public int m537e() {
        if (m538d()) {
            return 1;
        }
        int i = 0;
        Iterator<C11622c> it2 = this.f36760d.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return i2;
            }
            i = it2.next().m537e() + i2;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11622c)) {
            return false;
        }
        return this.f36762f.equals(((C11622c) obj).f36762f);
    }

    /* renamed from: f */
    public boolean m536f() {
        return equals(f36757a);
    }

    /* renamed from: g */
    public C11622c m535g() {
        return new C11622c(this.f36764h, this.f36761e, this.f36763g);
    }

    /* renamed from: h */
    public Collection<Annotation> m534h() {
        return Arrays.asList(this.f36763g);
    }

    public int hashCode() {
        return this.f36762f.hashCode();
    }

    /* renamed from: i */
    public Class<?> m533i() {
        if (this.f36764h != null) {
            return this.f36764h;
        }
        String m532j = m532j();
        if (m532j == null) {
            return null;
        }
        try {
            this.f36764h = Class.forName(m532j, false, getClass().getClassLoader());
            return this.f36764h;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    /* renamed from: j */
    public String m532j() {
        return this.f36764h != null ? this.f36764h.getName() : m551a(2, toString());
    }

    /* renamed from: k */
    public String m531k() {
        return m551a(1, (String) null);
    }

    public String toString() {
        return m552a();
    }
}
