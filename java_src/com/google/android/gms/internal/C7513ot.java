package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.ot */
/* loaded from: classes2.dex */
public final class C7513ot implements AbstractC7489ok, Cloneable {

    /* renamed from: a */
    public static final C7513ot f24999a = new C7513ot();

    /* renamed from: b */
    private double f25000b = -1.0d;

    /* renamed from: c */
    private int f25001c = 136;

    /* renamed from: d */
    private boolean f25002d = true;

    /* renamed from: e */
    private List<AbstractC7449nm> f25003e = Collections.emptyList();

    /* renamed from: f */
    private List<AbstractC7449nm> f25004f = Collections.emptyList();

    /* renamed from: a */
    private boolean m14300a(AbstractC7492on abstractC7492on) {
        return abstractC7492on == null || abstractC7492on.m14332a() <= this.f25000b;
    }

    /* renamed from: a */
    private boolean m14299a(AbstractC7492on abstractC7492on, AbstractC7493oo abstractC7493oo) {
        return m14300a(abstractC7492on) && m14298a(abstractC7493oo);
    }

    /* renamed from: a */
    private boolean m14298a(AbstractC7493oo abstractC7493oo) {
        return abstractC7493oo == null || abstractC7493oo.m14331a() > this.f25000b;
    }

    /* renamed from: a */
    private boolean m14297a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: b */
    private boolean m14293b(Class<?> cls) {
        return cls.isMemberClass() && !m14292c(cls);
    }

    /* renamed from: c */
    private boolean m14292c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    @Override // com.google.android.gms.internal.AbstractC7489ok
    /* renamed from: a */
    public <T> AbstractC7488oj<T> mo14182a(final C7459nr c7459nr, final C7597po<T> c7597po) {
        Class<? super T> m14171a = c7597po.m14171a();
        final boolean m14296a = m14296a((Class<?>) m14171a, true);
        final boolean m14296a2 = m14296a((Class<?>) m14171a, false);
        if (m14296a || m14296a2) {
            return new AbstractC7488oj<T>() { // from class: com.google.android.gms.internal.ot.1

                /* renamed from: f */
                private AbstractC7488oj<T> f25010f;

                /* renamed from: a */
                private AbstractC7488oj<T> m14291a() {
                    AbstractC7488oj<T> abstractC7488oj = this.f25010f;
                    if (abstractC7488oj != 0) {
                        return abstractC7488oj;
                    }
                    AbstractC7488oj<T> m14404a = c7459nr.m14404a(C7513ot.this, c7597po);
                    this.f25010f = m14404a;
                    return m14404a;
                }

                @Override // com.google.android.gms.internal.AbstractC7488oj
                /* renamed from: a */
                public void mo14173a(C7602ps c7602ps, T t) {
                    if (m14296a) {
                        c7602ps.mo14095f();
                    } else {
                        m14291a().mo14173a(c7602ps, t);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
                @Override // com.google.android.gms.internal.AbstractC7488oj
                /* renamed from: b */
                public T mo14172b(C7598pp c7598pp) {
                    if (m14296a2) {
                        c7598pp.mo14138n();
                        return null;
                    }
                    return m14291a().mo14172b(c7598pp);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C7513ot clone() {
        try {
            return (C7513ot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public C7513ot m14301a(AbstractC7449nm abstractC7449nm, boolean z, boolean z2) {
        C7513ot clone = clone();
        if (z) {
            clone.f25003e = new ArrayList(this.f25003e);
            clone.f25003e.add(abstractC7449nm);
        }
        if (z2) {
            clone.f25004f = new ArrayList(this.f25004f);
            clone.f25004f.add(abstractC7449nm);
        }
        return clone;
    }

    /* renamed from: a */
    public C7513ot m14294a(int... iArr) {
        C7513ot clone = clone();
        clone.f25001c = 0;
        for (int i : iArr) {
            clone.f25001c = i | clone.f25001c;
        }
        return clone;
    }

    /* renamed from: a */
    public boolean m14296a(Class<?> cls, boolean z) {
        if (this.f25000b == -1.0d || m14299a((AbstractC7492on) cls.getAnnotation(AbstractC7492on.class), (AbstractC7493oo) cls.getAnnotation(AbstractC7493oo.class))) {
            if ((this.f25002d || !m14293b(cls)) && !m14297a(cls)) {
                for (AbstractC7449nm abstractC7449nm : z ? this.f25003e : this.f25004f) {
                    if (abstractC7449nm.mo14423a(cls)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m14295a(Field field, boolean z) {
        if ((this.f25001c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f25000b == -1.0d || m14299a((AbstractC7492on) field.getAnnotation(AbstractC7492on.class), (AbstractC7493oo) field.getAnnotation(AbstractC7493oo.class))) && !field.isSynthetic()) {
            if ((this.f25002d || !m14293b(field.getType())) && !m14297a(field.getType())) {
                List<AbstractC7449nm> list = z ? this.f25003e : this.f25004f;
                if (!list.isEmpty()) {
                    C7450nn c7450nn = new C7450nn(field);
                    for (AbstractC7449nm abstractC7449nm : list) {
                        if (abstractC7449nm.mo14424a(c7450nn)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
