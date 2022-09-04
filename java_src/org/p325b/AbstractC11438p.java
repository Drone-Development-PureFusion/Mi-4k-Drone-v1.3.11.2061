package org.p325b;

import org.p325b.p327b.C11417b;
/* renamed from: org.b.p */
/* loaded from: classes2.dex */
public abstract class AbstractC11438p<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private static final C11417b f36549a = new C11417b("matchesSafely", 1, 0);

    /* renamed from: b */
    private final Class<?> f36550b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11438p() {
        this(f36549a);
    }

    protected AbstractC11438p(Class<?> cls) {
        this.f36550b = cls;
    }

    protected AbstractC11438p(C11417b c11417b) {
        this.f36550b = c11417b.m1140a(getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11415b, org.p325b.AbstractC11433k
    /* renamed from: a */
    public final void mo1070a(Object obj, AbstractC11428g abstractC11428g) {
        if (obj == 0) {
            super.mo1070a(obj, abstractC11428g);
        } else if (!this.f36550b.isInstance(obj)) {
            abstractC11428g.mo1086a("was a ").mo1086a(obj.getClass().getName()).mo1086a(" (").mo1087a(obj).mo1086a(")");
        } else {
            mo902b(obj, abstractC11428g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public final boolean mo900a(Object obj) {
        return obj != 0 && this.f36550b.isInstance(obj) && mo903b(obj);
    }

    /* renamed from: b */
    protected void mo902b(T t, AbstractC11428g abstractC11428g) {
        super.mo1070a(t, abstractC11428g);
    }

    /* renamed from: b */
    protected abstract boolean mo903b(T t);
}
